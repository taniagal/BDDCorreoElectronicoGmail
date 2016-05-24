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
|numeroCuenta|declinar|noTomar |
|C000888888  |Declinar|No Tomar|


Scenario: Crear una nueva cotizacion
Given estoy en una cuenta <numCuenta>
When ingrese a cotizaciones de la cuenta
And seleccione la opcion de crear nueva cotizacion <crearCotizacion>
Then se debe iniciar el proceso de nueva cotizacion

Examples:
|numeroCuenta|crearCotizacion |
|C000888888  |Nueva Cotización|


Scenario: Ocultar opcion de retirar
Given estoy en una cuenta <numCuenta>
When ingrese a cotizaciones de la cuenta
And muestre el listado de las acciones que se le pueden hacer a una cotización
Then no debe aparece la opcion de retirar.

Examples:
|numeroCuenta|crearCotizacion |
|C000888888  |Nueva Cotización|


Scenario: Mostrar resultado segun el filtro
Given estoy en una cuenta <numCuenta>
When ingrese a cotizaciones de la cuenta
And seleccione una o varias opciones de algun filtro
Then se debe mostrar la información de acuerdo a los filtros: Acciones <acciones>, Producto <producto>,
Cotizacion <cotizacion>, Tipo de cotizacion <tipoCotizacion>, Fecha inicio de vigencia <fechaInicioVigencia>,
Fecha fin de vigencia <fechaFinVigencia>, Estado <estado>, Costo total <costoTotal>.

Examples:
|numeroCuenta|acciones |producto|cotizacion|tipoCotizacion|fechaInicioVigencia|fechaFinVigencia|estado|costoTotal|
|C000888888  |Nueva Cotización|


Scenario: No mostrar numero de poliza
Given estoy en una cuenta <numCuenta>
When ingrese a cotizaciones de la cuenta
And una cotización se encuentre en un estado diferente a "Bound"
Then el número de poliza debe aparecer vacío.

Examples:
|numeroCuenta|acciones |producto|cotizacion|tipoCotizacion|fechaInicioVigencia|fechaFinVigencia|estado|costoTotal|
|C000888888  |Nueva Cotización|


Scenario: Mostrar numero de poliza
Given estoy en una cuenta <numCuenta>
When ingrese a cotizaciones de la cuenta
And una cotización se encuentre en un estado "Bound"
Then se debe mostrar el numero de la poliza

Examples:
|numeroCuenta|
|C000888888  |


Scenario: Mostrar labels correctos en español
Given estoy en una cuenta <numeroCuenta>
When ingrese a cotizaciones de la cuenta
And una cotización se encuentre en un estado "Bound"
Then se debe mostrar el numero de la poliza

Examples:
|numeroCuenta|
|C000888888  |




