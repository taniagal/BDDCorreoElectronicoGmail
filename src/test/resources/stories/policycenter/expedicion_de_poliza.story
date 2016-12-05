Expedicion De Poliza

Meta: @lote3

@issue #SUGWUSC-15128, CDSEG-856
@Automatizador Jonathan Mejia, Eliana Alvarez
@tag automator: eliana_alvarez, sprint:2
@Sprint 2
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
|22222211|JOSE PAEZ ALZATE, El tomador es un riesgo no es estándar y debe ser analizado por el Comité de Evaluación, por favor tramite el caso con el Gerente o Director Comercial.|

Scenario: Validacion de identificacion de participantes PEPS y riesgos asegurados para autos
Given Que tengo una cotizacion <cotizacion> y voy a crear una poliza
When voy a expedir una poliza
And confirmo el mensaje de expedir poliza
Then El proceso se debe frenar y debe mostrar el mensaje de error <mensaje>

Examples:
| cotizacion | mensaje                                                                                                                                                                                                                                                                                                  |
| 22222210   | JOSE PAEZ ALZATE, El tomador es un riesgo no estándar y no es posible gestionar la solicitud por este canal.                                                                                                                                                                                             |
| 22222227   | DIEGO VELEZ, El asegurado es un riesgo no estándar y no es posible gestionar la solicitud por este canal.                                                                                                                                                                                                |
| 22222226   | T64497, La placa es un riesgo no estándar y no es posible gestionar la solicitud por este canal.^AB3C2, El motor es un riesgo no estándar y no es posible gestionar la solicitud por este canal.^CH212121, El chasis es un riesgo no estándar y no es posible gestionar la solicitud por este canal.     |

Scenario: Validacion de riesgos consultables para intereses adicionales
Meta: @lote2
@manual
Given que tengo una cotizacion y voy a crear una poliza
When voy a expedir una poliza
And confirmo el mensaje de expedir poliza
Then debe enviar un mensaje a un buzon previamente configurado cuando existe un interes adicional riesgo consultable
Examples:
|cotizacion|
|22222227|

Scenario: Validacion de cancelar expedicion de poliza
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
And valide la solicitud de requisitos <requisitos>
Then debe mostrar el resumen de la poliza expedida con la informacion de cotizacion <infoCotizacion>, poliza <infoPoliza>, administrador de contizaciones <admorCotizacion>, nueva cotizacion <nuevaCotizacion>, escritorio <escritorio>

Examples:
|cotizacion |infoCotizacion                 |infoPoliza     |admorCotizacion                                        |nuevaCotizacion                                |escritorio         |requisitos                                         |
|22222225   |Ver cotización (N.° 22222225)  |Ver póliza (N.°|Ir al administrador de cotizaciones para esta cuenta   |Hacer una cotización para una cuenta diferente |Ir al escritorio   |Existen requisitos pendientes, por favor verifique.|
|22223226   |Ver cotización (N.° 22223226)  |Ver póliza (N.°|Ir al administrador de cotizaciones para esta cuenta   |Hacer una cotización para una cuenta diferente |Ir al escritorio   |Las restricciones del contrato de reaseguro deben ser validadas manualmente ya que ha indicado que la póliza tiene Fronting|
