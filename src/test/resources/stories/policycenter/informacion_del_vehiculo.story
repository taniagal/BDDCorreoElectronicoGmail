Meta:

@issue #SUGWUSC-15123

Narrative:
Como usuario de policy center
con un perfil que tenga permisos quiero ser capaz de registrar toda la informacion del vehiculo

Scenario: Ingreso de informacion del vehiculo
GivenStories: stories/policycenter/login_policy.story
Given se inicio una nueva suscripcion <numeroCuenta>
When ingrese una nueva cotizacion para vehiculo <nomProducto>
And vaya a registrar los datos del vehiculo
Then el sistema debe mostrar los datos correspondiente al vehiculo


Examples:
|numCuenta |nomProducto  |placa |
|C000888888|Auto personal|OFI19C|

