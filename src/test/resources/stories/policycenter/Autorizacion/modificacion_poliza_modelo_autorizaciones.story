Meta:

Narrative:
Como miembro de suramericana de seguros en alguno de los roles que permite generar cotizaciones de poliza
Quiero poder autorizar ciertas reglas de validación asignadas a mi usuario
Para poder expedir polizas de forma exitosa

Scenario: Generar una modificacion de poliza donde se levante autorizacion por retroactividad de 30 dias hacia atras
Given carga de aplicacion de Policy: http://labcoreseguros.suramericana.com/pc/PolicyCenter.do
When logueo en PolicyCenter Lab: Colombia, suragwsu y suragwsu se debe mostrar: Mis actividades
And voy a cotizar poliza de autos individual:
| cuenta     | producto | oficina | agente_oficina                     | tipoPoliza |
| 0225097276 | Autos    | 4029    | LAS LLAVES DEL CORAZON LTDA. CQLII | Individual |
And ingrese datos del asegurado de policy <tipo_documento> <documento>
And ingrese los datos del vehiculo que va asegurar:
| placa  | modelo | codigo_fasecolda | ciudad_circulacion | vehiculo_servicio | chasis    | motor     | valor_asegurado | descuento | recargo | zona | plan               | medioVenta | cero_kilometros |
| random | 2018   | 08008011         | MEDELLIN           | Particular        | asdfghjkl | asdfghjkl | 57500000        | null      | null    | 2    | Plan Autos Global  | Asesor     | Si              |
And clic a la pantalla de coberturas
And seleccione todas las coberturas del plan:
| limite | deducible | PTH | PPH | GTH | AS                 | PTD | PPD | GT | CRPP | CRPT | PLlaves |
| 3.040  | 0         | 0   | 850 | 40. | Asistencia Global  | 0   | 850 | 40 | 20   |  20  |         |
And expedir la poliza de autos
And ingrese al resumen de la poliza expedida
And quiero relizar el cambio de una poliza
And cambio la fecha de vigencia sumando los dias a la fecha actual: -32
And capturar el numero de cotizacion en estado borrador en la modificacion
And cotice y expida la poliza
And ingrese a la opcion plan de trabajo

Examples:
| tipo_documento       | documento  |
| CEDULA DE CIUDADANIA | 9923424349 |

Scenario: 2Reglas que requieren autorizacion: peps, riesgo consultable
Given carga de aplicacion de Policy: http://labcoreseguros.suramericana.com/pc/PolicyCenter.do
When logueo en PolicyCenter Lab: Colombia, suragwsu y suragwsu se debe mostrar: Mis actividades
Given se tienen los siguientes parametros para la busqueda
|oficina|asesor     |regla                                                                  |canal |                                                                                                                                                                                                                                                                                                                                                                     |canal |
|2841   |10012      |El tomador es un riesgo no estándar,El tomador es un riesgo PEPS       |CC013 |
Given estoy cotizando una poliza:
| cuenta      | producto  | oficina | agente_oficina                                 | tipoPoliza |
| 0225097276  | Autos     | 4029    | MEJIA*PARRA CQLII**JOSE ALEXANDER              | Individual |
When ingrese los datos del asegurado <tipo_documento> <documento>
When ingrese los datos del vehiculo:
| placa   | modelo | codigo_fasecolda | ciudad_circulacion      | vehiculo_servicio | chasis   | motor     | valor_asegurado | descuento | recargo | zona | plan               | medioVenta |transporte_combustible|vehiculo_blindado|
| random  | 2018   | 08008011         | MEDELLIN (ANTIOQUIA)    | Particular        | addsdas  | dsdsdsds  | 57500000        | null      | null    | 2    | Plan Autos Global  | Televentas |                      |                 |
When ingrese las coberturas:
| limite | deducible | AS               |abogado|
| 640.   | 0         | Asistencia Global|       |
And expedir la poliza de autos
And ingrese al resumen de la poliza expedida
And quiero relizar el cambio de una poliza
And se presione el boton siguiente en modificacion de poliza
And capturar el numero de cotizacion en estado borrador en la modificacion
And quiera cambiar el tomador principal por uno existente que es pep con <numeroDocumento> y <tipoDocumento>
And intente cotizar el cambio de poliza
And intente cotizar el cambio de poliza
And ingrese a la opcion plan de trabajo
And valide la generacion de las reglas que deben ser autorizadas
And valide el usuario que debe aprobar una u otra regla de autorizacion
And ir al usuario a validar asignación de actividad

