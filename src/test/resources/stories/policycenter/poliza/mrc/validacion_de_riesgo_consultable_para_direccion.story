Validacion de riesgo consultable para direccion

Meta: @lote1
@Story CDSEG-731
@URL https://jira.suramericana.com.co/browse/CDSEG-731
@Informador alejandro esteban villada marin
@Automatizador andres alarcon guerrero
@Sprint 4


Scenario: Validacion en ingreso de un articulo a una ubicacion
Given que estoy en la informacion de la poliza con numero de subscripcion <numSubscripcion>
When cuando intente ingresar una ubicacion para comprobar las validaciones de riesgos consultables
Then espero ver mensajes de advertencia indicandome la direccion es un riesgo consultable

Examples:
| numSubscripcion | rolUsuario | descripcion |
| 0000115291      | Asesor     |             |

