Meta: @lote4
@issue #SUGWUSC-5944
@tag team: 5

Narrative:
Como usuario de negocio
Quiero poder visualizar los requisitos por DNI diferente
Para la solucion de autos

Scenario: Expedicion de poliza con beneficiario-asegurado-tomador que requieren requisitos
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza de mrc con documento:
| organizacion | producto | canal             | tipoPoliza | tipo_documento       | documento  | fecha_nacimiento | primer_nombre | primer_apellido | tipo_direccion          | direccion        | departamento | ciudad   | agente |
| Sura         | Autos    | Canal Tradicional | Individual | CEDULA DE CIUDADANIA | 1036543787 | 10/10/1973       | LUCIANA       | LONDOÑO         | DIRECCION DE RESIDENCIA | CALLE 65F #60-69 | Antioquia    | Medellin | INT-3  |
When ingrese los datos del asegurado <tipo_documento> <documento>
And ingrese los datos del vehiculo en expedicion:
|placa  |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis |motor|valor_asegurado|descuento|recargo|zona|plan        |
|ABB182 |2011  |01601225        |MEDELLIN          |Particular       |kljh456|yui10|17900000       |null     |null   |2   |Plan Modular|
And seleccione algunas coberturas:
| limite | deducible | abogado  | PTH | PPH | PPHF | GTH | AC | AS                 | PTD | PPD | PPDF | GT | PP | PT | GTR      | GP       | PLlaves  |
| 1.440  | 0         | Opción 1 | 10  | 910 | 1.50 | 40. | 35 | Asistencia Clásica | 10  | 0   | 1.50 | 40 | 16 | 20 | Opción 1 | Opción 1 | Opción 1 |
And agrege un beneficiario <tipoDocumento> <numeroDocumento><tipoBeneficiario>
When intente cotizar y expedir la poliza
Then debo ver un mensaje indicando requisitos pendientes
|mensaje                                                      |
|Existen requisitos pendientes, diríjase a Análisis de riesgos|

Examples:
|tipoDocumento       |tipo_documento       |documento  |numeroDocumento|tipoBeneficiario|
|CEDULA DE CIUDADANIA|CEDULA DE CIUDADANIA |71318883   |71123456       |Oneroso Leasing |



Scenario: frenar expedicion de poliza cuando existan requsiitos pendientes obligatorios
Given estoy cotizando una poliza:
|cuenta    |organizacion|producto|canal            |tipoPoliza  |
|C000222333|Sura        |Autos   |Canal Tradicional|Individual  |
When adicione un segundo tomador <tipoDocumento>, <primerNombre>, <primerApellido>
And ingrese los datos del asegurado <tipo_documento> <documento>
And ingrese los datos del vehiculo en expedicion:
|placa  |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis |motor|valor_asegurado|descuento|recargo|zona|plan        |
|ABB182 |2011  |01601225        |MEDELLIN          |Particular       |kljh456|yui10|17900000       |null     |null   |2   |Plan Modular|
And seleccione algunas coberturas:
| limite | deducible | abogado  | PTH | PPH | PPHF | GTH | AC | AS                 | PTD | PPD | PPDF | GT | PP | PT | GTR      | GP       | PLlaves  |
| 1.440  | 0         | Opción 1 | 10  | 910 | 1.50 | 40. | 35 | Asistencia Clásica | 10  | 0   | 1.50 | 40 | 16 | 20 | Opción 1 | Opción 1 | Opción 1 |
And agrege un beneficiario <tipoDocumento> <numeroDocumento><tipoBeneficiario>
When intente cotizar y expedir la poliza
Then debo ver un UW issue por cada figura que sea riesgo consultable bloqueante
|mensaje                                                      |
|Existen requisitos pendientes, diríjase a Análisis de riesgos|

Examples:
|tipoDocumento       |primerNombre|primerApellido |tipo_documento       |documento  |numeroDocumento|tipoBeneficiario|mensaje                                          |
|CEDULA DE CIUDADANIA|ANTONIO     |RESTREPO       |CEDULA DE CIUDADANIA |71318883   |71318883       |Oneroso Leasing |Existen requisitos pendientes por favor verifique|