Examples:
| tipo_documento       | documento    |numeroDocumento|tipoDocumento       |
| CEDULA DE CIUDADANIA | 1000283562   |16608727       |CEDULA DE CIUDADANIA|

Scenario: 3reglas de validacion para modificacion de poliza: accesorios especiales, accesorios, valor maximo vehiculo, transporte combustible
Given carga de aplicacion de Policy: http://labcoreseguros.suramericana.com/pc/PolicyCenter.do
When logueo en PolicyCenter Lab: Colombia, suragwsu y suragwsu se debe mostrar: Mis actividades
Given se tienen los siguientes parametros para la busqueda
|oficina|asesor     |regla                                                                             |canal      |
|4029   |10154      |inferior al tope mínimo,modelo es superior al máximo permitido,bonificacion       |CC013      |
Given estoy cotizando una poliza:
| cuenta      | producto  | oficina | agente_oficina                                    | tipoPoliza |
| 0225097276  | Autos     | 4029    | BELTRAN*SANABRIA CQLII**PEDRO ANTONIO             | Individual |
When ingrese los datos del asegurado <tipo_documento> <documento>
When ingrese los datos del vehiculo:
| placa   | modelo | codigo_fasecolda | ciudad_circulacion         | vehiculo_servicio | chasis | motor     | valor_asegurado | descuento | recargo | zona | plan               | medioVenta |transporte_combustible|vehiculo_blindado|
| random  | 2018   | 08008011         | MEDELLIN (ANTIOQUIA)       | Particular        | addsd  | dsdsdsds  | 57500000        | null      | null    | 2    | Plan Autos Global  | Televentas |                      |                 |
When ingrese las coberturas:
| limite | deducible | AS               |abogado|
| 640.   | 0         | Asistencia Global|       |
And expedir la poliza de autos
And ingrese al resumen de la poliza expedida
And quiero relizar el cambio de una poliza
And se presione el boton siguiente en modificacion de poliza
And se ingrese a la opcion vehiculos
And capturar el numero de cotizacion en estado borrador en la modificacion
And seleccione la opcion importado por terceros
And realice los siguientes cambios para el vehiculo:
|valorAsegurado|valorAccesorios|valorAccesoriosEspeciales|transporteCombustible|
|401000000     |200000000      |402000000                |Si                   |
And intente cotizar el cambio de poliza
And voy a expedir el cambio de una poliza
And de click en el boton aceptar
And espere a que salgan las validaciones de reglas correspondientes
And ingese al plan del trabajo
And valide la generacion de las reglas que deben ser autorizadas
And valide el usuario que debe aprobar una u otra regla de autorizacion
And ir al usuario a validar asignación de actividad
Scenario: 3reglas de validacion para modificacion de poliza: accesorios especiales, accesorios, valor maximo vehiculo, transporte combustible
Given carga de aplicacion de Policy: http://labcoreseguros.suramericana.com/pc/PolicyCenter.do
When logueo en PolicyCenter Lab: Colombia, suragwsu y suragwsu se debe mostrar: Mis actividades
Given se tienen los siguientes parametros para la busqueda
|oficina|asesor     |regla                                                                             |canal      |
|4029   |10154      |inferior al tope mínimo,modelo es superior al máximo permitido,bonificacion       |CC013      |
Given estoy cotizando una poliza:
| cuenta      | producto  | oficina | agente_oficina                                    | tipoPoliza |
| 0225097276  | Autos     | 4029    | BELTRAN*SANABRIA CQLII**PEDRO ANTONIO             | Individual |
When ingrese los datos del asegurado <tipo_documento> <documento>
When ingrese los datos del vehiculo:
| placa   | modelo | codigo_fasecolda | ciudad_circulacion         | vehiculo_servicio | chasis | motor     | valor_asegurado | descuento | recargo | zona | plan               | medioVenta |transporte_combustible|vehiculo_blindado|
| random  | 2018   | 08008011         | MEDELLIN (ANTIOQUIA)       | Particular        | addsd  | dsdsdsds  | 57500000        | null      | null    | 2    | Plan Autos Global  | Televentas |                      |                 |
When ingrese las coberturas:
| limite | deducible | AS               |abogado|
| 640.   | 0         | Asistencia Global|       |
And expedir la poliza de autos
And ingrese al resumen de la poliza expedida
And quiero relizar el cambio de una poliza
And se presione el boton siguiente en modificacion de poliza
And se ingrese a la opcion vehiculos
And capturar el numero de cotizacion en estado borrador en la modificacion
And seleccione la opcion importado por terceros
And realice los siguientes cambios para el vehiculo:
|valorAsegurado|valorAccesorios|valorAccesoriosEspeciales|transporteCombustible|
|401000000     |200000000      |402000000                |Si                   |
And intente cotizar el cambio de poliza
And voy a expedir el cambio de una poliza
And de click en el boton aceptar
And espere a que salgan las validaciones de reglas correspondientes
And ingese al plan del trabajo
And valide la generacion de las reglas que deben ser autorizadas
And valide el usuario que debe aprobar una u otra regla de autorizacion
And ir al usuario a validar asignación de actividad

