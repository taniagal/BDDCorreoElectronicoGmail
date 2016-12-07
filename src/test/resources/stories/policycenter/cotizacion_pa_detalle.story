Cotizacion PA Detalle

Meta: @lote3

@issue #CDSEG-807
@tag automator: diego_cardona_acevedo
@local
@Sprint 3

Narrative:
Como usuario de policyCenter
Quiero poder solicitar una cotizacion
Asi ver los detalles de la cotizacion de una poliza de Autos por cada uno de los Riesgos (Vehiculos)

Scenario: Quote
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza basado en otro envio:
|envio   |ciudad_circulacion|limite|deducible|abogado |PLlaves |
|22228589|MEDELLIN          |1.440 |0        |Opción 1|Opción 1|
When ingrese al detalle de la cotizacion
Then se debe mostrar la informacion del detalle de cotizacion por riesgo

Examples:
||
||
