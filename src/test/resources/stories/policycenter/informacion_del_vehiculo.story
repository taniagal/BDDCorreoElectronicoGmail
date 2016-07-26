Meta:

@issue #SUGWUSC-15123

Narrative:
Como usuario de policy center
con un perfil que tenga permisos quiero ser capaz de registrar toda la informacion del vehiculo


Scenario: Validar campos de valores asegurados, accesorios y tope definido por perfil
GivenStories: stories/policycenter/login_policy.story
Given se inicio una nueva suscripcion <numeroCuenta>
When ingrese una nueva cotizacion para vehiculo <nomProducto>
And vaya a registrar los datos del vehiculo
And vaya a agregar un vehiculo con los datos:
|placa |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis |motor|valor_asegurado|descuento|recargo|
|AKN01B|2009  |00319005        |MEDELLIN          |Público especial |PR3B4  |SnR4 |null           |null     |null    |
And ingrese los valores de accesorios <valorAccesorio> <valorAccesorioEsp>
And valor de bonificacion tecnica <valorBoniTecnica> y comercial <valorBoniComercial>
Then el sistema debe totalizar el valor asegurado y mostrar un mensaje de error <mensaje>

Examples:
|numeroCuenta|nomProducto|valorAccesorio|valorAccesorioEsp|boniComercial|boniTecnica|mensaje                                             |
|C000888888  |Autos      |1750000       |4000000          |25           |30         |La suma de las bonificaciones no debe ser mayor a 50|

