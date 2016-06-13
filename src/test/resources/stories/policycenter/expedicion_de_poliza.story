Meta:

Narrative:
Como usuario de policy center
Se requiere expedir la cotización para obtener el número de la póliza,con
validaciones previas de riesgos consultables y Personas Publicamente Expuestas (PEPS)

Scenario: Validacion de mensaje de confirmacion antes de expedir la po
GivenStories: stories/policycenter/login_policy.story
Given Que tengo una cotizacion <cotizacion> y voy a crear una poliza
When voy a expedir una poliza
And confirmo el mensaje de expedir poliza
Then debe mostrar el resumen de la poliza expedida con numero de la cotizacion <numCotizacion> y numero de poliza <poliza>

Examples:
|cotizacion|numCotizacion|poliza|
|22222237|xxxxxx|xxxxxx|

Scenario: Validacion de identificacion de cliente PEP en tomador
Given Que tengo una cotizacion <cotizacion> y voy a crear una poliza
When voy a expedir una poliza
And confirmo el mensaje de expedir poliza
Then El proceso se debe frenar y debe mostrar el mensaje <mensaje> que retorna el servicio de riesgos

Examples:
|cotizacion|mensaje|
|22222237|xxxxx|










