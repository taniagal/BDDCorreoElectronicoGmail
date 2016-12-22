Expedicion De Poliza Riesgo Direccion

Meta:
@lote2
@issue #SUGWUSC-15128
@tag automator: Jonathan_Mejia_Leon
@local
Sprint 5

Narrative:
Como usuario de policy center
Se requiere expedir la cotización para obtener el número de la póliza,con
validaciones previas de riesgos consultables para una ubicacion y/o direccion

Scenario: Validacion en MRC de direccion como riesgo consultable
GivenStories: stories/policycenter/login_policy.story
Given Que tengo una cotizacion <cotizacion> y voy a crear una poliza
When voy a expedir una poliza
And confirmo el mensaje de expedir poliza
Then El proceso se debe frenar y debe mostrar el mensaje de error <mensaje> y <mensaje2>

Examples:
|cotizacion|mensaje                                                                                                                                            |mensaje2                                                                                                                                              |
|22222219  |El tomador es un riesgo no estándar y debe ser analizado por el Comité de Evaluación, por favor tramite el caso con el Gerente o Director Comercial|La dirección es un riesgo no estándar y debe ser analizado por el Comité de Evaluación, por favor tramite el caso con el Gerente o Director Comercial.|