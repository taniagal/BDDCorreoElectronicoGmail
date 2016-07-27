Cobertura mrc Validaciones

Meta:


Scenario: Validacion en ingreso de un articulo a una ubicacion
Meta:
@Story CDSEG-731
@URL https://jira.suramericana.com.co/browse/CDSEG-731
@Informador alejandro esteban villada marin
@Automatizador andres alarcon guerrero
@Sprint 4

As a <rolUsuario>
Given que estoy en el resumen de la poliza MRC con numero de poliza <numPoliza>
When cuando intente ingresar una ubicacion para comprobar las validaciones de riesgos consultables
Then espero ver mensajes de advertencia indicandome la direccion es un riesgo consultable

Examples:
| numPoliza | rolUsuario | descripcion |
| PENDIENTE   | Asesor     |             |


