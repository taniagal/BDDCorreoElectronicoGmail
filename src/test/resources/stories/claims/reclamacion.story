Meta:
Narrative:
Como un usuario de ClaimsCenter con el rol de SuperUsuario
Quiero poder crear una reclamación

Scenario: Crear reclamacion en ClaimsCenter

Given abro la aplicacion
Given y me logeado en ClaimsCenter <usr> <pass>
When cuando ingrese a la pantalla de reclamacion
When ingrese los datos necesarios <poliza>
Then deberia poder crear una reclamacion

Examples:
|usr|pass|poliza|
|su|gw|54-253465|
