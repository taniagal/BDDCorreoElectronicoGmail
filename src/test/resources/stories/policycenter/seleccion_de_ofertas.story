Seleccion De Ofertas

Meta:

@issue CDSEG-1023
@tag automator: eliana_alvarez, sprint:2
@Sprint 2

Narrative:
Como usuario de Policy Center
debo poder seleccionar ofertas de una linea en caso de que existan
para poder realizar una cotizacion sobre la misma

Scenario: Opcion ofertas del menu ocultas
GivenStories: stories/policycenter/login_policy.story
Given inicio una nueva cotizacion
When ingrese la cuenta <cuenta>
And seleccione el agente <agente>
And seleccione la organizacion <organizacion>
And seleccione el canal <canal>
And seleccione el producto <producto> para expedir la poliza
Then no debe mostrar el menu vertical <menu>

Examples:
| cuenta     | agente  | organizacion | canal             | producto | menu    |
| C000888888 | DIRECTO | Sura         | Canal Tradicional | Autos    | ofertas |