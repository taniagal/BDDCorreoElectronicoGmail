Meta:
@lote2
@tag equipo: 5
@sprint 13

Narrative:
Como usuario de negocio
Quiero prorrogar una poliza de MRC o de Autos

Scenario: Validar opcion de Prorroga
GivenStories: stories/policycenter/login_policy.story
Given ya se tiene una poliza expedida <numeroPoliza>
When quiero relizar el cambio de una poliza
And se esta realizando una prorroga
Then se debe habilitar la fecha de fin de vigencia de la poliza

Examples:
| numeroPoliza  |
| TEST_22225550 |

Scenario: Prorroga para un plazo superior al permitido
Meta: @manual
Given estoy realizando una prorroga con un tiempo mayor a 90 dias para MRC y mayor a 330 dias para autos
When se realice la expedicion de la poliza
Then se debe generar un UW issue bloqueante indicando que la poliza supera el tiempo permitido de prorroga

Scenario: Prorroga con un plazo dentro del limite permitido
Meta: @manual
Given estoy realizando una prorroga con un tiempo menor a 90 dias para MRC y menor a 330 dias para autos
When se realice la expedicion de la poliza
Then se debe permitir expedir la prorroga y acumular el tiempo de prorroga de la poliza