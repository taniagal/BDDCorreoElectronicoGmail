Meta: @lote3
@issue #SUGWUSC-15123

Narrative:
Como usuario de policy center
con un perfil que tenga permisos quiero ser capaz de registrar toda la informacion del vehiculo

Scenario: Ingreso de informacion del vehiculo
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza:
|cuenta    |organizacion|producto|canal            |
|C000222333|Sura        |Autos   |Canal Tradicional|
When vaya a agregar un vehiculo con los datos:
|placa |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis |motor|valor_asegurado|descuento|recargo|zona|plan             |
|AK0249|2009  |08001111        |MEDELLIN          |Particular       |PR3B4  |SnR4 |13500000       |null     |null   |2   |Plan Autos Básico|
And ingrese el beneficiario o conductor <tipoDocumento> <numeroDocumento> en los intereses adicionales
Then el sistema debe permitir pasar a la siguinete pagina

Examples:
|numeroCuenta|organizacion|canal            |nomProducto|tipoDocumento       |numeroDocumento|
|C000222333  |Sura        |Canal Tradicional|Autos      |CEDULA DE CIUDADANIA|1234567892     |

Scenario: Validacion de caracteres especiales en campos informacion del vehiculo
Given estoy cotizando una poliza:
|cuenta    |organizacion|producto|canal            |
|C000222333|Sura        |Autos   |Canal Tradicional|
When vaya a agregar un vehiculo con los datos:
|placa  |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis                 |motor                       |valor_asegurado|descuento|recargo|zona|plan             |
|AKN0099|2009  |08001111        |MEDELLIN          |Particular       |PR3B4_-/-#$%&/()=?¡¿'  |86-51/*4213486+145646!"_#$% |13500000       |9,9999   |100    |2   |Plan Autos Básico|
Then el sistema NO debe permitir pasar a la siguinete pagina

Examples:
|numeroCuenta|organizacion|canal            |nomProducto|
|C000222333  |Sura        |Canal Tradicional|Autos      |


Scenario: Validar campos de valores asegurados, accesorios y tope definido por perfil
Given estoy cotizando una poliza:
|cuenta    |organizacion|producto|canal            |
|C000222333|Sura        |Autos   |Canal Tradicional|
When vaya a agregar un vehiculo con los datos:
|placa |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis |motor|valor_asegurado|descuento|recargo|zona|plan             |
|AKU009|2009  |08001111        |MEDELLIN          |Particular       |PR3B4  |SnR4 |13500000       |null     |null   |2   |Plan Autos Básico|
And ingrese los valores de accesorios y <valorAccesorio> <valorAccesorioEsp> valor de bonificacion tecnica <boniTecnica> y comercial <boniComercial>
Then el sistema debe totalizar el valor asegurado y mostrar un mensaje de error <mensaje>

Examples:
|numeroCuenta|organizacion|canal            |nomProducto|valorAccesorio|valorAccesorioEsp|boniComercial|boniTecnica|mensaje                                             |
|C000222333  |Sura        |Canal Tradicional|Autos      |1750000       |4000000          |25           |30         |La suma de las bonificaciones no debe ser mayor a 50|
