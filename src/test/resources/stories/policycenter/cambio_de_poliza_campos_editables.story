Meta:
@lote4
@tag equipo: 5
@local
@Sprint 14

Narrative:
Como usuario de policy center en el rol de agente, csr, asegurador o gerente
Quiero poder realizar cambios a la poliza
Para ver informacion relacionada con esta

Scenario: Modificar plan de vehiculos
GivenStories: stories/policycenter/login_policy.story
Given tengo una poliza de PA con los siguientes datos:
|tipo_documento      |documento |cuenta    |producto|tipoPoliza|placa |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis |motor|valor_asegurado|descuento|recargo|zona|plan              |limite|deducible|abogado|PLlaves|
|CEDULA DE CIUDADANIA|1234567890|C000888888|Autos   |Individual|ABB192|2011  |01601225        |MEDELLIN          |Particular       |kljh456|yui10|17900000       |null     |null   |2   |Plan Modular      |640.  |0        |Si     |Si     |
When ingrese a modificar dicha cotizacion
And se ingrese a la opcion vehiculos
And cambie el plan del vehiculo <plan>
And intente cotizar el cambio de poliza
Then expida el cambio de la poliza

Examples:
|plan              |
|Plan Autos Clásico|

Scenario: Cambio de plan basico a otro plan
Given tengo una poliza de PA con los siguientes datos:
|tipo_documento      |documento |cuenta    |producto|tipoPoliza|placa |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis |motor|valor_asegurado|descuento|recargo|zona|plan              |limite|deducible|abogado|PLlaves|
|CEDULA DE CIUDADANIA|1234567890|C000888888|Autos   |Individual|ABB190|2011  |01601225        |MEDELLIN          |Particular       |kljh456|yui10|17900000       |null     |null   |2   |Plan Autos Básico |640.  |0        |Si     |Si     |
When ingrese a modificar dicha cotizacion
And se ingrese a la opcion vehiculos
And cambie el plan del vehiculo <plan>
And intente cotizar el cambio de poliza
And expida el cambio de la poliza
And debe salir un mensaje de advertencia
|mensaje                                                                                                 |
|Existen requisitos opcionales pendientes, por favor dirijase a la pestaña Requisitos para tramitarlos.  |
And vaya a la opcion requisitos
Then debo ver un mensaje indicando requisitos pendientes
|mensaje          |
|ANDREA GARABITO  |
|CAROLINA OCHOA   |

Examples:
|plan              |
|Plan Modular      |


Scenario: Cambio de plan de autos modular a plan basico
Given tengo una poliza de PA con los siguientes datos:
|tipo_documento      |documento |cuenta    |producto|tipoPoliza|placa |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis |motor|valor_asegurado|descuento|recargo|zona|plan               |limite|deducible|abogado|PLlaves|
|CEDULA DE CIUDADANIA|1234567890|C000888888|Autos   |Individual|ABB190|2011  |01601225        |MEDELLIN          |Particular       |kljh456|yui10|17900000       |null     |null   |2   |Plan Modular       |640.  |0        |Si     |Si     |
When ingrese a modificar dicha cotizacion
And se ingrese a la opcion vehiculos
And cambie el plan del vehiculo <plan>
And intente cotizar el cambio de poliza
And expida el cambio de la poliza
And debe salir un mensaje de advertencia
|mensaje                                                                                                 |
|Existen requisitos opcionales pendientes, por favor dirijase a la pestaña Requisitos para tramitarlos.  |
And vaya a la opcion requisitos
Then debo ver un mensaje indicando requisitos pendientes
|mensaje          |
|ANDREA GARABITO  |
|CAROLINA OCHOA   |

Examples:
|plan             |
|Plan Autos Básico|

Scenario: Transporte de combustible
Given tengo una poliza de PA con los siguientes datos:
|tipo_documento      |documento |cuenta    |producto|tipoPoliza|placa |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis |motor|valor_asegurado|descuento|recargo|zona|plan               |limite|deducible|abogado|PLlaves|
|CEDULA DE CIUDADANIA|1234567890|C000888888|Autos   |Individual|ABB190|2011  |01601225        |MEDELLIN          |Particular       |kljh456|yui10|17900000       |null     |null   |2   |Plan Autos Clásico |640.  |0        |Si     |Si     |
When ingrese a modificar dicha cotizacion
And se ingrese a la opcion vehiculos
And seleccione la opcion transporte de combustible
And cambie el plan del vehiculo <plan>
And intente cotizar el cambio de poliza
And expida el cambio de la poliza
And debe salir un mensaje de advertencia
|mensaje                                                                                                 |
|Existen requisitos opcionales pendientes, por favor dirijase a la pestaña Requisitos para tramitarlos.  |
And vaya a la opcion requisitos


Examples:
|plan         |
|Autos Clasico|