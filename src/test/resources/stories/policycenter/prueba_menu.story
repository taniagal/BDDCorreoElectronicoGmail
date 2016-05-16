Meta:
Narrative:
Como un usuario de PolicyCenter con el rol de suscriptor, agente o CSR
Quiero ser capaz de autenticarme
Asi desplegar la pagina de inicio correspondiente y navegar por los menus disponibles

Scenario: navegacion menu policycenter
Meta: @tag prueba:menu
Given ingreso a la pagina de autenticacion de PolicyCenter
When ingreso username <usr> y password <pass>
Then deberia ver la pagina de inicio correspondiente a su rol <message>
Then deberia navegar por todos los menu
Then deberia cerrar sesion

Examples:
|usr|pass|message|
|su|gw|Mis actividades|