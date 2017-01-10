Reglas Renovacion Dos

Meta:
@lote3
@issue #CDSEG-3014
@tag automator: Jonathan_Mejia_Leon
@local
Sprint 8

Narrative:
Como usuario de PolicyCenter
Quiero poder clasificar las reglas que detienen el proceso automático
y envian las pólizas al proceso manual.

Scenario: Valor accesorios superior al 20% del valor asegurado
GivenStories: stories/policycenter/login_policy.story
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
And ingrese a la pantalla de vehiculos
And se ingrese el valor de los accesorios es superior al 20% del valor asegurado del vehiculo
And Se ingrese el valor de los accesorios especiales es superior al 100% del valor asegurado del vehículo
Then se debe mostrar los <mensaje1> <mensaje2> de alerta

Examples:
|envio   |tipo_documento      |documento |mensaje1                                | mensaje2                                 |
|22228589|CEDULA DE CIUDADANIA|1060447895|es mayor al 20% del valor Asegurado     | es mayor al valor Asegurado del vehículo.|

Scenario: Tope maximo valor asegurado del vehiculo
Meta:
@manual
Given que es necesario renovar una <poliza> autos
When quiera realizar esta la renovacion
And edite la renovacion de poliza
Then Se debe mostrar el <mensaje> de ALERTA

Examples:
|poliza       |  mensaje                                                                                                                                                                                                                           |
|TEST_22266674|  El valor asegurado del vehículo supera el límite maximo permitido por políticas. El aseguramiento de este carro así como la oferta presentada al cliente, deben ser avalados previamente por el Comite de Riesgo No Estándar Autos|


