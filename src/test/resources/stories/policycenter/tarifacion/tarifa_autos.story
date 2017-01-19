Meta:
@lote1
@sprint 5
@tag team: 4
@local

Narrative:
Como usuario de policy center
Al cotizar una poliza de PA quiero ser capaz de registrar toda la información del vehiculo.


Scenario:  Tarifa Autos - Cobertura RC
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza:
|cuenta     |organizacion|producto|canal            |tipoPoliza |
|C1060447895|Sura        |Autos   |Canal Tradicional|Individual |
When ingrese los datos del asegurado <tipo_documento> <documento>
And ingrese los datos del vehiculo:
|placa |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis|motor|valor_asegurado|descuento|recargo|zona|plan        |
|TYU140|2016  |00601182        |MEDELLIN          |Particular       |null  |null |165900000      |null     |null   |2   |Plan Modular|
And ingrese las coberturas:
|limite|deducible|abogado |PLlaves |
|1.440 |0        |Opción 1|Opción 1|
Then el resultado de la cotizacion debe ser <valor>

Examples:
|valor  |tipo_documento      |documento |
|975.890|CEDULA DE CIUDADANIA|1060447895|



Scenario:  Realizar una cotizacion con todas las coberturas para autos
Given estoy cotizando una poliza:
|cuenta     |organizacion|producto|canal            |tipoPoliza |
|C1060447895|Sura        |Autos   |Canal Tradicional|Individual    |
When ingrese los datos del asegurado <tipo_documento> <documento>
And ingrese los datos del vehiculo:
|placa |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis|motor|valor_asegurado|descuento|recargo|zona|plan        |
|TAU103|2016  |00601182        |MEDELLIN          |Particular       |null  |null |165900000      |null     |null   |2   |Plan Modular|
And seleccione todas las coberturas:
|limite|deducible|abogado |PTH|PPH|PPHF|GTH|AC|AS                |Taller|Grua|TM      |CE|CS  |PTD|PPD|PPDF|GT|PP|PT|GTR     |GP      |PLlaves |
|1.440 |0        |Opción 1|10 |910|1.50|40.|35|Asistencia Clásica|Conces|Plus|Taller 1|6 |Plus|10 |0  |1.50|40|16|20|Opción 1|Opción 1|Opción 1|
Then el resultado de la cotizacion en cada cobertura debe ser:
|fila|valor     |
|1   |975.890   |
|4   |6.330.728 |
|8   |1.600.515 |
|12  |15.352    |
|15  |17.500    |
|17  |25.799    |
|19  |57.007    |
|21  |25.799    |
|23  |25.799    |
|25  |25.799    |
|27  |25.799    |
|29  |25.799    |
|31  |25.799    |
|33  |25.799    |

Examples:
|tipo_documento      |documento |
|CEDULA DE CIUDADANIA|1060447895|