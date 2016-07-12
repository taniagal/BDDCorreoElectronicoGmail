Cotizacion MRC

Meta:

Narrative:
Como usuario de Policy Center
Quiero porder solicitar una cotizacion
Asi ver los detalles de la cotizacion de una poliza MRC

@Issue SUGWUSC-14530 Quote - CP

Scenario: Cotizar una poliza MRC
GivenStories: stories/policycenter/login_policy.story
Given se ha realizado la cotizacion MRC <cotizacion>
When ingrese a consultar la cotizacion
Then debo ver la informacion de la cotizacion
|cotizacion|vigencia                |tomador              |tipoDocumento       |numeroDocumento|direccion                                  |tipoDireccion|descripcionDireccion                      |empresaAseguradora       |prima     |impuestos|total     |
|22222237  |06/12/2016 - 06/12/2017 |FRANK RAMIREZ ALZATE |CEDULA DE CIUDADANIA|123456         |CRA 65 # 48-162, LOUISVILLE, Estados Unidos|Vivienda     |Created by the Address Builder with code 0|Acme Low Hazard Insurance|$19,342.00|$1,064.00|$20,406.00|

Examples:
|cotizacion |
|22222237   |

Scenario: Mostrar Prima
Given se ha realizado la cotizacion MRC <cotizacion>
When ingrese a consultar la cotizacion
Then debo ver la prima <primaTotal> a cobrar al cliente

Examples:
|cotizacion |primaTotal |
|22222237   |$19,342.00 |

Scenario: Validar informacion detalle cotizacion
Given se ha realizado la cotizacion MRC <cotizacion>
When ingrese a consultar la cotizacion
Then se muestre el detalle de la prima por riesgo

Examples:
|cotizacion |
|22222237   |

Scenario: cotizar una poliza MRC con un riesgo consultable bloqueante
Given se registraron los riesgos y coberturas que se desean cotizar <cotizacion>
When realice la cotizacion
And los participantes y/o ubicaciones sean riesgo consultable
Then no debe permitir cotizar; se debe mostrar el mensaje de respuesta <mensaje> que envie riesgos consultables

Examples:
|cotizacion|mensaje|
|22223230  |el(los) rol(es) (ASEGURADO NOMBRADO, TITULAR DE LA CUENTA) es un riesgo no estándar y debe ser autorizado.|

Scenario: cotizar una poliza MRC con un riesgo PEP
Given se registraron los riesgos y coberturas que se desean cotizar <cotizacion>
When realice la cotizacion
And los participantes (tomador, asegurado y/o beneficiario) sean identificados como PEP
Then no debe permitir cotizar; se debe mostrar el mensaje de respuesta <mensaje> que envie PEP

Examples:
|cotizacion|mensaje|
|22223230  |Se trata de un riesgo no estandar y no es posible gestionar la solicitud por este canal.|

Scenario: validacion de exclusividad en la cotizacion
Given se registraron los riesgos y coberturas que se desean cotizar <cotizacion>
When realice la cotizacion
And ya exista una cotizacion en estado "cotizado" del mismo cliente, para el producto Multiriesgo corporativo con un
agente diferente al que se ingreso
Then no debe permitir cotizar; se debe mostrar el mensaje de error <mensaje>

Examples:
|cotizacion|mensaje|
|22223230  |ya tiene una cotización en curso para el producto seleccionado para la oficina SURA|