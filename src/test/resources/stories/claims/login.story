Meta:

Narrative:
Como un usuario de ClaimsCenter con el rol de SuperUsuario
Quiero ser capaz de autenticarme en la aplicacion
Asi desplegar la pagina de inicio correspondiente

Scenario: autenticacion en ClaimsCenter
Given estoy en la pagina de autenticacion de ClaimsCenter
When ingrese username <usr> y password <pass>
Then deberia ingresar al sistema y ver el mensaje <message>

Examples:
|usr|pass|message|
|su|gw|Actividades|