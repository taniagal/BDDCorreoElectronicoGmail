Meta:
@lote3
@sprint 14
@tag equipo: 4

Narrative:
Como usuario de policy center
Al cotizar una poliza de PA
Quiero ser capaz de aplicarla para los automoviles, camperos y pickup, y bicicletas una tasa diferente a la tasa dada por la tarifa tecnica en las coberturas de PT Daños y Hurto.


Scenario:  Realizar una cotizacion de autos con comision pactada en si y valor 15 y validar UW
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza:
|cuenta     |producto|oficina|agente_oficina |tipoPoliza |
|C1060447895|Autos   |1059   |RANGEL         |Individual |
When ingrese la comision pactada en valor <valor>
And ingrese los datos del asegurado <tipo_documento> <documento>
And ingrese los datos de vehiculo:
|placa |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis|motor|valor_asegurado|descuento|recargo|zona|plan              |medioVenta|
|random|2011  |01601225        |MEDELLIN          |Particular       |null  |null |17900000       |null     |null   |2   |Plan Autos Clásico|Televentas|
And ingrese la bonificacion tecnica <bonoT> y la comercial <bonoC>
And seleccione todas las coberturas de comision pactada:
|limite|deducible|PTH|PPH|GTH|AS                |PTD|PPD|GT|CRPP|CRPT|
|1.440 |0        |0  |730|40.|Asistencia Clásica|0  |730|40|16  |20  |
Then el resultado de la tarifacion debe ser prima <prima> iva <iva> costo total <costo>
And expido la poliza
And se debe generar un UW con el mensaje <mensaje>

Examples:
|tipo_documento      |documento |prima    |iva    |costo    |valor|bonoT|bonoC|mensaje                                |
|CEDULA DE CIUDADANIA|1060447895|2.346.898|445.911|2.792.809|15   |0    |0    |La comisión pactada debe ser autorizada|
