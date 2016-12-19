Renovacion Deseo Financiacion Pa

Meta:
@lote4
@issue #CDSEG-2309
@tag automator: diego_cardona_acevedo
@local
@Sprint 8

Narrative:
Como usuario de policy center  con el perfil  X
Quiero poder realizar la cotizacion de la renovacion de una poliza de personal autos ya sea de forma manual o automatica

Scenario: Validar numero de cuotas - informacion de poliza
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza basado en otro envio <envio>
When ingrese los datos de la cotizacion con intencion de financiacion:
|ciudad_circulacion|limite|deducible|abogado |PLlaves |modelo|
|MEDELLIN          |1.440 |0        |Opción 1|Opción 1|2016  |
And cotice una poliza
And expido la poliza y voy al archivo de poliza
And comienzo una nueva renovacion
Then se debe mostrar el campo numero de cuotas, permitiendo seleccionar entre las opciones de 11 y 12
|cuota11|cuota12|
|11     |12     |

Examples:
|envio   |
|22228589|


Scenario: Validar mensaje de advertencia de financiacion - informacion de poliza
Given estoy cotizando la renovacion de la poliza
When seleccione la opcion siguiente en la renovacion
Then se debe mostrar un mensaje como advertencia
|mensaje                                                                                  |
|La financiación de la póliza está sujeta a aprobación por parte del área de financiación.|

Examples:
||
||


Scenario: Validar mensaje de advertencia de financiacion - cotizacion
Given estoy cotizando la renovacion de la poliza
When realice la cotizacion de la renovacion con intencion de financiacion
Then se debe mostrar una advertencia en la cotizacion
|mensaje |
|La financiación de la póliza está sujeta a aprobación por parte del área de financiación.|

Examples:
||
||


Scenario: Validar que se muestre valor, numero de cuotas en la cotizacion y mensaje de advertencia de financiacion - expedicion
Given estoy cotizando la renovacion de la poliza
When cotice una poliza
Then se debe mostrar en el detalle de la cotizacion el valor por cuota a pagar
y el numero de cotas indicadas en la informacion de la poliza
|valorCuota |numeroCuota|
|$184.622   |12         |
And trate de expedir la poliza
And se debe mostrar una advertencia en la cotizacion
|mensaje |
|La financiación de la póliza está sujeta a aprobación por parte del área de financiación.|

Examples:
||
||