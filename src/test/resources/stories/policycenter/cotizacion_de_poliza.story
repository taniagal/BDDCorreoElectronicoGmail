Cotizacion De Poliza

Meta: @lote3

@issue #CDSEG-843
@tag automator: diego_cardona_acevedo
@local
@Sprint 3

Narrative:
Como usuario de Policy Center
debo poder realizar una cotizacion
para comenzar un proceso de expedicion con un cliente en caso de ser posible

Scenario:  Realizar una cotizacion con deseo de financiacion
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza:
|cuenta     |organizacion|producto|canal            |tipoPoliza |
|C1060447895|Sura        |Autos   |Canal Tradicional|PPAutos    |
When indique que deseo financiar la poliza
And indique el numero de cuotas
And seleccione la opcion siguiente
And se muestre el mensaje <mensaje> de advertencia de financiacion
And ingrese los datos del asegurado <tipo_documento> <documento>
And ingrese los datos del vehiculo:
|placa |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis|motor|valor_asegurado|descuento|recargo|zona|plan        |
|TAU105|2016  |00601182        |MEDELLIN          |Particular       |null  |null |165900000      |null     |null   |2   |Plan Modular|
And seleccione todas las coberturas:
|limite|deducible|abogado |PTH|PPH|PPHF|GTH|AC|AS                |Taller|Grua|TM      |CE|CS  |PTD|PPD|PPDF|GT|PP|PT|GTR     |GP      |PLlaves |
|1.440 |0        |Opción 1|10 |910|1.50|40.|35|Asistencia Clásica|Conces|Plus|Taller 1|6 |Plus|10 |0  |1.50|40|16|20|Opción 1|Opción 1|Opción 1|
Then se debe mostrar un mensaje <mensaje> como advertencia

Examples:
|tipo_documento      |documento |mensaje |
|CEDULA DE CIUDADANIA|1060447895|La financiación de la póliza está sujeta a aprobación por parte del área de financiación.|