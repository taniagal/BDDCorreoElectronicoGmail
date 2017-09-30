Meta:
@lote8
@tag equipo: 1, sprint: modelo de autorizaciones

Narrative:
Al hacer una modificacion de póliza con fecha retroactiva de 30 días hacia atrás y 30 días hacia adelante. El sistema debe generar automáticamente un mensaje indicando que se requiere una autorización.
Se debe aprobar ó rechazar la autorizacion con el perfil correspondiente y luego expedir la modificacion.

Scenario: Generar una modificacion de poliza donde se levante autorizacion por retroactividad de 30 dias hacia atras
Given carga de aplicacion de Policy: http://labcoreseguros.suramericana.com/pc/PolicyCenter.do
When logueo en PolicyCenter Lab: Colombia, suragwsu y suragwsu se debe mostrar: Mis actividades
And voy a cotizar poliza de autos individual:
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
And cambio la fecha de vigencia sumando los dias a la fecha actual: -32
And cotice y expida la poliza
And ingrese a la opcion plan de trabajo

Examples:
| tipo_documento       | documento  |
| CEDULA DE CIUDADANIA | 9923424349 |

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
And cotice y expida la poliza
And ingrese a la opcion plan de trabajo

Examples:
| tipo_documento       | documento  |
| CEDULA DE CIUDADANIA | 9923424349 |