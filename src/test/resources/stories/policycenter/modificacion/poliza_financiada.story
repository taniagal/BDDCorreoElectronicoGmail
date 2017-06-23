Meta:
@lote3
@tag equipo: 5, sprint: 15

Narrative:
Como usuario de Policy Center con rol de agente, CSR, autorizador o gerente,
Quiero poder reviar el borrador de un cambio de poliza y comparar el cambio contra los valores previos
Para las polizas de auto personal en policy center


Scenario: Modificacion de poliza no financiada a financiada y validacion de opciones para numero de cuotas a financiar
GivenStories: stories/policycenter/login_policy.story
Given tengo una poliza de PA con los siguientes datos:
| tipo_documento       | documento  | cuenta     | producto | tipoPoliza | placa  | modelo | codigo_fasecolda | ciudad_circulacion   | vehiculo_servicio | chasis | motor | valor_asegurado | descuento | recargo | zona | plan         | limite | deducible | abogado | PLlaves | medioVenta |
| CEDULA DE CIUDADANIA | 1234567890 | C000777776 | Autos    | Individual | ABB113 | 2011   |                  | MEDELLIN (ANTIOQUIA) | Particular        | null   | null  | 17900000        | null      | null    | 2    | Plan Modular | 640.   | 0         | Si      | Si      | Televentas |
When ingrese a modificar dicha cotizacion
And seleccione la opcion financiar poliza
And deben aparecer el numero de cuotas por las cuales puedo financiar la poliza
| opcionesCuotas |
| 11             |
| 12             |
And ingrese el numero de cuotas <numeroCuotas> a financiar
And cotice una poliza
Then se debe poder visualizar el valor de la cuota y el numero de cuotas a financiar
| informacionFinanciacion |
| 11                      |
| $101.620 (COP)          |

Examples:
| numeroCuotas |
| 11           |


Scenario: Modificacion de poliza financiada a no financiada
Given tengo una poliza de autos financiada con los siguientes datos:
| tipo_documento       | documento  | cuenta     | producto | tipoPoliza | placa  | modelo | codigo_fasecolda | ciudad_circulacion   | vehiculo_servicio | chasis | motor | valor_asegurado | descuento | recargo | zona | plan         | limite | deducible | abogado | PLlaves | medioVenta | numeroCuotas |
| CEDULA DE CIUDADANIA | 1234567890 | C000777776 | Autos    | Individual | ABL121 | 2011   |                  | MEDELLIN (ANTIOQUIA) | Particular        | null   | null  | 17900000        | null      | null    | 2    | Plan Modular | 640.   | 0         | Si      | Si      | Televentas | 12           |
When ingrese a modificar dicha cotizacion
And seleccione la opcion no financiar poliza
Then se debe ocultar el campo numero de cuotas

Examples:
| numeroCuotas | valorCuota |
| 11           | 100000     |


Scenario: Bloqueo de expedicion si al tomador principal(natural) le falta telefono celular y correo electronico
Given estoy cotizando una poliza de autos:
| producto | tipoPoliza | tipo_documento       | fecha_nacimiento   | primer_nombre | primer_apellido | tipo_direccion          | direccion        | departamento | ciudad   | agente |polizafinanciada|
| Autos    | Individual | CEDULA DE CIUDADANIA |   02/12/1988       | JUAN          | ELIAS           | DIRECCION DE RESIDENCIA | CALLE 65B #60-25 | Antioquia    | Medellin | INT-3  |Si              |
When ingrese el numero de cuotas <numeroCuotas> a financiar
And agregue un asegurado que es titular de la cuenta para la poliza financiera
And ingrese los datos del vehiculo:
|placa |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis|motor|valor_asegurado|descuento|recargo|zona|plan        |medioVenta|
|random|2016  |00601182        |MEDELLIN          |Particular       |null  |null |165900000      |null     |null   |2   |Plan Modular|Televentas|
And ingrese las coberturas:
|limite|deducible|abogado|PLlaves|
|640.  |0        |Si     |Si     |
And cotice una poliza
And visualice la pantalla de pagos
And seleccione la opcion pago total y pago en caja
And voy a expedir una poliza
And acepto la expedicion de poliza
Then se debe mostrar mensaje que bloquee la expedicion <mensaje>

