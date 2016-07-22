Meta:

@issue #SUGWUSC-15123

Narrative:
Como usuario de policy center
con un perfil que tenga permisos quiero ser capaz de registrar toda la informacion del vehiculo



Scenario: Validacion en campos informacion del vehiculo
GivenStories: stories/policycenter/login_policy.story
Given se inicio una nueva suscripcion <numeroCuenta>
When ingrese una nueva cotizacion para vehiculo <nomProducto>
And vaya a registrar los datos del vehiculo
And vaya a agregar un vehiculo con los datos:
|placa    |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis                 |motor                       |valor_asegurado|descuento|recargo|
|AB1234567|2009 |00319005       |MEDELLIN            |Público especial |PR3B4_-/-#$%&/()=?¡¿'  |86-51/*4213486+145646!"_#$% |null           |9.9999   |100    |
Then Then el sistema NO debe permitir pasar a la siguinete pagina

Examples:
|numeroCuenta|nomProducto|
|C000888888  |Autos      |

Scenario: Ingreso de informacion del vehiculo
Given se inicio una nueva suscripcion <numeroCuenta>
When ingrese una nueva cotizacion para vehiculo <nomProducto>
And vaya a registrar los datos del vehiculo
And vaya a agregar un vehiculo con los datos:
|placa |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis |motor|valor_asegurado|descuento|recargo|
|AKN25Z|2009  |00319005        |MEDELLIN          |Público especial |PR3B4  |SnR4 |null           |null     |null    |
And ingrese el beneficiario o conductor en los intereses adicionales
Then el sistema debe permitir pasar a la siguinete pagina

Examples:
|numeroCuenta|nomProducto|
|C000888888  |Autos      |