Examples:
| tipo_documento       | documento  |
| CEDULA DE CIUDADANIA | 1000283562 |

Scenario: 1Reglas que requieren autorizacion:modelo vehiculo, valor minimo, bonificacion
Given carga de aplicacion de Policy: http://labcoreseguros.suramericana.com/pc/PolicyCenter.do
When logueo en PolicyCenter Lab: Colombia, suragwsu y suragwsu se debe mostrar: Mis actividades
Given se tienen los siguientes parametros para la busqueda
|oficina|asesor     |regla                                                                             |canal      |                                                                                                                                                                                                                                                                                                                                                                     |canal |
|4029   |10154      |inferior al tope mínimo,modelo es superior al máximo permitido,bonificacion       |CC013      |
Given estoy cotizando una poliza:
| cuenta      | producto  | oficina | agente_oficina                                     | tipoPoliza |
| 0225097276  | Autos     | 4029    | BELTRAN*SANABRIA CQLII**PEDRO ANTONIO              | Individual |
When ingrese los datos del asegurado <tipo_documento> <documento>
When ingrese los datos del vehiculo:
| placa   | modelo | codigo_fasecolda | ciudad_circulacion    | vehiculo_servicio | chasis | motor     | valor_asegurado | descuento | recargo | zona | plan               | medioVenta |transporte_combustible|vehiculo_blindado|
| random  | 2018   | 08008011         | MEDELLIN (ANTIOQUIA)  | Particular        | addsd  | dsdsdsds  | 57500000        | null      | null    | 2    | Plan Autos Global  | Televentas |                      |                 |
When ingrese las coberturas:
| limite | deducible | AS               |abogado|
| 640.   | 0         | Asistencia Global|       |
And expedir la poliza de autos
And ingrese al resumen de la poliza expedida
And quiero relizar el cambio de una poliza
And se presione el boton siguiente en modificacion de poliza
And se ingrese a la opcion vehiculos
And realice los siguientes cambios en el vehiculo:
|modelo|fasecolda|bonificacionComercial|
|1985  |01601012 |40                   |
And capturar el numero de cotizacion en estado borrador en la modificacion
And intente cotizar el cambio de poliza
And voy a expedir el cambio de una poliza
And de click en el boton aceptar
And espere a que salgan las validaciones de reglas correspondientes
And ingrese a la opcion plan de trabajo
And valide la generacion de las reglas que deben ser autorizadas
And ingrese a la opcion plan de trabajo
And valide el usuario que debe aprobar una u otra regla de autorizacion
And ir al usuario a validar asignación de actividad

Examples:
| tipo_documento       | documento  |
| CEDULA DE CIUDADANIA | 1000033793 |


Scenario: Reglas de validacion: Modificacion de poliza no financiada a financiada
Given se tienen los siguientes parametros para la busqueda
|oficina|asesor     |regla                                                                              |canal   |                                                                                                                                                                                                                                                                                                                                                                     |canal |
|4029   |10154      |inferior al tope mínimo,modelo es superior al máximo permitido,bonificacion        |CC013   |
Given tengo una poliza de PA con los siguientes datos:
| tipo_documento       | documento  | cuenta     | producto | tipoPoliza | placa  | modelo | codigo_fasecolda | ciudad_circulacion   | vehiculo_servicio | chasis     | motor       | valor_asegurado | descuento | recargo | zona | plan               | limite | deducible | abogado | AS                 | medioVenta |
| CEDULA DE CIUDADANIA | 9923424349 | 0798516335 | Autos    | Individual | random | 2018   | 08008011         | MEDELLIN (ANTIOQUIA) | Particular        | jhajhaaj   | kajakajkaj  | 57500000        | null      | null    | 2    | Plan Autos Clásico | 320.   | 0         |         | Asistencia Clásica | Televentas |
When ingrese a modificar dicha cotizacion
And seleccione la opcion financiar poliza
And deben aparecer el numero de cuotas por las cuales puedo financiar la poliza
| opcionesCuotas |
| 11             |
| 12             |
And ingrese el numero de cuotas <numeroCuotas> a financiar
And capturar el numero de cotizacion en estado borrador en la modificacion
And cotice una poliza
And expida el cambio de la poliza
And expida el cambio de la poliza
Examples:
| numeroCuotas |
| 11           |

