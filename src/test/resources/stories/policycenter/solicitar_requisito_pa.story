Solicitar Requisito Pa

Meta:
@lote3
@issue #CDSEG-2881
@tag equipo: 5
@local
@Sprint 9

Narrative:
Como usuario de negocio
Quiero que se levante el requisito para la solucion de autos de acuerdo a las reglas de negocio ya definidas.

Scenario: Validar mensaje de advertencia - requisitos pendientes
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza:
|cuenta    |producto|tipoPoliza |
|C002888993|Autos   |Individual |
When ingrese los datos del asegurado <tipo_documento> <documento>
And ingrese los datos del vehiculo:
|placa |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis|motor|valor_asegurado|descuento|recargo|zona|plan        |
|random|2016  |00601182        |MEDELLIN          |Particular       |null  |null |165900000      |null     |null   |2   |Plan Modular|
And ingrese las coberturas:
|limite|deducible|abogado |PLlaves |
|1.440 |0        |Opción 1|Opción 1|
And llegue a la expedicion de la poliza
Then se debe mostrar un mensaje de advertencia
|mensaje                                                       |
|Existen requisitos opcionales pendientes, por favor dirijase a la pestaña Requisitos para tramitarlos.|

Examples:
|tipo_documento      |documento|
|CEDULA DE CIUDADANIA|11111111 |



Scenario: Validar opcion Solicitar requisitos - modificacion
Given estoy cotizando una poliza:
|cuenta    |producto|tipoPoliza |
|C002888993|Autos   |Individual |
When ingrese los datos del asegurado <tipo_documento> <documento>
And ingrese los datos del vehiculo:
|placa |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis|motor|valor_asegurado|descuento|recargo|zona|plan        |
|random|2016  |00601182        |MEDELLIN          |Particular       |null  |null |165900000      |null     |null   |2   |Plan Modular|
And ingrese las coberturas:
|limite|deducible|abogado |PLlaves |
|1.440 |0        |Opción 1|Opción 1|
And expido la poliza y voy al archivo de poliza
And cotice el cambio de poliza
And intente expedir la poliza
And existan requisitos pendientes
Then se debe mostrar un mensaje de advertencia
|mensaje                                                                                               |
|Existen requisitos opcionales pendientes, por favor dirijase a la pestaña Requisitos para tramitarlos.|

Examples:
|tipo_documento      |documento|
|CEDULA DE CIUDADANIA|11111111 |

Scenario: Validar ventana de requisitos
Meta: @manual
Given estoy expidiendo una poliza nueva
When seleccione la opcion expedir poliza
Then se deben cargar en la ventana de requisitos los requisitos de acuerdo a la regla de negocio
