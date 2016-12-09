Meta: @lote2
@issue #SUGWUSC-15127
@Atomatizador Jonathan Mejia
@tag automator: Jonathan_Mejia_Leon
@local
Sprint 5

Narrative:
Como usuario de policy center
Al realizar el cambio de una poliza quiero identificar cuando una poliza tiene reaseguro especial o no.


Scenario:  Realizar cambio de una poliza PA con retroactividad
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza basado en otro envio <envio>
When cambie la fecha de inicio de vigencia de pa poliza
And cotize una poliza
And expido la poliza y voy al archivo de poliza
And quiero relizar el cambio de una poliza
Then debo visualizar la advertencia con el <mensaje>

Examples:
|envio   |mensaje|
|22228589|La fecha inicio de vigencia no cumple con el parámetro de retroactividad definido (30 días)       |



