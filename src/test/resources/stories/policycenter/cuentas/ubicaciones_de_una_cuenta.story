Meta:
@lot6
@issue #SUGWUSC-14975
@tag equipo: 4


Narrative:
Como usuario de policyCenter
Quiero poder gestionar las locaciones de una cuenta en la pantalla de locaciones de una cuenta.

Scenario: Agregar nueva ubicacion a la cuenta
GivenStories: stories/policycenter/login_policy.story
Given que tengo una cuenta <cuenta>
When cuando agregue una nueva ubicacion nombre <nombre>, direccion <direccion>
And departamento <departamento>, ciudad <ciudad>, tipo de direccion <tipo_direccion>
Then debo poder ver el tipo de vivienda en el detalle de la ubicacion

Examples:
| cuenta     | tipo_direccion       | direccion         | departamento | ciudad   | nombre        |
| C001888888 | DIRECCION DE TRABAJO | CALLE 60B #10-157 | Antioquia    | Medellin | Location 0001 |