Meta:
@lote1
@Sprint 12
@tag equipo: 4


Narrative:
Como usuario de policy center
Deseo poder obtener y/o agregar la bonificacion comercial y la tecnica a un vehiculo durante una cotizacion o sustitucion

Scenario: Realizar una sustitucion tanto la bonificacion tecnica como comercial
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
And comience una sustitucion
Then se debe conservar la bonificacion <bonoC> calculada con los siguientes planes:
|plan              |
|Plan Autos Clásico|
|Plan Autos Global |
|Plan Conduce Mejor|
|Plan Motos        |
And se debe recalcular la bonificacion como poliza nueva con el plan <plan> <placa> <bonoCo>
And al cambiar el asegurado se debe recalcular la bonificacion como poliza nueva:
|tipo_documento      |documento |bonoC|bonoT|
|CEDULA DE CIUDADANIA|1060447895|0    |20   |
When cambio la bonificacion tecnica <bonoTec>
And cotice y expida la sustitucion
Then se debe generar un UW con el mensaje <mensaje>

Examples:
|tipo_documento      |documento|bonoT|bonoTec|bonoC|bonoCo|placa |plan                      |mensaje                                                                    |
|CEDULA DE CIUDADANIA|11111111 |0    |5      |38   |18    |CYU123|Plan Utilitarios y Pesados|La bonificación no coincide con lo arrojado por el sistema, Favor verificar|
