Meta:
@lote1
@tag equipo: reaseguro
@local

Narrative:
como usario de policy center
con un perfil que tenga permisos quiero ser capaz ver la distribución de cúmulos de reaseguro con facultativo según la acitividad económica,
para verificar que el reaseguro de cúmulos se haga correctamente


Scenario: Crear poliza  MRC en una misma direccion y que haga cumulo. Con facultativo.
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza de mrc:
|producto               |tipo_documento      |fecha_nacimiento|primer_nombre|primer_apellido|tipo_direccion         |direccion       |departamento|ciudad  |agente|
|Multiriesgo corporativo|CEDULA DE CIUDADANIA|10/11/1973      |RAMON        |CARDONA        |DIRECCION DE RESIDENCIA|CALLE 66a #80-69|Antioquia   |Medellin|INT-3 |
And ingrese la Fecha Inicio Vigencia: 01/02/2017
And seleccione la poliza como reaseguro especial
And ingrese a edificios y ubicaciones
And intente ingresar una nueva ubicacion sin riesgo consultable
| pais    | departamento| ciudad   | direccion             | actividadEconomica                            | medioVenta |
| Colombia| Antioquia   | Bello    | AVENIDAS 45 # 58 - 33 | Fabricación de otros artículos textiles n.c.p | Asesor     |
And seleccione algunos articulos y sus cobertura:
| articulo | valor_asegurable | coberturas |
| Building | 5000000000       | Danos      |
| Machine  | 5000000000       | Danos      |
And cotice el articulo
And ingrese la informacion de un acuerdo facultativo <descripcionDeAcuerdo>
When ingrese la informacion de un reasegurador en la tabla de reaseguradores
|modalidad |porcentajeParticipacion|valorReaseguro|comisionReasegurador|comisionIntermediario|comisionPromotora|
|Gross rate|40                     |1,8           |0                   |0                    |0                |
And ingrese un reasegurador de tipo programa
And acepte el acuerdo facultativo
Then se debe verificar el valor reasegurado, el valor retenido del contrato cuota parte CP, el riesgo cedido del contrato cuota parte y excedente:
| baseReasegurableRiesgo | baseReaseguroContrato | valorRetenidoCP | riesgoCedidoCP | riesgoCedidoEX | limiteContratoCP | baseReasegurableCumulo | riesgoCedidoAcuerdoFacultativo |
| 10.000.000.000         | 6.000.000.000         | 600.000.000     | 3.400.000.000  | 2.000.000.000  | 4.000.000.000    | 10.000.000.000         | 4.000.000.000                  |
When expido la poliza mrc
And expido la poliza mrc
And de clic al boton detalle
And realice aprobacion especial asociada a varias observaciones
And expido la poliza mrc
And expido la poliza mrc
And capturo el numero de poliza 1
And ingrese al resumen de la poliza expedida
Given estoy cotizando una poliza de mrc:
|producto               |tipo_documento      |fecha_nacimiento|primer_nombre|primer_apellido|tipo_direccion         |direccion       |departamento|ciudad  |agente|
|Multiriesgo corporativo|CEDULA DE CIUDADANIA|10/11/1965      |JUANES       |OCAMPO         |DIRECCION DE RESIDENCIA|CALLE 10a #00-69|Antioquia   |Medellin|INT-3 |
When quiero agregar coaseguro <TipoCo> con poliza referencia <PolizaRef> documento <Documento> y particion de aseguradoras
| ASEGURADORA                         | PARTICIPACION |
| Seguros Generales Suramericana S.A. | 20            |
| ACE SEGUROS S.A                     | 80            |
And de clic en Aceptar de la ventana Coaseguro
Given ingrese la Fecha Inicio Vigencia: 01/03/2017
And seleccione la poliza como reaseguro especial
And ingrese a edificios y ubicaciones
And intente ingresar una nueva ubicacion sin riesgo consultable
| pais    | departamento| ciudad   | direccion             | actividadEconomica                                                   |medioVenta|
| Colombia| Antioquia   | Bello    | AVENIDAS 45 # 58 - 33 | Comercio al por menor de otros productos en puestos de venta móviles |Asesor    |
And seleccione algunos articulos y sus cobertura:
| articulo | valor_asegurable | coberturas |
| Building | 30000000000      | Danos      |
| Machine  | 30000000000      | Danos      |
And cotice el articulo
And ingrese la informacion de un acuerdo facultativo <descripcionDeAcuerdo>
When ingrese la informacion de un reasegurador en la tabla de reaseguradores
|modalidad |porcentajeParticipacion|valorReaseguro|comisionReasegurador|comisionIntermediario|comisionPromotora|
|Gross rate|60                     |1,8           |0                   |0                    |0                |
And ingrese un reasegurador de tipo programa
And acepte el acuerdo facultativo
Then se debe verificar el valor reasegurado, el valor retenido del contrato cuota parte CP, el riesgo cedido del contrato cuota parte y excedente:
| baseReasegurableRiesgo | baseReaseguroContrato | valorRetenidoCP | riesgoCedidoCP | riesgoCedidoEX | limiteContratoCP | baseReasegurableCumulo | riesgoCedidoAcuerdoFacultativo |
| 12.000.000.000         | 4.800.000.000         | 240.000.000     | 1.360.000.000  | 3.200.000.000  | 1.600.000.000    | 22.000.000.000         | 7.200.000.000                  |
When expido la poliza mrc
And expido la poliza mrc
And de clic al boton detalle
And realice aprobacion especial asociada a varias observaciones
And expido la poliza mrc
And expido la poliza mrc
And capturo el numero de poliza 2
And ingrese al resumen de la poliza expedida
Given de clic al menu escritorio
And consulto poliza expedida 1
When de clic al menu reaseguro
And seleccione opcion Ver A Partir De: 01/03/2017 - 30/06/2017
Then se debe verificar el valor reasegurado, el valor retenido del contrato cuota parte CP, el riesgo cedido del contrato cuota parte y excedente:
| baseReasegurableRiesgo | baseReaseguroContrato | valorRetenidoCP | riesgoCedidoCP | riesgoCedidoEX | limiteContratoCP | baseReasegurableCumulo | riesgoCedidoAcuerdoFacultativo |
| 10.000.000.000         | 6.000.000.000         | 300.000.000     | 1.700.000.000  | 4.000.000.000  | 2.000.000.000    | 22.000.000.000         | 4.000.000.000                  |
Given consulto poliza expedida 2
And modifico la fecha de vigencia <fechaModificacion>
When seleccione la opcion siguiente en la modificacion
And ingrese las entradas en cambio de poliza de las diferentes coberturas
| TAB                      | TIPO_ARTICULO       | OTRO_ARTICULO_OTROS | COBERTURA        | ENTRADAS                         | VALOR_ENTRADAS |
| Información de Artículos | Muebles y enseres   |                     |                  | Valor Asegurable                 | 30000000000    |
| Información de Artículos | Muebles y enseres   |                     | Danos materiales | Valor asegurado danos materiales | 30000000000    |
And cotice y expida la poliza
And ingrese al resumen de la poliza expedida
And de clic al menu reaseguro
Then se debe verificar el valor reasegurado, el valor retenido del contrato cuota parte CP, el riesgo cedido del contrato cuota parte y excedente:
| baseReasegurableRiesgo | baseReaseguroContrato | valorRetenidoCP | riesgoCedidoCP | riesgoCedidoEX | limiteContratoCP | baseReasegurableCumulo | riesgoCedidoAcuerdoFacultativo |
| 18.000.000.000         | 7.200.000.000         | 294.545.455     | 1.669.090.909  | 5.236.363.636  | 1.963.636.364    | 28.000.000.000         | 10.800.000.000                 |
Given consulto poliza expedida 1
When de clic al menu reaseguro
And seleccione opcion Ver A Partir De: 01/04/2017 - 30/06/2017
Then se debe verificar el valor reasegurado, el valor retenido del contrato cuota parte CP, el riesgo cedido del contrato cuota parte y excedente:
| baseReasegurableRiesgo | baseReaseguroContrato | valorRetenidoCP | riesgoCedidoCP | riesgoCedidoEX | limiteContratoCP | baseReasegurableCumulo | riesgoCedidoAcuerdoFacultativo |
| 10.000.000.000         | 6.000.000.000         | 245.454.545     | 1.390.909.091  | 4.363.636.364  | 1.636.363.636    | 28.000.000.000         | 4.000.000.000                  |
Given estoy cotizando una poliza de mrc:
|producto               |tipo_documento      |fecha_nacimiento|primer_nombre|primer_apellido|tipo_direccion         |direccion       |departamento|ciudad  |agente|
|Multiriesgo corporativo|CEDULA DE CIUDADANIA|10/11/1983      |CARLOS       |VIDAL          |DIRECCION DE RESIDENCIA|CALLE 76a #80-69|Antioquia   |Medellin|INT-3 |
And seleccione la poliza como reaseguro especial
And ingrese la Fecha Inicio Vigencia: 01/05/2017
And ingrese a edificios y ubicaciones
And intente ingresar una nueva ubicacion sin riesgo consultable
| pais    | departamento| ciudad   | direccion             | actividadEconomica           | medioVenta |
| Colombia| Antioquia   | Bello    | AVENIDAS 45 # 58 - 33 | Cría de otros animales n.c.p | Asesor     |
And seleccione algunos articulos y sus cobertura:
| articulo | valor_asegurable | coberturas |
| Building | 4000000000       | Danos      |
| Machine  | 3000000000       | Danos      |
And cotice el articulo
And ingrese la informacion de un acuerdo facultativo <descripcionDeAcuerdo>
When ingrese la informacion de un reasegurador en la tabla de reaseguradores
|modalidad |porcentajeParticipacion|valorReaseguro|comisionReasegurador|comisionIntermediario|comisionPromotora|
|Gross rate|20                     |1,8           |0                   |0                    |0                |
And ingrese un reasegurador de tipo programa
And acepte el acuerdo facultativo
Then se debe verificar el valor reasegurado, el valor retenido del contrato cuota parte CP, el riesgo cedido del contrato cuota parte y excedente:
| baseReasegurableRiesgo | baseReaseguroContrato | valorRetenidoCP | riesgoCedidoCP | riesgoCedidoEX | limiteContratoCP | baseReasegurableCumulo | riesgoCedidoAcuerdoFacultativo |
| 7.000.000.000          | 5.600.000.000         | 89.361.702      | 506.382.979    | 5.004.255.319  | 595.744.681      | 35.000.000.000         | 1.400.000.000                  |
When expido la poliza mrc
And expido la poliza mrc
And de clic al boton detalle
And realice aprobacion especial asociada a varias observaciones
And expido la poliza mrc
And expido la poliza mrc
And ingrese al resumen de la poliza expedida
And de clic al menu reaseguro
Given consulto poliza expedida 1
When de clic al menu reaseguro
And seleccione opcion Ver A Partir De: 01/05/2017 - 30/06/2017
Then se debe verificar el valor reasegurado, el valor retenido del contrato cuota parte CP, el riesgo cedido del contrato cuota parte y excedente:
| baseReasegurableRiesgo | baseReaseguroContrato | valorRetenidoCP | riesgoCedidoCP | riesgoCedidoEX | limiteContratoCP | baseReasegurableCumulo | riesgoCedidoAcuerdoFacultativo |
| 10.000.000.000         | 6.000.000.000         | 95.744.681      | 542.553.191    | 5.361.702.128  | 638.297.872      | 35.000.000.000         | 4.000.000.000                  |
Given consulto poliza expedida 2
When de clic al menu reaseguro
And seleccione opcion Ver A Partir De: 01/05/2017 - 30/06/2017
Then se debe verificar el valor reasegurado, el valor retenido del contrato cuota parte CP, el riesgo cedido del contrato cuota parte y excedente:
| baseReasegurableRiesgo | baseReaseguroContrato | valorRetenidoCP | riesgoCedidoCP | riesgoCedidoEX | limiteContratoCP | baseReasegurableCumulo | riesgoCedidoAcuerdoFacultativo |
| 18.000.000.000         | 7.200.000.000         | 114.893.617     | 651.063.830    | 6.434.042.553  | 765.957.447      | 35.000.000.000         | 10.800.000.000                 |

Examples:
| TipoCo | PolizaRef | Documento | descripcionDeAcuerdo     | fechaModificacion |
| Cedido |           |           | Acuerdo Prueba Reaseguro | 01/04/2017        |