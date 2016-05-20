Meta:

Narrative:
Como usuario PolicyCenter
quiero ser capaz de actualizar el estado de las cotizaciones creadas para una cuenta
y así poder crear, actualizar, copiar y retirar cotizaciones para una cuenta dada.

Scenario: Cambiar el estado de una cotizacion
GivenStories: stories/policycenter/login_policy.story
Given estoy en una cuenta <numCuenta>
When ingreso a cotizaciones de la cuenta
Then me debe permitir cambiar el estado de acuerdo a la lista definida. Lista definida: Declinada, No Tomada

Examples:
|numeroCuenta|rechazar|noTomar |
|C000888888  |Rechazar|No Tomar|


Scenario: Cambiar el estado de una cotizacion
GivenStories: stories/policycenter/login_policy.story
Given que existe la cuenta <numeroCuenta>
When ingrese a administrador de envios
Then me debe permitir cambiar el estado de acuerdo a la lista definida. Lista definida: Declinada, No Tomada

Examples:
|numeroCuenta|declinada|noTomada |
|C000888888  |Declinada|No Tomada|




