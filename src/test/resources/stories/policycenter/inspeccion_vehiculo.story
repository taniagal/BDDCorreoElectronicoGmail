Inspeccion Vehiculo

Meta:

@issue #CDSEG-751
@Automatizador Diego Cardona Acevedo
@Sprint 5

Narrative:
Como usuario de PolicyCenter
Quiero ser capaz consultar de forma automatica si un vehiculo requiere o no inspeccion.

Scenario: Consulta de inspeccion no valida y busqueda en el modelo de seguros
GivenStories: stories/policycenter/login_policy.story
Given que voy a buscar la cuenta <numCuenta>
When estoy expidiendo una poliza de autos
And seleccione la organizacion <organizacion>
And seleccione el canal <canal>
And seleccione el producto <nomProducto> a expedir
And el vehiculo tenga inspeccion no valida
And la placa <placa> estuvo vigente en la compañia
Then se debe recuperar los siguientes datos:
|modelo|codigoFasecolda|motor|chasis|valorAccesorios|valorAccesoriosEspeciales|
|2016  |00601182       |     |      |               |                         |
And el valor asegurado <valorAsegurado> se debe consultar y traer de la tabla fasecolda

Examples:
|numCuenta  |organizacion|canal      |nomProducto|placa |valorAsegurado|
|C000888888 |Bancolombia |Televentas |Autos      |HZR123|165900000.00  |

Scenario: Consulta de placa en el modelo de seguros la cual esta cancelada
Given que voy a buscar la cuenta <numCuenta>
When estoy expidiendo una poliza de autos
And seleccione la organizacion <organizacion>
And seleccione el canal <canal>
And ingrese una nueva cotizacion para vehiculo <nomProducto>
And el vehiculo tenga inspeccion
And la placa <placa> estuvo vigente pero ahora esta cancelada
Then se debe recuperar los siguientes datos:
|modelo|codigoFasecolda|motor         |chasis           |valorAccesorios|valorAccesoriosEspeciales|
|2013  |01601240       |B12D1740274KC3|9GAMF48D1DB016615|               |                         |
And el valor asegurado <valorAsegurado> se debe consultar y traer de la tabla fasecolda

Examples:
|numCuenta  |organizacion|canal             |nomProducto|placa |valorAsegurado|
|C000888888 |Sura        |Canal Tradicional |Autos      |MJK289|21800000.00   |

Scenario: Consultar inspeccion valida en SIA
Given que voy a buscar la cuenta <numCuenta>
When estoy expidiendo una poliza de autos
And seleccione la organizacion <organizacion>
And seleccione el canal <canal>
And ingrese una nueva cotizacion para vehiculo <nomProducto>
And el vehiculo tenga inspeccion