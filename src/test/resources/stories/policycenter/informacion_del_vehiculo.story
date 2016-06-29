Meta:

@issue #SUGWUSC-15123

Narrative:
Como usuario de policy center
con un perfil que tenga permisos quiero ser capaz de registrar toda la informacion del vehiculo


Scenario: Registro de informacion del vehiculo
Given Estoy buscando una cuenta <numCuenta>
When quiera registrar la informacion del vehiculo
Then system is in a different state

Examples:
|numCuenta|mensaje|
|C000888888|Falta el campo obligatorio "Código de razón"|
