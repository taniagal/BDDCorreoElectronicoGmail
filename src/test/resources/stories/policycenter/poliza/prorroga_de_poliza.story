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
| TEST_22222222 |