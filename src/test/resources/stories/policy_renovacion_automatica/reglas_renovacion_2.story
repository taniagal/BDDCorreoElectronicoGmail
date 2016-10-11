Reglas Renovacion 2

Meta:

@issue #
@tag automator: Jonathan_Mejia_Leon, sprint 8
@local
Sprint 8


Scenario: Valor accesorios superior al 20% del valor asegurado
GivenStories: stories/policycenter/login_policy.story
Given que es necesario renovar una <poliza> de autos
When quiera realizar esta renovacion
And quiera aceptar esta renovacion
And ingrese a la pestana vehiculos
And quiera editar la transaccion

When se identifique que el valor de los accesorios es superior al 20% del valor asegurado del vehículo
Then Se debe mostrar el mensaje de  ALERTA  "El valor de los accesorios es mayor al 20% del valor asegurado."

Examples:
|poliza       |mensaje|
|TEST_22266674|¿Esta seguro de que desea renovar esta póliza?|