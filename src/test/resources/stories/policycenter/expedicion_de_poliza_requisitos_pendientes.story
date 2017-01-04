Expedicion De Poliza Requisitos Pendientes

Meta:
@lote3
@issue #CDSEG-4316
@tag automator: tania_grajales_alzate
@local
@Sprint 12

Narrative:
Como usuario de policy center
Se requiere  expedir una poliza si los requisitos pendientes obligatorios se encuentran recibidos o adjuntos,
en el caso de que no se encuentren adjuntos o recibidos el sistema debe mostrar un mensaje de errror,
y no debe dejar expedir la poliza hasta que estos no esten adjuntos, en caso de que los requisitos no sean obligatorios,
debe sacar un mensaje de alerta y debe permitir expedir la poliza

Scenario:Maximo valor de accesorios
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza de mrc con documento:
|organizacion|producto               |canal            |tipoPoliza |tipo_documento      |documento |fecha_nacimiento|primer_nombre|primer_apellido|tipo_direccion         |direccion       |departamento|ciudad  |agente|
|Sura        |Autos                  |Canal Tradicional|Individual |CEDULA DE CIUDADANIA|1030765432|10/10/1973     |LUCIANA      |LONDOÑO        |DIRECCION DE RESIDENCIA|CALLE 65F #60-69|Antioquia   |Medellin|INT-3 |
And ingrese los datos del asegurado <tipo_documento> <documento>
And ingrese los datos del vehiculo:
|placa   |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis |motor|valor_asegurado|descuento|recargo|zona|plan        |
|ASDF2   |2011  |01601225        |MEDELLIN          |Particular       |kljh456|yui10|17900000       |null     |null   |2   |Plan Modular|
And ingrese un valor maximo para los accesorios <accesorios>
And seleccione algunas coberturas:
|limite|deducible|abogado |PTH|PPH|PPHF|GTH|AC|AS                |PTD|PPD|PPDF|GT|PP|PT|GTR     |GP      |PLlaves |
|1.440 |0        |Opción 1|10 |910|1.50|40.|35|Asistencia Clásica|10 |0  |1.50|40|16|20|Opción 1|Opción 1|Opción 1|
When voy a expedir una poliza
And confirmo el mensaje de expedir poliza
And debo ver un mensaje bloqueante
|mensaje|
|Existen requisitos obligatorios pendientes por adjuntar, por favor verifique|
And cuando edite la transacion de la poliza
And ingrese a la opcion vehiculos
And seleccione la opcion importado por terceros
And voy a expedir una poliza
And confirmo el mensaje de expedir poliza
And debo ver un mensaje bloqueante
|mensaje|
|Existen requisitos obligatorios pendientes por adjuntar, por favor verifique|
And cuando edite la transacion de la poliza
And ingrese a la opcion vehiculos
And ingrese un beneficiario oneroso
And voy a expedir una poliza
And confirmo el mensaje de expedir poliza
And debo ver un mensaje bloqueante
|mensaje|
|Existen requisitos obligatorios pendientes por adjuntar, por favor verifique|
And cuando edite la transacion de la poliza

Examples:
|accesorios|tipo_documento      |documento |
|2600000,00|CEDULA DE CIUDADANIA|1234567890|

Scenario:Vehiculo Requiere Inspeccion
Given que voy a buscar la cuenta <numCuenta>
And estoy expidiendo una poliza de autos
And seleccione el producto para expedir la poliza
And quiera agregar un asegurado
And vaya a la opcion agregar
And seleccione ingresar nueva persona natural
And ingrese los datos de persona natural:
| tipoId               | numeroId   | primerNombre | primerApellido | pais     | departamento | ciudad   | direccion       | tipoDireccion                  |
| CEDULA DE CIUDADANIA | 1030678906 | LUCIANA      | LONDOÑO        | Colombia | Antioquia    | Medellin | Cra 65 # 48-162 | DIRECCION DE OFICINA PRINCIPAL |
And vaya a agregar el vehiculo con los siguientes datos:
|placa |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis |motor|valor_asegurado|descuento|recargo|zona|plan        |
|randomw|2011  |01601225        |MEDELLIN          |Particular       |kljh456|yui10|17900000       |null     |null   |2   |Plan Modular|
And seleccione algunas coberturas:
|limite|deducible|abogado |PTH|PPH|PPHF|GTH|AC|AS                |PTD|PPD|PPDF|GT|PP|PT|GTR     |GP      |PLlaves |
|1.440 |0        |Opción 1|10 |910|1.50|40.|35|Asistencia Clásica|10 |0  |1.50|40|16|20|Opción 1|Opción 1|Opción 1|
When voy a expedir una poliza
And confirmo el mensaje de expedir poliza
Then debo ver un mensaje bloqueante
|mensaje|
|Existen requisitos pendientes opcionales por adjuntar, por favor verifique|

Examples:
|numCuenta |accesorios|
|C000888888|2600000,00|




Examples:
|numCuenta |
|C000888888|

