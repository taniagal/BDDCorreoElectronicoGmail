Meta:

Narrative:
Como usuario PolicyCenter con el papel de agente, RSE , Suscriptor o el Administrador
Quiero ser capaz de entrar y mantener detalles de la ubicación.

Feature: Entrar y mantener detalles de la ubicación

Scenario: crear una cuenta para un contacto persona natural.

Given estoy cotizando una poliza de MRC en cuenta <cuenta>, organizacion <organizacion> y agente <agente>
When agregue una nueva ubicacion departamento <departamento>, ciuad <ciudad>, direccion <direccion>, descripcion <descripcion>
Then espero ver en la lista de ubicaciones de la pantalla de Edificios y ubicaciones la nueva ubicaciOn ingresada

Examples:
|cuenta     |organizacion|agente    |departamento|ciudad  |direccion    |descripcion  |
|C000888888 |KTN         |501-002542|Antioquia   |Medellin|Calle 44a #45|Edificio Core|

