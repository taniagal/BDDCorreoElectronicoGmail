Meta:

Narrative:
Como Como usuario de policyCenter
Quiero poder solicitar una cotización
Asi ver los detalles de la cotización de una poliza de Autos por cada uno de los Riesgos (Vehiculos)

Scenario: Quote
GivenStories: stories/policycenter/login_policy.story
Given he realizado la cotizacion <cotizacion>
When ingrese al detalle de la cotizacion
Then se debe mostrar la informacion del detalle de cotizacion por riesgo

Examples:
|cotizacion |
|33334444   |

Scenario: Quote - Termino de la cobertura
Given he realizado la cotizacion <cotizacion>
When ingrese al detalle de la cotizacion
Then se debe mostrar en la columna "Termino" el limite o deducible de la cobertura en el caso de que aplique

Examples:
|cotizacion |
|33334444   |