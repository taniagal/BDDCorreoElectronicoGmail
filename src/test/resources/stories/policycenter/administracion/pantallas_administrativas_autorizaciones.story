Meta:
@lote1
@issue #CDSEG-7098
@tag equipo: 5, sprint: 15


Narrative:
Como usuario de policy center en el rol de agente,csr, asegurador o gerente
Quiero tener las pantallas de administracion de autorizacion de UW issue,
Para conocer que oficinas, personas o grupos autorizan los UW issue.

Scenario: Informacion pantalla nueva autorizacion
GivenStories: stories/policycenter/login_policy.story
Given estoy en el menu de administracion
When vaya al menu de acciones
And vaya a crear una nueva autorizacion
And deben aparecer los siguientes campos:
| opciones          |
| Regla Validación  |
| Recibe / Persona  |
| Recibe / Grupo    |
| Grupo Autorizador |
| Oficina           |
| Asesor            |
| Activo            |
And cuando ingrese una nueva autorizacion con los datos:
| reglaValidacion                 | personaRecibe | grupoAutorizador    | oficina                     | asesor | activo |
| Bloqueo obligatorio de pregunta | pedrvevi      | APRENDIZ EL POBLADO | ASESORES EN DESARROLLO CALI | 4999   | Si     |
Then se debe ingresar correctamente el registro
Examples:
|  |
|  |

Scenario: Validar registros duplicados
Given estoy en el menu de administracion
When vaya al menu de acciones
And vaya a crear una nueva autorizacion
And cuando ingrese una nueva autorizacion con los datos:
| reglaValidacion                 | personaRecibe | grupoAutorizador    | oficina                     | asesor | activo |
| Bloqueo obligatorio de pregunta | pedrvevi      | APRENDIZ EL POBLADO | ASESORES EN DESARROLLO CALI | 4999   | Si     |
Then debe salir un mensaje indicando que el registro esta duplicado
| mensaje            |
| Registro duplicado |
Examples:
|  |
|  |

Scenario: Validar campos deshabilitados y campos habilitados
Given estoy en el menu de administracion
When vaya al menu de acciones
And vaya a crear una nueva autorizacion
And cuando ingrese una nueva autorizacion con los datos:
| reglaValidacion                                                         | personaRecibe | grupoAutorizador    | oficina                     | asesor | activo |
| A ser revisado por el asegurador 1, liberación de cotización de bloqueo | pedrvevi      | APRENDIZ EL POBLADO | ASESORES EN DESARROLLO CALI | 4999   | No     |
And vaya a modificar la informacion de la autorizacion
Then solo deben estar habilitados los campos activo e inactivo y se debe poder actualizar
Examples:
|  |
|  |

Scenario: Buscar una autorizacion por regla de validacion
Given estoy en el menu de administracion
When vaya al menu de acciones
And vaya a crear una nueva autorizacion
And cuando ingrese una nueva  autorizacion con los datos:
| reglaValidacion                                         | personaRecibe | grupoAutorizador    | oficina                     | asesor | activo |
| A ser revisado por el asegurador 2, bloqueo obligatorio | pedrvevi      | APRENDIZ EL POBLADO | ASESORES EN DESARROLLO CALI | 4999   | No     |
And vaya a buscar la autorizacion con regla de validacion <reglaValidacion>
Then se debe mostrar toda la informacion relacionada a la autorizacion
| informacion                                             |
| A ser revisado por el asegurador 2, bloqueo obligatorio |
| pedrvevi pedrvevi                                       |
| APRENDIZ EL POBLADO                                     |
| ASESORES EN DESARROLLO CALI                             |
| 4999                                                    |
| Si                                                      |
| ASESORES EN DESARROLLO CALI                             |

Examples:
| reglaValidacion                                         |
| A ser revisado por el asegurador 2, bloqueo obligatorio |
