Meta:

Narrative:
Como miembro de suramericana de seguros en alguno de los roles que permite generar cotizaciones de poliza
Quiero poder autorizar ciertas reglas de validación asignadas a mi usuario
Para poder expedir polizas de forma exitosa

Scenario: 1Reglas que requieren autorizacion:Accesorios mayor al 20%, accesorios especiales,limite maximo permitido, placa existente en otra poliza, marca no permitida.
Given carga de aplicacion de Policy: http://labcoreseguros.suramericana.com/pc/PolicyCenter.do
When logueo en PolicyCenter Lab: Colombia, grcegwsu y sura2017 se debe mostrar: Mis actividades
Given se tienen los siguientes parametros para la busqueda
|oficina|asesor    |regla                                                                                                                                                                                     | canal     |                                                                                                                                                                                                                                                                                                                                                                     |canal |
|4029   |null      |mayor al 20%,mayor al valor Asegurado del vehículo,límite máximo permitido,La placa DAG64F está asegurada en la póliza,no puede ser asegurado,rangos estimados por Suramericana           |CC013      |
Given estoy cotizando una poliza:
| cuenta      | producto  | oficina | agente_oficina                                 | tipoPoliza |
| 0225097276  | Autos     | 4029    | BELTRAN*SANABRIA CQLII**PEDRO ANTONIO          | Individual |
And capturar el numero de cotizacion en estado borrador
When ingrese los datos del asegurado <tipo_documento> <documento>
When ingrese los datos del vehiculo:
| placa  | modelo | codigo_fasecolda | ciudad_circulacion       | vehiculo_servicio | chasis | motor     | valor_asegurado  | descuento | recargo | zona   | plan               | medioVenta |
| dag64f | 2015   | 35701008         | MEDELLIN (ANTIOQUIA)     | Particular        | addsd  | dsdsdsds  | 284000000        | null      | null    | 2     | Plan Autos Global   | Televentas |
When ingrese las coberturas:
| limite | deducible | AS               |abogado|
| 640.   | 0         | Asistencia Global|       |
And llegue a la expedicion de la poliza
And cuando edite la transacion de la poliza
And agregue un nuevo valor asegurado <valor_asegurado>
And cuando edite la transacion de la poliza
And vaya a vehiculos en expedicion
And se ingrese el valor de los accesorios es superior al 20% del valor asegurado del vehiculo
And Se ingrese el valor de los accesorios especiales es superior al 100% del valor asegurado del vehículo
And cotice una poliza
And voy a expedir una poliza
And de click en el boton aceptar
And voy a expedir una poliza
And de click en el boton aceptar
And ingrese a la opcion requisitos a diligenciar todos los requisitos
And vuelva a la cotizacion de poliza
And voy a expedir una poliza
And de click en el boton aceptar
And ingrese a la opcion plan de trabajo
And valide la generacion de las reglas que deben ser autorizadas
And valide el usuario que debe aprobar una u otra regla de autorizacion
And ir al usuario a validar asignación de actividad
Examples:
| accesorios | tipo_documento       | documento  |valor_asegurado     |
| 2600000    | CEDULA DE CIUDADANIA | 1000283562 |405000000           |

Scenario: Reglas que requieren autorizacion:Placa extrangera,uso vehiculo,modelo vehiculo, valor minimo no tiene
Given se tienen los siguientes parametros para la busqueda
|oficina|asesor     |regla                                                                             | canal     |                                                                                                                                                                                                                                                                                                                                                                     |canal |
|4029   |10154      |Placa extranjera,inferior al tope mínimo,modelo es superior al máximo permitido   | CC013     |
Given estoy cotizando una poliza:
| cuenta      | producto  | oficina | agente_oficina                                 | tipoPoliza |
| 0225097276  | Autos     | 4029    | BELTRAN*SANABRIA CQLII**PEDRO ANTONIO          | Individual |
And capturar el numero de cotizacion en estado borrador
When ingrese los datos del asegurado <tipo_documento> <documento>
When ingrese los datos del vehiculo:
| placa   | modelo | codigo_fasecolda | ciudad_circulacion               | vehiculo_servicio | chasis | motor     | valor_asegurado | descuento | recargo | zona | plan               | medioVenta |transporte_combustible|vehiculo_blindado|
| AA111AA | 1985   | 01601012         | CUCUTA (NORTE DE SANTANDER)      | Particular        | addsd  | dsdsdsds  | 1400000         | null      | null    | 9    | Plan Autos Global  | Televentas |                      |                 |
When ingrese las coberturas:
| limite | deducible | AS               |abogado|
| 640.   | 0         | Asistencia Global|       |
And llegue a la expedicion de la poliza
And cuando edite la transacion de la poliza
And vaya a vehiculos en expedicion
And seleccione el tipo de uso del vehiculo <usoVehiculo>
And cotice una poliza
And voy a expedir una poliza
And de click en el boton aceptar
And ingese al plan del trabajo
And vaya a vehiculos en expedicion
And voy a expedir una poliza
And de click en el boton aceptar
And ingese al plan del trabajo
And valide la generacion de las reglas que deben ser autorizadas
And valide el usuario que debe aprobar una u otra regla de autorizacion
And ir al usuario a validar asignación de actividad

