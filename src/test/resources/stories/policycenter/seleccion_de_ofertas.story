Meta:

Narrative:
As a user
I want to perform an action
So that I can achieve a business goal

Scenario: Opcion ofertas del menu ocultas
GivenStories: stories/policycenter/login_policy.story
Given inicio una nueva cotizacion
When ingrese la cuenta <cuenta>, organizacion <organizacion> y agente <agente>
And seleccione la linea de negocio de autos
Then no debe mostrar el menu vertical <menu>

Examples:
|cuenta|organizacion|agente|menu|
|C000888888|oficina bogota|100-002541|ofertas|