Meta:

@issue #SUGWUSC-15123

Narrative:
Como usuario de policy center
con un perfil que tenga permisos quiero ser capaz de registrar toda la informacion del vehiculo


Scenario: Ingreso de informacion del vehiculo
Given Estoy buscando una cuenta <numCuenta>
When quiera registrar la informacion del vehiculo
Then el sistema debe mostrar los datos correspondiente al vehiculo
And debe permitir seleccionar la tecla siguinete

Examples:
|numCuenta|mensaje|
|C000888888|Falta el campo obligatorio "Código de razón"|

Scenario: Validacion de campos de la informacion de vehiculos
Given Estoy buscando una cuenta <numCuenta>
When quiera ingresar la placa, motor el chasis <placa> <motor> <chasis>
And quiera ingresar el descuento, recargo y suavizacion <descuento> <recargo> <suavizacion>
Then el sistema debe validar
And debe permitir seleccionar la tecla siguinete

Examples:
|numCuenta |placa |motor          |chasis         |descuento|recargo|suavizacion|
|C000888888|OFI19C|C00008745678684|X48964788762144|99.99    |99.99  |99.99      |




