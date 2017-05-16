Meta:
@lote3
@tag equipo: reaseguro
@local

Narrative:
como usario de policy center
con un perfil que tenga permisos quiero ser capaz ver la distribución de cúmulos de reaseguro con facultativo según la acitividad económica,
para verificar que el reaseguro de cúmulos se haga correctamente


Scenario: Crear poliza  MRC en una misma direccion y que haga cumulo. Con facultativo. Poliza A
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza de mrc:
|producto               |tipo_documento      |fecha_nacimiento|primer_nombre|primer_apellido|tipo_direccion         |direccion       |departamento|ciudad  |agente|
|Multiriesgo corporativo|CEDULA DE CIUDADANIA|10/11/1953      |CARLOS       |CARMONA        |DIRECCION DE RESIDENCIA|CALLE 11b #60-69|Antioquia   |Medellin|INT-3 |
And ingrese el tipo de vigencia de la poliza <tipoVigencia>
And ingrese la <fechaInicioVigencia> para un anio
And ingrese la fecha fin de vigencia de la poliza
And seleccione la poliza como reaseguro especial
And ingrese a edificios y ubicaciones
And intente ingresar una nueva ubicacion sin riesgo consultable
| pais    | departamento| ciudad   | direccion             | actividadEconomica                            | medioVenta |
| Colombia| Antioquia   | Bello    | AVENIDAS 44 # 59 - 34 | Fabricación de otros artículos textiles n.c.p | Asesor     |
And seleccione algunos articulos y sus cobertura:
| articulo | valor_asegurable | coberturas |
| Building | 10000000000      | Danos      |
| Machine  | 10000000000      | Danos      |
And cotice el articulo
And ingrese la informacion de un acuerdo facultativo <descripcionDeAcuerdo>
When ingrese la informacion de un reasegurador en la tabla de reaseguradores
|modalidad |porcentajeParticipacion|valorReaseguro|comisionReasegurador|comisionIntermediario|comisionPromotora|
|Gross rate|40                     |1,8           |30                  |7                    |3                |
And ingrese un reasegurador de tipo programa
And acepte el acuerdo facultativo
Then se debe verificar el valor reasegurado, el valor retenido del contrato cuota parte CP, el riesgo cedido del contrato cuota parte y excedente:
| baseReasegurableRiesgo | baseReaseguroContrato | valorRetenidoCP | riesgoCedidoCP | riesgoCedidoEX | limiteContratoCP | baseReasegurableCumulo | riesgoCedidoAcuerdoFacultativo |
| 20.000.000.000         | 12.000.000.000        | 600.000.000     | 3.400.000.000  | 8.000.000.000  | 4.000.000.000    | 20.000.000.000         | 8.000.000.000                  |
When expido la poliza mrc
And expido la poliza mrc
And de clic al boton detalle
And realice aprobacion especial asociada a varias observaciones
And expido la poliza mrc
And expido la poliza mrc
And capturo el numero de poliza 1

Examples:
| tipoVigencia | fechaInicioVigencia | descripcionDeAcuerdo               |
| Otra         | 01/11/2016          | Descripcion de acuerdo para test 3 |


