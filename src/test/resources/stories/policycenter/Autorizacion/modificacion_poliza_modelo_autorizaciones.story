Meta:

Narrative:
Al hacer una modificacion de póliza con fecha retroactiva de 30 días hacia atrás y 30 días hacia adelante. El sistema debe generar automáticamente un mensaje indicando que se requiere una autorización.
Se debe aprobar ó rechazar la autorizacion con el perfil correspondiente y luego expedir la modificacion.

Scenario: Reglas que requieren autorizacion:modelo vehiculo, valor minimo, bonificacion
Given carga de aplicacion de Policy: http://labcoreseguros.suramericana.com/pc/PolicyCenter.do
When logueo en PolicyCenter Lab: Colombia, suragwsu y suragwsu se debe mostrar: Mis actividades
Given se tienen los siguientes parametros para la busqueda
|oficina|asesor     |regla                                                                             |canal      |                                                                                                                                                                                                                                                                                                                                                                     |canal |
|4029   |10154      |inferior al tope mínimo,modelo es superior al máximo permitido,bonificacion       |CC013      |
Given estoy cotizando una poliza:
| cuenta      | producto  | oficina | agente_oficina                                 | tipoPoliza |
| 0225097276  | Autos     | 4029    | MEJIA*PARRA CQLII**JOSE ALEXANDER              | Individual |
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
And voy a expedir una poliza por cambio
And de click en el boton aceptar
And voy a expedir una poliza por cambio
And de click en el boton aceptar
And ingrese a la opcion plan de trabajo
And valide la generacion de las reglas que deben ser autorizadas
And valide el usuario que debe aprobar una u otra regla de autorizacion
And ir al usuario a validar asignación de actividad

Examples:
| tipo_documento       | documento  |
| CEDULA DE CIUDADANIA | 1000033793 |