Meta:
@lote2
@tag equipo: 5, sprint: 14

Narrative:
Como usuario de negocio
Quiero que al selecionar un plan basico no se soliciten responsibilades diferentes a las civiles
Para que no se requieran validaciones de inspeccion


Scenario: validar inspeccion en poliza nueva
GivenStories: stories/policycenter/login_policy.story
Given voy a cotizar una poliza de autos con la cuenta, oficina, agente, producto, asegurado con tipo de documento y documento
| tipoDocumento        | documento  | cuenta     | producto | agente_oficina | oficina |
| CEDULA DE CIUDADANIA | 1234567890 | C000888888 | Autos    | DIRECTO        | 1073    |
When ingrese los datos del vehiculo:
| placa  | modelo | codigo_fasecolda | ciudad_circulacion   | vehiculo_servicio | chasis | motor | valor_asegurado | descuento | recargo | zona | plan              | medioVenta |
| LKJ998 | 2016   | 00601182         | MEDELLIN (ANTIOQUIA) | Particular        | null   | null  | 165900000       | null      | null    | 2    | Plan Autos Básico | Televentas |
And ingrese las coberturas a vehiculo:
| limite | deducible | AS |
| 640.0  | 0         | Asistencia Básica   |
Then cotice y expida la poliza

Examples:
|  |
|  |


Scenario: validar requisitos mensaje bloqueante accesorios
Given estoy cotizando una poliza de mrc con documento:
| organizacion | producto | canal             | tipoPoliza | tipo_documento       | documento  | fecha_nacimiento | primer_nombre | primer_apellido | tipo_direccion          | direccion        | departamento | ciudad   | agente |
| Sura         | Autos    | Canal Tradicional | Individual | CEDULA DE CIUDADANIA | 1090658723 | 10/10/1973       | LUCIANA       | LONDOÑO         | DIRECCION DE RESIDENCIA | CALLE 65F #60-69 | Antioquia    | Medellin | INT-3  |
And ingrese los datos del asegurado <tipo_documento> <documento>
And ingrese los datos del vehiculo:
| placa  | modelo | codigo_fasecolda | ciudad_circulacion   | vehiculo_servicio | chasis | motor | valor_asegurado | descuento | recargo | zona | plan               | medioVenta |
| random | 2011   |                  | MEDELLIN (ANTIOQUIA) | Particular        | null   | null  | 17900000        | null      | null    | 2    | Plan Autos Clásico | Televentas |
When ingrese las coberturas a vehiculo:
| limite | deducible | AS                 |
| 640.0  | 0         | Asistencia Clásica |
And cotice una poliza
And voy a expedir una poliza
And confirmo el mensaje de expedir poliza
Then debo ver un mensaje bloqueante
| mensaje                                                                                                             |
| Existen requisitos opcionales pendientes por adjuntar, por favor diríjase a la pestaña Requisitos para tramitarlos. |

Examples:
| tipo_documento       | documento  |
| CEDULA DE CIUDADANIA | 1090658723 |