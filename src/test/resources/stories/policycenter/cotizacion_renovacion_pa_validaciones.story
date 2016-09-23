Cotizacion Renovacion Pa Validaciones

Meta:

@issue #CDSEG-2295
@tag automator: diego_cardona_acevedo
@local
@Sprint 7

Narrative:
Como usuario de policy center  con el perfil  X
Quiero poder realizar la cotizacion de la renovacion de una poliza de personal autos ya sea de forma manual o automatica

Scenario: Quote - Riesgos Consultables - Figuras Tomador, Asegurado y Beneficiario
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando la renovacion de la poliza <cotizacion>
When cotice con algunas de las figuras que som Riesgo consultable bloqueante
Then se debe bloquear la cotizacion y mostrar el mensaje que devuelve el servicio

Examples:
|cotizacion |
|32112330   |