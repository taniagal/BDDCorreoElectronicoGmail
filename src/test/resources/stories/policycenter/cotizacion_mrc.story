Cotizacion MRC

Meta:

Narrative:
Como usuario de Policy Center
Quiero porder solicitar una cotizacion
Asi ver los detalles de la cotizacion de una poliza MRC

@Issue SUGWUSC-14530 Quote - CP

Scenario: Cotizar una poliza MRC
GivenStories: stories/policycenter/login_policy.story
Given se ha realizado la cotizacion <cotizacion>
When ingrese a consultar la cotizacion
Then debo ver la siguiente informacion de la cotizacion
|numeroCotizacion|tomador              |tipoDocumento       |numeroDocumento|direccion                                  |tipoDireccion|descripcionDireccion                      |primaTotal |impuestos |total     |
|22222237        |FRANK RAMIREZ ALZATE |CEDULA DE CIUDADANIA|123456         |CRA 65 # 48-162, LOUISVILLE, Estados Unidos|Vivienda     |Created by the Address Builder with code 0|$21,791.00 |$1,199.00 |$22,990.00|

Examples:
|cotizacion|
|22222237  |