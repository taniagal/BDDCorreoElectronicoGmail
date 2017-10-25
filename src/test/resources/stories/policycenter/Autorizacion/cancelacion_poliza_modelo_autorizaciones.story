Meta:

Narrative:
Al hacer una cancelación de poliza con fecha retroactiva que supere 30 días, el sistema debe generar automáticamente un mensaje indicando que se requiere una autorización.
Se debe aprobar ó rechazar la autorizacion con el perfil correspondiente y luego expedir la poliza.

Scenario: Generar una cancelacion de poliza donde se levante autorizacion por retroactividad
Given carga de aplicacion de Policy: http://labcoreseguros.suramericana.com/pc/PolicyCenter.do
When logueo en PolicyCenter Lab: Colombia, suragwsu y suragwsu se debe mostrar: Mis actividades
And se tienen los siguientes parametros para la busqueda
|oficina|asesor     |regla                                          |canal     |                                                                                                                                                                                                                                                                                                                                                                     |canal |
|4029   |10154      |retroactividad                                 |CC013     |
And voy a cotizar poliza de autos individual:
| cuenta     | producto | oficina | agente_oficina                     | tipoPoliza |
| 0225097276 | Autos    | 4029    | LAS LLAVES DEL CORAZON LTDA. CQLII | Individual |
And ingrese la Fecha Inicio Vigencia: -32
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
And aprobar la cancelacion de la poliza
|motivo                  |descripcion                  |Fecha|
|Por petición del cliente|Prueba cancelacion con Policy| -32 |
And ingrese a la opcion plan de trabajo para cancelacion
And valide la generacion de las reglas que deben ser autorizadas
And valide el usuario que debe aprobar una u otra regla de autorizacion
And ir al usuario a validar asignación de actividad


Examples:
| tipo_documento       | documento  |
| CEDULA DE CIUDADANIA | 1000283562 |

Scenario: Cancelación posterior al último pago del cliente
And se tienen los siguientes parametros para la busqueda
|oficina|asesor     |regla                                                                              | canal     |                                                                                                                                                                                                                                                                                                                                                                     |canal |
|4029   |10154      | cancelación ingresada es superior a la fecha sugerida por servicios financieros  | CC013     |
When voy a cotizar poliza de autos individual:
| cuenta     | producto | oficina | agente_oficina                     | tipoPoliza |
| 2582024763 | Autos    | 4029    | LAS LLAVES DEL CORAZON LTDA. CQLII | Individual |
And ingrese la Fecha Inicio Vigencia: -59
And ingrese datos del asegurado de policy <tipo_documento> <documento>
And ingrese los datos del vehiculo que va asegurar:
| placa  | modelo | codigo_fasecolda | ciudad_circulacion | vehiculo_servicio | chasis    | motor     | valor_asegurado | descuento | recargo | zona | plan               | medioVenta | cero_kilometros |
| random | 2018   | 08008011         | MEDELLIN           | Particular        | asdfghjkl | asdfghjkl | 57500000        | null      | null    | 2    | Plan Autos Global  | Asesor     | Si              |
And clic a la pantalla de coberturas
And seleccione todas las coberturas del plan:
| limite | deducible | PTH | PPH | GTH | AS                 | PTD | PPD | GT | CRPP | CRPT | PLlaves |
| 3.040  | 0         | 0   | 850 | 40. | Asistencia Global  | 0   | 850 | 40 | 20   |  20  |         |
And expedir poliza y capturar el numero
And voy al resumen de la poliza
And aprobar la cancelacion de la poliza
|motivo                  |descripcion                  |Fecha|
|Por petición del cliente|Prueba cancelacion con Policy| 0   |
And ingrese a la opcion plan de trabajo
And valide la generacion de las reglas que deben ser autorizadas
And valide el usuario que debe aprobar una u otra regla de autorizacion
And ir al usuario a validar asignación de actividad

Examples:
| tipo_documento       | documento  |
| CEDULA DE CIUDADANIA | 1000283562 |