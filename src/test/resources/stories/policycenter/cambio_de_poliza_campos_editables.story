Meta:
@lote4
@tag equipo: 5
@local
@Sprint 14

Narrative:
Como usuario de policy center en el rol de agente, csr, asegurador o gerente
Quiero poder realizar cambios a la poliza
Para ver informacion relacionada con esta

Scenario: Cambio de plan basico a otro plan
GivenStories: stories/policycenter/login_policy.story
Given tengo una poliza de PA con los siguientes datos:
|tipo_documento      |documento |cuenta    |producto|tipoPoliza|placa |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis |motor|valor_asegurado|descuento|recargo|zona|plan                   |limite|deducible|
|CEDULA DE CIUDADANIA|1234567890|C000888888|Autos   |Individual|ABB172|2011  |01601225        |MEDELLIN          |Particular       |kljh456|yui10|17900000       |null     |null   |2   |Plan Modular           |640.  |0        |
When ingrese a modificar dicha cotizacion
And se ingrese a la opcion vehiculos
And cambie el plan del vehiculo <plan> clasico
And cotice el cambio de poliza
And cuando edite la transacion de la poliza
And cambie el plan del vehiculo <planBasico>
And adicione un valor asegurado superior al permitido <valor>
And seleccione la opcion siguiente en modificacion
Then debe salir el mensaje de autorizacion por valor superior al permitido
|mensaje                                                                        |
|El valor asegurado del vehículo ($301.000.000,00) supera el límite máximo permitido por políticas. El aseguramiento de este carro así como la oferta presentada al cliente, deben ser avalados previamente por el Comité de Riesgo No Estándar Autos|

Examples:
|plan                  |valor       |
|Plan Autos Clásico    |301000000,00|


Scenario: Cambio de plan de autos modular a plan basico
Given tengo una poliza de PA con los siguientes datos:
|tipo_documento      |documento |cuenta    |producto|tipoPoliza|placa |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis |motor|valor_asegurado|descuento|recargo|zona|plan               |limite|deducible|abogado|PLlaves|
|CEDULA DE CIUDADANIA|1234567890|C000888888|Autos   |Individual|ABB196|2011  |01601225        |MEDELLIN          |Particular       |kljh456|yui10|17900000       |null     |null   |2   |Plan Modular       |640.  |0        |Si     |Si     |
When ingrese a modificar dicha cotizacion
And se ingrese a la opcion vehiculos
And cambie el plan del vehiculo <plan>
And adicione un valor asegurado superior al permitido <valor>
And seleccione la opcion siguiente en modificacion
And intente cotizar el cambio de poliza
Then expida el cambio de la poliza


Examples:
|plan             |valor       |
|Plan Autos Básico|301000000,00|

Scenario: Validar requisitos en cambio de plan basico a otro plan
Meta: @manual
Given estoy realizando la modificacion de una poliza
When cambie el plan de basico a modular
And el vehiculo requiera inspeccion
And expida el cambio de esa poliza
And se debe generar un mensaje opcional
And vaya a la ventana de requisitos
Then debe de estar los nombres de los usuarios que requieren requisitos

