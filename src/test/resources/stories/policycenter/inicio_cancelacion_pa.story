Regla Pre Renovacion Direccion Pa

Meta:

@issue #USC-14730
@tag automator: Jonathan_Mejia_Leon
@local
Sprint 8

Narrative:
Como usuario de PolicyCenter
Cuando quiera iniciar una cancelación para pólizas de Autos
Entonces deberia realizarce segun las reglas


Scenario: Validacion emision adelantada en cancelacion de poliza
GivenStories: stories/policycenter/login_policy.story
Given que existe una <poliza> y esta dentro de la vigencia
When necesito iniciar la cancelacion
Then Se debe validar en la lista cuando la poliza NO es de bancolombia:
|Financiación cancelación por muerte|
|Financiación cancelación por no pago|
|Financiación cancelación por petición cliente|
|Por error de trámite|
|Por no pago|
|Por no renovada|
|por orden de la compañía|
|Por pérdida total|
|por petición del cliente|

Examples:
|poliza       |
|TEST_22266674|

