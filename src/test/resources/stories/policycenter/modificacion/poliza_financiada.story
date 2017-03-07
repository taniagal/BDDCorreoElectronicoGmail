Meta:
@lote1
@sprint 15
@tag equipo: 5

Narrative:
Como usuario de Policy Center con rol de agente, CSR, autorizador o gerente,
Quiero poder reviar el borrador de un cambio de poliza y comparar el cambio contra los valores previos
Para las polizas de auto personal en policy center

Scenario: Modificacion de poliza no financiada a financiada
GivenStories: stories/policycenter/login_policy.story
Given tengo una poliza de PA con los siguientes datos:
|tipo_documento      |documento |cuenta    |producto|tipoPoliza|placa |modelo|codigo_fasecolda|ciudad_circulacion  |vehiculo_servicio|chasis |motor|valor_asegurado|descuento|recargo|zona|plan        |limite|deducible|abogado|PLlaves|medioVenta|
|CEDULA DE CIUDADANIA|1234567890|C000777776|Autos   |Individual|ABB119|2011  |01601225        |MEDELLIN (ANTIOQUIA)|Particular       |kljh456|yui10|17900000       |null     |null   |2   |Plan Modular|640.  |0        |Si     |Si     |Televentas|
When ingrese a modificar dicha cotizacion
And seleccione la opcion financiar poliza
And ingrese el numero de cuotas <numeroCuotas> a financiar
And cotice una poliza
Then se debe poder visualizar el valor de la cuota y el numero de cuotas a financiar
|informacionFinanciacion|
|11                     |
|$101.620,00 (COP)      |

Examples:
|numeroCuotas|
|11          |

Scenario: Validar numero de cuotas a financiar
Given tengo una poliza de PA con los siguientes datos:
|tipo_documento      |documento |cuenta    |producto|tipoPoliza|placa |modelo|codigo_fasecolda|ciudad_circulacion  |vehiculo_servicio|chasis |motor|valor_asegurado|descuento|recargo|zona|plan        |limite|deducible|abogado|PLlaves|medioVenta|
|CEDULA DE CIUDADANIA|1234567890|C000777776|Autos   |Individual|ABB124|2011  |01601225        |MEDELLIN (ANTIOQUIA)|Particular       |kljh456|yui10|17900000       |null     |null   |2   |Plan Modular|640.  |0        |Si     |Si     |Televentas|
When ingrese a modificar dicha cotizacion
And seleccione la opcion financiar poliza
Then deben aparecer el numero de cuotas por las cuales puedo financiar la poliza
|numeroCuotas|
|11          |
|12          |
Examples:
||
||

Scenario: Modificacion de poliza financiada a no financiada
Given tengo una poliza de autos financiada con los siguientes datos:
|tipo_documento      |documento |cuenta    |producto|tipoPoliza|placa |modelo|codigo_fasecolda|ciudad_circulacion  |vehiculo_servicio|chasis |motor|valor_asegurado|descuento|recargo|zona|plan        |limite|deducible|abogado|PLlaves|medioVenta|numeroCuotas|
|CEDULA DE CIUDADANIA|1234567890|C000777776|Autos   |Individual|ABL121|2011  |01601225        |MEDELLIN (ANTIOQUIA)|Particular       |kljh456|yui10|17900000       |null     |null   |2   |Plan Modular|640.  |0        |Si     |Si     |Televentas|12          |
When ingrese a modificar dicha cotizacion
And seleccione la opcion no financiar poliza
Then se debe ocultar el campo numero de cuotas

Examples:
|numeroCuotas|valorCuota|
|11          |100000    |
