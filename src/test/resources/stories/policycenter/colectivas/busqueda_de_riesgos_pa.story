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
| placa  |tipoPoliza|
| BLE860 |Individual|
And cuando vaya a ver los detalles de la placa debo ver la informacion del vehiculo

Examples:
|  |
|  |

Scenario: validar la informacion de la poliza individual asociada a la placa
GivenStories: stories/policycenter/login_policy.story
Given que voy a la busqueda de riesgos
When este buscando un riesgo por los filtros producto y placa del vehiculo
| producto | placa  |
| Autos    | BLE860 |
When quiera ver la informacion de la poliza
Then debo poder ver el resumen de la poliza individual

Scenario: realizar la busqueda de riesgo de poliza colectiva, validar que los resultados son correctos y el link de la placa
Given que voy a la busqueda de riesgos
When este buscando un riesgo por los filtros producto y placa del vehiculo
| producto | placa  |
| Autos    | BLE600 |
Then debo ver la informacion de los riesgos asociados
| placa  |
| BLE600 |
And cuando vaya a ver los detalles de la placa debo ver la informacion de la poliza riesgo

Scenario: validar la informacion de la poliza colectiva asociada a la placa
GivenStories: stories/policycenter/login_policy.story
Given que voy a la busqueda de riesgos
When este buscando un riesgo por los filtros producto y placa del vehiculo
| producto | placa  |
| Autos    | BLE600 |
When quiera ver la informacion de la poliza
Then debo poder ver el resumen de la poliza colectiva

Scenario: realizar la busqueda de riesgo de poliza colectiva que no tiene poliza principal, validando que no debe mostrar datos
Given que voy a la busqueda de riesgos
When este buscando un riesgo por los filtros producto y placa del vehiculo
| producto | placa  |
| Autos    | BLE600 |
Then debe mostrar el mensaje <mensaje> ---

Examples:
|mensaje|
|La búsqueda no devolvió resultados.|

Scenario: validar que solamente se muestra la poliza en el ultimo estado