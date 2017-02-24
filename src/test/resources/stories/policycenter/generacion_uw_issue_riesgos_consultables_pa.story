Generacion Uw Issue Riesgos Consultables Pa

Meta:
@lote3
@issue #CDSEG-1260
@tag equipo: 5
@local
@Sprint 9

Narrative:
Como usuario de policy center
Quiero poder gestionar los UW que se generen cuando una de las figuras de la cotizacion sea riesgo consultable bloqueante.

Scenario: Analisis de riesgo - Uw issue - Quote
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza:
|cuenta     |producto|tipoPoliza    |
|C1060447895|Autos   |Individual    |
When seleccione la opcion siguiente
And ingrese los datos del asegurado <tipo_documento> <documento>
And ingrese los datos del vehiculo:
|placa |modelo|codigo_fasecolda|ciudad_circulacion  |vehiculo_servicio|chasis  |motor |valor_asegurado|descuento|recargo|zona|plan        |
|T64497|2016  |00601182        |MEDELLIN (ANTIOQUIA)|Particular       |CH212121|AB3C2 |165900000      |null     |null   |2   |Plan Modular|
And ingrese las coberturas basicas:
|limite|deducible|abogado|PLlaves|
|640.  |0        |Si     |Si     |
And intente cotizar
And vaya a la opcion de analisis de riesgo
Then debo ver un UW issue por cada figura que sea riesgo consultable bloqueante
|mensaje|
|DIEGO VELEZ es un riesgo no estándar y debe ser analizado por el comité de evaluación para el(los) rol(es): ASEGURADO|
|El chasis CH212121 es un riesgo no estándar y debe ser analizado por el comité de evaluación.|
|La placa T64497 es un riesgo no estándar y debe ser analizado por el comité de evaluación.|
|El motor AB3C2 es un riesgo no estándar y debe ser analizado por el comité de evaluación.|

Examples:
|tipo_documento       |documento |
|CEDULA DE CIUDADANIA |32536001  |


Scenario: Analisis de riesgo - Uw issue - Issue
Given existe una cotizacion <numeroCotizacion>
When las figuras asegurado, beneficiario, tomador y/o cuentahabiente sean riesgo consultable e intente expedir la poliza
And vaya a la opcion de analisis de riesgo
Then debo ver un UW issue por cada figura que sea riesgo consultable bloqueante
|mensaje|
|DIEGO VELEZ es un riesgo no estándar y debe ser analizado por el comité de evaluación para el(los) rol(es): ASEGURADO|
|JOSE PAEZ ALZATE es un riesgo no estándar y debe ser analizado por el comité de evaluación para el(los) rol(es): TOMADOR|
|El chasis CH212121 es un riesgo no estándar y debe ser analizado por el comité de evaluación.|
|La placa T64497 es un riesgo no estándar y debe ser analizado por el comité de evaluación.|
|El motor AB3C2 es un riesgo no estándar y debe ser analizado por el comité de evaluación.|

Examples:
|numeroCotizacion|
|22222210        |


Scenario: Analisis de riesgo - Uw issue - Modificacion
Meta:
@manual
Given se ha realizado la cotizacion de la modificacion
When las figuras asegurado, beneficiario y/o tomador sean riesgo consultable
And la placa, motor y chasis sean riesgo consultable
And realice la cotizacion de la modificacion
And  vaya a  opcion de analisis de riesgo
Then debo ver un UW issue por cada figura que sea riesgo consultable bloqueante


Scenario: Analisis de riesgo - Uw issue - Renovacion
Meta:
@manual
Given se ha realizado la cotizacion de una renovacion
When las figuras asegurado, beneficiario y/o tomador sean riesgo consultable
And la placa, motor y chasis sean riesgo consultable
And realice la cotizacion de la renovacion
And  vaya a opcion de analisis de riesgo
Then debo ver un UW issue por cada figura que sea riesgo consultable bloqueante