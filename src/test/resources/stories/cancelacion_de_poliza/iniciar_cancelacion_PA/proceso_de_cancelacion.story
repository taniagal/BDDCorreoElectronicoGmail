Procedo De Cancelacion

Meta:

@issue #USC-14750
@tag automator: Jonathan_Mejia_Leon
@local
Sprint 8

Narrative:
Como usuario de policyCenter
Quiero poder procesar la cancelación de una póliza  de autos de manera manual.

Scenario: Validar emision adelantada
GivenStories: stories/policycenter/login_policy.story
Given que existe una <poliza> y esta dentro de la vigencia
When necesito iniciar la cancelacion
And se ingrese la fecha con emision anticipada mayor a la politica
And se empiece la cancelacion
Then se debe mostrar un <mensaje> de advertencia en el formulario
And debe permitir realizar la cancelacion
And debe generar la autorizacion

Examples:
|poliza       |mensaje                                          |
|TEST_22221241|Esta oferta necesita de aprobación del asegurador|

