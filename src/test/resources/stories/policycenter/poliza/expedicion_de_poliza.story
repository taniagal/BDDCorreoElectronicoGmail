Meta:
@lote6
@issue #SUGWUSC-15128, CDSEG-856
@tag equipo: 1, sprint: 2
@local

Narrative:
Como usuario de policy center
Se requiere expedir la cotización para obtener el número de la póliza,con
validaciones previas de riesgos consultables y Personas Publicamente Expuestas (PEPS)

Scenario: Validacion de identificacion de participantes PEPS y riesgos asegurados propiedad comercial
GivenStories: stories/policycenter/login_policy.story
Given Que tengo una cotizacion <cotizacion> y voy a crear una poliza
When voy a expedir una poliza
And confirmo el mensaje de expedir poliza
Then El proceso se debe frenar y debe mostrar el mensaje de error <mensaje>

Examples:
|cotizacion|mensaje|
|22222212  |JOSE PAEZ ALZATE, El tomador es un riesgo no estándar y debe ser analizado por el Comité de Evaluación, por favor tramite el caso con el Gerente o Director Comercial.|

Scenario: Validacion de identificacion de participantes PEPS y riesgos asegurados para autos
Given Que tengo una cotizacion <cotizacion> y voy a crear una poliza
When voy a expedir una poliza
And confirmo el mensaje de expedir poliza
Then El proceso se debe frenar y debe mostrar el mensaje de error <mensaje>

Examples:
| cotizacion | mensaje     |
| 22222210   | JOSE PAEZ ALZATE, El tomador es un riesgo no estándar y no es posible gestionar la solicitud por este canal.^DIEGO VELEZ, El asegurado es un riesgo no estándar y no es posible gestionar la solicitud por este canal.^T64497, La placa es un riesgo no estándar y no es posible gestionar la solicitud por este canal.^AB3C2, El motor es un riesgo no estándar y no es posible gestionar la solicitud por este canal.^CH212121, El chasis es un riesgo no estándar y no es posible gestionar la solicitud por este canal.|

Scenario: Validacion de riesgos consultables para intereses adicionales
Meta:
@manual
Given que tengo una cotizacion y voy a crear una poliza
When voy a expedir una poliza
And confirmo el mensaje de expedir poliza
Then debe enviar un mensaje a un buzon previamente configurado cuando existe un interes adicional riesgo consultable