Meta:
@lote1
@issue #SUGWUSC-14966
@tag automator: Jonathan_Mejia_Leon
@local

Narrative:
Como usuario de policy center
con un perfil que tenga permisos quiero ser capaz de actualizar el estado de las cotizaciones creadas para una cuenta y
así poder crear, actualizar,copiar y retirar cotizaciones para una cuenta dada

Scenario: Declinar una cotizacion sin razon
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza:
| cuenta      | organizacion | producto                |
| C000902244  | Sura         | Multiriesgo corporativo |
And seleccione reaseguro especial No
When agregue una nueva ubicacion departamento <departamento>, ciuad <ciudad>, direccion <direccion>
And descripcion <descripcion>, actividad economica <actividad>
And seleccione la cobertura:
| valorReconstruccion | valorAsegurado | valorComercial | cobertura |
| 100000000           | 100000000      | null           | Terremoto |
And cotice para la opcion declinar MRC
And estoy visualizando las cotizaciones de la cuenta <numCuenta>
And quiera declinar la cotizacion sin ingresar la razon
Then el sistema debe mostrar un mesaje <mensaje>

Examples:
| envio    |departamento|ciudad  |direccion        |descripcion  |actividad                    | numCuenta  | mensaje                                     |
| 22222211 |Antioquia   |Medellin|CR 44 A # 45 - 00|Edificio Core|Acabado de productos textiles| C000902244 | Falta el campo obligatorio "Código de razón |

Scenario: Validar al seleccionar la opcion declinar y declinar una cotizacion desde una cuenta
Given estoy cotizando una poliza:
| cuenta      | organizacion | producto                |
| C002888989  | Sura         | Multiriesgo corporativo |
And seleccione reaseguro especial No
When agregue una nueva ubicacion departamento <departamento>, ciuad <ciudad>, direccion <direccion>
And descripcion <descripcion>, actividad economica <actividad>
And seleccione la cobertura:
| valorReconstruccion | valorAsegurado | valorComercial | cobertura |
| 100000000           | 100000000      | null           | Terremoto |
And cotice para la opcion declinar MRC
And estoy visualizando las cotizaciones de la cuenta <numCuenta>
And quiera declinar la cotizacion
And el sistema debe mostrarme todas las opciones:
| Cartera                                         |
| No acuerdo de pago                              |
| Riesgo no objetivo                              |
| Sin respaldo de reaseguradores y coaseguradores |
| Siniestros                                      |
And quiera declinar la cotizacion por cualquier razon <razon>
Then el sistema debe mostrar el estado declinada <numCotizacion> <accion>
And desahabilitar la opcion de acciones para no ser modificada

Examples:
| envio    | departamento | ciudad   | direccion         | descripcion   | actividad                     | numCuenta   | razon   | numCotizacion | accion    |
| 22222211 | Antioquia    | Medellin | CR 44 A # 45 - 00 | Edificio Core | Acabado de productos textiles | C002888989  | Cartera |               | Declinada |