Scenario: frenar modificacion de poliza cuando existan requisitos pendientes obligatorios
Given tengo una poliza de PA con los siguientes datos:
|tipo_documento      |documento |cuenta    |organizacion|producto|canal            |tipoPoliza|placa |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis |motor|valor_asegurado|descuento|recargo|zona|plan        |limite|deducible|abogado |PLlaves |
|CEDULA DE CIUDADANIA|1234567890|C000888888|Sura        |Autos   |Canal Tradicional|Individual|ABB168|2011  |01601225        |MEDELLIN          |Particular       |kljh456|yui10|17900000       |null     |null   |2   |Plan Modular|1.440 |0        |Opción 1|Opción 1|
When adicione un segundo tomador <tipoDocumento> <numeroDocumento>
And ingrese los datos del asegurado <tipo_documento> <documento>
And ingrese un beneficiario oneroso en modificacion <beneficiario>
And intente cotizar y expedir la poliza
Then debo ver un UW issue por cada figura que sea riesgo consultable bloqueante
| mensaje                                                     |
|Existen requisitos pendientes, diríjase a Análisis de riesgos|

Examples:
|tipoDocumento       |tipo_documento      |documento  |mensaje|numeroDocumento|beneficiario   |
|CEDULA DE CIUDADANIA|CEDULA DE CIUDADANIA|1845145320 |aasdd  |1845145320     |Oneroso Leasing|


Scenario: permitir expedicion de poliza cuando existan requsitos pendientes opcionales
Given estoy cotizando una poliza:
|cuenta    |organizacion|producto|canal            |tipoPoliza  |
|C000222333|Sura        |Autos   |Canal Tradicional|Individual  |
When adicione un segundo tomador <tipoDocumento>, <primerNombre>, <primerApellido>
And ingrese los datos del asegurado <tipo_documento> <documento>
And ingrese los datos del vehiculo en expedicion:
|placa  |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis |motor|valor_asegurado|descuento|recargo|zona|plan        |
|ABB182 |2011  |01601225        |MEDELLIN          |Particular       |kljh456|yui10|17900000       |null     |null   |2   |Plan Modular|
And seleccione algunas coberturas:
| limite | deducible | abogado  | PTH | PPH | PPHF | GTH | AC | AS                 | PTD | PPD | PPDF | GT | PP | PT | GTR      | GP       | PLlaves  |
| 1.440  | 0         | Opción 1 | 10  | 910 | 1.50 | 40. | 35 | Asistencia Clásica | 10  | 0   | 1.50 | 40 | 16 | 20 | Opción 1 | Opción 1 | Opción 1 |
And agrege un beneficiario <tipoDocumento> <numeroDocumento><tipoBeneficiario>
When intente cotizar y expedir la poliza
Then El proceso se debe frenar y debe mostrar el mensaje de error <mensaje>

Examples:
|tipoDocumento       |primerNombre|primerApellido |tipo_documento       |documento  |numeroDocumento|tipoBeneficiario|mensaje                                          |
|CEDULA DE CIUDADANIA|ANTONIO     |RESTREPO       |CEDULA DE CIUDADANIA |71318883   |71318883       |Oneroso Leasing |Existen requisitos pendientes por favor verifique|


Scenario: permitir modificacion de poliza cuando existan requisitos pendientes opcionales
Given tengo una poliza de PA con los siguientes datos:
|tipo_documento      |documento |cuenta    |organizacion|producto|canal            |tipoPoliza|placa |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis |motor|valor_asegurado|descuento|recargo|zona|plan        |limite|deducible|abogado |PLlaves |
|CEDULA DE CIUDADANIA|1234567890|C000888888|Sura        |Autos   |Canal Tradicional|Individual|ABB168|2011  |01601225        |MEDELLIN          |Particular       |kljh456|yui10|17900000       |null     |null   |2   |Plan Modular|1.440 |0        |Opción 1|Opción 1|
When adicione un segundo tomador <tipoDocumento> <numeroDocumento>
And ingrese los datos del asegurado <tipo_documento> <documento>
And ingrese un beneficiario oneroso en modificacion <beneficiario>
And intente cotizar y expedir la poliza
Then debo ver un UW issue por cada figura que sea riesgo consultable bloqueante
| mensaje                                                     |
|Existen requisitos pendientes, diríjase a Análisis de riesgos|

Examples:
|tipoDocumento       |tipo_documento      |documento  |mensaje|numeroDocumento|beneficiario   |
|CEDULA DE CIUDADANIA|CEDULA DE CIUDADANIA|1845145320 |aasdd  |1845145320     |Oneroso Leasing|

Scenario: Cancelacion de poliza con dni que contienen requisitos pendientes
Meta:
@manual
Given voy a cancelar una poliza
When intente cancelar la poliza con requisitos pendientes
Then no se debe permitir su cancelacion