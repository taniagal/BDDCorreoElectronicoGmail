Meta:
@lote4
@tag equipo: Billing
@sprint 14

Narrative:
Como usuario de Policy Center
requiero poder asignar un medio de venta por default para la gestión de las pólizas.


Scenario: Validacion de Medio de venta por canal por defecto
GivenStories: stories/policycenter/login_policy.story
Given estoy en el menu de administracion
And seleccione la opcion de  configuracion red comercial
When cuando vaya a la opcion medio de venta por canal
And cuando agrege un canal comercial:
| canalComercial                 |medioDeVenta|
|CC001 - Bancaseguros bancolombia|<ninguno>   |
Then se deben mostrar los medios de venta asociados a ese canal:
|mediosDeVentaAsociados|medioDeVentaPorDefecto|
|Puntos bancolombia    |No                    |
|Televentas            |No                    |
|Venta en linea        |No                    |
Examples:
||
||