Scenario:Vehiculo cero kilometros
Given que voy a buscar la cuenta <numCuenta>
And estoy expidiendo una poliza de autos
And seleccione el producto para expedir la poliza
And quiera agregar un asegurado
And vaya a la opcion agregar
And seleccione ingresar nueva persona natural
And ingrese los datos de persona natural:
| tipoId               | numeroId   | primerNombre | primerApellido | pais     | departamento | ciudad   | direccion       | tipoDireccion                  |
| CEDULA DE CIUDADANIA | 1130678909 | LUCIANA      | LONDOÑO        | Colombia | Antioquia    | Medellin | Cra 65 # 48-162 | DIRECCION DE OFICINA PRINCIPAL |
And vaya a agregar el vehiculo con los siguientes datos:
|placa  |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis |motor|valor_asegurado|descuento|recargo|zona|plan        |
|randomh|2016  |01601225        |MEDELLIN          |Particular       |kljh456|yui10|17900000       |null     |null   |2   |Plan Modular|
And de click en cero kilometros
And seleccione algunas coberturas:
|limite|deducible|abogado |PTH|PPH|PPHF|GTH|AC|AS                |PTD|PPD|PPDF|GT|PP|PT|GTR     |GP      |PLlaves |
|1.440 |0        |Opción 1|10 |910|1.50|40.|35|Asistencia Clásica|10 |0  |1.50|40|16|20|Opción 1|Opción 1|Opción 1|
When voy a expedir una poliza
And confirmo el mensaje de expedir poliza
Then debo ver un mensaje bloqueante
|mensaje|
|Existen requisitos pendientes opcionales, por favor verifique|

Examples:
|numCuenta |
|C000888888|

Scenario:Vehiculo con usuarios que requieren sarlaft
Given voy a crear una nueva cotizacion
And crear una cotizacion nueva con la cuenta <cuenta>
And seleccione el agente <agente>
When seleccione el producto <producto> para expedir la poliza
And ingrese la organizacion, canal y tipo de poliza
And ingrese los datos del asegurado <tipo_documento> <documento>
And ingrese los datos del vehiculo:
|placa |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis|motor|valor_asegurado|descuento|recargo|zona|plan        |
|ASDF2 |2016  |01601265        |MEDELLIN          |Particular       |null  |null |165900000      |null     |null   |2   |Plan Modular|
And ingrese las coberturas basicas:
|limite|deducible|abogado |PLlaves |
|1.440 |0        |Opción 1|Opción 1|
And intente cotizar
And intente expedir la poliza cuyas figuras requieran Sarlaft
Then debo ver un mensaje bloqueante
|mensaje|
|Existen requisitos obligatorios pendientes por adjuntar, por favor verifique|

Examples:
|tipo_documento      |documento |cuenta     |producto|agente |
|CEDULA DE CIUDADANIA|71318883  |C000888888 |Autos   |DIRECTO|

Scenario: Valor accesorios superior expedicion-modificacion
Given que voy a buscar la cuenta <numCuenta>
And estoy expidiendo una poliza de autos
And seleccione el producto para expedir la poliza
And quiera agregar un asegurado
And vaya a la opcion agregar
And seleccione ingresar nueva persona natural
And ingrese los datos de persona natural:
| tipoId               | numeroId   | primerNombre | primerApellido | pais     | departamento | ciudad   | direccion       | tipoDireccion                  |
| CEDULA DE CIUDADANIA | 1014778905 | LUCIANA      | LONDOÑO        | Colombia | Antioquia    | Medellin | Cra 65 # 48-162 | DIRECCION DE OFICINA PRINCIPAL |
And vaya a agregar el vehiculo con los siguientes datos:
|placa    |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis |motor|valor_asegurado|descuento|recargo|zona|plan        |
|randoma |2011  |01601225        |MEDELLIN          |Particular       |kljh456|yui10|17900000       |null     |null   |2   |Plan Modular|
And seleccione algunas coberturas:
|limite|deducible|abogado |PTH|PPH|PPHF|GTH|AC|AS                |PTD|PPD|PPDF|GT|PP|PT|GTR     |GP      |PLlaves |
|1.440 |0        |Opción 1|10 |910|1.50|40.|35|Asistencia Clásica|10 |0  |1.50|40|16|20|Opción 1|Opción 1|Opción 1|
When voy a expedir una poliza
And confirmo el mensaje de expedir poliza
And voy al archivo de poliza
And expido la poliza y voy al archivo de poliza
And ingrese a modificar dicha cotizacion
And se ingrese a la opcion vehiculos
And ingrese un valor de accesorios superior al permitido <accesorios>
And intente cotizar el cambio de poliza
And de click en expedir poliza
Then debo ver un mensaje bloqueante
|mensaje|
|Existen requisitos obligatorios pendientes por adjuntar, por favor verifique|
Examples:
|numCuenta |accesorios|
|C000888888|2600000,00|

carta de destimiento 1085678654

