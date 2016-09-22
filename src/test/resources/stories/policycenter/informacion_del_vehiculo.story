Meta:
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
|placa |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis |motor|valor_asegurado|descuento|recargo|zona|
|AK0249|2016  |00601182        |MEDELLIN          |Particular       |PR3B4  |SnR4 |165900000       |null     |null   |2|
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
|placa  |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis                 |motor                       |valor_asegurado|descuento|recargo|zona|
|AKN0099|2016  |00601182        |MEDELLIN          |Particular       |PR3B4_-/-#$%&/()=?¡¿'  |86-51/*4213486+145646!"_#$% |165900000       |9.9999   |100    |2   |
Then el sistema NO debe permitir pasar a la siguinete pagina

Examples:
|numeroCuenta|organizacion|canal            |nomProducto|
|C000222333  |Sura        |Canal Tradicional|Autos      |


Scenario: Validar campos de valores asegurados, accesorios y tope definido por perfil
Given estoy cotizando una poliza:
|cuenta    |organizacion|producto|canal            |
|C000222333|Sura        |Autos   |Canal Tradicional|
When vaya a agregar un vehiculo con los datos:
|placa |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis |motor|valor_asegurado|descuento|recargo|zona|
|AKU009|2016  |00601182        |MEDELLIN          |Particular       |PR3B4  |SnR4 |165900000       |null     |null   |2|
And ingrese los valores de accesorios y <valorAccesorio> <valorAccesorioEsp> valor de bonificacion tecnica <boniTecnica> y comercial <boniComercial>
Then el sistema debe totalizar el valor asegurado y mostrar un mensaje de error <mensaje>

Examples:
|numeroCuenta|organizacion|canal            |nomProducto|valorAccesorio|valorAccesorioEsp|boniComercial|boniTecnica|mensaje                                             |
|C000222333  |Sura        |Canal Tradicional|Autos      |1750000       |4000000          |25           |30         |La suma de las bonificaciones no debe ser mayor a 50|

Scenario: Cambiar bloqueo por warning - Interes adicional
Given estoy cotizando una poliza:
|cuenta    |organizacion|producto|canal            |
|C000222333|Sura        |Autos   |Canal Tradicional|
When vaya a agregar un vehiculo con los datos:
|placa   |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis  |motor |valor_asegurado|descuento|recargo|zona|
|CAO199  |2016  |00601182        |MEDELLIN          |Particular       |PR3B41  |SnR41 |165900000       |null     |null   |2|
And ingrese el beneficiario o conductor <tipoDocumento> <numeroDocumento> en los intereses adicionales
And el interes adicional este marcado como riesgo PEP
Then el sistema debe mostrar un mensaje <mensaje> obtenido desde Riesgos PEPS
And permitir continuar con la cotizacion

Examples:
|numeroCuenta|organizacion|canal            |nomProducto|tipoDocumento       |numeroDocumento|mensaje                                                                                               |
|C000222333  |Sura        |Canal Tradicional|Autos      |CEDULA DE CIUDADANIA|123456         |FRANK RAMIREZ ALZATE con CEDULA DE CIUDADANIA - 123456 es un riesgo no estándar y debe ser autorizado.|
