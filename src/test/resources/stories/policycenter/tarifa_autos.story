Tarifa Autos

Meta:
@issue #CDSEG-1348
@sprint 5
@tag automator: nelson_jhair_mosquera_palacios
@local

Narrative:
Como usuario de policy center
Al cotizar una poliza de PA quiero ser capaz de registrar toda la información del vehiculo.


Scenario:  Tarifa Autos - Cobertura RC
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza:
|cuenta     |organizacion|producto|canal            |
|C1060447895|Sura        |Autos   |Canal Tradicional|
When ingrese los datos del asegurado
And ingrese los datos del vehiculo:
|placa |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis|motor|valor_asegurado|descuento|recargo|zona|
|TYU142|2016  |00601182        |MEDELLIN          |Particular       |null  |null |165900000      |null     |null   |2|
And ingrese las coberturas:
|limite|deducible|abogado |
|32    |0        |Opción 1|
Then el resultado de la cotizacion debe ser <valor>

Examples:
|valor  |
|196,733|


Scenario:  Realizar una cotizacion con todas las coberturas para autosGiven estoy cotizando una poliza
Given estoy cotizando una poliza:
|cuenta     |organizacion|producto|canal            |
|C1060447895|Sura        |Autos   |Canal Tradicional|
When ingrese los datos del asegurado
And ingrese los datos del vehiculo:
|placa |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis|motor|valor_asegurado|descuento|recargo|zona|
|TCU102|2016  |52525252        |MEDELLIN          |Particular       |null  |null |10000000       |null     |null   |2|
And seleccione todas las coberturas:
|limite|deducible|abogado |PTH|PPH|PPHF|GTH|AC|AS                |Taller|Grua|CE|CS  |PTD|PPD|PPDF|GT|PP|PT|
|32    |0        |Opción 1|10 |910|1.50|40.|35|Asistencia Clásica|Conces|Plus|6 |Plus|10 |0  |1.50|40|16|20|
Then el resultado de la cotizacion en cada cobertura debe ser:
|fila|valor      |
|1   |196,733    |
|4   |3,740,181  |
|9   |831,912    |
|14  |127,802    |
|17  |7,000      |
|19  |25,143     |
|21  |180,000    |
|23  |50,000     |
|25  |25,143     |
|27  |25,143     |
|29  |25,143     |
|31  |25,143     |

Examples:
||
||
