Cancelacion Poliza Claims

Meta: @lote2
@issue #CDSEG-3842
@tag automator: Jonathan_Mejia_Leon
@local
Sprint 9

Narrative:
Como usuario del policy center
quiero poder procesar la cancelación de una póliza de autos de manera manual.

Scenario: motivo cancelacion perdida total con perdida total en claims
GivenStories: stories/policycenter/login_policy.story
Given que existe una <poliza> y esta dentro de la vigencia
When necesito iniciar la cancelacion
And ingrese el motivo de perdida total y en claims tenga dicho <motivo>
And quiera iniciar la cancelacion
Then debe permitir iniciar la cancelacion

Examples:
|poliza       |motivo           |
|TEST_34445570|Por pérdida total|

Scenario: motivo cancelacion diferente a perdida total con perdida total en claims
Given que existe una <poliza> y esta dentro de la vigencia
When necesito iniciar la cancelacion
And ingrese el motivo de perdida total y en claims tenga dicho <motivo>
Then no debe permitir iniciar la cancelacion <mensaje>

Examples:
|poliza       |motivo                  |mensaje                              |
|TEST_34445571|Por petición del cliente|Debe cambiar el motivo de cancelación|

Scenario: motivo cancelacion perdida total diferente perdida total en claims
Given que existe una <poliza> y esta dentro de la vigencia
When necesito iniciar la cancelacion
And ingrese el motivo de perdida total y en claims tenga otro <motivo>
Then no debe permitir iniciar la cancelacion <mensaje>

Examples:
|poliza       |motivo           |mensaje                              |
|TEST_34445572|Por pérdida total|Debe cambiar el motivo de cancelación|

Scenario: motivo cancelacion motivo diferente a perdida total y diferente a perdida total
Given que existe una <poliza> y esta dentro de la vigencia
When necesito iniciar la cancelacion
And ingrese el motivo de perdida total y en claims tenga dicho <motivo>
And quiera iniciar la cancelacion
Then debe permitir iniciar la cancelacion

Examples:
|poliza       |motivo              |
|TEST_34445573|Por no pago|