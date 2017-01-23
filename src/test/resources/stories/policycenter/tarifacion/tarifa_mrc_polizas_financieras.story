Meta:
@lote1
@sprint 13
@tag equipo: 4


Narrative:
Como usuario de policy center
Al cotizar una poliza de MRC quiero ser capaz de registrar toda la información del riesgo.


Scenario:  Tarifa MRC - Cobertura Terremoto en Antioquia
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza de mrc:
|cuenta     |organizacion|producto               |canal            |tipo_documento      |fecha_nacimiento|primer_nombre|primer_apellido|tipo_direccion         |direccion       |departamento|ciudad  |agente|
|C1060447895|Bancolombia |Multiriesgo corporativo|Canal Tradicional|CEDULA DE CIUDADANIA|02/12/1990      |MIKASA        |AKERMAN       |DIRECCION DE RESIDENCIA|CALLE 54B #50-25|Antioquia   |Medellin|INT-3 |
When agregue una nueva ubicacion:
|departamento|ciudad  |direccion        |descripcion  |actividad                        |
|Antioquia   |Medellin|CR 44 A # 43 - 00|Edificio Core|Actividades de agencias de empleo|
And seleccione algunos articulos y sus cobertura:
|articulo |valor_asegurable|
|Machine  |300000000       |
|Furniture|300000000       |
And ingrese las entradas de las diferentes coberturas
| TAB                   | TIPO_ARTICULO | OTRO_ARTICULO_OTROS | COBERTURA   | ENTRADAS                                  | VALOR_ENTRADAS |
| Coberturas del Riesgo |               |                     | Sustraccion | Valor asegurado sustraccion con violencia | 300000000      |
And cotice el articulo
Then debo poder ver el valor de la prima <prima> en la cotizacion

Examples:
|prima  |
|101.667|