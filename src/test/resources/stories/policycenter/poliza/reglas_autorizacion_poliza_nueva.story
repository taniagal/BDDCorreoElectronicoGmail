Meta:
@lote3
@tag equipo: 5, sprint: 1
@local

Narrative:
Como miembro de suramericana de seguros en alguno de los roles que permite generar cotizaciones de poliza
Quiero poder autorizar ciertas reglas de validación asignadas a mi usuario
Para poder expedir polizas de forma exitosa

Scenario: Vehiculo importado por terceros,maximo valor de vehiculo, blindaje, maximo valor accesorios, maximo valor accesorios especiales, transporte combustible, zona no permitida
GivenStories: stories/policycenter/login_policy.story
Given tengo los siguientes parametros para poliza individual de autos:
|oficina    |asesor     |regla                      |
|4029       | 80301     | Transporte conbustible    |
Given estoy cotizando una poliza:
| cuenta      | producto  | oficina | agente_oficina                                 | tipoPoliza |
| 0225097276  | Autos     | 4029    | BELTRAN*SANABRIA CQLII**PEDRO ANTONIO          | Individual |
When ingrese los datos del asegurado <tipo_documento> <documento>
When ingrese los datos del vehiculo:
| placa  | modelo | codigo_fasecolda | ciudad_circulacion   | vehiculo_servicio | chasis | motor     | valor_asegurado | descuento | recargo | zona | plan               | medioVenta |transporte_combustible|vehiculo_blindado|
| random | 2017   | 00601190         | ISTMINA (CHOCO)      | Particular        | addsd  | dsdsdsds  | 94900000        | null      | null    | 11    | Plan Autos Global | Televentas |Si                    |Si               |
When ingrese las coberturas:
| limite | deducible | AS               |abogado|
| 640.   | 0         | Asistencia Global|       |
And llegue a la expedicion de la poliza
And cuando edite la transacion de la poliza
And agregue un nuevo valor asegurado <valor_asegurado>
And cuando edite la transacion de la poliza
And vaya a vehiculos en expedicion
And seleccione la opcion importado por terceros
And se ingrese el valor de los accesorios es superior al 20% del valor asegurado del vehiculo
And Se ingrese el valor de los accesorios especiales es superior al 100% del valor asegurado del vehículo
And cotice una poliza
And voy a expedir una poliza
And ingese al plan del trabajo
And valide la persona a la cual le llego el plan de trabajo


Examples:
| accesorios | tipo_documento       | documento  |valor_asegurado     |
| 2600000    | CEDULA DE CIUDADANIA | 1000283562 |405000000           |


Scenario: Modelo vehiculo, uso 665, n vehiculo,retroactividad , placa existente, bonificaciones, valor comercial
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza:
|cuenta    |producto|tipoPoliza |oficina|agente_oficina                                |
|0225097276|Autos   |Individual |4029   |BELTRAN*SANABRIA CQLII**PEDRO ANTONIO         |
When valla a la informacion de la poliza
And modifique la fecha de inicio de vigencia <tipoPlazo> <fechaInicioVigencia>
And ingrese los datos del asegurado <tipo_documento> <documento>
When vaya a agregar un vehiculo con los datos:
| placa  | modelo | codigo_fasecolda | ciudad_circulacion  | vehiculo_servicio | chasis | motor | valor_asegurado   | descuento | recargo | zona | plan                | medioVenta |
| dag64f | 1985   | 01601012         | MEDELLIN (ANTIOQUIA)| Particular        | PR3B4  | SnR4  | 1650000           | null      | null    | 2    | Plan Autos Clásico  | Televentas |
And ingrese los valores de accesorios y <valorAccesorio> <valorAccesorioEsp> valor de bonificacion tecnica <boniTecnica> y comercial <boniComercial>
And vaya al siguiente paso de la cotizacion
When ingrese las coberturas e intentar cotizar:
| limite | deducible | AS                |abogado|
| 640.   | 0         | Asistencia Clásica|       |


Examples:
| tipo_documento       | documento  |tipoPlazo|fechaInicioVigencia| valorAccesorio | valorAccesorioEsp | boniComercial | boniTecnica |
| CEDULA DE CIUDADANIA | 1000033793 |Anual    |10/07/2017         | 1750000        | 4000000           | 31            | 30          |

