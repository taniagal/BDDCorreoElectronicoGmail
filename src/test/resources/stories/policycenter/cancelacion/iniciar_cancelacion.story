Iniciar Cancelacion


Meta:
@lote6
@Story CDSEG-3417
@tag equipo: 2, sprint: 8


Scenario: 1 Validacion lista de motivos, fecha superior a los 60 dias de retroactividad y opcion cancelar transaccion
Given que estoy en el resumen de la poliza MRC con numero de poliza <numPoliza> con el rol <rolUsuario>
When seleccione la lista motivo de cancelacion
Then se debe visualizar los siguientes motivos
| MOTIVOS                       |
| Por no pagó                   |
| Por petición del cliente      |
| Por error de cob              |
| Por orden de la compañía      |
| Por no renovada               |
| Por sustitución               |
| Por error de trámite          |
| Por error en expedición       |
| Por pérdida total             |
| Por políticas de Suramericana |
And ingrese los motivos de cancelacion de la poliza Motivo: por error de cobro, Descripción: Prueba
And ingrese fecha superior a 61 dias
Then se debe mostrar mensaje con el texto: Advertencia: La fecha de cancelación no cumple con el parametro de retraoctividad de "60" días
And ingrese a la opcion de cancelar poliza
Then se debe mostrar la opcion de cancelar transaccion

Examples:
| numPoliza     | rolUsuario |
| TEST_22222236 | Asesor     |