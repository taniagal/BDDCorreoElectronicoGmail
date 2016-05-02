Meta:

Narrative:
Como usuario PolicyCenter
quiero ser capaz de buscar una cuenta
para ver el detalle de la misma

Scenario: Busqueda de cuenta persona natural
GivenStories: stories/policycenter/login_policy.story
Given que me encuentro en la busqueda de cuentas
When ingrese la informacion de primer nombre <primerNombre> y primer apellido <primerApellido>
Then me debe mostrar numero de cuenta <numeroCuenta>, nombre <nombre> y direccion <direccion>

Examples:
|primerNombre|primerApellido|numeroCuenta|nombre|direccion
|Ray|Newton|C000143542|Ray Newton|1253 Paloma Ave, Floor 0000, Developer Unit Habitation Cube #0000, Arcadia, CA 91007