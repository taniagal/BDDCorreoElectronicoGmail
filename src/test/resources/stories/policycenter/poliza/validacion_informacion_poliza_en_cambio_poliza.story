Validacion informacion poliza en cambio poliza


Meta: @lote4
@Story CDSEG-920
@URL https://jira.suramericana.com.co/browse/CDSEG-920
@tag automator:andres_alarcon_guerrero, informer:alejandro_esteban_villada_marin, sprint:4
@Sprint 4

Scenario: Validacion de elementos bloqueados en informacion de la poliza en el proceso del cambio de poliza
As a <rolUsuario>
Given que estoy en el resumen de la poliza MRC con numero de poliza <numPoliza> con el rol <rolUsuario>
When cuando intente cambiar informacion de la poliza MRC
Then espero ver inhabilitado para modificacion los siguientes
| CAMPOS                              |
| Reaseguro aceptado                  |
| Botón agregar tomadores adicionales |
| Fecha de inicio de vigencia         |
| Fecha de expedicion                 |
| Tipo de licitacion                  |


Examples:
| numPoliza     | rolUsuario | descripcion |
| TEST_22222236 | Asesor     |             |
