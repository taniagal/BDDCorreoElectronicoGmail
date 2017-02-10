Meta:
@lote1
@sprint 14
@tag equipo: 4

Narrative:
Como usuario de policy center
Al cotizar una poliza de PA quiero ser capaz de utilizar la tarifa para el plan Alianza coberta.


Scenario:  Realizar una cotizacion de autos con comision pactada en si y valor 10
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza:
|cuenta     |producto|oficina|agente_oficina |tipoPoliza |
|C1060447895|Autos   |1059   |RANGEL         |Individual |
When ingrese la comision pactada en <estado> y valor <valor>
And ingrese los datos del asegurado <tipo_documento> <documento>
And ingrese los datos del vehiculo:
|placa |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis|motor|valor_asegurado|descuento|recargo|zona|plan              |
|UIY456|2011  |01601225        |MEDELLIN          |Particular       |null  |null |17900000       |null     |null   |2   |Plan Autos Clásico|
And seleccione todas las coberturas de comision pactada:
|limite|deducible|PTH|PPH|AS                |PTD|PPD|
|1.440 |0        |0  |730|Asistencia Clásica|0  |730|
And agregue un nuevo valor asegurado <valor_asegurado>
Then el resultado de la tarifacion debe ser prima <prima> iva <iva> costo total <costo>

Examples:
|valor_asegurado|tipo_documento      |documento |prima  |iva   |costo  |estado|valor|
|32000000       |CEDULA DE CIUDADANIA|1060447895|413.310|78.529|491.839|si    |10   |



Scenario:  Realizar una cotizacion donde la organización y canal son Corbeta en Bogota
Given estoy cotizando una poliza:
|cuenta     |producto|oficina|agente_oficina |tipoPoliza |
|C1060447895|Autos   |3550   |DIRECTO|Individual |
When ingrese los datos del asegurado <tipo_documento> <documento>
And ingrese los datos del vehiculo:
|placa |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis|motor|valor_asegurado|descuento|recargo|zona|plan           |
|UIY456|2016  |00601182        |BOGOTA, D.C.      |Particular       |null  |null |165900000      |null     |null   |1   |Alianza Corbeta|
And seleccione todas las coberturas corbeta:
|limite|deducible|PTH|AC  |PTD|
|320.00|0        |20 |null|20 |
And agregue un nuevo valor asegurado <valor_asegurado>
Then el resultado de la tarifacion debe ser prima <prima> iva <iva> costo total <costo>

Examples:
|valor_asegurado|tipo_documento      |documento |prima    |iva    |costo    |
|34500000       |CEDULA DE CIUDADANIA|1060447895|1.725.000|327.750|2.052.750|