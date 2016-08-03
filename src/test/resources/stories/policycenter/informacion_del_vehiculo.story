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
|EEEEE|2009  |00319005        |MEDELLIN          |Público especial |PR3B4  |SnR4 |null           |null     |null   |
And ingrese el beneficiario o conductor en los intereses adicionales
Then el sistema debe permitir pasar a la siguinete pagina

Examples:
|numeroCuenta|organizacion|canal            |nomProducto|
|C000888888  |Sura        |Canal Tradicional|Autos      |