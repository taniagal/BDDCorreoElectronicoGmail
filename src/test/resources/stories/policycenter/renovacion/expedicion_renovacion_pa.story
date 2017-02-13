Meta:
@lote2
@tag equipo: 5
@local
@Sprint 6

Narrative:
Como usuario de PolicyCenter
Quiero ser capaz de renovar de forma manual y automaticamente las politicas de auto personal

Scenario: Expedir renovacion - Mensaje de confirmacion
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza:
|cuenta     |organizacion|producto|canal            |tipoPoliza |
|C1060447895|Sura        |Autos   |Canal Tradicional|Individual |
When ingrese los datos del asegurado <tipo_documento> <documento>
And ingrese los datos del vehiculo:
|placa |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis|motor|valor_asegurado|descuento|recargo|zona|plan        |
|random|2016  |00601182        |MEDELLIN          |Particular       |null  |null |165900000      |null     |null   |2   |Plan Modular|
And ingrese las coberturas:
|limite|deducible|abogado|PLlaves|
|640.  |0        |Si     |Si     |
And expido la poliza y voy al archivo de poliza
And quiera realizar esta renovacion
And edite la informacion del vehiculo en la renovacion
|chasis  |motor  |
|DAC478  |M45754 |
And cotice la renovacion
And emita la renovacion
Then se debe mostrar un mensaje que indique
|mensaje                                                     |
|¿Está seguro de que desea emitir la renovación de la póliza?|
Examples:
|tipo_documento      |documento |
|CEDULA DE CIUDADANIA|1060447895|

Scenario: Expedir renovacion - Confirmacion expedicion
Meta:
@manual
Given se esta cotizando una renovacion de poliza con <cotizacion>
When emita la renovacion de la poliza
Then se debe mostrar el resumen de la renovacion
And el mensaje de renovacion realizada <mensaje>

Examples:
|cotizacion|mensaje                                        |
|68745685  |La Renovación (N.° 68745685) ha sido realizada.|

Scenario: Expedir renovacion - Cambios realizados
Meta:
@manual
Given cotice la renovacion de una poliza
When realice modificaciones en asegurado, informacion de poliza, vehiculo, coberturas
Then se debe expedir la renovacion de poliza con los cambios realizados en cada una de las pantallas.

Scenario: Expedir renovacion sin plan de pagos
Meta:
@manual
Given he cotizando una renovacion de poliza
And no indique el plan de pagos
When emita la renovacion de la poliza
Then no se debe permitir expedir la poliza

Scenario: Expedir renovacion con plan de pagos
Meta:
@manual
Given he cotizando una renovacion de poliza
And indique el plan de pagos
When emita la renovacion de la poliza
Then se debe permitir expedir poliza


