Meta:

Narrative:
As a user
I want to perform an action
So that I can achieve a business goal

Feacture: Registro de Coaseguro

Scenario: agregar el coaseguro a una póliza
Given estoy cotizando una poliza de MRC en cuenta <cuenta>, organizacion <organizacion> y agente <agente>
And puedo ingresar los datos del coaseguro

Examples:
|cuenta     |organizacion|agente    |
|C000888888 |Ca          |501-002542|
