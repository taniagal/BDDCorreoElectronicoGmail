Cotizacion De Poliza

Meta:

@issue #CDSEG-843
@tag automator: diego_cardona_acevedo
@local
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
| numeroCotizacion | tomador                         | tipoDocumento        | numeroDocumento | direccion                                   | tipoDireccion           | descripcionDireccion                       | empresaAseguradora        | prima               | impuestos   | total               |
| 22222225         | DORIAN STIWAR EASTMOND PULGARIN | CEDULA DE CIUDADANIA | 1234567891      | CRA 65 # 48-162, LOUISVILLE, Estados Unidos | DIRECCION DE RESIDENCIA | Created by the Address Builder with code 0 | Acme Low Hazard Insurance | $2.259.410,00 (COP) | $0,00 (COP) | $2.259.410,00 (COP) |

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
|22270003  |El cliente JORGE PAISA ya tiene una cotización en curso para el producto seleccionado para la oficina SURA|

Scenario: Riesgos consultables - Figuras - Bloqueo
Given he realizado la cotizacion <cotizacion>
When ingrese a la cotizacion
And las figuras asegurado, beneficiario, tomador y/o cuentahabiente sean riesgo consultable
Then no se debe permitir continuar con la cotizacion y mostrar un mensaje <mensaje>; no se debe mostrar ningun valor de cotizacion al cliente

Examples:
|cotizacion|mensaje|
|22270002  |El asegurado es un riesgo no estándar y no es posible gestionar la solicitud por este canal|

Scenario: Poliza con intencion de financiacion
Given he realizado la cotizacion <cotizacion>
When ingrese a la cotizacion
And se haya definido la cotizacion con intencion de financiacion
Then se debe mostrar un mensaje <mensaje> como advertencia

Examples:
|cotizacion |mensaje|
|777111777  |La financiación de la póliza está sujeta a aprobación por parte del área de financiación|

Scenario: Poliza con intencion de financiacion - Mostrar cuotas y valor
Given he realizado la cotizacion <cotizacion>
When la cotizacion tenga intencion de financiacion
Then se debe mostrar en el detalle de la cotizacion el Valor por cuota a pagar <valorCuota> y
el numero de cotas <numeroCuotas> indicadas en la informacion de la poliza

Examples:
|cotizacion |valorCuota   |numeroCuotas |
|777222777  |$101,620.00  |11           |


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
