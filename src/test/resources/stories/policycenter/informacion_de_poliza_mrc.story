Meta:

@issue #SUGWUSC-14460

Narrative:
Como usuario PolicyCenter
Quiero ser capaz de ingresar y visualizar la informacion de la poliza incluyendo el nombre tomador
,tomador adcicional, validar vigencia de la poliza.

Scenario: visualizar datos de la poliza
GivenStories: stories/policycenter/login_policy.story
Given se inicio una nueva suscripcion <numeroCuenta>
When este expidiendo una poliza de propiedad comercial <nomProducto>
Then se debe visualizar los datos del tomador <tomador>

Examples:
|numeroCuenta|nomProducto            |tomador                      |
|C000888888  |Multiriesgo corporativo|YURLEDYS PAOLA GALLEGO TORRES|

Scenario: Validar campos especiales de reaseguros
Given se inicio una nueva suscripcion <numeroCuenta>
When este expidiendo una poliza de propiedad comercial <nomProducto>
And seleccione la poliza como reaseguro aceptado
Then la etiqueta del tomador debe cambiar a tomador cedente
And la etiqueta reaseguro debe marcarce a (si) automaticamente sin ser editable
And se debe ocultar la opcion de tomadores adicionales

Examples:
|numeroCuenta|nomProducto            |
|C000888888  |Multiriesgo corporativo|

Scenario: Cambiar inicio de vigencia propiedad comercial
Given se inicio una nueva suscripcion <numeroCuenta>
When este expidiendo una poliza de propiedad comercial <nomProducto>
And modifique la fecha de inicio de vigencia de la poliza <fechaInicioVigencia>
Then se debe mostrar un mensaje <mensaje> de error
And bloquear la operacion

Examples:
|numeroCuenta  |nomProducto            |fechaInicioVigencia|mensaje                                                                                 |
|C000888888    |Multiriesgo corporativo|01/01/2016         |La fecha de vigencia no cumple con el parámetro de retroactividad definido (60 días)    |
|C000888888    |Multiriesgo corporativo|12/01/2016         |La fecha de vigencia no cumple con el parámetro de emisión anticipada definido (45 días)|

Scenario: Agregar tomador adicional cuando es un riesgo consultable
Given se inicio una nueva suscripcion <numeroCuenta>
When este expidiendo una poliza de propiedad comercial <nomProducto>
And quiera agregar un tomador adicional que es riesgo consultable <cedula>
Then se debe mostrar un mensaje de error <mensaje> <mensaje2>
And bloquear la operacion

Examples:
|numeroCuenta  |cedula|nomProducto            |mensaje                                                                                 |mensaje2                                                                               |
|C000888888    |123456|Multiriesgo corporativo|con el(los) rol(es) (ASEGURADO NOMBRADO) es un riesgo no estándar y debe ser autorizado.|Se trata de un riesgo no estandar y no es posible gestionar la solicitud por este canal|

Scenario: ocultar descipcion de la direccion cuando el campo no tenga datos informativos
Given se inicio una nueva suscripcion <numeroCuenta>
When este expidiendo una poliza de propiedad comercial <nomProducto>
And requiera quitar la descripcion de la direccion del contacto
Then debe desaparecer del formulario principal

Examples:
|numeroCuenta  |nomProducto            |
|C000888888    |Multiriesgo corporativo|
