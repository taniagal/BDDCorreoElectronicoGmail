Meta:

Narrative:
As a user
I want to perform an action
So that I can achieve a business goal

Feacture: Registro de Coaseguro

Scenario: agregar el coaseguro a una póliza
Given estoy cotizando una poliza de MRC en cuenta <cuenta>, organizacion <organizacion> y agente <agente>
And puedo ingresar los datos del coaseguro
When agregue las aseguradoras y su porcentaje de participacion
Then el proceso debe ser exitoso

Examples:
|cuenta     |organizacion|agente|
|C000888888 |Sura        |INT-3 |


Scenario: agregar el coaseguro a una póliza con una sola aseguradora
Given estoy cotizando una poliza de MRC en cuenta <cuenta>, organizacion <organizacion> y agente <agente>
And puedo ingresar los datos del coaseguro
When no agregue mas de una aseguradora y/o porcentaje de participacion
Then debe aparecer el mensaje <mensaje> y/o mensaje <mensaje2>

Examples:
|cuenta     |organizacion|agente|mensaje|mensaje2|
|C000888888 |Sura        |INT-3 |Aseguradora : Falta el campo obligatorio "Aseguradora"|% de participación : Falta el campo obligatorio "% de participación"|



Scenario: agregar el coaseguro a una póliza sin el porcentaje de participacion completo
Given estoy cotizando una poliza de MRC en cuenta <cuenta>, organizacion <organizacion> y agente <agente>
And puedo ingresar los datos del coaseguro
When el porcentaje de paticipacion total no sea 100%
Then debe aparecer el mensaje <mensaje>

Examples:
|cuenta     |organizacion|agente      |mensaje|
|C000888888 |Sura        |INT-3 |El total de % de participación de coaseguro debe ser igual al 100%|
