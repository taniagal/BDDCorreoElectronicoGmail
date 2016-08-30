Cotizacion De Poliza

Meta:

@issue #CDSEG-843
@Automatizador Diego Cardona Acevedo
@Sprint 3

Narrative:
Como usuario de Policy Center
debo poder realizar una cotizacion
para comenzar un proceso de expedicion con un cliente en caso de ser posible

Scenario: Informacion general de cotizacion
GivenStories: stories/policycenter/login_policy.story
Given he realizado la cotizacion <cotizacion>
When ingrese al detalle de la cotizacion
Then debo ver la siguiente informacion
|numeroCotizacion|tomador|tipoDocumento|numeroDocumento|direccion|tipoDireccion|descripcionDireccion|empresaAseguradora|prima|impuestos|total|
|22222225|DORIAN STIWAR EASTMOND PULGARIN|CEDULA DE CIUDADANIA|1234567891|CRA 65 # 48-162, LOUISVILLE, Estados Unidos|Vivienda|Created by the Address Builder with code 0|Acme Low Hazard Insurance|$9,309,657.00|-|$9,309,657.00|

Examples:
|cotizacion|
|22222225|

Scenario: Validar direccion del tomador de la poliza
Given he realizado la cotizacion <cotizacion>
When ingrese al detalle de la cotizacion
Then debo poder ver la direccion del tomador de la poliza <direccion>, la cual se indico como principal

Examples:
|cotizacion|direccion|
|22222225  |CRA 65 # 48-162, LOUISVILLE, Estados Unidos |

Scenario: Riesgos consultables - Figuras - Bloqueo
Given he realizado la cotizacion <cotizacion>
When ingrese a la cotizacion
And las figuras asegurado, beneficiario, tomador y/o cuentahabiente sean riesgo consultable
Then no se debe permitir continuar con la cotizacion y mostrar un mensaje <mensaje>; no se debe mostrar ningun valor de cotizacion al cliente

Examples:
|cotizacion|mensaje|
|22270002  |El asegurado es un riesgo no estándar y no es posible gestionar la solicitud por este canal|

Scenario: Riesgos consultables - Chasis - Bloqueo
Given he realizado la cotizacion <cotizacion>
When ingrese a la cotizacion
And el tipo de riesgo es CHASIS
Then no se debe permitir continuar con la cotizacion y mostrar un mensaje <mensaje> que indique el chasis es un riesgo

Examples:
|cotizacion|mensaje|
|22270001  |El chasis es un riesgo no estándar y no es posible gestionar la solicitud por este canal.|

Scenario: Validar exclusividad
Given he realizado la cotizacion <cotizacion>
When ingrese a la cotizacion
And ya existe una cotizacion para el mismo Asegurado (Numero de identificacion, Tipo de identificacion, diferente asesor
y mismo numero de placa)
Then se debe mostrar un mensaje <mensaje> que indique "El cliente (nombre del Aegurado) ya tiene una cotizacion en curso para
el producto seleccionado para la oficina (nombre de la oficina que se ingreso en la primera cotizacion)”,
con dos opciones : Solicitar Aprobacion y cancelar

Examples:
|cotizacion|mensaje|
|22270003  |ya tiene una cotización en curso para el producto seleccionado para la oficina SURA|

Scenario: Riesgos consultables - Tipo Causal Tecnica
Meta:
@manual
Given  he realizado la cotizacion
When  ingrese a la cotizacion
And  el tipo de causal es TECNICA, el tipo de riesgo CHASIS, MOTOR Y/O PLACA
Then  no se debe permitir continuar con la cotizacion y mostrar un mensaje

Scenario: Riesgos consultables - Tipo Causal Moral
Meta:
@manual
Given  he realizado la cotizacion
When  ingrese a la cotizacion
And  el tipo de causal es MORAL, el tipo de riesgo CHASIS, MOTOR Y/O PLACA
Then  no se debe permitir continuar con la cotizacion y mostrar un mensaje