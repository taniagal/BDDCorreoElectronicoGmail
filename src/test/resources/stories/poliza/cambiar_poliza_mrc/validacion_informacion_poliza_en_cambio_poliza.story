Validacion informacion poliza en cambio poliza
Meta:


Scenario: Validación de elementos bloqueados en informacion de la poliza en el proceso del cambio de poliza
Meta:
@Story CDSEG-920
@URL https://jira.suramericana.com.co/browse/CDSEG-920
@Informador alejandro esteban villada marin
@Automatizador andres alarcon guerrero
@Sprint 4

As a <rolUsuario>
Given que estoy en el resumen de la poliza MRC con numero de poliza <numPoliza>
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
| TEST_11111111 | Asesor     |             |
