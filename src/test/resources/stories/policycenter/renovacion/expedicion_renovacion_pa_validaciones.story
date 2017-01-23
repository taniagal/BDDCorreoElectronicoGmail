Expedicion Renovacion Pa Validaciones

Meta:
@lote3
@issue #CDSEG-2296
@tag equipo: 5
@local
@Sprint 7

Narrative:
Como usuario de PolicyCenter
Quiero ser capaz de renovar de forma manual y automaticamente las politicas de auto personal.

Scenario: Maximo valor accesorios y accesorios especiales
GivenStories: stories/policycenter/login_policy.story
Given se esta cotizando una renovacion de poliza <cotizacion>
When emita la renovacion
And el valor de los accesorios y accesorios especiales supere el monto permitido
Then mostrar mensaje en los asuntos que bloquean la expedicion
|mensaje                                                        |
|El valor de los accesorios es mayor al 20% del valor Asegurado |
|El valor de los accesorios especiales es mayor al valor Asegurado del vehículo. Por favor verifique.|

Examples:
|cotizacion |
|22222336   |

Scenario: Validar motor y chasis
Given estoy cotizando una poliza:
|cuenta     |organizacion|producto|canal            |tipoPoliza |
|C1060447895|Sura        |Autos   |Canal Tradicional|Individual |
When ingrese los datos del asegurado <tipo_documento> <documento>
And ingrese los datos del vehiculo:
|placa |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis|motor|valor_asegurado|descuento|recargo|zona|plan        |
|random|2016  |00601182        |MEDELLIN          |Particular       |null  |null |165900000      |null     |null   |2   |Plan Modular|
And ingrese las coberturas:
|limite|deducible|abogado |PLlaves |
|1.440 |0        |Opción 1|Opción 1|
And expido la poliza y voy al archivo de poliza
And quiera realizar esta renovacion
And edite la informacion del vehiculo en la renovacion
|chasis|motor|
|null  |null |
And cotice la renovacion
And emita la renovacion
And no se tenga motor ni chasis ingresados
Then mostrar el siguiente mensaje de bloqueo
|mensaje                                  |
|El número de motor no ha sido ingresado  |
|El número de chasis no ha sido ingresado |
Examples:
|tipo_documento      |documento |
|CEDULA DE CIUDADANIA|1060447895|