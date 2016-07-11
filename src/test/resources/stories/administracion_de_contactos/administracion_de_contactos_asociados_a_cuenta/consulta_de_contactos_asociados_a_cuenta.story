Consulta de contactos asociados a cuenta

Meta:
@issue SUGWUSC-14962
@url https://jira.suramericana.com.co/browse/SUGWUSC-14962
@tag mother:SUGWUSC-10140

Narrative: Consultar detalle de un contacto específico de la cuenta

Scenario: Consulta de contactos asociados a una cuenta

Given que he ingresado a PolicyCenter como usuario <rolUsuario>
And existe una cuenta <numCuenta>
And existe contactos asociados a la cuenta
When busque la cuenta
And desee visualizar los contactos asociados a la cuenta
Then debo ver contactos asociados a esta cuenta

Examples:
| numCuenta  | rolUsuario | mensajeEsperadoDeBusquedaDeContactos                              | descripcion                    |
| C001888888 | Asesor     | No existe información para los criterios de consulta seleccionado | Cuenta con contactos asociados |
| C001888888 | Asesor     | No existen contactos asociados a la cuenta                        | Cuenta sin contactos asociados |


Scenario: Consulta de contactos asociados a una cuenta por filtros de rol
Given que he ingresado a PolicyCenter como usuario <rolUsuario>
Given existe una cuenta <numCuenta>
And existe contactos asociados a la cuenta
When busque la cuenta
When filtre los contactos asociados a una cuenta por el rol <rol> en el combo con valor <combo>
Then debo ver contactos asociados a esta cuenta que cumplan con el filtro <rol>

Examples:
| numCuenta  | rolUsuario | rol                  | combo                   | descripcion |
| C001888888 | Asesor     | Titular de la cuenta | Mostrar todos los roles |             |
| C001888888 | Asesor     | Asegurado nombrado   | Mostrar todos los roles |             |
| C001888888 | Asesor     | Interés adicional    | Mostrar todos los roles |             |
| C001888888 | Asesor     | Conductor            | Mostrar todos los roles |             |


Scenario: Consulta de contactos asociados a una cuenta por filtros de tipo de persona
Given que he ingresado a PolicyCenter como usuario <rolUsuario>
Given existe una cuenta <numCuenta>
And existe contactos asociados a la cuenta
When busque la cuenta
When filtre los contactos asociados a una cuenta por el tipo de persona <tipoPersona> en el combo con valor <combo>
Then debo ver contactos asociados a esta cuenta que cumplan con el filtro <tipoPersona>

Examples:
| numCuenta  | rolUsuario | tipoPersona | combo                | descripcion |
| C001888888 | Asesor     | Personas    | Personas y compañías |             |
| C001888888 | Asesor     | Compañías   | Personas y compañías |             |

Scenario: Consulta de contactos asociados a una cuenta por filtros de rol
Given que he ingresado a PolicyCenter como usuario <rolUsuario>
Given existe una cuenta <numCuenta>
And existe contactos asociados a la cuenta
When busque la cuenta
When filtre los contactos asociados a una cuenta por el rol <rol> en el combo con valor <comboRol> y por el tipo de persona <tipoPersona> en el combo con valor <comboPersona>
Then debo ver contactos asociados a esta cuenta que cumplan con el filtro <tipoPersona> y <rol>

Examples:
| numCuenta  | rolUsuario | rol                  | tipoPersona | comboPersona         | comboRol                | mensajeEsperado | descripcion |
| C001888888 | Asesor     | Titular de la cuenta | Personas    | Personas y compañías | Mostrar todos los roles |                 |             |
| C001888888 | Asesor     | Conductor            | Compañías   | Personas y compañías | Mostrar todos los roles |                 |             |

