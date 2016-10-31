Regla Pre Renovacion Direccion Pa

Meta: @lote2

@issue #CDSEG-997
@tag automator: Jonathan_Mejia_Leon
@local
Sprint 7

Narrative:
Como usuario de PolicyCenter
quiero poder registrar una instrucción previa a la renovación
con el fin de  que al momento en el que se inicie la renovación automática de la póliza se frene.

Scenario: registrar instruccion previa a la renovacion
GivenStories: stories/policycenter/login_policy.story
Given que existe una <poliza> y esta dentro de la vigencia
When desee registrar una direccion de prerenovacion
Then se deben habilitar solo las opciones:
|Alta siniestralidad|
|Malas prácticas de asistencia|
|Negocio estatal|

Examples:
|poliza       |
|TEST_22222239|