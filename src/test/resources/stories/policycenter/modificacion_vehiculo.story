Modificacion Vehiculo

Meta:

Narrative:
Como usuario de PolicyCenter
Quiero poder realizar cambios en la informacion del vehiculo en una poliza de automoviles.

@Issue SUGW USC-11100-PA-Change - Enter Policy Change_Vehiculo

Scenario: Consulta codigo Fasecolda
GivenStories: stories/policycenter/login_policy.story
Given se tiene una poliza expedida <numeroPoliza>
When digite el numero fasecolda <numeroFasecolda> y modelo <modelo> de un vehiculo
Then se deben recuperar los datos del vehiculo: clase vehiculo <claseVehiculo>, marca <marca>  y linea <linea>

Examples:
|numeroPoliza |numeroFasecolda|modelo|claseVehiculo   |marca|linea         |
|TEST_22223223|03417101       |2007  |Motos 0 - 125 CC|HONDA|125 - MT 125CC|

Scenario: Zona de circulacion no permitida
Given se tiene una poliza expedida <numeroPoliza>
When registre una zona de circulacion no permitida <ciudadCirculacion>
Then se debe mostrar un mensaje <mensaje> indicando la restriccion

Examples:
|numeroPoliza |ciudadCirculacion|mensaje                                                                                |
|TEST_22222222|ACANDI           |Por política de la compañía no esta permitido vehículos que circulen en esta ubicación.|