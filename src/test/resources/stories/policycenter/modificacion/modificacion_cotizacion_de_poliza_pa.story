Modificacion Cotizacion De Poliza Pa

Meta:
@lote2
@issue #CDSEG-1286
@tag equipo: 5
@local
@Sprint 4

Narrative:
Como usuario de Policy Center
debo poder realizar una cotizacion
en el proceso de modificacion de una poliza existente.

Scenario: Informacion general de cotizacion
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza:
|cuenta     |producto|tipoPoliza |
|C1060447895|Autos   |Individual |
When ingrese los datos del asegurado <tipo_documento> <documento>
And ingrese los datos del vehiculo:
|placa |modelo|codigo_fasecolda|ciudad_circulacion   |vehiculo_servicio|chasis|motor|valor_asegurado|descuento|recargo|zona|plan        |medioVenta|
|random|2016  |00601182        |MEDELLIN (ANTIOQUIA) |Particular       |null  |null |165900000      |null     |null   |2   |Plan Modular|Televentas|
And ingrese las coberturas:
|limite|deducible|abogado|PLlaves|
|640.  |0        |Si     |Si     |
When expido la poliza y voy al archivo de poliza
And cotice el cambio de poliza
Then debo ver de la cotizacion la siguiente informacion
| tomador              | tipoDocumento        | numeroDocumento | direccion                           | tipoDireccion           | descripcionDireccion                       |
| DANIEL MEJIA CUARTAS | CEDULA DE CIUDADANIA | 1060447895      | CR 65 # 48 - 162, MEDELLIN, Colombia| DIRECCION DE RESIDENCIA | Created by the Address Builder with code 0 |
And debo poder ver la direccion del tomador de la modificacion <direccion>, la cual se indico como principal
And se debe mostrar en la columna "Termino" de la modificacion el limite o deducible de la cobertura en el caso de que aplique
And se debe mostrar en la columna "Termino" de la modificacion el limite de la cobertura en el caso de que aplique
And se debe mostrar en la columna "Termino" de la modificacion el deducible de la cobertura en el caso de que aplique

Examples:
|tipo_documento      |documento |direccion                           |
|CEDULA DE CIUDADANIA|1060447895|CR 65 # 48 - 162, MEDELLIN, Colombia|



