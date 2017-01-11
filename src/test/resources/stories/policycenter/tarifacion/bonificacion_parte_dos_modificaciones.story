Bonificacion Parte Dos Modificaciones

Meta:
@lote1
@issue #CDSEG-5575
@Sprint 12
@tag automator: nelson_jhair_mosquera_palacios


Narrative:
Como usuario de policy center
Deseo poder obtener y/o agregar la bonificacion comercial y la tecnica a un vehiculo durante una cotizacion

Scenario: Verificar generacion de UW Issue al cambiar la bonificacion consultada Cambio de Poliza.
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza:
|cuenta     |organizacion|producto|canal            |tipoPoliza |
|C1060447895|Sura        |Autos   |Canal Tradicional|Individual |
When ingrese los datos del asegurado <tipo_documento> <documento>
And ingrese los datos del vehiculo:
|placa |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis|motor|valor_asegurado|descuento|recargo|zona|plan        |
|random|2016  |00601182        |MEDELLIN          |Particular       |null  |null |165900000      |null     |null   |2   |Plan Modular|
And ingrese las coberturas:
|limite|deducible|abogado |PLlaves |
|1.440 |0        |Opción 1|Opción 1|
And expido la poliza y voy al archivo de poliza
And comience el cambio de poliza
And cambio la bonificacion tecnica <bonoT>
And cotice una poliza
And expido la poliza
Then se debe generar un UW con el mensaje <mensaje>

Examples:
|tipo_documento      |documento |bonoT|mensaje|
|CEDULA DE CIUDADANIA|1060447895|2    |La bonificación no coincide con lo arrojado por el sistema, Favor verificar|



Scenario: Verificar generacion de UW Issue al cambiar la bonificacion consultada y la fecha de inicio de vigencia del cambio de poliza.
Given estoy cotizando una poliza:
|cuenta     |organizacion|producto|canal            |tipoPoliza |
|C1060447895|Sura        |Autos   |Canal Tradicional|Individual |
When ingrese los datos del asegurado <tipo_documento> <documento>
And ingrese los datos del vehiculo:
|placa |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis|motor|valor_asegurado|descuento|recargo|zona|plan        |
|random|2016  |00601182        |MEDELLIN          |Particular       |null  |null |165900000      |null     |null   |2   |Plan Modular|
And ingrese las coberturas:
|limite|deducible|abogado |PLlaves |
|1.440 |0        |Opción 1|Opción 1|
And expido la poliza y voy al archivo de poliza
And cambio la fecha de vigencia
And cambio la bonificacion tecnica <bonoT>
And cotice una poliza
And expido la poliza
Then se debe generar un UW con el mensaje <mensaje>

Examples:
|tipo_documento      |documento |bonoT|mensaje|
|CEDULA DE CIUDADANIA|1060447895|2    |La Bonificacion se ha modificado con una fecha superior a 30 dias|