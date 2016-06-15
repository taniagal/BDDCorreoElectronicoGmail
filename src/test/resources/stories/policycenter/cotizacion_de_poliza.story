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
|numeroCotizacion|tomador|tipoDocumento|numeroDocumento|direccion|tipoDireccion|descripcionDireccion|empresaAseguradora|prima|impuestos|total|
|22222225|DORIAN EASTMOND PULGARIN|CEDULA DE CIUDADANIA|1234567891|CRA 65 # 48-162, LOUISVILLE, Estados Unidos|Vivienda|Created by the Address Builder with code 0|Acme Low Hazard Insurance|$1,338.00|$80.00|$1,418.00|

Examples:
|cotizacion|
|22222225|

Scenario: Riesgos consultables - Tipo riesgo - Bloqueo
Given he realizado la cotizacion <cotizacion>
When ingrese a la revision de la poliza
And el tipo de causal es FINANCIERA, el tipo de riesgo CHASIS, MOTOR Y/O PLACA
Then no se debe permitir continuar con la cotizacion <mensaje>, no se debe mostrar ningun valor de cotizacion al cliente

Examples:
|cotizacion|mensaje                                                                                               |
|0000180617|Por favor revisar la parametrizacion con el Comité de Evaluación, la parametrización no está definida.|
|0000313826|La placa es un riesgo no estandar y no es posible gestionar la solicitud por este canal.              |

Scenario: Riesgos consultables - Figuras - Bloqueo
Given he realizado la cotizacion <cotizacion>
When ingrese a la revision de la poliza
And las figuras asegurado, beneficiario, tomador y/o cuentahabiente sean riesgo consultable
Then no se debe permitir continuar con la cotizacion <mensaje>, no se debe mostrar ningun valor de cotizacion al cliente

Examples:
