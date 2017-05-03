Meta:
@lote4
@tag equipo: reaseguro
@local

Narrative:
como usario de policy center
con un perfil que tenga permisos quiero ser capaz ver la distribución de cúmulos de reaseguro con facultativo según la acitividad económica,
para verificar que el reaseguro de cúmulos se haga correctamente


Scenario: Crear poliza  MRC en una misma direccion y que haga cumulo. Cin facultativo. Poliza A
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza de mrc:
|producto               |tipo_documento      |fecha_nacimiento|primer_nombre|primer_apellido|tipo_direccion         |direccion       |departamento|ciudad  |agente|
|Multiriesgo corporativo|CEDULA DE CIUDADANIA|10/11/1973      |RAMON        |CARDONA        |DIRECCION DE RESIDENCIA|CALLE 66a #80-69|Antioquia   |Medellin|INT-3 |
And ingrese la <fechaInicioVigencia> para un anio
And seleccione la poliza como reaseguro especial
And ingrese a edificios y ubicaciones
And intente ingresar una nueva ubicacion sin riesgo consultable
| pais    | departamento| ciudad   | direccion             | actividadEconomica                            | medioVenta |
| Colombia| Antioquia   | Bello    | AVENIDAS 69 # 58 - 33 | Fabricación de otros artículos textiles n.c.p | Asesor     |
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
| baseReasegurableRiesgo | valorRetenidoCP | riesgoCedidoCP | riesgoCedidoEX | limiteContratoCP | proporcionCP | proporcionEX | proporcionRetencion | baseReasegurableCumulo | riesgoCedidoAcuerdoFacultativo |
| 6.000.000.000          | 600.000.000     | 3.400.000.000  | 2.000.000.000  | 4.000.000.000    | 34           | 20           | 6                   | 10.000.000.000         | 4.000.000.000                  |
When expido la poliza
And ingrese a analisis de riesgo
And realice aprobacion especial asociada a varias observaciones
And expido la poliza mrc
And expido la poliza mrc
And capturo el numero de poliza 1

Examples:
| fechaInicioVigencia | descripcionDeAcuerdo               |
| 01/02/2017          | Descripcion de acuerdo para test 1 |


Scenario: Crear poliza  MRC en una misma direccion y que haga cumulo. Con facultativo. Poliza B
Given estoy cotizando una poliza de mrc:
|producto               |tipo_documento      |fecha_nacimiento|primer_nombre|primer_apellido|tipo_direccion         |direccion       |departamento|ciudad  |agente|
|Multiriesgo corporativo|CEDULA DE CIUDADANIA|10/11/1965      |JUANES       |OCAMPO         |DIRECCION DE RESIDENCIA|CALLE 10a #00-69|Antioquia   |Medellin|INT-3 |
When quiero agregar coaseguro <TipoCo> con poliza referencia <PolizaRef> documento <Documento> y particion de aseguradoras
| ASEGURADORA                         | PARTICIPACION |
| Seguros Generales Suramericana S.A. | 20            |
| ACE SEGUROS S.A                     | 80            |
And de clic en Aceptar de la ventana Coaseguro
Given ingrese la <fechaInicioVigencia> para un anio
And seleccione la poliza como reaseguro especial
And ingrese a edificios y ubicaciones
And intente ingresar una nueva ubicacion sin riesgo consultable
| pais    | departamento| ciudad   | direccion             | actividadEconomica                                                   |medioVenta|
| Colombia| Antioquia   | Bello    | AVENIDAS 69 # 58 - 33 | Comercio al por menor de otros productos en puestos de venta móviles |Asesor    |
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
| baseReasegurableRiesgo | valorRetenidoCP | riesgoCedidoCP | riesgoCedidoEX | limiteContratoCP | proporcionCP | proporcionEX | proporcionRetencion | baseReasegurableCumulo | riesgoCedidoAcuerdoFacultativo |
| 4.800.000.000          | 240.000.000     | 1.360.000.000  | 3.200.000.000  | 1.600.000.000    | 11,333333    | 26,666667    | 2                   | 22.000.000.000         | 7.200.000.000                  |
When expido la poliza
And ingrese a analisis de riesgo
And realice aprobacion especial asociada a varias observaciones
And expido la poliza mrc
And expido la poliza mrc
And capturo el numero de poliza 2

Examples:
| fechaInicioVigencia | TipoCo | PolizaRef | Documento | descripcionDeAcuerdo               |
| 01/03/2017          | Cedido |           |           | Descripcion de acuerdo para test 2 |


Scenario: Consultar poliza A despues de expedir la poiiza B
Given consulto poliza expedida 1
When de clic al menu reaseguro
And seleccione opcion ver a partir de <verApartirDe>
Then se debe verificar el valor reasegurado, el valor retenido del contrato cuota parte CP, el riesgo cedido del contrato cuota parte y excedente:
| baseReasegurableRiesgo | valorRetenidoCP | riesgoCedidoCP | riesgoCedidoEX | limiteContratoCP | proporcionCP | proporcionEX | proporcionRetencion | baseReasegurableCumulo |
| 12.000.000.000         | 240.000.000     | 1.360.000.000  | 3.200.000.000  | 1.600.000.000    | 6,8          | 92           | 1,2                 | 15.000.000.000         |

Examples:
| verApartirDe            |
| 01/03/2017 - 30/06/2017 |


