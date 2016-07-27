Validacion en ingreso de un articulo a una ubicacion

Meta:

Scenario: Bug #  VALIDACIONES EN VALORES DE SUBLIMITES COBERTURA
Meta:
@Story CDSEG-753
@URL https://jira.suramericana.com.co/browse/CDSEG-753
@Informador alejandro esteban villada marin
@Automatizador andres alarcon guerrero
@Sprint 4

As a <rolUsuario>
Given que estoy en el resumen de la poliza MRC con numero de poliza <numPoliza>
When cuando intente ingresar un articulo para una ubicacion para comprobar las validaciones de error del articulo
Then espero ver mensajes de advertencia indicandome que sobrepase los limites de valores para el valor del articulo

Examples:
| numPoliza     | rolUsuario | descripcion |
| TEST_11111111 | Asesor     |             |




