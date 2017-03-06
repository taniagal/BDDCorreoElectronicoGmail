Meta:
@lote3
@sprint 15
@tag equipo: 4

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
|placa |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis|motor|valor_asegurado|descuento|recargo|zona|plan              |medioVenta|
|NEL600|2018  |1601146         |MEDELLIN          |Particular       |null  |null |0              |null     |null   |2   |Plan Autos Clásico|Televentas|
And seleccione que el vehiculo es cero kilometros
And ingrese la bonificacion tecnica <bonoT> y la comercial <bonoC>
And seleccione todas las coberturas de comision pactada:
|limite|deducible|PTH|PPH|GTH|AS                |PTD|PPD|GT|CRPP|CRPT|
|1.440 |0        |0  |730|40.|Asistencia Clásica|0  |730|40|16  |20  |
Then el resultado de la tarifacion debe ser prima <prima> iva <iva> costo total <costo>

Examples:
|tipo_documento      |documento |prima    |iva    |costo    |bonoT|bonoC|TipoCo  |PolizaRef  |Documento|
|CEDULA DE CIUDADANIA|1060447895|2.442.817|0,00   |2.442.817|0    |0    |Aceptado|C1060447895|123456789|


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
|placa |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis|motor|valor_asegurado|descuento|recargo|zona|plan              |medioVenta|
|NEL501|2018  |1601146         |MEDELLIN          |Particular       |null  |null |32000000       |null     |null   |2   |Plan Autos Clásico|Televentas|
And seleccione que el vehiculo es cero kilometros
And ingrese la bonificacion tecnica <bonoT> y la comercial <bonoC>
And seleccione todas las coberturas de comision pactada:
|limite|deducible|PTH|PPH|GTH|AS                |PTD|PPD|GT|CRPP|CRPT|
|1.440 |0        |0  |730|40.|Asistencia Clásica|0  |730|40|16  |20  |
Then el resultado de la tarifacion debe ser prima <prima> iva <iva> costo total <costo>

Examples:
|tipo_documento      |documento |prima    |iva    |costo    |bonoT|bonoC|TipoCo|PolizaRef|Documento|
|CEDULA DE CIUDADANIA|1060447895|2.442.817|464.135|2.906.952|0    |0    |Cedido|         |         |


Scenario:  Realizar una cotizacion de mrc donde el coaseguro es aceptado
Given estoy cotizando una poliza de mrc:
|producto               |oficina|agente_oficina|tipo_documento      |fecha_nacimiento|primer_nombre|primer_apellido|tipo_direccion         |direccion       |departamento|ciudad  |agente|
|Multiriesgo corporativo|1059   |RANGEL        |CEDULA DE CIUDADANIA|02/12/1990      |MIKASA        |AKERMAN       |DIRECCION DE RESIDENCIA|CALLE 54B #50-25|Antioquia   |Medellin|INT-3 |
When quiero agregar coaseguro <TipoCo> con poliza referencia <PolizaRef> documento <Documento> y particion de aseguradoras
| ASEGURADORA                         | PARTICIPACION |
| Seguros Generales Suramericana S.A. | 60            |
| ACE SEGUROS S.A                     | 40            |
And de clic en Aceptar de la ventana Coaseguro
And agregue una nueva ubicacion:
|departamento|ciudad  |direccion        |descripcion    |actividad                        |medioVenta|
|Antioquia   |Medellin|CR 44 A # 43 - 00|Core de Seguros|Actividades de agencias de empleo|Televentas|
And seleccione algunos articulos y sus cobertura:
|articulo |valor_asegurable|coberturas             |
|Building |120000000       |Danos,Asonada,Terremoto|
And cotice el articulo
Then el resultado de la tarifacion debe ser prima <prima> iva <iva> costo total <costo>

Examples:
|prima  |iva |costo  |TipoCo  |PolizaRef  |Documento|
|176.421|0,00|176.421|Aceptado|C1060447895|123456789|


Scenario:  Realizar una cotizacion de mrc donde el coaseguro es cedido
Given estoy cotizando una poliza de mrc:
|producto               |oficina|agente_oficina|tipo_documento      |fecha_nacimiento|primer_nombre|primer_apellido|tipo_direccion         |direccion       |departamento|ciudad  |agente|
|Multiriesgo corporativo|1059   |RANGEL        |CEDULA DE CIUDADANIA|02/12/1990      |MIKASA        |AKERMAN       |DIRECCION DE RESIDENCIA|CALLE 54B #50-25|Antioquia   |Medellin|INT-3 |
When quiero agregar coaseguro <TipoCo> con poliza referencia <PolizaRef> documento <Documento> y particion de aseguradoras
| ASEGURADORA                         | PARTICIPACION |
| Seguros Generales Suramericana S.A. | 60            |
| ACE SEGUROS S.A                     | 40            |
And de clic en Aceptar de la ventana Coaseguro
And agregue una nueva ubicacion:
|departamento|ciudad  |direccion        |descripcion    |actividad                        |medioVenta|
|Antioquia   |Medellin|CR 44 A # 43 - 00|Core de Seguros|Actividades de agencias de empleo|Televentas|
And seleccione algunos articulos y sus cobertura:
|articulo |valor_asegurable|coberturas             |
|Building |120000000       |Danos,Asonada,Terremoto|
And cotice el articulo
Then el resultado de la tarifacion debe ser prima <prima> iva <iva> costo total <costo>

Examples:
|prima  |iva   |costo  |TipoCo|PolizaRef|Documento|
|176.421|33.520|209.941|Cedido|         |         |