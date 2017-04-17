Meta:
@lote5
@tag equipo: 2, sprint: 14
@local

Narrative:
Como usuario PolicyCenter
quiero poder aplicar condiciones particulares a las polizas colectivas
para expedirlas con diferentes reglas

Scenario: 6 Bloqueo de expedicion de vehiculo NO cero kilometros
GivenStories: stories/policycenter/login_policy.story
Given que tengo una cotizacion <cotizacion>
When copie la poliza
And ingrese los datos del asegurado <tipo_documento> <documento>
And ingrese la informacion del vehiculo:
|placa |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis|motor|valor_asegurado|descuento|recargo|zona|plan        |medioVenta|
|TZZ301|2011  |                |MEDELLIN          |Particular       |null  |null |17900000       |null     |null   |2   |Plan Modular|Televentas
And seleccione la opcion siguiente
And ingrese las coberturas basicas:
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


Scenario: 7 Expedicion de poliza riesgo con riesgo consultable aceptado en poliza principal, para vehiculo cero kilometros
Given que tengo una cotizacion <cotizacion>
When copie la poliza
And ingrese los datos del asegurado <tipo_documento> <documento>
And ingrese los datos del vehiculo:
| placa  | modelo | codigo_fasecolda | ciudad_circulacion | vehiculo_servicio | chasis | motor | valor_asegurado | descuento | recargo | zona | plan              | cero_kilometros |medioVenta|
| random | 2017   | 52525252         | MEDELLIN           | Particular        | null   | null  | 16000000        | null      | null    | 2    | Plan Autos Básico | Si              |Televentas|
When ingrese a la pantalla de coberturas
And ingrese las coberturas a auto cero kilometros:
|limite|deducible|AS|
|640.  |0        |  |
And intente cotizar
And voy a expedir una poliza
And confirmo el mensaje de expedir poliza
Then se debe permitir expedir la poliza

Examples:
|tipo_documento      |documento |cotizacion|
|CEDULA DE CIUDADANIA|1060447895|33355366  |
|CEDULA DE CIUDADANIA|1060447895|33355338  |

Scenario: 8 Expedicion de poliza riesgo en CP con riesgo consultable aceptado en poliza principal
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

Scenario: 9 Bloque de expedicion de poliza riesgo en PA para una zona no permitida
Given que tengo una cotizacion <cotizacion>
When copie la poliza
And ingrese los datos del asegurado <tipo_documento> <documento>
And ingrese los datos de vehiculo:
| placa  | modelo | codigo_fasecolda | ciudad_circulacion                 | vehiculo_servicio | chasis | motor | valor_asegurado | descuento | recargo | zona | plan              | cero_kilometros |medioVenta|
| random | 2017   | 52525252         | SANTIAGO DE CALI (VALLE DEL CAUCA) | Particular        | null   | null  | 16000000        | null      | null    | 2    | Plan Autos Básico | Si              |Asesor    |
And seleccione la opcion siguiente
And ingrese las coberturas a auto cero kilometros:
| limite | deducible |AS|
| 640.   | 0         |  |
And intente cotizar
Then se deben validar los riesgos consultables mostrando los siguientes mensaje por cada una de las figuras
| MENSAJES_WORKSPACE                                               |
| La zona del vehículo esta por fuera de las condiciones otorgadas.|

Examples:
|tipo_documento      |documento |cotizacion|tipoBeneficiario|cedula   | tipodocumento       |
|CEDULA DE CIUDADANIA|1060447895|33355370  |Asegurado       | 94537281| CEDULA DE CIUDADANIA|


Scenario: 10 Bloque de expedicion de poliza riesgo en PA para una marca no permitida
Given que tengo una cotizacion <cotizacion>
When copie la poliza
And ingrese los datos del asegurado <tipo_documento> <documento>
And ingrese los datos de vehiculo:
| placa  | modelo | codigo_fasecolda | ciudad_circulacion                 | vehiculo_servicio | chasis | motor | valor_asegurado | descuento | recargo | zona | plan              | cero_kilometros |medioVenta|
| random | 2017   | 52525252         | MEDELLIN (ANTIOQUIA)               | Particular        | null   | null  | 16000000        | null      | null    | 2    | Plan Autos Básico | Si              |Asesor    |
And seleccione la opcion siguiente
And ingrese las coberturas a auto cero kilometros:
| limite | deducible |AS|
| 640.   | 0         |  |
And intente cotizar
Then se deben validar los riesgos consultables mostrando los siguientes mensaje por cada una de las figuras
| MENSAJES_WORKSPACE                                               |
|La marca del vehiculo esta por fuera de las condiciones otorgadas |

Examples:
|tipo_documento      |documento |cotizacion|tipoBeneficiario|cedula   | tipodocumento       |
|CEDULA DE CIUDADANIA|1060447895|33355372  |Asegurado       | 94537281| CEDULA DE CIUDADANIA|