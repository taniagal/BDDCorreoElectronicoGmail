Meta: @lote2

@issue #SUGWUSC-14460
@tag automator: Jonathan_Mejia_Leon
@local
@Sprint 3

Narrative:
Como usuario PolicyCenter
Quiero ser capaz de ingresar y visualizar la informacion de la poliza incluyendo el nombre tomador
,tomador adcicional, validar vigencia de la poliza.

Scenario: visualizar datos de la poliza
GivenStories: stories/policycenter/login_policy.story
Given se inicio una nueva suscripcion <numeroCuenta>
When este expidiendo una poliza de propiedad comercial
And seleccione la organizacion <organizacion>
And seleccione el canal <canal>
And seleccione el producto <nomProducto> a expedir
Then se debe visualizar los datos del tomador <tomador>

Examples:
|numeroCuenta|organizacion|canal            |nomProducto            |tomador                      |
|C001888888  |Sura        |Canal Tradicional|Multiriesgo corporativo|DORIAN STIWAR EASTMOND PULGARIN|

Scenario: Validar campos especiales de reaseguros
Given se inicio una nueva suscripcion <numeroCuenta>
When este expidiendo una poliza de propiedad comercial
And seleccione la organizacion <organizacion>
And seleccione el canal <canal>
And seleccione el producto <nomProducto> a expedir
And seleccione la poliza como reaseguro especial
Then la etiqueta del tomador debe cambiar a tomador cedente
And la etiqueta reaseguro debe marcarce a (si) automaticamente sin ser editable
And se debe ocultar la opcion de tomadores adicionales

Examples:
|numeroCuenta|organizacion|canal            |nomProducto            |
|C001888888  |Sura        |Canal Tradicional|Multiriesgo corporativo|

Scenario: Cambiar inicio de vigencia propiedad comercial
Given se inicio una nueva suscripcion <numeroCuenta>
When este expidiendo una poliza de propiedad comercial
And seleccione la organizacion <organizacion>
And seleccione el canal <canal>
And seleccione el producto <nomProducto> a expedir
And modifique la fecha de inicio de vigencia de la poliza <fechaInicioVigencia>
Then se debe mostrar un mensaje <mensaje> de error

Examples:
|numeroCuenta  |organizacion|canal            |nomProducto            |fechaInicioVigencia|mensaje                                                                                    |
|C000888888    |Sura        |Canal Tradicional|Multiriesgo corporativo|01/01/2016         |La fecha inicio de vigencia no cumple con el parámetro de retroactividad definido (60 días)|
|C000888888    |Sura        |Canal Tradicional|Multiriesgo corporativo|30/12/2016         |La fecha inicio de vigencia no cumple con el parámetro de emisión anticipada definido (45 días)|

Scenario: Agregar tomador adicional cuando es un riesgo consultable
Given se inicio una nueva suscripcion <numeroCuenta>
When este expidiendo una poliza de propiedad comercial
And seleccione la organizacion <organizacion>
And seleccione el canal <canal>
And seleccione el producto <nomProducto> a expedir
And quiera agregar un tomador adicional que es riesgo consultable <cedula>
Then se debe mostrar un mensaje de error <mensaje> <mensaje2>


Examples:
|numeroCuenta  |organizacion|canal            |cedula|nomProducto            |mensaje                                       |mensaje2                                                                                                                                              |
|C001888888    |Sura        |Canal Tradicional|123456|Multiriesgo corporativo|es un riesgo no estándar y debe ser autorizado|El tomador es un riesgo no estándar y debe ser analizado por el Comité de Evaluación, por favor tramite el caso con el Gerente o Director Comercial|

Scenario: ocultar descipcion de la direccion cuando el campo no tenga datos informativos
Given se inicio una nueva suscripcion <numeroCuenta>
When este expidiendo una poliza de propiedad comercial
And seleccione la organizacion <organizacion>
And seleccione el canal <canal>
And seleccione el producto <nomProducto> a expedir
And requiera quitar la descripcion de la direccion del contacto
Then debe desaparecer del formulario principal

Examples:
|numeroCuenta  |organizacion|canal            |nomProducto            |
|C001888888    |Sura        |Canal Tradicional|Multiriesgo corporativo|
