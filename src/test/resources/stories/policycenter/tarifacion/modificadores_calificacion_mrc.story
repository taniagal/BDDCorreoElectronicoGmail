Meta:
@lote1
@sprint 9
@tag equipo: 4
@local

Narrative:
Como usuario de policy center
Al cotizar una poliza de MRC quiero ser capaz de ingresar modificadores,
los cuales se deben tener en cuenta para tarifar las coberturas.

Scenario:  Validar los modificadores de tarifa MRC
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza:
|cuenta     |producto               |
|C1060447895|Multiriesgo corporativo|C
When quiera ingresar modificadores de tarifa
Then debo poder ver los modificadores definidos

Examples:
||
||
