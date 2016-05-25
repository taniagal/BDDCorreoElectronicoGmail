Meta:

Narrative:
Como usuario PolicyCenter
quiero ser capaz de actualizar el estado de las cotizaciones creadas para una cuenta
y así poder crear, actualizar, copiar y retirar cotizaciones para una cuenta dada.

Scenario: Cambiar el estado de una cotizacion
GivenStories: stories/policycenter/login_policy.story
Given estoy en una cuenta <numCuenta>
When ingrese a cotizaciones de la cuenta
And seleccione las acciones de una cotizacion en particular
Then me debe permitir cambiar el estado de acuerdo a la lista definida. Lista definida: Declinar <declinar>, No Tomar <noTomar>

Examples:
|numCuenta  |declinar|noTomar   |
|C000777777 |Declinar|No tomar|

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