Validaciones de valores de articulo, cobertura y sublímites en Multiriesgo corporativo

Meta:
@Story CDSEG-753
@URL https://jira.suramericana.com.co/browse/CDSEG-753
@Informador alejandro esteban villada marin
@Automatizador andres alarcon guerrero
@Sprint 4

Scenario: Bug # 666 VALIDACIONES EN VALORES DE SUBLIMITES COBERTURA
Meta:

As a <rolUsuario>
Given que estoy en la información de la póliza con numero de subscripción <numSubscripcion>
When cuando intente ingresar un artículo para una ubicación para comprobar las validaciones de error del artículo
Then espero ver mensajes de advertencia indicándome que sobrepasé los límites de valores para el valor del artículo

Examples:
| numSubscripcion | rolUsuario |descripcion|
| 22221237        | Asesor     |Numero de subscripcion que cuenta con ubicaciones y que pertenece a |










