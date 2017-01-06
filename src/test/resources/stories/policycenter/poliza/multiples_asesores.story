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
 |mensaje                                                                           |codigoAsesor                   |porcentaje       |rol            |
 |El total de la participación de todos los asesores en la póliza debe ser del 100%.|as1,as2,as3,as4,as5,as6,as7,as8|100,2,3,4,5,6,7,8|Lider,Adicional,Adicional,Adicional,Adicional,Adicional,Adicional,Adicional|
Then Debe quedar un asesor con rol líder.
Examples:
||
||
