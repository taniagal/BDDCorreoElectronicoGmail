Meta:
@lote2
@tag equipo: 1
@Sprint 2

Narrative:
Como usuario de Policy Center
debo poder seleccionar ofertas de una linea en caso de que existan
para poder realizar una cotizacion sobre la misma

Scenario: Opcion ofertas del menu ocultas
GivenStories: stories/policycenter/login_policy.story
Given inicio una nueva cotizacion
When ingrese la cuenta <cuenta>
And seleccione el agente y la oficina de radicacion:
| agente_oficina | oficina |
| DIRECTO        | 1105    |
And seleccione el producto <producto> para expedir la poliza
When quiera seleccionar una oferta
Then no debe mostrar el menu vertical

Examples:
| cuenta     | producto |
| C000888888 | Autos    |