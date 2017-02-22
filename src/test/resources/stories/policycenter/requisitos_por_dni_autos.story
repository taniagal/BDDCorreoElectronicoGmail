Meta:
@lote3
@tag equipo: 5

Narrative:
Como usuario de negocio
Quiero poder visualizar los requisitos por DNI diferente
Para la solucion de autos

Scenario: Expedicion de poliza con beneficiario-asegurado-tomador que requieren requisitos
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza de autos:
| organizacion | producto                | tipo_documento       | numeroDocumento | fecha_nacimiento | primer_nombre | primer_apellido | tipo_direccion          | direccion        | departamento | ciudad   | agente |tipoPoliza|
| Sura         | Autos                   | CEDULA DE CIUDADANIA | 1036543787      | 10/10/1974       | ANDREA        | GARABITO        | DIRECCION DE RESIDENCIA | CALLE 28F #60-68 | Antioquia    | Medellin | INT-3  |Individual|
When ingrese los datos del asegurado <tipo_documento> <documento>
And ingrese los datos del vehiculo:
|placa  |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis |motor|valor_asegurado|descuento|recargo|zona|plan        |
|XOC792 |2011  |01601225        |MEDELLIN          |Particular       |kljh456|yui10|17900000       |null     |null   |2   |Plan Modular|
And ingrese las coberturas:
|limite|deducible|abogado |PLlaves |
|640.  |0        |Si      |Si      |
And agrege un beneficiario <tipoDocumento> <numeroDocumento><tipoBeneficiario>
And cotice una poliza
And voy a expedir una poliza
And acepto la expedicion de poliza
And vaya a la opcion requisitos
Then debo ver un mensaje indicando requisitos pendientes
|mensaje          |
|ANDREA GARABITO  |
|CAROLINA OCHOA   |

Examples:
|tipoDocumento       |tipo_documento       |documento  |numeroDocumento|tipoBeneficiario|
|CEDULA DE CIUDADANIA|CEDULA DE CIUDADANIA |71318883   |71123456       |Oneroso Leasing |

Scenario: transaccion de poliza con requisitos
Meta:
@manual
Given que estoy en una transaccion de poliza
When los dni tengan requisitos pendientes opcionales
And debe indicar mediante un mensaje que existenten requisitos pendientes opcionales
And cuando edite la transaccion de poliza
And cambie algun dni con requisitos pendientes por uno que no los tenga
Then me deben aparecer solo los requisitos de los dni que lo requieran