Meta:

Narrative:
Como usuario
Quiero ser capaz de ver la informacion de nivel de contacto
para obtener información de órdenes de trabajo

Scenario: Ver informacion de las transacciones asociadas al cuenta
GivenStories: stories/policycenter/login_policy.story
Given Estoy buscando una cuenta <numCuenta>
When consulte las transacciones de poliza por estado <filtroEstado>
Then debe mostrarme el listado de transacciones con su respectiva informacion: numero de poliza <poliza>, producto <producto>, transaccion <transaccion>, tipo <tipo>, estado <estado>, participante <participante>

Examples:
|numCuenta|filtroEstado|producto|transaccion|tipo|estado|participante
|C010478975|Completo|Businessowners|22222223|Emisión|Expedida|Super User


Scenario: Ver informacion de transacciones sin registros
Given Estoy buscando una cuenta <numCuenta>
When consulte las transacciones de poliza y no encuentre registros
Then se muestra el mensaje informativo de transaccionde poliza no encontrada <mensaje>

Examples:
|numCuenta|mensaje|
|C000777778|No tiene transacciones asociadas|

Scenario: Ver informacion filtrada por estado
Given Estoy buscando una cuenta <numCuenta>
When consulte las transacciones de poliza por estado <filtroEstado>
Then debe mostrarme el listado de transacciones filtradas por estado <filtroEstado>

Examples:
|numCuenta|filtroEstado|estado
|C010478975|Abierto|Cambio de póliza


Scenario: Ver informacion filtrada por tipo de transaccion
Given Estoy buscando una cuenta <numCuenta>
When consulte las transacciones de poliza por estado <filtroEstado>
And consulte las transacciones de poliza por tipo de transaccion <filtroTransaccion>
Then debe mostrarme el listado de transacciones filtradas por tipo de transaccion <filtroTransaccion>

Examples:
|numCuenta|filtroEstado|filtroTransaccion
|C010478975|Todos|Emisión

Scenario: Ver informacion filtrada por producto
Given Estoy buscando una cuenta <numCuenta>
When consulte las transacciones de poliza por estado <filtroEstado>
And consulte las transacciones de poliza por tipo de transaccion <filtroTransaccion>
And consulte las transacciones de poliza por tipo de producto <filtroProducto>
Then debe mostrarme el listado de transacciones filtradas por tipo de transaccion <filtroProducto>

Examples:
|numCuenta|filtroEstado||filtroTransaccion|filtroProducto
|C010478975|Todos||Todos|Businessowners


