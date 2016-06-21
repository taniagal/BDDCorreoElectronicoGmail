Meta:

@issue #SUGWUSC-14966

Narrative:
Como usuario de policy center
con un perfil que tenga permisos quiero ser capaz de actualizar el estado de las cotizaciones creadas para una cuenta y
así poder crear, actualizar,copiar y retirar cotizaciones para una cuenta dada

Scenario: Declinar una cotizacion desde una cuenta
GivenStories: stories/policycenter/login_policy.story
Given que estoy visualizando las cotizaciones de la cuenta <numCuenta>
When quiera declinar la cotizacion por cualquiera de la razones
Then el sistema debe mostrar el estado declinada
And desahabilitar la opcion de acciones para no ser modificada

Examples:
|numCuenta|
|C000777777|
