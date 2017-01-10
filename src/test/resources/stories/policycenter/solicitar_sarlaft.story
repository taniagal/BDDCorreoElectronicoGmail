Solicitar Sarlaft

Meta:@lote3
@issue #CDSEG-834
@tag automator: diego_cardona_acevedo
@local
@Sprint 10

Narrative:
Como usuario de negocio
Quiero que se levante el requisito de sarlaft de en el pub Visual de requisitos
y habilitar el boton de Sarlaft para cada figura diferente (Tomador, asegurado  y beneficiario en el caso de que este sea gratiuto)

Scenario: Habilitar opcion Sarlaft en expedicion
GivenStories: stories/policycenter/login_policy.story

Given voy a crear una nueva cotizacion
And crear una cotizacion nueva con la cuenta <cuenta>
And seleccione el agente <agente>
When seleccione el producto <producto> para expedir la poliza
And ingrese la organizacion, canal y tipo de poliza
And ingrese los datos del asegurado <tipo_documento> <documento>
And ingrese los datos del vehiculo:
|placa |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis|motor|valor_asegurado|descuento|recargo|zona|plan        |
|TYU130|2016  |00601182        |MEDELLIN          |Particular       |null  |null |165900000      |null     |null   |2   |Plan Modular|
And ingrese las coberturas basicas:
|limite|deducible|abogado |PLlaves |
|1.440 |0        |Opción 1|Opción 1|
And intente cotizar
And intente expedir la poliza cuyas figuras requieran Sarlaft
And debe aparecer un mensaje bloqueante en la ventana de requisitos
|mensaje|
|El contacto CAROLINA OCHOA con DNI C71318883 requiere sarlaft, diríjase a analisís de riesgo para diligenciarlo.|
And vaya a la opcion de analisis de riesgo
Then debo ver un UW issue que indique que se requiere diligenciar Sarlaft
|mensaje|
|Para el contacto CAROLINA OCHOA con número de documento 71318883 se requiere que diligencie el Sarlaft; ingrese aquí para diligenciarlo.|

Examples:
|tipo_documento      |documento |cuenta     |producto|agente |
|CEDULA DE CIUDADANIA|71318883  |C000888888 |Autos   |DIRECTO|

Scenario: Habilitar opcion Sarlaft en modificacion
Given existe una cotizacion <numeroCotizacion>
When intente expedir la modificacion cuyas figuras requieran Sarlaft
And debe aparecer un mensaje bloqueante en la ventana de requisitos
|mensaje|
|El contacto ANTONIO RESTREPO con DNI C71123456 requiere sarlaft, diríjase a analisís de riesgo para diligenciarlo.|
And vaya a la opcion de analisis de riesgo
Then debo ver un UW issue que indique que se requiere diligenciar Sarlaft
|mensaje|
|Para el contacto ANTONIO RESTREPO con número de documento 71123456 se requiere que diligencie el Sarlaft; ingrese aquí para diligenciarlo.|

Examples:
|numeroCotizacion|
|22222244        |

Scenario: Validar sarlaft tomador-expedicion
Given estoy cotizando una poliza de mrc con documento:
|organizacion|producto               |canal            |tipoPoliza |tipo_documento      |documento |fecha_nacimiento|primer_nombre|primer_apellido|tipo_direccion         |direccion       |departamento|ciudad  |agente|
|Sura        |Autos                  |Canal Tradicional|Individual |CEDULA DE CIUDADANIA|71318883  |10/10/1973     |LUCIANA      |LONDOÑO        |DIRECCION DE RESIDENCIA|CALLE 65F #60-69|Antioquia   |Medellin|INT-3 |
And ingrese los datos del asegurado <tipo_documento> <documento>
And ingrese los datos del vehiculo:
|placa   |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis |motor|valor_asegurado|descuento|recargo|zona|plan        |
|ASDF2   |2011  |01601225        |MEDELLIN          |Particular       |kljh456|yui10|17900000       |null     |null   |2   |Plan Modular|
And seleccione algunas coberturas:
|limite|deducible|abogado |PTH|PPH|PPHF|GTH|AC|AS                |PTD|PPD|PPDF|GT|PP|PT|GTR     |GP      |PLlaves |
|1.440 |0        |Opción 1|10 |910|1.50|40.|35|Asistencia Clásica|10 |0  |1.50|40|16|20|Opción 1|Opción 1|Opción 1|
When voy a expedir una poliza
And confirmo el mensaje de expedir poliza
And debe aparecer un mensaje bloqueante en la ventana de requisitos
|mensaje|
|El contacto LUCIANA LONDOÑO con DNI C71318883 requiere sarlaft, diríjase a analisís de riesgo para diligenciarlo.|
And vaya a la opcion de analisis de riesgo
Then debo ver un UW issue que indique que se requiere diligenciar Sarlaft
|mensaje|
|Para el contacto LUCIANA LONDOÑO con número de documento 71318883 se requiere que diligencie el Sarlaft; ingrese aquí para diligenciarlo.|

Examples:
|accesorios|tipo_documento      |documento |
|2600000,00|CEDULA DE CIUDADANIA|1234567890|

Scenario: Habilitar opcion Sarlaft en Renovacion - Tomador
Meta:@manual
Given existe una cotizacion
When intente expedir la modificacion cuyas figuras requieran Sarlaft
And vaya a la opcion de analisis de riesgo
Then debo ver un UW issue que indique que se requiere diligenciar Sarlaft en renovacion
|mensaje|
|Para el contacto ANTONIO RESTREPO con número de documento 71123456 se requiere que diligencie el Sarlaft; ingrese aquí para diligenciarlo|