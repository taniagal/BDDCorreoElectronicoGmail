Reglas Renovacion Dos

Meta: @lote1

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
Given que es necesario renovar una <poliza> de autos
When quiera realizar esta renovacion
And quiera aceptar esta renovacion
And ingrese a la pantalla de vehiculos
And edite la renovacion
And se ingrese el valor de los accesorios es superior al 20% del valor asegurado del vehiculo
And Se ingrese el valor de los accesorios especiales es superior al 100% del valor asegurado del vehículo
Then se debe mostrar los <mensaje1> <mensaje2> de alerta

Examples:
|poliza       |  mensaje1                                | mensaje2                                 |
|TEST_22222222|  es mayor al 20% del valor Asegurado     | es mayor al valor Asegurado del vehículo.|

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


