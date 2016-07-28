Meta:
@issue #SUGWUSC-14470

Narrative:
Como usuario PolicyCenter con el papel de agente, RSE , Suscriptor o el Administrador
Quiero ser capaz de entrar y mantener detalles de la ubicación.

Feature: Entrar y mantener detalles de la ubicación


Scenario: Agregar una nueva ubicacion en una poliza de MRC
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza de MRC en cuenta <cuenta>
When seleccione la organizacion <organizacion>
And seleccione el canal <canal>
And seleccione el producto <producto> para expedir la poliza
And agregue una nueva ubicacion departamento <departamento>, ciuad <ciudad>, direccion <direccion>
And descripcion <descripcion>, actividad economica <actividad>
Then espero ver en la lista de ubicaciones de la pantalla de edificios y ubicaciones la nueva ubicaciOn ingresada

Examples:
|cuenta     |organizacion|canal            |producto               |departamento|ciudad  |direccion        |descripcion  |actividad|
|C001888888 |Sura        |Canal Tradicional|Multiriesgo corporativo|Antioquia   |Medellin|CR 44 A # 45 - 00|Edificio Core|Acabado de productos textiles|



Scenario: Agregar una nueva ubicacion "bloqueante" en una poliza de MRC
Given estoy cotizando una poliza de MRC en cuenta <cuenta>
When seleccione la organizacion <organizacion>
And seleccione el canal <canal>
And seleccione el producto <producto> para expedir la poliza
And agregue una nueva ubicacion departamento <departamento>, ciuad <ciudad>, direccion <direccion>
And descripcion <descripcion>, actividad economica <actividad>
Then que se muestre el mensaje <mensaje>

Examples:
|cuenta     |organizacion|canal            |producto               |departamento|ciudad  |direccion  |descripcion  |mensaje                                                                            |actividad                    |
|C001888888 |Sura        |Canal Tradicional|Multiriesgo corporativo|Antioquia   |Medellin|CR 65 45 45|Edificio Core|La dirección un riesgo no estandar y debe ser analizado por el Comité de Evaluación|Acabado de productos textiles|



Scenario: Validar direccion al agregar una nueva ubicacion en una poliza de MRC
Given estoy cotizando una poliza de MRC en cuenta <cuenta>
When seleccione la organizacion <organizacion>
And seleccione el canal <canal>
And seleccione el producto <producto> para expedir la poliza
And agregue una nueva ubicacion departamento <departamento>, ciuad <ciudad>, direccion <direccion>
And descripcion <descripcion>, actividad economica <actividad>
Then que se muestre el mensaje <mensaje>

Examples:
|cuenta     |organizacion|canal            |producto               |departamento|ciudad  |direccion     |descripcion  |mensaje                                 |actividad                    |
|C001888888 |Sura        |Canal Tradicional|Multiriesgo corporativo|Antioquia   |Medellin|2X´H !2 ~0+ **|Edificio Core|La dirección 2X´H !2 ~0+ ** no es válida|Acabado de productos textiles|

