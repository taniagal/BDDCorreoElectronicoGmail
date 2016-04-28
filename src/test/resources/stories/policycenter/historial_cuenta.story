Meta:

Narrative:
Como usuario de policy center
Quiero  poder visualizar el historial de transacciones de una cuenta
y que esta se actualice cada que se realice una transaccion a la cuenta o a una poliza que pertenezca a la cuenta

Scenario: Historial de la cuenta
Given me encuentro autenticado en gw con un <country>, <user> y <password>
And Estoy en una cuenta <numCuenta>
When ingreso al historial
Then mostrar la siguiente informacion <tipo>, <usuario>, <fechaTransaccion>, <descripcion>, <producto>, <poliza>, <transaccionPoliza>, <valorOriginal>, <valorNuevo>

Examples:
|country|user|password|numCuenta|tipo|usuario|fechaTransaccion|descripcion|producto|poliza|transaccionPoliza|valorOriginal|valorNuevo|
|Colombia|pedrvevi|pedrvevi|S000212121|Tipo|Usuario|Fecha de transacción|Descripción|Producto|Póliza|Transacción de póliza|Valor original|Valor nuevo|

Scenario: Busqueda de historial por usuario
Given me encuentro autenticado en gw
And estoy en el historial de la cuenta <numCuenta>
When indique un <usuario> para realizar la busqueda
Then debo poder ver las transacciones asociadas a ese usuario especifico, que estan relacionadas con la cuenta y las polizas asociadas a ella.

Examples:
|numCuenta|usuario|
|S000212121|Christine Craft|

Scenario: Busqueda de historial por la opcion Relacionado con
Given me encuentro autenticado en gw
And estoy en el historial de la cuenta <numCuenta>
When indique el criterio de busqueda Relacionado con
Then debo poder ver las transacciones relacionadas a la opcion indicada en el campo Relacionado con
And mostrar la siguiente informacion <tipo>, <usuario>, <fechaTransaccion>, <descripcion>, <producto>, <poliza>, <transaccionPoliza>, <valorOriginal>, <valorNuevo>

Examples:
|numCuenta|tipo|usuario|fechaTransaccion|descripcion|producto|poliza|transaccionPoliza|valorOriginal|valorNuevo|
|C000212105|Tipo|Usuario|Fecha de transacción|Descripción|Producto|Póliza|Transacción de póliza|Valor original|Valor nuevo|