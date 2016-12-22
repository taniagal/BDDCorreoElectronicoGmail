Impuestos De Tarifa

Meta:
@lote4
@issue #CDSEG-735
@sprint 10
@tag automator: nelson_jhair_mosquera_palacios

Narrative:
Como usuario de policy center
Al cotizar una poliza de MRC quiero que al momento de tarifar y calcular los impuestos (IVA)
se tenga en cuenta las ciudades que están exceptas de este.


Scenario:  Verificar impuesto en la ciudad de circulacion Leticia
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza de mrc:
|organizacion|producto               |canal            |tipo_documento      |fecha_nacimiento|primer_nombre|primer_apellido|tipo_direccion         |direccion       |departamento|ciudad  |agente|
|Sura        |Multiriesgo corporativo|Canal Tradicional|CEDULA DE CIUDADANIA|02/12/1990      |MIKASA        |AKERMAN       |DIRECCION DE RESIDENCIA|CALLE 54B #50-25|Antioquia   |Medellin|INT-3 |
When agregue una nueva ubicacion departamento <departamento>, ciuad <ciudad>, direccion <direccion>
And descripcion <descripcion>, actividad economica <actividad>
When seleccione la cobertura:
|valorReconstruccion|valorAsegurado|valorComercial|cobertura|
|100000000          |100000000     |null          |Terremoto|
And cotice el articulo
Then el valor de iva debe ser igual a 0 (cero)

Examples:
|prima    |departamento|ciudad |direccion        |descripcion  |actividad|
|1.016.667|Amazonas    |Leticia|CR 44 A # 41 - 00|Edificio Core|Acabado de productos textiles|



Scenario:  Verificar impuesto en la ciudad de circulación es San Andres
Given estoy cotizando una poliza:
|cuenta     |organizacion|producto               |canal            |
|C1060447895|Sura        |Multiriesgo corporativo|Canal Tradicional|
When agregue una nueva ubicacion departamento <departamento>, ciuad <ciudad>, direccion <direccion>
And descripcion <descripcion>, actividad economica <actividad>
When seleccione la cobertura:
|valorReconstruccion|valorAsegurado|valorComercial|cobertura|
|100000000          |100000000     |null          |Terremoto|
And cotice el articulo
Then el valor de iva debe ser igual a 0 (cero)

Examples:
|prima    |departamento            |ciudad    |direccion        |descripcion  |actividad|
|1.016.667|San Andres Y Providencia|San Andres|CR 44 A # 42 - 00|Edificio Core|Acabado de productos textiles|