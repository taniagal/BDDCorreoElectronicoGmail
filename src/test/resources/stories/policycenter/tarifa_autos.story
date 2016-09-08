Tarifa Autos

Meta:
@issue #CDSEG-1348
@automatizador Nelson Mosquera
@sprint 5

Narrative:
Como usuario de policy center
Al cotizar una poliza de PA quiero ser capaz de registrar toda la información del vehiculo.


Scenario:  Tarifa Autos - Cobertura RC
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza:
|cuenta    |organizacion|producto|canal            |
|C000222333|Sura        |Autos   |Canal Tradicional|
When ingrese los datos del asegurado
And ingrese los datos del vehiculo:
|placa |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis|motor|valor_asegurado|descuento|recargo|zona|
|T10001|2011  |01601225        |MEDELLIN          |Particular       |null  |null |$17,900,000    |null     |null   |2|
And ingrese las coberturas:
|limite|deducible|abogado |
|32    |0        |Opción 1|
Then el resultado de la cotizacion debe ser <valor>

Examples:
|valor  |
|196,733|


Scenario:  Realizar una cotizacion con todas las coberturas para autosGiven estoy cotizando una poliza
Given estoy cotizando una poliza:
|cuenta    |organizacion|producto|canal            |
|C000222333|Sura        |Autos   |Canal Tradicional|
When ingrese los datos del asegurado
And ingrese los datos del vehiculo:
|placa |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis|motor|valor_asegurado|descuento|recargo|zona|
|T10001|2016  |00601182        |MEDELLIN          |Particular       |null  |null |$165,900,000   |null     |null   |2|
And seleccione todas las coberturas:
|limite|deducible|abogado |PTH|PPH|PPHF|GTH|AC|AS                |Taller|Grua|CE|CS  |PTD|PPD|PPDF|GT|PP|PT|
|32    |0        |Opción 1|10 |910|1.50|40.|35|Asistencia Clásica|Conces|Plus|6 |Plus|10 |0  |1.50|40|16|20|
Then el resultado de la cotizacion en cada cobertura debe ser:
|fila|valor      |
|1   |326,211    |
|4   |4,279,806  |
|9   |1,674,510  |
|14  |$127,281   |
|17  |7,000      |
|19  |22,055     |
|21  |190,000    |
|23  |41,330     |
|25  |22,055     |
|27  |22,055     |
|29  |22,055     |
|31  |22,055     |
|33  |22,055     |

Examples:
||
||