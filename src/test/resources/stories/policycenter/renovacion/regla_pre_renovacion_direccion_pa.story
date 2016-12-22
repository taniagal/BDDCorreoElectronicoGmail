Regla Pre Renovacion Direccion Pa

Meta:
@lote3
@issue #CDSEG-997
@tag automator: juan_carlos_restrepo
@local
Sprint 7

Narrative:
Como usuario de PolicyCenter
quiero poder registrar una instrucción previa a la renovación
con el fin de  que al momento en el que se inicie la renovación automática de la póliza se frene.

Scenario: registrar instruccion previa a la renovacion
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza basado en otro envio <envio>
When ingrese los datos de la cotizacion PA
|ciudad_circulacion|limite|deducible|abogado |PLlaves |modelo|
|MEDELLIN          |1.440 |0        |Opción 1|Opción 1|2016  |
And cotice una poliza
And expido la poliza y voy al archivo de poliza
And desee registrar una direccion de prerenovacion
Then se deben habilitar solo las opciones:
|Alta siniestralidad|
|Malas prácticas de asistencia|
|Negocio estatal|

Examples:
|envio   |
|22228589|