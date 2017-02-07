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
| tipoDocumento        | documento  | primerNombre | segundoNombre | primerApellido | segundoApellido | fechaNacimiento | Dpto      | Ciudad   | Direccion      | tipoDireccion           |
| CEDULA DE CIUDADANIA | 1037576987 | PAOLA        | ANDREA        | ARCILA         | PEREZ           | 01/01/1987      | Antioquia | MEDELLIN | Calle 10 10 10 | DIRECCION DE RESIDENCIA |
When I do something
Then system is in a different state

Examples:
|  |
|  |