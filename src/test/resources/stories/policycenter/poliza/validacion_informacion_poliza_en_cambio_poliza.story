Meta:
@lote2
@tag equipo: 2
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
