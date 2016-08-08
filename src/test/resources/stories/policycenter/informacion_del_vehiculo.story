Meta:

@issue #SUGWUSC-15123

Narrative:
Como usuario de policy center
con un perfil que tenga permisos quiero ser capaz de registrar toda la informacion del vehiculo

Scenario: Ingreso de informacion del vehiculo
GivenStories: stories/policycenter/login_policy.story
Given se inicio una nueva suscripcion <numeroCuenta>
And ingrese el agente
When seleccione la organizacion <organizacion>
And seleccione el canal <canal>
And ingrese una nueva cotizacion para vehiculo <nomProducto>
And vaya a agregar un vehiculo con los datos:
|placa |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis |motor|valor_asegurado|descuento|recargo|
|AKN019  |2009  |08001111        |MEDELLIN          |Particular       |PR3B4  |SnR4 |null           |null     |null   |
And ingrese el beneficiario o conductor <tipoDocumento> <numeroDocumento> en los intereses adicionales
Then el sistema debe permitir pasar a la siguinete pagina

Examples:
|numeroCuenta|organizacion|canal            |nomProducto|tipoDocumento       |numeroDocumento|
|C000888888  |Sura        |Canal Tradicional|Autos      |CEDULA DE CIUDADANIA|1234567892     |

Scenario: Validacion de caracteres especiales en campos informacion del vehiculo
Given se inicio una nueva suscripcion <numeroCuenta>
And ingrese el agente
When seleccione la organizacion <organizacion>
And seleccione el canal <canal>
And ingrese una nueva cotizacion para vehiculo <nomProducto>
And vaya a agregar un vehiculo con los datos:
|placa   |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis                 |motor                       |valor_asegurado|descuento|recargo|
|AKN019W |2009  |08001111       |MEDELLIN            |Particular      |PR3B4_-/-#$%&/()=?¡¿'  |86-51/*4213486+145646!"_#$% |null           |9.9999   |100    |
Then Then el sistema NO debe permitir pasar a la siguinete pagina

Examples:
|numeroCuenta|organizacion|canal            |nomProducto|
|C000888888  |Sura        |Canal Tradicional|Autos      |

Scenario: Validar campos de valores asegurados, accesorios y tope definido por perfil
Given se inicio una nueva suscripcion <numeroCuenta>
And ingrese el agente
When seleccione la organizacion <organizacion>
And seleccione el canal <canal>
And ingrese una nueva cotizacion para vehiculo <nomProducto>
And vaya a agregar un vehiculo con los datos:
|placa   |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis |motor|valor_asegurado|descuento|recargo|
|AKU019  |2009  |08001111        |MEDELLIN          |Particular       |PR3B4  |SnR4 |null           |null     |null    |
And ingrese los valores de accesorios y <valorAccesorio> <valorAccesorioEsp> valor de bonificacion tecnica <boniTecnica> y comercial <boniComercial>
Then el sistema debe totalizar el valor asegurado y mostrar un mensaje de error <mensaje>

Examples:
|numeroCuenta|organizacion|canal            |nomProducto|valorAccesorio|valorAccesorioEsp|boniComercial|boniTecnica|mensaje                                             |
|C000888888  |Sura        |Canal Tradicional|Autos      |1750000       |4000000          |25           |30         |La suma de las bonificaciones no debe ser mayor a 50|

Scenario: Cambiar bloqueo por warning - Interes adicional
Given se inicio una nueva suscripcion <numeroCuenta>
And ingrese el agente
When seleccione la organizacion <organizacion>
And seleccione el canal <canal>
And ingrese una nueva cotizacion para vehiculo <nomProducto>
And vaya a agregar un vehiculo con los datos:
|placa   |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis  |motor |valor_asegurado|descuento|recargo|
|CAO199  |2009  |08001111        |MEDELLIN          |Particular       |PR3B41  |SnR41 |null           |null     |null   |
And ingrese el beneficiario o conductor <tipoDocumento> <numeroDocumento> en los intereses adicionales
And el interes adicional este marcado como riesgo PEP
Then el sistema debe mostrar un mensaje <mensaje> obtenido desde Riesgos PEPS
And permitir continuar con la cotizacion

Examples:
|numeroCuenta|organizacion|canal            |nomProducto|tipoDocumento       |numeroDocumento|mensaje                                                                                               |
|C000888888  |Sura        |Canal Tradicional|Autos      |CEDULA DE CIUDADANIA|123456         |FRANK RAMIREZ ALZATE con CEDULA DE CIUDADANIA - 123456 es un riesgo no estándar y debe ser autorizado.|