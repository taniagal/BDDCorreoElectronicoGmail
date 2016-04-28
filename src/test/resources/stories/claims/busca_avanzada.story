Meta:
Narrative:
Como un usuario de ClaimsCenter con el rol de SuperUsuario
Quiero poder buscar una reclamación por la opcion avanzada

Scenario: buscar reclamacion en ClaimsCenter

GivenStories: stories/claims/login.story
When cuando ingrese a la opcion de busqueda avanzada
When ingrese los datos de poliza <npoliza>
Then deberia buscar una reclamacion

Examples:
|npoliza  |
|54-253465|
