Meta:

Narrative:
Como usuario PolicyCenter
Quiero ser capaz de ingresar y visualizar la informacion de la poliza incluyendo el nombre tomador
,tomador adcicional, validar vigencia de la poliza.

Scenario: visualizar datos de la poliza
GivenStories: stories/policycenter/login_policy.story
Given se inicio una nueva suscripcion <numeroCuenta>
When este expidiendo una poliza de propiedad comercial
Then se debe visualizar los datos del tomador y tomador adicional completos

Examples:
|numeroCuenta|
|C000888888  |

