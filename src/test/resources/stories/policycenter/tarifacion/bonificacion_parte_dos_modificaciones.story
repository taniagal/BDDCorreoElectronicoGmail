Meta:
@lote1
@sprint 12
@tag equipo: 4


Narrative:
Como usuario de policy center
Deseo poder obtener y/o agregar la bonificacion comercial y la tecnica a un vehiculo durante una cotizacion o modificacion

Scenario: Verificar generacion de UW Issue al cambiar la bonificacion consultada Cambio de Poliza.
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza:
|cuenta     |producto|tipoPoliza |
|C1060447895|Autos   |Individual |
When ingrese los datos del asegurado <tipo_documento> <documento>
And ingrese los datos del vehiculo:
|placa |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis|motor|valor_asegurado|descuento|recargo|zona|plan        |medioVenta|
|random|2016  |00601182        |MEDELLIN          |Particular       |null  |null |165900000      |null     |null   |2   |Plan Modular|Televentas|
And ingrese las coberturas:
|limite|deducible|abogado|PLlaves|
|640.  |0        |Si     |Si     |
And expido la poliza y voy al archivo de poliza
And comience el cambio de poliza
And cambio la bonificacion tecnica <bonoT>
And cotice y expida la poliza
Then se debe generar un UW con el mensaje <mensaje>

Examples:
|tipo_documento      |documento|bonoT|mensaje|
|CEDULA DE CIUDADANIA|11111111 |2    |La bonificación no coincide con lo arrojado por el sistema, Favor verificar|



Scenario: Verificar generacion de UW Issue al cambiar la bonificacion consultada y la fecha de inicio de vigencia del cambio de poliza.
Given estoy cotizando una poliza:
|cuenta     |producto|tipoPoliza |
|C1060447895|Autos   |Individual |
When ingrese los datos del asegurado <tipo_documento> <documento>
And ingrese los datos del vehiculo:
|placa |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis|motor|valor_asegurado|descuento|recargo|zona|plan        |medioVenta|
|random|2016  |00601182        |MEDELLIN          |Particular       |null  |null |165900000      |null     |null   |2   |Plan Modular|Televentas|
And ingrese las coberturas:
|limite|deducible|abogado|PLlaves|
|640.  |0        |Si     |Si     |
And expido la poliza y voy al archivo de poliza
And cambio la fecha de vigencia
And cambio la bonificacion tecnica <bonoT>
And cotice y expida la poliza
Then se debe generar un UW con el mensaje <mensaje>

Examples:
|tipo_documento      |documento |bonoT|mensaje|
|CEDULA DE CIUDADANIA|1397450166|2    |La Bonificacion se ha modificado con una fecha superior a 30 dias|