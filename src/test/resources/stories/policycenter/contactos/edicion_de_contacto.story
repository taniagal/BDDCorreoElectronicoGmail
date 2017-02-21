Meta:
@tag equipo: 1
@lote1
@Sprint 14

Narrative:
Como usuario de Policy Center
Quiero poder editar la informacion de un contacto
Para poder mantener actualizada y consistente su informacion

Scenario: validar la correcta edicion de un contacto que es persona natural
GivenStories: stories/policycenter/login_policy.story
Given que tengo un contacto creado de tipo persona natural con los siguientes datos
| tipoDocumento        | documento  | primerNombre | segundoNombre | primerApellido | segundoApellido | fechaNacimiento | dpto      | ciudad   | direccion      | tipoDireccion           | tipoTelefono | numeroTelefono |
| CEDULA DE CIUDADANIA | 1037576987 | PAOLA        | ANDREA        | ARCILA         | PEREZ           | 01/01/1987      | Antioquia | Medellin | Calle 10 10 10 | DIRECCION DE RESIDENCIA | Vivienda     | 2223344        |
When edito los datos contacto ingresado y los guardo
| primerNombre | segundoNombre | primerApellido | segundoApellido | direccion       | tipoDireccion        | tipoTelefono | numeroTelefono |
| PAULINA      | MARIA         | CORREA         | RUIZ            | CL 11 # 10 - 10 | DIRECCION DE TRABAJO | Vivienda     | 3334455        |
Then debo ver los datos actualizados del contacto persona natural
| primerNombre | segundoNombre | primerApellido | segundoApellido | direccion                           | tipoDireccion        | tipoTelefono | numeroTelefono |
| PAULINA      | MARIA         | CORREA         | RUIZ            | CL 11 # 10 - 10, Medellin, Colombia | DIRECCION DE TRABAJO | Vivienda     | 333-4455       |

Examples:
|  |
|  |

Scenario: validar la correcta edicion de un contacto que es compania
Given que tengo un contacto creado de tipo compania con los siguientes datos
| tipoDocumento | documento | razonSocial      | nombreComercial    | tipoDireccion        | direccion    | dpto      | ciudad   |
| NIT           | 124268999 | LOS PAJAROS S.A. | INVERSIONES TOROTE | DIRECCION DE TRABAJO | CRA 50 10 20 | Antioquia | Medellin |
When edito los datos contacto tipo compania ingresado y los guardo
| razonSocial        | nombreComercial  | tipoDireccion        | direccion       |
| LOS PAJARITOS S.A. | TORITO ASOCIADOS | DIRECCION DE TRABAJO | CR 51 # 10 - 20 |
Then debo ver los datos actualizados del contacto compania
| razonSocial        | nombreComercial  | tipoDireccion        | direccion                           |
| LOS PAJARITOS S.A. | TORITO ASOCIADOS | DIRECCION DE TRABAJO | CR 51 # 10 - 20, Medellin, Colombia |