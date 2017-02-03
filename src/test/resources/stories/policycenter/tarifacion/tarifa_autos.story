Meta:
@lote1
@sprint 5
@tag equipo: 4
@local

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
|placa |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis|motor|valor_asegurado|descuento|recargo|zona|plan        |
|TYU140|2016  |00601182        |MEDELLIN          |Particular       |null  |null |165900000      |null     |null   |2   |Plan Modular|
And ingrese las coberturas:
|limite|deducible|abogado |PLlaves |
|640.  |0        |Si      |Si      |
Then el resultado de la cotizacion debe ser <valor>

Examples:
|valor  |tipo_documento      |documento |
|837.825|CEDULA DE CIUDADANIA|1060447895|



Scenario:  Realizar una cotizacion con todas las coberturas para autos
Given estoy cotizando una poliza:
|cuenta     |producto|tipoPoliza |
|C1060447895|Autos   |Individual |
When ingrese los datos del asegurado <tipo_documento> <documento>
And ingrese los datos del vehiculo:
|placa |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis|motor|valor_asegurado|descuento|recargo|zona|plan        |
|TAU103|2016  |00601182        |MEDELLIN          |Particular       |null  |null |165900000      |null     |null   |2   |Plan Modular|
And seleccione todas las coberturas:
|limite|deducible|abogado |PTH|PPH|PPHF|GTH|AC|Taller|Grua|TM|CE|CS  |PTD|PPD|PPDF|GT|PP|PT|GTR|GP|PLlaves|
|640.  |0        |Si      |0  |750|1.50|40.|35|Conces|Plus|Si|6 |Plus|0  |750|1.50|40|20|20|Si |Si|Si     |
Then el resultado de la cotizacion en cada cobertura debe ser:
|fila|valor     |
|1   |837.825   |
|4   |4.584.739 |
|8   |1.793.873 |
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