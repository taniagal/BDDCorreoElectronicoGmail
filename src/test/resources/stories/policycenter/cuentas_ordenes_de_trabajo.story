Cuentas Ordenes De Trabajo

Meta: @lote2

@issue #CDSEG-967
@tag automator:andres_alarcon_guerrero, informer:pablo_armando_gonzales_restrepo, sprint:1
@Sprint 1
@local

Narrative:
Como usuario de Policy Center
Quiero ser capaz de consultar las transacciones de una cuenta
para obtener información de las transacciones asociadas a la misma


Scenario: Ver informacion de las transacciones asociadas al cuenta
GivenStories: stories/policycenter/login_policy.story
Given que voy a buscar la cuenta <numCuenta>
When consulte las transacciones de poliza por estado <filtroEstado>
Then debe mostrarme el listado de transacciones con su respectiva informacion: numero de poliza <poliza>, producto <producto>, transaccion <transaccion>, tipo <tipo>, estado <estado>, participante <participante>

Examples:
| numCuenta  | filtroEstado | poliza        | producto | transaccion | tipo       | estado   | participante |
| C001888888 | Completo     | TEST_22222222 | Autos    | 22222222    | Cotización | Expedida | Super User   |


Scenario: Ver informacion de transacciones sin registros
Given que voy a buscar la cuenta <numCuenta>
When consulte las transacciones de poliza y no encuentre registros
Then se muestra el mensaje informativo de transaccionde poliza no encontrada <mensaje>

Examples:
| numCuenta  | mensaje                          |
| C000484848 | No tiene transacciones asociadas |

Scenario: Ver informacion filtrada por estado
Given que voy a buscar la cuenta <numCuenta>
When consulte las transacciones de poliza por estado <filtroEstado>
Then debe mostrarme el listado de transacciones filtradas por estado <filtroEstado>

Examples:
| numCuenta  | filtroEstado |
| C001888888 | Abierto      |

Scenario: Ver informacion filtrada por tipo de transaccion
Given que voy a buscar la cuenta <numCuenta>
When consulte las transacciones de poliza por estado <filtroEstado>
And consulte las transacciones de poliza por tipo de transaccion <filtroTransaccion>
Then debe mostrarme el listado de transacciones filtradas por tipo de transaccion <filtroTransaccion>

Examples:
| numCuenta  | filtroEstado | filtroTransaccion |
| C001888888 | Todos        | Cotización        |

Scenario: Ver informacion filtrada por producto
Given que voy a buscar la cuenta <numCuenta>
When consulte las transacciones de poliza por estado <filtroEstado>
And consulte las transacciones de poliza por tipo de transaccion <filtroTransaccion>
And consulte las transacciones de poliza por tipo de producto <filtroProducto>
Then debe mostrarme el listado de transacciones filtradas por tipo de transaccion <filtroProducto>

Examples:
| numCuenta  | filtroEstado | filtroTransaccion | filtroProducto |
| C001888888 | Todos        | Todos             | Autos          |