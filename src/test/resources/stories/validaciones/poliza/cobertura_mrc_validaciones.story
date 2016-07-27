Cobertura mrc Validaciones

Meta:
@Story CDSEG-753
@URL https://jira.suramericana.com.co/browse/CDSEG-753
@Informador alejandro esteban villada marin
@Automatizador andres alarcon guerrero
@Sprint 4

Scenario: Bug #  VALIDACIONES EN VALORES DE SUBLIMITES COBERTURA
Meta:

As a <rolUsuario>
Given que estoy en la informacion de la poliza con numero de subscripcion <numSubscripcion> que deseo cambiar
When cuando intente ingresar un articulo para una ubicacion para comprobar las validaciones de error del articulo
Then espero ver mensajes de advertencia indicandome que sobrepase los limites de valores para el valor del articulo

Examples:
| numSubscripcion | rolUsuario |descripcion|
| 22222237        | Asesor     |Numero de subscripcion que cuenta con ubicaciones|










