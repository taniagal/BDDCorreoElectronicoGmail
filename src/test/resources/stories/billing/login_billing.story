Meta:

Narrative:
Como un usuario de BillingCenter con el rol de SuperUsuario
Quiero ser capaz de autenticarme en la aplicacion
Asi desplegar la pagina de inicio correspondiente

Scenario: autenticacion en BillingCenter
Given estoy en la pagina de autenticacion de BillingCenter
When ingrese username <usr> y password <pass>
Then deberia ingresar al sistema y ver el mensaje <message>
Then el usuario deberia poder acceder a la administracion de <message2>
Then el usuario deberia cerrar sesion

Examples:
|usr|pass|message|message2|
|su|gw|Búsqueda de usuario|Días festivos|