Examples:
| tipo_documento       | documento  |tipoPlazo|fechaInicioVigencia|usoVehiculo|
| CEDULA DE CIUDADANIA | 1000033793 |Anual    |10/07/2017         |Familiar   |


Scenario: 1Reglas que requieren autorizacion:Accesorios mayor al 20%, accesorios especiales,limite maximo permitido, placa existente en otra poliza, marca no permitida.
Given se tienen los siguientes parametros para la busqueda
|oficina|asesor    |regla                                                                                                                                                                                     | canal     |                                                                                                                                                                                                                                                                                                                                                                     |canal |
|4029   |null      |mayor al 20%,mayor al valor Asegurado del vehículo,límite máximo permitido,La placa DAG64F está asegurada en la póliza,no puede ser asegurado,rangos estimados por Suramericana           |CC013      |
Given estoy cotizando una poliza:
| cuenta      | producto  | oficina | agente_oficina                                 | tipoPoliza |
| 0225097276  | Autos     | 4029    | BELTRAN*SANABRIA CQLII**PEDRO ANTONIO          | Individual |
And capturar el numero de cotizacion en estado borrador
When ingrese los datos del asegurado <tipo_documento> <documento>
When ingrese los datos del vehiculo:
| placa  | modelo | codigo_fasecolda | ciudad_circulacion       | vehiculo_servicio | chasis | motor     | valor_asegurado  | descuento | recargo | zona   | plan               | medioVenta |
| dag64f | 2015   | 35701008         | MEDELLIN (ANTIOQUIA)     | Particular        | addsd  | dsdsdsds  | 284000000        | null      | null    | 2     | Plan Autos Global   | Televentas |
When ingrese las coberturas:
| limite | deducible | AS               |abogado|
| 640.   | 0         | Asistencia Global|       |
And llegue a la expedicion de la poliza
And cuando edite la transacion de la poliza
And agregue un nuevo valor asegurado <valor_asegurado>
And cuando edite la transacion de la poliza
And vaya a vehiculos en expedicion
And se ingrese el valor de los accesorios es superior al 20% del valor asegurado del vehiculo
And Se ingrese el valor de los accesorios especiales es superior al 100% del valor asegurado del vehículo
And cotice una poliza
And voy a expedir una poliza
And de click en el boton aceptar
And ingrese a la opcion requisitos a diligenciar todos los requisitos
And vuelva a la cotizacion de poliza
And voy a expedir una poliza
And de click en el boton aceptar
And ingese al plan del trabajo
And valide la generacion de las reglas que deben ser autorizadas
And valide el usuario que debe aprobar una u otra regla de autorizacion
And ir al usuario a validar asignación de actividad
Examples:
| accesorios | tipo_documento       | documento  |valor_asegurado     |
| 2600000    | CEDULA DE CIUDADANIA | 1000283562 |405000000           |

Scenario: Reglas que requieren autorizacion:retroactividad
Given se tienen los siguientes parametros para la busqueda
|oficina|asesor     |regla                                 | canal     |                                                                                                                                                                                                                                                                                                                                                                     |canal |
|4029   |10154      |parámetro de retroactividad definido  |CC013      |
Given estoy cotizando una poliza:
| cuenta      | producto  | oficina | agente_oficina                                 | tipoPoliza |
| 0225097276  | Autos     | 4029    | BELTRAN*SANABRIA CQLII**PEDRO ANTONIO          | Individual |
And capturar el numero de cotizacion en estado borrador
And ingrese la Fecha Inicio Vigencia: -70
When ingrese datos del asegurado de policy <tipo_documento> <documento>
And ingrese los datos del vehiculo que va asegurar:
| placa  | modelo | codigo_fasecolda | ciudad_circulacion | vehiculo_servicio | chasis    | motor     | valor_asegurado | descuento | recargo | zona | plan               | medioVenta | cero_kilometros |
| random | 2018   | 08008011         | MEDELLIN           | Particular        | asdfghjkl | asdfghjkl | 57500000        | null      | null    | 2    | Plan Autos Global  | Asesor     | Si              |
And clic a la pantalla de coberturas
And seleccione todas las coberturas del plan:
| limite | deducible | PTH | PPH | GTH | AS                 | PTD | PPD | GT | CRPP | CRPT | PLlaves |
| 3.040  | 0         | 0   | 850 | 40. | Asistencia Global  | 0   | 850 | 40 | 20   |  20  |         |
And expedir la poliza de autos
And ingresar a la opcion plan de trabajo en nueva poliza
And valide la generacion de las reglas que deben ser autorizadas
And valide el usuario que debe aprobar una u otra regla de autorizacion
And ir al usuario a validar asignación de actividad

