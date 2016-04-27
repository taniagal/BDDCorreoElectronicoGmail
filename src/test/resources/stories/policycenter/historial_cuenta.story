Meta:

Narrative:
Como usuario de policy center
Quiero  poder visualizar el historial de transacciones de una cuenta
y que esta se actualice cada que se realice una transaccion a la cuenta o a una poliza que pertenezca a la cuenta

#Scenario: Busqueda del historial por rango de fechas, sin indicar la opcion de fecha Desde
#Given me encuentro autenticado en gw
#And estoy en el historial de la cuenta <numCuenta>
#When se realiza la busqueda por <fecha> y solo se indique la opcion hasta
#Then debo poder ver las transacciones en el rango de fechas seleccionado, teniendo en cuenta que la opcion desde corresponde a la fecha de inicio de la cuenta

#Examples:
#|numCuenta|fecha|
#|S000212121|01/04/2016|

#Scenario: Busqueda del historial por rango de fechas, Sin indicar  la opción de fecha  Hasta
#Given me encuentro autenticado en gw
#And estoy en el historial de la cuenta <numCuenta>
#When se realiza la busqueda por <fecha> y solo se indique la opcion desde
#Then debo poder ver las transacciones en el rango de fechas seleccionado, teniendo en cuenta que la opcion hasta corresponde a la fecha actual.

#Examples:
#|numCuenta|fecha|
#|S000212121|01/04/2016|

#Scenario: Busqueda del historial por rango de fechas
#Given me encuentro autenticado en gw
#And estoy en el historial de la cuenta <numCuenta>
#When se realiza la busqueda por fecha ( <desde> - <hasta>)
#Then debo poder ver las transacciones en el rango de fechas seleccionado.

#Examples:
#|numCuenta|desde|hasta|
#|S000212121|01/01/2016|01/04/2016|

#Scenario: Busqueda de historial por usuario
#Given me encuentro autenticado en gw
#And estoy en el historial de la cuenta <numCuenta>
#When indique un <usuario> para realizar la busqueda
#Then debo poder ver las transacciones asociadas a ese usuario especifico, que estan relacionadas con la cuenta y las polizas asociadas a ella.

#Examples:
#|numCuenta|usuario|
#|S000212121|Christine Craft|

#------------------

#Scenario: Historial de la cuenta
#Given me encuentro autenticado en gw con un <country>, <user> y <password>
#And Estoy en una cuenta <numCuenta>
#When ingreso al historial
#Then mostrar la siguiente informacion <tipo>, <usuario>, <fechaTransaccion>, <descripcion>, <producto>, <poliza>, <transaccionPoliza>, <valorOriginal>, <valorNuevo>

#Examples:
#|country|user|password|numCuenta|tipo|usuario|fechaTransaccion|descripcion|producto|poliza|transaccionPoliza|valorOriginal|valorNuevo|
#|Colombia|pedrvevi|pedrvevi|S000212121|Tipo|Usuario|Fecha de transacción|Descripción|Producto|Póliza|Transacción de póliza|Valor original|Valor nuevo|

#Scenario: Busqueda de historial por la opcion Relacionado con
#Given me encuentro autenticado en gw
#And estoy en el historial de la cuenta <numCuenta>
#When indique el criterio de busqueda Relacionado con
#Then debo poder ver las transacciones relacionadas a la opcion indicada en el campo Relacionado con
#And mostrar la siguiente informacion <tipo>, <usuario>, <fechaTransaccion>, <descripcion>, <producto>, <poliza>, <transaccionPoliza>, <valorOriginal>, <valorNuevo>

#Examples:
#|numCuenta|tipo|usuario|fechaTransaccion|descripcion|producto|poliza|transaccionPoliza|valorOriginal|valorNuevo|
#|C000212105|Tipo|Usuario|Fecha de transacción|Descripción|Producto|Póliza|Transacción de póliza|Valor original|Valor nuevo|

Scenario: Busqueda de historial por la opcion producto
Given me encuentro autenticado en gw
And estoy en el historial de la cuenta <numCuenta>
When indique el criterio de busqueda producto
Then debo poder ver las transacciones relacionadas a la opcion indicada en el campo Producto

Examples:
|numCuenta|
|C000212105|
