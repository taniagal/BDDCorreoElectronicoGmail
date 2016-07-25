Cotizacion De Poliza

Meta:

Narrative:
Como usuario de Policy Center
debo poder realizar una cotizacion
en el proceso de modificacion de una poliza existente.

@Issue SUGWUSC-11100 PA - Quote Policy Change - Flujo_Basico

Scenario: Informacion general de cotizacion
GivenStories: stories/policycenter/login_policy.story
Given he realizado la cotizacion de la modificacion <cotizacion>
When ingrese al detalle de la cotizacion
Then debo ver la siguiente informacion
|numeroCotizacion|tomador|tipoDocumento|numeroDocumento|direccion|tipoDireccion|descripcionDireccion|empresaAseguradora|prima|impuestos|total|
|22222225|DORIAN EASTMOND PULGARIN|CEDULA DE CIUDADANIA|1234567891|CRA 65 # 48-162, LOUISVILLE, Estados Unidos|Vivienda|Created by the Address Builder with code 0|Acme Low Hazard Insurance|$44.00|$3.00|$47.00|

Examples:
|cotizacion|
|22222225|
