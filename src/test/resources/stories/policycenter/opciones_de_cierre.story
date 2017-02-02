Meta:
@lote2
@tag equipo: 5
@sprint 13

Narrative:
Como usuario de Policy Center con un rol especifico
Quiero estar habilitado para retirar, declinar o marcar una transaccion de poliza como no tomada,
ademas inlcuir los detalles asociados con la declinacion o no toma por parte del asegurado o agente
Para poder tener seguimiento a traves del administrador de cotizaciones
de las transacciones de poliza que fueron declinadadas o no tomadas

Scenario: Validar informacion al declinar una poliza
GivenStories: stories/policycenter/login_policy.story
Given voy a cotizar una poliza de autos con la cuenta, oficina, agente, producto, asegurado con tipo de documento y documento
| tipoDocumento        | documento | cuenta     | producto |agente_oficina| oficina |
| CEDULA DE CIUDADANIA | 71318883  | C000888888 | Autos    | DIRECTO      | 1105    |
When ingrese los datos del vehiculo:
| placa  | modelo | codigo_fasecolda | ciudad_circulacion | vehiculo_servicio | chasis | motor | valor_asegurado | descuento | recargo | zona | plan         |
| TYU130 | 2016   | 00601182         | MEDELLIN           | Particular        | null   | null  | 165900000       | null      | null    | 2    | Plan Modular |
And ingrese las coberturas basicas:
|limite|deducible|abogado |PLlaves |
|640.  |0        |Si      |Si      |
And intente cotizar
And decline la transaccion
Then deben aparecer todas las razones de declinar poliza
| itemDeclinacion                                 |
| Siniestros                                      |
| Cartera                                         |
| Sin respaldo de reaseguradores o coaseguradores |
| Riesgo no objetivo                              |
| No acuerdo de pago                              |

Examples:
||
||

Scenario: Validar informacion al no tomar una poliza
Given voy a cotizar una poliza de autos con la cuenta, oficina, agente, producto, asegurado con tipo de documento y documento
| tipoDocumento        | documento | cuenta     | producto |agente_oficina| oficina |
| CEDULA DE CIUDADANIA | 71318883  | C000888888 | Autos    | DIRECTO      | 1060    |
When ingrese los datos del vehiculo:
| placa  | modelo | codigo_fasecolda | ciudad_circulacion | vehiculo_servicio | chasis | motor | valor_asegurado | descuento | recargo | zona | plan         |
| TYU131 | 2016   | 00601182         | MEDELLIN           | Particular        | null   | null  | 165900000       | null      | null    | 2    | Plan Modular |
And ingrese las coberturas basicas:
|limite|deducible|abogado|PLlaves|
|640.  |0        |Si     |Si     |
And intente cotizar
And decida no tomar la poliza
Then deben aparecer todas las razones para no tomar la poliza
| itemsNoTomar                           |
| Precio y condiciones no satisfactorias |
| Se aseguró en otra compañía            |
| No acuerdo de pago                     |
| No cumple condiciones de licitación    |
| No acuerdo de pago                     |

Examples:
||
||

Scenario: Visualizar estado de la cotizacion en el administrador
Meta: @manual
Given se cerro una cotizacion con estado Declinada o No Tomada
When se revise la informacion de dicha cotizacion
Then se debe visualizar el estado con el que quedo