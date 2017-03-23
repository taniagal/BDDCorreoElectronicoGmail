Meta:
@tag equipo: 2, sprint: 7
@lote3

Scenario: Validaciones como precondicion en la realizacion de una nueva cotizacion
GivenStories: stories/policycenter/login_policy.story
When comience una nueva cotizacion con cuenta <cuenta> y agente <agente>
Then debo poder ver la fecha efectiva de la cotizacion

Examples:
|cuenta    |agente |
|C000888888|DIRECTO|