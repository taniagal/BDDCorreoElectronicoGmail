Meta:
@lote4
@sprint 14
@tag equipo: 2
@local

Scenario: 1 Generacion de UW al ingresar bonificacion comercial y tecnica mayor a la pactada

GivenStories: stories/policycenter/login_policy.story
Given que estoy en la informacion de la poliza con numero de subscripcion <numSubscripcion>
When copie la poliza
And ingrese los datos del asegurado <tipo_documento> <documento>
And ingrese los datos de vehiculo:
| placa  | modelo | codigo_fasecolda | ciudad_circulacion | vehiculo_servicio | chasis | motor | valor_asegurado | descuento | recargo | zona | plan              | cero_kilometros |
| random | 2016   | 52525252         | MEDELLIN           | Particular        | null   | null  | 16000000        | null      | null    | 2    | Plan Autos Básico | Si              |
And ingrese la bonificacion tecnica <bonoT> y la comercial <bonoC>
And ingrese las coberturas a auto cero kilometros:
| limite | deducible |
| 640.   | 0         |
And intente cotizar
And ingrese a analisis de riesgo
Then debo ver un UW issue por cada figura que sea riesgo consultable bloqueante
| mensaje                                                                    |
| La bonificación no coincide con lo arrojado por el sistema, Favor verifica |


Examples:
| tipo_documento       | documento  | producto |agente_oficina| numSubscripcion |bonoT|bonoC|
| CEDULA DE CIUDADANIA | 1060447895 | Autos    | DIRECTO      | 39355347   |6    | 5   |


Scenario: 2 Generacion de UW al ingresar bonificacion comercial mayor a la pactada

Given que estoy en la informacion de la poliza con numero de subscripcion <numSubscripcion>
When copie la poliza
And ingrese los datos del asegurado <tipo_documento> <documento>
And ingrese los datos de vehiculo:
| placa  | modelo | codigo_fasecolda | ciudad_circulacion | vehiculo_servicio | chasis | motor | valor_asegurado | descuento | recargo | zona | plan              | cero_kilometros |
| random | 2016   | 52525252         | MEDELLIN           | Particular        | null   | null  | 16000000        | null      | null    | 2    | Plan Autos Básico | Si              |
And ingrese la bonificacion tecnica <bonoT> y la comercial <bonoC>
And ingrese las coberturas a auto cero kilometros:
| limite | deducible |
| 640.   | 0         |
And intente cotizar
And ingrese a analisis de riesgo
Then debo ver un UW issue por cada figura que sea riesgo consultable bloqueante
| mensaje                                                                    |
| La bonificación no coincide con lo arrojado por el sistema, Favor verifica |


Examples:
| tipo_documento       | documento  | producto | agente_oficina | numSubscripcion | bonoT | bonoC |
| CEDULA DE CIUDADANIA | 1060447895 | Autos    | DIRECTO        | 39355347        | 0     | 15    |


Scenario: 3 Generacion de UW al ingresar bonificacion tecnica mayor a la pactada

Given que estoy en la informacion de la poliza con numero de subscripcion <numSubscripcion>
When copie la poliza
And ingrese los datos del asegurado <tipo_documento> <documento>
And ingrese los datos de vehiculo:
| placa  | modelo | codigo_fasecolda | ciudad_circulacion | vehiculo_servicio | chasis | motor | valor_asegurado | descuento | recargo | zona | plan              | cero_kilometros |
| random | 2016   | 52525252         | MEDELLIN           | Particular        | null   | null  | 16000000        | null      | null    | 2    | Plan Autos Básico | Si              |
And ingrese la bonificacion tecnica <bonoT> y la comercial <bonoC>
And ingrese las coberturas a auto cero kilometros:
| limite | deducible |
| 640.   | 0         |
And intente cotizar
And ingrese a analisis de riesgo
Then debo ver un UW issue por cada figura que sea riesgo consultable bloqueante
| mensaje                                                                    |
| La bonificación no coincide con lo arrojado por el sistema, Favor verifica |


Examples:
| tipo_documento       | documento  | producto | agente_oficina | numSubscripcion | bonoT | bonoC |
| CEDULA DE CIUDADANIA | 1060447895 | Autos    | DIRECTO        | 39355347        | 15    | 0    |


Scenario: 4 Expedicion de poliza al ingresar bonificacion tecnica y comercial igual a la pactada

Given que estoy en la informacion de la poliza con numero de subscripcion <numSubscripcion>
When copie la poliza
And ingrese los datos del asegurado <tipo_documento> <documento>
And ingrese los datos de vehiculo:
| placa  | modelo | codigo_fasecolda | ciudad_circulacion | vehiculo_servicio | chasis | motor | valor_asegurado | descuento | recargo | zona | plan              | cero_kilometros |
| random | 2016   | 52525252         | MEDELLIN           | Particular        | null   | null  | 16000000        | null      | null    | 2    | Plan Autos Básico | Si              |
And ingrese la bonificacion tecnica <bonoT> y la comercial <bonoC>
And ingrese las coberturas a auto cero kilometros:
| limite | deducible |
| 640.   | 0         |
And intente cotizar y expedir la poliza
Then se debe permitir expedir la poliza


Examples:
| tipo_documento       | documento  | producto | agente_oficina | numSubscripcion | bonoT | bonoC |
| CEDULA DE CIUDADANIA | 1060447895 | Autos    | DIRECTO        | 39355347        | 4     | 6     |



