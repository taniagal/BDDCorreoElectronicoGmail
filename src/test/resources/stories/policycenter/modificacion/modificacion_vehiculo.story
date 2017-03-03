Modificacion Vehiculo

Meta:
@lote3
@issue #CDSEG-1248
@tag equipo: 5
@local
@Sprint 4

Narrative:
Como usuario de PolicyCenter
Quiero poder realizar cambios en la informacion del vehiculo en una poliza de automoviles.

Scenario: Consulta codigo Fasecolda
GivenStories: stories/policycenter/login_policy.story
Given se tiene una poliza expedida <numeroPoliza>
When digite el numero fasecolda <numeroFasecolda> y modelo <modelo> de un vehiculo
Then se deben recuperar los datos del vehiculo: clase vehiculo <claseVehiculo>, marca <marca>  y linea <linea>
And registre una zona de circulacion no permitida <ciudadCirculacion> y un <medioVenta> permitido
And se debe mostrar un mensaje <mensaje> indicando la restriccion

Examples:
|numeroPoliza |numeroFasecolda|modelo|claseVehiculo |marca|linea                            |ciudadCirculacion|mensaje                                                                                    |medioVenta|
|TEST_22222222|52525252       |2016  |Automóviles   |AUDI |TT  8S 2.0 TFSI CO - TP 2000CC T |ACANDI (Choco)   |Por política de la compañía no esta permitido asegurar vehículos que circulen en esta zona.|Gestor MST|

Scenario: Consultar bonificaciones
Meta:
@manual
Given se tiene una poliza expedida
When se ingrese a modificar la informacion del vehiculo
Then se debe mostrar en los campos de bonificación tecnica y comercial el porcentaje en cada uno de ellos

Examples:
|numeroPoliza |
|TEST_22222222|

Scenario: Validar que muestre mensaje warning de PEPS para intereses adicionales - Vehiculos
Meta:
@manual
Given que hay una poliza expedida <numeroPoliza>
When ingrese a modificar la cotizacion
And ingrese a la opcion vehiculo
And adicione un interes adicional <tipoDocumento><numeroDocumento>
And presione el boton siguiente
Then debe mostrar el mensaje como warning <mensaje> que se obtenga de Riesgos PEPS de interes adicional
And debe permitir continuar a coberturas de auto personal

Examples:
|numeroPoliza |tipoDocumento       |numeroDocumento|mensaje                                                                                               |
|TEST_22222222|CEDULA DE CIUDADANIA|123456         |FRANK RAMIREZ ALZATE con CEDULA DE CIUDADANIA - 123456 es un riesgo no estándar y debe ser autorizado.|