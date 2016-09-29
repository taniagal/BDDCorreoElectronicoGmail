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
|placa |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis|motor|valor_asegurado|descuento|recargo|zona|plan        |
|TCU101|2016  |00601182        |MEDELLIN          |Particular       |null  |null |165900000      |null     |null   |2   |Plan Modular|
And ingrese los valores de los modificadores de la tarifa:
|descientoD|bonificacionC|descuento|recargo|suavizacion|bonificacionT|
|GPS Sura  | 45          |10       | 5     | 3         |5            |
And seleccione algunas las coberturas:
|limite|deducible|abogado |PTH|PPH|PPHF|GTH|AC|AS                |Taller|Grua|CE|CS  |PTD|PPD|PPDF|GT|PP|PT|GTR     |GP      |
|32    |0        |Opción 1|10 |910|1.50|40.|35|Asistencia Clásica|Conces|Plus|6 |Plus|10 |0  |1.50|40|16|20|Opción 1|Opción 1|
Then el valor del monto en cada cobertura debe ser:
|fila|valor     |valorSinMods|
|1   |69,717    |282,623   |
|4   |4,495,171 |4,078,689 |
|9   |792,841   |927,774   |
|14  |77,748    |85,279    |
|17  |4,258     |11,725    |
|19  |15,295    |17,285    |
|21  |185,400   |38,195    |
|23  |30,417    |17,285    |
|25  |15,295    |17,285    |
|27  |15,295    |17,285    |
|29  |15,295    |17,285    |
|31  |15,295    |17,285    |
|33  |15,295    |17,285    |

Examples:
||
||
