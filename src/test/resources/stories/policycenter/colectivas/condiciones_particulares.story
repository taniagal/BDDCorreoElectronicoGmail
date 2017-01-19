Condiciones particulares

Meta:
@lote3
@Story CDSEG-5732 @Story CDSEG-5517 @Story CDSEG-5307 @Story CDSEG-5319 @Story CDSEG-5314 @Story CDSEG-5507
@sprint 11
@tag automator: juan_gabriel_zapata
@local



Scenario: 1 Antiguedad
Meta: @manual
Given tengo una póliza riesgo donde liberan la regla de modelo de vehículo (antigüedad) en las CP
When Ingrese en los datos del vehículo el modelo  y este sea  mayor a la antigüedad permitida según el plan
Then Se ebe expedir la transacción sin inconveniente
And Se debe generar el UW que ya existe "El modelo es superior al máximo permitido por este canal. Por favor verifique."

Examples:
||
||

Scenario: 2 Coberturas
Meta: @manual
Given Que están registradas las CP de coberturas en la póliza
When Esten seleccionando en la póliza riesgo las coberturas que se va a tomar para el vehículo
And estas coberturas se muestren pero no este registrado en las CP
Then Solo se deben mostrar las coberturas registradas en la condición particular de la póliza
And Se debe mostrar el mensaje de bloqueo "Existen coberturas, opciones o deducibles que no se encuentra registrada en las condiciones particulares de la póliza." y al intentar expedir en todas las operaciones se genera un UW

Examples:
||
||


Scenario: 3 Inspeccion
Meta: @manual
Given Que tengo una póliza riesgo donde liberan la regla de inspección como CP
When Ingrese en los datos del vehículo un modelo que no se considere 0 km y el campo de 0km este marcado como NO
Then Se ebe expedir la transacción sin inconveniente
And Se debe generar el UW que existe "El vehículo no tiene una inspección vigente a la fecha de ingreso del riesgo."

Examples:
||
||


Scenario: 4 Marcas no permitidas
Meta: @manual
Given Que tengo una póliza riesgo donde liberan la regla de marcas no permitidas como CP
When Ingrese en los datos del vehículo la marca y sea una marca no permitida
Then Se debe expedir la transacción sin inconveniente
And Se debe generar el UW que existe "Por política de la compañía este vehiculo no puede ser asegurado."

Examples:
||
||

Scenario: 5 Maximo valor asegurado
Meta: @manual
Given Que tengo una póliza riesgo donde liberan la regla de máximo valor vehículo como CP
When Ingrese en los datos del vehículo un valor asegurado superior al permitido por clase
Then Se debe expedir la transacción sin inconveniente
And Se debe mostrar el mesaje de alerta en el siguiente de la pantalla de info vehículo "El valor asegurado del vehículo supera el límite máximo permitido por políticas. El aseguramiento de este carro así como la oferta presentada al cliente, deben ser avalados previamente por el Comité de Riesgo No Estándar Autos."
And Se debe generar el UW que existe al intentar expedir "El valor asegurado del vehículo supera el límite máximo permitido por políticas. El aseguramiento de este carro así como la oferta presentada al cliente, deben ser avalados previamente por el Comité de Riesgo No Estándar Autos."

Examples:
||
||


Scenario: 6 Planes
Meta: @manual
Given Que están registradas las CP de planes en la póliza
When Este seleccionando en la póliza riesgo el plan que se va a tomar para el vehículo
Then Solo se deben mostrar los planes registrados en la condición particular de la póliza
And Se debe mostrar el mensaje de bloqueo "El plan seleccionado no se encuentra registrado en las condiciones particulares de la póliza." y al intentar expedir se genera un UW

Examples:
||
||

Scenario: 7 Tipo de servicio
Meta: @manual
Given Que tengo una póliza riesgo donde liberan los tipo de servicio no permitidos como CP
When Ingrese en los datos del vehículo el tipo de servicio público
Then Se ebe expedir la transacción sin inconveniente
And Al expedir se debe generar el UW que existe "Tipo de servicio no permitido, debe ser autorizado."

Examples:
||
||


Scenario: 8 Zonas no permitidas
Meta: @manual
Given Que tengo una póliza riesgo donde liberan las zonas no permitidas como CP
When Ingrese la ciudad de circulación y esta este dentro de una zona no permitida
Then Se ebe expedir la transacción sin inconveniente
And Se debe generar el UW que existe "Por política de la compañía no esta permitido asegurar vehículos que circulen en esta zona."

Examples:
||
||


