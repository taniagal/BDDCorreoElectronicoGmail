Detalle Registros Suscripcion

Meta:
@lote3
@issue #SUGWUSC-14959
@tag automator: Eliana_Alvarez

Narrative:
Como usuario PolicyCenter
quiero ser capaz de buscar cotizaciones y renovaciones de una cuenta
para ver el detalle de las mismas

Scenario: Consultar los registros de suscripcion
GivenStories: stories/policycenter/login_policy.story
Given que voy a buscar la cuenta <numCuenta>
When consulte los registros de suscripcion
Then debo ver la informacion del registro de suscripcion <nombre>, <tipoDeTransaccion>, <nroDeTransacciones>
And los filtros deben ser <estado>, <transaccion>

Examples:
| numCuenta  | nombre     | tipoDeTransaccion | nroDeTransacciones | estado | transaccion |
| C001888888 | SG22222214 | Grupo de envíos   | 17                 | Estado | Transacción |

Scenario: Consultar el detalle de los grupos de cotizacion y renovación
Given que voy a buscar la cuenta <numCuenta>
When busque el de detalle de los registros de suscripcion
Then debo ver el costo total <total> para las cotizaciones en estado cotizado
And debo ver la sumatoria <suma> de todas las cotizaciones y renovaciones independiente de su estado
And debo ver la informacion del registro de suscripcion producto <producto>, <nroEnvio>, <estado>, <nroPoliza>

Examples:
| numCuenta  | producto | nroEnvio | estado   | nroPoliza       |total              |suma   |
| C001888888 | Autos    | 22222222 | Expedida | TEST_22222222   |$1.664.659,00 (COP)|5      |

Scenario: Campos ocultos o modificados en detalle de suscripciones
Given que voy a buscar la cuenta <numCuenta>
When busque el de detalle de los registros de suscripcion
Then no debe mostrar el menu analisis de riesgo
And no debe mostrar el menu actividades
And en la sumatoria de cotizaciones me debe mostrar el titulo de <titulo>

Examples:
| numCuenta  | titulo              |
| C001888888 | N.° de cotizaciones |
