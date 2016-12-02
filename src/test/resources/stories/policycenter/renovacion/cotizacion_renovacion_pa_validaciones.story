Cotizacion Renovacion Pa Validaciones

Meta: @lote1

@issue #CDSEG-2295
@tag automator: diego_cardona_acevedo
@local
@Sprint 7

Narrative:
Como usuario de policy center  con el perfil  X
Quiero poder realizar la cotizacion de la renovacion de una poliza de personal autos ya sea de forma manual o automatica

Scenario: Quote - Riesgos Consultables - Figuras Tomador, Asegurado y Beneficiario
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando la renovacion de la poliza <cotizacion>
When cotice con algunas de las figuras que son Riesgo consultable bloqueante sin validar fecha
Then se debe bloquear la cotizacion y mostrar el mensaje que devuelve el servicio
|mensaje                                                                                                           |
|CARLOS ACEVEDO DUQUE, El tomador es un riesgo no estándar y no es posible gestionar la solicitud por este canal.  |
|FRANK RAMIREZ ALZATE, El asegurado es un riesgo no estándar y no es posible gestionar la solicitud por este canal.|

Examples:
|cotizacion |
|32112331   |

Scenario: Quote - Riesgos Consultables - Motor, Chasis y Placa
Meta:
@manual
Given estoy cotizando la renovacion de la poliza
When el motor, chasis y/o placa sean Riesgo consultable bloqueante
Then se debe bloquear la cotizacion y mostrar el mensaje que devuelve el servicio
|mensaje                                                                                            |
|T64497, La placa es un riesgo no estándar y no es posible gestionar la solicitud por este canal.   |
|CH212121, El chasis es un riesgo no estándar y no es posible gestionar la solicitud por este canal.|
|AB3C2, El motor es un riesgo no estándar y no es posible gestionar la solicitud por este canal.    |

Examples:
|cotizacion |
|32112331   |