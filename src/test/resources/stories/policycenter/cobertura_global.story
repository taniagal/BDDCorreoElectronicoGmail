Meta:

Narrative:
Como usuario PolicyCenter con el papel de agente, RSE , Suscriptor o el Administrador
Quiero ser capaz de entrar y mantener detalles de la ubicación.

Feature: Entrar y mantener detalles de la ubicación


Scenario: Agregar una nueva ubicación en una póliza de MRC.

Given estoy cotizando una poliza de MRC en cuenta <cuenta> y producto <producto>
When vaya a agregar un cobertura global


Examples:
|cuenta     |producto           |departamento|ciudad  |direccion        |descripcion  |actividad|
|C001888888 |Propiedad comercial|Antioquia   |Medellin|KR 44 A # 45 - 00|Edificio Core|Actividad Economica|