Scenario: PEPS, riesgo consultable
Given estoy cotizando una poliza:
| cuenta      | producto | oficina | agente_oficina                                | tipoPoliza |
| 0225097276  | Autos    | 4029    | BELTRAN*SANABRIA CQLII**PEDRO ANTONIO         | Individual |
When ingrese los datos del asegurado <tipo_documento> <documento>
When ingrese los datos del vehiculo:
| placa  | modelo | codigo_fasecolda | ciudad_circulacion               | vehiculo_servicio | chasis | motor     | valor_asegurado | descuento | recargo | zona | plan                 | medioVenta |
| random | 2017   | 00601190         | MEDELLIN (ANTIOQUIA)             | Particular        | addsd  | dsdsdsds  | 120000000       | null      | null    | 2    | Plan Autos Global    | Televentas |
When ingrese las coberturas e intentar cotizar:
| limite | deducible | AS               |abogado|
| 640.   | 0         | Asistencia Global|       |

Examples:
| tipo_documento       | documento  |
| CEDULA DE CIUDADANIA | 1000033793 |

Scenario: valor asegurado minimo, placa venezolana, marca no permitida,tipo servicio vehiculo
Given estoy cotizando una poliza:
| cuenta      | producto | oficina | agente_oficina                                | tipoPoliza |
| 0225097276  | Autos    | 4029    | BELTRAN*SANABRIA CQLII**PEDRO ANTONIO         | Individual |
When ingrese los datos del asegurado <tipo_documento> <documento>
When ingrese los datos del vehiculo:
| placa  | modelo | codigo_fasecolda | ciudad_circulacion               | vehiculo_servicio | chasis | motor     | valor_asegurado | descuento | recargo | zona | plan               | medioVenta |
| 11AAAA | 2015   | 35701008         | CUCUTA (NORTE DE SANTANDER)      | Público        | addsd  | dsdsdsds     | 284000000        | null      | null    | 9    | Plan Autos Global    | Televentas |
When ingrese las coberturas:
| limite | deducible | AS               |abogado|
| 640.   | 0         | Asistencia Global|       |
And llegue a la expedicion de la poliza
And cuando edite la transacion de la poliza
And agregue un nuevo valor asegurado <valor_asegurado>
And voy a expedir una poliza

Examples:
| tipo_documento       | documento   |valor_asegurado     |
| CEDULA DE CIUDADANIA | 1000283562  |3000000             |

Scenario: Vehiculo importado por terceros,maximo valor de vehiculo, blindaje, maximo valor accesorios, maximo valor accesorios especiales, transporte combustible, zona no permitida
Given estoy cotizando una poliza:
| cuenta      | producto | oficina | agente_oficina                                | tipoPoliza |
| 0225097276 | Autos    | 4029    | BELTRAN*SANABRIA CQLII**PEDRO ANTONIO         | Individual |
When ingrese los datos del asegurado <tipo_documento> <documento>
When ingrese los datos del vehiculo:
| placa  | modelo | codigo_fasecolda | ciudad_circulacion   | vehiculo_servicio | chasis | motor     | valor_asegurado | descuento | recargo | zona | plan               | medioVenta |transporte_combustible|vehiculo_blindado|
| random | 2017   | 00601190         | ISTMINA (CHOCO)      | Particular        | addsd  | dsdsdsds  | 94900000        | null      | null    | 11    | Plan Autos Global | Televentas |Si                    |Si               |
When ingrese las coberturas:
| limite | deducible | AS               |abogado|
| 640.   | 0         | Asistencia Global|       |
And llegue a la expedicion de la poliza
And cuando edite la transacion de la poliza
And agregue un nuevo valor asegurado <valor_asegurado>
And cuando edite la transacion de la poliza
And vaya a vehiculos en expedicion
And seleccione la opcion importado por terceros
And se ingrese el valor de los accesorios es superior al 20% del valor asegurado del vehiculo
And Se ingrese el valor de los accesorios especiales es superior al 100% del valor asegurado del vehículo
And cotice una poliza
And voy a expedir una poliza
Examples:
| accesorios | tipo_documento       | documento  |valor_asegurado     |
| 2600000    | CEDULA DE CIUDADANIA | 1000283562 |405000000           |

