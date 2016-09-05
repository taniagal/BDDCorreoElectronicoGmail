Meta:

Narrative:
Como usuario de policy center
Quiero poder realizar la cotizacion de la renovacion de una poliza de personal autos ya sea de forma manual o automatica

Scenario: Validar la informacion del detalle de la cotizacion
Given se ha realizado la renovacion de la cotizacion <cotizacion>
When ingrese al detalle de la cotizacion
Then se debe mostrar la informacion del detalle de cotizacion por riesgo, donde se muestre:
|placa  |modelo |codigoFasecolda |marca |linea |
|TKC459 |2016   |00601182        |Mazda |MPV   |
And en el detalle por coberturas mostrar:
|cobertura                         |terminoCobertura |valorCobertura |subtotal |subtotalPrima |valorImpuesto |
|Cobertura de Responsabilidad Civil|Valor término    |$326,211.00    |

Examples:
|cotizacion |
|32112330   |
