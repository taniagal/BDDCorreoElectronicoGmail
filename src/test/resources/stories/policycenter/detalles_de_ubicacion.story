Detalles De Ubicacion

Meta:
@issue #CDSEG-915
@automatizador Nelson Mosquera
@sprint 2

Narrative:
Como usuario PolicyCenter con el papel de agente, RSE , Suscriptor o el Administrador
Quiero ser capaz de entrar y mantener detalles de la ubicación.

Feature: Entrar y mantener detalles de la ubicación


Scenario: Agregar una nueva ubicacion en una poliza de MRC
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza:
|cuenta    |organizacion|producto               |canal            |
|C001888888|Sura        |Multiriesgo corporativo|Canal Tradicional|
When agregue una nueva ubicacion departamento <departamento>, ciuad <ciudad>, direccion <direccion>
And descripcion <descripcion>, actividad economica <actividad>
Then espero ver en la lista de ubicaciones de la pantalla de edificios y ubicaciones la nueva ubicaciOn ingresada

Examples:
|departamento|ciudad  |direccion        |descripcion  |actividad|
|ANTIOQUIA   |MEDELLIN|CR 44 A # 45 - 00|Edificio Core|Acabado de productos textiles|



Scenario: Agregar una nueva ubicacion "bloqueante" en una poliza de MRC
Meta:
@Story CDSEG-731
@URL https://jira.suramericana.com.co/browse/CDSEG-731
@Informador alejandro esteban villada marin
@Sprint 4

Given estoy cotizando una poliza:
|cuenta    |organizacion|producto               |canal           |
|C001888888|Sura       |Multiriesgo corporativo|Canal Tradicional|
When agregue una nueva ubicacion departamento <departamento>, ciuad <ciudad>, direccion <direccion>
And descripcion <descripcion>, actividad economica <actividad>
Then que se muestre el mensaje <mensaje>

Examples:
|departamento|ciudad  |direccion         |descripcion  |mensaje                                                    |actividad                    |
|ANTIOQUIA   |MEDELLIN|CR 65 45 45  |Edificio Core|La dirección es un riesgo no estándar y debe ser analizado por el Comité de Evaluación, por favor tramite el caso con el Gerente o Director Comercial.|Acabado de productos textiles|



Scenario: Validar direccion al agregar una nueva ubicacion en una poliza de MRC
Given estoy cotizando una poliza:
|cuenta    |organizacion|producto               |canal           |
|C001888888|Sura       |Multiriesgo corporativo|Canal Tradicional|
When agregue una nueva ubicacion departamento <departamento>, ciuad <ciudad>, direccion <direccion>
And descripcion <descripcion>, actividad economica <actividad>
Then que se muestre el mensaje <mensaje>

Examples:
|departamento|ciudad  |direccion     |descripcion  |mensaje                                 |actividad                    |
|ANTIOQUIA   |MEDELLIN|2X´H !2 ~0+ **|Edificio Core|La dirección 2X´H !2 ~0+ ** no es válida|Acabado de productos textiles|
