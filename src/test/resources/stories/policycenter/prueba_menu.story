Meta:
Narrative:
Como un usuario de PolicyCenter con el rol de suscriptor, agente o CSR
Quiero ser capaz de autenticarme
Asi desplegar la pagina de inicio correspondiente y navegar por los menus disponibles

Scenario: navegacion menu policycenter
Meta: @tag prueba:menu
Given el usuario ingresa a la pagina de autenticacion de PolicyCenter - Seus
When el usuario ingresa pais <country>, username <usr> y password <pass>
Then el usuario deberia ver la pagina de inicio correspondiente a su rol <message>
Then deberia navegar por todos los menu
Then deberia cerrar sesion

Examples:
|country|usr|pass|message|
|Colombia|pedrvevi|pedrvevi|Mis actividades|