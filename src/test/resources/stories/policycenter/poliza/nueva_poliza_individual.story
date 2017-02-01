Nueva Poliza Individual

Meta: @lote3

@issue #CDSEG-812
@Automatizador Eliana Alvarez
@Sprint 4

Narrative:
Como usuario de Policy Center
Quiero ser capaz de crear polizas colectivas e individuales
Para las diferentes organizaciones, canales y productos

Scenario: Validar elementos de la pantalla cuando voy a crear una poliza individual
GivenStories: stories/policycenter/login_policy.story
Given que voy a buscar la cuenta <numCuenta>
And quiero expedir una poliza nueva
And seleccione el agente y la oficina de radicacion:
| oficina | agente_oficina  |
| 1105    | DIRECTO |
Then se debe visualizar la tabla de productos con los productos de Autos y Multiriesgo corporativo y los botones para elegir producto habilitados

Examples:
| numCuenta  |
| C000888888 |