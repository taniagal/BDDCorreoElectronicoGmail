Cotizacion Renovacion Pa Validaciones

Meta:

@issue #CDSEG-2295
@tag automator: diego_cardona_acevedo
@local
@Sprint 7

Narrative:
Como usuario de policy center  con el perfil  X
Quiero poder realizar la cotizacion de la renovacion de una poliza de personal autos ya sea de forma manual o automatica

Scenario: Quote - Riesgos Consultables - Figuras Tomador, Asegurado y Beneficiario
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando la renovacion de la poliza <cotizacion>
When cotice  con algunas de las figuras que es Riesgo consultable bloqueante
||
Then se debe mostrar la informacion del detalle de cotizacion por riesgo, donde se muestre:
|placa  |modelo |codigoFasecolda |marca |linea |
|TKC459 |2016   |00601182        |Mazda |MPV   |
And en el detalle por coberturas mostrar:
|cobertura                         |terminoCobertura |prima       |subtotal     |subtotalPrimas|
|Cobertura de Responsabilidad Civil|32.000.000       |$326,211.00 |$2,303,011.00|$4,606,022.00 |

Examples:
|cotizacion |
|32112330   |