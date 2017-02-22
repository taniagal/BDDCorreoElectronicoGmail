Meta:
@lote3
@sprint 14
@tag equipo: 4


Narrative:
Como usuario de policy center
Al cotizar una poliza de MRC quiero mirar el valor de la prima para las coberturas de la cotización y el nivel de riesgo

Scenario:  Tarifa MRC poliza con los ariticulos edificio y maquinaria
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza de mrc:
|cuenta     |oficina|agente_oficina |producto               |tipo_documento      |fecha_nacimiento|primer_nombre|primer_apellido|tipo_direccion         |direccion       |departamento|ciudad  |agente|
|C1060447895|2659   |DIRECTO        |Multiriesgo corporativo|CEDULA DE CIUDADANIA|02/12/1990      |MIKASA        |AKERMAN       |DIRECCION DE RESIDENCIA|CALLE 54B #50-25|Antioquia   |Medellin|INT-3 |
When agregue una nueva ubicacion:
|departamento|ciudad  |direccion        |descripcion  |actividad                        |
|Antioquia   |Medellin|CR 44 A # 43 - 00|Edificio Core|Actividades de agencias de empleo|
And seleccione algunos articulos y sus cobertura:
|articulo |valor_asegurable|coberturas             |
|Building |1000000000      |Danos,Asonada,Terremoto|
|Machine  |1500000000      |Danos,Asonada,Rotura   |
And ingreso el indice variable <valor_indice> de la maquinaria
And ingrese las entradas de las diferentes coberturas
| TAB                   | TIPO_ARTICULO | OTRO_ARTICULO_OTROS | COBERTURA   | ENTRADAS                                  | VALOR_ENTRADAS |
| Coberturas del Riesgo |               |                     | Sustracción | Valor asegurado sustracción con violencia | 500000000      |
And cotice el articulo
Then el resultado de la tarifacion debe ser prima <prima> iva <iva> costo total <costo>
And debo poder verificar el valor de la prima para las coberuras de la cotizacion
|articulo                |descripcion                      |valor    |
|Cobertura de Sustracción|Cobertura de Sustracción         |0,00     |
|Edificio                |Cobertura de Terremoto           |1.050.000|
|Edificio                |Cobertura de Danos materiales    |945.000  |
|Edificio                |Cobertura de Asonada             |105.000  |
|Maquinaria              |Cobertura de Rotura de maquinaria|0,00     |
|Maquinaria              |Cobertura de Danos materiales    |74.482   |
|Maquinaria              |Cobertura de Asonada             |3.238    |

Examples:
|valor_indice|prima    |iva    |costo    |
|3           |2.177.720|413.767|2.591.487|


Scenario:  Tarifa MRC poliza Bancolombia con los ariticulos muebles y maquinaria
Given estoy cotizando una poliza de mrc:
|cuenta     |oficina|agente_oficina |producto               |tipo_documento      |fecha_nacimiento|primer_nombre|primer_apellido|tipo_direccion         |direccion       |departamento|ciudad  |agente|
|C1060447895|2765   |DIRECTO        |Multiriesgo corporativo|CEDULA DE CIUDADANIA|02/12/1990      |MIKASA        |AKERMAN       |DIRECCION DE RESIDENCIA|CALLE 54B #50-25|Antioquia   |Medellin|INT-3 |
When agregue una nueva ubicacion:
|departamento|ciudad  |direccion        |descripcion  |actividad                        |
|Antioquia   |Medellin|CR 44 A # 43 - 00|Edificio Core|Actividades de agencias de empleo|
And seleccione algunos articulos y sus cobertura:
|articulo |valor_asegurable|coberturas                                |
|Machine  |300000000       |Danos,Rotura,Asonada,Sustracción,Terremoto|
|Furniture|300000000       |Danos,Asonada,Sustracción,Terremoto       |
And cotice el articulo
Then el resultado de la tarifacion debe ser prima <prima> iva <iva> costo total <costo>
And debo poder verificar el valor de la prima para las coberuras de la cotizacion
|articulo                |descripcion                      |valor    |
|Maquinaria              |Cobertura de Danos materiales    |755.550  |
|Maquinaria              |Cobertura de Rotura de maquinaria|0,00     |
|Maquinaria              |Cobertura de Asonada             |32.850   |
|Maquinaria              |Cobertura de Sustracción         |0,00     |
|Maquinaria              |Cobertura de Terremoto           |306.600  |
|Maquinaria              |Subtotal                         |1.095.000|
|Muebles                 |Cobertura de Danos materiales    |985.320  |
|Muebles                 |Cobertura de Asonada             |28.980   |
|Muebles                 |Cobertura de Sustracción         |0,00     |
|Muebles                 |Cobertura de Terremoto           |434.700  |
|Muebles                 |Subtotal                         |1.449.000|

Examples:
|prima    |iva    |costo    |
|2.544.000|407.040|2.951.040|


Scenario:  Tarifa MRC poliza con direccion Antioquia y ariticulo edificio
Given estoy cotizando una poliza de mrc:
|cuenta     |oficina|agente_oficina |producto               |tipo_documento      |fecha_nacimiento|primer_nombre|primer_apellido|tipo_direccion         |direccion       |departamento|ciudad  |agente|
|C1060447895|2659   |DIRECTO        |Multiriesgo corporativo|CEDULA DE CIUDADANIA|02/12/1990      |MIKASA        |AKERMAN       |DIRECCION DE RESIDENCIA|CALLE 54B #50-25|Antioquia   |Medellin|INT-3 |
When agregue una nueva ubicacion:
|departamento|ciudad  |direccion        |descripcion  |actividad                        |
|Antioquia   |Medellin|CR 44 A # 43 - 00|Edificio Core|Actividades de agencias de empleo|
And seleccione algunos articulos y sus cobertura:
|articulo |valor_asegurable|coberturas|
|Building |100000000       |Terremoto |
And ingreso el indice variable <valor_indice> de la maquinaria
And ingrese las entradas de las diferentes coberturas
| TAB                   | TIPO_ARTICULO | OTRO_ARTICULO_OTROS | COBERTURA   | ENTRADAS                                  | VALOR_ENTRADAS |
| Coberturas del Riesgo |               |                     | Sustracción | Valor asegurado sustracción con violencia | 500000000      |
And cotice el articulo
Then el resultado de la tarifacion debe ser prima <prima> iva <iva> costo total <costo>

Examples:
|prima  |
|101.667|