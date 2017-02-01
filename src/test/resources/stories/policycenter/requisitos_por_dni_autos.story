Meta: @lote4
@issue #SUGWUSC-5944
@tag team: 5

Narrative:
Como usuario de negocio
Quiero poder visualizar los requisitos por DNI diferente
Para la solucion de autos

Scenario: Expedicion de poliza con beneficiario-asegurado-tomador que requieren requisitos
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza de mrc con documento:
| organizacion | producto | canal             | tipoPoliza | tipo_documento       | documento  | fecha_nacimiento | primer_nombre | primer_apellido | tipo_direccion          | direccion        | departamento | ciudad   | agente |
| Sura         | Autos    | Canal Tradicional | Individual | CEDULA DE CIUDADANIA | 1036543787 | 10/10/1973       | LUCIANA       | LONDOÑO         | DIRECCION DE RESIDENCIA | CALLE 65F #60-69 | Antioquia    | Medellin | INT-3  |
When ingrese los datos del asegurado <tipo_documento> <documento>
And ingrese los datos del vehiculo en expedicion:
|placa  |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis |motor|valor_asegurado|descuento|recargo|zona|plan        |
|ABB182 |2011  |01601225        |MEDELLIN          |Particular       |kljh456|yui10|17900000       |null     |null   |2   |Plan Modular|
And seleccione algunas coberturas:
| limite | deducible | abogado  | PTH | PPH | PPHF | GTH | AC | AS                 | PTD | PPD | PPDF | GT | PP | PT | GTR      | GP       | PLlaves  |
| 1.440  | 0         | Opción 1 | 10  | 910 | 1.50 | 40. | 35 | Asistencia Clásica | 10  | 0   | 1.50 | 40 | 16 | 20 | Opción 1 | Opción 1 | Opción 1 |
And agrege un beneficiario <tipoDocumento> <numeroDocumento><tipoBeneficiario>
And cotice una poliza
And voy a expedir una poliza
And acepto la expedicion de poliza
Then debe salir el nombre de los usuarios que requieren requisitos
|mensajes         |
|LUCIANA LONDOÑO  |
|CAROLINA OCHOA   |

Examples:
|tipoDocumento       |tipo_documento       |documento  |numeroDocumento|tipoBeneficiario|
|CEDULA DE CIUDADANIA|CEDULA DE CIUDADANIA |71318883   |71123456       |Oneroso Leasing |

Scenario: transaccion de poliza con requisitos
Meta:
@manual
Given que estoy en una transaccion de poliza
When los dni tengan requisitos pendientes opcionales
And debe indicar mediante un mensaje que existenten requisitos pendientes opcionales
And cuando edite la transaccion de poliza
And cambie algun dni con requisitos pendientes por uno que no los tenga
Then me deben aparecer solo los requisitos de los dni que lo requieran