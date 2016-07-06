Meta:

@issue #SUGWUSC-15123

Narrative:
Como usuario de policy center
con un perfil que tenga permisos quiero ser capaz de registrar toda la informacion del vehiculo

Scenario: Ingreso de informacion del vehiculo
GivenStories: stories/policycenter/login_policy.story
Given Estoy buscando una cuenta <numCuenta>
When quiera registrar la informacion del vehiculo <nomProducto>
Then el sistema debe mostrar los datos correspondiente al vehiculo


Examples:
|numCuenta |nomProducto  |
|C000888888|Auto personal|

