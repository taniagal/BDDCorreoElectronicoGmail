Meta: @lote2

@issue #SUGWUSC-14460
@tag automator: Jonathan_Mejia_Leon
@local
@Sprint 3

Narrative:
Como usuario PolicyCenter
Quiero ser capaz de ingresar y visualizar la informacion de la poliza incluyendo el nombre tomador
,tomador adcicional, validar vigencia de la poliza.

Scenario: Visualizar datos de la poliza
GivenStories: stories/policycenter/login_policy.story
Given se inicio una nueva suscripcion <numeroCuenta>
When este expidiendo una poliza de propiedad comercial
And seleccione el producto <nomProducto> a expedir
Then se debe visualizar los datos del tomador <tomador>

Examples:
|numeroCuenta|nomProducto            |tomador                      |
|C001888888  |Multiriesgo corporativo|DORIAN STIWAR EASTMOND PULGARIN|

Scenario: Validar campos especiales de reaseguros
Given se inicio una nueva suscripcion <numeroCuenta>
When este expidiendo una poliza de propiedad comercial
And seleccione el producto <nomProducto> a expedir
And seleccione la poliza como reaseguro especial
Then la etiqueta del tomador debe cambiar a tomador cedente
And la etiqueta reaseguro debe marcarce a (si) automaticamente sin ser editable
And se debe ocultar la opcion de tomadores adicionales

Examples:
|numeroCuenta|nomProducto            |
|C001888888  |Multiriesgo corporativo|

Scenario: Cambiar inicio de vigencia propiedad comercial
Given se inicio una nueva suscripcion <numeroCuenta>
When este expidiendo una poliza de propiedad comercial
And seleccione el producto <nomProducto> a expedir
And modifique la fecha de inicio de vigencia de la poliza <fechaInicioVigencia>
Then se debe mostrar un mensaje <mensaje> de error

Examples:
|numeroCuenta  |nomProducto            |fechaInicioVigencia|mensaje                                                                                    |
|C000888888    |Multiriesgo corporativo|01/01/2016         |La fecha inicio de vigencia no cumple con el parámetro de retroactividad definido (60 días)|
|C000888888    |Multiriesgo corporativo|30/12/2017         |La fecha inicio de vigencia no cumple con el parámetro de emisión anticipada definido (45 días)|

Scenario: Ocultar descipcion de la direccion cuando el campo no tenga datos informativos
Given se inicio una nueva suscripcion <numeroCuenta>
When este expidiendo una poliza de propiedad comercial
And seleccione el producto <nomProducto> a expedir
And requiera quitar la descripcion de la direccion del contacto
Then debe desaparecer del formulario principal

Examples:
|numeroCuenta  |nomProducto            |
|C001888888    |Multiriesgo corporativo|
