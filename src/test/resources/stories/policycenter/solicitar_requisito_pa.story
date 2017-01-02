Solicitar Requisito Pa

Meta:
@lote3
@issue #CDSEG-2881
@tag automator: diego_cardona_acevedo
@local
@Sprint 9

Narrative:
Como usuario de negocio
Quiero que se levante el requisito para la solucion de autos de acuerdo a las reglas de negocio ya definidas.

Scenario: validar opcion requisitos
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza:
|cuenta    |organizacion|producto|canal            |tipoPoliza |
|C000888888|Sura        |Autos   |Canal Tradicional|Individual    |
When seleccione la opcion siguiente
And ingrese los datos del asegurado <tipo_documento> <documento>
And ingrese los datos del vehiculo:
|placa |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis|motor|valor_asegurado|descuento|recargo|zona|plan        |
|TYU137|2016  |00601182        |MEDELLIN          |Particular       |null  |null |165900000      |null     |null   |2   |Plan Modular|
And ingrese las coberturas basicas:
|limite|deducible|abogado |PLlaves |
|1.440 |0        |Opción 1|Opción 1|
And intente cotizar
Then se debe habilitar la opcion de requisitos, con el fin de visualizar los requisitos requeridos

Examples:
|tipo_documento      |documento |
|CEDULA DE CIUDADANIA|1060447895|

Scenario: validar mensaje de advertencia - requisitos pendientes
Given estoy cotizando una poliza:
|cuenta    |organizacion|producto|canal            |tipoPoliza |
|C000888888|Sura        |Autos   |Canal Tradicional|Individual    |
When seleccione la opcion siguiente
And ingrese los datos del asegurado <tipo_documento> <documento>
And ingrese los datos del vehiculo:
|placa |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis|motor|valor_asegurado|descuento|recargo|zona|plan        |
|TYU135|2016  |00601182        |MEDELLIN          |Particular       |null  |null |165900000      |null     |null   |2   |Plan Modular|
And ingrese las coberturas basicas:
|limite|deducible|abogado |PLlaves |
|1.440 |0        |Opción 1|Opción 1|
And intente cotizar
And llegue a la expedicion de la poliza
Then se debe mostrar un mensaje de advertencia
|mensaje                                            |
|Existen requisitos pendientes, por favor verifique.|

Examples:
|tipo_documento      |documento |
|CEDULA DE CIUDADANIA|1060447895|

Scenario: validar opcion Solicitar requisitos - modificacion
Given he realizado la cotizacion <cotizacion>
When intente expedir la poliza
And existan requisitos pendientes
Then se debe mostrar un mensaje de advertencia
|mensaje                                            |
|Existen requisitos pendientes, por favor verifique.|

Examples:
|cotizacion|
|22222244  |

Scenario: Validar ventana de requisitos
Meta: @manual
Given estoy expidiendo una poliza nueva
When seleccione la opcion expedir poliza
Then se deben cargar en la ventana de requisitos los requisitos de acuerdo a la regla de negocio
