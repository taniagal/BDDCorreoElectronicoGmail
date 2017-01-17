Consulta Contactos En Cuenta

Meta:
@lote2
@Story CDSEG-845
@tag team: 2
@Sprint 1

Narrative: Consultar detalle de un contacto específico de la cuenta

Scenario: Consulta de contactos asociados a una cuenta
GivenStories: stories/policycenter/login_policy.story
Given que he ingresado a PolicyCenter
And existe una cuenta <numCuenta>
And existe contactos asociados a la cuenta
When busque la cuenta
And desee visualizar los contactos asociados a la cuenta
Then debo ver contactos asociados a esta cuenta

Examples:
| numCuenta  | rolUsuario | mensajeEsperadoDeBusquedaDeContactos                              | descripcion                    |
| C010478975 | Asesor     | No existe información para los criterios de consulta seleccionado | Cuenta con contactos asociados |


Scenario: Consulta de contactos asociados a una cuenta por filtros de rol
Given que he ingresado a PolicyCenter
Given existe una cuenta <numCuenta>
And existe contactos asociados a la cuenta
When busque la cuenta
And desee visualizar los contactos asociados a la cuenta
And filtre los contactos asociados a una cuenta por el rol <rol> en el combo con valor <combo>
Then debo ver contactos asociados a esta cuenta que cumplan con el filtro <rol> en la columna <columna>

Examples:
| numCuenta  | rolUsuario | columna | rol                  | combo                   | descripcion |
| C010478975 | Asesor     | Rol     | Titular de la cuenta | Mostrar todos los roles |             |


Scenario: Consulta de contactos asociados a una cuenta por filtros de tipo de persona
Given que he ingresado a PolicyCenter
Given existe una cuenta <numCuenta>
And existe contactos asociados a la cuenta
When busque la cuenta
And desee visualizar los contactos asociados a la cuenta
When filtre los contactos asociados a una cuenta por el tipo de persona <tipoPersona> en el combo con valor <combo>

Examples:
| numCuenta  | rolUsuario | tipoPersona | combo                | descripcion |
| C010478975 | Asesor     | Personas    | Personas y compañías |             |
| C010478975 | Asesor     | Compañías   | Personas y compañías |             |