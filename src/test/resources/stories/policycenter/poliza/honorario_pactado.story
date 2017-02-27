Meta:
@tag equipo: 2
@lote1
@Sprint 14


Narrative:
Como usuario de PolicyCente
Quiero controlar que el honorario pactado al momento de seleccionar la opcion si
Para gestionar las remuneraciones de una poliza

Scenario: 1 Alertas al ingresar honorario pactado invalido en CP
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza de mrc:
|oficina| producto                | tipo_documento       | fecha_nacimiento | primer_nombre | primer_apellido | tipo_direccion          | direccion        | departamento | ciudad   | agente |agente_oficina|
|4802   | Multiriesgo corporativo | CEDULA DE CIUDADANIA | 10/10/1979       | CHUCHO        | OZUNA           | DIRECCION DE RESIDENCIA | CALLE 11K #31-31 | Antioquia    | Medellin | INT-3  | DIRECTO      |
When seleccione la opcion SI de honorario pactada e ingrese el valor
| VALOR |
| -5    |
And cotice una poliza
Then mostrar el siguiente mensaje de bloqueo
|mensaje                                       |
|El honorario registrado, debe ser mayor a cero|
When seleccione la opcion SI de honorario pactada e ingrese el valor
| VALOR |
| AB    |
And cotice una poliza
Then se debe mostrar un mensaje <mensajeerror> de error
When seleccione la opcion SI de honorario pactada e ingrese el valor
| VALOR |
| 1     |
And cotice una poliza
Then mostrar el siguiente mensaje de bloqueo
|mensaje                                                                       |
|El honorario registrado, es mayor al honorario matriculado por favor verifique|
When seleccione la opcion SI de honorario pactada e ingrese el valor
| VALOR |
| 0     |
And ingrese a edificios y ubicaciones
And intente ingresar una nueva ubicacion sin riesgo consultable
And ingrese la entrada de las diferentes coberturas con interes <documento><tipodocumento><tipoBeneficiario> adicional
| TAB                      | TIPO_ARTICULO | OTRO_ARTICULO_OTROS | COBERTURA        | ENTRADAS                                            | VALOR_ENTRADAS |
| Información de Artículos | Edificios     |                     |                  | Valor Reconstrucción                                | 100000000      |
| Información de Artículos | Edificios     |                     | Danos materiales | Valor asegurado danos materiales                    | 100000000      |
And intente cotizar y expedir la poliza
And ingrese a analisis de riesgo
Then debo ver un UW issue por cada figura que sea riesgo consultable bloqueante
| mensaje                                                  |
| El honorario registrado, requiere autorización.          |

Examples:
| mensajeerror                                    | documento | tipodocumento        | tipoBeneficiario |
| Honorario Pactado : debe ser un valor numérico. | 94537281  | CEDULA DE CIUDADANIA | Asegurado        |


Scenario: 2 Alertas al ingresar honorario pactado invalido en PA
Given estoy cotizando una poliza de autos:
|oficina|agente_oficina|organizacion|tipoPoliza|producto |tipo_documento      |fecha_nacimiento|primer_nombre|primer_apellido|tipo_direccion         |direccion       |departamento|ciudad  |agente|
|4802   |DIRECTO       |Sura        |Individual|Autos    |CEDULA DE CIUDADANIA|02/12/1990      |EMINEN        |ALBEIRO       |DIRECCION DE RESIDENCIA|CALLE 79B #49-35|Antioquia   |Medellin|INT-3 |
When seleccione la opcion SI de honorario pactada e ingrese el valor
| VALOR |
| -5    |
And cotice una poliza
Then mostrar el siguiente mensaje de bloqueo
|mensaje                                       |
|El honorario registrado, debe ser mayor a cero|
When seleccione la opcion SI de honorario pactada e ingrese el valor
| VALOR |
| AB    |
And cotice una poliza
Then se debe mostrar un mensaje <mensajeerror> de error
When seleccione la opcion SI de honorario pactada e ingrese el valor
| VALOR |
| 1     |
And cotice una poliza
Then mostrar el siguiente mensaje de bloqueo
|mensaje                                                                       |
|El honorario registrado, es mayor al honorario matriculado por favor verifique|
When seleccione la opcion SI de honorario pactada e ingrese el valor
| VALOR |
| 0     |
And ingrese los datos del asegurado <tipo_documento> <documento>
And ingrese los datos del vehiculo:
| placa  | modelo | codigo_fasecolda | ciudad_circulacion             | vehiculo_servicio | chasis | motor | valor_asegurado | descuento | recargo | zona | plan              |medioVenta|
| random | 2016   | 52525252         | MEDELLIN (Antioquia)           | Particular        | null   | null  | 16000000        | null      | null    | 2    | Plan Autos Global |Televentas|
And ingrese las coberturas a auto cero kilometros:
| limite | deducible |
| 640.   | 0         |              | 100000000      |
And intente cotizar y expedir la poliza
And ingrese a analisis de riesgo
Then debo ver un UW issue por cada figura que sea riesgo consultable bloqueante
| mensaje                                                  |
| El honorario registrado, requiere autorización.          |

Examples:
| mensajeerror                                    | documento | tipo_documento        |
| Honorario Pactado : debe ser un valor numérico. | 94537281  | CEDULA DE CIUDADANIA  |


Scenario: 3 Alertas al intentar modificar honorario en cambio de poliza
Meta:@manual
Given  cotizo una poliza
When  intente modificar el honorario pactado en cambio de poliza
Then se debe bloquear la modificacion

Examples:
| |
| |

Scenario: 4 Expedicion de poliza con valor decimal en el honorario
Meta:@manual
Given  cotizo una poliza
When  intente mcotizar una poliza con valores decimales
Then se permite expedir la poliza

Examples:
| |
| |