Meta:

Narrative:
Como usuario PolicyCenter
quiero ser capaz de buscar cotizaciones y renovaciones de una cuenta
para ver el detalle de las mismas

Scenario: Consultar el detalle de los grupos de cotización y renovación
GivenStories: stories/policycenter/login_policy.story
Given busco una cuenta existente como <numeroCuenta>
When busque el de detalle de los registros de suscripcion
Then debo ver la siguiente informacion

Examples:
|numeroCuenta|
|C001888888|