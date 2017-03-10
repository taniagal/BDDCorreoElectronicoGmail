Meta:
@lote1
@sprint 5
@tag equipo: 4

Narrative:
Como usuario de policy center
Al cotizar una poliza de PA quiero ser capaz de registrar toda la información del vehiculo.


Scenario:  Tarifa Autos - Cobertura RC
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza:
|cuenta     |producto|tipoPoliza |
|C1060447895|Autos   |Individual |
When ingrese los datos del asegurado <tipo_documento> <documento>
And ingrese los datos del vehiculo:
|placa |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis|motor|valor_asegurado|descuento|recargo|zona|plan        |medioVenta|
|TYU140|2016  |00601182        |MEDELLIN          |Particular       |null  |null |165900000      |null     |null   |2   |Plan Modular|Televentas|
And ingrese las coberturas:
|limite|deducible|abogado |
|640.  |0        |Si      |
Then el resultado de la cotizacion debe ser <valor>

Examples:
|valor  |tipo_documento      |documento |
|631.598|CEDULA DE CIUDADANIA|1060447895|



Scenario:  Realizar una cotizacion con todas las coberturas para autos
Given estoy cotizando una poliza:
|cuenta     |producto|tipoPoliza |
|C1060447895|Autos   |Individual |
When ingrese los datos del asegurado <tipo_documento> <documento>
And ingrese los datos del vehiculo:
|placa |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis|motor|valor_asegurado|descuento|recargo|zona|plan        |medioVenta|
|TAU103|2016  |00601182        |MEDELLIN          |Particular       |null  |null |165900000      |null     |null   |2   |Plan Modular|Televentas|
And seleccione todas las coberturas:
|limite|deducible|abogado |PTH|PPH|GTH|AC|Taller|Grua|TM|CE|CS  |PTD|PPD|GT|PP|CRPT|GTR|GP|PLlaves|
|640.  |0        |Si      |0  |750|40.|35|Conces|Plus|Si|6 |Plus|0  |750|40|20|20  |Si |Si|Si     |
Then el valor del monto en cada cobertura debe ser:
|descripcion                          |valor    |
|Cobertura de Responsabilidad Civil   |631.598  |
|Cobertura de Daños                   |9.236.856|
|Cobertura de Hurto                   |4.994.363|
|Cobertura de Vehículo de Reemplazo   |23.216   |
|Cobertura de Accidentes al Conductor |21.875   |
|Cobertura de Pérdida de Llaves       |36.764   |
|Cobertura de Taller                  |86.208   |
|Cobertura de Taller móvil y cerrajero|36.764   |
|Cobertura de Conductor Elegido       |36.764   |
|Cobertura de Gastos de Traspaso      |36.764   |
|Cobertura de Gasto de Parqueadero    |36.764   |
|Cobertura de Centro de Servicio      |36.764   |
|Cobertura de Abogado                 |36.764   |

Examples:
|tipo_documento      |documento |
|CEDULA DE CIUDADANIA|1060447895|