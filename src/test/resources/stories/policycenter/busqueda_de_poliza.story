Meta:

Narrative:
Como usuario de PolicyCenter
Quiero ser capaz de buscar una poliza asociada a un contacto
Para ver el detalle de la misma

Scenario: Consultar polizas por número de poliza existente
GivenStories: stories/policycenter/login_policy.story
Given que existe una poliza
When la busco por numero de poliza <buscarNumeroPoliza>
Then se debe visualizar la siguiente información:
|numeroPoliza|nombreAsegurado|numeroCuenta|producto|estado|fechaVigencia|fechaExpiracion|agente|
|TEST_22222222|DORIAN EASTMOND PULGARIN|C001888888|Auto personal|Vigentes|04/18/2016|10/18/2016|NXCQZY-000028|

Examples:
|buscarNumeroPoliza
|TEST_22222222