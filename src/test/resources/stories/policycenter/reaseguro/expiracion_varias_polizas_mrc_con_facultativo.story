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
|Multiriesgo corporativo|CEDULA DE CIUDADANIA|10/11/1958      |KAPLAN       |CUEVANA        |DIRECCION DE RESIDENCIA|CALLE 12b #60-69|Antioquia   |Medellin|INT-3 |
And ingrese el tipo de vigencia de la poliza <tipoVigencia>
And ingrese la <fechaInicioVigencia> para un anio
And ingrese la fecha fin de vigencia de la poliza
And seleccione la poliza como reaseguro especial
And ingrese a edificios y ubicaciones
And intente ingresar una nueva ubicacion sin riesgo consultable
| pais    | departamento| ciudad   | direccion             | actividadEconomica                            | medioVenta |
| Colombia| Antioquia   | Bello    | AVENIDAS 46 # 60 - 35 | Fabricación de otros artículos textiles n.c.p | Asesor     |
And seleccione algunos articulos y sus cobertura:
| articulo | valor_asegurable | coberturas |
| Building | 10000000000      | Danos      |
| Machine  | 10000000000      | Danos      |
And cotice el articulo
And ingrese la informacion de un acuerdo facultativo <descripcionDeAcuerdo>
When ingrese la informacion de un reasegurador en la tabla de reaseguradores
|modalidad |porcentajeParticipacion|valorReaseguro|comisionReasegurador|comisionIntermediario|comisionPromotora|
|Gross rate|40                     |1,8           |0                   |0                    |0                |
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
| Otra         | 01/11/2016          | Descripcion de acuerdo para test 4 |


Scenario: Crear poliza  MRC en una misma direccion y que haga cumulo. Con facultativo. Poliza B
Given estoy cotizando una poliza de mrc:
|producto               |tipo_documento      |fecha_nacimiento|primer_nombre|primer_apellido|tipo_direccion         |direccion       |departamento|ciudad  |agente|
|Multiriesgo corporativo|CEDULA DE CIUDADANIA|10/11/1958      |KARLA        |OBANDO         |DIRECCION DE RESIDENCIA|CALLE 12b #69-69|Antioquia   |Medellin|INT-3 |
And ingrese el tipo de vigencia de la poliza <tipoVigencia>
And ingrese la <fechaInicioVigencia> para un anio
And ingrese la fecha fin de vigencia de la poliza
And seleccione la poliza como reaseguro especial
And ingrese a edificios y ubicaciones
And intente ingresar una nueva ubicacion sin riesgo consultable
| pais    | departamento| ciudad   | direccion             | actividadEconomica           | medioVenta |
| Colombia| Antioquia   | Bello    | AVENIDAS 45 # 60 - 35 | Cría de otros animales n.c.p | Asesor     |
And seleccione algunos articulos y sus cobertura:
| articulo | valor_asegurable | coberturas |
| Building | 5000000000       | Danos      |
| Machine  | 5000000000       | Danos      |
And cotice el articulo
And ingrese la informacion de un acuerdo facultativo <descripcionDeAcuerdo>
When ingrese la informacion de un reasegurador en la tabla de reaseguradores
| modalidad  | porcentajeParticipacion | valorReaseguro | comisionReasegurador | comisionIntermediario | comisionPromotora |
| Gross rate | 30                      | 1,8            | 0                    | 0                     | 0                 |
And ingrese un reasegurador de tipo programa
And acepte el acuerdo facultativo
Then se debe verificar el valor reasegurado, el valor retenido del contrato cuota parte CP, el riesgo cedido del contrato cuota parte y excedente:
| baseReasegurableRiesgo | baseReaseguroContrato | valorRetenidoCP | riesgoCedidoCP | riesgoCedidoEX | limiteContratoCP | baseReasegurableCumulo | riesgoCedidoAcuerdoFacultativo |
| 10.000.000.000         | 7.000.000.000         | 110.526.316     | 626.315.789    | 6.263.157.895  | 736.842.105      | 30.000.000.000         | 3.000.000.000                  |
When expido la poliza mrc
And expido la poliza mrc
And de clic al boton detalle
And realice aprobacion especial asociada a varias observaciones
And expido la poliza mrc
And expido la poliza mrc
And capturo el numero de poliza 2
And ingrese al resumen de la poliza expedida

