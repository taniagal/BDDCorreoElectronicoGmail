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

Scenario: Cotizacion y validacion que no se permite agregar mas de un vehiculo
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza basado en otro envio <envio>
When ingrese al detalle de la cotizacion
|envio   |ciudad_circulacion|limite|deducible|abogado |PLlaves |modelo|
|22228589|MEDELLIN          |1.440 |0        |Opción 1|Opción 1|2016  |
Then se debe mostrar en la columna "Termino" el limite o deducible de la cobertura en el caso de que aplique
And se debe mostrar en la columna "Termino" el limite de la cobertura en el caso de que aplique
And se debe mostrar en la columna "Termino" el deducible de la cobertura en el caso de que aplique
Examples:
|envio   |
|22228589|
