Expedicion Renovacion Pa

Meta:
@issue #CDSEG-7469
@tag automator: diego_cardona_acevedo
@local
@Sprint 6

Narrative:
Como usuario de PolicyCenter
Quiero ser capaz de renovar de forma manual y automaticamente las politicas de auto personal

Scenario: Expedir renovacion - Mensaje de confirmacion
GivenStories: stories/policycenter/login_policy.story
Given se esta cotizando una renovacion de poliza <cotizacion>
When emita la renovacion
Then se debe mostrar un mensaje que indique
|mensaje                                                     |
|¿Está seguro de que desea emitir la renovación de la póliza?|

Examples:
|cotizacion|
|32112330  |

!--Se precide de hacer manual, dado que hay validacion de fecha anticipada a 60 Dias
Scenario: Expedir renovacion - Confirmacion expedicion
Meta: @manual
Given se esta cotizando una renovacion de poliza con <cotizacion>
When emita la renovacion de la poliza
Then se debe mostrar el resumen de la renovacion
And el mensaje de renovacion realizada <mensaje>

Examples:
|cotizacion|mensaje                                        |
|68745685  |La Renovación (N.° 68745685) ha sido realizada.|

Scenario: Expedir renovacion - Cambios realizados
Meta: @manual
Given cotice la renovacion de una poliza
When realice modificaciones en asegurado, informacion de poliza, vehiculo, coberturas
Then se debe expedir la renovacion de poliza con los cambios realizados en cada una de las pantallas.

Scenario: Expedir renovacion sin plan de pagos
Meta: @manual
Given he cotizando una renovacion de poliza
And no indique el plan de pagos
When emita la renovacion de la poliza
Then no se debe permitir expedir la poliza

Scenario: Expedir renovacion con plan de pagos
Meta: @manual
Given he cotizando una renovacion de poliza
And indique el plan de pagos
When emita la renovacion de la poliza
Then se debe permitir expedir poliza


