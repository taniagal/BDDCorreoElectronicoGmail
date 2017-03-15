Iniciar Cancelacion


Meta:
@lote1
@Story CDSEG-3417
@tag equipo: 2
@Sprint 8


Scenario: 1 Validacion lista de motivos
Given que estoy en el resumen de la poliza MRC con numero de poliza <numPoliza> con el rol <rolUsuario>
When seleccione la lista motivo de cancelacion
Then se debe visualizar los siguientes motivos
| MOTIVOS                       |
| Por no pago                   |
| Por petición del cliente      |
| Por error de cobro            |
| Por orden de la compañía      |
| Por no renovada               |
| Por sustitución               |
| Por error de trámite          |
| Por error en expedición       |
| Por pérdida total             |
| Por políticas de Suramericana |

Examples:
| numPoliza     | rolUsuario |
| TEST_22222236 | Asesor     |



Scenario:  2 Validacion fecha de cancelacion
Given que estoy en el resumen de la poliza MRC con numero de poliza <numPoliza> con el rol <rolUsuario>
When ingrese los motivos de cancelacion de la poliza Motivo: por error de cobro, Descripción: Prueba
Then se debe mostrar la fecha del dia de hoy

Examples:
| numPoliza     | rolUsuario |
| TEST_22222236 | Asesor     |



Scenario:  3 Ingreso de fecha superior a los 60 dias de retroactividad
Given que estoy en el resumen de la poliza MRC con numero de poliza <numPoliza> con el rol <rolUsuario>
When ingrese los motivos de cancelacion de la poliza Motivo: por error de cobro, Descripción: Prueba
And ingrese fecha superior a 61 dias
Then se debe mostrar mensaje con el texto: Advertencia: La fecha de cancelación no cumple con el parametro de retraoctividad de "60" días

Examples:
| numPoliza     | rolUsuario |
| TEST_22222236 | Asesor     |



Scenario: 4 Validacion opcion cancelar transaccion
Given que estoy en el resumen de la poliza MRC con numero de poliza <numPoliza> con el rol <rolUsuario>
When ingrese a la opcion de cancelar poliza
Then se debe mostrar la opcion de cancelar transaccion

Examples:
| numPoliza     | rolUsuario |
| TEST_22222236 | Asesor     |



Scenario: 5 Validacion metodo de reembolso y campo fuente
Given que estoy en el resumen de la poliza MRC con numero de poliza <numPoliza> con el rol <rolUsuario>
When seleccione la lista motivo de cancelacion
And seleccione el <motivo> de cancelacion
Then se debe mostrar el metodo de reembolso <reembolso> sin el campo fuente


Examples:
| numPoliza     | rolUsuario | motivo                  | descripcion             | reembolso      |
| TEST_22222236 | Asesor     | Por pérdida total       | prueba perdida total    | Sin devolución |
| TEST_22222236 | Asesor     | Por error de trámite    | prueba error tramite    | Fijo           |
| TEST_22222236 | Asesor     | Por error en expedición | prueba error expedicion | Fijo           |
| TEST_22222236 | Asesor     | Por no renovada         | prueba error prorrata   | Prorrata       |


Scenario: 6 Validacion lista de motivos para poliza bancolombia

Meta:
@manual
Given que estoy en el resumen de la poliza MRC  de bancolombia con numero de poliza <numPoliza> con el rol <rolUsuario>
When seleccione la lista motivos de cancelacion
Then se deben visualizar los siguientes motivos
| MOTIVOS                                       |
| El cliente termino el crédito                 |
| El cliente prepago el crédito                 |
| El cliente tomo otra póliza con Suramericana  |
| El cliente tomo otra póliza con otra compañía |
| Por cambio en la fecha de vigencia            |

Examples:
| numPoliza  | rolUsuario |
| 6076942934 | Asesor     |