Meta:
@lote1
@tag equipo: 5, sprint: 13

Narrative:
Como usuario de Policy Center con rol de agente, CSR, autorizador o gerente,
Quiero poder reviar el borrador de un cambio de poliza y comparar el cambio contra los valores previos
Para las polizas de auto personal en policy center

Scenario: Visualizar cambios realizados a una poliza pa
GivenStories: stories/policycenter/login_policy.story
Given tengo una poliza de PA con los siguientes datos:
| tipo_documento       | documento  | cuenta     | producto | tipoPoliza | placa  | modelo | codigo_fasecolda | ciudad_circulacion   | vehiculo_servicio | chasis | motor | valor_asegurado | descuento | recargo | zona | plan              | limite | deducible | abogado | PLlaves | PTH | PPH | GTH | PTD | PPD | GT |CRPT  |CRPP   | medioVenta | AS                |
| CEDULA DE CIUDADANIA | 1234567890 | C000888888 | Autos    | Individual | ASD324 | 2011   |                  | MEDELLIN (ANTIOQUIA) | Particular        | null   | null  | 17900000        | null      | null    | 2    | Plan Autos Global | 1.440. | 0         |         | Si      | 0   | 835 | 40  | 0   | 835 | 40 | 20   | 20    | Televentas | Asistencia Global |
When ingrese a modificar dicha cotizacion
And se ingrese a la opcion vehiculos
And cambie el plan del vehiculo <plan>
Then debe existir la comparacion entre datos de poliza existente y poliza nueva
Examples:
| plan               |
| Plan Autos Clásico |

Scenario: Visualizar cambios al modificar coberturas de vehiculo
Given tengo una poliza de PA con los siguientes datos:
| tipo_documento       | documento  | cuenta     | producto | tipoPoliza | placa  | modelo | codigo_fasecolda | ciudad_circulacion   | vehiculo_servicio | chasis | motor | valor_asegurado | descuento | recargo | zona | plan              | limite | deducible | abogado | PLlaves | PTH | PPH | GTH | PTD | PPD | GT |CRPT  |CRPP   | medioVenta | AS                |
| CEDULA DE CIUDADANIA | 1234567890 | C000888888 | Autos    | Individual | ABC190 | 2011   |                  | MEDELLIN (ANTIOQUIA) | Particular        | null   | null  | 17900000        | null      | null    | 2    | Plan Autos Global | 1.440. | 0         |         | Si      | 0   | 835 | 40  | 0   | 835 | 40 | 20   | 20    | Televentas | Asistencia Global |
When ingrese a modificar dicha cotizacion
And cambie una cobertura <cobertura>
Then debe existir la comparacion entre datos de poliza existente y poliza nueva
Examples:
| cobertura     |
| 2.040.000.000 |

Scenario: Visualizar cambios al modificar asegurados de vehiculo
Given tengo una poliza de PA con los siguientes datos:
| tipo_documento       | documento  | cuenta     | producto | tipoPoliza | placa  | modelo | codigo_fasecolda | ciudad_circulacion   | vehiculo_servicio | chasis | motor | valor_asegurado | descuento | recargo | zona | plan               | limite | deducible |abogado| AS               | medioVenta  |
| CEDULA DE CIUDADANIA | 1234567890 | C000888888 | Autos    | Individual | ABC192 | 2011   |                  | MEDELLIN (ANTIOQUIA) | Particular        | null   | null  | 17900000        | null      | null    | 2    | Plan Autos Clásico | 640.   | 0         |       |Asistencia Clásica| Televentas  |
When ingrese a modificar dicha cotizacion
And vaya a la opcion asegurados
And adicione un asegurado <tipoDocumento> <numeroDocumento>
Then debe existir la comparacion entre datos de poliza existente y poliza nueva
Examples:
| tipoDocumento        | numeroDocumento |
| CEDULA DE CIUDADANIA | 71318883        |

Scenario: Visualizar cambios al modificar un dato de la poliza
Given tengo una poliza de PA con los siguientes datos:
| tipo_documento       | documento  | cuenta     | producto | tipoPoliza | placa  | modelo | codigo_fasecolda | ciudad_circulacion   | vehiculo_servicio | chasis | motor | valor_asegurado | descuento | recargo | zona | plan               | limite | deducible |abogado| AS                | medioVenta  |
| CEDULA DE CIUDADANIA | 1234567890 | C000888888 | Autos    | Individual | ABC185 | 2011   |                  | MEDELLIN (ANTIOQUIA) | Particular        | null   | null  | 17900000        | null      | null    | 2    | Plan Autos Clásico | 640.   | 0         |       | Asistencia Clásica| Televentas  |
When ingrese a modificar dicha cotizacion
And ingrese a la opcion vehiculos
And cambie la ciudad de circulacion <ciudad>
Then debe existir la comparacion entre datos de poliza existente y poliza nueva
Examples:
| ciudad                     |
| BOGOTA, D.C. (BOGOTA D.C.) |

Scenario: Visualizar cambios en una poliza al modificar modificadores de vehiculo
Meta:
@manual
Given que tengo una poliza expedida
When modifique un modificador de vehiculo
Then debe existir la comparacion entre datos de la poliza existente con la poliza nueva

