Meta:
@lote2
@issue #CDSEG-1021
@tag equipo: 5
@Sprint 14

Narrative:
Como usuario de policy center en el rol de agente,csr, asegurador o gerente
Quiero poder ver actividades asociados con una transaccion
Para poder completar actividades relacionadas con la misma

Scenario: Plan de trabajo en poliza nueva
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza de mrc con documento:
| organizacion | producto | canal             | tipoPoliza | tipo_documento       | documento  | fecha_nacimiento | primer_nombre | primer_apellido | tipo_direccion          | direccion        | departamento | ciudad   | agente |
| Sura         | Autos    | Canal Tradicional | Individual | CEDULA DE CIUDADANIA | 1030765449 | 10/10/1973       | LUCIANA       | LONDOÑO         | DIRECCION DE RESIDENCIA | CALLE 65F #60-69 | Antioquia    | Medellin | INT-3  |
And ingrese los datos del asegurado <tipo_documento> <documento>
And ingrese los datos del vehiculo:
| placa | modelo | codigo_fasecolda | ciudad_circulacion  | vehiculo_servicio | chasis  | motor | valor_asegurado | descuento | recargo | zona | plan               |
| ASDF2 | 2011   | 01601225         | MEDELLIN (ANTIOQUIA)| Particular        | kljh456 | yui10 | 17900000        | null      | null    | 2    | Plan Modular       |
When ingrese las coberturas:
|limite|deducible|abogado|PLlaves|
|640.  |0        |Si     |Si     |
And ingese al plan del trabajo
And me debe mostrar los siguientes campos: numeroPoliza, tomador, tipoDocumento, numeroDocumento
And cuando vea las actividades asociadas a ese tomador
Then debe mostrar el menu de actividad


Examples:
|tipo_documento      |documento |
|CEDULA DE CIUDADANIA|1060447895|

Scenario: Plan de trabajo en modificacion de poliza
Given tengo una poliza de PA con los siguientes datos:
|tipo_documento      |documento |cuenta    |producto|tipoPoliza|placa |modelo|codigo_fasecolda|ciudad_circulacion  |vehiculo_servicio|chasis |motor|valor_asegurado|descuento|recargo|zona|plan        |limite|deducible|abogado|PLlaves|
|CEDULA DE CIUDADANIA|1234567890|C000888888|Autos   |Individual|ABB196|2011  |01601225        |MEDELLIN (ANTIOQUIA)|Particular       |kljh456|yui10|17900000       |null     |null   |2   |Plan Modular|640.  |0        |Si     |Si     |
When ingrese a modificar dicha cotizacion
And se ingrese a la opcion vehiculos
And ingese al plan del trabajo
And me debe mostrar los siguientes campos: numeroPoliza, tomador, tipoDocumento, numeroDocumento
And cuando vea las actividades asociadas a ese tomador
Then debe mostrar el menu de actividad

Examples:
|tipo_documento      |documento |
|CEDULA DE CIUDADANIA|1060447895|

Scenario: Plan de trabajo en renovacion de poliza
Given estoy cotizando una poliza basado en otro envio <envio>
And vaya a agregar el vehiculo con los datos:
|placa |modelo|codigo_fasecolda|ciudad_circulacion  |vehiculo_servicio|chasis |motor|valor_asegurado|descuento|recargo|zona|plan        |
|random|2011  |01601225        |MEDELLIN (ANTIOQUIA)|Particular       |kljh456|yui10|17900000       |null     |null   |2   |Plan Modular|
And seleccione algunas coberturas:
|limite|deducible|abogado |PTH|PPH|PPHF|GTH|AC|Taller|Grua|TM|CE|CS  |PTD|PPD|PPDF|GT|PP|PT|GTR|GP|PLlaves|
|640.  |0        |Si      |0  |750|1.50|40.|35|Conces|Plus|Si|6 |Plus|0  |750|1.50|40|20|20|Si |Si|Si     |
When expido la poliza y voy al archivo de poliza
And quiera realizar esta renovacion
And vaya a informacion de poliza en la renovacion
And adicione un segundo tomador en la renovacion el cual es riesgo consultable
|tipoDocumento        |numeroDocumento|
|CEDULA DE CIUDADANIA |1128391691     |
And ingese al plan del trabajo
And me debe mostrar los siguientes campos: numeroPoliza, tomador, tipoDocumento, numeroDocumento
And cuando vea las actividades asociadas a ese tomador
Then debe mostrar el menu de actividad

Examples:
|envio   |
|22228589|

Scenario: Plan de trabajo en cancelacion de poliza
Meta:@manual
Given estoy cancelando una poliza cotizada
When ingrese el motivo de cancelacion
And incie su cancelacion
And ingrese al plan de trabajo
Then se deben mostrar los campos, tomador, numeroPoliza, tipoDocumento, numeroDocumento