Scenario: Reglas de validacion: Modificacion de poliza financiada a no financiada
Given se tienen los siguientes parametros para la busqueda
|oficina|asesor     |regla                                                                            |canal |                                                                                                                                                                                                                                                                                                                                                                     |canal |
|4029   |10154      |inferior al tope mínimo,modelo es superior al máximo permitido,bonificacion      |CC013 |
Given estoy cotizando una poliza:
| cuenta      | producto  | oficina | agente_oficina                                 | tipoPoliza |
| 0225097276  | Autos     | 4029    | MEJIA*PARRA CQLII**JOSE ALEXANDER              | Individual |
When indique que deseo financiar la poliza
And indique el numero de cuotas
And seleccione la opcion siguiente
And se muestre el mensaje <mensaje> de advertencia de financiacion
When ingrese los datos del asegurado <tipo_documento> <documento>
When ingrese los datos del vehiculo:
| placa   | modelo | codigo_fasecolda | ciudad_circulacion       | vehiculo_servicio | chasis | motor     | valor_asegurado | descuento | recargo | zona | plan               | medioVenta |transporte_combustible|vehiculo_blindado|
| random  | 2018   | 08008011         | MEDELLIN (ANTIOQUIA)     | Particular        | addsd  | dsdsdsds  | 57500000        | null      | null    | 2    | Plan Autos Global  | Televentas |                      |                 |
When ingrese las coberturas:
| limite | deducible | AS               |abogado|
| 640.   | 0         | Asistencia Global|       |
And intente cotizar
And expedir la poliza de autos
And ingrese al resumen de la poliza expedida
And quiero relizar el cambio de una poliza

Examples:
| tipo_documento       | documento  |mensaje                                                                                   |
| CEDULA DE CIUDADANIA | 9923424349 |La financiación de la póliza está sujeta a aprobación por parte del área de financiación. |



Scenario: Generar una modificacion de poliza donde se levante autorizacion por producción adelantada 30 días hacia adelante
When voy a cotizar poliza de autos individual:
| cuenta     | producto | oficina | agente_oficina                     | tipoPoliza |
| 2582024763 | Autos    | 4029    | LAS LLAVES DEL CORAZON LTDA. CQLII | Individual |
And ingrese datos del asegurado de policy <tipo_documento> <documento>
And ingrese los datos del vehiculo que va asegurar:
| placa  | modelo | codigo_fasecolda | ciudad_circulacion | vehiculo_servicio | chasis    | motor     | valor_asegurado | descuento | recargo | zona | plan               | medioVenta | cero_kilometros |
| random | 2018   | 08008011         | MEDELLIN           | Particular        | asdfghjkl | asdfghjkl | 57500000        | null      | null    | 2    | Plan Autos Global  | Asesor     | Si              |
And clic a la pantalla de coberturas
And seleccione todas las coberturas del plan:
| limite | deducible | PTH | PPH | GTH | AS                 | PTD | PPD | GT | CRPP | CRPT | PLlaves |
| 3.040  | 0         | 0   | 850 | 40. | Asistencia Global  | 0   | 850 | 40 | 20   |  20  |         |
And capturar el numero de cotizacion
And expedir la poliza de autos
And ingrese al resumen de la poliza expedida
And quiero relizar el cambio de una poliza
And cambio la fecha de vigencia sumando los dias a la fecha actual: 32
And capturar el numero de cotizacion en estado borrador en la modificacion
And cotice y expida la poliza
And ingrese a la opcion plan de trabajo

Examples:
| tipo_documento       | documento  |
| CEDULA DE CIUDADANIA | 9923424349 |

