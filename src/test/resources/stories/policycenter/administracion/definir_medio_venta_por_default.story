Meta:

Narrative:
As a user
I want to perform an action
So that I can achieve a business goal


Scenario: Medio de venta por default Administracion
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