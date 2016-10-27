Renovacion Deseo Financiacion Pa

Meta:

@issue #CDSEG-2309
@tag automator: diego_cardona_acevedo
@local
@Sprint 8

Narrative:
Como usuario de policy center  con el perfil  X
Quiero poder realizar la cotizacion de la renovacion de una poliza de personal autos ya sea de forma manual o automatica

Scenario: Validar numero de cuotas - informacion de poliza
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando la renovacion de la poliza <cotizacion>
When la poliza tiene intencion de financiacion
Then se debe mostrar el campo numero de cuotas, permitiendo seleccionar entre las opciones de 11 y 12
|cuota11|cuota12|
|11     |12     |

Examples:
|cotizacion|
|32112331  |

Scenario: Validar mensaje de advertencia de financiacion - informacion de poliza
Given estoy cotizando la renovacion de la poliza <cotizacion>
And la poliza tiene intencion de financiacion
When seleccione la opcion siguiente en la renovacion
Then se debe mostrar un mensaje como advertencia
|mensaje |
|La financiación de la póliza está sujeta a aprobación por parte del área de financiación.|

Examples:
|cotizacion|
|32112331  |

Scenario: Validar mensaje de advertencia de financiacion - cotizacion
Given estoy cotizando la renovacion de la poliza <cotizacion>
When realice la cotizacion de la renovacion con intencion de financiacion
Then se debe mostrar una advertencia en la cotizacion
|mensaje |
|La financiación de la póliza está sujeta a aprobación por parte del área de financiación.|

Examples:
|cotizacion|
|32112331  |

Scenario: Validar que se muestre valor y numero de cuotas en la cotizacion
Given estoy cotizando la renovacion de la poliza <cotizacion>
When la cotizacion de renovacion tenga intencion de financiacion
Then se debe mostrar en el detalle de la cotizacion el valor por cuota a pagar
y el numero de cotas indicadas en la informacion de la poliza
|valorCuota |numeroCuota|
|$101.620   |11         |

Examples:
|cotizacion|
|55556666  |

Scenario: Validar mensaje de advertencia de financiacion - expedicion
Given estoy cotizando la renovacion de la poliza <cotizacion>
When la cotizacion de renovacion tenga intencion de financiacion
And trate de expedir la poliza
Then se debe mostrar una advertencia en la cotizacion
|mensaje |
|La financiación de la póliza está sujeta a aprobación por parte del área de financiación.|

Examples:
|cotizacion|
|55556666  |