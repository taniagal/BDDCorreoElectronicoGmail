Meta:
@lote3
@tag equipo: ajustes, sprint: NA

Narrative:
Como usuario PolicyCenter
quiero poder buscar transacciones de acuerdo a la aplicacion origen
para encontrar una transaccion especifica ya sea de GroupCenter o de Cotizador Individual

Scenario: validar busqueda por numero de transaccion para aplicacion origen cotizador individual y producto autos
GivenStories: stories/policycenter/login_policy.story
Given que me encuentro en la busqueda de transacciones
When ingreso los siguientes datos para la busqueda:
| idTransaccion        | aplicacionDeOrigen   | producto |
| 04007800170503491694 | Cotizador individual | Autos    |
Then debo ver la informacion de las transacciones asociadas:
| numeroPoliza  | numeroTransaccion | estado   | tipo       |
| TEST_22222278 | 22222278          | Expedida | Cotización |

Examples:
|  |
|  |

Scenario: validar busqueda sin los datos requeridos
Given que me encuentro en la busqueda de transacciones
When ingreso los siguientes datos para la busqueda:
| idTransaccion | aplicacionDeOrigen | producto |
|               |                    |          |
Then debe mostrar el mensaje <mensaje>

Examples:
| mensaje                                                  |
| Por favor ingrese los campos requeridos para la búsqueda |

Scenario: validar busqueda con datos que no retornan resultados - MRC
Given que me encuentro en la busqueda de transacciones
When ingreso los siguientes datos para la busqueda:
| idTransaccion        | aplicacionDeOrigen | producto                |
| 04007800170503491694 | Group Center       | Multiriesgo corporativo |
Then debe mostrar el mensaje <mensaje>

Examples:
| mensaje                             |
| La búsqueda no devolvió resultados. |

Scenario: validar busqueda con datos que no retornan resultados - Autos
Given que me encuentro en la busqueda de transacciones
When ingreso los siguientes datos para la busqueda:
| idTransaccion        | aplicacionDeOrigen | producto |
| 04007800170503491694 | Group Center       | Autos    |
Then debe mostrar el mensaje <mensaje>

Examples:
| mensaje                             |
| La búsqueda no devolvió resultados. |