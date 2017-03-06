Meta:
@lote 1
@tag equipo: 1, sprint 15

Narrative:
Usuario de policy center
Quiero poder buscar un agente por codigo y/o descripcion
Para consultar la informacion correspondiente a un asesor

Scenario: validar campos ocultos la busqueda por codigo de agente
GivenStories: stories/policycenter/login_policy.story
Given estoy en la busqueda de agentes
When valide los campos de la pantalla
And ingrese un codigo de agente <agente>
Then debo ver la informacion del agente a continuacion
| codigoAgente | descripcion | estado | organizacion | codigoSucursal | sucursal |
| 4999         |             |        |              |                |          |

Examples:
|  |
|  |