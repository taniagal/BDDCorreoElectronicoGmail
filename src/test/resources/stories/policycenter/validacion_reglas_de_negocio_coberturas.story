Meta:

@issue #SUGWUSC-11480
@tag automator: Jonathan_Mejia_Leon
@local
@Sprint 5

Narrative:
Como usuario de policy center
quiero ser capaz de parametrizar diferentes reglas de negocio para
algunas coberturas de multiriesgo corporativo.

Scenario: Validacion regla de negocio cuando el valor es mayor al 10%
GivenStories: stories/policycenter/login_policy.story
Given Que tengo una cotizacion <cotizacion> y voy a crear una poliza
When quiera mostrar los edificios y ubicaciones
Then se debe mostrar un mensaje <mensaje> de advertencia y pasar a la siguinete pagina

Examples:
|cotizacion |mensaje|
|11111335   |del valor asegurable total de todos los artículos de la póliza|


Scenario: Validacion regla de negocio cuando el valor es mayor al 10%
Given Que tengo una cotizacion <cotizacion> y voy a crear una poliza
When quiera mostrar los edificios y ubicaciones
Then debe pasar a la siguinete pagina sin mostrar mensajes

Examples:
|cotizacion |
|11111334   |

Scenario: Modificar una cotizacion cuando el valor es mayor al 10%
Meta: @manual
Given Que tengo una cotizacion <cotizacion> y voy a crear una poliza
When quiera mostrar los edificios y ubicaciones
Then debe pasar a la siguinete pagina sin mostrar mensajes

Examples:
||
||



