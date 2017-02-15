Meta:
@lote2
@tag equipo: 5
@Sprint 14

Narrative:
Como usuario de policy center en el rol de agente,csr, asegurador o gerente
Quiero poder imprimir o reimprimir los documentos que se generan luego de ejecutar una transaccion de poliza
Para una poliza de autos

Scenario: Mostrar opcion de reimpresion en una submission
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza de mrc con documento:
| organizacion | producto | canal             | tipoPoliza | tipo_documento       | documento  | fecha_nacimiento | primer_nombre | primer_apellido | tipo_direccion          | direccion        | departamento | ciudad   | agente |
| Sura         | Autos    | Canal Tradicional | Individual | CEDULA DE CIUDADANIA | 1030765460 | 10/10/1973       | LUCIANA       | LONDOÑO         | DIRECCION DE RESIDENCIA | CALLE 65F #60-69 | Antioquia    | Medellin | INT-3  |
And ingrese los datos del asegurado <tipo_documento> <documento>
And ingrese los datos del vehiculo:
| placa | modelo | codigo_fasecolda | ciudad_circulacion | vehiculo_servicio | chasis  | motor | valor_asegurado | descuento | recargo | zona | plan               |
| ASDF7 | 2011   | 01601225         | MEDELLIN           | Particular        | kljh456 | yui10 | 17900000        | null      | null    | 2    | Plan Modular       |
When ingrese las coberturas:
|limite|deducible|abogado|PLlaves|
|640.  |0        |Si     |Si     |
And expido la poliza y voy al archivo de poliza
And vaya a la opcion transacciones de poliza
And cuando de click al boton reimprimir
Then me deben aparecer las opciones por las cuales puedo imprimir
|opciones                        |
|Caratula                        |
|Carta de relación con el cliente|
|Endoso                          |

Examples:
|tipo_documento      |documento |
|CEDULA DE CIUDADANIA|1060447895|

Scenario: Mostrar opcion reimpresion en cambio de poliza
Given tengo una poliza de PA con los siguientes datos:
|tipo_documento      |documento |cuenta    |producto|tipoPoliza|placa |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis |motor|valor_asegurado|descuento|recargo|zona|plan        |limite|deducible|abogado|PLlaves|
|CEDULA DE CIUDADANIA|1234567890|C000888888|Autos   |Individual|ABB110|2011  |01601225        |MEDELLIN          |Particular       |kljh456|yui10|17900000       |null     |null   |2   |Plan Modular|640.  |0        |Si     |Si     |
When ingrese a modificar dicha cotizacion
And se ingrese a la opcion vehiculos
And cambie el plan del vehiculo <plan>
And intente cotizar el cambio de poliza
And expido la poliza y voy al archivo de poliza
And vaya a la opcion transacciones de poliza
And cuando de click al boton reimprimir
Then me deben aparecer las opciones por las cuales puedo imprimir
|opciones                        |
|Caratula                        |
|Carta de relación con el cliente|
|Endoso                          |
Examples:
|plan              |
|Plan Autos Clásico|

Scenario: Mostrar opcion reimpresion en renovacion de poliza
Given estoy cotizando una poliza basado en otro envio <envio>
And vaya a agregar el vehiculo con los datos:
|placa |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis |motor|valor_asegurado|descuento|recargo|zona|plan        |
|random|2011  |01601225        |MEDELLIN          |Particular       |kljh456|yui10|17900000       |null     |null   |2   |Plan Modular|
And seleccione algunas coberturas:
|limite|deducible|abogado |PTH|PPH|PPHF|GTH|AC|Taller|Grua|TM|CE|CS  |PTD|PPD|PPDF|GT|PP|PT|GTR|GP|PLlaves|
|640.  |0        |Si      |0  |750|1.50|40.|35|Conces|Plus|Si|6 |Plus|0  |750|1.50|40|20|20|Si |Si|Si     |
When expido la poliza y voy al archivo de poliza
And quiera realizar esta renovacion
And vaya a informacion de poliza en la renovacion
And adicione un segundo tomador en la renovacion el cual es riesgo consultable
|tipoDocumento        |numeroDocumento|
|CEDULA DE CIUDADANIA |1234567890     |
And cotice la renovacion
And expida la renovacion
And vaya a la opcion transacciones de poliza
And cuando de click al boton reimprimir
Then me deben aparecer las opciones por las cuales puedo imprimir
|opciones                        |
|Caratula                        |
|Carta de relación con el cliente|
|Endoso                          |
Examples:
|envio   |
|22228589|
Scenario: No mostrar opcion reimpresion en poliza cotizada
Given estoy cotizando una poliza:
|cuenta     |producto|tipoPoliza |
|C1060447895|Autos   |Individual |
When ingrese los datos del asegurado <tipo_documento> <documento>
And ingrese los datos del vehiculo:
|placa |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis|motor|valor_asegurado|descuento|recargo|zona|plan        |
|AS345|2016  |00601182        |MEDELLIN          |Particular       |null  |null |165900000      |null     |null   |2   |Plan Modular|
And ingrese las coberturas:
|limite|deducible|abogado|PLlaves|
|640.  |0        |Si     |Si     |
Then no se debe mostrar el boton reimpresion
Examples:
|tipo_documento      |documento |
|CEDULA DE CIUDADANIA|1060447895|


Scenario: No mostrar opcion reimpresion en cambio de poliza cotizada
Given tengo una poliza de PA con los siguientes datos:
|tipo_documento      |documento |cuenta    |producto|tipoPoliza|placa |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis |motor|valor_asegurado|descuento|recargo|zona|plan        |limite|deducible|abogado|PLlaves|
|CEDULA DE CIUDADANIA|1234567890|C000888888|Autos   |Individual|ABC199|2011  |01601225        |MEDELLIN          |Particular       |kljh456|yui10|17900000       |null     |null   |2   |Plan Modular|640.  |0        |Si     |Si     |
When ingrese a modificar dicha cotizacion
And se ingrese a la opcion vehiculos
And cambie el plan del vehiculo <plan>
And intente cotizar el cambio de poliza
Then no se debe mostrar el boton reimpresion
Examples:
|plan              |
|Plan Autos Clásico|

Scenario: No mostrar opcion reimpresion en renovacion de poliza cotizada
Given estoy cotizando una poliza basado en otro envio <envio>
And vaya a agregar el vehiculo con los datos:
|placa |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis |motor|valor_asegurado|descuento|recargo|zona|plan        |
|AWE456|2011  |01601225        |MEDELLIN          |Particular       |kljh456|yui10|17900000       |null     |null   |2   |Plan Modular|
And seleccione algunas coberturas:
|limite|deducible|abogado |PTH|PPH|PPHF|GTH|AC|Taller|Grua|TM|CE|CS  |PTD|PPD|PPDF|GT|PP|PT|GTR|GP|PLlaves|
|640.  |0        |Si      |0  |750|1.50|40.|35|Conces|Plus|Si|6 |Plus|0  |750|1.50|40|20|20|Si |Si|Si     |
When expido la poliza y voy al archivo de poliza
And quiera realizar esta renovacion
And vaya a informacion de poliza en la renovacion
And adicione un segundo tomador en la renovacion el cual es riesgo consultable
|tipoDocumento        |numeroDocumento|
|CEDULA DE CIUDADANIA |1234567890     |
And cotice la renovacion
Then no se debe mostrar el boton reimpresion
Examples:
|envio   |
|22228589|














