Meta:
@lote2
@tag equipo: reaseguro
@local

Narrative:
como usario de policy center
con un perfil que tenga permisos quiero ser capaz ver la distribución de cúmulos de reaseguro según la acitividad económica,
para verificar que el reaseguro de cúmulos se haga correctamente


Scenario: Crear polizas  MRC en una misma direccion y que hagan cumulo. Sin facultativos. Poliza A
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza de mrc:
|producto               |tipo_documento      |fecha_nacimiento|primer_nombre|primer_apellido|tipo_direccion         |direccion       |departamento|ciudad  |agente|
|Multiriesgo corporativo|CEDULA DE CIUDADANIA|10/11/1983      |PEDRO        |PEREZ          |DIRECCION DE RESIDENCIA|CALLE 45a #60-69|Antioquia   |Medellin|INT-3 |
And ingrese la <fechaInicioVigencia> para un anio
And ingrese a edificios y ubicaciones
And intente ingresar una nueva ubicacion sin riesgo consultable
| pais    | departamento| ciudad   | direccion             | actividadEconomica                            | medioVenta |
| Colombia| Antioquia   | Bello    | AVENIDAS 54 # 57 - 29 | Fabricación de otros artículos textiles n.c.p | Asesor     |
And intente ingresar las entradas de las diferentes coberturas
| TAB                      | TIPO_ARTICULO       | OTRO_ARTICULO_OTROS | COBERTURA        | ENTRADAS                         | VALOR_ENTRADAS |
| Información de Artículos | Edificios           |                     |                  | Valor Reconstrucción             | 5000000000      |
| Información de Artículos | Edificios           |                     | Danos materiales | Valor asegurado danos materiales | 5000000000      |
| Información de Artículos | Maquinaria y equipo |                     | Danos materiales | Valor Asegurable                 | 5000000000      |
| Información de Artículos | Maquinaria y equipo |                     | Danos materiales | Valor asegurado danos materiales | 5000000000      |
And cotice y expida una poliza
When ingrese a analisis de riesgo
And realice la aprobacion especial
And acepto la expedicion de poliza
And acepto la expedicion de poliza
And expido la poliza
And ingrese al resumen de la poliza expedida
And de clic al menu reaseguro
Then se debe verificar el valor reasegurado, el valor retenido del contrato cuota parte CP, el riesgo cedido del contrato cuota parte y excedente:
| baseReasegurableRiesgo | valorRetenidoCP | riesgoCedidoCP | riesgoCedidoEX | limiteContratoCP | proporcionCP | proporcionEX | proporcionRetencion | baseReasegurableCumulo |
| 10.000.000.000         | 600.000.000     | 3.400.000.000  | 6.000.000.000  | 4.000.000.000    | 34           | 60           | 6                   | 10.000.000.000         |

Examples:
|fechaInicioVigencia|
|01/02/2017         |


Scenario: Crear polizas  MRC en una misma direccion y que hagan cumulo. Sin facultativos. Poliza B
Given estoy cotizando una poliza de mrc:
|producto               |tipo_documento      |fecha_nacimiento|primer_nombre|primer_apellido|tipo_direccion         |direccion       |departamento|ciudad  |agente|
|Multiriesgo corporativo|CEDULA DE CIUDADANIA|10/11/1985      |JUAN         |ROJAS          |DIRECCION DE RESIDENCIA|CALLE 52a #70-69|Antioquia   |Medellin|INT-3 |
When quiero agregar coaseguro <TipoCo> con poliza referencia <PolizaRef> documento <Documento> y particion de aseguradoras
| ASEGURADORA                         | PARTICIPACION |
| Seguros Generales Suramericana S.A. | 50            |
| ACE SEGUROS S.A                     | 50            |
And de clic en Aceptar de la ventana Coaseguro
And ingrese la <fechaInicioVigencia> para un anio
And intente ingresar una nueva ubicacion sin riesgo consultable
| pais    | departamento| ciudad   | direccion             | actividadEconomica                      |medioVenta|
| Colombia| Antioquia   | Bello    | AVENIDAS 54 # 57 - 29 | Fabricación de otros productos químicos |Asesor    |
And intente ingresar las entradas de las diferentes coberturas
| TAB                      | TIPO_ARTICULO       | OTRO_ARTICULO_OTROS | COBERTURA        | ENTRADAS                         | VALOR_ENTRADAS |
| Información de Artículos | Edificios           |                     |                  | Valor Reconstrucción             | 5000000000      |
| Información de Artículos | Edificios           |                     | Danos materiales | Valor asegurado danos materiales | 5000000000      |
| Información de Artículos | Maquinaria y equipo |                     | Danos materiales | Valor Asegurable                 | 5000000000      |
| Información de Artículos | Maquinaria y equipo |                     | Danos materiales | Valor asegurado danos materiales | 5000000000      |
And cotice y expida una poliza
And ingrese a analisis de riesgo
And realice la aprobacion especial
And acepto la expedicion de poliza
And acepto la expedicion de poliza
And expido la poliza
And ingrese al resumen de la poliza expedida
And de clic al menu reaseguro
Then se debe verificar el valor reasegurado, el valor retenido del contrato cuota parte CP, el riesgo cedido del contrato cuota parte y excedente:
| baseReasegurableRiesgo | valorRetenidoCP | riesgoCedidoCP | riesgoCedidoEX | limiteContratoCP | proporcionCP | proporcionEX | proporcionRetencion | baseReasegurableCumulo |
| 5.000.000.000          | 60.000.000      | 340.000.000    | 4.600.000.000  | 400.000.000      | 6,8          | 92           | 1,2                 | 15.000.000.000         |

Examples:
| fechaInicioVigencia | TipoCo | PolizaRef | Documento |
| 01/03/2017          | Cedido |           |           |