Examples:
| tipo_documento       | documento |numeroCuotas|mensaje                                                                      |
| CEDULA DE CIUDADANIA | 16985439  |11          |Señor usuario el contacto debe tener teléfono celular y un correo electrónico|

Scenario: Bloqueo de expedicion si al tomador principal(natural) le falta telefono celular
Given estoy cotizando una poliza de autos:
| producto | tipoPoliza | tipo_documento       | fecha_nacimiento   | primer_nombre | primer_apellido | tipo_direccion          | direccion        | departamento | ciudad   |correo_electronico_primario| agente |polizafinanciada|
| Autos    | Individual | CEDULA DE CIUDADANIA |   02/12/1988       | JUAN          | ELIAS           | DIRECCION DE RESIDENCIA | CALLE 65B #60-25 | Antioquia    | Medellin |prueba@sura.com            | INT-3  |Si              |
When ingrese el numero de cuotas <numeroCuotas> a financiar
And agregue un asegurado que es titular de la cuenta para la poliza financiera
And ingrese los datos del vehiculo:
|placa |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis|motor|valor_asegurado|descuento|recargo|zona|plan        |medioVenta|
|random |2016  |00601182        |MEDELLIN          |Particular       |null  |null |165900000      |null     |null   |2   |Plan Modular|Televentas|
And ingrese las coberturas:
|limite|deducible|abogado|PLlaves|
|640.  |0        |Si     |Si     |
And cotice una poliza
And visualice la pantalla de pagos
And seleccione la opcion pago total y pago en caja
And voy a expedir una poliza
And acepto la expedicion de poliza
Then se debe mostrar mensaje que bloquee la expedicion <mensaje>

Examples:
| tipo_documento       | documento |numeroCuotas|mensaje                                                                      |
| CEDULA DE CIUDADANIA | 16985439  |11          |Señor usuario el contacto debe tener un teléfono celular                     |


Scenario: Bloqueo de expedicion si al tomador principal(juridico) le falta el correo electronico
Given estoy cotizando una poliza de autos:
| numeroDocumento | producto | tipoPoliza | tipo_documento       | fecha_nacimiento   | primer_nombre | primer_apellido | tipo_direccion          | direccion        | departamento | ciudad   | agente |polizafinanciada|razon_social              |
| 9001548230      | Autos    | Individual |  NIT                 |   02/12/1988       | SIMON         | SIMON           | DIRECCION DE RESIDENCIA | CALLE 65B #60-25 | Antioquia    | Medellin | INT-3  |Si              |FINANCIADA S.A            |
When ingrese el numero de cuotas <numeroCuotas> a financiar
And agregue un asegurado que es titular de la cuenta para la poliza financiera
And ingrese los datos del vehiculo:
|placa |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis|motor|valor_asegurado|descuento|recargo|zona|plan        |medioVenta|
|random|2016  |00601182        |MEDELLIN          |Particular       |null  |null |165900000      |null     |null   |2   |Plan Modular|Televentas|
And ingrese las coberturas:
|limite|deducible|abogado|PLlaves|
|640.  |0        |Si     |Si     |
And cotice una poliza
And visualice la pantalla de pagos
And seleccione la opcion pago total y pago en caja
And voy a expedir una poliza
And acepto la expedicion de poliza
Then se debe mostrar mensaje que bloquee la expedicion <mensaje>

Examples:
| tipo_documento       | documento |numeroCuotas|mensaje                                                                      |
| CEDULA DE CIUDADANIA | 16985439  |11          |Señor usuario el contacto debe tener al menos un correo electrónico          |