Examples:
| tipoVigencia | fechaInicioVigencia | descripcionDeAcuerdo               |
| Otra         | 01/11/2016          | Descripcion de acuerdo para test 5 |


Scenario: Consultar poliza A despues de expedir la poliza B
Given se va a consultar poliza expedida 1
When de clic al menu reaseguro
Then se debe verificar el valor reasegurado, el valor retenido del contrato cuota parte CP, el riesgo cedido del contrato cuota parte y excedente:
| baseReasegurableRiesgo | baseReaseguroContrato | valorRetenidoCP | riesgoCedidoCP | riesgoCedidoEX | limiteContratoCP | baseReasegurableCumulo | riesgoCedidoAcuerdoFacultativo |
| 20.000.000.000         | 12.000.000.000        | 189.473.684     | 1.073.684.211  | 10.736.842.105 | 1.263.157.895    | 30.000.000.000         | 8.000.000.000                  |

Examples:
| |
| |


Scenario: Crear poliza  MRC en una misma direccion y que haga cumulo. Con facultativo. Poliza C
Given estoy cotizando una poliza de mrc:
|producto               |tipo_documento      |fecha_nacimiento|primer_nombre|primer_apellido|tipo_direccion         |direccion       |departamento|ciudad  |agente|
|Multiriesgo corporativo|CEDULA DE CIUDADANIA|11/11/1995      |MARGARA      |VILLA          |DIRECCION DE RESIDENCIA|CALLE 80 # 80-69|Antioquia   |Medellin|INT-3 |
And ingrese la <fechaInicioVigencia> para un anio
And seleccione la poliza como reaseguro especial
And ingrese a edificios y ubicaciones
And intente ingresar una nueva ubicacion sin riesgo consultable
| pais    | departamento| ciudad   | direccion             | actividadEconomica                                                   | medioVenta |
| Colombia| Antioquia   | Bello    | AVENIDAS 45 # 60 - 35 | Comercio al por menor de otros productos en puestos de venta móviles | Asesor     |
And seleccione algunos articulos y sus cobertura:
| articulo | valor_asegurable | coberturas |
| Building | 5000000000       | Danos      |
| Machine  | 5000000000       | Danos      |
And cotice el articulo
And ingrese la informacion de un acuerdo facultativo <descripcionDeAcuerdo>
When ingrese la informacion de un reasegurador en la tabla de reaseguradores
| modalidad  | porcentajeParticipacion | valorReaseguro | comisionReasegurador | comisionIntermediario | comisionPromotora |
| Gross rate | 20                      | 1,8            | 0                    | 0                     | 0                 |
And ingrese un reasegurador de tipo programa
And acepte el acuerdo facultativo
Then se debe verificar el valor reasegurado, el valor retenido del contrato cuota parte CP, el riesgo cedido del contrato cuota parte y excedente:
| baseReasegurableRiesgo | baseReaseguroContrato | valorRetenidoCP | riesgoCedidoCP | riesgoCedidoEX | limiteContratoCP | baseReasegurableCumulo | riesgoCedidoAcuerdoFacultativo |
| 10.000.000.000         | 8.000.000.000         | 88.888.889      | 503.703.704    | 7.407.407.407  | 592.592.593      | 40.000.000.000         | 2.000.000.000                  |
When expido la poliza mrc
And expido la poliza mrc
And de clic al boton detalle
And realice aprobacion especial asociada a varias observaciones
And expido la poliza mrc
And expido la poliza mrc
And capturo el numero de poliza 3
And ingrese al resumen de la poliza expedida

Examples:
| fechaInicioVigencia | descripcionDeAcuerdo               |
| 01/01/2017          | Descripcion de acuerdo para test 6 |


