Modificacion Renovacion Vehiculo

Meta:

@issue #CDSEG-2976
@tag automator: diego_cardona_acevedo
@Sprint 7

Narrative:
Como usuario de  policy center con el perfil X,
Quiero ser capaz de actualizar o realizar modificaciones de datos de una poliza en el proceso de renovacion de una poliza

Scenario: Editar Transaccion - Vehiculo
GivenStories: stories/policycenter/login_policy.story
Given estoy editando la renovacion de una poliza <cotizacion>
When estoy en la pantalla de Vehiculo
Then se deben poder modificar los campos: Ciudad de circulacion, Tipo de servicio, Motor,
Chasis, Bonificacion, Suavizacion, Recargo, Descuento, Valor Asegurado, Valor accesorios,
Valor accesorios especiales

Examples:
|cotizacion|
|32112330  |

Scenario: Editar Transaccion - Datos que no se pueden modificar
Given estoy editando la renovacion de una poliza <cotizacion>
When intente modificar la informacion del Vehiculo
Then no debo poder modificar los datos de: Placa, Relacion de asegurados en el caso de que solo exista un asegurado y
este ya esta relacionado, en el caso de que exista mas de un asegurado y ste no este  relacionado si es posible
relacionar el o los asegurados faltantes

Examples:
|cotizacion|
|32112330  |


Scenario: Editar Transaccion - No se permite interactuar con los vehiculos
Given estoy editando la renovacion de una poliza <cotizacion>
When intente modificar la informacion del Vehiculo
Then no debo poder interactuar con los vehiculos de la poliza

Examples:
|cotizacion|
|32112330  |