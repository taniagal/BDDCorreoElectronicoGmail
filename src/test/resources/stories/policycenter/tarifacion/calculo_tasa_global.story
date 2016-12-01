Calculo Tasa Global

Meta: @lote3
@issue #CDSEG-4326
@issue #CDSEG-4333
@sprint 9
@tag automator: nelson_jhair_mosquera_palacios
@local

Narrative:
Como usuario de policy center
Al cotizar una poliza de MRC quiero ser capaz de registrar toda la información del riesgo.


Scenario:  Validar valor de la tasa global en una cotizacion de MRC
GivenStories: stories/policycenter/login_policy.story

Given estoy cotizando una poliza:
|cuenta     |organizacion       |producto               |canal            |
|C1060447895|Sura        |Multiriesgo corporativo|Canal Tradicional|
When agregue una nueva ubicacion departamento <departamento>, ciuad <ciudad>, direccion <direccion>
And descripcion <descripcion>, actividad economica <actividad>
When seleccione la cobertura:
|valorReconstruccion|valorAsegurado|valorComercial|cobertura|
|100000000          |100000000     |null          |Terremoto|
And cotice el articulo
And intente modificar la tasa global a un valor <valor> menor al del departamento
Then debo poder ver el mensaje de bloqueo <mensaje>


Examples:
|departamento|ciudad  |direccion        |descripcion  |actividad                    |valor |mensaje                                                             |
|Antioquia   |Medellin|CR 44 A # 45 - 00|Edificio Core|Acabado de productos textiles|0,0005|El valor ingresado no esta permitido ya que no cumple con el RT y RA|