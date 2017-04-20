Contactos Asociados A Cuenta

Meta:
@lote6
@Story CDSEG-845
@tag equipo: 2, sprint: 1

Narrative: Modificación de la lista de los  filtros de búsqueda de los contactos de la cuenta (Rol y tipo de persona)


Scenario: Correccion Bug, validacion de direccion de un contacto de facturacion y Asociacion de un contacto de facturacion (persona natural) a una cuenta
GivenStories: stories/policycenter/login_policy.story
Given que voy a buscar la cuenta <numCuenta>
And quiera ver el detalle de los contactos de la cuenta <numCuenta>
And y desee crear un nuevo contacto
And debo darClick <darClick>  y ver las opciones de menú para los roles
| Contacto de facturación |
| Nuevo Persona Natural   |
And asocie un nuevo contacto a la cuenta con el rol seleccionado
Then debo poder visualizar direccion del contacto
| Contacto de facturació  |
| Nuevo Persona Natural   |
And debo poder visualizar el contacto recien asociado con su rol seleccionado <contacto>
Examples:
| numCuenta  | darClick | contacto       |
| C000888888 | true     | JOHAN MUSTACHE |
