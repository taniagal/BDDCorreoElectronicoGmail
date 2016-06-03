Cotizacion de poliza

Meta:

Narrative:
Como usuario de Policy Center
debo poder realizar una cotizacion
para comenzar un proceso de expedicion con un cliente en caso de ser posible

@Issue SUGWUSC-15118 Quote PA - Información General

Scenario: informacion general de cotizacion
GivenStories: stories/policycenter/login_policy.story
Given he realizado la cotizacion <cotizacion>
When ingrese al detalle de la cotizacion
Then debo ver la siguiente informacion
|numeroCotizacion|tomador|tipoDocumento|numeroDocumento|direccion|tipoDireccion|descripcionDireccion|prima|impuestos|total|
|22222225|DORIAN EASTMOND PULGARIN|CEDULA DE CIUDADANIA|1234567891|CRA 65 # 48-162, LOUISVILLE, Estados Unidos|Vivienda|Created by the Address Builder with code 0|Acme Low Hazard Insurance|$1,338.00|$80.00|$1,418.00|
|22222226|ALFREDO ANTIOQUIA|CEDULA DE CIUDADANIA|1356448711|CRA 65 # 48-162, LOS ANGELES, Estados Unidos|Vivienda|Created by the Address Builder with code 0|Acme Low Hazard Insurance|$5,988.00|$365.00|$6,353.00|


Examples:
|cotizacion|
|22222225|
|22222226|
