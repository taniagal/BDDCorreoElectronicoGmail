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

Scenario: Consultar el valor total de un grupo de cotizaciones
GivenStories: stories/policycenter/login_policy.story
Given busco una cuenta existente como <numeroCuenta>
When busque el de detalle de los registros de suscripcion
Then debo ver el costo total <total> para las cotizaciones en estado cotizado

Examples:
|numeroCuenta|total|
|C001888888|-|

Scenario: Consultar numero de cotizaciones del grupo
GivenStories: stories/policycenter/login_policy.story
Given busco una cuenta existente como <numeroCuenta>
When busque el de detalle de los registros de suscripcion
Then debo ver la sumatoria <suma> de todas las cotizaciones y renovaciones independiente de su estado

Examples:
|numeroCuenta|suma|
|C001888888|-|