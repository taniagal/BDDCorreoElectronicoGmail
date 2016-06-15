Meta:

Narrative:
Como usuario PolicyCenter con el papel de agente, RSE , Suscriptor o el Administrador
Quiero ser capaz de entrar y mantener detalles de la ubicación.

Feature: Entrar y mantener detalles de la ubicación


Scenario: Agregar una nueva ubicacion en una poliza de MRC.

Given estoy cotizando una poliza de MRC en cuenta <cuenta> y producto <producto>
When agregue una nueva ubicacion departamento <departamento>, ciuad <ciudad>, direccion <direccion>
And descripcion <descripcion>, actividad economica <actividad>
Then espero ver en la lista de ubicaciones de la pantalla de edificios y ubicaciones la nueva ubicaciOn ingresada

Examples:
|cuenta     |producto           |departamento|ciudad  |direccion        |descripcion  |actividad|
|C001888888 |Propiedad comercial|Antioquia   |Medellin|KR 44 A # 45 - 00|Edificio Core|Acabado de productos textiles|



Scenario: Agregar una nueva ubicacion "bloqueante" en una poliza de MRC.

Given estoy cotizando una poliza de MRC en cuenta <cuenta> y producto <producto>
When agregue una nueva ubicacion departamento <departamento>, ciuad <ciudad>, direccion <direccion>
And descripcion <descripcion>, actividad economica <actividad>
Then que se muestre el mensaje <mensaje>

Examples:
|cuenta     |producto           |departamento|ciudad  |direccion         |descripcion  |mensaje                                                    |actividad                    |
|C001888888 |Propiedad comercial|Antioquia   |Medellin|KR 65 # 25 - 36   |Edificio Core|La dirección es un riesgo no estandar y debe ser autorizado|Acabado de productos textiles|



Scenario: Validar direccion al agregar una nueva ubicacion en una poliza de MRC.

Given estoy cotizando una poliza de MRC en cuenta <cuenta> y producto <producto>
When agregue una nueva ubicacion departamento <departamento>, ciuad <ciudad>, direccion <direccion>
And descripcion <descripcion>, actividad economica <actividad>
Then que se muestre el mensaje de direccion <mensaje>

Examples:
|cuenta     |producto           |departamento|ciudad  |direccion     |descripcion  |mensaje                   |actividad                    |
|C001888888 |Propiedad comercial|Antioquia   |Medellin|2X´H !2 ~0+ **|Edificio Core|La dirección  no es válida|Acabado de productos textiles|

