Generacion Uw Issue Riesgos Consultables Pa

Meta:

@lote4
@issue #CDSEG-1260
@tag automator: diego_cardona_acevedo
@local
@Sprint 9

Narrative:
Como usuario de policy center
Quiero poder gestionar los UW que se generen cuando una de las figuras de la cotizacion sea riesgo consultable bloqueante.

Scenario: Analisis de riesgo - Uw issue - Quote
GivenStories: stories/policycenter/login_policy.story
Given existe una cotizacion <numeroCotizacion>
When las figuras asegurado, beneficiario, tomador y/o cuentahabiente sean riesgo consultable
And vaya a la opcion de analisis de riesgo
Then debo ver un UW issue por cada figura que sea riesgo consultable bloqueante
|mensaje|
|FRANK RAMIREZ ALZATE es un riesgo no estándar y debe ser analizado por el comité de evaluación para el(los) rol(es): TOMADOR, ASEGURADO |
|El chasis CH212121 es un riesgo no estándar y debe ser analizado por el comité de evaluación.|
|La placa T64497 es un riesgo no estándar y debe ser analizado por el comité de evaluación.|
|El motor AB3C2 es un riesgo no estándar y debe ser analizado por el comité de evaluación.|

Examples:
|numeroCotizacion|
|22334456        |

Scenario: Analisis de riesgo - Uw issue - Issue
Given existe una cotizacion <numeroCotizacion>
When las figuras asegurado, beneficiario, tomador y/o cuentahabiente sean riesgo consultable e intente expedir la poliza
And vaya a la opcion de analisis de riesgo
Then debo ver un UW issue por cada figura que sea riesgo consultable bloqueante
|mensaje|
|FRANK RAMIREZ ALZATE es un riesgo no estándar y debe ser analizado por el comité de evaluación para el(los) rol(es): TOMADOR, ASEGURADO |
|El chasis CH212121 es un riesgo no estándar y debe ser analizado por el comité de evaluación.|
|La placa T64497 es un riesgo no estándar y debe ser analizado por el comité de evaluación.|
|El motor AB3C2 es un riesgo no estándar y debe ser analizado por el comité de evaluación.|

Examples:
|numeroCotizacion|
|22334457        |

Scenario: Analisis de riesgo - Uw issue - Modificacion
Meta: @manual
Given se ha realizado la cotizacion de la modificacion
When las figuras asegurado, beneficiario y/o tomador sean riesgo consultable
And la placa, motor y chasis sean riesgo consultable
And realice la cotizacion de la modificacion
And vaya a la opcion de analisis de riesgo
Then debo ver un UW issue por cada figura que sea riesgo consultable bloqueante

Scenario: Analisis de riesgo - Uw issue - Modificacion
Meta: @manual
Given se ha realizado la cotizacion de una renovacion
When las figuras asegurado, beneficiario y/o tomador sean riesgo consultable
And la placa, motor y chasis sean riesgo consultable
And realice la cotizacion de la renovacion
And vaya a la opcion de analisis de riesgo
Then debo ver un UW issue por cada figura que sea riesgo consultable bloqueante