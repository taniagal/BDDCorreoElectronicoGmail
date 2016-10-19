Procesar Cancelacion

Meta:

Scenario: 1 Programar cancelacion de poliza

Meta:
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
| 6306954333    | Asesor     |


Scenario: 2 Cancelar poliza con beneficiario oneroso

Meta:
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
| 6887167414    | Asesor     |


Scenario: 3 Cancelacion de  poliza con beneficiario oneroso sin aprobar UW

Meta:
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
| 6887167414    | Asesor     |


Scenario: 4 Cotizacion de cancelacion de poliza con beneficiario oneroso

Meta:
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
| 6887167414    | Asesor     |


Scenario: 5 Cancelar poliza

Meta:
@Story CDSEG-3425
@URL https://jira.suramericana.com.co/browse/CDSEG-3425
@tag automator:juan_gabriel_zapata, informer:juan_esteban_restrepo, sprint:8
@Sprint 8

Given _que estoy en el resumen de la poliza MRC con numero de poliza <numPoliza> con el rol <rolUsuario>
When _ingrese los motivos de cancelacion de la poliza Motivo: Por error de trámite, Descripción: Prueba cancelacion  de poliza
And _realice la cancelacion de poliza
Then _la cancelacion de la poliza es correcta si se muestra el texto: Cancelación Expedida


Examples:
| numPoliza     | rolUsuario |
| TEST_99999999 | Asesor     |



Scenario: 6 Cancelar poliza con retroactividad

Meta: @manual
@Story CDSEG-3425
@URL https://jira.suramericana.com.co/browse/CDSEG-3425
@tag automator:juan_gabriel_zapata, informer:juan_esteban_restrepo, sprint:8
@Sprint 8

Given  que quiero expedir la cancelación de una poliza con retroactividad superior a 60 días
When  intente procesar la cancelación
Then  se debe generar un UW Issue para solicitar la autorización, el mensaje debe ser: "La fecha de cancelación no cumple con el parametro de retraoctividad de 60 días"


Scenario: 7 Cancelar poliza con siniestro asociado

Meta: @manual
@Story CDSEG-3774
@URL https://jira.suramericana.com.co/browse/CDSEG-3774
@tag automator:juan_gabriel_zapata, informer:juan_esteban_restrepo, sprint:8
@Sprint 8

Given  que quiero expedir la cancelación de una poliza con un siniestro asociado
When  intente procesar la cancelación
Then  se debe visualizar el mensaje: "La poliza tiene un siniestro en estado "estado del siniestro" posterior a la fecha en que se desea cancelar la póliza y no puede cancelarse"










