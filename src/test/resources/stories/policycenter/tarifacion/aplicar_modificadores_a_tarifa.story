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
|placa |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis|motor|valor_asegurado|descuento|recargo|zona|plan        |medioVenta|
|TCU107|2016  |00601182        |MEDELLIN          |Particular       |null  |null |165900000      |null     |null   |2   |Plan Modular|Televentas|
And ingrese los valores de los modificadores de la tarifa:
|descientoD|bonificacionC|descuento|recargo|suavizacion|bonificacionT|
|GPS Sura  | 45          |10       | 5     | 3         |5            |
And seleccione algunas las coberturas:
|limite|deducible|abogado|PTH|GTH|AC|Taller|Grua|TM|CE|CS  |PTD|GT|CRPP|CRPT|GTR|GP|PLlaves|PPD      |
|640.  |0        |Si     |0  |40.|35|Conces|Plus|Si|6 |Plus|0  |40|20  |20  |Si |Si|Si     |<ninguno>|
Then el valor del monto en cada cobertura debe ser:
|descripcion                          |valor    |
|Cobertura de Responsabilidad Civil   |289.477  |
|Cobertura de Daños                   |2.566.896|
|Cobertura de Hurto                   |1.356.501|
|Cobertura de Vehículo de Reemplazo   |10.641   |
|Cobertura de Accidentes al Conductor |10.026   |
|Cobertura de Pérdida de Llaves       |16.850   |
|Cobertura de Taller                  |39.511   |
|Cobertura de Taller móvil y cerrajero|16.850   |
|Cobertura de Conductor Elegido       |16.850   |
|Cobertura de Gastos de Traspaso      |16.850   |
|Cobertura de Gasto de Parqueadero    |16.850   |
|Cobertura de Centro de Servicio      |16.850   |
|Cobertura de Abogado                 |16.850   |

Examples:
|tipo_documento      |documento  |
|CEDULA DE CIUDADANIA|1234567896 |
