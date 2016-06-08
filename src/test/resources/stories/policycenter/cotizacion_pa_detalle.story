Meta:

Narrative:
Como Como usuario de policyCenter
Quiero poder solicitar una cotización
Asi ver los detalles de la cotización de una poliza de Autos por cada uno de los Riesgos (Vehiculos)

Scenario:
GivenStories: stories/policycenter/login_policy.story
Given he realizado la cotizacion <cotizacion>
When ingrese al detalle de la cotizacion
Then se debe mostrar la informacion del detalle de cotizacion por riesgo

Examples:
|numeroCuenta |
|C000777777   |