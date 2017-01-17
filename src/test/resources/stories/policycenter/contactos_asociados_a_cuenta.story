Contactos Asociados A Cuenta

Meta:
@lote1
@Story CDSEG-845
@tag team: 2
@Sprint 1

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
| Contacto de facturación |
| Nuevo Persona Natural   |
And debo poder visualizar el contacto recien asociado con su rol seleccionado <contacto>
Examples:
| numCuenta  | darClick | contacto       |
| C000888888 | true     | JOHAN MUSTACHE |


Scenario: Asociacion de un contacto de facturacion (persona natural) a una cuenta
Given que voy a buscar la cuenta <numCuenta>
And quiera ver el detalle de los contactos de la cuenta <numCuenta>
And y desee crear un nuevo contacto
And debo darClick <darClick>  y ver las opciones de menú para los roles
| Contacto de facturación |
| Del Directorio          |
And busco un contacto del directorio  que no exista en la cuenta con un rol existente
Then debo poder visualizar el contacto recien asociado con su rol seleccionado <contacto>
Examples:
| numCuenta  | darClick | contacto                        |
| C000888888 | true     | DORIAN STIWAR EASTMOND PULGARIN |

Scenario: Eliminar un contacto asociado a una cuenta
Given que voy a buscar la cuenta <numCuenta>
And quiera ver el detalle de los contactos de la cuenta <numCuenta>
And y deseo eliminar el contacto <contactoEliminado>
Then el contacto <contactoEliminado> ya no debe estar asociado a la cuenta
Examples:
| numCuenta  | contactoEliminado |
| C000888888 | JOHAN MUSTACHE    |