Scenario: 9 Bloqueo de expedicion de vehiculo cero kilometros
GivenStories: stories/policycenter/login_policy.story
Given que tengo una cotizacion <cotizacion>
When copie la poliza
And ingrese los datos del asegurado <tipo_documento> <documento>
And ingrese los datos del vehiculo:
| placa  | modelo | codigo_fasecolda | ciudad_circulacion | vehiculo_servicio | chasis | motor | valor_asegurado | descuento | recargo | zona | plan         | cero_kilometros | vehiculo_blindado |
| random | 2011   |                  | MEDELLIN           | Particular        | null   | null  | 17900000        | null      | null    | 2    | Plan Modular | Si              | Si                |
Then deben aparecer los mensajes de validacion:
| mensaje                                                                     |
| Vehículo 0 Km : El vehículo no es considerado como 0 km                     |
When seleccione la opcion siguiente
And ingrese las coberturas basicas:
|limite|deducible|abogado |PLlaves |
|1.440 |0        |Opción 1|Opción 1|
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


Scenario: 10 Bloqueo de expedicion de vehiculo NO cero kilometros
Given que tengo una cotizacion <cotizacion>
When copie la poliza
And ingrese los datos del asegurado <tipo_documento> <documento>
And ingrese los datos del vehiculo:
|placa |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis|motor|valor_asegurado|descuento|recargo|zona|plan        |
|TZZ301|2011  |                |MEDELLIN          |Particular       |null  |null |17900000       |null     |null   |2   |Plan Modular|
And ingrese las coberturas basicas:
|limite|deducible|abogado |PLlaves |
|1.440 |0        |Opción 1|Opción 1|
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


Scenario: 11 Expedicion de poliza riesgo con riesgo consultable aceptado en poliza principal, para vehiculo cero kilometros
Given que tengo una cotizacion <cotizacion>
When copie la poliza
And ingrese los datos del asegurado <tipo_documento> <documento>
And ingrese los datos del vehiculo:
| placa  | modelo | codigo_fasecolda | ciudad_circulacion | vehiculo_servicio | chasis | motor | valor_asegurado | descuento | recargo | zona | plan              | cero_kilometros |
| random | 2016   | 52525252         | MEDELLIN           | Particular        | null   | null  | 16000000        | null      | null    | 2    | Plan Autos Básico | Si              |
When ingrese a la pantalla de coberturas
And ingrese las coberturas a auto cero kilometros:
|limite|deducible|
|1.440 |0        |
And intente cotizar
And voy a expedir una poliza
And confirmo el mensaje de expedir poliza
Then se debe permitir expedir la poliza

Examples:
|tipo_documento      |documento |cotizacion|
|CEDULA DE CIUDADANIA|1060447895|33355366  |
|CEDULA DE CIUDADANIA|1060447895|33355338  |

Scenario: 12 Expedicion de poliza riesgo en CP con riesgo consultable aceptado en poliza principal
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


Scenario: 13  Bloqueo de expedicion de vehiculo por maximo valor accesorios
Given que tengo una cotizacion <cotizacion>
When copie la poliza
And ingrese los datos del asegurado <tipo_documento> <documento>
And ingrese la informacion del vehiculo:
| placa  | modelo | codigo_fasecolda | ciudad_circulacion | vehiculo_servicio | chasis | motor | valor_asegurado | descuento | recargo | zona | plan              |
| random | 2011   |                  | MEDELLIN           | Particular        | null   | null  | 17900000        | null      | null    | 2    | Plan Autos Básico |
And se ingrese el valor de los accesorios es superior al 20% del valor asegurado del vehiculo
And Se ingrese el valor de los accesorios especiales es superior al 100% del valor asegurado del vehículo
Then deben aparecer los mensajes de validacion:
| mensaje                                                                        |
| El valor de los accesorios es mayor al 20% del valor Asegurado                 |
| El valor de los accesorios especiales es mayor al valor Asegurado del vehículo |
When seleccione la opcion siguiente
And ingrese las coberturas a vehiculo:
|limite|deducible|
|1.440 |0        |
And intente cotizar
And voy a expedir una poliza
And confirmo el mensaje de expedir poliza
And ingrese a analisis de riesgo
Then debo ver un UW issue por cada figura que sea riesgo consultable bloqueante
|mensaje                                                                         |
|El valor de los accesorios es mayor al 20% del valor Asegurado                  |
|El valor de los accesorios especiales es mayor al valor Asegurado del vehículo  |


Examples:
|tipo_documento      |documento |cotizacion|
|CEDULA DE CIUDADANIA|1060447895|33355439  |


