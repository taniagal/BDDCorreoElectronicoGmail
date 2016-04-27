Meta:
Narrative:
Como un usuario de ClaimsCenter con el rol de SuperUsuario
Quiero poder buscar una reclamación por la opcion avanzada

Scenario: buscar reclamacion en ClaimsCenter

Given abro la aplicacion
Given me logeo en ClaimsCenter <usr> <pass>
When cuando ingrese a la opcion de busqueda avanzada
When ingrese los datos de poliza <npoliza>
Then deberia buscar una reclamacion

Examples:
|usr|pass|npoliza|
|su|gw|54-253465|
