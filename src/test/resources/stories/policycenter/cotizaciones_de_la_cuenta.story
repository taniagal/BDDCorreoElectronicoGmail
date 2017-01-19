Cotizaciones De La Cuenta

Meta: @lote4

@issue #CDSEG-684
@tag equipo: 5
@local
@Sprint 2

Narrative:
Como usuario PolicyCenter
quiero ser capaz de actualizar el estado de las cotizaciones creadas para una cuenta
y así poder crear, actualizar, copiar y retirar cotizaciones para una cuenta dada.


Scenario: Crear una nueva cotizacion
GivenStories: stories/policycenter/login_policy.story
Given estoy en una cuenta <numCuenta>
When ingrese a cotizaciones de la cuenta
And seleccione la opcion de crear nueva cotizacion
Then se debe iniciar el proceso de nueva cotizacion

Examples:
| numCuenta  |
| C001888888 |

Scenario: Ocultar opcion de retirar
Given estoy en una cuenta <numCuenta>
When ingrese a cotizaciones de la cuenta
And muestre el listado de las acciones que se le pueden hacer a una cotizacion <declinar> <noTomar>
Then no debe aparece la opcion de retirar <retirar>.

Examples:
| numCuenta  | declinar | noTomar  | retirar |
| C001888888 | Declinar | No tomar | Retirar |

Scenario: Mostrar resultado segun el filtro
Given estoy en una cuenta <numCuenta>
When ingrese a cotizaciones de la cuenta
And seleccione una o varias opciones de algun filtro <cotizaciones> <productos>
Then se debe mostrar la información de acuerdo a los filtros <productos>: Acciones, Producto, Cotizacion, Tipo de cotizacion,
Fecha inicio de vigencia, Fecha fin de vigencia, Estado, Costo total

Examples:
| numCuenta  | cotizaciones           | productos               |
| C001888888 | Todas las cotizaciones | Multiriesgo corporativo |


Scenario: Mostrar numero de poliza
Given estoy en una cuenta <numCuenta>
When ingrese a cotizaciones de la cuenta
And se esten mostrando todos los productos <producto>
And una cotizacion se encuentre en un estado 'Expedida' <estado>
Then se debe mostrar el numero de la poliza.

Examples:
| numCuenta  | estado   | producto            |
| C001888888 | Expedida | Todos los productos |

Scenario: No mostrar numero de poliza
Given estoy en una cuenta <numCuenta>
When ingrese a cotizaciones de la cuenta
And una cotizacion se encuentre en un estado diferente a 'Expedida' <estado>
Then el numero de poliza debe aparecer vacio.

Examples:
| numCuenta  | estado   |
| C001888888 | Borrador |

Scenario: Permitir crear carta de declinacion
Given estoy cotizando una poliza:
| cuenta     | organizacion | producto                |
| C001888888 | Sura         | Multiriesgo corporativo |
And seleccione reaseguro especial No
When agregue una nueva ubicacion departamento <departamento>, ciuad <ciudad>, direccion <direccion>
And descripcion <descripcion>, actividad economica <actividad>
And seleccione la cobertura:
| valorReconstruccion | valorAsegurado | valorComercial | cobertura |
| 100000000           | 100000000      | null           | Terremoto |
And cotice para la opcion declinar MRC
And estoy visualizando las cotizaciones de la cuenta <numCuenta>
And quiera declinar la cotizacion por cualquier razon <razon>
And una cotizacion este en estado 'Declinado' <declinado> y no se haya generado una carta de declinacion para esta cotizacion y sea cotizacion de MRC <propiedadComercial>
Then me debe permitir crear una carta de declinacion por medio de un boton. El label del boton debe ser 'Crear carta de declinacion' <crearCarta>.

Examples:
| envio    | numCuenta  | declinado | propiedadComercial      | crearCarta                 | departamento | ciudad   | direccion         | descripcion   | actividad                     | razon   |
| 22222211 | C001888888 | Declinada | Multiriesgo corporativo | Crear carta de declinación | Antioquia    | Medellin | CR 44 A # 45 - 00 | Edificio Core | Acabado de productos textiles | Cartera |

Scenario: Permitir descargar cartas
Given estoy en una cuenta <numCuenta>
When ingrese a cotizaciones de la cuenta
And a una cotizacion se le haya creado carta de confirmacion o de declinacion
Then me debe permitir descargar esta carta. Esta funcionalidad queda tal cual como viene de caja.

Examples:
| numCuenta  |
| C001888888 |

Scenario: No permitir crear carta de declinacion
Meta: @manual
Given estoy en una cuenta
When ingrese a cotizaciones de la cuenta
And una cotizacion sea producto Auto Personal
Then no debe aparecer la opcion de crear carta de declinacion