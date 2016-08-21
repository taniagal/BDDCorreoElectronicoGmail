Detalle Registros Suscripcion

Meta:

@issue #SUGWUSC-14959

Narrative:
Como usuario PolicyCenter
quiero ser capaz de buscar cotizaciones y renovaciones de una cuenta
para ver el detalle de las mismas

Scenario: Consultar los registros de suscripcion
GivenStories: stories/policycenter/login_policy.story
Given busco una cuenta existente como <numeroCuenta>
When consulte los registros de suscripcion
Then debo ver la informacion del registro de suscripcion <nombre>, <tipoDeTransaccion>, <nroDeTransacciones>

Examples:
|numeroCuenta|nombre|tipoDeTransaccion|nroDeTransacciones|
|C000902244|SG22222227|Grupo de envíos|1|

Scenario: Campos ocultos o modificados en registros de suscripcion
Given busco una cuenta existente como <numeroCuenta>
When consulte los registros de suscripcion
Then los filtros deben ser <estado>, <transaccion>

Examples:
|numeroCuenta|estado|transaccion|
|C000902244|Estado|Transacción|

Scenario: Consultar el detalle de los grupos de cotizacion y renovación
Given busco una cuenta existente como <numeroCuenta>
When busque el de detalle de los registros de suscripcion
Then debo ver la informacion del registro de suscripcion producto <producto>, <nroEnvio>, <estado>, <nroPoliza>

Examples:
|numeroCuenta|producto|nroEnvio|estado|nroPoliza|
|C000902244|Autos|22222227|Cotizado|Sin asignar|

Scenario: Consultar el valor total de un grupo de cotizaciones
Given busco una cuenta existente como <numeroCuenta>
When busque el de detalle de los registros de suscripcion
Then debo ver el costo total <total> para las cotizaciones en estado cotizado

Examples:
|numeroCuenta|total|
|C000902244|$666.895,00 (COP)|

Scenario: Consultar numero de cotizaciones del grupo
Given busco una cuenta existente como <numeroCuenta>
When busque el de detalle de los registros de suscripcion
Then debo ver la sumatoria <suma> de todas las cotizaciones y renovaciones independiente de su estado

Examples:
|numeroCuenta|suma|
|C000902244|1|

Scenario: Campos ocultos o modificados en detalle de suscripciones
Given busco una cuenta existente como <numeroCuenta>
When busque el de detalle de los registros de suscripcion
Then no debe mostrar el menu analisis de riesgo
And no debe mostrar el menu actividades
And en la sumatoria de cotizaciones me debe mostrar el titulo de <titulo>

Examples:
|numeroCuenta|titulo|
|C000902244|N.° de cotizaciones|


