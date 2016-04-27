Meta:

Narrative:
Como usuario
Quiero ser capaz de ver la informacion de nivel de contacto
para obtener información de órdenes de trabajo

Scenario: Ver informacion de las transacciones asociadas al contacto
Given que me encuentro autenticado con pais <pais>, username <usr> y password <pass>
And consulte  un contacto con transacciones como: <nombre> <apellido>
When consulte las transacciones por estado <filtroEstado>
Then debe mostrarme el listado de transacciones con su respectiva informacion: Fecha de creacion <fechaCreacion> Poliza <poliza> producto <producto> Transaccion <transaccion> Tipo <tipo> Status <estado> Fecha fin transaccion <fechaFin> Participante <participante>

Examples:
|pais|usr|pass|nombre|apellido|filtroEstado|fechaCreacion|poliza|producto|transaccion|tipo|estado|fechaFin|participante
|Colombia|pedrvevi|pedrvevi|Wendell|Jackson|Todos|04/25/2016|1196065271|Auto personal|453453462|Emisión|Comprometida|04/25/2016|Participante Prueba