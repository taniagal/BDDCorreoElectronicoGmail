Meta:

Narrative:
Como usuario
Quiero ser capaz de ver la informacion de nivel de contacto
para obtener información de órdenes de trabajo

Scenario: Ver informacion de las transacciones asociadas al contacto
GivenStories: stories/policycenter/login_policy.story
Given que voy a consultar un contacto
And consulte  un contacto del tipo <tipoContacto> con transacciones como: <nombre> <apellido>
When consulte las transacciones por estado <filtroEstado>
Then debe mostrarme el listado de transacciones con su respectiva informacion: numero de poliza <poliza>, producto <producto>, transaccion <transaccion>, tipo <tipo>, estado <estado>, participante <participante>

Examples:
|tipoContacto|nombre|apellido|filtroEstado|poliza|producto|transaccion|tipo|estado|participante
|Empresa|Variedades Yurledys||Completo|TEST_22222223|Businessowners|22222223|Emisión|Comprometida|Super User

Scenario: Ver informacion de transacciones sin registros
Given que voy a consultar un contacto
And consulte  un contacto del tipo <tipoContacto> con transacciones como: <nombre> <apellido>
When consulte las transacciones y no encuentre registros
Then se muestra el mensaje informativo de transaccion no encontrada <mensaje>

Examples:
|tipoContacto|nombre|apellido|mensaje
|Personal|Yurledys|Gallego|El contacto no tiene transacciones asociadas

Scenario: Ver informacion filtrada por estado
Given que voy a consultar un contacto
And consulte  un contacto del tipo <tipoContacto> con transacciones como: <nombre> <apellido>
When consulte las transacciones por estado <filtroEstado>
Then debe mostrarme el listado de transacciones filtradas por estado <filtroEstado>

Examples:
|tipoContacto|nombre|apellido|filtroEstado|estado
|Empresa|Variedades Yurledys||Completo

Scenario: Ver informacion filtrada por tipo de transaccion
Given que voy a consultar un contacto
And consulte  un contacto del tipo <tipoContacto> con transacciones como: <nombre> <apellido>
When consulte las transacciones por estado <filtroEstado>
And consulte las transacciones por tipo de transaccion <filtroTransaccion>
Then debe mostrarme el listado de transacciones filtradas por tipo de transaccion <filtroTransaccion>

Examples:
|tipoContacto|nombre|apellido|filtroEstado|filtroTransaccion
|Empresa|Variedades Yurledys||Todos|Emisión

Scenario: Ver informacion filtrada por producto
Given que voy a consultar un contacto
And consulte  un contacto del tipo <tipoContacto> con transacciones como: <nombre> <apellido>
When consulte las transacciones por estado <filtroEstado>
And consulte las transacciones por tipo de transaccion <filtroTransaccion>
And consulte las transacciones por tipo de transaccion <filtroProducto>
Then debe mostrarme el listado de transacciones filtradas por tipo de transaccion <filtroProducto>

Examples:
|tipoContacto|nombre|apellido|filtroEstado|filtroTransaccion|filtroProducto
|Personal|Dorian|Eastmond|Todos|Todos|Auto personal