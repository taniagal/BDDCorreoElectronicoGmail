Solicitar Requisito Pa

Meta:

@issue #CDSEG-2881
@tag automator: diego_cardona_acevedo
@local
@Sprint 9

Narrative:
Como usuario de negocio
Quiero que se levante el requisito para la solucion de autos de acuerdo a las reglas de negocio ya definidas.

Scenario: habilitar opcion Solicitar requisitos - expedicion
GivenStories: stories/policycenter/login_policy.story
Given existe una cotizacion <numeroCotizacion>
When llegue a la expedicion de la poliza
Then se debe habilitar la opcion de requisitos, con el fin de visualizar los requisitos requeridos

Examples:
|numeroCotizacion|
|22334457        |