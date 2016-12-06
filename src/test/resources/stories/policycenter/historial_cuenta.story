Historial Cuenta

Meta: @lote4

@issue #CDSEG-925
@tag automator: diego_cardona_acevedo
@Sprint 1

Narrative:
Como usuario de policy center
Quiero  poder visualizar el historial de transacciones de una cuenta
y que esta se actualice cada que se realice una transaccion a la cuenta o a una poliza que pertenezca a la cuenta

Scenario: Historial de la cuenta
GivenStories: stories/policycenter/login_policy.story
Given ingreso a una cuenta <numCuenta>
When ingrese al historial
Then mostrar la informacion del historial de la cuenta

Examples:
|numCuenta |tipo|usuario|fechaTransaccion|descripcion|producto|poliza|transaccionPoliza|valorOriginal|valorNuevo|
|C000777777|Tipo|Usuario|Fecha de transacción|Descripción|Producto|Póliza|Transacción de póliza|Valor original|Valor nuevo|

Scenario: Busqueda de historial por la opcion Relacionado con
Given estoy en el historial de la cuenta <numCuenta>
When indique el criterio de busqueda Relacionado con
Then debo poder ver las transacciones relacionadas a la opcion indicada en el campo Relacionado con
And mostrar la informacion del historial de la cuenta

Examples:
|numCuenta |tipo|usuario|fechaTransaccion|descripcion|producto|poliza|transaccionPoliza|valorOriginal|valorNuevo|
|C000777777|Tipo|Usuario|Fecha de transacción|Descripción|Producto|Póliza|Transacción de póliza|Valor original|Valor nuevo|

Scenario: Busqueda de historial por la opcion producto
Given estoy en el historial de la cuenta <numCuenta>
When indique el criterio de busqueda producto
Then debo poder ver las transacciones relacionadas a la opcion indicada en el campo Producto

Examples:
|numCuenta |
|C000777777|

Scenario: Busqueda de historial combinando multiples opciones: Usuario, Relacionado Con y Fechas
Given estoy en el historial de la cuenta <numCuenta>
When indique los criterios de busqueda <Usuario>, RelacionadoCon y <FechaDesde> y <FechaHasta>
Then debo poder ver las transacciones relacionadas a la opciones indicadas en los campos de busqueda

Examples:
|numCuenta |Usuario   |FechaDesde|FechaHasta |
|C000777777|Super User|01/01/2016|12/30/2016 |

Scenario: Busqueda de historial por usuario
Meta:
@manual
Given estoy en el historial de la cuenta
When indique un <usuario> para realizar la busqueda
Then debo poder ver las transacciones asociadas a ese usuario especifico, que estan relacionadas con la cuenta y las polizas asociadas a ella.

Examples:
|numCuenta |usuario|
|C010478975|Super User|

Scenario: Busqueda del historial por rango de fechas, Sin indicar  la opción de fecha  Hasta
Meta:
@manual
Given estoy en el historial de la cuenta
When se realiza la busqueda por <fecha> y solo se indique la opcion desde
Then debo poder ver las transacciones en el rango de fechas seleccionado, teniendo en cuenta que la opcion hasta corresponde a la fecha actual.

Examples:
|numCuenta|fecha|
|C010478975|01/04/2016|

Scenario: Busqueda del historial por rango de fechas, sin indicar la opcion de fecha Desde
Meta:
@manual
Given estoy en el historial de la cuenta
When se realiza la busqueda por <fecha> y solo se indique la opcion hasta
Then debo poder ver las transacciones en el rango de fechas seleccionado, teniendo en cuenta que la opcion desde corresponde a la fecha de inicio de la cuenta

Examples:
|numCuenta|fecha|
|C010478975|01/04/2016|

Scenario: Busqueda del historial por rango de fechas
Meta:
@manual
Given estoy en el historial de la cuenta
When se realiza la busqueda por fecha ( <desde> - <hasta>)
Then debo poder ver las transacciones en el rango de fechas seleccionado.

Examples:
|numCuenta|desde|hasta|
|C010478975|01/01/2016|01/07/2016|

Scenario: Ver detalle de la transaccion - Poliza
Meta:
@manual
Given estoy en el historial de la cuenta
When seleccione  el  numero de la <poliza>
Then debo poder ver el campo poliza habilitado como un vinculo para el detalle de la transaccion

Examples:
|numCuenta|poliza|
|C010478975|pedrvevi|

Scenario: Ver detalle de la transaccion - Transaccion de Poliza
Meta:
@manual
Given estoy en el historial de la cuenta
When seleccione  el  numero de la transaccion <numeroTransaccion> de la poliza
Then debo poder ver el detalle de la transaccion

Examples:
|numCuenta|numeroTransaccion|
|C010478975|pedrvevi|

Scenario: Valor original
Meta:
@manual
Given estoy en el historial de la cuenta
When se realice una modificacion valorable a la <poliza> de la cuenta
Then poder ver el <valorOriginal> de la poliza antes de realizar el cambio

Examples:
|numCuenta|poliza|valorOriginal|
|C010478975|pedrvevi|123|

Scenario: Valor nuevo
Meta:
@manual
Given estoy en el historial de la cuenta
When se realice una modificacion valorable a la <poliza> de la cuenta
Then poder ver el <valorNuevo> de la poliza despues de realizar el cambio

Examples:
|numCuenta|poliza|valorNuevo|
|C010478975|pedrvevi|pedrvevi|
