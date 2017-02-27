Meta:
@lote1
@sprint 2
@tag equipo: 4
@local

Narrative:
Como usuario PolicyCenter con el papel de agente, RSE , Suscriptor o el Administrador
Quiero ser capaz de entrar y mantener detalles de la ubicación.

Feature: Entrar y mantener detalles de la ubicación


Scenario: Agregar una nueva ubicacion en una poliza de MRC
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza:
|cuenta    |producto               |
|C001888888|Multiriesgo corporativo|
When agregue una nueva ubicacion departamento <departamento>, ciuad <ciudad>, direccion <direccion>, medioVenta <medioVenta>
And descripcion <descripcion>, actividad economica <actividad>
Then espero ver en la lista de ubicaciones de la pantalla de edificios y ubicaciones la nueva ubicaciOn ingresada

Examples:
|departamento|ciudad  |direccion        |descripcion  |actividad                    |medioVenta|
|Antioquia   |Medellin|CR 44 A # 45 - 00|Edificio Core|Acabado de productos textiles|Televentas|


Scenario: Validar direccion al agregar una nueva ubicacion en una poliza de MRC
Given estoy cotizando una poliza:
|cuenta    |producto               |
|C001888888|Multiriesgo corporativo|
When agregue una nueva ubicacion departamento <departamento>, ciuad <ciudad>, direccion <direccion>, medioVenta <medioVenta>
And descripcion <descripcion>, actividad economica <actividad>
Then que se muestre el mensaje <mensaje>

Examples:
|departamento|ciudad  |direccion     |descripcion  |mensaje                                 |actividad                    |medioVenta|
|Antioquia   |Medellin|2X´H !2 ~0+ **|Edificio Core|La dirección 2X´H !2 ~0+ ** no es válida|Acabado de productos textiles|Televentas|
