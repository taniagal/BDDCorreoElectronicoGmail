Meta:

Narrative:
Como usuario de policy center
Se requiere expedir la cotización para obtener el número de la póliza,con
validaciones previas de riesgos consultables y Personas Publicamente Expuestas (PEPS)


Scenario: Validacion de cancelar expedicion de poliza
GivenStories: stories/policycenter/login_policy.story
Given Que tengo una cotizacion <cotizacion> y voy a crear una poliza
When voy a expedir una poliza
And cancelo el mensaje <mensaje> de expedir poliza
Then debe volver a la pantalla de cotizacion

Examples:
|cotizacion|mensaje|
|22222225|¿Está seguro de que desea expedir esta póliza?|

Scenario: Validacion de resumen de la poliza al expedirla
Given Que tengo una cotizacion <cotizacion> y voy a crear una poliza
When voy a expedir una poliza
And confirmo el mensaje de expedir poliza
Then debe mostrar el resumen de la poliza expedida con numero de la cotizacion <cotizacion> y numero de poliza <poliza>

Examples:
|cotizacion|poliza|
|22222225|Ver póliza (N.°|

Scenario: Validacion de identificacion de cliente PEP en Asegurado
Given Que tengo una cotizacion <cotizacion> y voy a crear una poliza
When voy a expedir una poliza
And confirmo el mensaje de expedir poliza
Then El proceso se debe frenar y debe mostrar el mensaje <mensaje> que retorna el servicio de riesgos

Examples:
|cotizacion|mensaje|
|22222227|DIEGO VELEZ, El asegurado es un riesgo no estandar y no es posible gestionar la solicitud por este canal.|

Scenario: Validacion placa, motor y chasis que son riesgo consultable
Given Que tengo una cotizacion <cotizacion> y voy a crear una poliza
When voy a expedir una poliza
And confirmo el mensaje de expedir poliza
Then El proceso se debe frenar y debe mostrar el mensaje <mensaje> que retorna el servicio de riesgos

Examples:
|cotizacion|mensaje|
|22222226|xxxxx|








Scenario: Validación de riesgo consultable al momento de querer expedir la póliza cuando
el tomador sea un riesgo consultable

GivenStories: stories/policycenter/login_policy.story
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










