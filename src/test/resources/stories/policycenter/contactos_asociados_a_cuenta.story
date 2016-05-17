Meta:
Narrative: Modificación de la lista de los  filtros de búsqueda de los contactos de la cuenta (Rol y tipo de persona)

Scenario: Asociacion de un contacto de facturacion (persona natural) a una cuenta
GivenStories: stories/policycenter/login_policy.story
Given estoy en la pantalla de cuenta y existe una cuenta <numCuenta> con contactos asociados
And quiera ver el detalle de los contactos de la cuenta <numCuenta>
And y desee crear un nuevo contacto
And debo darClick <darClick>  y ver las opciones de menú para los roles
|Contacto de facturacion|
|Nueva Persona Natural|
And asocie un nuevo contacto a la cuenta con el rol seleccionado
Then debo poder visualizar el contacto recien asociado con su rol seleccionado
Examples:
|numCuenta|darClick|
|S000212121|true|