Scenario: Crear poliza  MRC en una misma direccion y que haga cumulo. Con facultativo. Poliza B
Given estoy cotizando una poliza de mrc:
|producto               |tipo_documento      |fecha_nacimiento|primer_nombre|primer_apellido|tipo_direccion         |direccion       |departamento|ciudad  |agente|
|Multiriesgo corporativo|CEDULA DE CIUDADANIA|11/11/1945      |MANUEL       |ESCOBAR        |DIRECCION DE RESIDENCIA|CALLE 56a #80-69|Antioquia   |Medellin|INT-3 |
And ingrese la <fechaInicioVigencia> para un anio
And seleccione la poliza como reaseguro especial
And ingrese a edificios y ubicaciones
And intente ingresar una nueva ubicacion sin riesgo consultable
| pais    | departamento| ciudad   | direccion             | actividadEconomica                                                   | medioVenta |
| Colombia| Antioquia   | Bello    | AVENIDAS 44 # 59 - 34 | Comercio al por menor de otros productos en puestos de venta móviles | Asesor     |
And seleccione algunos articulos y sus cobertura:
| articulo | valor_asegurable | coberturas |
| Building | 10000000000      | Danos      |
| Machine  | 10000000000      | Danos      |
And cotice el articulo
And ingrese la informacion de un acuerdo facultativo <descripcionDeAcuerdo>
When ingrese la informacion de un reasegurador en la tabla de reaseguradores
|modalidad |porcentajeParticipacion|valorReaseguro|comisionReasegurador|comisionIntermediario|comisionPromotora|
|Gross rate|30                     |1,8           |30                  |7                    |3                |
And ingrese un reasegurador de tipo programa
And acepte el acuerdo facultativo
Then se debe verificar el valor reasegurado, el valor retenido del contrato cuota parte CP, el riesgo cedido del contrato cuota parte y excedente:
| baseReasegurableRiesgo | baseReaseguroContrato | valorRetenidoCP | riesgoCedidoCP | riesgoCedidoEX | limiteContratoCP | baseReasegurableCumulo | riesgoCedidoAcuerdoFacultativo |
| 20.000.000.000         | 14.000.000.000        | 290.769.231     | 1.647.692.307  | 12.061.538.462 | 1.938.461.538    | 40.000.000.000         | 6.000.000.000                  |
When expido la poliza mrc
And expido la poliza mrc
And de clic al boton detalle
And realice aprobacion especial asociada a varias observaciones
And expido la poliza mrc
And expido la poliza mrc
And capturo el numero de poliza 2
And ingrese al resumen de la poliza expedida

Examples:
| fechaInicioVigencia | descripcionDeAcuerdo               |
| 01/01/2017          | Descripcion de acuerdo para test 2 |


Scenario: Consultar poliza A despues de expedir la poliza B
Given de clic al menu escritorio
And se va a consultar poliza expedida 1
When de clic al menu reaseguro
And seleccione opcion ver a partir de <verApartirDe>
Then se debe verificar el valor reasegurado, el valor retenido del contrato cuota parte CP, el riesgo cedido del contrato cuota parte y excedente:
| baseReasegurableRiesgo | baseReaseguroContrato | valorRetenidoCP | riesgoCedidoCP | riesgoCedidoEX | limiteContratoCP | baseReasegurableCumulo | riesgoCedidoAcuerdoFacultativo |
| 20.000.000.000         | 12.000.000.000        | 249.230.769     | 1.412.307.693  | 10.338.461.538 | 1.661.538.462    | 40.000.000.000         | 8.000.000.000                  |
And quiera ejecutar una tarea de proceso por lotes <nombreTarea>

Examples:
| verApartirDe | nombreTarea                   |
| 01/01/2017 - | Reinsurance Policy Expiration |


Scenario: Consultar poliza B despues de ejecutar tarea
Given consulto poliza expedida 2
When de clic al menu reaseguro
And seleccione opcion ver a partir de <verApartirDe>
Then se debe verificar el valor reasegurado, el valor retenido del contrato cuota parte CP, el riesgo cedido del contrato cuota parte y excedente:
| baseReasegurableRiesgo | baseReaseguroContrato | valorRetenidoCP | riesgoCedidoCP | riesgoCedidoEX | limiteContratoCP | baseReasegurableCumulo | riesgoCedidoAcuerdoFacultativo |
| 20.000.000.000         | 14.000.000.000        | 540.000.000     | 3.060.000.000  | 10.400.000.000 | 3.600.000.000    | 20.000.000.000         | 6.000.000.000                  |

Examples:
| verApartirDe   |
| - 30/06/2017   |