Examples:
| tipo_documento       | documento  |
| CEDULA DE CIUDADANIA | 9923424349 |


Scenario: Reglas que requieren autorizacion:bonificaciones
iven se tienen los siguientes parametros para la busqueda
|oficina|asesor     |regla                                                                                                                                                                                    | canal     |                                                                                                                                                                                                                                                                                                                                                                     |canal |
|4029   |80301      |importado por terceros,tipo de vehículo (Blindado),vehículos que circulen en esta zona.,transporta combustible no permitido.,                                                            |CC013      |
Given estoy cotizando una poliza:
| cuenta      | producto  | oficina | agente_oficina                                 | tipoPoliza |
| 0225097276  | Autos     | 4029    | BELTRAN*SANABRIA CQLII**PEDRO ANTONIO          | Individual |
And capturar el numero de cotizacion en estado borrador
When ingrese los datos del asegurado <tipo_documento> <documento>
When ingrese los datos del vehiculo:
| placa  | modelo | codigo_fasecolda | ciudad_circulacion   | vehiculo_servicio | chasis | motor     | valor_asegurado | descuento | recargo | zona | plan               | medioVenta |transporte_combustible|vehiculo_blindado|
| random | 2017   | 00601190         | ISTMINA (CHOCO)      | Particular        | addsd  | dsdsdsds  | 94900000        | null      | null    | 11    | Plan Autos Global | Televentas |Si                    |Si               |
And ingrese la bonificacion tecnica <bonoT> y la comercial <bonoC>
And seleccione todas las coberturas de comision:
| limite | deducible | PTH | PPH | GTH | AS                 | PTD | PPD | GT | CRPP | CRPT | PLlaves |
| 1.440  | 0         | 0   | 835 | 40. | Asistencia Global  | 0   | 835 | 40 | 16   | 20   |         |
And llegue a la expedicion de la poliza
And cuando edite la transacion de la poliza
And vaya a vehiculos en expedicion
And seleccione la opcion importado por terceros
And cotice una poliza
And voy a expedir una poliza
And ingese al plan del trabajo
And de click en el boton aceptar
And ingrese a la opcion requisitos a diligenciar todos los requisitos
And vuelva a la cotizacion de poliza
And voy a expedir una poliza
And de click en el boton aceptar
And ingrese a la opcion plan de trabajo
And valide la generacion de las reglas que deben ser autorizadas
And valide el usuario que debe aprobar una u otra regla de autorizacion
And ir al usuario a validar asignación de actividad
Examples:
| accesorios | tipo_documento       | documento  |bonoT|bonoC|
| 2600000    | CEDULA DE CIUDADANIA | 1000283562 |40   |20   |


Scenario: Reglas que requieren autorizacion:importado por terceros, transporta combustible no permitido., vehículos que circulen en esta zona.
Given se tienen los siguientes parametros para la busqueda
|oficina|asesor     |regla                                                                                                                                         | canal     |                                                                                                                                                                                                                                                                                                                                                                     |canal |
|4029   |80301      |importado por terceros,vehículos que circulen en esta zona.,transporta combustible no permitido.,                 |CC013      |
Given estoy cotizando una poliza:
| cuenta      | producto  | oficina | agente_oficina                                 | tipoPoliza |
| 0225097276  | Autos     | 4029    | PINTORES S.A. CQLII II                         | Individual |
And capturar el numero de cotizacion en estado borrador
When ingrese los datos del asegurado <tipo_documento> <documento>
When ingrese los datos del vehiculo:
| placa  | modelo | codigo_fasecolda | ciudad_circulacion   | vehiculo_servicio | chasis | motor     | valor_asegurado | descuento | recargo | zona | plan               | medioVenta |transporte_combustible|vehiculo_blindado|
| random | 2017   | 00601190         | ISTMINA (CHOCO)      | Particular        | addsd  | dsdsdsds  | 94900000        | null      | null    | 11    | Plan Autos Global | Televentas |Si                    | Si                |
When ingrese las coberturas:
| limite | deducible | AS               |abogado|
| 640.   | 0         | Asistencia Global|       |
And llegue a la expedicion de la poliza
And cuando edite la transacion de la poliza
And vaya a vehiculos en expedicion
And seleccione la opcion importado por terceros
And cotice una poliza
And voy a expedir una poliza
And ingese al plan del trabajo
And de click en el boton aceptar
And ingrese a la opcion requisitos a diligenciar todos los requisitos
And vuelva a la cotizacion de poliza
And voy a expedir una poliza
And de click en el boton aceptar
And ingrese a la opcion plan de trabajo
And valide la generacion de las reglas que deben ser autorizadas
And valide el usuario que debe aprobar una u otra regla de autorizacion
And ir al usuario a validar asignación de actividad
Examples:
| accesorios | tipo_documento       | documento  |
| 2600000    | CEDULA DE CIUDADANIA | 1000283562 |

