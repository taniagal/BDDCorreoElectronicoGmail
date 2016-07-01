Meta:
Narrative:
Como un usuario de ClaimsCenter con el rol de SuperUsuario
Quiero poder crear una reclamación

Scenario: Crear reclamacion en ClaimsCenter

GivenStories: stories/claims/login.story
When cuando ingrese a la pantalla de reclamacion
When ingrese los datos necesarios <npoliza>

Examples:
|npoliza  |mensaje                   |
|54-253465|Nueva reclamación guardada|
