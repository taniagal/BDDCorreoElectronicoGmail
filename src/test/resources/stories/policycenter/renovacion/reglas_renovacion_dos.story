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
Given estoy cotizando una poliza basado en otro envio <envio>
When ingrese los datos de la cotizacion PA
|ciudad_circulacion|limite|deducible|abogado |PLlaves |modelo|
|MEDELLIN          |1.440 |0        |Opción 1|Opción 1|2016  |
And expido la poliza y voy al archivo de poliza
And quiera realizar esta renovacion
And ingrese a la pantalla de vehiculos
And se ingrese el valor de los accesorios es superior al 20% del valor asegurado del vehiculo
And Se ingrese el valor de los accesorios especiales es superior al 100% del valor asegurado del vehículo
Then se debe mostrar los <mensaje1> <mensaje2> de alerta

Examples:
|envio   |  mensaje1                                | mensaje2                                 |
|22228589|  es mayor al 20% del valor Asegurado     | es mayor al valor Asegurado del vehículo.|



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