Scenario: Modificar poliza A despues de expedir la poliza B
Given modifico la fecha de vigencia <fechaModificacion>
When ingrese al menu edificios y ubicaciones
And ingrese las entradas en cambio de poliza de las diferentes coberturas
| TAB                      | TIPO_ARTICULO       | OTRO_ARTICULO_OTROS | COBERTURA        | ENTRADAS                         | VALOR_ENTRADAS |
| Información de Artículos | Muebles y enseres   |                     |                  | Valor Asegurable                 | 10000000000    |
| Información de Artículos | Muebles y enseres   |                     | Danos materiales | Valor asegurado danos materiales | 10000000000    |
And cotice y expida la poliza
And ingrese al resumen de la poliza expedida
And de clic al menu reaseguro
Then se debe verificar el valor reasegurado, el valor retenido del contrato cuota parte CP, el riesgo cedido del contrato cuota parte y excedente:
| baseReasegurableRiesgo | valorRetenidoCP | riesgoCedidoCP | riesgoCedidoEX | limiteContratoCP | proporcionCP | proporcionEX | proporcionRetencion | baseReasegurableCumulo |
| 20.000.000.000         | 144.000.000     | 816.000.000    | 19.040.000.000 | 960.000.000      | 4,08         | 95,2         | 0,72                | 25.000.000.000         |

Examples:
| fechaModificacion |
| 01/04/2017        |


Scenario: Consultar poliza B despues de modificar la poliza A
Given consulto poliza expedida 2
When de clic al menu reaseguro
And seleccione opcion ver a partir de <verApartirDe>
Then se debe verificar el valor reasegurado, el valor retenido del contrato cuota parte CP, el riesgo cedido del contrato cuota parte y excedente:
| baseReasegurableRiesgo | valorRetenidoCP | riesgoCedidoCP | riesgoCedidoEX | limiteContratoCP | proporcionCP | proporcionEX | proporcionRetencion | baseReasegurableCumulo |
| 5.000.000.000          | 36.000.000      | 204.000.000    | 4.760.000.000  | 240.000.000      | 4,08         | 95,2         | 0,72                | 25.000.000.000         |

Examples:
| verApartirDe            |
| 01/04/2017 - 30/06/2017 |


Scenario: Crear poliza  MRC en una misma direccion y que haga cumulo. Sin facultativos. Poliza C
Given estoy cotizando una poliza de mrc:
|producto               |tipo_documento      |fecha_nacimiento|primer_nombre|primer_apellido|tipo_direccion         |direccion       |departamento|ciudad  |agente|
|Multiriesgo corporativo|CEDULA DE CIUDADANIA|10/11/1963      |JUANES       |PIEDRAHITA     |DIRECCION DE RESIDENCIA|CALLE 62a #71-69|Antioquia   |Medellin|INT-3 |
And ingrese la <fechaInicioVigencia> para un anio
And ingrese a edificios y ubicaciones
And intente ingresar una nueva ubicacion sin riesgo consultable
| pais    | departamento| ciudad   | direccion             | actividadEconomica           | medioVenta |
| Colombia| Antioquia   | Bello    | AVENIDAS 33 # 57 - 29 | Cría de otros animales n.c.p | Asesor     |
And seleccione algunos articulos y sus cobertura:
| articulo | valor_asegurable | coberturas |
| Building | 1000000000       | Danos      |
| Machine  | 1000000000       | Danos      |
And cotice el articulo
When intente expedir la poliza
And confirmo el mensaje de expedir poliza
And ingrese al resumen de la poliza expedida
And de clic al menu reaseguro
Then se debe verificar el valor reasegurado, el valor retenido del contrato cuota parte CP, el riesgo cedido del contrato cuota parte y excedente:
| baseReasegurableRiesgo | valorRetenidoCP | riesgoCedidoCP | riesgoCedidoEX | limiteContratoCP | proporcionCP | proporcionEX | proporcionRetencion | baseReasegurableCumulo |
| 2.000.000.000          | 13.333.333      | 75.555.556     | 1.911.111.111  | 88.888.889       | 3,777778     | 95,555556    | 0,666667            | 27.000.000.000         |

Examples:
| fechaInicioVigencia |
| 01/05/2017          |


Scenario: Consultar poliza A despues de expedir la poiiza C
Given consulto poliza expedida 1
When de clic al menu reaseguro
And seleccione opcion ver a partir de <verApartirDe>
Then se debe verificar el valor reasegurado, el valor retenido del contrato cuota parte CP, el riesgo cedido del contrato cuota parte y excedente:
| baseReasegurableRiesgo | valorRetenidoCP | riesgoCedidoCP | riesgoCedidoEX | limiteContratoCP | proporcionCP | proporcionEX | proporcionRetencion | baseReasegurableCumulo |
| 20.000.000.000         | 133.333.333     | 755.555.556    | 19.111.111.111 | 888.888.889      | 3,777778     | 95,555556    | 0,666667            | 27.000.000.000         |

Examples:
| verApartirDe            |
| 01/05/2017 - 30/06/2017 |


Scenario: Consultar poliza B despues de expedir la poiiza C
Given consulto poliza expedida 2
When de clic al menu reaseguro
And seleccione opcion ver a partir de <verApartirDe>
Then se debe verificar el valor reasegurado, el valor retenido del contrato cuota parte CP, el riesgo cedido del contrato cuota parte y excedente:
| baseReasegurableRiesgo | valorRetenidoCP | riesgoCedidoCP | riesgoCedidoEX | limiteContratoCP | proporcionCP | proporcionEX | proporcionRetencion | baseReasegurableCumulo |
| 5.000.000.000          | 33.333.333      | 188.888.889    | 4.777.777.778  | 222.222.222      | 3,777778     | 95,555556    | 0,666667            | 27.000.000.000         |

Examples:
| verApartirDe            |
| 01/05/2017 - 30/06/2017 |