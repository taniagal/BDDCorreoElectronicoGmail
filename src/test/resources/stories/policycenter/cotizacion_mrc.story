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
When ingrese al detalle de la cotizacion
Then debo ver la siguiente informacion
|numeroCotizacion|vigenciaPoliza|tomador                 |tipoDocumento       |numeroDocumento|direccion                                  |tipoDireccion|descripcionDireccion                      |primaTotal|impuestos|total |
|22222225        |              |DORIAN EASTMOND PULGARIN|CEDULA DE CIUDADANIA|1234567891     |CRA 65 # 48-162, LOUISVILLE, Estados Unidos|Vivienda     |Created by the Address Builder with code 0|$44.00    |$3.00    |$47.00|

Examples:
|cotizacion|
|22222225  |