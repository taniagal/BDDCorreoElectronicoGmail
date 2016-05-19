Meta:

Narrative:
Como usuario de PolicyCenter
Quiero ser capaz de buscar una poliza asociada a un contacto
Para ver el detalle de la misma

Scenario: Consultar polizas por número de poliza existente
GivenStories: stories/policycenter/login_policy.story
Given que voy a buscar una poliza
When la busco por numero de poliza <buscarNumeroPoliza>
Then se debe visualizar la siguiente información:
|numeroPoliza|nombreAsegurado|numeroCuenta|producto|estado|fechaVigencia|fechaExpiracion|agente|
|TEST_22222222|DORIAN EASTMOND PULGARIN|C001888888|Auto personal|Vigentes|04/18/2016|10/18/2016|Careful Auditors|

Examples:
|buscarNumeroPoliza
|TEST_22222222


Scenario: Consultar polizas por número de poliza no existente
Given que voy a buscar una poliza
When la busco por numero de poliza <buscarNumeroPoliza>
Then debe mostrar el mensaje <mensaje>

Examples:
|buscarNumeroPoliza|mensaje
|34565456543|La búsqueda no devolvió resultados.

Scenario: Consultar polizas por número de cuenta existente
Given que voy a buscar una poliza
When la busco por numero de cuenta <numeroCuenta>
Then se debe visualizar la siguiente información:
|numeroPoliza|nombreAsegurado|numeroCuenta|producto|estado|fechaVigencia|fechaExpiracion|agente|
|TEST_22222222|DORIAN EASTMOND PULGARIN|C001888888|Auto personal|Vigentes|04/18/2016|10/18/2016|Careful Auditors|

Examples:
|numeroCuenta
|C001888888

Scenario: Consultar polizas por número de cuenta no existente
Given que voy a buscar una poliza
When la busco por numero de cuenta <numeroCuenta>
Then debe mostrar el mensaje <mensaje>

Examples:
|numeroCuenta|mensaje
|9988899988|La búsqueda no devolvió resultados.

Scenario: Consultar polizas solo por producto
Given que voy a buscar una poliza
When la busco por producto <producto>
Then debe mostrar el mensaje <mensaje>

Examples:
|producto|mensaje
|Auto Personal|Se debe especificar al menos número de póliza o número de cuenta

Scenario: Consultar polizas solo por agente
Given que voy a buscar una poliza
When la busco por agente <agente>
Then debe mostrar el mensaje <mensaje>

Examples:
|agente|mensaje
|Careful Auditors|Se debe especificar al menos número de póliza o número de cuenta

Scenario: Consultar polizas solo por código agente
Given que voy a buscar una poliza
When la busco por codigo de agente <codigoAgente>
Then debe mostrar el mensaje <mensaje>

Examples:
|codigoAgente|mensaje
|Standard Code|Se debe especificar al menos número de póliza o número de cuenta
