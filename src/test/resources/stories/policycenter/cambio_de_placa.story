Cambio De Placa

Meta:
@lote2
@issue #CDSEG-4756
@tag equipo: 5
@Sprint 12

Narrative:
Como usuario de policy center
Se requiere poder corregir la placa, en el caso de que la poliza fuera expedida con una placa incorrecta  o temporal.

Scenario: Primer cambio de placa
GivenStories: stories/policycenter/login_policy.story
Given tengo una poliza de PA con los siguientes datos:
|tipo_documento      |documento |cuenta    |producto|tipoPoliza|placa |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis |motor|valor_asegurado|descuento|recargo|zona|plan        |limite|deducible|abogado|PLlaves|
|CEDULA DE CIUDADANIA|1234567890|C000888888|Autos   |Individual|ABB195|2011  |01601225        |MEDELLIN          |Particular       |kljh456|yui10|17900000       |null     |null   |2   |Plan Modular|640.  |0        |Si     |Si     |
When ingrese a modificar dicha cotizacion
And se ingrese a la opcion vehiculos
And cuando cambie la placa <placa>
And se deben recargar los datos de la placa anterior:
| modelo | codigoFasecolda | ciudadCirculacion | tipoServicio | chasis  | motor | valorAsegurado | claseVehiculo | marca | zona |
| 2011   | 01601225        | MEDELLIN          | Particular   | kljh456 | yui10 | 17900000       | Automóviles   | AUDI  | 2    |
And quiera volver a cambiar la placa
And se debe cargar la placa inicial <placaInicial>
And vuelva a cambiar la placa
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
And vaya a vehiculos a ingresar una placa venezolana <venezolana> con circulacion en cucuta <ciudad>
And intente cotizar el cambio de poliza
And expida el cambio de la poliza
Then debe mostrar un mensaje de autorizacion para expedir
| mensajeDeAutorizacion                 |
| Placa extranjera debe ser autorizada. |


Examples:
|placa  |placaInicial |placaVenezolana|ciudad|placaExistente|placaRiesgoConsultable|venezolana|                                                                     |
|rando21|ABB195       |AA111AA        |CUCUTA|BLE860        |RANDOT                |AA111AA   |

