Expedicion Renovacion Pa Validaciones

Meta: @lote2

@issue #CDSEG-2296
@tag automator: diego_cardona_acevedo
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
And emita la renovacion nuevamente
Then mostrar mensaje en los asuntos que bloquean la expedicion
|mensaje                                                        |
|El valor de los accesorios es mayor al 20% del valor Asegurado |
|El valor de los accesorios especiales es mayor al valor Asegurado del vehículo. Por favor verifique.|

Examples:
|cotizacion |
|22222336   |

Scenario: Validar motor y chasis
Given estoy cotizando una poliza basado en otro envio <envio>
And vaya a agregar el vehiculo con los datos:
|placa |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis |motor|valor_asegurado|descuento|recargo|zona|plan        |
|random|2011  |01601225        |MEDELLIN          |Particular       |kljh456|yui10|17900000       |null     |null   |2   |Plan Modular|
And seleccione algunas coberturas:
|limite|deducible|abogado |PTH|PPH|PPHF|GTH|AC|AS                |PTD|PPD|PPDF|GT|PP|PT|GTR     |GP      |PLlaves |
|1.440 |0        |Opción 1|10 |910|1.50|40.|35|Asistencia Clásica|10 |0  |1.50|40|16|20|Opción 1|Opción 1|Opción 1|
When expido la poliza y voy al archivo de poliza
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
|envio   |
|22228589|