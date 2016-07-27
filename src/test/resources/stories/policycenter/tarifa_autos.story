Meta:
@issue CDSEG-1348

Narrative:
Como usuario de policy center
Al cotizar una poliza de PA quiero ser capaz de registrar toda la información del vehiculo.


Scenario:  Tarifa Autos - Cobertura RC
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza para la cuenta <cuenta> y producto <producto>
When ingrese la informacion de la poliza:
|organizacion|canal            |tipo_poliza|
|Sura        |Canal Tradicional|PPAutos    |
And ingrese los datos del asegurado
And ingrese los datos del vehiculo:
|placa |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis|motor|valor_asegurado|
|T64701|2011  |01601225        |MEDELLIN          |Particular       |null  |null |null           |
And ingrese las coberturas:
|limite|deducible|
|840   |0        |
Then el resultado de la cotizacion debe ser

Examples:
|cuenta     |producto|
|C000888888 |Autos   |