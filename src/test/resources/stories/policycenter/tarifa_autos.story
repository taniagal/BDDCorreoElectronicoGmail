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
|placa |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis|motor|valor_asegurado|descuento|recargo|zona|plan        |
|TYU140|2016  |00601182        |MEDELLIN          |Particular       |null  |null |165900000      |null     |null   |2   |Plan Modular|
And ingrese las coberturas:
|limite|deducible|abogado |
|32    |0        |Opción 1|
Then el resultado de la cotizacion debe ser <valor>

Examples:
|valor  |
|421.825|


Scenario:  Realizar una cotizacion con todas las coberturas para autos
Given estoy cotizando una poliza:
|cuenta     |organizacion|producto|canal            |
|C1060447895|Sura        |Autos   |Canal Tradicional|
When ingrese los datos del asegurado
And ingrese los datos del vehiculo:
|placa |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis|motor|valor_asegurado|descuento|recargo|zona|plan        |
|TAU103|2016  |00601182        |MEDELLIN          |Particular       |null  |null |165900000      |null     |null   |2   |Plan Modular|
And seleccione todas las coberturas:
|limite|deducible|abogado |PTH|PPH|PPHF|GTH|AC|AS                |Taller|Grua|CE|CS  |PTD|PPD|PPDF|GT|PP|PT|GTR     |GP      |
|32    |0        |Opción 1|10 |910|1.50|40.|35|Asistencia Clásica|Conces|Plus|6 |Plus|10 |0  |1.50|40|16|20|Opción 1|Opción 1|
Then el resultado de la cotizacion en cada cobertura debe ser:
|fila|valor     |
|1   |421.825   |
|4   |6.087.596 |
|9   |1.384.737 |
|14  |127.281   |
|17  |17.500    |
|19  |25.799    |
|21  |57.007    |
|23  |25.799    |
|25  |25.799    |
|27  |25.799    |
|29  |25.799    |
|31  |25.799    |
|33  |25.799    |

Examples:
||
||
