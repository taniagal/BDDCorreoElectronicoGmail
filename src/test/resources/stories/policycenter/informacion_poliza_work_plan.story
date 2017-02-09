Meta:
@lote4
@issue #CDSEG-1021
@tag equipo: 5
@Sprint 12

Narrative:
Como usuario de policy center en el rol de agente,csr, asegurador o gerente
Quiero poder ver actividades asociados con una transaccion
Para poder completar actividades relacionadas con la misma

Scenario: scenario description
Given tengo una poliza de PA con los siguientes datos:
|tipo_documento      |documento |cuenta    |producto|tipoPoliza|placa |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis |motor|valor_asegurado|descuento|recargo|zona|plan              |limite|deducible|abogado|PLlaves|
|CEDULA DE CIUDADANIA|1234567890|C000888888|Autos   |Individual|ABB182|2011  |01601225        |MEDELLIN          |Particular       |kljh456|yui10|17900000       |null     |null   |2   |Plan Modular      |640.  |0        |Si     |Si     |
When ingrese a informacion de poliza



Then

Then system is in a different state