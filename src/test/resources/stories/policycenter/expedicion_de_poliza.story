Expedicion De Poliza

Meta:

@issue #SUGWUSC-15128

Narrative:
Como usuario de policy center
Se requiere expedir la cotización para obtener el número de la póliza,con
validaciones previas de riesgos consultables y Personas Publicamente Expuestas (PEPS)

Scenario: Validacion de identificacion de participantes PEPS y riesgos asegurados autos
GivenStories: stories/policycenter/login_policy.story
Given Que tengo una cotizacion <cotizacion> y voy a crear una poliza
When voy a expedir una poliza
And confirmo el mensaje de expedir poliza
Then El proceso se debe frenar y debe mostrar el mensaje de error <mensaje>
And cuando voy a expedir la poliza nuevamente permite expedir la poliza
And debe mostrar el resumen de la poliza expedida con la informacion de cotizacion <infoCotizacion>, poliza <infoPoliza>, administrador de contizaciones <admorCotizacion>, nueva cotizacion <nuevaCotizacion>, escritorio <escritorio>

Examples:
| cotizacion | mensaje                                                                                                      | infoCotizacion                | infoPoliza      | admorCotizacion                                      | nuevaCotizacion                                | escritorio       |
!-- PEPS: Asegurado - Tomador - Tomador adicional - Interes adicional
| 22222238   | FRANK RAMIREZ ALZATE con CEDULA DE CIUDADANIA - 123456 es un riesgo no estándar y debe ser autorizado.       | Ver cotización (N.° 22222238) | Ver póliza (N.° | Ir al administrador de cotizaciones para esta cuenta | Hacer una cotización para una cuenta diferente | Ir al escritorio |
| 22222228   | CAROLINA OCHOA con CEDULA DE CIUDADANIA - 71318883 es un riesgo no estándar y debe ser autorizado.           | Ver cotización (N.° 22222228) | Ver póliza (N.° | Ir al administrador de cotizaciones para esta cuenta | Hacer una cotización para una cuenta diferente | Ir al escritorio |
| 22222228   | ANTONIO RESTREPO con CEDULA DE CIUDADANIA - 71123456 es un riesgo no estándar y debe ser autorizado.         | Ver cotización (N.° 22222228) | Ver póliza (N.° | Ir al administrador de cotizaciones para esta cuenta | Hacer una cotización para una cuenta diferente | Ir al escritorio |
| 22222228   | GLADYS OCHOA con CEDULA DE CIUDADANIA - 94372371 es un riesgo no estándar y debe ser autorizado.             | Ver cotización (N.° 22222228) | Ver póliza (N.° | Ir al administrador de cotizaciones para esta cuenta | Hacer una cotización para una cuenta diferente | Ir al escritorio |
!-- Riesgos Consultables: Tomador - Asegurado - Placa, motor, chasis
| 22222210   | JOSE PAEZ ALZATE, El tomador es un riesgo no estandar y no es posible gestionar la solicitud por este canal. | Ver cotización (N.° 22222210) | Ver póliza (N.° | Ir al administrador de cotizaciones para esta cuenta | Hacer una cotización para una cuenta diferente | Ir al escritorio |
| 22222227   | DIEGO VELEZ, El asegurado es un riesgo no estandar y no es posible gestionar la solicitud por este canal.    | Ver cotización (N.° 22222227) | Ver póliza (N.° | Ir al administrador de cotizaciones para esta cuenta | Hacer una cotización para una cuenta diferente | Ir al escritorio |
| 22222226   | T64497, La placa es un riesgo no estándar y no es posible gestionar la solicitud por este canal.             | Ver cotización (N.° 22222226) | Ver póliza (N.° | Ir al administrador de cotizaciones para esta cuenta | Hacer una cotización para una cuenta diferente | Ir al escritorio |
| 22222226   | AB3C2, El motor es un riesgo no estándar y no es posible gestionar la solicitud por este canal.              | Ver cotización (N.° 22222226) | Ver póliza (N.° | Ir al administrador de cotizaciones para esta cuenta | Hacer una cotización para una cuenta diferente | Ir al escritorio |
| 22222226   | CH212121, El chasis es un riesgo no estándar y no es posible gestionar la solicitud por este canal.          | Ver cotización (N.° 22222226) | Ver póliza (N.° | Ir al administrador de cotizaciones para esta cuenta | Hacer una cotización para una cuenta diferente | Ir al escritorio |

Scenario: Validacion de identificacion de participantes PEPS y riesgos asegurados propiedad comercial
Given Que tengo una cotizacion <cotizacion> y voy a crear una poliza
When voy a expedir una poliza
And confirmo el mensaje de expedir poliza
Then El proceso se debe frenar y debe mostrar el mensaje de error <mensaje>

Examples:
|cotizacion|mensaje|
!-- PEPS: Tomador
|22222237|FRANK RAMIREZ ALZATE con CEDULA DE CIUDADANIA - 123456 es un riesgo no estándar y debe ser autorizado.|
!-- Riesgos consultables: Tomador - interes adicional
|22222211|JOSE PAEZ ALZATE, El tomador es un riesgo no es estandar y debe ser analizado por el Comité de Evaluación, por favor tramite el caso con el Gerente o Director Comercial.|

Scenario: Validacion de riesgos consultables para intereses adicionales
Meta:
@manual
Given Que tengo una cotizacion <cotizacion> y voy a crear una poliza
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
Then debe mostrar el resumen de la poliza expedida con la informacion de cotizacion <infoCotizacion>, poliza <infoPoliza>, administrador de contizaciones <admorCotizacion>, nueva cotizacion <nuevaCotizacion>, escritorio <escritorio>

Examples:
|cotizacion|infoCotizacion|infoPoliza|admorCotizacion|nuevaCotizacion|escritorio|
|22222225|Ver cotización (N.° 22222225)|Ver póliza (N.°|Ir al administrador de cotizaciones para esta cuenta|Hacer una cotización para una cuenta diferente|Ir al escritorio|
|22223226|Ver cotización (N.° 22223226)|Ver póliza (N.°|Ir al administrador de cotizaciones para esta cuenta|Hacer una cotización para una cuenta diferente|Ir al escritorio|

