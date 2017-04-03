Meta:
@lote1
@tag equipo: 4, sprint: 13


Narrative:
Como usuario de policy center
Al cotizar una poliza de MRC quiero ser capaz de registrar toda la información del riesgo.

Scenario:  Tarifa MRC pólizas financieras con los aritículos Maquinaria y equipo, y Muebles y enseres
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza de mrc:
|cuenta     |oficina|agente_oficina |producto               |tipo_documento      |fecha_nacimiento|primer_nombre|primer_apellido|tipo_direccion         |direccion       |departamento|ciudad  |agente|
|C1060447895|2659   |DIRECTO        |Multiriesgo corporativo|CEDULA DE CIUDADANIA|02/12/1990      |MIKASA        |AKERMAN       |DIRECCION DE RESIDENCIA|CALLE 54B #50-25|Antioquia   |Medellin|INT-3 |
When agregue una nueva ubicacion:
|departamento|ciudad  |direccion        |descripcion  |actividad                        |medioVenta|
|Antioquia   |Medellin|CR 44 A # 43 - 00|Edificio Core|Actividades de agencias de empleo|Televentas|
And seleccione algunos articulos y sus cobertura:
|articulo |valor_asegurable|coberturas             		              |
|Machine  |300000000       |Danos,Asonada,Rotura,Terremoto,Sustracción|
|Furniture|300000000       |Danos,Asonada,Sustracción,Terremoto       |
And cotice el articulo
Then debo poder verificar el valor de la prima para las coberuras de la cotizacion
|articulo  |descripcion                      |valor    |
|Maquinaria|Cobertura de Danos materiales    |755.550  |
|Maquinaria|Cobertura de Terremoto           |306.600  |
|Maquinaria|Cobertura de Asonada             |32.850   |
|Maquinaria|Cobertura de Rotura de maquinaria|0        |
|Maquinaria|Cobertura de Sustracción         |0        |
|Maquinaria|Subtotal                         |1.095.000|
|Muebles   |Cobertura de Danos materiales    |985.320  |
|Muebles   |Cobertura de Terremoto           |434.700  |
|Muebles   |Cobertura de Asonada             |28.980   |
|Muebles   |Cobertura de Sustracción         |0        |
|Muebles   |Subtotal                         |1.449.000|
And el resultado de la tarifacion debe ser prima <prima> iva <iva> costo total <costo>

Examples:
|prima    |iva    |costo    |
|2.544.000|483.360|3.027.360|



Scenario:  Tarifa MRC pólizas financieras con los aritículos Edificio, y Muebles y enseres
Given estoy cotizando una poliza de mrc:
|cuenta     |oficina|agente_oficina |producto               |tipo_documento      |fecha_nacimiento|primer_nombre|primer_apellido|tipo_direccion         |direccion       |departamento|ciudad  |agente|
|C1060447895|2734   |DIRECTO        |Multiriesgo corporativo|CEDULA DE CIUDADANIA|02/12/1990      |MIKASA        |AKERMAN       |DIRECCION DE RESIDENCIA|CALLE 54B #50-25|Antioquia   |Medellin|INT-3 |
When agregue una nueva ubicacion:
|departamento|ciudad  |direccion        |descripcion    |actividad                        |medioVenta|
|Antioquia   |Medellin|CR 44 A # 43 - 00|Core de Seguros|Actividades de agencias de empleo|Televentas|
And seleccione algunos articulos y sus cobertura:
|articulo |valor_asegurable|coberturas                         |
|Building |100000000       |Danos,Asonada,Terremoto            |
|Furniture|140000000       |Danos,Asonada,Terremoto,Sustracción|
And cotice el articulo
Then debo poder verificar el valor de la prima para las coberuras de la cotizacion
|articulo  |descripcion                      |valor  |
|Edificio  |Cobertura de Danos materiales    |94.500 |
|Edificio  |Cobertura de Terremoto           |105.000|
|Edificio  |Cobertura de Asonada             |10.500 |
|Edificio  |Subtotal                         |210.000|
|Muebles   |Cobertura de Danos materiales    |459.816|
|Muebles   |Cobertura de Sustracción         |0      |
|Muebles   |Cobertura de Terremoto           |202.860|
|Muebles   |Cobertura de Asonada             |13.524 |
|Muebles   |Subtotal                         |676.200|
And el resultado de la tarifacion debe ser prima <prima> iva <iva> costo total <costo>

Examples:
|prima  |iva    |costo    |
|886.200|168.378|1.054.578|



Scenario:  Tarifa MRC polizas financieras con ariticulo Edificio
Given estoy cotizando una poliza de mrc:
|cuenta     |oficina|agente_oficina |producto               |tipo_documento      |fecha_nacimiento|primer_nombre|primer_apellido|tipo_direccion         |direccion       |departamento|ciudad  |agente|
|C1060447895|2659   |DIRECTO        |Multiriesgo corporativo|CEDULA DE CIUDADANIA|02/12/1990      |MIKASA        |AKERMAN       |DIRECCION DE RESIDENCIA|CALLE 54B #50-25|Antioquia   |Medellin|INT-3 |
When agregue una nueva ubicacion:
|departamento|ciudad  |direccion        |descripcion    |actividad                        |medioVenta|
|Antioquia   |Medellin|CR 44 A # 43 - 00|Core de Seguros|Actividades de agencias de empleo|Televentas|
And seleccione algunos articulos y sus cobertura:
|articulo |valor_asegurable|coberturas     |
|Building |100000000       |Danos,Terremoto|
And cotice el articulo
Then debo poder verificar el valor de la prima para las coberuras de la cotizacion
|articulo  |descripcion                      |valor  |
|Edificio  |Cobertura de Danos materiales    |99.474 |
|Edificio  |Cobertura de Terremoto           |110.526|
|Edificio  |Subtotal                         |210.000|
And el resultado de la tarifacion debe ser prima <prima> iva <iva> costo total <costo>

Examples:
|prima  |iva   |costo  |
|210.000|39.900|249.900|