Cancelacion Poliza Claims

Meta: @lote1
@issue #CDSEG-3842
@tag team: 3
@local
Sprint 9

Narrative:
Como usuario del policy center
quiero poder procesar la cancelación de una póliza de autos de manera manual.

Scenario: motivo cancelacion diferente a perdida total con perdida total en claims
Meta: @manual
Given que existe una <poliza> y esta dentro de la vigencia en claims y billing
When necesito iniciar la cancelacion
And ingrese el motivo de perdida total y en claims tenga dicho <motivo>
Then no debe permitir iniciar la cancelacion <mensaje>

Examples:
|poliza       |motivo                  |mensaje                              |
|TEST_34445571|Por petición del cliente|Debe cambiar el motivo de cancelación|

Scenario: motivo cancelacion perdida total diferente perdida total en claims
Meta: @manual
Given que existe una <poliza> y esta dentro de la vigencia en claims y billing
When necesito iniciar la cancelacion
And ingrese el motivo de perdida total y en claims tenga otro <motivo>
Then no debe permitir iniciar la cancelacion <mensaje>

Examples:
|poliza       |motivo           |mensaje                              |
|TEST_34445572|Por pérdida total|Debe cambiar el motivo de cancelación|

Scenario: motivo cancelacion motivo diferente a perdida total y diferente a perdida total
Meta: @manual
Given que existe una <poliza> y esta dentro de la vigencia en claims y billing
When necesito iniciar la cancelacion
And ingrese el motivo de perdida total y en claims tenga dicho <motivo>
And quiera iniciar la cancelacion
Then debe permitir iniciar la cancelacion

Examples:
|poliza       |motivo              |
|TEST_34445573|Por no pago|