Meta:
@sprint 2
@tag team: 4


Narrative:
Como usuario de PolicyCenter
quiero poder agregar la información de coseguro aceptado o cedido en una póliza nueva de Autos o MRC.


Scenario: Agregar el coaseguro a una poliza
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza:
|cuenta     |organizacion|producto               |canal            |
|C1060447895|Sura        |Multiriesgo corporativo|Canal Tradicional|
When puedo ingresar los datos del coaseguro
And agregue las aseguradoras y su porcentaje de participacion
Then el proceso debe ser exitoso

Examples:
||
||


Scenario: Agregar el coaseguro a una poliza con una sola aseguradora
Given estoy cotizando una poliza:
|cuenta     |organizacion|producto               |canal           |
|C1060447895|Sura       |Multiriesgo corporativo|Canal Tradicional|
When puedo ingresar los datos del coaseguro
And no agregue mas de una aseguradora y/o porcentaje de participacion
Then debe aparecer el mensaje <mensaje> y/o mensaje <mensaje2>

Examples:
|mensaje|mensaje2|
|Aseguradora : Falta el campo obligatorio "Aseguradora"|% de participación : Falta el campo obligatorio "% de participación"|



Scenario: Agregar el coaseguro a una poliza sin el porcentaje de participacion completo
Given estoy cotizando una poliza:
|cuenta     |organizacion|producto               |canal           |
|C1060447895|Sura       |Multiriesgo corporativo|Canal Tradicional|
When puedo ingresar los datos del coaseguro
And el porcentaje de paticipacion total no sea 100%
Then debe aparecer el mensaje <mensaje>

Examples:
|mensaje|
|El total de % de participación de coaseguro debe ser igual al 100%|
