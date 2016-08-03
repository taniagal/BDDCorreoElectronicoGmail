Validacion en ingreso de un articulo a una ubicacion

Meta:

Scenario: Bug CDSEG-1900 Validaciones en valores de los sublimites cobertura
Meta:
@Story CDSEG-1900
@URL https://jira.suramericana.com.co/browse/CDSEG-1900
@Informador alejandro esteban villada marin
@Automatizador andres alarcon guerrero
@tag bug:CDSEG-1900
@Sprint 4

As a <rolUsuario>
Given que estoy en la informacion de la poliza con numero de subscripcion <numSubscripcion>
When cuando intente ingresar un articulo para una ubicacion para comprobar las validaciones de error del articulo
Then espero ver mensajes de advertencia indicandome que sobrepase los limites de valores para el valor del articulo

Examples:
| numSubscripcion | rolUsuario |descripcion|
| 22221237        | Asesor     |Numero de subscripcion que cuenta con ubicaciones|









