Meta:
@lote3
@tag equipo: 5
@local
@Sprint 5

Narrative:
Como usuario de PolicyCenter
Quiero ser capaz consultar de forma automatica si un vehiculo requiere o no inspeccion.

Scenario: Consulta de inspeccion no valida y busqueda en el modelo de seguros
GivenStories: stories/policycenter/login_policy.story

Given se ha realizado la cotizacion <cotizacion>
When se identifique que el vehiculo <placa> no cumple con el requisito de inspeccion
And llegue a la expedicion de la poliza
Then se debe mostrar en la pantalla un mensaje <mensaje> indicando que el vehiculo no tiene inspeccion
And generar el UW Issue <mensaje> y no permitir expedir

Examples:
|cotizacion|placa  |mensaje                                                                       |requisitos                                         |
|22222214  |COR219 |El vehículo no tiene una inspección vigente a la fecha de ingreso del riesgo. |Existen requisitos pendientes, por favor verifique.|



Scenario: Consultar inspeccion valida en SIA
Given estoy cotizando una poliza:
|cuenta     |producto|tipoPoliza |
|C1060447895|Autos   |Individual |
When ingrese los datos del asegurado <tipo_documento> <documento>
And ingrese los datos del vehiculo:
|placa |modelo|codigo_fasecolda|ciudad_circulacion  |vehiculo_servicio|chasis|motor|valor_asegurado|descuento|recargo|zona|plan        |medioVenta|
|USU422|2011  |01601225        |MEDELLIN (ANTIOQUIA)|Particular       |null  |null |17900000       |null     |null   |2   |Plan Modular|Televentas|
And ingrese las coberturas:
|limite|deducible|abogado|PLlaves|
|640.  |0        |Si     |Si     |
And expido la poliza
Then se debe permitir expedir la poliza
And la fecha de inspeccion debe ser la fecha de inicio de vigencia de la poliza

Examples:
|cotizacion |placa |tipo_documento      |documento |
|22222215   |USU422|CEDULA DE CIUDADANIA|1060447895|


Scenario: Consulta requisito inspeccion en el modelo
Meta:
@manual
Given se tiene la informacion de la placa del vehiculo ingresada
When el vehiculo tenga inspeccion no valida o no tenga inspeccion
And la placa estuvo vigente en la compania
And la fecha de cancelacion o exclusion no sea mayor a 3 dias
Then se debe permitir expedir la poliza
And el valor asegurado se debe consultar
And traer de la tabla fasecolda

Scenario: Consulta requisito inspeccion en WS fasecolda
Meta:
@manual
Given se tiene la informacion de la placa del vehiculo ingresada
When se haga la busqueda de informacion en el WS de fasecolda
And se cumplan las condiciones para el requisito de inspeccion
Then se debe permitir expedir la poliza
And el valor asegurado se debe consultar
And traer de la tabla fasecolda

