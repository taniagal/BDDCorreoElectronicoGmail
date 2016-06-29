Meta:

Narrative:
Como usuario PolicyCenter
Quiero ser capaz de ingresar y visualizar la informacion de la poliza incluyendo el nombre tomador
, tomador adcicional, validar vigencia de la poliza.

Scenario: visualizar datos de la poliza
Given se inicio una nueva suscripcion <numeroCuenta>
When este expidiendo una poliza de propiedad comercial
Then se debe visualizar los datos del tomador y tomador adicional completos

Examples:
|numeroCuenta|
|C000888888  |

Scenario: Cambiar inicio de vigencia propiedad comercial
Given se inicio una nueva suscripcion <numeroCuenta>
When modifique la fecha de inicio de vigencia de la poliza <fechaInicioVigencia>
Then se debe mostrar un mensaje <mensaje> de error
And bloquear la operacion

Examples:
|numeroCuenta  |fechaInicioVigencia|mensaje                                                                             |
|C000888888    |01/01/2016         |La fecha de vigencia no cumple con el parámetro de retroactividad definido (60 días)|
|C000888888    |12/01/2016         |La fecha de vigencia no cumple con el parámetro de retroactividad definido (60 días)|

Scenario: Agregar tomador adicional cuando es un riesgo consultable
Given se inicio una nueva suscripcion <numeroCuenta>
When este expidiendo una poliza de propiedad comercial
And quiera agregar un tomador adicional que es riesgo consultable <cedula>
Then se debe mostrar un mensaje de error <mensaje> <mensaje2>
And bloquear la operacion

Examples:
|numeroCuenta  |cedula|mensaje|mensaje2
|C000888888    |123456|con el(los) rol(es) (ASEGURADO NOMBRADO) es un riesgo no estándar y debe ser autorizado.|Se trata de un riesgo no estandar y no es posible gestionar la solicitud por este canal.


