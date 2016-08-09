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

Scenario: Consultar bonificaciones
Meta:
@Manual
Given se tiene una poliza expedida <numeroPoliza>
When se ingrese a modificar la informacion del vehiculo
Then se debe mostrar en los campos de bonificación tecnica y comercial el porcentaje en cada uno de ellos

Examples:
|numeroPoliza |
|TEST_22223223|

Scenario: Validar que muestre mensaje warning de PEPS para intereses adicionales - Vehiculos
Meta:
@manual
Given ya se tiene una poliza expedida <numeroPoliza>
When ingrese a modificar dicha cotizacion
And ingrese a la opcion vehiculos
And adicione un interes adicional <tipoDocumento> <numeroDocumento>
And se presione el boton siguiente
Then se debe mostrar el mensaje como warning <mensaje> que se obtenga de Riesgos PEPS de interes adicional
And se debe permitir continuar a coberturas de auto personal

Examples:
|numeroPoliza |tipoDocumento       |numeroDocumento|mensaje                                                                                               |
|TEST_22222222|CEDULA DE CIUDADANIA|123456         |FRANK RAMIREZ ALZATE con CEDULA DE CIUDADANIA - 123456 es un riesgo no estándar y debe ser autorizado.|