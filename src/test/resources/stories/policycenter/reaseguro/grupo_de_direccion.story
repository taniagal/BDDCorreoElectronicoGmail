Grupo De Direccion

Meta:
@lote4
@sprint 8
@tag equipo: reaseguro
@local

Narrative:
como usario de policy center
con un perfil que tenga permisos quiero ser capaz ver la distribución de cúmulos de reaseguro según la acitividad económica,
para verificar que el reaseguro de cúmulos se haga correctamente


Scenario: Validacion en calculos de porcentaje cuando la actividad economica cubre el 100% para contratos NO FACULTATIVOS
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza de mrc:
|producto               |tipo_documento      |fecha_nacimiento|primer_nombre|primer_apellido|tipo_direccion         |direccion       |departamento|ciudad  |agente|
|Multiriesgo corporativo|CEDULA DE CIUDADANIA|10/10/1973      |EUGENIO      |BUSTAMANTE     |DIRECCION DE RESIDENCIA|CALLE 27a #60-68|Antioquia   |Medellin|INT-3 |
And ingrese la <fechaInicioVigencia> para un anio
And ingrese a edificios y ubicaciones
And intente ingresar una nueva ubicacion sin riesgo consultable
| pais    | departamento| ciudad   | direccion   | actividadEconomica                           |medioVenta|
| Colombia| Antioquia   | Medellin | CR 75 30 30 | Fabricación de otros artículos textiles n.c.p|Televentas|
And intente ingresar las entradas de las diferentes coberturas
| TAB                      | TIPO_ARTICULO       | OTRO_ARTICULO_OTROS | COBERTURA        | ENTRADAS                         | VALOR_ENTRADAS |
| Información de Artículos | Edificios           |                     |                  | Valor Reconstrucción             | 2000000000      |
| Información de Artículos | Edificios           |                     | Danos materiales | Valor asegurado danos materiales | 2000000000      |
| Información de Artículos | Maquinaria y equipo |                     | Danos materiales | Valor Asegurable                 | 2000000000      |
| Información de Artículos | Maquinaria y equipo |                     | Danos materiales | Valor asegurado danos materiales | 2000000000      |
And cotice una poliza
When quiera reasegurar la poliza cotizada
Then debo ver el resultado del reaseguro aplicable por cada riesgo para un contrato cuota parte y excedente segun porcentajes de retencion y cesion

Examples:
|fechaInicioVigencia|
|01/01/2017         |

Scenario: Validacion en calculos de porcentaje cuando la actividad economica se cubre al 50% para contratos NO FACULTATIVOS
Given estoy cotizando una poliza de mrc:
|producto               |tipo_documento      |fecha_nacimiento|primer_nombre|primer_apellido|tipo_direccion         |direccion       |departamento|ciudad  |agente|
|Multiriesgo corporativo|CEDULA DE CIUDADANIA|10/10/1973      |SEAN         |AMPARO TOBON   |DIRECCION DE RESIDENCIA|CALLE 27a #60-68|Antioquia   |Medellin|INT-3 |
And ingrese la <fechaInicioVigencia> para un anio
And ingrese a edificios y ubicaciones
And intente ingresar una nueva ubicacion sin riesgo consultable
| pais    | departamento| ciudad   | direccion   | actividadEconomica           |medioVenta|
| Colombia| Antioquia   | Medellin | CR 46 12 71 | Cría de otros animales n.c.p.|Televentas|
And intente ingresar las entradas de las diferentes coberturas
| TAB                      | TIPO_ARTICULO       | OTRO_ARTICULO_OTROS | COBERTURA        | ENTRADAS                         | VALOR_ENTRADAS |
| Información de Artículos | Edificios           |                     |                  | Valor Reconstrucción             | 2000000000      |
| Información de Artículos | Edificios           |                     | Danos materiales | Valor asegurado danos materiales | 2000000000      |
| Información de Artículos | Maquinaria y equipo |                     | Danos materiales | Valor Asegurable                 | 2000000000      |
| Información de Artículos | Maquinaria y equipo |                     | Danos materiales | Valor asegurado danos materiales | 2000000000      |
And cotice una poliza
When quiera reasegurar la poliza cotizada
Then debo ver el resultado del reaseguro aplicable por cada riesgo para un contrato cuota parte y excedente segun porcentajes de retencion y cesion

Examples:
|fechaInicioVigencia|
|01/01/2017         |


