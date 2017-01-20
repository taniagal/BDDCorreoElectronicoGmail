Meta:
@lote 2
@tag equipo: 1, sprint 13

Narrative:
Como usuario PolicyCenter
quiero poder buscar riesgos de autos por placa
para poder ubicar el riesgo de una poliza  principal o una individual  para la realizacion de las  operaciones actuales

Scenario: realizar la busqueda de riesgo de poliza individual, validar que los resultados son correctos y el link de la placa
GivenStories: stories/policycenter/login_policy.story
Given que voy a la busqueda de riesgos
When este buscando un riesgo por los filtros producto y placa del vehiculo
| producto | placa  |
| Autos    | BLE860 |
Then debo ver la informacion de los riesgos asociados
| placa  | tipoPoliza | estado     |
| BLE860 | Individual | Expedición |
And cuando vaya a ver los detalles de la consulta debo ver la informacion de la poliza asociada <placa>

Examples:
| placa  |
| BLE860 |

Scenario: validar la informacion de la poliza individual asociada a la placa
Given que voy a la busqueda de riesgos
When este buscando un riesgo por los filtros producto y placa del vehiculo
| producto | placa  |
| Autos    | BLE860 |
When quiera ver la informacion de la poliza
Then debo poder ver la informacion de la poliza asociada <placa>

Examples:
| placa  |
| BLE860 |

Scenario: realizar la busqueda de riesgo de poliza colectiva, validar que los resultados son correctos y el link de la placa
Given que voy a la busqueda de riesgos
When este buscando un riesgo por los filtros producto y placa del vehiculo
| producto | placa  |
| Autos    | BLE200 |
Then debo ver la informacion de los riesgos asociados
| placa  | tipoPoliza |estado|
| BLE200 | Colectiva  |Expedición|
And cuando vaya a ver los detalles de la consulta debo ver la informacion de la poliza asociada <placa>

Examples:
| placa  |
| BLE200 |

Scenario: validar la informacion de la poliza colectiva asociada a la placa
Given que voy a la busqueda de riesgos
When este buscando un riesgo por los filtros producto y placa del vehiculo
| producto | placa  |
| Autos    | BLE200 |
When quiera ver la informacion de la poliza
Then debo poder ver el resumen de la poliza colectiva

Scenario: realizar la busqueda de riesgo de poliza colectiva que no tiene poliza principal, validando que no debe mostrar datos
Given que voy a la busqueda de riesgos
When este buscando un riesgo por los filtros producto y placa del vehiculo
| producto | placa  |
| Autos    | BLE500 |
Then debe mostrar el mensaje <mensaje>

Examples:
| mensaje                             |
| La búsqueda no devolvió resultados. |

Scenario: validar para poliza individual no se muestra en estado cotizada
Given que voy a la busqueda de riesgos
When este buscando un riesgo por los filtros producto y placa del vehiculo
| producto | placa  |
| Autos    | T64497 |
Then debe mostrar el mensaje <mensaje>

Examples:
| mensaje                             |
| La búsqueda no devolvió resultados. |

Scenario: validar que solamente se muestra la poliza en el ultimo estado
Meta: @manual
Given que existe una poliza <poliza> riesgo expedida
When quiera realizar esta renovacion
And emita la renovacion
And vaya a buscar la poliza por el numero de la placa
Then debo ver la informacion de la poliza en ultimo estado <estado>

Examples:

| poliza   | estado     |
| 10101010 | Renovación |

Scenario: validar que si tengo una poliza cancelada y creo una nueva poliza para la placa, debo poder ver la informacion de ambas polizas en la busqueda
Meta: @manual
Given: que tengo la poliza cancelada para la placa ABC123
When creo una poliza nueva para la placa ABC123
And voy a buscar la poliza por el numero de placa
Then debe mostrar en el resultado de la busqueda, tanto la poliza cancelada como la expedida