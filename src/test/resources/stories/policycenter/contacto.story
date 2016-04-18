Meta:

Narrative:
Como un usuario de PolicyCenter con el rol de suscriptor, agente o CSR
Quiero ser capaz de autenticarme
Asi desplegar la pagina de inicio correspondiente

Scenario: autenticacion en policycenter
Given el usuario ingresa a la pagina de autenticacion de PolicyCenter
When el usuario ingresa username <usr> y password <pass>
Then el usuario deberia ver la pagina de inicio correspondiente a su rol <message>
Then el usuario deberia poder acceder a nuevo contacto persona
Then el usuario deberia cerrar sesion

Examples:
|usr|pass|message|
|su|gw|Mis actividades|