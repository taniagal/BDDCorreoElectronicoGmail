Meta:
@lote4
@tag equipo: 4, sprint: 15

Narrative:
Como usuario de policy center
Al cotizar una poliza de PA (Autos o MRC) que tenga reaseguro aceptado
Quiero validar que el IVA debe ser cero

Scenario:  Realizar una cotizacion de autos donde el coaseguro es aceptado
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza:
|cuenta     |producto|oficina|agente_oficina |tipoPoliza |
|C1060447895|Autos   |1059   |RANGEL         |Individual |
When quiero agregar coaseguro <TipoCo> con poliza referencia <PolizaRef> documento <Documento> y particion de aseguradoras
| ASEGURADORA                         | PARTICIPACION |
| Seguros Generales Suramericana S.A. | 60            |
| ACE SEGUROS S.A                     | 40            |
And de clic en Aceptar de la ventana Coaseguro
And ingrese los datos del asegurado <tipo_documento> <documento>
And ingrese los datos de vehiculo:
|placa |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis|motor|valor_asegurado|descuento|recargo|zona|plan              |medioVenta|cero_kilometros|
|NEL600|2018  |01601146        |MEDELLIN          |Particular       |null  |null |32000000       |null     |null   |2   |Plan Autos Clásico|Televentas|Si             |
And ingrese la bonificacion tecnica <bonoT> y la comercial <bonoC>
And seleccione todas las coberturas de comision pactada:
|limite|deducible|PTH|PPH|GTH|AS                |PTD|PPD|GT|CRPP|CRPT|PLlaves|
|1.440 |0        |0  |835|40.|Asistencia Clásica|0  |835|40|16  |20  |       |
Then el resultado de la tarifacion debe ser prima <prima> iva <iva> costo total <costo>

Examples:
|tipo_documento      |documento |prima    |iva |costo    |bonoT|bonoC|TipoCo  |PolizaRef  |Documento|
|CEDULA DE CIUDADANIA|1060447895|2.509.069|0   |2.509.069|0    |0    |Aceptado|C1060447895|123456789|


Scenario:  Realizar una cotizacion de autos donde el coaseguro es cedido
Given estoy cotizando una poliza:
|cuenta     |producto|oficina|agente_oficina |tipoPoliza |
|C1060447895|Autos   |1059   |RANGEL         |Individual |
When quiero agregar coaseguro <TipoCo> con poliza referencia <PolizaRef> documento <Documento> y particion de aseguradoras
| ASEGURADORA                         | PARTICIPACION |
| Seguros Generales Suramericana S.A. | 55            |
| ACE SEGUROS S.A                     | 45            |
And de clic en Aceptar de la ventana Coaseguro
And ingrese los datos del asegurado <tipo_documento> <documento>
And ingrese los datos de vehiculo:
|placa |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis|motor|valor_asegurado|descuento|recargo|zona|plan              |medioVenta|cero_kilometros|
|NEL600|2018  |01601146        |MEDELLIN          |Particular       |null  |null |32000000       |null     |null   |2   |Plan Autos Clásico|Televentas|Si             |
And ingrese la bonificacion tecnica <bonoT> y la comercial <bonoC>
And seleccione todas las coberturas de comision pactada:
|limite|deducible|PTH|PPH|GTH|AS                |PTD|PPD|GT|CRPP|CRPT|PLlaves|
|1.440 |0        |0  |835|40.|Asistencia Clásica|0  |835|40|16  |20  |       |
Then el resultado de la tarifacion debe ser prima <prima> iva <iva> costo total <costo>

Examples:
|tipo_documento      |documento |prima    |iva    |costo    |bonoT|bonoC|TipoCo|PolizaRef|Documento|
|CEDULA DE CIUDADANIA|1060447895|2.509.069|476.723|2.985.792|0    |0    |Cedido|         |         |
