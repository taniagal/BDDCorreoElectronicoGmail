Meta:

@issue #SUGWUSC-15123

Narrative:
Como usuario de policy center
con un perfil que tenga permisos quiero ser capaz de registrar toda la informacion del vehiculo

Scenario: Ingreso de informacion del vehiculo
GivenStories: stories/policycenter/login_policy.story
Given se inicio una nueva suscripcion <numeroCuenta>
When ingrese una nueva cotizacion para vehiculo <nomProducto>
And vaya a registrar los datos del vehiculo
And vaya a agregar un vehiculo con los datos:
|placa |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis |motor|valor_asegurado|
|OFI19D|2009  |01601225        |ALTAMIRA          |Particular       |PR3B4  |SnR4 |null           |
And ingrese el beneficiario o conductor en los intereses adicionales
Then el sistema debe permitir pasar a la siguinete pagina

Examples:
|numeroCuenta|nomProducto|
|C000888888  |Autos      |



