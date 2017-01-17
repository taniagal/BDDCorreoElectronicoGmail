Meta: @lote3

@issue #SUGWUSC-14968
@tag team: 3
@local


Narrative:
Como usuario de policy center
con un perfil que tenga permisos quiero ser capaz de actualizar el estado de las cotizaciones creadas para una cuenta y
así poder crear, actualizar,copiar y retirar cotizaciones para una cuenta dada


Scenario: No tomar una cotizacion sin ingresar la razon
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza:
|cuenta     |organizacion|producto               |
|C1060447895|Sura        |Multiriesgo corporativo|
And seleccione reaseguro especial No
When agregue una nueva ubicacion departamento <departamento>, ciuad <ciudad>, direccion <direccion>
And descripcion <descripcion>, actividad economica <actividad>
And seleccione la cobertura:
| valorReconstruccion | valorAsegurado | valorComercial | cobertura |
| 100000000           | 100000000      | null           | Terremoto |
And cotice para la opcion no tomar MRC
And estoy visualizando las cotizaciones de la cuenta <numCuenta>
When no quiera tomar la cotizacion sin ingresar una razon
Then el sistema debe mostrar un mesaje <mensaje> y bloquear la accion

Examples:
|departamento|ciudad  |direccion        |descripcion  |actividad                    | numCuenta   | mensaje                                     |
|Antioquia   |Medellin|CR 44 A # 45 - 00|Edificio Core|Acabado de productos textiles| C1060447895 | Falta el campo obligatorio "Código de razón |

Scenario: No tomar una cotizacion desde una cuenta
Given estoy cotizando una poliza:
|cuenta     |organizacion|producto               |
|C000484848 |Sura        |Multiriesgo corporativo|
And seleccione reaseguro especial No
When agregue una nueva ubicacion departamento <departamento>, ciuad <ciudad>, direccion <direccion>
And descripcion <descripcion>, actividad economica <actividad>
And seleccione la cobertura:
| valorReconstruccion | valorAsegurado | valorComercial | cobertura |
| 100000000           | 100000000      | null           | Terremoto |
And cotice para la opcion no tomar MRC
And estoy visualizando las cotizaciones de la cuenta <numCuenta>
When no quiera tomar la cotizacion por una razon <razon>
Then el sistema debe mostrar el estado no tomada <numCotizacion> <accion>
And desahabilitar la opcion de acciones

Examples:
|departamento|ciudad  |direccion        |descripcion  |actividad                    | numCuenta   | razon              | numCotizacion | accion    |
|Antioquia   |Medellin|CR 44 A # 45 - 00|Edificio Core|Acabado de productos textiles| C000484848  | No acuerdo de pago |               | No tomada |

Scenario: Validar campos obligatorios de lista despleglable razon de no tomar
Meta: @manual
Given que estoy visualizando las cotizaciones de la cuenta <numCuenta>
When no quiera tomar la cotizacion
Then el sistema debe mostrarme todas las siguientes opciones:
|Precio y condiciones no satisfactorias|
|Se aseguró en otra compañía|
|No acuerdo de pago|
|No cumple condiciones de licitación|

Examples:
|numCuenta|
|C001888888|
