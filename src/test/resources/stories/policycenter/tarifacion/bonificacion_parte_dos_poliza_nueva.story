Meta:
@lote1
@sprint 12
@tag equipo: 4


Narrative:
Como usuario de policy center
Deseo poder obtener y/o agregar la bonificacion comercial y la tecnica a un vehiculo durante una cotizacion

Scenario: Verificar generacion de UW Issue al cambiar la bonificacion consultada Poliza Nueva.
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza:
|cuenta     |organizacion|producto|canal            |tipoPoliza |
|C1060447895|Sura        |Autos   |Canal Tradicional|Individual |
When ingrese los datos del asegurado <tipo_documento> <documento>
And ingrese los datos de vehiculo:
|placa |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis|motor|valor_asegurado|descuento|recargo|zona|plan        |
|CYU123|2016  |00601182        |MEDELLIN          |Particular       |null  |null |165900000      |null     |null   |2   |Plan Modular|
And ingrese la bonificacion tecnica <bonoT> y la comercial <bonoC>
And ingrese las coberturas:
|limite|deducible|abogado |PLlaves |
|1.440 |0        |Opción 1|Opción 1|
And expido la poliza
Then se debe generar un UW con el mensaje <mensaje>

Examples:
|bonoT|bonoC|tipo_documento      |documento |mensaje|
|10   |10   |CEDULA DE CIUDADANIA|1060447895|La bonificación no coincide con lo arrojado por el sistema, Favor verificar|