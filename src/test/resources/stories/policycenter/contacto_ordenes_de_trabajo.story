Meta:

Narrative:
Como usuario
Quiero ser capaz de ver la informacion de nivel de contacto
para obtener información de órdenes de trabajo

Scenario: Ver informacion de las transacciones asociadas al contacto
GivenStories: stories/policycenter/login_policy.story
Given que voy a consultar un contacto
And consulte  un contacto del tipo <tipoContacto> con transacciones como: <razonSocial>
When consulte las transacciones por estado <filtroEstado>
Then debe mostrarme el listado de transacciones con su respectiva informacion: producto <producto> Transaccion <transaccion> Tipo <tipo> Status <estado> Participante <participante>

Examples:
|tipoContacto|razonSocial|filtroEstado|producto|transaccion|tipo|estado|participante
|NIT|VARIEDADES YURLEDYS|Completo|Businessowners|467653123|Emisión|Comprometida|Christine Craft

Scenario: Ver informacion de transacciones sin registros
Given que voy a consultar un contacto
And consulte  un contacto del tipo <tipoContacto> con transacciones como: <nombre> <apellido>
When consulte las transacciones y no encuentre registros
Then se muestra el mensaje informativo de transaccion no encontrada <mensaje>

Examples:
|tipoContacto|nombre|apellido|mensaje
|CEDULA DE CIUDADANIA|YURLEDYS|GALLEGO|El contacto no tiene transacciones asociadas

Scenario: Ver informacion filtrada por estado
Given que voy a consultar un contacto
And consulte  un contacto del tipo <tipoContacto> con transacciones como: <razonSocial>
When consulte las transacciones por estado <filtroEstado>
Then debe mostrarme el listado de transacciones filtradas por estado <filtroEstado>

Examples:
|tipoContacto|razonSocial|filtroEstado|estado
|NIT|VARIEDADES YURLEDYS||Completo

Scenario: Ver informacion filtrada por tipo de transaccion
Given que voy a consultar un contacto
And consulte  un contacto del tipo <tipoContacto> con transacciones como: <nombre> <apellido> y seleccione el registro <numero>
When consulte las transacciones por estado <filtroEstado>
And consulte las transacciones por tipo de transaccion <filtroTransaccion>
Then debe mostrarme el listado de transacciones filtradas por tipo de transaccion <filtroTransaccion>

Examples:
|tipoContacto|nombre|apellido|numero|filtroEstado|filtroTransaccion
|NIT|VARIEDADES YURLEDYS||1|Todos|Emisión

Scenario: Ver informacion filtrada por producto
Given que voy a consultar un contacto
And consulte  un contacto del tipo <tipoContacto> con transacciones como: <nombre> <apellido> y seleccione el registro <numero>
When consulte las transacciones por estado <filtroEstado>
And consulte las transacciones por tipo de transaccion <filtroTransaccion>
And consulte las transacciones por tipo de transaccion <filtroProducto>
Then debe mostrarme el listado de transacciones filtradas por tipo de transaccion <filtroProducto>

Examples:
|tipoContacto|nombre|apellido|numero|filtroEstado|filtroTransaccion|filtroProducto
|NIT|VARIEDADES YURLEDYS||1|Todos|Todos|Auto comercial