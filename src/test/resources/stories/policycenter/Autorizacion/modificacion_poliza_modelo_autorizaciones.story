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

