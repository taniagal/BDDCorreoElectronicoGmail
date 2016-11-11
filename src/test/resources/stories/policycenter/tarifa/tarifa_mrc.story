Tarifa MRC

Meta: @lote3
@issue #CDSEG-4322
@sprint 9
@tag automator: nelson_jhair_mosquera_palacios
@local

Narrative:
Como usuario de policy center
Al cotizar una poliza de MRC quiero ser capaz de registrar toda la información del riesgo.


Scenario:  Tarifa MRC - Cobertura Terremoto en Antioquia
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza:
|cuenta     |organizacion|producto               |canal            |
|C1060447895|Sura        |Multiriesgo corporativo|Canal Tradicional|
When agregue una nueva ubicacion departamento <departamento>, ciuad <ciudad>, direccion <direccion>
And descripcion <descripcion>, actividad economica <actividad>
When seleccione la cobertura de terremoto:
|valorReconstruccion|valorAsegurado|valorComercial|
|100000000          |100000000     |null          |
And agregue el articulo
Then debo poder ver el valor de la prima <prima> en la cotizacion

Examples:
|prima    |departamento|ciudad  |direccion        |descripcion  |actividad|
|1.016.667|Antioquia   |MEDELLIN|CR 44 A # 45 - 00|Edificio Core|Acabado de productos textiles|


Scenario:  Tarifa MRC - Cobertura Terremoto en Caldas con deducible
Given estoy cotizando una poliza:
|cuenta     |organizacion|producto               |canal            |
|C1060447895|Sura        |Multiriesgo corporativo|Canal Tradicional|
When agregue una nueva ubicacion departamento <departamento>, ciuad <ciudad>, direccion <direccion>
And descripcion <descripcion>, actividad economica <actividad>
When seleccione la cobertura de terremoto:
|valorReconstruccion|valorAsegurado|valorComercial|
|100000000          |100000000     |120000000     |
And seleccione la opcion de deducible en si
And agregue el articulo
Then debo poder ver el valor de la prima <prima> en la cotizacion

Examples:
|prima    |departamento|ciudad   |direccion        |descripcion  |actividad|
|1.283.333|Caldas      |MANIZALES|CR 44 A # 45 - 00|Edificio Core|Acabado de productos textiles|


Scenario:  Tarifa MRC - Cobertura Terremoto en Caldas sin deducible
Given estoy cotizando una poliza:
|cuenta     |organizacion|producto               |canal            |
|C1060447895|Sura        |Multiriesgo corporativo|Canal Tradicional|
When agregue una nueva ubicacion departamento <departamento>, ciuad <ciudad>, direccion <direccion>
And descripcion <descripcion>, actividad economica <actividad>
When seleccione la cobertura de terremoto:
|valorReconstruccion|valorAsegurado|valorComercial|
|100000000          |100000000     |120000000     |
And seleccione la opcion de deducible en no
And agregue el articulo
Then debo poder ver el valor de la prima <prima> en la cotizacion

Examples:
|prima    |departamento|ciudad   |direccion        |descripcion  |actividad|
|1.283.333|Caldas      |MANIZALES|CR 44 A # 45 - 00|Edificio Core|Acabado de productos textiles|