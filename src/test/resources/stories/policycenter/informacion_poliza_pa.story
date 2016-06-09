Informacion Poliza - PA

Meta:

Narrative:
Como usuario de PolicyCenter
Quiero ser capaz de ingresar y visualizar la informacion de la poliza incluyendo el nombre tomador,
incluir un segundo tomador, vigencia de la poliza y la informacion de asesor

@Issue 10900 Policy Info - PA

Scenario: Visualizacion de los datos de la poliza
GivenStories: stories/policycenter/login_policy.story
Given ya se inicio una nueva suscripcion <numeroCuenta>
When estoy expidiendo una poliza de autos
Then se debe visalizar los datos del tomador, como son: tipo y numero de identificacion, nombre completo,
telefono, dirección, vigencia de la poliza (valor por defecto), nombre del agente, fecha de suscripción y
nombre de la compania aseguradora

Examples:
|numeroCuenta  |
|C000888888    |