Scenario: 14 Expedicion de poliza de vehiculo por maximo valor accesorios
Given que tengo una cotizacion <cotizacion>
When copie la poliza
And ingrese los datos del asegurado <tipo_documento> <documento>
And ingrese la informacion del vehiculo:
| placa  | modelo | codigo_fasecolda | ciudad_circulacion | vehiculo_servicio | chasis | motor | valor_asegurado | descuento | recargo | zona | plan              | cero_kilometros |
| random | 2016   | 52525252         | MEDELLIN           | Particular        | null   | null  | 16000000        | null      | null    | 2    | Plan Autos Básico | Si              |
And se ingrese el valor de los accesorios es superior al 20% del valor asegurado del vehiculo
And Se ingrese el valor de los accesorios especiales es superior al 100% del valor asegurado del vehículo
And ingrese las coberturas a vehiculo:
|limite|deducible|
|1.440 |0        |
And intente cotizar
And voy a expedir una poliza
And confirmo el mensaje de expedir poliza
Then se debe permitir expedir la poliza

Examples:
|tipo_documento      |documento |cuenta     |producto|agente |cotizacion|
|CEDULA DE CIUDADANIA|1060447895|C1060447895|Autos   |DIRECTO|33355366  |


Scenario: 15  Bloqueo de expedicion de vehiculo blindado
Given que tengo una cotizacion <cotizacion>
When copie la poliza
And ingrese los datos del asegurado <tipo_documento> <documento>
And ingrese los datos del vehiculo:
| placa  | modelo | codigo_fasecolda | ciudad_circulacion | vehiculo_servicio | chasis | motor | valor_asegurado | descuento | recargo | zona | plan         | vehiculo_blindado |
| random | 2011   |                  | MEDELLIN           | Particular        | null   | null  | 17900000        | null      | null    | 2    | Plan Modular | Si                |
And ingrese las coberturas basicas:
|limite|deducible|abogado |PLlaves |
|1.440 |0        |Opción 1|Opción 1|
And intente cotizar
Then se debe mostrar un mensaje de advertencia
|mensaje                                            |
|Este tipo de vehículo (Blindado) no está permitido para ingreso a la póliza  |
And intente cotizar
And voy a expedir una poliza
And confirmo el mensaje de expedir poliza
And ingrese a analisis de riesgo
Then debo ver un UW issue por cada figura que sea riesgo consultable bloqueante
| mensaje                                                                          |
| Este tipo de vehículo (Blindado) no está permitido para ingreso a la póliza      |

Examples:
|tipo_documento      |documento |cuenta     |producto|agente |cotizacion|
|CEDULA DE CIUDADANIA|1060447895|C1060447895|Autos   |DIRECTO|33355366  |


Scenario: 16  Expedicion de vehiculo NO blindado
Given que tengo una cotizacion <cotizacion>
When copie la poliza
And ingrese los datos del asegurado <tipo_documento> <documento>
And ingrese los datos del vehiculo:
| placa  | modelo | codigo_fasecolda | ciudad_circulacion | vehiculo_servicio | chasis | motor | valor_asegurado | descuento | recargo | zona | plan              |cero_kilometros|
| random | 2016   | 52525252         | MEDELLIN           | Particular        | null   | null  | 16000000        | null      | null    | 2    | Plan Autos Básico |Si             |
And ingrese las coberturas a vehiculo:
|limite|deducible|
|1.440 |0        |
And intente cotizar
And voy a expedir una poliza
And confirmo el mensaje de expedir poliza
Then se debe permitir expedir la poliza

Examples:
|tipo_documento      |documento |cuenta     |producto|agente |cotizacion|
|CEDULA DE CIUDADANIA|1060447895|C1060447895|Autos   |DIRECTO|33355366  |


Scenario: 17  Bloqueo de expedicion de vehiculo blindado para poliza sin condicion particular(CP)
Given que tengo una cotizacion <cotizacion>
When copie la poliza
And ingrese los datos del asegurado <tipo_documento> <documento>
And ingrese los datos del vehiculo:
| placa  | modelo | codigo_fasecolda | ciudad_circulacion | vehiculo_servicio | chasis | motor | valor_asegurado | descuento | recargo | zona | plan              |cero_kilometros| vehiculo_blindado |
| random | 2016   | 52525252         | MEDELLIN           | Particular        | null   | null  | 16000000        | null      | null    | 2    | Plan Autos Básico |Si             |Si                 |
And ingrese las coberturas a vehiculo:
|limite|deducible|
|1.440 |0        |
And intente cotizar
Then se debe mostrar un mensaje de advertencia
|mensaje                                            |
|Este tipo de vehículo (Blindado) no está permitido para ingreso a la póliza  |
And intente cotizar
And voy a expedir una poliza
And confirmo el mensaje de expedir poliza
And ingrese a analisis de riesgo
Then debo ver un UW issue por cada figura que sea riesgo consultable bloqueante
| mensaje                                                                          |
| Este tipo de vehículo (Blindado) no está permitido para ingreso a la póliza      |

