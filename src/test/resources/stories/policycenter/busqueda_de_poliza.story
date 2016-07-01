Meta:

Narrative:
Como usuario de PolicyCenter
Quiero ser capaz de buscar una poliza asociada a un contacto
Para ver el detalle de la misma




Scenario: Consultar polizas por número de poliza no existente
GivenStories: stories/policycenter/login_policy.story
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
|TEST_22222222|DORIAN EASTMOND PULGARIN|C001888888|Auto personal|Vigentes|04/18/2016|10/18/2016|SURA|

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
|Auto Personal|Se debe ingresar un nombre, un apellido, un nombre de empresa, un ID oficial, un número de cuenta, un número de póliza, un número de teléfono, un agente o un código de agente. Además, si realiza una búsqueda solo por nombre y apellido, se debe especificar una coincidencia exacta. De lo contrario, debe especificar más información (como ciudad y estado o código postal). Si realiza una búsqueda inexacta, debe ingresar al menos tres letras del nombre y del apellido o cinco letras del nombre de empresa.

Scenario: Consultar polizas solo por agente
Given que voy a buscar una poliza
When la busco por agente <agente>
Then debe mostrar el mensaje <mensaje>

Examples:
|agente|mensaje
|SURA|Se debe ingresar un nombre, un apellido, un nombre de empresa, un ID oficial, un número de cuenta, un número de póliza, un número de teléfono, un agente o un código de agente. Además, si realiza una búsqueda solo por nombre y apellido, se debe especificar una coincidencia exacta. De lo contrario, debe especificar más información (como ciudad y estado o código postal). Si realiza una búsqueda inexacta, debe ingresar al menos tres letras del nombre y del apellido o cinco letras del nombre de empresa.

Scenario: Consultar polizas solo por código agente
Given que voy a buscar una poliza
When la busco por codigo de agente <codigoAgente>
Then debe mostrar el mensaje <mensaje>

Examples:
|codigoAgente|mensaje
|Standard Code|Código de agente : Se encuentra más de un Producer Code con el código "Standard Code." Use el emergenteProducer Code para elegir el Producer Code.

Scenario: Consultar polizas por numero de cuenta y producto
Given que voy a buscar una poliza
When la busco por numero de cuenta <numeroCuenta> y producto <producto>
Then se debe visualizar la siguiente información:
|numeroPoliza|nombreAsegurado|numeroCuenta|producto|estado|fechaVigencia|fechaExpiracion|agente|
|TEST_22222222|DORIAN EASTMOND PULGARIN|C001888888|Auto personal|Vigentes|04/18/2016|10/18/2016|SURA|

Examples:
|numeroCuenta|producto
|C001888888|Auto personal

Scenario: Consultar polizas por numero de cuenta y agente
Given que voy a buscar una poliza
When la busco por numero de cuenta <numeroCuenta> y agente <agente>
Then se debe visualizar la siguiente información:
|numeroPoliza|nombreAsegurado|numeroCuenta|producto|estado|fechaVigencia|fechaExpiracion|agente|
|TEST_22222222|DORIAN EASTMOND PULGARIN|C001888888|Auto personal|Vigentes|04/18/2016|10/18/2016|SURA|

Examples:
|numeroCuenta|agente
|C001888888|SURA

Scenario: Consultar polizas por numero de cuenta  y codigo de agente
Given que voy a buscar una poliza
When la busco por numero de cuenta <numeroCuenta> y codigo de agente <codigoAgente>
Then se debe visualizar la siguiente información:
|numeroPoliza|nombreAsegurado|numeroCuenta|producto|estado|fechaVigencia|fechaExpiracion|agente|
|TEST_22222222|DORIAN EASTMOND PULGARIN|C001888888|Auto personal|Vigentes|04/18/2016|10/18/2016|SURA|

Examples:
|numeroCuenta|codigoAgente
|C001888888|Standard Code

Scenario: Consultar polizas por numero de cuenta, producto y codigo de agente
Given que voy a buscar una poliza
When la busco por numero de cuenta <numeroCuenta>, producto <producto> y codigo de agente <codigoAgente>
Then se debe visualizar la siguiente información:
|numeroPoliza|nombreAsegurado|numeroCuenta|producto|estado|fechaVigencia|fechaExpiracion|agente|
|TEST_22222222|DORIAN EASTMOND PULGARIN|C001888888|Auto personal|Vigentes|04/18/2016|10/18/2016|SURA|

Examples:
|numeroCuenta|producto|codigoAgente
|C001888888|Auto personal|Standard Code

Scenario: Consultar polizas por numero de cuenta que no existe, producto y codigo de agente
Given que voy a buscar una poliza
When la busco por numero de cuenta <numeroCuenta>, producto <producto> y codigo de agente <codigoAgente>
Then debe mostrar el mensaje <mensaje>

Examples:
|numeroCuenta|producto|codigoAgente|mensaje
|C001887545|Auto personal|Standard Code|Código de agente : Se encuentra más de un Producer Code con el código "Standard Code." Use el emergenteProducer Code para elegir el Producer Code.


Scenario: Consultar polizas por numero de cuenta que no existe y producto
Given que voy a buscar una poliza
When la busco por numero de cuenta <numeroCuenta> y producto <producto>
Then debe mostrar el mensaje <mensaje>

Examples:
|numeroCuenta|producto|mensaje
|C001887456|Auto personal|La búsqueda no devolvió resultados.

Scenario: Consultar polizas por numero de cuenta que no existe y agente
Given que voy a buscar una poliza
When la busco por numero de cuenta <numeroCuenta> y agente <agente>
Then debe mostrar el mensaje <mensaje>

Examples:
|numeroCuenta|agente|mensaje
|C001887456|SURA|La búsqueda no devolvió resultados.

Scenario: Consultar polizas por numero de cuenta  y codigo de agente no relacionado a la poliza
Given que voy a buscar una poliza
When la busco por numero de cuenta <numeroCuenta> y codigo de agente <codigoAgente>
Then debe mostrar el mensaje <mensaje>

Examples:
|numeroCuenta|codigoAgente|mensaje
|C001888888|portal|La búsqueda no devolvió resultados.