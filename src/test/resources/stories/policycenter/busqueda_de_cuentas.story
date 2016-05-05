Meta:

Narrative:
Como usuario PolicyCenter
quiero ser capaz de buscar una cuenta
para ver el detalle de la misma

Scenario: Busqueda de cuenta persona natural por primer nombre y primer apellido
GivenStories: stories/policycenter/login_policy.story
Given que me encuentro en la busqueda de cuentas
When ingrese la informacion de primer nombre <primerNombre> y primer apellido <primerApellido>
Then me debe mostrar numero de cuenta <numeroCuenta>, nombre <nombre> y direccion <direccion>

Examples:
|primerNombre|primerApellido|numeroCuenta|nombre|direccion
|Ray|Newton|C000143542|Ray Newton|1253 Paloma Ave, Floor 0000, Developer Unit Habitation Cube #0000, Arcadia, CA 91007

Scenario: Busqueda de cuenta persona natural por primer nombre y primer apellido sin datos existentes
Given que me encuentro en la busqueda de cuentas
When ingrese la informacion de primer nombre <primerNombre> y primer apellido <primerApellido>
Then me debe mostrar el mensaje <mensaje>

Examples:
|primerNombre|primerApellido|mensaje
|Rayo|Newton|La búsqueda no devolvió resultados.


Scenario: Busqueda de cuenta persona natural por tipo y numero de documento
Given que me encuentro en la busqueda de cuentas
When ingrese la informacion de tipo de documento <tipoDocumento> y numero de documento <numeroDocumento> del titular de la cuenta
Then me debe mostrar numero de cuenta <numeroCuenta>, nombre <nombre> y direccion <direccion>

Examples:
|tipoDocumento|numeroDocumento|numeroCuenta|nombre|direccion
|cedula de ciudadania|12345678900|C000888888|Yurledys Torres Gallego|4040 Elmwood Ave, Floor 0000, Developer Unit Habitation Cube #0000, Louisville, KY 94404-0000, Estados Unidos
