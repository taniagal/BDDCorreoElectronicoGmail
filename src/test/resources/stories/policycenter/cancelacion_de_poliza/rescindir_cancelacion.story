Rescindir Cancelacion


Meta: @lote2
@manual
@Story CDSEG-
@URL https://jira.suramericana.com.co/browse/CDSEG-
@tag automator:juan_gabriel_zapata, informer:juan_esteban_restrepo, sprint:9
@Sprint 9

Scenario: 1 Rescindir Cancelacion de poliza
Given  que estoy en el resumen de la poliza MRC con numero de poliza <numPoliza> con el rol <rolUsuario>
When ingrese los motivos de cancelacion de la poliza Motivo: Por error de cobro, Descripción: Prueba programacion
And ingrese fecha superior al dia actual
And realice la programacion de cancelacion
And rescinda la cancelacion de la poliza <numPoliza>
Then la revocacion de la poliza es correcta si se muestra el texto: Cancelación Revocado


Examples:
| numPoliza     | rolUsuario |
| TEST_99999999 | Asesor     |


Meta:
@manual
@Story CDSEG-
@URL https://jira.suramericana.com.co/browse/CDSEG-
@tag automator:juan_gabriel_zapata, informer:juan_esteban_restrepo, sprint:9
@Sprint 9

Scenario: 2 Validar Rescindir Cancelacion de poliza
Given  que estoy en el resumen de la poliza MRC con numero de poliza <numPoliza> con el rol <rolUsuario>
When ingrese los motivos de cancelacion de la poliza Motivo: Por error de cobro, Descripción: Prueba programacion
And ingrese fecha superior al dia actual
And realice la programacion de cancelacion
And rescinda la cancelacion de la poliza <numPoliza>
And ingreso al resumen de la poliza
Then la revocacion es correcta si no se se muestra el tipo en el campo <tipo> y se oculta el mensaje de cancelacion pendiente


Examples:
| numPoliza     | rolUsuario | tipo        |
| TEST_99999999 | Asesor     | Cancelación |



