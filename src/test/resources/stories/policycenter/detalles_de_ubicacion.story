Meta:
@issue #SUGWUSC-14470

Narrative:
Como usuario PolicyCenter con el papel de agente, RSE , Suscriptor o el Administrador
Quiero ser capaz de entrar y mantener detalles de la ubicación.

Feature: Entrar y mantener detalles de la ubicación


Scenario: Agregar una nueva ubicación en una póliza de MRC.

Given estoy cotizando una poliza de MRC en cuenta <cuenta>, organizacion <organizacion> y agente <agente>
When agregue una nueva ubicacion departamento <departamento>, ciuad <ciudad>, direccion <direccion>
And descripcion <descripcion>, actividad economica <actividad>
Then espero ver en la lista de ubicaciones de la pantalla de edificios y ubicaciones la nueva ubicaciOn ingresada

Examples:
|cuenta     |organizacion|agente|departamento|ciudad  |direccion        |descripcion  |actividad|
|C000888888 |Sura        |INT-3 |ANTIOQUIA   |MEDELLIN|KR 44 A # 45 - 00|Edificio Core|Actividad Economica|



Scenario: Agregar una nueva ubicación "bloqueante" en una póliza de MRC.

Given estoy cotizando una poliza de MRC en cuenta <cuenta>, organizacion <organizacion> y agente <agente>
When agregue una nueva ubicacion departamento <departamento>, ciuad <ciudad>, direccion <direccion>
And descripcion <descripcion>, actividad economica <actividad>
Then que se muestre el mensaje <mensaje>

Examples:
|cuenta     |organizacion|agente|departamento|ciudad  |direccion        |descripcion  |mensaje                                                    |actividad          |
|C000888888 |Sura        |INT-3 |ANTIOQUIA   |MEDELLIN|KR 65 # 25 -36   |Edificio Core|La dirección es un riesgo no estandar y debe ser autorizado|Actividad Economica|


Scenario: Validar direccion al agregar una nueva ubicación en una póliza de MRC.

Given estoy cotizando una poliza de MRC en cuenta <cuenta>, organizacion <organizacion> y agente <agente>
When agregue una nueva ubicacion departamento <departamento>, ciuad <ciudad>, direccion <direccion>
And descripcion <descripcion>, actividad economica <actividad>
Then que se muestre el mensaje de direccion <mensaje>

Examples:
|cuenta     |organizacion|agente|departamento|ciudad  |direccion     |descripcion  |mensaje                   |actividad          |
|C000888888 |Sura        |INT-3 |ANTIOQUIA   |MEDELLIN|2X´H !2 ~0+ **|Edificio Core|La dirección  no es válida|Actividad Economica|

