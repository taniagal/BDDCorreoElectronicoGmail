multiples_asesores
Meta:

Narrative:
As a user
I want to perform an action
So that I can achieve a business goal
Disponibilidad Detalle Producto

Scenario: Agregar mas de un asesor a una poliza MRC
GivenStories: stories/policycenter/login_policy.story
Given que existe una cuenta activa donde estoy cotizando una poliza:
|cuenta    |organizacion|producto               |canal            |
|C000112400|Sura        |Multiriesgo corporativo|Canal Tradicional|
When Debe permitir el ingreso de máximo 8 asesores en la poliza, validando la participacion
 del 100% de los asesores que intervienen en la póliza:
 |codigoAsesor                   |porcentaje       |rol            |
 |as1,as2,as3,as4,as5,as6,as7,as8|30,10,10,10,10,10,10,10|Lider,Adicional,Adicional,Adicional,Adicional,Adicional,Adicional,Adicional|
Then Debe quedar un asesor con rol líder:
  |rol|
  |Lider|
Examples:
||
||
