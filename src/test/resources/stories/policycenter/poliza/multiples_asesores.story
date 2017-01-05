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
 |codigoAsesor                 |porcentaje                     |
 |499,784,459,852,987,963,123  |30,10,10,10,10,10,10,10        |
Then Debe quedar un asesor con rol líder.
Examples:
||
||
