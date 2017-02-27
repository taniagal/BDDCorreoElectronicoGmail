Meta:
@lote3
@sprint 14
@tag equipo: 4

Narrative:
Como usuario de policy center
Al cotizar una poliza de PA
Quiero ser capaz de aplicarla para los automoviles, camperos y pickup, y bicicletas una tasa diferente a la tasa dada por la tarifa tecnica en las coberturas de PT Daños y Hurto.


Scenario:  Realizar una cotizacion de autos con comision pactada en si y valor 10
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza:
|cuenta     |producto|oficina|agente_oficina |tipoPoliza |
|C1060447895|Autos   |1059   |RANGEL         |Individual |
When ingrese la comision pactada en valor <valor>
And ingrese los datos del asegurado <tipo_documento> <documento>
And ingrese los datos de vehiculo:
|placa |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis|motor|valor_asegurado|descuento|recargo|zona|plan              |medioVenta|
|NEL501|2017  |1601146         |MEDELLIN          |Particular       |null  |null |32000000       |null     |null   |2   |Plan Autos Clásico|Televentas|
And seleccione que el vehiculo es cero kilometros
And ingrese la bonificacion tecnica <bonoT> y la comercial <bonoC>
And seleccione todas las coberturas de comision pactada:
|limite|deducible|PTH|PPH|GTH|AS                |PTD|PPD|GT|CRPP|CRPT|
|1.440 |0        |0  |730|40.|Asistencia Clásica|0  |730|40|16  |20  |
Then el resultado de la tarifacion debe ser prima <prima> iva <iva> costo total <costo>

Examples:
|tipo_documento      |documento |prima    |iva    |costo    |valor|bonoT|bonoC|
|CEDULA DE CIUDADANIA|1060447895|2.374.961|451.243|2.826.204|10   |0    |0    |


Scenario:  Realizar una cotizacion de autos con comision pactada en si y valor 15 y bonificacion comercial 5 y tecnica en 15
Given estoy cotizando una poliza:
|cuenta     |producto|oficina|agente_oficina |tipoPoliza |
|C1060447895|Autos   |1059   |RANGEL         |Individual |
When ingrese la comision pactada en valor <valor>
And ingrese los datos del asegurado <tipo_documento> <documento>
And ingrese los datos de vehiculo:
|placa |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis|motor|valor_asegurado|descuento|recargo|zona|plan              |medioVenta|
|NEL501|2017  |1601146         |MEDELLIN          |Particular       |null  |null |32000000       |null     |null   |2   |Plan Autos Clásico|Televentas|
And seleccione que el vehiculo es cero kilometros
And ingrese la bonificacion tecnica <bonoT> y la comercial <bonoC>
And seleccione todas las coberturas de comision pactada:
|limite|deducible|PTH|PPH|GTH|AS                |PTD|PPD|GT|CRPP|CRPT|
|1.440 |0        |0  |730|40.|Asistencia Clásica|0  |730|40|16  |20  |
Then el resultado de la tarifacion debe ser prima <prima> iva <iva> costo total <costo>

Examples:
|tipo_documento      |documento |prima    |iva    |costo    |valor|bonoT|bonoC|
|CEDULA DE CIUDADANIA|1060447895|1.934.968|367.644|2.302.612|10   |15   |5    |


Scenario:  Realizar una cotizacion de autos con comision pactada en si y valor 15 y validar UW
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


Scenario:  Realizar una cotizacion de mrc con comosion pactada en si y valor 10
Given estoy cotizando una poliza de mrc:
|producto               |oficina|agente_oficina|tipo_documento      |fecha_nacimiento|primer_nombre|primer_apellido|tipo_direccion         |direccion       |departamento|ciudad  |agente|
|Multiriesgo corporativo|1059   |RANGEL        |CEDULA DE CIUDADANIA|02/12/1990      |MIKASA        |AKERMAN       |DIRECCION DE RESIDENCIA|CALLE 54B #50-25|Antioquia   |Medellin|INT-3 |
When ingrese la comision pactada en valor <valor>
And agregue una nueva ubicacion:
|departamento|ciudad  |direccion        |descripcion    |actividad                        |
|Antioquia   |Medellin|CR 44 A # 43 - 00|Core de Seguros|Actividades de agencias de empleo temporal|
And seleccione algunos articulos y sus cobertura:
|articulo |valor_asegurable|coberturas             |
|Building |150000000       |Danos,Asonada,Terremoto|
And cotice el articulo
Then debo poder verificar el valor de la prima para las coberuras de la cotizacion
|articulo  |descripcion                      |valor  |
|Edificio  |Cobertura de Danos materiales    |125.416|
|Edificio  |Cobertura de Terremoto           |148.264|
|Edificio  |Cobertura de Asonada             |14.404 |
|Edificio  |Subtotal                         |288.084|

Examples:
|valor|
|10   |


Scenario:  Realizar una cotizacion de mrc con comosion pactada en si y valor 16 y validar UW
Given estoy cotizando una poliza de mrc:
|producto               |oficina|agente_oficina|tipo_documento      |fecha_nacimiento|primer_nombre|primer_apellido|tipo_direccion         |direccion       |departamento|ciudad  |agente|
|Multiriesgo corporativo|1059   |RANGEL        |CEDULA DE CIUDADANIA|02/12/1990      |MIKASA        |AKERMAN       |DIRECCION DE RESIDENCIA|CALLE 54B #50-25|Antioquia   |Medellin|INT-3 |
When ingrese la comision pactada en valor <valor>
And agregue una nueva ubicacion:
|departamento|ciudad  |direccion        |descripcion    |actividad                        |
|Antioquia   |Medellin|CR 44 A # 43 - 00|Core de Seguros|Actividades de agencias de empleo temporal|
And seleccione algunos articulos y sus cobertura:
|articulo |valor_asegurable|coberturas             |
|Building |150000000       |Danos,Asonada,Terremoto|
And cotice el articulo
Then debo poder verificar el valor de la prima para las coberuras de la cotizacion
|articulo  |descripcion                      |valor  |
|Edificio  |Cobertura de Danos materiales    |129.000|
|Edificio  |Cobertura de Terremoto           |152.500|
|Edificio  |Cobertura de Asonada             |14.816 |
|Edificio  |Subtotal                         |296.316|
And expido la poliza
And se debe generar un UW con el mensaje <mensaje>

Examples:
|valor|mensaje                                |
|16   |La comisión pactada debe ser autorizada|