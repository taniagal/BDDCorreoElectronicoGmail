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
|22223226|¿Está seguro de que desea expedir esta póliza?|

Scenario: Validacion de resumen de la poliza al expedirla
Given Que tengo una cotizacion <cotizacion> y voy a crear una poliza
When voy a expedir una poliza
And confirmo el mensaje de expedir poliza
Then debe mostrar el resumen de la poliza expedida con la informacion de cotizacion <infoCotizacion>, poliza <infoPoliza>, administrador de contizaciones <admorCotizacion>, nueva cotizacion <nuevaCotizacion>, escritorio <escritorio>

Examples:
|cotizacion|infoCotizacion|infoPoliza|admorCotizacion|nuevaCotizacion|escritorio|
|22222225|Ver cotización (N.° 22222225)|Ver póliza (N.°|Ir al administrador de cotizaciones para esta cuenta|Hacer una cotización para una cuenta diferente|Ir al escritorio|
|22223226|Ver cotización (N.° 22223226)|Ver póliza (N.°|Ir al administrador de cotizaciones para esta cuenta|Hacer una cotización para una cuenta diferente|Ir al escritorio|

Scenario: Validacion de identificacion de cliente PEP en Asegurado
Given Que tengo una cotizacion <cotizacion> y voy a crear una poliza
When voy a expedir una poliza
And confirmo el mensaje de expedir poliza
Then El proceso se debe frenar y debe mostrar el mensaje <mensaje> que retorna el servicio de riesgos

Examples:
|cotizacion|mensaje|
|22222237|FRANK RAMIREZ ALZATE con el(los) rol(es) (ASEGURADO NOMBRADO, CONDUCTOR, TITULAR DE LA CUENTA) es un riesgo no estándar y debe ser autorizado.