Examples:
|tipo_documento      |documento |cuenta     |producto|agente |cotizacion|
|CEDULA DE CIUDADANIA|1060447895|C1060447895|Autos   |DIRECTO|33355366  |


Scenario: 18  Bloqueo de expedicion para vehiculo que transporte combustible
Given que tengo una cotizacion <cotizacion>
When copie la poliza
And ingrese los datos del asegurado <tipo_documento> <documento>
And ingrese los datos del vehiculo:
| placa  | modelo | codigo_fasecolda | ciudad_circulacion | vehiculo_servicio | chasis | motor | valor_asegurado | descuento | recargo | zona | plan              |transporte_combustible|
| random | 2016   | 52525252         | MEDELLIN           | Particular        | null   | null  | 16000000        | null      | null    | 2    | Plan Autos Básico |Si                    |
And ingrese las coberturas a vehiculo:
|limite|deducible|
|1.440 |0        |
And intente cotizar
And voy a expedir una poliza
And confirmo el mensaje de expedir poliza
And ingrese a analisis de riesgo
Then debo ver un UW issue por cada figura que sea riesgo consultable bloqueante
| mensaje                                                                          |
| Valor para campo transporta combustible no permitido. Por favor verifique        |

Examples:
|tipo_documento      |documento |cuenta     |producto|agente |cotizacion|
|CEDULA DE CIUDADANIA|1060447895|C1060447895|Autos   |DIRECTO|33355390  |


Scenario: 19 Expedicion de poliza para vehiculo que NO transporta combustible
Given que tengo una cotizacion <cotizacion>
When copie la poliza
And ingrese los datos del asegurado <tipo_documento> <documento>
And ingrese los datos del vehiculo:
| placa  | modelo | codigo_fasecolda | ciudad_circulacion | vehiculo_servicio | chasis | motor | valor_asegurado | descuento | recargo | zona | plan              |transporte_combustible|
| random | 2016   | 52525252         | MEDELLIN           | Particular        | null   | null  | 16000000        | null      | null    | 2    | Plan Autos Básico |No                    |
And ingrese las coberturas a vehiculo:
|limite|deducible|
|1.440 |0        |
And intente cotizar
And voy a expedir una poliza
And confirmo el mensaje de expedir poliza
Then se debe permitir expedir la poliza

Examples:
|tipo_documento      |documento |cuenta     |producto|agente |cotizacion|
|CEDULA DE CIUDADANIA|1060447895|C1060447895|Autos   |DIRECTO|33355390  |


Scenario: 20 Expedicion de poliza sin seleccionar opcion de transporte de combustible
Given que tengo una cotizacion <cotizacion>
When copie la poliza
And ingrese los datos del asegurado <tipo_documento> <documento>
And ingrese los datos del vehiculo:
| placa  | modelo | codigo_fasecolda | ciudad_circulacion | vehiculo_servicio | chasis | motor | valor_asegurado | descuento | recargo | zona | plan              |
| random | 2016   | 52525252         | MEDELLIN           | Particular        | null   | null  | 16000000        | null      | null    | 2    | Plan Autos Básico |
And ingrese las coberturas a vehiculo:
|limite|deducible|
|1.440 |0        |
And intente cotizar
And voy a expedir una poliza
And confirmo el mensaje de expedir poliza
Then se debe permitir expedir la poliza

Examples:
|tipo_documento      |documento |cuenta     |producto|agente |cotizacion|
|CEDULA DE CIUDADANIA|1060447895|C1060447895|Autos   |DIRECTO|33355390  |


Scenario: 21 Expedicion de vehiculo de transporte de combustible para poliza sin condicion particular(CP)
Given que tengo una cotizacion <cotizacion>
When copie la poliza
And ingrese los datos del asegurado <tipo_documento> <documento>
And ingrese los datos del vehiculo:
| placa  | modelo | codigo_fasecolda | ciudad_circulacion | vehiculo_servicio | chasis | motor | valor_asegurado | descuento | recargo | zona | plan              |cero_kilometros| transporte_combustible |
| random | 2016   | 52525252         | MEDELLIN           | Particular        | null   | null  | 16000000        | null      | null    | 2    | Plan Autos Básico |Si             |Si                      |
And ingrese las coberturas a vehiculo:
|limite|deducible|
|1.440 |0        |
And intente cotizar
And voy a expedir una poliza
And confirmo el mensaje de expedir poliza
Then se debe permitir expedir la poliza

Examples:
|tipo_documento      |documento |cuenta     |producto|agente |cotizacion|
|CEDULA DE CIUDADANIA|1060447895|C1060447895|Autos   |DIRECTO|33355366  |

