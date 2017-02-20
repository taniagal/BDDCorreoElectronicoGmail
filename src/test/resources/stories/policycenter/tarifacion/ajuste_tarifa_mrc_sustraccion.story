Meta:
@lote3
@sprint 14
@tag equipo: 4


Narrative:
Como usuario de policy center
Al cotizar una poliza de MRC quiero ser capaz de registrar toda la información del riesgo.

Scenario:  Tarifa MRC pólizas financieras con los aritículos Maquinaria y equipo, y Muebles y enseres
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza de mrc:
|cuenta     |oficina|agente_oficina |producto               |tipo_documento      |fecha_nacimiento|primer_nombre|primer_apellido|tipo_direccion         |direccion       |departamento|ciudad  |agente|
|C1060447895|2659   |DIRECTO        |Multiriesgo corporativo|CEDULA DE CIUDADANIA|02/12/1990      |MIKASA        |AKERMAN       |DIRECCION DE RESIDENCIA|CALLE 54B #50-25|Antioquia   |Medellin|INT-3 |
When agregue una nueva ubicacion:
|departamento|ciudad  |direccion        |descripcion  |actividad                        |
|Antioquia   |Medellin|CR 44 A # 43 - 00|Edificio Core|Actividades de agencias de empleo|
And seleccione algunos articulos y sus cobertura:
|articulo |valor_asegurable|coberturas             		  |
|Building |1000000000      |Danos,Asonada,Terremoto|
|Machine  |1500000000      |Danos,Asonada,Rotura   |
And ingreso el indice variable <valor_indice> de la maquinaria
And ingrese las entradas de las diferentes coberturas
| TAB                   | TIPO_ARTICULO | OTRO_ARTICULO_OTROS | COBERTURA   | ENTRADAS                                  | VALOR_ENTRADAS |
| Coberturas del Riesgo |               |                     | Sustracción | Valor asegurado sustracción con violencia | 500000000      |
And cotice el articulo
Then debo poder verificar el valor de la prima para las coberuras de la cotizacion
|articulo  |descripcion                      |valor    |
|Edificio  |Cobertura de Danos materiales    |384.000  |
|Edificio  |Cobertura de Terremoto           |1.016.667|
|Edificio  |Cobertura de Asonada             |73.820   |
|Maquinaria|Cobertura de Danos materiales    |560.432  |
|Maquinaria|Cobertura de Asonada             |110.731  |
|Maquinaria|Cobertura de Rotura de maquinaria|15.568   |

Examples:
|valor_indice|
|3           |