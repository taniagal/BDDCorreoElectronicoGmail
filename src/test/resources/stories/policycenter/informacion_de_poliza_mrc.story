Meta: @lote1

@issue #SUGWUSC-14460
@tag equipo: 3
@local
@Sprint 3

Narrative:
Como usuario PolicyCenter
Quiero ser capaz de ingresar y visualizar la informacion de la poliza incluyendo el nombre tomador
,tomador adcicional, validar vigencia de la poliza.

Scenario: Validar campos especiales de reaseguros
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza:
|cuenta    |producto               |tipoPoliza |
|C001888888|Multiriesgo corporativo|Individual |
When seleccione la poliza como reaseguro especial
Then se debe visualizar los datos del tomador <tomador>
And la etiqueta del tomador debe cambiar a tomador cedente
And la etiqueta reaseguro debe marcarce a (si) automaticamente sin ser editable
And se debe ocultar la opcion de tomadores adicionales

Examples:
|tomador                        |
|DORIAN STIWAR EASTMOND PULGARIN|

Scenario: Cambiar inicio de vigencia propiedad comercial
Given estoy cotizando una poliza:
|cuenta    |producto               |tipoPoliza |
|C001888888|Multiriesgo corporativo|Individual |
When modifique la fecha de inicio de vigencia de la poliza <fechaInicioVigencia>
Then se debe mostrar un mensaje <mensaje> de error

Examples:
|numeroCuenta  |nomProducto            |fechaInicioVigencia|organizacion|mensaje                                                                                    |
|C000888888    |Multiriesgo corporativo|01/01/2016         |Sura        |La fecha inicio de vigencia no cumple con el parámetro de retroactividad definido (60 días)|
|C000888888    |Multiriesgo corporativo|30/12/2017         |Sura        |La fecha inicio de vigencia no cumple con el parámetro de emisión anticipada definido (45 días)|

Scenario: Ocultar descipcion de la direccion cuando el campo no tenga datos informativos
Given estoy cotizando una poliza:
|cuenta    |producto               |tipoPoliza |
|C001888888|Multiriesgo corporativo|Individual |
When requiera quitar la descripcion de la direccion del contacto
Then debe desaparecer del formulario principal

Examples:
|numeroCuenta  |nomProducto            |
|C001888888    |Multiriesgo corporativo|
