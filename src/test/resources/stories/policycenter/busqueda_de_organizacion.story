Busqueda de Organizacion

Meta:

Narrative:
Como usuario PolicyCenter
quiero ser capaz de buscar la organizacion SURA una vez es realizada la
importación de los datos desde el sample data sura

Scenario: campos de la busqueda de organizacion SURA
GivenStories: stories/policycenter/login_policy.story
Given que me encuentro en la pantalla de organizaciones
When ingreso el campo razon social <organizacion>
Then me debe mostrar el registro asociado <organizacion>

Examples:
| organizacion |
| SURA         |


