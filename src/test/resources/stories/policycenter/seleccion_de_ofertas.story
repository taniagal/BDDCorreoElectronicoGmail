Seleccion De Ofertas

Meta: @lote4

@issue CDSEG-1023
@tag automator: eliana_alvarez, sprint:2
@Sprint 2

Narrative:
Como usuario de Policy Center
debo poder seleccionar ofertas de una linea en caso de que existan
para poder realizar una cotizacion sobre la misma

Scenario: Opcion ofertas del menu ocultas
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza:
|cuenta    |organizacion|producto|canal            |
|C000888888|Sura        |Autos   |Canal Tradicional|
When quiera seleccionar una oferta
Then no debe mostrar el menu vertical

Examples:
||
||