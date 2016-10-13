Meta:

@issue #CDSEG-914
@tag automator: diego_cardona_acevedo
@Sprint 8

Narrative:
Como usuario de  policy center con el perfil X
Quiero ser capaz de actualizar  o realizar modificaciones de datos de una poliza en el proceso de renovacion de una poliza

Scenario: adicionar segundo tomador - Policy info
Given estoy editando la renovacion de una poliza <cotizacion>
When desee adicionar un segundo tomador
Then debo poder adicionar un segundo tomador

Examples:
|cotizacion |
|           |