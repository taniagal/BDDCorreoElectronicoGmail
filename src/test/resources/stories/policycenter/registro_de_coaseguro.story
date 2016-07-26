Meta:
@issue #SUGWUSC-14930

Narrative:
Como usuario de PolicyCenter
quiero poder agregar la información de coseguro aceptado o cedido en una póliza nueva de Autos o MRC.

Feacture: Registro de Coaseguro

Scenario: Agregar el coaseguro a una poliza
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza de MRC en cuenta <cuenta>
When seleccione la organizacion <organizacion>
And seleccione el canal <canal>
And seleccione el producto <producto> para expedir la poliza
And puedo ingresar los datos del coaseguro
And agregue las aseguradoras y su porcentaje de participacion
Then el proceso debe ser exitoso

Examples:
|cuenta     |organizacion|canal            |producto               |
|C001888888 |Sura        |Canal Tradicional|Multiriesgo corporativo|


Scenario: Agregar el coaseguro a una poliza con una sola aseguradora
Given estoy cotizando una poliza de MRC en cuenta <cuenta>
When seleccione la organizacion <organizacion>
And seleccione el canal <canal>
And seleccione el producto <producto> para expedir la poliza
And puedo ingresar los datos del coaseguro
And no agregue mas de una aseguradora y/o porcentaje de participacion
Then debe aparecer el mensaje <mensaje> y/o mensaje <mensaje2>

Examples:
|cuenta     |organizacion|canal            |producto             |mensaje|mensaje2|
|C001888888 |Sura        |Canal Tradicional|Multiriesgo corporativo|Aseguradora : Falta el campo obligatorio "Aseguradora"|% de participación : Falta el campo obligatorio "% de participación"|



Scenario: Agregar el coaseguro a una poliza sin el porcentaje de participacion completo
Given estoy cotizando una poliza de MRC en cuenta <cuenta>
When seleccione la organizacion <organizacion>
And seleccione el canal <canal>
And seleccione el producto <producto> para expedir la poliza
And puedo ingresar los datos del coaseguro
And el porcentaje de paticipacion total no sea 100%
Then debe aparecer el mensaje <mensaje>

Examples:
|cuenta     |organizacion|canal            |producto               |mensaje|
|C001888888 |Sura        |Canal Tradicional|Multiriesgo corporativo|El total de % de participación de coaseguro debe ser igual al 100%|
