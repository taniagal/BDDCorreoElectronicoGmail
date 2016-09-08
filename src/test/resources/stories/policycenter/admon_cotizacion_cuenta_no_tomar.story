Meta:

@issue #SUGWUSC-14968
@Automatizador: Jonathan Mejia



Narrative:
Como usuario de policy center
con un perfil que tenga permisos quiero ser capaz de actualizar el estado de las cotizaciones creadas para una cuenta y
así poder crear, actualizar,copiar y retirar cotizaciones para una cuenta dada


Scenario: No tomar una cotizacion sin ingresar la razon
GivenStories: stories/policycenter/login_policy.story
Given que estoy visualizando las cotizaciones de la cuenta <numCuenta>
When no quiera tomar la cotizacion sin ingresar una razon
Then el sistema debe mostrar un mesaje <mensaje> y bloquear la accion

Examples:
|numCuenta|mensaje|
|C002888992|Falta el campo obligatorio "Código de razón"|

Scenario: Validar campos obligatorios de lista despleglable razon de no tomar
Given que estoy visualizando las cotizaciones de la cuenta <numCuenta>
When no quiera tomar la cotizacion
Then el sistema debe mostrarme todas las siguientes opciones:
|Precio y condiciones no satisfactorias|
|Se aseguró en otra compañía|
|No acuerdo de pago|
|No cumple condiciones de licitación|

Examples:
|numCuenta|
|C002888992|

Scenario: No tomar una cotizacion desde una cuenta
Given que estoy visualizando las cotizaciones de la cuenta <numCuenta>
When no quiera tomar la cotizacion por una razon <razon>
Then el sistema debe mostrar el estado no tomada <numCotizacion> <accion>
And desahabilitar la opcion de acciones

Examples:
|numCuenta|razon|numCotizacion|accion|
|C002888992|No acuerdo de pago|22223224|No tomada|

