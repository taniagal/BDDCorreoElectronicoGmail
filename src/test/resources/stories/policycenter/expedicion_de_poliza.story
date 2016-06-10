Meta:

Narrative:
Como usuario de policy center
Se requiere expedir la cotización para obtener el número de la póliza,con
validaciones previas de riesgos consultables y Personas Publicamente Expuestas (PEPS)

Scenario: Validación de riesgo consultable al momento de querer expedir la póliza cuando
el tomador sea un riesgo consultable

GivenStories: stories/policycenter/login_policy.story
Given Que tengo una cotizacion <cotizacion> y voy a crear una poliza
When   vaya a expedir una poliza nueva para una propiedad comercial <nomProducto> donde el tomador sea un riesgo consultable
Then  Se debe bloquear la expedicion
And   debe mostrar el mensaje <mensaje>


Examples:
|cotizacion|mensaje                  |nomProducto        |
|22222225|es un riesgo consultable|Propiedad comercial|








