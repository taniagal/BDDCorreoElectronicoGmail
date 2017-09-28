Meta:
@lote4
@tag equipo: 2, sprint: 14
@local

Narrative:
Como usuario PolicyCenter
quiero poder aplicar condiciones particulares a las polizas colectivas
para expedirlas con diferentes reglas

Scenario: 1 Generacion de UW al ingresar bonificacion comercial y tecnica mayor a la pactada
GivenStories: stories/policycenter/login_policy.story
Given que estoy en la informacion de la poliza con numero de subscripcion <numSubscripcion>
When copie la poliza
And ingrese los datos del asegurado <tipo_documento> <documento>
And ingrese los datos de vehiculo:
| placa  | modelo | codigo_fasecolda | ciudad_circulacion | vehiculo_servicio | chasis | motor | valor_asegurado | descuento | recargo | zona | plan               | cero_kilometros | medioVenta |
| random | 2017   | 52525252         | MEDELLIN           | Particular        | null   | null  | 16000000        | null      | null    | 2    | Plan Autos Clásico | Si              | Televentas |
And ingrese la bonificacion tecnica <bonoT> y la comercial <bonoC>
And ingrese las coberturas necesarias:
| limite | deducible | AS                 | PTD | PPD  | GTD |
| 640.   | 0         | Asistencia Clásica | 0   | 835. | 40. |
And intente cotizar
And ingrese a analisis de riesgo
Then debo ver un UW issue por cada figura que sea riesgo consultable bloqueante
| mensaje |
|         |


Examples:
| tipo_documento       | documento  | producto | agente_oficina | numSubscripcion | bonoT | bonoC |
| CEDULA DE CIUDADANIA | 1060447895 | Autos    | DIRECTO        | 39355347        | 6     | 5     |


Scenario: 2 Generacion de UW al ingresar bonificacion comercial mayor a la pactada

Given que estoy en la informacion de la poliza con numero de subscripcion <numSubscripcion>
When copie la poliza
And ingrese los datos del asegurado <tipo_documento> <documento>
And ingrese los datos de vehiculo:
| placa  | modelo | codigo_fasecolda | ciudad_circulacion | vehiculo_servicio | chasis | motor | valor_asegurado | descuento | recargo | zona | plan               | cero_kilometros | medioVenta |
| random | 2017   | 52525252         | MEDELLIN           | Particular        | null   | null  | 16000000        | null      | null    | 2    | Plan Autos Clásico | Si              | Televentas |
And ingrese la bonificacion tecnica <bonoT> y la comercial <bonoC>
And ingrese las coberturas necesarias:
| limite | deducible | AS                 | PTD | PPD  | GTD |
| 640.   | 0         | Asistencia Clásica | 0   | 835. | 40. |
And intente cotizar
And ingrese a analisis de riesgo
Then debo ver un UW issue por cada figura que sea riesgo consultable bloqueante
| mensaje |
|         |


Examples:
| tipo_documento       | documento  | producto | agente_oficina | numSubscripcion | bonoT | bonoC |
| CEDULA DE CIUDADANIA | 1060447895 | Autos    | DIRECTO        | 39355347        | 0     | 15    |


Scenario: 3 Generacion de UW al ingresar bonificacion tecnica mayor a la pactada

Given que estoy en la informacion de la poliza con numero de subscripcion <numSubscripcion>
When copie la poliza
And ingrese los datos del asegurado <tipo_documento> <documento>
And ingrese los datos de vehiculo:
| placa  | modelo | codigo_fasecolda | ciudad_circulacion | vehiculo_servicio | chasis | motor | valor_asegurado | descuento | recargo | zona | plan               | cero_kilometros | medioVenta |
| random | 2017   | 52525252         | MEDELLIN           | Particular        | null   | null  | 16000000        | null      | null    | 2    | Plan Autos Clásico | Si              | Televentas |
And ingrese la bonificacion tecnica <bonoT> y la comercial <bonoC>
And ingrese las coberturas necesarias:
| limite | deducible | AS                 | PTD | PPD  | GTD |
| 640.   | 0         | Asistencia Clásica | 0   | 835. | 40. |
And intente cotizar
And ingrese a analisis de riesgo
Then debo ver un UW issue por cada figura que sea riesgo consultable bloqueante
| mensaje |
|         |


Examples:
| tipo_documento       | documento  | producto | agente_oficina | numSubscripcion | bonoT | bonoC |
| CEDULA DE CIUDADANIA | 1060447895 | Autos    | DIRECTO        | 39355347        | 15    | 0     |


Scenario: 4 Expedicion de poliza al ingresar bonificacion tecnica y comercial igual a la pactada

Given que estoy en la informacion de la poliza con numero de subscripcion <numSubscripcion>
When copie la poliza
And ingrese los datos del asegurado <tipo_documento> <documento>
And ingrese los datos de vehiculo:
| placa  | modelo | codigo_fasecolda | ciudad_circulacion | vehiculo_servicio | chasis | motor | valor_asegurado | descuento | recargo | zona | plan               | cero_kilometros | medioVenta |
| random | 2017   | 52525252         | MEDELLIN           | Particular        | null   | null  | 16000000        | null      | null    | 2    | Plan Autos Clásico | Si              | Televentas |
And ingrese la bonificacion tecnica <bonoT> y la comercial <bonoC>
And ingrese las coberturas a auto cero kilometros:
| limite | deducible | AS                 |
| 640.   | 0         | Asistencia Clásica |
And intente cotizar y expedir la poliza
Then se debe permitir expedir la poliza


Examples:
| tipo_documento       | documento  | producto | agente_oficina | numSubscripcion | bonoT | bonoC |
| CEDULA DE CIUDADANIA | 1060447895 | Autos    | DIRECTO        | 39355347        | 4     | 6     |


Scenario: 5 Bloqueo de expedicion de vehiculo cero kilometros
Given que tengo una cotizacion <cotizacion>
When copie la poliza
And ingrese los datos del asegurado <tipo_documento> <documento>
And ingrese la informacion del vehiculo:
| placa  | modelo | codigo_fasecolda | ciudad_circulacion | vehiculo_servicio | chasis | motor | valor_asegurado | descuento | recargo | zona | plan               | cero_kilometros | vehiculo_blindado | medioVenta |
| random | 2016   | 52525252         | MEDELLIN           | Particular        | null   | null  | 16000000        | null      | null    | 2    | Plan Autos Clásico | Si              | Si                | Televentas |
And seleccione la opcion siguiente
Then deben aparecer los mensajes de validacion:
| mensaje                                                 |
| Vehículo 0 Km : El vehículo no es considerado como 0 km |
When seleccione la opcion siguiente
And ingrese las coberturas a auto cero kilometros:
| limite | deducible | AS                   |
| 640.   | 0         | Asistencia Clásica   |
And intente cotizar
Then se debe mostrar un mensaje de advertencia
| mensaje                                         |
| Este tipo de vehículo (usado) no está permitido |
And intente cotizar
And voy a expedir una poliza
And confirmo el mensaje de expedir poliza
And ingrese a analisis de riesgo
Then debo ver un UW issue por cada figura que sea riesgo consultable bloqueante
| mensaje                                             |
| Este tipo de vehículo (usado) no está permitido     |
| no es considerado como 0 km, requiere autorización. |


Examples:
| tipo_documento       | documento  | cuenta      | producto | agente  | cotizacion |
| CEDULA DE CIUDADANIA | 1060447895 | C1060447895 | Autos    | DIRECTO | 33355366   |