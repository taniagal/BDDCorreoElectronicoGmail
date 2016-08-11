Meta:

@issue SUGW_USC-00107-PA-Vehicle_Information-Inspección

Narrative:
Como usuario de PolicyCenter
Quiero ser capaz consultar de forma automatica si un vehiculo requiere o no inspeccion.

Scenario: Consulta de inspeccion no valida y busqueda en el modelo de seguros
GivenStories: stories/policycenter/login_policy.story
Given que voy a buscar la cuenta <numCuenta>
When estoy expidiendo una poliza de autos
And seleccione la organizacion <organizacion>
And seleccione el canal <canal>
And ingrese una nueva cotizacion para vehiculo <nomProducto>
And el vehiculo tenga inspeccion no valida
And la placa <placa> estuvo vigente en la compañia
And la fecha de cancelacion o exclusion no sea mayor a 3 dias
Then se debe recuperar los siguientes datos:
|modelo|codigoFasecolda|motor|chasis|valorAccesorios|valorAccesoriosEspeciales|
|2001  |5601080        |     |      |               |                         |
And el valor asegurado <valorAsegurado> se debe consultar y traer de la tabla fasecolda

Examples:
|numCuenta  |organizacion|canal             |nomProducto|placa |valorAsegurado|
|C000888888 |Sura        |Canal Tradicional |Autos      |HZR123|              |