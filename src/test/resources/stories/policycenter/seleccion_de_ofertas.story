Meta:

Narrative:
Como usuario de Policy Center
debo poder seleccionar ofertas de una linea en caso de que existan
para poder realizar una cotizacion sobre la misma

Scenario: Opcion ofertas del menu ocultas
GivenStories: stories/policycenter/login_policy.story
Given inicio una nueva cotizacion
When ingrese la cuenta <cuenta>, organizacion <organizacion> y agente <agente>
And seleccione la linea de negocio de autos
Then no debe mostrar el menu vertical <menu>

Examples:
|cuenta|organizacion|agente|menu|
|C000888888|oficina bogota|100-002541|ofertas|