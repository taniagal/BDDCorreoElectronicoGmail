Meta:
@lote2
@tag equipo: reaseguro
@local

Narrative:
como usario de policy center
con un perfil que tenga permisos quiero ser capaz ver la distribución de cúmulos de reaseguro según la acitividad económica,
para verificar que el reaseguro de cúmulos se haga correctamente


Scenario: Crear polizas  MRC en una misma direccion y que hagan cumulo. Sin facultativos
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza de mrc:
|producto               |tipo_documento      |fecha_nacimiento|primer_nombre|primer_apellido|tipo_direccion         |direccion       |departamento|ciudad  |agente|
|Multiriesgo corporativo|CEDULA DE CIUDADANIA|10/11/1983      |PEDRO        |PEREZ          |DIRECCION DE RESIDENCIA|CALLE 45a #60-69|Antioquia   |Medellin|INT-3 |
And ingrese la <fechaInicioVigencia> para un anio
And ingrese a edificios y ubicaciones
And intente ingresar una nueva ubicacion sin riesgo consultable
| pais    | departamento| ciudad   | direccion             | actividadEconomica                           |medioVenta|
| Colombia| Antioquia   | Bello    | AVENIDAS 33 # 57 - 29 | Fabricación de otros artículos textiles n.c.p|Asesor    |
And intente ingresar las entradas de las diferentes coberturas
| TAB                      | TIPO_ARTICULO       | OTRO_ARTICULO_OTROS | COBERTURA        | ENTRADAS                         | VALOR_ENTRADAS |
| Información de Artículos | Edificios           |                     |                  | Valor Reconstrucción             | 5000000000      |
| Información de Artículos | Edificios           |                     | Danos materiales | Valor asegurado danos materiales | 5000000000      |
| Información de Artículos | Maquinaria y equipo |                     | Danos materiales | Valor Asegurable                 | 5000000000      |
| Información de Artículos | Maquinaria y equipo |                     | Danos materiales | Valor asegurado danos materiales | 5000000000      |
And cotice una poliza
When quiera reasegurar la poliza cotizada
Then se debe verificar el valor reasegurado, el valor retenido del contrato cuota parte CP, el riesgo cedido del contrato cuota parte y excedente:
| BaseReasegurableRiesgo | valorRetenidoCP | riesgoCedidoCP | riesgoCedidoEX |
| 10000000000            | 600000000       | 3400000000     | 6000000000     |

Examples:
|fechaInicioVigencia|
|01/02/2017         |
