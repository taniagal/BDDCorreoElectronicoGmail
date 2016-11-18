Aplicar Modificadores A Tarifa

Meta: @lote2
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
|cuenta     |organizacion|producto|canal            |tipoPoliza |
|C1060447895|Sura        |Autos   |Canal Tradicional|PPAutos    |
When ingrese los datos del asegurado <tipo_documento> <documento>
And ingrese los datos de vehiculo:
|placa |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis|motor|valor_asegurado|descuento|recargo|zona|plan        |
|TCU107|2016  |00601182        |MEDELLIN          |Particular       |null  |null |165900000      |null     |null   |2   |Plan Modular|
And ingrese los valores de los modificadores de la tarifa:
|descientoD|bonificacionC|descuento|recargo|suavizacion|bonificacionT|
|GPS Sura  | 45          |10       | 5     | 3         |5            |
And seleccione algunas las coberturas:
|limite|deducible|abogado |PTH|PPH|PPHF|GTH|AC|AS                |Taller|Grua        |TM      |CE|CS  |PTD|PPD|PPDF|GT|PP|PT|GTR     |GP      |PLlaves |
|1.440 |0        |Opción 1|10 |910|1.50|40.|35|Asistencia Clásica|Conces|Plus 1000 km|Taller 1|6 |Plus|10 |0  |1.50|40|16|20|Opción 1|Opción 1|Opción 1|
Then el valor del monto en cada cobertura debe ser:
|fila|valor     |
|1   |447.275   |
|4   |2.790.097 |
|8   |437.552   |
|12  |7.036     |
|15  |8.021     |
|17  |11.824    |
|19  |26.128    |
|21  |11.824    |
|23  |11.824    |
|25  |11.824    |
|27  |11.824    |
|29  |11.824    |
|31  |11.824    |
|33  |11.824    |

Examples:
|tipo_documento      |documento |
|CEDULA DE CIUDADANIA|1060447895|
