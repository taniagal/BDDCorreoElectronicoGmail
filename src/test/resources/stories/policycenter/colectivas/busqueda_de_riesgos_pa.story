Meta:
@lote 2
@tag equipo: 1, sprint 13

Narrative:
Como usuario PolicyCenter
quiero poder buscar riesgos de autos por placa
para poder ubicar el riesgo de una poliza  principal o una individual  para la realizacion de las  operaciones actuales

Scenario: realizar la busqueda de riesgo de poliza individual y validar que los resultados son correctos
GivenStories: stories/policycenter/login_policy.story
Given que voy a la busqueda de riesgos
When este buscando un riesgo por los filtros producto y placa del vehiculo
| producto | placa  |
| Autos    | BLE860 |
Then debo ver la informacion de los riesgos asociados
| placa  |
| BLE860 |

Examples:
|  |
|  |

Scenario: realizar la busqueda de riesgo de poliza colectiva y validar que los resultados son correctos
Given que voy a la busqueda de riesgos
When este buscando un riesgo por los filtros producto y placa del vehiculo
| producto | placa  |
| Autos    | BLE860 |
Then debo ver la informacion de los riesgos asociados
| placa  |
| BLE860 |

Scenario: realizar la busqueda de riesgo de poliza colectiva que no tiene poliza principal, validando que no debe mostrar datos
Given que voy a la busqueda de riesgos
When este buscando un riesgo por los filtros producto y placa del vehiculo
| producto | placa  |
| Autos    | BLE860 |
Then debe mostrar el mensaje <mensaje> ---

Examples:
|mensaje|
|La búsqueda no devolvió resultados.|