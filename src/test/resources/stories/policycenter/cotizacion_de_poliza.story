Cotizacion De Poliza

Meta: @lote2

@issue #CDSEG-843
@tag automator: diego_cardona_acevedo
@local
@Sprint 3

Narrative:
Como usuario de Policy Center
debo poder realizar una cotizacion
para comenzar un proceso de expedicion con un cliente en caso de ser posible

Scenario: Informacion general de cotizacion
GivenStories: stories/policycenter/login_policy.story

Given he realizado la cotizacion <cotizacion>
When ingrese a la cotizacion
And se haya definido la cotizacion con intencion de financiacion
Then se debe mostrar un mensaje <mensaje> como advertencia

Examples:
|cotizacion |mensaje|
|777111777  |La financiación de la póliza está sujeta a aprobación por parte del área de financiación|

Scenario: Poliza con intencion de financiacion - Mostrar cuotas y valor
Given he realizado la cotizacion <cotizacion>
When la cotizacion tenga intencion de financiacion
Then se debe mostrar en el detalle de la cotizacion el Valor por cuota a pagar <valorCuota> y
el numero de cotas <numeroCuotas> indicadas en la informacion de la poliza

Examples:
|cotizacion |valorCuota   |numeroCuotas |
|777222777  |$101.620,00  |11           |


Scenario: Riesgos consultables - Tipo Causal Tecnica
Meta: @lote3
@manual
Given  he realizado la cotizacion
When  ingrese a la cotizacion
And  el tipo de causal es TECNICA, el tipo de riesgo CHASIS, MOTOR Y/O PLACA
Then  no se debe permitir continuar con la cotizacion y mostrar un mensaje

Scenario: Riesgos consultables - Tipo Causal Moral
Meta: @lote3
@manual
Given  he realizado la cotizacion
When  ingrese a la cotizacion
And  el tipo de causal es MORAL, el tipo de riesgo CHASIS, MOTOR Y/O PLACA
Then  no se debe permitir continuar con la cotizacion y mostrar un mensaje
