Meta:
@lote3
@issue #CDSEG-4756
@tag equipo: 5, sprint: 12

Narrative:
Como usuario de policy center
Se requiere poder corregir la placa, en el caso de que la poliza fuera expedida con una placa incorrecta  o temporal.

Scenario: Primer cambio de placa
GivenStories: stories/policycenter/login_policy.story
Given tengo una poliza de PA con los siguientes datos:
| tipo_documento       | documento  | cuenta     | producto | tipoPoliza | placa  | modelo | codigo_fasecolda | ciudad_circulacion   | vehiculo_servicio | chasis  | motor | valor_asegurado | descuento | recargo | zona | plan               | limite | deducible | AS                 | abogado | medioVenta |
| CEDULA DE CIUDADANIA | 1234567890 | C000888888 | Autos    | Individual | XYZ756 | 2011   |                  | MEDELLIN (ANTIOQUIA) | Particular        | kljh456 | yui10 | 17900000        | null      | null    | 2    | Plan Autos Clásico | 640.   | 0         | Asistencia Clásica |         | Televentas |
When ingrese a modificar la placa en la poliza expedida
And se ingrese a la opcion vehiculos
And cuando cambie la placa <placa>
And se deben recargar los datos de la placa anterior:
| modelo | codigoFasecolda | ciudadCirculacion    | tipoServicio | chasis  | motor | valorAsegurado | claseVehiculo | marca     | zona |
| 2011   | 01601225        | MEDELLIN (ANTIOQUIA) | Particular   | KLJH456 | YUI10 | 17900000       | Automóviles   | CHEVROLET | 2    |
And coloque una placa existente <placaExistente>
And debe salir un mensaje de advertencia
| mensaje                                                                         |
| La placa BLE860 está asegurada en la póliza TEST_22222222, por favor verifique. |
And cuando ingrese una placa venezolana <placaVenezolana>
And intente cotizar el cambio de poliza
And expida el cambio de la poliza
And debe mostrar un mensaje solicitando autorizacion
| mensajeAutorizacion                      |
| Zona no permitida para placa extranjera. |
And cuando edite la transacion de la poliza
And vaya a vehiculos a ingresar una placa riesgo consultable <placaRiesgoConsultable>
And intente cotizar el cambio de poliza
And debe mostrar un mensaje de autorizacion
| mensajePlacaRiesgoConsultable                                                                                                                              |
| RANDOT, La placa es un riesgo no estándar y no es posible gestionar la solicitud por este canal. Diríjase a análisis de riesgos para solicitar aprobación. |


Examples:
| placa   | placaInicial | placaVenezolana | ciudad                      | placaExistente | placaRiesgoConsultable | venezolana |
| rando21 | XYZ709       | AA111AA         | CUCUTA (NORTE DE SANTANDER) | BLE860         | RANDOT                 | AA111AA    |

