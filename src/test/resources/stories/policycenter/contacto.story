Meta:

Narrative:
Como un usuario de PolicyCenter con el rol de suscriptor, agente o CSR
Quiero ser capaz de autenticarme
Asi desplegar la pagina de inicio correspondiente

Scenario: autenticacion en policycenter
GivenStories: stories/policycenter/login_policy.story
Then el usuario deberia poder acceder a nuevo contacto persona
Then el usuario deberia cerrar sesion

Examples:
|message|
|Mis actividades|