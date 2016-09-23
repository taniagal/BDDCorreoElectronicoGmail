Aplicar Modificadores A Tarifa

Meta:
@issue #CDSEG-2421
@sprint 7
@tag automator: nelson_jhair_mosquera_palacios
@local

Narrative:
Como usuario de PolicyCenter
Quiero ser capaz de aplicar a la tarifa los modificadores que se encuentran a nivel de la póliza y a nivel de riesgo.

Scenario: Realizar una cotizacion de autos con modificadores de tarifa
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza:
|cuenta     |organizacion|producto|canal            |
|C1060447895|Sura        |Autos   |Canal Tradicional|
When ingrese los datos del asegurado
And ingrese los datos de vehiculo:
|placa |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis|motor|valor_asegurado|descuento|recargo|zona|
|TCU101|2016  |52525252        |MEDELLIN          |Particular       |null  |null |10000000       |null     |null   |2|
And ingrese los valores de los modificadores de la tarifa:
|descientoD|bonificacionC|descuento|recargo|suavizacion|bonificacionT|
|GPS Sura  | 45          |10       | 5     | 3         |5            |
And seleccione algunas las coberturas:
|limite|deducible|abogado |PTH|PPH|PPHF|GTH|AC|AS                |Taller|Grua|CE|CS  |PTD|PPD|PPDF|GT|PP|PT|
|32    |0        |Opción 1|10 |910|1.50|40.|35|Asistencia Clásica|Conces|Plus|6 |Plus|10 |0  |1.50|40|16|20|
Then el resultado de la cotizacion en cada cobertura debe ser:
|fila|valor     |valorSinMods|
|1   |154,135   |326,211     |
|4   |1,922,851 |4,382,355   |
|9   |11,763    |97,633.00   |
|14  |185,834   |127,281     |
|17  |3,407     |7,000       |
|19  |32,201    |22,055      |
|21  |195,700   |190,000     |
|23  |60,343    |41,330      |
|25  |32,201    |22,055      |
|27  |32,201    |22,055      |
|29  |32,201    |22,055      |
|31  |32,201    |22,055      |

Examples:
||
||
