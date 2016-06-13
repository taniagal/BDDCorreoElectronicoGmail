Meta:

Narrative:
Como usuario de policy center
Se requiere expedir la cotización para obtener el número de la póliza,con
validaciones previas de riesgos consultables y Personas Publicamente Expuestas (PEPS)

Scenario: Validación de riesgo consultable al momento de querer expedir la póliza cuando
el tomador sea un riesgo consultable

GivenStories: stories/policycenter/login_policy.story
Given Estoy ingresando la informacion de una poliza para ser expedida <numCuenta>
When   vaya a expedir una poliza nueva para una propiedad comercial <nomProducto> donde el tomador sea un riesgo consultable
Then  Se debe bloquear la expedicion
And   debe mostrar el mensaje <mensaje>


Examples:
|numCuenta  |mensaje                  |nomProducto        |
|C000777779 |es un riesgo consuultable|Propiedad comercial|

GivenStories: stories/policycenter/login_policy.story
Given Estoy ingresando la informacion de una poliza para ser expedida <numCuenta>
When   vaya a expedir una poliza nueva para una propiedad comercial <nomProducto> donde el tomador sea un riesgo consultable
Then  Se debe bloquear la expedicion
And   debe mostrar el mensaje <mensaje>


Examples:
|numCuenta  |mensaje                  |nomProducto        |
|C000777779 |es un riesgo consuultable|Propiedad comercial|








