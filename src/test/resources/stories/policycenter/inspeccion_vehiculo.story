Inspeccion Vehiculo

Meta: @lote2

@issue #CDSEG-751
@tag automator: diego_cardona_acevedo
@local
@Sprint 5

Narrative:
Como usuario de PolicyCenter
Quiero ser capaz consultar de forma automatica si un vehiculo requiere o no inspeccion.

Scenario: Consulta de inspeccion no valida y busqueda en el modelo de seguros
GivenStories: stories/policycenter/login_policy.story
Given que voy a buscar la cuenta <numCuenta>
When estoy expidiendo una poliza de autos
And seleccione el producto para expedir la poliza
When ingrese los datos del asegurado
And el vehiculo tenga inspeccion no valida
And la placa <placa> estuvo vigente en la compañia
Then se debe recuperar los siguientes datos:
|modelo|codigoFasecolda|motor|chasis|valorAccesorios|valorAccesoriosEspeciales|
|2016  |00601182       |     |      |0              |0                        |
And el valor asegurado <valorAsegurado> se debe consultar y traer de la tabla fasecolda

Examples:
|numCuenta  |placa |valorAsegurado|
|C1060447895|HZR123|165900000,00  |

Scenario: Consulta de placa en el modelo de seguros la cual esta cancelada
Given que voy a buscar la cuenta <numCuenta>
When estoy expidiendo una poliza de autos
And seleccione el producto para expedir la poliza
When ingrese los datos del asegurado
And el vehiculo tenga inspeccion
And la placa <placa> estuvo vigente pero ahora esta cancelada
Then se debe recuperar los siguientes datos:
|modelo|codigoFasecolda|motor         |chasis           |valorAccesorios|valorAccesoriosEspeciales|
|2013  |01601240       |B12D1740274KC3|9GAMF48D1DB016615|0              |0                        |
And el valor asegurado <valorAsegurado> se debe consultar y traer de la tabla fasecolda

Examples:
|numCuenta  |placa |valorAsegurado|
|C1060447895|MJK289|21800000,00   |

Scenario: Consultar inspeccion valida en SIA
Given se ha realizado la cotizacion <cotizacion>
And se tiene la informacion de la placa <placa> del vehiculo ingresada
When la inspeccion es valida en SIA
Then se debe permitir expedir la poliza
And la fecha de inspeccion debe ser la fecha de inicio de vigencia de la poliza

Examples:
|cotizacion |placa |
|22221122   |USU422|

Scenario: Vehiculo sin requisito inspeccion para poder expedir
Given se ha realizado la cotizacion <cotizacion>
When se identifique que el vehiculo <placa> no cumple con el requisito de inspeccion
And llegue a la expedicion de la poliza
Then se debe mostrar en la pantalla un mensaje <mensaje> indicando que el vehiculo no tiene inspeccion
And generar el UW Issue <mensaje> y no permitir expedir

Examples:
|cotizacion|placa  |mensaje                                                                       |
|22221222  |COR219 |El vehículo no tiene una inspección vigente a la fecha de ingreso del riesgo. |

Scenario: Consulta requisito inspeccion en el modelo
Meta: @lote2
@manual
Given se tiene la informacion de la placa del vehiculo ingresada
When el vehiculo tenga inspeccion no valida o no tenga inspeccion
And la placa estuvo vigente en la compania
And la fecha de cancelacion o exclusion no sea mayor a 3 dias
Then se debe permitir expedir la poliza
And el valor asegurado se debe consultar
And traer de la tabla fasecolda

Examples:
| |
| |

Scenario: Consulta requisito inspeccion en WS fasecolda
Meta: @lote2
@manual
Given se tiene la informacion de la placa del vehiculo ingresada
When se haga la busqueda de informacion en el WS de fasecolda
And se cumplan las condiciones para el requisito de inspeccion
Then se debe permitir expedir la poliza
And el valor asegurado se debe consultar
And traer de la tabla fasecolda

Examples:
| |
| |

