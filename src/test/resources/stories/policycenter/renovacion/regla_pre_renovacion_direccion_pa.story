Regla Pre Renovacion Direccion Pa

Meta:
@lote3
@issue #CDSEG-997
@tag equipo: 3
@local
Sprint 7

Narrative:
Como usuario de PolicyCenter
quiero poder registrar una instrucción previa a la renovación
con el fin de  que al momento en el que se inicie la renovación automática de la póliza se frene.

Scenario: registrar instruccion previa a la renovacion
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza:
|cuenta     |producto|tipoPoliza |
|C1060447895|Autos   |Individual |
When ingrese los datos del asegurado <tipo_documento> <documento>
And ingrese los datos del vehiculo:
|placa |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis|motor|valor_asegurado|descuento|recargo|zona|plan        |
|random|2016  |00601182        |MEDELLIN          |Particular       |null  |null |165900000      |null     |null   |2   |Plan Modular|
And ingrese las coberturas:
|limite|deducible|abogado|PLlaves|
|640.  |0        |Si     |Si     |
And expido la poliza y voy al archivo de poliza
And desee registrar una direccion de prerenovacion
Then se deben habilitar solo las opciones:
|Alta siniestralidad|
|Malas prácticas de asistencia|
|Negocio estatal|

Examples:
|tipo_documento      |documento |
|CEDULA DE CIUDADANIA|1060447895|