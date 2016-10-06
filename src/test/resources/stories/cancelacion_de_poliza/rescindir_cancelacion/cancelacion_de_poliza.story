Meta:

Scenario: 1 Validacion lista de motivos

Meta:
@Story CDSEG-3417
@URL https://jira.suramericana.com.co/browse/CDSEG-
@tag automator:juan_gabriel_zapata, informer:juan_esteban_restrepo, sprint:8
@Sprint 8

Given que estoy en el resumen de la poliza MRC con numero de poliza <numPoliza> con el rol <rolUsuario>
When seleccione la lista motivo de cancelacion
Then se debe visualizar los siguientes motivos
| MOTIVOS                                                                                 |
| Por no pago                                                                             |
| Cancelación por petición del cliente                                                    |
| Cancelación por error de cobro                                                          |
| Cancelación por orden de la compañía                                                    |
| Por no renovada                                                                         |
| Por sustitución                                                                         |
| Por error de trámite                                                                    |
| Por error en expedición                                                                 |
| Por pérdida total                                                                       |
| Por políticas de Suramericana                                                           |
Examples:
| numPoliza     | rolUsuario |
| TEST_99999999 | Asesor     |

Scenario:  2 Validacion fecha de cancelacion

Meta:
@Story CDSEG-3417
@URL https://jira.suramericana.com.co/browse/CDSEG-
@tag automator:juan_gabriel_zapata, informer:juan_esteban_restrepo, sprint:8
@Sprint 8

Given que estoy en el resumen de la poliza MRC con numero de poliza <numPoliza> con el rol <rolUsuario>
When ingrese los motivos de cancelacion de la poliza Motivo: Cancelación por error de cobro, Descripción: Prueba
Then se debe mostrar la fecha del dia de hoy

Examples:
| numPoliza     | rolUsuario |
| TEST_99999999 | Asesor     |


Scenario:  3 Ingreso de fecha superior a los 60 dias de retroactividad

Meta:
@Story CDSEG-3417
@URL https://jira.suramericana.com.co/browse/CDSEG-
@tag automator:juan_gabriel_zapata, informer:juan_esteban_restrepo, sprint:8
@Sprint 8

Given que estoy en el resumen de la poliza MRC con numero de poliza <numPoliza> con el rol <rolUsuario>
When ingrese los motivos de cancelacion de la poliza Motivo: Cancelación por error de cobro, Descripción: Prueba
And ingrese fecha superior a 61 dias
Then _se debe mostrar mensaje con el texto: Advertencia: La fecha de cancelación no cumple con el parametro de retraoctividad de "60" días

Examples:
| numPoliza     | rolUsuario |
| TEST_99999999 | Asesor     |



Scenario: 4 Cancelacion de poliza

Meta:
@Story CDSEG-
@URL https://jira.suramericana.com.co/browse/CDSEG-
@tag automator:juan_gabriel_zapata, informer:juan_esteban_restrepo, sprint:8
@Sprint 8

Given _que estoy en el resumen de la poliza MRC con numero de poliza <numPoliza> con el rol <rolUsuario>
When _ingrese los motivos de cancelacion de la poliza fuente: Aseguradora, Motivo: Fraude, Descripción: Prueba
And _realice la cancelacion de poliza
Then _la cancelacion de la poliza es correcta si se muestra el texto: Cancelación Expedida



Examples:
| numPoliza     | rolUsuario | fuente  | motivo | descripcionMotivo | fechaVigentecia |
| TEST_99999999 | Asesor     | Aseguradora | Fraude  | Prueba rescindir  | 19/10/2016      |




