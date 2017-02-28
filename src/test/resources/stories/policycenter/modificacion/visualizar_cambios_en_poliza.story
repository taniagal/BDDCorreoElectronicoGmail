Meta:
@lote3
@sprint 13
@tag equipo: 5

Narrative:
Como usuario de Policy Center con rol de agente, CSR, autorizador o gerente,
Quiero poder reviar el borrador de un cambio de poliza y comparar el cambio contra los valores previos
Para las polizas de auto personal en policy center

Scenario: Visualizar cambios realizados a una poliza pa
GivenStories: stories/policycenter/login_policy.story
Given tengo una poliza de PA con los siguientes datos:
|tipo_documento      |documento |cuenta    |producto|tipoPoliza|placa |modelo|codigo_fasecolda|ciudad_circulacion  |vehiculo_servicio|chasis |motor|valor_asegurado|descuento|recargo|zona|plan        |limite|deducible|abogado|PLlaves|medioVenta|
|CEDULA DE CIUDADANIA|1234567890|C000888888|Autos   |Individual|ASD322|2011  |01601225        |MEDELLIN (ANTIOQUIA)|Particular       |kljh456|yui10|17900000       |null     |null   |2   |Plan Modular|640.  |0        |Si     |Si     |Televentas|
When ingrese a modificar dicha cotizacion
And se ingrese a la opcion vehiculos
And cuando cambie la placa <placa>
Then debe existir la comparacion entre datos de poliza existente y poliza nueva
Examples:
|placa  |
|ADCF434|

Scenario: Visualizar cambios al modificar coberturas de vehiculo
Given tengo una poliza de PA con los siguientes datos:
|tipo_documento      |documento |cuenta    |producto|tipoPoliza|placa |modelo|codigo_fasecolda|ciudad_circulacion   |vehiculo_servicio|chasis |motor|valor_asegurado|descuento|recargo|zona|plan        |limite|deducible|abogado|PLlaves|medioVenta|
|CEDULA DE CIUDADANIA|1234567890|C000888888|Autos   |Individual|ABC197|2011  |01601225        |MEDELLIN (ANTIOQUIA) |Particular       |kljh456|yui10|17900000       |null     |null   |2   |Plan Modular|640.  |0        |Si     |Si     |Televentas|
When ingrese a modificar dicha cotizacion
And cambie una cobertura <cobertura>
Then debe existir la comparacion entre datos de poliza existente y poliza nueva
Examples:
|cobertura      |
|1.640.000.000  |

Scenario: Visualizar cambios al modificar asegurados de vehiculo
Given tengo una poliza de PA con los siguientes datos:
|tipo_documento      |documento |cuenta    |producto|tipoPoliza|placa |modelo|codigo_fasecolda|ciudad_circulacion  |vehiculo_servicio|chasis |motor|valor_asegurado|descuento|recargo|zona|plan        |limite|deducible|abogado|PLlaves|medioVenta|
|CEDULA DE CIUDADANIA|1234567890|C000888888|Autos   |Individual|ABC190|2011  |01601225        |MEDELLIN (ANTIOQUIA)|Particular       |kljh456|yui10|17900000       |null     |null   |2   |Plan Modular|640.  |0        |Si     |Si     |Televentas|
When ingrese a modificar dicha cotizacion
And vaya a la opcion asegurados
And adicione un asegurado <tipoDocumento> <numeroDocumento>
Then debe existir la comparacion entre datos de poliza existente y poliza nueva
Examples:
|tipoDocumento       |numeroDocumento|
|CEDULA DE CIUDADANIA|71318883       |

Scenario: Visualizar cambios al modificar un dato de la poliza
Given tengo una poliza de PA con los siguientes datos:
|tipo_documento      |documento |cuenta    |producto|tipoPoliza|placa |modelo|codigo_fasecolda|ciudad_circulacion  |vehiculo_servicio|chasis |motor|valor_asegurado|descuento|recargo|zona|plan        |limite|deducible|abogado|PLlaves|medioVentas|
|CEDULA DE CIUDADANIA|1234567890|C000888888|Autos   |Individual|ABC191|2011  |01601225        |MEDELLIN (ANTIOQUIA)|Particular       |kljh456|yui10|17900000       |null     |null   |2   |Plan Modular|640.  |0        |Si     |Si     |Televentas|
When ingrese a modificar dicha cotizacion
And ingrese a la opcion vehiculos
And cambie la ciudad de circulacion <ciudad>
Then debe existir la comparacion entre datos de poliza existente y poliza nueva
Examples:
|ciudad                    |
|BOGOTA, D.C. (BOGOTA D.C.)|

Scenario: Visualizar cambios en una poliza al modificar modificadores de vehiculo
Meta:
@manual
Given que tengo una poliza expedida
When modifique un modificador de vehiculo
Then debe existir la comparacion entre datos de la poliza existente con la poliza nueva

