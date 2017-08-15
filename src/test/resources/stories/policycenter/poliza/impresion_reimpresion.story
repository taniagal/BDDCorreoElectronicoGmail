Meta:
@lote5
@tag equipo: 5, sprint: 14

Narrative:
Como usuario de policy center en el rol de agente,csr, asegurador o gerente
Quiero poder imprimir o reimprimir los documentos que se generan luego de ejecutar una transaccion de poliza
Para una poliza de autos

Scenario: Mostrar opcion de reimpresion en una submission
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza de mrc con documento:
| organizacion | producto | canal             | tipoPoliza | tipo_documento       | documento  | fecha_nacimiento | primer_nombre | primer_apellido | tipo_direccion          | direccion        | departamento | ciudad   | agente |
| Sura         | Autos    | Canal Tradicional | Individual | CEDULA DE CIUDADANIA | 1066777571 | 10/10/1973       | LUCIANA       | LONDOÑO         | DIRECCION DE RESIDENCIA | CALLE 65F #60-69 | Antioquia    | Medellin | INT-3  |
And ingrese los datos del asegurado <tipo_documento> <documento>
And ingrese los datos del vehiculo:
| placa  | modelo | codigo_fasecolda | ciudad_circulacion   | vehiculo_servicio | chasis | motor | valor_asegurado | descuento | recargo | zona | plan               | medioVenta |
| AHP545 | 2011   |                  | MEDELLIN (ANTIOQUIA) | Particular        | null   | null  | 17900000        | null      | null    | 2    | Plan Autos Clásico | Televentas |
When ingrese las coberturas a vehiculo:
| limite | deducible | AS                 |
| 640.0  | 0         | Asistencia Clásica |
And cotice una poliza
And valido que la opcion de reimpresion no esta disponible
And expido la poliza y voy al archivo de poliza
And vaya a la opcion transacciones de poliza
And cuando de click al boton reimprimir
And me deben aparecer las opciones por las cuales puedo imprimir
| opciones                         |
| Carátula                         |
| Carta de relación con el cliente |
| Cotización                       |
And cuando vaya a la opcion documentos
Then se deben seleccionar todas las opciones por las cuales quiero reimprimir
Examples:
| tipo_documento       | documento  |
| CEDULA DE CIUDADANIA | 1060447895 |

Scenario: Mostrar opcion reimpresion en cambio de poliza
Given tengo una poliza de PA con los siguientes datos:
| tipo_documento       | documento  | cuenta     | producto | tipoPoliza | placa  | modelo | codigo_fasecolda | ciudad_circulacion   | vehiculo_servicio | chasis | motor | valor_asegurado | descuento | recargo | zona | plan               | limite | deducible |abogado| AS                                    | medioVenta  |
| CEDULA DE CIUDADANIA | 1234567890 | C000888888 | Autos    | Individual | AOY126 | 2011   |                  | MEDELLIN (ANTIOQUIA) | Particular        | null   | null  | 17900000        | null      | null    | 2    | Plan Autos Clásico | 640.   | 0         |       |Asistencia Clásica                     | Televentas  |
When ingrese a modificar dicha cotizacion
And se ingrese a la opcion vehiculos
And cambie el plan del vehiculo <plan>
And digite el numero fasecolda <numeroFasecolda> y modelo <modelo> de un vehiculo
And agrega cobertura asistencia <asistencia>
And intente cotizar el cambio de poliza
And valido que la opcion de reimpresion no esta disponible
And expido la poliza y voy al archivo de poliza
And vaya a la opcion transacciones de poliza
And cuando de click al boton reimprimir
And me deben aparecer las opciones por las cuales puedo imprimir
| opciones   |
| Carátula   |
| Cotización |
And cuando vaya a la opcion documentos
Then se deben seleccionar todas las opciones por las cuales quiero reimprimir
Examples:
| plan              | asistencia        | numeroFasecolda | modelo |
| Plan Autos Básico | Asistencia Básica | 52525252        | 2016   |