Cambio De Placa
Meta:
@lote3
@issue #CDSEG-4756
@tag automator: tania_grajales_alzate
@local
@Sprint 12

Narrative:
Como usuario de policy center
Se requiere poder corregir la placa, en el caso de que la poliza fuera expedida con una placa incorrecta  o temporal.

Scenario: Primer cambio de placa
GivenStories: stories/policycenter/login_policy.story
Given que voy a buscar la cuenta <numCuenta>
And estoy expidiendo una poliza de autos
And seleccione el producto para expedir la poliza
And quiera agregar un asegurado
And vaya a la opcion agregar
And seleccione ingresar nueva persona natural
And ingrese los datos de persona natural:
| tipoId               | numeroId   | primerNombre | primerApellido | pais     | departamento | ciudad   | direccion       | tipoDireccion                  |
| CEDULA DE CIUDADANIA | 1990778025| LUCIANA      | LONDOÑO        | Colombia | Antioquia    | Medellin | Cra 65 # 48-162 | DIRECCION DE OFICINA PRINCIPAL |
And vaya a agregar el vehiculo con los siguientes datos:
|placa  |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis |motor|valor_asegurado|descuento|recargo|zona|plan        |
|ABB116 |2011  |01601225        |MEDELLIN          |Particular       |kljh456|yui10|17900000       |null     |null   |2   |Plan Modular|
And seleccione algunas coberturas:
|limite|deducible|abogado |PTH|PPH|PPHF|GTH|AC|AS                |PTD|PPD|PPDF|GT|PP|PT|GTR     |GP      |PLlaves |
|1.440 |0        |Opción 1|10 |910|1.50|40.|35|Asistencia Clásica|10 |0  |1.50|40|16|20|Opción 1|Opción 1|Opción 1|
When voy a expedir una poliza
And confirmo el mensaje de expedir poliza
And voy al archivo de poliza
And ingrese a modificar dicha cotizacion
And se ingrese a la opcion vehiculos
And cuando cambie la placa <placa>
And se deben recargar los datos de la placa anterior:
|modelo|codigoFasecolda|ciudadCirculacion  |tipoServicio|chasis |motor|valorAsegurado |claseVehiculo|marca|zona|
|2011  |01601225        |MEDELLIN          |Particular  |kljh456|yui10|17900000       |Automóviles  |AUDI |2   |
And quiera volver a cambiar la placa
And se debe cargar la placa inicial <placaInicial>
And vuelva a cambiar la placa
And coloque una placa existente <placaExistente>
And debe salir un mensaje de advertencia <mensaje>
And cuando ingrese una placa venezolana de cucuta <placaVenezolana> <ciudad>
And intente cotizar el cambio de poliza
And expida el cambio de la poliza
Then debe mostrar un mensaje solicitando autorizacion


Examples:
|numCuenta |placa  |placaInicial|placaVenezolana|ciudad|placaExistente|mensaje                                                                        |
|C000888888|rando21|ABB116      |AA111AA        |CUCUTA|BLE860        |La placa BLE865 está asegurada en la póliza TEST_22222239, por favor verifique.|

