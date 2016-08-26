expedicion de poliza mrc peps bloqueo alerta

Meta:

@issue #CDSEG-1653
@PEPS - CP - Bloqueo por warning
@Automatizador: Jonathan Mejia Leon
Sprint 5

Narrative:
Como usuario de policy center
Se requiere expedir la cotización para obtener el número de la póliza,con
validaciones previas de riesgos consultables para una ubicacion y/o direccion

Scenario: Validacion en MRC de direccion como riesgo consultable
GivenStories: stories/policycenter/login_policy.story
Given Que tengo una cotizacion <cotizacion> y voy a crear una poliza
And 
When voy a expedir una poliza
And confirmo el mensaje de expedir poliza
Then El proceso se debe frenar y debe mostrar el mensaje de error <mensaje>

Examples:
|cotizacion|mensaje                                                                                                                                              |
|22222219  |La dirección es un riesgo no estándar y debe ser analizado por el Comité de Evaluación, por favor tramite el caso con el Gerente o Director Comercial|