Scenario: Consultar poliza A despues de expedir la poliza C
Given se va a consultar poliza expedida 1
When de clic al menu reaseguro
And seleccione opcion ver a partir de <verApartirDe>
Then se debe verificar el valor reasegurado, el valor retenido del contrato cuota parte CP, el riesgo cedido del contrato cuota parte y excedente:
| baseReasegurableRiesgo | baseReaseguroContrato | valorRetenidoCP | riesgoCedidoCP | riesgoCedidoEX | limiteContratoCP | baseReasegurableCumulo | riesgoCedidoAcuerdoFacultativo |
| 20.000.000.000         | 12.000.000.000        | 133.333.333     | 755.555.556    | 11.111.111.111 | 888.888.889      | 40.000.000.000         | 8.000.000.000                  |

Examples:
| verApartirDe |
| 01/01/2017 - |


Scenario: Consultar poliza B despues de expedir la poliza C
Given se va a consultar poliza expedida 2
When de clic al menu reaseguro
And seleccione opcion ver a partir de <verApartirDe>
Then se debe verificar el valor reasegurado, el valor retenido del contrato cuota parte CP, el riesgo cedido del contrato cuota parte y excedente:
| baseReasegurableRiesgo | baseReaseguroContrato | valorRetenidoCP | riesgoCedidoCP | riesgoCedidoEX | limiteContratoCP | baseReasegurableCumulo | riesgoCedidoAcuerdoFacultativo |
| 10.000.000.000         | 7.000.000.000         | 77.777.778      | 440.740.741    | 6.481.481.481  | 518.518.519      | 40.000.000.000         | 3.000.000.000                  |

Examples:
| verApartirDe |
| 01/01/2017 - |


Scenario: Crear poliza  MRC en una misma direccion y que haga cumulo. Sin facultativo. Poliza D
Given estoy cotizando una poliza de mrc:
|producto               |tipo_documento      |fecha_nacimiento|primer_nombre|primer_apellido|tipo_direccion         |direccion       |departamento|ciudad  |agente|
|Multiriesgo corporativo|CEDULA DE CIUDADANIA|11/11/1995      |RAUL         |VASCO          |DIRECCION DE RESIDENCIA|CALLE 60 # 80-69|Antioquia   |Medellin|INT-3 |
And ingrese la <fechaInicioVigencia> para un anio
And ingrese a edificios y ubicaciones
And intente ingresar una nueva ubicacion sin riesgo consultable
| pais    | departamento| ciudad   | direccion             | actividadEconomica                                                   | medioVenta |
| Colombia| Antioquia   | Bello    | AVENIDAS 45 # 60 - 35 | Comercio al por menor de otros productos en puestos de venta móviles | Asesor     |
And seleccione algunos articulos y sus cobertura:
| articulo | valor_asegurable | coberturas |
| Building | 2000000000       | Danos      |
| Machine  | 2000000000       | Danos      |
And cotice el articulo
When intente expedir la poliza
And confirmo el mensaje de expedir poliza
And ingrese a analisis de riesgo
And realice la aprobacion especial
And expida la poliza
And expida la poliza
And expido la poliza mrc
And capturo el numero de poliza 4
And ingrese al resumen de la poliza expedida
And de clic al menu reaseguro
Then se debe verificar el valor reasegurado, el valor retenido del contrato cuota parte CP, el riesgo cedido del contrato cuota parte y excedente:
| baseReasegurableRiesgo | baseReaseguroContrato | valorRetenidoCP | riesgoCedidoCP | riesgoCedidoEX | limiteContratoCP | baseReasegurableCumulo |
| 4.000.000.000          | 4.000.000.000         | 38.709.677      | 219.354.839    | 3.741.935.484  | 258.064.516      | 44.000.000.000         |

Examples:
| fechaInicioVigencia |
| 01/01/2017          |


