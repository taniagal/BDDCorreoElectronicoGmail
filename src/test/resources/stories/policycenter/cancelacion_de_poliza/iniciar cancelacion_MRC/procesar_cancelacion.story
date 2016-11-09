Procesar Cancelacion

Meta: @lote1 @manual

Scenario: 1 Programar cancelacion de poliza

Meta: @lote1 @manual
@Story CDSEG-3425
@URL https://jira.suramericana.com.co/browse/CDSEG-3425
@tag automator:juan_gabriel_zapata, informer:juan_esteban_restrepo, sprint:8
@Sprint 8

Given que estoy en el resumen de la poliza MRC con numero de poliza <numPoliza> con el rol <rolUsuario>
When ingrese los motivos de cancelacion de la poliza Motivo: Por error de cobro, Descripción: Prueba programacion
And ingrese fecha superior al dia actual
And realice la programacion de cancelacion
Then la programacion de la poliza es correcta si se muestra el texto: Cancelación Programado


Examples:
| numPoliza     | rolUsuario |
| TEST_22263226 | Asesor     |


Scenario: 2 Cancelar poliza con beneficiario oneroso

Meta: @lote1 @manual
@Story CDSEG-3425
@URL https://jira.suramericana.com.co/browse/CDSEG-3425
@tag automator:juan_gabriel_zapata, informer:juan_esteban_restrepo, sprint:8
@Sprint 8

Given que estoy en el resumen de la poliza MRC con numero de poliza <numPoliza> con el rol <rolUsuario>
When ingrese los motivos de cancelacion de la poliza Motivo: Por error de cobro, Descripción: Prueba programacion
And inicie la cancelacion
Then se debe generar un UW Issue para solicitar la autorización y el mensaje debe ser: La póliza que intenta cancelar tiene el beneficiario oneroso

Examples:
| numPoliza     | rolUsuario |
| TEST_22253226 | Asesor     |


Scenario: 3 Cancelacion de  poliza con beneficiario oneroso sin aprobar UW

Meta: @lote1 @manual
@Story CDSEG-3425
@URL https://jira.suramericana.com.co/browse/CDSEG-3425
@tag automator:juan_gabriel_zapata, informer:juan_esteban_restrepo, sprint:8
@Sprint 8

Given que estoy en el resumen de la poliza MRC con numero de poliza <numPoliza> con el rol <rolUsuario>
When ingrese los motivos de cancelacion de la poliza Motivo: Por error de cobro, Descripción: Prueba cancelacion  de poliza
And realice la cancelacion de poliza
Then se debe mostrar un mensaje con el texto: Asuntos que bloquean la expedición

Examples:
| numPoliza     | rolUsuario |
| TEST_22253226 | Asesor     |


Scenario: 4 Cotizacion de cancelacion de poliza con beneficiario oneroso

Meta: @lote1 @manual
@Story CDSEG-3423
@URL https://jira.suramericana.com.co/browse/CDSEG-3423
@tag automator:juan_gabriel_zapata, informer:juan_esteban_restrepo, sprint:8
@Sprint 8


Given que estoy en el resumen de la poliza MRC con numero de poliza <numPoliza> con el rol <rolUsuario>
When ingrese los motivos de cancelacion de la poliza Motivo: Por error de cobro, Descripción: Prueba cancelacion  de poliza
And inicie la cancelacion
Then se debe visualizar un mensaje con el texto: La póliza que intenta cancelar tiene asociado(s) beneficario(s) oneroso(s)

Examples:
| numPoliza     | rolUsuario |
| TEST_22253226 | Asesor     |


Scenario: 5 Cancelar poliza

Meta: @lote1 @manual
@Story CDSEG-3425
@URL https://jira.suramericana.com.co/browse/CDSEG-3425
@tag automator:juan_gabriel_zapata, informer:juan_esteban_restrepo, sprint:8
@Sprint 8

Given que estoy en el resumen de la poliza MRC con numero de poliza <numPoliza> con el rol <rolUsuario>
When ingrese los motivos de cancelacion de la poliza Motivo: Por error de trámite, Descripción: Prueba cancelacion  de poliza
And realice la cancelacion de poliza
Then la cancelacion de la poliza es correcta si se muestra el texto: Cancelación Expedida


Examples:
| numPoliza     | rolUsuario |
| TEST_22263226 | Asesor     |



Scenario: 6 Cancelar poliza con retroactividad

Meta: @lote1 @manual
@Story CDSEG-3425
@URL https://jira.suramericana.com.co/browse/CDSEG-3425
@tag automator:juan_gabriel_zapata, informer:juan_esteban_restrepo, sprint:8
@Sprint 8

Given  que quiero expedir la cancelación de una poliza con retroactividad superior a 60 días
When  intente procesar la cancelación
Then  se debe generar un UW Issue para solicitar la autorización, el mensaje debe ser: "La fecha de cancelación no cumple con el parametro de retraoctividad de 60 días"


Examples:
|  |  |
|  |  |


Scenario: 7 Cancelar poliza con siniestro asociado

Meta: @lote1 @manual
@Story CDSEG-3774
@URL https://jira.suramericana.com.co/browse/CDSEG-3774
@tag automator:juan_gabriel_zapata, informer:juan_esteban_restrepo, sprint:8
@Sprint 8

Given  que quiero expedir la cancelación de una poliza con un siniestro asociado
When  intente procesar la cancelación
Then  se debe visualizar el mensaje: "La poliza tiene un siniestro en estado "estado del siniestro" posterior a la fecha en que se desea cancelar la póliza y no puede cancelarse"


Examples:
|  |  |
|  |  |

Scenario: 8 Cancelar poliza adelantada (billing)

Meta: @lote1 @manual
@Story CDSEG-3782
@URL https://jira.suramericana.com.co/browse/CDSEG-3782
@tag automator:juan_gabriel_zapata, informer:juan_esteban_restrepo, sprint:8
@Sprint 8

Given  que quiero cancelar la poliza con un fecha superior al día de hoy
When  intente procesar la cancelación
Then  se debe validar en Billing la fecha de cancelación sugerida con base en la facturación generada y no permitir cancelar si la fecha de cancelación ingresada supera la fecha sugerida por billing y se debe generar un UW Issue, el mesanje de la autorización debe ser: "La fecha de cancelación es posterior al último periodo pagado de la póliza. La cancelación debe ser autorizada"


Examples:
|  |  |
|  |  |










