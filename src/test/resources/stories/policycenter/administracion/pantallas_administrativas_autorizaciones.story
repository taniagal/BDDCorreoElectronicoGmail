Meta:
@lote1
@issue #CDSEG-7098
@tag equipo: 5, sprint: 15

Narrative:
Como usuario de policy center en el rol de agente,csr, asegurador o gerente
Quiero tener las pantallas de administracion de autorizacion de UW issue,
Para conocer que oficinas, personas o grupos autorizan los UW issue.

Scenario: Buscar una autorizacion por regla de validacion
GivenStories: stories/policycenter/login_policy.story
Given estoy en el menu de administracion
When vaya al menu de acciones
And vaya a crear una nueva autorizacion
And cuando ingrese una nueva  autorizacion con los datos:
| reglaValidacion                                         | grupoRecibe               | grupoAutorizador    | oficina                     | asesor | activo | canalcomercial |
| A ser revisado por el asegurador 2, bloqueo obligatorio | OPERACIONES SUCURSAL TUYA | APRENDIZ EL POBLADO | ASESORES EN DESARROLLO CALI | 4999   | No     | CC020          |
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


Scenario: Informacion pantalla nueva autorizacion y edicion
Given estoy en el menu de administracion
When vaya al menu de acciones
And vaya a crear una nueva autorizacion
And deben aparecer los siguientes campos:
| opciones          |
| Segmentación      |
| Comportamiento    |
| Regla Validación  |
| Recibe / Grupo    |
| Grupo Autorizador |
| Oficina           |
| Asesor            |
| Canal comercial   |
| Colectiva         |
| Activo            |
And cuando ingrese una nueva autorizacion con los datos:
| reglaValidacion                 | grupoRecibe               | grupoAutorizador    | oficina                     | asesor | activo | canalcomercial |
| Bloqueo obligatorio de pregunta | OPERACIONES SUCURSAL TUYA | APRENDIZ EL POBLADO | ASESORES EN DESARROLLO CALI | 4999   | Si     | CC020          |
Then se debe ingresar correctamente el registro
And vaya a modificar la informacion de la autorizacion
Then solo deben estar habilitados los campos activo e inactivo y se debe poder actualizar
Examples:
|  |
|  |

Scenario: Validar registros duplicados
Given estoy en el menu de administracion
When vaya al menu de acciones
And vaya a crear una nueva autorizacion
And cuando ingrese una nueva autorizacion con los datos:
| reglaValidacion                 | grupoRecibe               | grupoAutorizador    | oficina                     | asesor | activo | canalcomercial |
| Bloqueo obligatorio de pregunta | OPERACIONES SUCURSAL TUYA | APRENDIZ EL POBLADO | ASESORES EN DESARROLLO CALI | 4999   | Si     | CC020          |
Then debe salir un mensaje indicando que el registro esta duplicado
| mensaje            |
| Registro duplicado |
Examples:
|  |
|  |

