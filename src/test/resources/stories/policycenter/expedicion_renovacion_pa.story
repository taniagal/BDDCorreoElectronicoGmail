Expedicion Renovacion Pa

Meta:
@issue #CDSEG-7469
@Automatizador Diego Cardona Acevedo
@Sprint 6

Narrative:
Como usuario de PolicyCenter
Quiero ser capaz de renovar de forma manual y automaticamente las politicas de auto personal.

Scenario: Expedir renovacion - Mensaje de confirmacion
GivenStories: stories/policycenter/login_policy.story
Given se ha realizado la renovacion de la cotizacion <cotizacion>
When emita la renovacion
Then se debe mostrar un mensaje que indique
|mensaje                                                     |
|¿Está seguro de que desea emitir la renovación de la póliza?|

Examples:
|cotizacion|
|          |