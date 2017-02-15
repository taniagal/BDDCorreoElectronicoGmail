Meta:
@lote1
@sprint 11
@tag equipo: 4
@local

Narrative:
Como usuario de policy center
Al cotizar una poliza de MRC quiero ser capaz de registrar toda la información del riesgo.


Scenario:  Tarifa MRC polizas financieras con los ariticulos Maquinaria y equipo, y Muebles y enseres
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza de mrc:
|cuenta     |producto               |tipo_documento      |fecha_nacimiento|primer_nombre|primer_apellido|tipo_direccion         |direccion       |departamento|ciudad  |agente|
|C1060447895|Multiriesgo corporativo|CEDULA DE CIUDADANIA|02/12/1990      |MIKASA        |AKERMAN       |DIRECCION DE RESIDENCIA|CALLE 54B #50-25|Antioquia   |Medellin|INT-3 |
When agregue una nueva ubicacion:
|departamento|ciudad  |direccion        |descripcion  |actividad                        |
|Antioquia   |Medellin|CR 44 A # 43 - 00|Edificio Core|Actividades de agencias de empleo|
And seleccione algunos articulos y sus cobertura:
|articulo |valor_asegurable|coberturas             |
|Building |120000000       |Danos,Asonada,Terremoto|
And cotice el articulo
Then debo poder verificar el valor de la prima para las coberuras de la cotizacion
|articulo  |descripcion                      |valor  |
|Edificio  |Cobertura de Danos materiales    |45.600 |
|Edificio  |Cobertura de Terremoto           |122.000|
|Edificio  |Cobertura de Asonada             |8.821  |
|Edificio  |Subtotal                         |176.421|
When valide el valor de la tasa global <tasa> y la cambie <tasaC>
And cotice una poliza
Then debo poder verificar el valor de la prima para las coberuras de la cotizacion
|articulo  |descripcion                      |valor  |
|Edificio  |Cobertura de Danos materiales    |62.033 |
|Edificio  |Cobertura de Terremoto           |165.967|
|Edificio  |Cobertura de Asonada             |12.000 |
|Edificio  |Subtotal                         |240.000|

Examples:
|tasa  |tasaC|
|1,4702|2    |

