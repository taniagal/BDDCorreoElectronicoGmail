Ajuste Dependencia De Coberturas

Meta:
@lote1
@issue #CDSEG-5364
@sprint 11
@tag automator: nelson_jhair_mosquera_palacios

Narrative:
Como usuario de policy center
Al cotizar una poliza de PA quiero ser capaz de parametrizar si una dependencia no aplica para un plan especifico


Scenario:  Verificar independencia de cobertura de accidentes al conductor a las coberturas de daños o hurto
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza:
|cuenta     |organizacion|producto|canal        |tipoPoliza |
|C1060447895|Sura        |Autos   |Venta directa|Individual |
When ingrese los datos del asegurado <tipo_documento> <documento>
And ingrese los datos del vehiculo:
|placa |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis|motor|valor_asegurado|descuento|recargo|zona|plan              |
|random|2016  |00601182        |MEDELLIN          |Particular       |null  |null |165900000      |null     |null   |2   |Plan Conducir Sura|
Then debo poder ver la cobertura de accidentes al conductor sin dependencia de daños o hurto

Examples:
|tipo_documento      |documento |
|CEDULA DE CIUDADANIA|1060447895|



Scenario:  Verificar dependencia de cobertura de accidentes al conductor a las coberturas de daños o hurto con plan global
Given estoy cotizando una poliza:
|cuenta     |organizacion|producto|canal            |tipoPoliza |
|C1060447895|Sura        |Autos   |Canal Tradicional|Individual |
When ingrese los datos del asegurado <tipo_documento> <documento>
And ingrese los datos del vehiculo:
|placa |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis|motor|valor_asegurado|descuento|recargo|zona|plan             |
|random|2016  |00601182        |MEDELLIN          |Particular       |null  |null |165900000      |null     |null   |2   |Plan Autos Global|
Then debo poder ver la cobertura de accidentes al conductor con dependencia de daños o hurto

Examples:
|tipo_documento      |documento |
|CEDULA DE CIUDADANIA|1060447895|