Cotizacion De Poliza

Meta:

Narrative:
Como usuario de Policy Center
debo poder realizar una cotizacion
para comenzar un proceso de expedicion con un cliente en caso de ser posible

@Issue SUGWUSC-15118 Quote PA - Información General

Scenario: Informacion general de cotizacion
GivenStories: stories/policycenter/login_policy.story
Given he realizado la cotizacion <cotizacion>
When ingrese al detalle de la cotizacion
Then debo ver la siguiente informacion
|numeroCotizacion|tomador|tipoDocumento|numeroDocumento|direccion|tipoDireccion|descripcionDireccion|empresaAseguradora|prima|impuestos|total|
|22222225|DORIAN EASTMOND PULGARIN|CEDULA DE CIUDADANIA|1234567891|CRA 65 # 48-162, LOUISVILLE, Estados Unidos|Vivienda|Created by the Address Builder with code 0|Acme Low Hazard Insurance|$669.00|$40.00|$709.00|

Examples:
|cotizacion|
|22222225|

Scenario: Validar direccion del tomador de la poliza
GivenStories: stories/policycenter/login_policy.story
Given he realizado la cotizacion <cotizacion>
When ingrese al detalle de la cotizacion
Then debo poder ver la direccion del tomador <direccionTomador> de la poliza la cual  indico como principal

Examples:
|cotizacion|direccionTomador                            |
|22222225  |CRA 65 # 48-162, LOUISVILLE, Estados Unidos |

Scenario: Riesgos consultables - Figuras - Bloqueo
Given he realizado la cotizacion <cotizacion>
When ingrese a la 
And las figuras asegurado, beneficiario, tomador y/o cuentahabiente <figura> sean riesgo consultable
Then no se debe permitir continuar con la cotizacion y mostrar un mensaje <mensaje>; no se debe mostrar ningun valor de cotizacion al cliente

Examples:
|cotizacion|mensaje|
|0000014358