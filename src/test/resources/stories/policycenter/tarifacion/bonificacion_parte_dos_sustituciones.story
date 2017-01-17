Bonificacion Parte Dos Sustituciones

Meta:
@lote1
@issue #CDSEG-5576
@Sprint 12
@tag automator: nelson_jhair_mosquera_palacios


Narrative:
Como usuario de policy center
Deseo poder obtener y/o agregar la bonificacion comercial y la tecnica a un vehiculo durante una cotizacion o sustitucion

Scenario: Realizar una sustitucion tanto la bonificacion tecnica como comercial
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

Examples:
|tipo_documento      |documento|bonoT|bonoC|bonoCo|placa |plan                      |
|CEDULA DE CIUDADANIA|11111111 |0    |38   |18    |CYU123|Plan Utilitarios y Pesados|
