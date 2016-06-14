Meta:

Narrative:
Como usuario PolicyCenter con el papel de agente, RSE , Suscriptor o el Administrador
Quiero ser capaz de entrar y mantener detalles de la ubicación.

Feature: Entrar y mantener detalles de la ubicación


Scenario: Agregar una nueva ubicación en una póliza de MRC.

Given estoy cotizando una poliza de MRC en cuenta <cuenta>, organizacion <organizacion> y agente <agente>


Examples:
|cuenta     |organizacion|agente|departamento|ciudad  |direccion        |descripcion  |actividad|
|C000888888 |Propiedad comercial|null - INT-3|Antioquia   |Medellin|KR 44 A # 45 - 00|Edificio Core|Actividad Economica|

