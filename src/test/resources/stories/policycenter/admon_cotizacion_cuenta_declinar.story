Meta: @lote1

@issue #SUGWUSC-14966
@tag automator: Jonathan_Mejia_Leon
@local

Narrative:
Como usuario de policy center
con un perfil que tenga permisos quiero ser capaz de actualizar el estado de las cotizaciones creadas para una cuenta y
así poder crear, actualizar,copiar y retirar cotizaciones para una cuenta dada

Scenario: Declinar una cotizacion sin razon
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza basado en otro envio <envio>
When agregue una nueva ubicacion departamento <departamento>, ciuad <ciudad>, direccion <direccion>
And descripcion <descripcion>, actividad economica <actividad>
And seleccione la cobertura:
|valorReconstruccion|valorAsegurado|valorComercial|cobertura|
|100000000          |100000000     |null          |Terremoto|
And cotice el articulo
And estoy visualizando las cotizaciones de la cuenta <numCuenta>
And quiera declinar la cotizacion sin ingresar la razon
Then el sistema debe mostrar un mesaje <mensaje>

Examples:
| envio    |departamento|ciudad  |direccion        |descripcion  |actividad                    | numCuenta  | mensaje                                     |
| 22222211 |Antioquia   |Medellin|CR 44 A # 45 - 00|Edificio Core|Acabado de productos textiles| C001888888 | Falta el campo obligatorio "Código de razón |

Scenario: Validar al seleccionar la opcion declinar
Given estoy cotizando una poliza basado en otro envio <envio>
When agregue una nueva ubicacion departamento <departamento>, ciuad <ciudad>, direccion <direccion>
And descripcion <descripcion>, actividad economica <actividad>
And seleccione la cobertura:
|valorReconstruccion|valorAsegurado|valorComercial|cobertura|
|100000000          |100000000     |null          |Terremoto|
And cotice el articulo
And estoy visualizando las cotizaciones de la cuenta <numCuenta>
And quiera declinar la cotizacion
Then el sistema debe mostrarme todas las opciones:
|Cartera|
|No acuerdo de pago|
|Riesgo no objetivo|
|Sin respaldo de reaseguradores y coaseguradores|
|Siniestros|

Examples:
| envio    |departamento|ciudad  |direccion        |descripcion  |actividad                    | numCuenta  |
| 22222211 |Antioquia   |Medellin|CR 44 A # 45 - 00|Edificio Core|Acabado de productos textiles| C001888888 |


Scenario: Declinar una cotizacion desde una cuenta
Given estoy cotizando una poliza basado en otro envio <envio>
When agregue una nueva ubicacion departamento <departamento>, ciuad <ciudad>, direccion <direccion>
And descripcion <descripcion>, actividad economica <actividad>
And seleccione la cobertura:
|valorReconstruccion|valorAsegurado|valorComercial|cobertura|
|100000000          |100000000     |null          |Terremoto|
And cotice el articulo
And estoy visualizando las cotizaciones de la cuenta <numCuenta>
And quiera declinar la cotizacion por cualquier razon <razon>
Then el sistema debe mostrar el estado declinada <numCotizacion> <accion>
And desahabilitar la opcion de acciones para no ser modificada

Examples:
| envio    | departamento | ciudad   | direccion         | descripcion   | actividad                     | numCuenta  | razon   | numCotizacion | accion    |
| 22222211 | Antioquia    | Medellin | CR 44 A # 45 - 00 | Edificio Core | Acabado de productos textiles | C001888888 | Cartera | 22223228      | Declinada |