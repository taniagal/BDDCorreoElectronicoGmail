Cotizacion PA Detalle

Meta:

Narrative:
Como usuario de policyCenter
Quiero poder solicitar una cotizacion
Asi ver los detalles de la cotizacion de una poliza de Autos por cada uno de los Riesgos (Vehiculos)

@Issue SUGWUSC-15119 Quote PA Detalle

Scenario: Quote
GivenStories: stories/policycenter/login_policy.story
Given he realizado la cotizacion <cotizacion>
When ingrese al detalle de la cotizacion
Then se debe mostrar la informacion del detalle de cotizacion por riesgo

Examples:
|cotizacion |
|33334444 |

Scenario: Quote - Termino de la cobertura
Meta:
@Manual
Given he realizado la cotizacion <cotizacion>
When ingrese al detalle de la cotizacion
Then se debe mostrar en la columna "Termino" el limite o deducible de la cobertura en el caso de que aplique

Examples:
|cotizacion |
|33334444   |

Scenario: Quote - Termino de la cobertura - Limite
Meta:
@Manual
Given he realizado la cotizacion <cotizacion>
When ingrese al detalle de la cotizacion
Then se debe mostrar en la columna "Termino" el limite de la cobertura en el caso de que aplique

Examples:
|cotizacion |
|33334444   |

Scenario: Quote - Termino de la cobertura - Deducible
Meta:
@Manual
Given he realizado la cotizacion <cotizacion>
When ingrese al detalle de la cotizacion
Then se debe mostrar en la columna "Termino" el deducible de la cobertura en el caso de que aplique

Examples:
|cotizacion |
|33334444   |