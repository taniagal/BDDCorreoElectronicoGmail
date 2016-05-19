Meta:
Narrative: Modificación de la lista de los  filtros de búsqueda de los contactos de la cuenta (Rol y tipo de persona)

Scenario: Detalle de la consulta para contactos asociados a una cuenta
GivenStories: stories/policycenter/login_policy.story
Given estoy en la pantalla de cuenta y existe una cuenta <numCuenta> con contactos asociados
And quiera ver el detalle de los contactos de la cuenta <numCuenta>
And selecciono un contacto de la lista de contactos <posicion> y aplico la opcion <opcion>
Then debo ver el detalle del contacto de tipo persona

Examples:
|numCuenta|posicion|opcion|
|C001888888|0|DETALLE_CONTACTO|

Scenario: Detalle de la consulta roles asociados a un contacto
Given estoy en la pantalla de cuenta y existe una cuenta <numCuenta> con contactos asociados
And quiera ver el detalle de los contactos de la cuenta <numCuenta>
And selecciono un contacto de la lista de contactos <posicion> y aplico la opcion <opcion>
Then debo ver los roles de contacto de tipo persona y sus
|encabezados|
|Roles|
|Información adicional|
Examples:
|numCuenta|posicion|opcion|
|C001888888|0|FUNCIONES|

Scenario: Detalle de la consulta direcciones asociados a un contacto
Given estoy en la pantalla de cuenta y existe una cuenta <numCuenta> con contactos asociados
And quiera ver el detalle de los contactos de la cuenta <numCuenta>
And selecciono un contacto de la lista de contactos <posicion> y aplico la opcion <opcion>
Then debo ver las direcciones asociadas al contacto y sus
|encabezados|
|Principal|
|Tipo|
|Dirección|
Examples:
|numCuenta|posicion|opcion|
|C001888888|0|DIRECCIONES|


Scenario: Detalle de la consulta transacciones asociados a un contacto
Given estoy en la pantalla de cuenta y existe una cuenta <numCuenta> con contactos asociados
And quiera ver el detalle de los contactos de la cuenta <numCuenta>
And selecciono un contacto de la lista de contactos <posicion> y aplico la opcion <opcion>
Then debo ver las transacciones asociadas al contacto y sus
|encabezados|
|Crear fecha|
|N.º de transacción|
|Estado|
|N° de póliza|
|Producto|
|Tipo|
|Asegurador|
Examples:
|numCuenta|posicion|opcion|
|C001888888|0|TRANSACCIONES_ASOCIADAS|

Scenario: Detalle de la consulta transacciones asociados a un contacto
Given estoy en la pantalla de cuenta y existe una cuenta <numCuenta> con contactos asociados
And quiera ver el detalle de los contactos de la cuenta <numCuenta>
And selecciono un contacto de la lista de contactos <posicion> y aplico la opcion <opcion>
Then debo ver las polizas asociadas al contacto y sus
|encabezados|
|N° de póliza|
|Producto|
|Estado|
|Fecha de vigencia|
|Fecha de expiración|
Examples:
|numCuenta|posicion|opcion|
|C001888888|0|POLIZAS_ASOCIADAS|

Scenario: Asociacion de un contacto de facturacion (persona natural) a una cuenta
Given estoy en la pantalla de cuenta y existe una cuenta <numCuenta> con contactos asociados
And quiera ver el detalle de los contactos de la cuenta <numCuenta>
And y desee crear un nuevo contacto
And debo darClick <darClick>  y ver las opciones de menú para los roles
|Contacto de facturación|
|Nuevo Persona Natural|
And asocie un nuevo contacto a la cuenta con el rol seleccionado
Then debo poder visualizar el contacto recien asociado con su rol seleccionado
Examples:
|numCuenta|darClick|
|C000888888|true|

Scenario: Asociacion de un contacto de facturacion (persona natural) a una cuenta
Given estoy en la pantalla de cuenta y existe una cuenta <numCuenta> con contactos asociados
And quiera ver el detalle de los contactos de la cuenta <numCuenta>
And y desee crear un nuevo contacto
And debo darClick <darClick>  y ver las opciones de menú para los roles
|Contacto de facturación|
|Del Directorio|
And busco un contacto del directorio  que no exista en la cuenta con un rol existente
Then debo poder visualizar el contacto recien asociado con su rol seleccionado
Examples:
|numCuenta|darClick|
|C000888888|true|

Scenario: Eliminar un contacto asociado a una cuenta
Given estoy en la pantalla de cuenta y existe una cuenta <numCuenta> con contactos asociados
And quiera ver el detalle de los contactos de la cuenta <numCuenta>
And y deseo eliminar el contacto <contactoEliminado>
Then el contacto <contactoEliminado> ya no debe estar asociado a la cuenta
Examples:
|numCuenta|contactoEliminado|
|C000888888|Metals Unlimited|