Scenario: Consultar poliza A despues de expedir la poliza D
Given se va a consultar poliza expedida 1
When de clic al menu reaseguro
And seleccione opcion ver a partir de <verApartirDe>
Then se debe verificar el valor reasegurado, el valor retenido del contrato cuota parte CP, el riesgo cedido del contrato cuota parte y excedente:
| baseReasegurableRiesgo | baseReaseguroContrato | valorRetenidoCP | riesgoCedidoCP | riesgoCedidoEX | limiteContratoCP | baseReasegurableCumulo | riesgoCedidoAcuerdoFacultativo |
| 20.000.000.000         | 12.000.000.000        | 116.129.032     | 658.064.516    | 11.225.806.452 | 774.193.548      | 44.000.000.000         | 8.000.000.000                  |

Examples:
| verApartirDe |
| 01/01/2017 - |


Scenario: Consultar poliza B despues de expedir la poliza D
Given se va a consultar poliza expedida 2
When de clic al menu reaseguro
And seleccione opcion ver a partir de <verApartirDe>
Then se debe verificar el valor reasegurado, el valor retenido del contrato cuota parte CP, el riesgo cedido del contrato cuota parte y excedente:
| baseReasegurableRiesgo | baseReaseguroContrato | valorRetenidoCP | riesgoCedidoCP | riesgoCedidoEX | limiteContratoCP | baseReasegurableCumulo | riesgoCedidoAcuerdoFacultativo |
| 10.000.000.000         | 7.000.000.000         | 67.741.935      | 383.870.968    | 6.548.387.097  | 451.612.903      | 44.000.000.000         | 3.000.000.000                  |

Examples:
| verApartirDe |
| 01/01/2017 - |


Scenario: Consultar poliza C despues de expedir la poliza D
Given se va a consultar poliza expedida 3
When de clic al menu reaseguro
And seleccione opcion ver a partir de <verApartirDe>
Then se debe verificar el valor reasegurado, el valor retenido del contrato cuota parte CP, el riesgo cedido del contrato cuota parte y excedente:
| baseReasegurableRiesgo | baseReaseguroContrato | valorRetenidoCP | riesgoCedidoCP | riesgoCedidoEX | limiteContratoCP | baseReasegurableCumulo | riesgoCedidoAcuerdoFacultativo |
| 10.000.000.000         | 8.000.000.000         | 77.419.355      | 438.709.677    | 7.483.870.968  | 516.129.032      | 44.000.000.000         | 2.000.000.000                  |
And quiera ejecutar una tarea de proceso por lotes <nombreTarea>

Examples:
| verApartirDe | nombreTarea                   |
| 01/01/2017 - | Reinsurance Policy Expiration |


Scenario: Consultar poliza C despues de ejecutar tarea
Given se va a consultar poliza expedida 3
When de clic al menu reaseguro
And seleccione opcion ver a partir de <verApartirDe>
Then se debe verificar el valor reasegurado, el valor retenido del contrato cuota parte CP, el riesgo cedido del contrato cuota parte y excedente:
| baseReasegurableRiesgo | baseReaseguroContrato | valorRetenidoCP | riesgoCedidoCP | riesgoCedidoEX | limiteContratoCP | baseReasegurableCumulo | riesgoCedidoAcuerdoFacultativo |
| 10.000.000.000         | 8.000.000.000         | 360.000.000     | 2.040.000.000  | 5.600.000.000  | 2.400.000.000    | 14.000.000.000         | 2.000.000.000                  |

Examples:
| verApartirDe |
| - 30/06/2017 |


Scenario: Consultar poliza D despues de ejecutar tarea
Given se va a consultar poliza expedida 4
When de clic al menu reaseguro
And seleccione opcion ver a partir de <verApartirDe>
Then se debe verificar el valor reasegurado, el valor retenido del contrato cuota parte CP, el riesgo cedido del contrato cuota parte y excedente:
| baseReasegurableRiesgo | baseReaseguroContrato | valorRetenidoCP | riesgoCedidoCP | riesgoCedidoEX | limiteContratoCP | baseReasegurableCumulo |
| 4.000.000.000          | 4.000.000.000         | 180.000.000     | 1.020.000.000  | 2.800.000.000  | 1.200.000.000    | 14.000.000.000         |

Examples:
| verApartirDe |
| - 30/06/2017 |