Scenario: 11 Bloqueo de expedicion de vehiculo cero kilometros
GivenStories: stories/policycenter/login_policy.story
Given que tengo una cotizacion <cotizacion>
When copie la poliza
And ingrese los datos del asegurado <tipo_documento> <documento>
And ingrese la informacion del vehiculo:
| placa  | modelo | codigo_fasecolda | ciudad_circulacion | vehiculo_servicio | chasis | motor | valor_asegurado | descuento | recargo | zona | plan         | cero_kilometros | vehiculo_blindado |
| random | 2011   |                  | MEDELLIN           | Particular        | null   | null  | 17900000        | null      | null    | 2    | Plan Modular | Si              | Si                |
And seleccione la opcion siguiente
Then deben aparecer los mensajes de validacion:
| mensaje                                                                     |
| Vehículo 0 Km : El vehículo no es considerado como 0 km                     |
When seleccione la opcion siguiente
And ingrese las coberturas a auto cero kilometros:
|limite|deducible|
|640.  |0        |
And intente cotizar
Then se debe mostrar un mensaje de advertencia
|mensaje                                            |
|Este tipo de vehículo (usado) no está permitido    |
And intente cotizar
And voy a expedir una poliza
And confirmo el mensaje de expedir poliza
And ingrese a analisis de riesgo
Then debo ver un UW issue por cada figura que sea riesgo consultable bloqueante
| mensaje                                                                          |
| Este tipo de vehículo (usado) no está permitido                                  |
| no es considerado como 0 km, requiere autorización.                              |


Examples:
|tipo_documento      |documento |cuenta     |producto|agente |cotizacion|
|CEDULA DE CIUDADANIA|1060447895|C1060447895|Autos   |DIRECTO|33355366  |


Scenario: 12 Bloqueo de expedicion de vehiculo NO cero kilometros
Given que tengo una cotizacion <cotizacion>
When copie la poliza
And ingrese los datos del asegurado <tipo_documento> <documento>
And ingrese la informacion del vehiculo:
|placa |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis|motor|valor_asegurado|descuento|recargo|zona|plan        |
|TZZ301|2011  |                |MEDELLIN          |Particular       |null  |null |17900000       |null     |null   |2   |Plan Modular|
And seleccione la opcion siguiente
And ingrese las coberturas a vehiculo:
|limite|deducible|abogado|PLlaves|
|640.  |0        |Si     |Si     |
And intente cotizar
Then se debe mostrar un mensaje de advertencia
|mensaje                                            |
|Este tipo de vehículo (usado) no está permitido    |
And intente cotizar
And voy a expedir una poliza
And confirmo el mensaje de expedir poliza
And ingrese a analisis de riesgo
Then debo ver un UW issue por cada figura que sea riesgo consultable bloqueante
|mensaje                                                                         |
|Este tipo de vehículo (usado) no está permitido                                 |

Examples:
|tipo_documento      |documento |cuenta     |producto|agente |cotizacion|
|CEDULA DE CIUDADANIA|1060447895|C1060447895|Autos   |DIRECTO|33355366  |


Scenario: 13 Expedicion de poliza riesgo con riesgo consultable aceptado en poliza principal, para vehiculo cero kilometros
Given que tengo una cotizacion <cotizacion>
When copie la poliza
And ingrese los datos del asegurado <tipo_documento> <documento>
And ingrese los datos del vehiculo:
| placa  | modelo | codigo_fasecolda | ciudad_circulacion | vehiculo_servicio | chasis | motor | valor_asegurado | descuento | recargo | zona | plan              | cero_kilometros |
| random | 2016   | 52525252         | MEDELLIN           | Particular        | null   | null  | 16000000        | null      | null    | 2    | Plan Autos Básico | Si              |
When ingrese a la pantalla de coberturas
And ingrese las coberturas a auto cero kilometros:
|limite|deducible|
|640.  |0        |
And intente cotizar
And voy a expedir una poliza
And confirmo el mensaje de expedir poliza
Then se debe permitir expedir la poliza

Examples:
|tipo_documento      |documento |cotizacion|
|CEDULA DE CIUDADANIA|1060447895|33355366  |
|CEDULA DE CIUDADANIA|1060447895|33355338  |

Scenario: 14 Expedicion de poliza riesgo en CP con riesgo consultable aceptado en poliza principal
Given que tengo una cotizacion <cotizacion>
When copie la poliza
And ingrese a edificios y ubicaciones
And intente ingresar una nueva ubicacion sin riesgo consultable
And ingrese la entrada de las diferentes coberturas con interes <documento><tipodocumento><tipoBeneficiario> adicional
| TAB                      | TIPO_ARTICULO     | OTRO_ARTICULO_OTROS | COBERTURA        | ENTRADAS                         | VALOR_ENTRADAS |
| Información de Artículos | Edificios         |                     |                  | Valor Reconstrucción             | 100000000      |
| Información de Artículos | Edificios         |                     | Danos materiales | Valor asegurado danos materiales | 100000000      |
| Interes Adicional        | Interes Adicional |                     |                  | NULL                             | 00000          |
And voy a expedir una poliza
And confirmo el mensaje de expedir poliza
Then se debe permitir expedir la poliza

Examples:
|tipo_documento      |documento |cotizacion|tipoBeneficiario|cedula   | tipodocumento       |
|CEDULA DE CIUDADANIA|1060447895|33355337  |Asegurado       | 94537281| CEDULA DE CIUDADANIA|