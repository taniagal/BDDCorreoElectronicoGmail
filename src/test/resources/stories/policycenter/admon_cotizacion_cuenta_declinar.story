Meta: @lote1

@issue #SUGWUSC-14966
@tag automator: Jonathan_Mejia_Leon
@local

Narrative:
Como usuario de policy center
con un perfil que tenga permisos quiero ser capaz de actualizar el estado de las cotizaciones creadas para una cuenta y
así poder crear, actualizar,copiar y retirar cotizaciones para una cuenta dada

Scenario: Declinar una cotizacion sin razon
GivenStories: stories/policycenter/login_policy.story
Given que estoy visualizando las cotizaciones de la cuenta <numCuenta>
When quiera declinar la cotizacion sin ingresar la razon
Then el sistema debe mostrar un mesaje <mensaje>

Examples:
|numCuenta|mensaje|
|C002888992|Falta el campo obligatorio "Código de razón"|

Scenario: Validar al seleccionar la opcion declinar
Given que estoy visualizando las cotizaciones de la cuenta <numCuenta>
When quiera declinar la cotizacion
Then el sistema debe mostrarme todas las opciones:
|Cartera|
|No acuerdo de pago|
|Riesgo no objetivo|
|Sin respaldo de reaseguradores y coaseguradores|
|Siniestros|

Examples:
|numCuenta|
|C002888992|

Scenario: Declinar una cotizacion desde una cuenta
Given que estoy visualizando las cotizaciones de la cuenta <numCuenta>
When quiera declinar la cotizacion por cualquier razon <razon>
Then el sistema debe mostrar el estado declinada <numCotizacion> <accion>
And desahabilitar la opcion de acciones para no ser modificada

Examples:
|numCuenta|razon|numCotizacion|accion|
|C002888992|Cartera|22223228|Declinada|





