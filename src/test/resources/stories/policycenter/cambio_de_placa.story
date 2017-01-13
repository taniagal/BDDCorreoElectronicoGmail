Cambio De Placa

Meta:
@lote2
@issue #CDSEG-4756
@tag automator: tania_grajales_alzate
@Sprint 12

Narrative:
Como usuario de policy center
Se requiere poder corregir la placa, en el caso de que la poliza fuera expedida con una placa incorrecta  o temporal.

Scenario: Primer cambio de placa
GivenStories: stories/policycenter/login_policy.story
Given que voy a buscar la cuenta <numCuenta>
And estoy expidiendo una poliza de autos
And seleccione el producto para expedir la poliza
And ingrese los datos del asegurado <tipo_documento> <documento>
And ingrese los datos del vehiculo:
|placa  |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis |motor|valor_asegurado|descuento|recargo|zona|plan        |
|ABB180 |2011  |01601225        |MEDELLIN          |Particular       |kljh456|yui10|17900000       |null     |null   |2   |Plan Modular|
And seleccione algunas coberturas:
| limite | deducible | abogado  | PTH | PPH | PPHF | GTH | AC | AS                 | PTD | PPD | PPDF | GT | PP | PT | GTR      | GP       | PLlaves  |
| 1.440  | 0         | Opción 1 | 10  | 910 | 1.50 | 40. | 35 | Asistencia Clásica | 10  | 0   | 1.50 | 40 | 16 | 20 | Opción 1 | Opción 1 | Opción 1 |
When expido la poliza y voy al archivo de poliza
And ingrese a modificar dicha cotizacion
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
|tipo_documento      |documento |numCuenta |placa  |placaInicial |placaVenezolana|ciudad|placaExistente|placaRiesgoConsultable|venezolana|                                                                     |
|CEDULA DE CIUDADANIA|1234567890|C000888888|rando21|ABB180       |AA111AA        |CUCUTA|BLE860        |RANDOT                |AA111AA   |

