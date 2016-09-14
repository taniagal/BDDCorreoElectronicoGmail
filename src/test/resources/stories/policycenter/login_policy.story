Meta:
@local

Narrative:
Como un usuario de PolicyCenter con el rol de suscriptor, agente o CSR
Quiero ser capaz de autenticarme
Asi desplegar la pagina de inicio correspondiente

Scenario: autenticacion en Policy Centrer - Seus
Given el usuario ingresa a la pagina de autenticacion de PolicyCenter - Seus
When el usuario ingresa pais <country>, username <usr> y password <pass>
Then el usuario deberia ver la pagina de inicio correspondiente a su rol <message>

Examples:
|country|usr|pass|message|
|Colombia|pedrvevi|pedrvevi|Mis actividades|