Scenario: Reglas que requieren autorizacion:Placa extrangera,uso vehiculo,modelo vehiculo, valor minimo no tiene
Given se tienen los siguientes parametros para la busqueda
|oficina|asesor     |regla                                                                             | canal     |                                                                                                                                                                                                                                                                                                                                                                     |canal |
|4029   |10154      |Placa extranjera,inferior al tope mínimo,modelo es superior al máximo permitido   |CC013      |
Given estoy cotizando una poliza:
| cuenta      | producto  | oficina | agente_oficina                                 | tipoPoliza |
| 0225097276  | Autos     | 4029    | BELTRAN*SANABRIA CQLII**PEDRO ANTONIO          | Individual |
And capturar el numero de cotizacion en estado borrador
When ingrese los datos del asegurado <tipo_documento> <documento>
When ingrese los datos del vehiculo:
| placa   | modelo | codigo_fasecolda | ciudad_circulacion               | vehiculo_servicio | chasis | motor     | valor_asegurado | descuento | recargo | zona | plan               | medioVenta |transporte_combustible|vehiculo_blindado|
| AA111AA | 1985   | 01601012         | CUCUTA (NORTE DE SANTANDER)      | Particular        | addsd  | dsdsdsds  | 1400000         | null      | null    | 9    | Plan Autos Global  | Televentas |                      |                 |
When ingrese las coberturas:
| limite | deducible | AS               |abogado|
| 640.   | 0         | Asistencia Global|       |
And llegue a la expedicion de la poliza
And cuando edite la transacion de la poliza
And vaya a vehiculos en expedicion
And seleccione el tipo de uso del vehiculo <usoVehiculo>
And cotice una poliza
And voy a expedir una poliza
And de click en el boton aceptar
And voy a expedir una poliza
And de click en el boton aceptar
And ingrese a la opcion plan de trabajo
And valide la generacion de las reglas que deben ser autorizadas
And valide el usuario que debe aprobar una u otra regla de autorizacion
And ir al usuario a validar asignación de actividad

Examples:
| tipo_documento       | documento  |tipoPlazo|fechaInicioVigencia|usoVehiculo|
| CEDULA DE CIUDADANIA | 1000033793 |Anual    |10/07/2017         |Familiar   |

Scenario: Reglas que requieren autorizacion:Peps, riesgo consultable
Given carga de aplicacion de Policy: http://labcoreseguros.suramericana.com/pc/PolicyCenter.do
When logueo en PolicyCenter Lab: Colombia, suragwsu y suragwsu se debe mostrar: Mis actividades
Given se tienen los siguientes parametros para la busqueda
|oficina|asesor     |regla                                                              | canal     |                                                                                                                                                                                                                                                                                                                                                                     |canal |
|2841   |10012      |El tomador es un riesgo no estándar,El tomador es un riesgo PEPS   |CC013      |
Given estoy cotizando una poliza:
| cuenta      | producto  | oficina | agente_oficina                                 | tipoPoliza |
| 0798516335  | Autos     | 4029    | MEJIA*PARRA CQLII**JOSE ALEXANDER              | Individual |
And capturar el numero de cotizacion en estado borrador
When ingrese los datos del asegurado <tipo_documento> <documento>
When ingrese los datos del vehiculo:
| placa   | modelo | codigo_fasecolda | ciudad_circulacion               | vehiculo_servicio | chasis | motor     | valor_asegurado | descuento | recargo | zona | plan               | medioVenta |transporte_combustible|vehiculo_blindado|
| random  | 2018   | 08008011         | MEDELLIN (ANTIOQUIA)             | Particular        | addsd  | dsdsdsds  | 57500000         | null      | null    | 2    | Plan Autos Global  | Televentas |                      |                 |
When ingrese las coberturas:
| limite | deducible | AS               |abogado|
| 640.   | 0         | Asistencia Global|       |
And intente cotizar
And ingrese a la opcion plan de trabajo
And valide la generacion de las reglas que deben ser autorizadas
And valide el usuario que debe aprobar una u otra regla de autorizacion
And ir al usuario a validar asignación de actividad

Examples:
| tipo_documento       | documento  |tipoPlazo|fechaInicioVigencia|usoVehiculo|tipo_documento       |
| CEDULA DE CIUDADANIA | 16608727   |Anual    |10/07/2017         |Familiar   |CEDULA DE CIUDADANIA |

