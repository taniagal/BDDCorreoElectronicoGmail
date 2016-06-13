Meta:

Narrative:
Como usuario de policy center
Se requiere expedir la cotización para obtener el número de la póliza,con
validaciones previas de riesgos consultables y Personas Publicamente Expuestas (PEPS)

Scenario: Validacion de mensaje de confirmacion antes de expedir la po
GivenStories: stories/policycenter/login_policy.story
Given Que tengo una cotizacion <cotizacion> y voy a crear una poliza
When voy a expedir una poliza
And confirmo el mensaje <mensaje> de expedir poliza
Then debe mostrar el resumen de la poliza expedida con numero de la cotizacion <numCotizacion> y numero de poliza <poliza>

Examples:
|cotizacion|mensaje|numCotizacion|poliza|
|22222237|xxxxx|xxxxxx|xxxxxx|











