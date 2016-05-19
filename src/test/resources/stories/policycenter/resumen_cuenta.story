Meta:

Narrative:
Como usuario PolicyCenter
Quiero poder ver el resumen de la cuenta de una persona juridica o natural, teniendo la posibilidad de editar dicha informacion

Scenario: Mostrar resumen de la cuenta de persona juridica
GivenStories: stories/policycenter/login_policy.story
Given estoy en una cuenta <numCuenta>
When ingrese al resumen de la cuenta
Then puedo visualizar el resumen de la cuenta seleccionada de tipo persona juridica, el listado de actividades, vigencias
de las polizas asociadas a la cuenta y transacciones pendientes de las polizas asociadas a la cuenta

Examples:
|numCuenta  |
|C010478975 |

Scenario: Mostrar resumen de la cuenta de persona natural
Given estoy en una cuenta <numCuenta>
When ingrese al resumen de la cuenta
Then puedo visualizar el resumen de la cuenta seleccionada de tipo persona natural, el listado de actividades, vigencias
de las polizas asociadas a la cuenta y transacciones pendientes de las polizas asociadas a la cuenta

Examples:
|numCuenta  |
|C000888888 |
