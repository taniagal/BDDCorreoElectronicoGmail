Cotizaciones De la Cuenta

Meta:

Narrative:
Como usuario PolicyCenter
quiero ser capaz de actualizar el estado de las cotizaciones creadas para una cuenta
y así poder crear, actualizar, copiar y retirar cotizaciones para una cuenta dada.

@Issue SUGWUSC-10230 Account Submission Manager

Scenario: Cambiar el estado de una cotizacion
GivenStories: stories/policycenter/login_policy.story
Given estoy en una cuenta <numCuenta>
When ingrese a cotizaciones de la cuenta
And seleccione las acciones de una cotizacion en particular
Then me debe permitir cambiar el estado de acuerdo a la lista definida. Lista definida: Declinar <declinar>, No Tomar <noTomar>

Examples:
|numCuenta  |declinar|noTomar   |
|C000777777 |Declinar|No tomar  |

Scenario: Crear una nueva cotizacion
Given estoy en una cuenta <numCuenta>
When ingrese a cotizaciones de la cuenta
And seleccione la opcion de crear nueva cotizacion
Then se debe iniciar el proceso de nueva cotizacion

Examples:
|numCuenta   |
|C000777777  |

Scenario: Ocultar opcion de retirar
Given estoy en una cuenta <numCuenta>
When ingrese a cotizaciones de la cuenta
And muestre el listado de las acciones que se le pueden hacer a una cotizacion <declinar> <noTomar>
Then no debe aparece la opcion de retirar <retirar>.

Examples:
|numCuenta  |declinar |noTomar   |retirar |
|C000777777 |Declinar |No tomar  |Retirar |

Scenario: Mostrar resultado segun el filtro
Given estoy en una cuenta <numCuenta>
When ingrese a cotizaciones de la cuenta
And seleccione una o varias opciones de algun filtro <cotizaciones> <productos>
Then se debe mostrar la información de acuerdo a los filtros <productos>: Acciones, Producto, Cotizacion, Tipo de cotizacion,
Fecha inicio de vigencia, Fecha fin de vigencia, Estado, Costo total

Examples:
|numCuenta  |cotizaciones           |productos           |
|C000777777 |Todas las cotizaciones |Propiedad comercial |

Scenario: Mostrar labels correctos en espanol
Given estoy en una cuenta <numCuenta>
When ingrese a cotizaciones de la cuenta
Then los labels se deben mostrar tal cual como se indica en los UIFields

Examples:
|numCuenta   |
|C000777777  |


Scenario: Mostrar numero de poliza
Given estoy en una cuenta <numCuenta>
When ingrese a cotizaciones de la cuenta
And se esten mostrando todos los productos <producto>
And una cotizacion se encuentre en un estado 'Expedida' <estado>
Then se debe mostrar el numero de la poliza.

Examples:
|numCuenta |estado  |producto          |
|C000777777|Expedida|Todos los productos|


Scenario: No mostrar numero de poliza
Given estoy en una cuenta <numCuenta>
When ingrese a cotizaciones de la cuenta
And una cotizacion se encuentre en un estado diferente a 'Expedida' <estado>
Then el numero de poliza debe aparecer vacio.

Examples:
|numCuenta   |estado  |
|C000777777  |Borrador|


Scenario: Permitir crear carta de declinacion
Given estoy en una cuenta <numCuenta>
When ingrese a cotizaciones de la cuenta
And una cotizacion este en estado 'Declinado' <declinado> y no se haya generado una carta de declinacion para esta cotizacion y sea cotizacion de MRC <propiedadComercial>
Then me debe permitir crear una carta de declinacion por medio de un boton. El label del boton debe ser 'Crear carta de declinacion' <crearCarta>.

Examples:
|numCuenta   |declinado|propiedadComercial |crearCarta                |
|C000777777  |Declinado|Propiedad comercial|Crear carta de declinación|


Scenario: No permitir crear carta de declinacion
Given estoy en una cuenta <numCuenta>
When ingrese a cotizaciones de la cuenta
And una cotizacion sea producto Auto Personal <producto>
Then no debe aparecer la opcion de crear carta de declinacion <crearCarta>.

Examples:
|numCuenta   |producto     |crearCarta                |
|C000777777  |Auto personal|Crear carta de declinación|


Scenario: Permitir descargar cartas
Given estoy en una cuenta <numCuenta>
When ingrese a cotizaciones de la cuenta
And a una cotizacion se le haya creado carta de confirmacion o de declinacion
Then me debe permitir descargar esta carta. Esta funcionalidad queda tal cual como viene de caja.

Examples:
|numCuenta  |
|C000777777 |

