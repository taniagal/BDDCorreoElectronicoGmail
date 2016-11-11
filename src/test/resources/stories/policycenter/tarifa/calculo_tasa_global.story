Calculo Tasa Global

Meta: @lote3
@issue #CDSEG-4326
@sprint 9
@tag automator: nelson_jhair_mosquera_palacios
@local

Narrative:
Como usuario de policy center
Al cotizar una poliza de MRC quiero ser capaz de registrar toda la información del riesgo.


Scenario:  Validar valor de la tasa global en na cotizacion de MRC
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza:
|cuenta     |organizacion|producto               |canal            |
|C1060447895|Sura        |Multiriesgo corporativo|Canal Tradicional|
When agregue una nueva ubicacion departamento <departamento>, ciuad <ciudad>, direccion <direccion>
And descripcion <descripcion>, actividad economica <actividad>
When seleccione la cobertura de terremoto:
|valorReconstruccion|valorAsegurado|valorComercial|
|200000000          |200000000     |null          |
And cotice el articulo
Then debo poder ver el valor de la tasa global


Examples:
|departamento|ciudad  |direccion        |descripcion  |actividad|
|Antioquia   |MEDELLIN|CR 44 A # 45 - 00|Edificio Core|Acabado de productos textiles|