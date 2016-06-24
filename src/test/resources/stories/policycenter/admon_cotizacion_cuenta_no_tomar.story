Meta:

Narrative:
Como usuario de policy center
con un perfil que tenga permisos quiero ser capaz de actualizar el estado de las cotizaciones creadas para una cuenta y
así poder crear, actualizar,copiar y retirar cotizaciones para una cuenta dada

@issue #SUGWUSC-14968

Scenario: No tomar una cotizacion sin ingresar la razon
GivenStories: stories/precondiciones/ingreso_a_policycenter.story
Given que estoy visualizando las cotizaciones de la cuenta <numCuenta>
When no quiera tomar la cotizacion sin ingresar una razon
Then el sistema debe mostrar un mesaje <mensaje> y bloquear la accion

Examples:
|numCuenta|mensaje|
|C000777777|Falta el campo obligatorio "Código de razón"|

