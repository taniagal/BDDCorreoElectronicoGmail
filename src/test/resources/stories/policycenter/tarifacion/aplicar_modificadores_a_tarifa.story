Meta:
@lote1
@sprint 7
@tag equipo: 4
@local

Narrative:
Como usuario de PolicyCenter
Quiero ser capaz de aplicar a la tarifa los modificadores que se encuentran a nivel de la póliza y a nivel de riesgo.

Scenario: Realizar una cotizacion de autos con modificadores de tarifa
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza:
|cuenta     |producto|tipoPoliza|
|C1060447895|Autos   |Individual|
When ingrese los datos del asegurado <tipo_documento> <documento>
And ingrese los datos de vehiculo:
|placa |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis|motor|valor_asegurado|descuento|recargo|zona|plan        |
|TCU107|2016  |00601182        |MEDELLIN          |Particular       |null  |null |165900000      |null     |null   |2   |Plan Modular|
And ingrese los valores de los modificadores de la tarifa:
|descientoD|bonificacionC|descuento|recargo|suavizacion|bonificacionT|
|GPS Sura  | 45          |10       | 5     | 3         |5            |
And seleccione algunas las coberturas:
|limite|deducible|abogado|PTH|PPH|PPHF|GTH|AC|Taller|Grua|TM|CE|CS  |PTD|PPD|PPDF|GT|CRPP|CRPT|GTR|GP|PLlaves|
|640.  |0        |Si     |0  |750|1.50|40.|35|Conces|Plus|Si|6 |Plus|0  |750|1.50|40|20  |20  |Si |Si|Si     |
Then el valor del monto en cada cobertura debe ser:
|fila|valor     |
|1   |383.997   |
|4   |2.101.302 |
|8   |564.279   |
|12  |7.036     |
|15  |8.021     |
|17  |11.825    |
|19  |26.128    |
|21  |11.825    |
|23  |11.825    |
|25  |11.825    |
|27  |11.825    |
|29  |11.825    |
|31  |11.825    |
|33  |11.825    |

Examples:
|tipo_documento      |documento|
|CEDULA DE CIUDADANIA|11111111 |
