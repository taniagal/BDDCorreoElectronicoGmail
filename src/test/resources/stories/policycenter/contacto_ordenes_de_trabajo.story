Meta:

Narrative:
Como usuario
Quiero ser capaz de ver la informacion de nivel de contacto
para obtener información de órdenes de trabajo

Scenario: Ver informacion de las transacciones asociadas al contacto
Given que me encuentro autenticado con pais <pais>, username <usr> y password <pass>
And consulte  un contacto del tipo <tipoContacto> con transacciones como: <nombre> <apellido>
When consulte las transacciones por estado <filtroEstado>
Then debe mostrarme el listado de transacciones con su respectiva informacion: producto <producto> Transaccion <transaccion> Tipo <tipo> Status <estado> Participante <participante>

Examples:
|pais|usr|pass|tipoContacto|nombre|apellido|filtroEstado|producto|transaccion|tipo|estado|participante
|Colombia|pedrvevi|pedrvevi|Empresa|Earth Tech||Completo|Businessowners|467653123|Emisión|Comprometida|Christine Craft

Scenario: Ver informacion de transacciones sin registros
Given consulte  un contacto del tipo <tipoContacto> con transacciones como: <nombre> <apellido>
When consulte las transacciones y no encuentre registros
Then se muestra el mensaje informativo de transaccion no encontrada <mensaje>

Examples:
|pais|usr|pass|tipoContacto|nombre|apellido|mensaje
|Colombia|pedrvevi|pedrvevi|Personal|Jane|Collins|El contacto no tiene transacciones asociadas

Scenario: Ver informacion filtrada por estado
Given consulte  un contacto del tipo <tipoContacto> con transacciones como: <nombre> <apellido>
When consulte las transacciones por estado <filtroEstado>
Then debe mostrarme el listado de transacciones filtradas por estado <filtroEstado>

Examples:
|pais|usr|pass|tipoContacto|nombre|apellido|filtroEstado|estado
|Colombia|pedrvevi|pedrvevi|Empresa|Earth Tech||Completo

Scenario: Ver informacion filtrada por tipo de transaccion
Given consulte  un contacto del tipo <tipoContacto> con transacciones como: <nombre> <apellido> y seleccione el registro <numero>
When consulte las transacciones por estado <filtroEstado>
And consulte las transacciones por tipo de transaccion <filtroTransaccion>
Then debe mostrarme el listado de transacciones filtradas por tipo de transaccion <filtroTransaccion>

Examples:
|pais|usr|pass|tipoContacto|nombre|apellido|numero|filtroEstado|filtroTransaccion
|Colombia|pedrvevi|pedrvevi|Empresa|Wright Construction||2|Todos|Emisión

Scenario: Ver informacion filtrada por producto
Given consulte  un contacto del tipo <tipoContacto> con transacciones como: <nombre> <apellido> y seleccione el registro <numero>
When consulte las transacciones por estado <filtroEstado>
And consulte las transacciones por tipo de transaccion <filtroTransaccion>
And consulte las transacciones por tipo de transaccion <filtroProducto>
Then debe mostrarme el listado de transacciones filtradas por tipo de transaccion <filtroProducto>

Examples:
|pais|usr|pass|tipoContacto|nombre|apellido|numero|filtroEstado|filtroTransaccion|filtroProducto
|Colombia|pedrvevi|pedrvevi|Empresa|Wright Construction||2|Todos|Todos|Auto comercial
