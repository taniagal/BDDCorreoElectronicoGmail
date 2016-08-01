Meta:
@issue CDSEG-1348

Narrative:
Como usuario de policy center
Al cotizar una poliza de PA quiero ser capaz de registrar toda la información del vehiculo.


Scenario:  Tarifa Autos - Cobertura RC
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza:
|cuenta    |organizacion|producto|canal            |
|C000888888|Sura        |Autos   |Canal Tradicional|
When ingrese la informacion de la poliza:
|organizacion|canal            |tipo_poliza|
|Sura        |Canal Tradicional|PPAutos    |
And ingrese los datos del asegurado
And ingrese los datos del vehiculo:
|placa |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis|motor|valor_asegurado|
|T01706|2011  |01601225        |MEDELLIN          |Particular       |null  |null |null           |
And ingrese las coberturas:
|limite|deducible|abogado |
|32    |0        |Opción 1|
Then el resultado de la cotizacion debe ser <valor>

Examples:
|valor     |
|247,667.00|


Scenario:  Realizar una cotizacion con todas las coberturas para autosGiven estoy cotizando una poliza:
Given estoy cotizando una poliza:
|cuenta    |organizacion|producto|canal            |
|C000888888|Sura        |Autos   |Canal Tradicional|
When ingrese la informacion de la poliza:
|organizacion|canal            |tipo_poliza|
|Sura        |Canal Tradicional|PPAutos    |
And ingrese los datos del asegurado
And ingrese los datos del vehiculo:
|placa |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis|motor|valor_asegurado|
|T0170|2016  |00601182        |MEDELLIN          |Particular       |null  |null |null           |
And seleccione todas las coberturas:
|limite|deducible|abogado |PTH|PPH|PPHF|GTH|AC|AS                |Taller|Grua|TM    |CE|CS  |PTD|PPD|PPDF|GT|PP|PT|
|32    |0        |Opción 1|10 |730|1.50|40.|35|Asistencia Clásica|Conces|Plus|Taller|6 |Plus|10 |0  |1.50|40|16|20|
Then el resultado de la cotizacion en cada cobertura debe ser:
|fila|valor     |
|1 |639,374.00  |
|4 |434.00      |
|9 |27,087.00   |
|14|3,115,831.00|
|17|1.00        |
|21|23,191.00   |
|23|1,122,509.00|
|25|218,582.00  |
|27|8,960.00    |
|29|11,329.00   |

Examples:
||
||