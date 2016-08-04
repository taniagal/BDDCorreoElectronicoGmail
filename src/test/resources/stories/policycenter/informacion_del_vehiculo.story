Meta:

@issue #SUGWUSC-15123

Narrative:
Como usuario de policy center
con un perfil que tenga permisos quiero ser capaz de registrar toda la informacion del vehiculo

Scenario: Ingreso de informacion del vehiculo
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza:
|cuenta    |organizacion|producto|canal            |
|C000888888|Sura        |Autos   |Canal Tradicional|
When vaya a agregar un vehiculo con los datos:
|placa |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis |motor|valor_asegurado|descuento|recargo|
|AK0249|2009  |08001111        |MEDELLIN          |Particular       |PR3B4  |SnR4 |$13,500,000.00 |null     |null   |
And ingrese el beneficiario o conductor en los intereses adicionales
Then el sistema debe permitir pasar a la siguinete pagina

Examples:
|numeroCuenta|organizacion|canal            |nomProducto|
|C000888888  |Sura        |Canal Tradicional|Autos      |


Scenario: Validacion de caracteres especiales en campos informacion del vehiculo
Given estoy cotizando una poliza:
|cuenta    |organizacion|producto|canal            |
|C000888888|Sura        |Autos   |Canal Tradicional|
When vaya a agregar un vehiculo con los datos:
|placa  |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis                 |motor                       |valor_asegurado|descuento|recargo|
|AKN0099|2009  |08001111        |MEDELLIN            |Particular      |PR3B4_-/-#$%&/()=?¡¿'  |86-51/*4213486+145646!"_#$% |$13,500,000.00 |9.9999   |100    |
Then Then el sistema NO debe permitir pasar a la siguinete pagina

Examples:
|numeroCuenta|organizacion|canal            |nomProducto|
|C000888888  |Sura        |Canal Tradicional|Autos      |

Scenario: Validar campos de valores asegurados, accesorios y tope definido por perfil
Given estoy cotizando una poliza:
|cuenta    |organizacion|producto|canal            |
|C000888888|Sura        |Autos   |Canal Tradicional|
When vaya a agregar un vehiculo con los datos:
|placa |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis |motor|valor_asegurado|descuento|recargo|
|AKU009|2009  |08001111        |MEDELLIN          |Particular       |PR3B4  |SnR4 |$13,500,000.00 |null     |null   |
And ingrese los valores de accesorios y <valorAccesorio> <valorAccesorioEsp> valor de bonificacion tecnica <boniTecnica> y comercial <boniComercial>
Then el sistema debe totalizar el valor asegurado y mostrar un mensaje de error <mensaje>

Examples:
|numeroCuenta|organizacion|canal            |nomProducto|valorAccesorio|valorAccesorioEsp|boniComercial|boniTecnica|mensaje                                             |
|C000888888  |Sura        |Canal Tradicional|Autos      |1750000       |4000000          |25           |30         |La suma de las bonificaciones no debe ser mayor a 50|