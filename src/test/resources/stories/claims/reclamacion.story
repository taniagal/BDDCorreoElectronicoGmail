Meta:

Narrative:
Como un usuario de ClaimsCenter con el rol de SuperUsuario
Quiero poder crear una reclamación

Scenario: Crear reclamacion en ClaimsCenter
Given estoy logeado en ClaimsCenter
When cuando ingrese a la pantalla de relamacion
And ingrese los datos necesarios
Then deberia poder crear una reclamacion

Examples:
|usr|pass|
|su|gw|