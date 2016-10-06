Meta:

Scenario: 2 Cancelacion de poliza

Meta:
@Story CDSEG-
@URL https://jira.suramericana.com.co/browse/CDSEG-
@tag automator:juan_gabriel_zapata, informer:juan_esteban_restrepo, sprint:8
@Sprint 8

Given que estoy en el resumen de la poliza MRC con numero de poliza <numPoliza> con el rol <rolUsuario>
When ingrese los motivos de cancelacion de la poliza fuente: Aseguradora, Motivo: Fraude, Descripción: Prueba
And realice la cancelacion de poliza
Then la cancelacion de la poliza es correcta si se muestra el texto: Cancelación Expedida



Examples:
| numPoliza     | rolUsuario | fuente  | motivo | descripcionMotivo | fechaVigentecia |
| TEST_99999999 | Asesor     | Aseguradora | Fraude  | Prueba rescindir  | 19/10/2016      |




