Meta: @lote2
@issue #SUGWUSC-15127
@Atomatizador Jonathan Mejia
@tag automator: Jonathan_Mejia_Leon
@local
Sprint 5

Narrative:
Como usuario de policy center
Al realizar el cambio de una poliza quiero identificar cuando una poliza tiene reaseguro especial o no.


Scenario:  Realizar cambio de una poliza que tiene reaseguro especial
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza basado en otro envio <envio>
And le ingreso el reaseguro especial
When agregue una nueva ubicacion departamento <departamento>, ciuad <ciudad>, direccion <direccion>
And descripcion <descripcion>, actividad economica <actividad>
When seleccione la cobertura:
|valorReconstruccion|valorAsegurado|valorComercial|cobertura|
|100000000          |100000000     |null          |Terremoto|
And cotice el articulo bloqueado
And expido la poliza
And que tiene marcado el campo reaseguro especial en <reaseguro>
And quiero relizar el cambio de una poliza
Then debo visualizar la advertencia con el <mensaje>

Examples:
|envio   |reaseguro|departamento|ciudad  |direccion        |descripcion  |actividad                    |mensaje
|22222211|Sí       |Antioquia   |Medellin|CR 44 A # 45 - 00|Edificio Core|Acabado de productos textiles|Esta poliza tiene reaseguro especial. Debe validar que las condiciones otorgadas no amparadas por el contrato automático tengan respaldo facultativo o aceptación especial.
