Meta:
@lote4
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
|Multiriesgo corporativo|CEDULA DE CIUDADANIA|11/11/1971      |MARIA        |VAZCO          |DIRECCION DE RESIDENCIA|CALLE 81 # 80-69|Antioquia   |Medellin|INT-3 |
And ingrese la <fechaInicioVigencia> para un anio
And seleccione la poliza como reaseguro especial
And ingrese a edificios y ubicaciones
And intente ingresar una nueva ubicacion sin riesgo consultable
| pais    | departamento| ciudad   | direccion             | actividadEconomica                            | medioVenta |
| Colombia| Antioquia   | Bello    | AVENIDAS 47 # 61 - 36 | Fabricación de otros artículos textiles n.c.p | Asesor     |
And seleccione algunos articulos y sus cobertura:
| articulo | valor_asegurable | coberturas |
| Building | 10000000000      | Danos      |
| Machine  | 10000000000      | Danos      |
And cotice el articulo
And ingrese la informacion de un acuerdo facultativo <descripcionDeAcuerdo>
When ingrese la informacion de un reasegurador en la tabla de reaseguradores
| modalidad  | porcentajeParticipacion | valorReaseguro | comisionReasegurador | comisionIntermediario | comisionPromotora |
| Gross rate | 20                      | 1,8            | 0                    | 0                     | 0                 |
And ingrese un reasegurador de tipo programa
And acepte el acuerdo facultativo
Then se debe verificar el valor reasegurado, el valor retenido del contrato cuota parte CP, el riesgo cedido del contrato cuota parte y excedente:
| baseReasegurableRiesgo | baseReaseguroContrato | valorRetenidoCP | riesgoCedidoCP | riesgoCedidoEX | limiteContratoCP | baseReasegurableCumulo | riesgoCedidoAcuerdoFacultativo |
| 20.000.000.000         | 16.000.000.000        | 600.000.000     | 3.400.000.000  | 12.000.000.000 | 4.000.000.000    | 20.000.000.000         | 4.000.000.000                  |
When expido la poliza mrc
And expido la poliza mrc
And de clic al boton detalle
And realice aprobacion especial asociada a varias observaciones
And expido la poliza mrc
And expido la poliza mrc
And capturo el numero de poliza 1

Examples:
| fechaInicioVigencia | descripcionDeAcuerdo               |
| 01/02/2017          | Descripcion de acuerdo para test 8 |


Scenario: Crear poliza  MRC en una misma direccion y que haga cumulo. Con facultativo. Poliza B
Given estoy cotizando una poliza de mrc:
|producto               |tipo_documento      |fecha_nacimiento|primer_nombre|primer_apellido|tipo_direccion         |direccion       |departamento|ciudad  |agente|
|Multiriesgo corporativo|CEDULA DE CIUDADANIA|11/11/1971      |MARKOS       |RAYO           |DIRECCION DE RESIDENCIA|CALLE 81 # 66-69|Antioquia   |Medellin|INT-3 |
And ingrese la <fechaInicioVigencia> para un anio
And seleccione la poliza como reaseguro especial
And ingrese a edificios y ubicaciones
And intente ingresar una nueva ubicacion sin riesgo consultable
| pais    | departamento| ciudad   | direccion             | actividadEconomica           | medioVenta |
| Colombia| Antioquia   | Bello    | AVENIDAS 47 # 61 - 36 | Cría de otros animales n.c.p | Asesor     |
And seleccione algunos articulos y sus cobertura:
| articulo | valor_asegurable | coberturas |
| Building | 5000000000       | Danos      |
| Machine  | 5000000000       | Danos      |
And cotice el articulo
And ingrese la informacion de un acuerdo facultativo <descripcionDeAcuerdo>
When ingrese la informacion de un reasegurador en la tabla de reaseguradores
| modalidad  | porcentajeParticipacion | valorReaseguro | comisionReasegurador | comisionIntermediario | comisionPromotora |
| Gross rate | 30                      | 1,7            | 0                    | 0                     | 0                 |
And ingrese un reasegurador de tipo programa
And acepte el acuerdo facultativo
Then se debe verificar el valor reasegurado, el valor retenido del contrato cuota parte CP, el riesgo cedido del contrato cuota parte y excedente:
| baseReasegurableRiesgo | baseReaseguroContrato | valorRetenidoCP | riesgoCedidoCP | riesgoCedidoEX | limiteContratoCP | baseReasegurableCumulo | riesgoCedidoAcuerdoFacultativo |
| 10.000.000.000         | 7.000.000.000         | 91.304.348      | 517.391.304    | 6.391.304.348  | 608.695.652      | 30.000.000.000         | 3.000.000.000                  |
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
| 01/03/2017          | Descripcion de acuerdo para test 9 |


Scenario: Consultar poliza A despues de expedir la poliza B
Given se va a consultar poliza expedida 1
When de clic al menu reaseguro
Then se debe verificar el valor reasegurado, el valor retenido del contrato cuota parte CP, el riesgo cedido del contrato cuota parte y excedente:
| baseReasegurableRiesgo | baseReaseguroContrato | valorRetenidoCP | riesgoCedidoCP | riesgoCedidoEX | limiteContratoCP | baseReasegurableCumulo | riesgoCedidoAcuerdoFacultativo |
| 20.000.000.000         | 16.000.000.000        | 208.695.652     | 1.182.608.696  | 14.608.695.652 | 1.391.304.348    | 30.000.000.000         | 4.000.000.000                  |

Examples:
| |
| |


Scenario: Cancelar poliza A con fecha cancelacion 01 Abril
Given se va a consultar poliza expedida 1
When ingrese los motivos de cancelacion de la poliza Motivo: Por petición del cliente, Descripción: Prueba cancelacion de poliza
And ingrese la fecha vigente de cancelacion <fechaCancelacion>
And inicie la cancelacion
And realice la cotizacion de la cancelacion

Examples:
| fechaCancelacion |
| 01/04/2017       |