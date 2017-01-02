Modificacion Cotizacion De Poliza Pa

Meta:
@lote2
@issue #CDSEG-1286
@tag automator: diego_cardona_acevedo
@local
@Sprint 4

Narrative:
Como usuario de Policy Center
debo poder realizar una cotizacion
en el proceso de modificacion de una poliza existente.

Scenario: Informacion general de cotizacion
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza basado en otro envio <envio>
And ingrese los datos de la cotizacion PA
|ciudad_circulacion|limite|deducible|abogado |PLlaves |modelo|
|MEDELLIN          |1.440 |0        |Opción 1 |Opción 1|2016  |
When expido la poliza y voy al archivo de poliza
And cotice el cambio de poliza
Then debo ver de la cotizacion la siguiente informacion
| tomador     | tipoDocumento        | numeroDocumento | direccion                           | tipoDireccion           | descripcionDireccion                       |
| JORGE PAISA | CEDULA DE CIUDADANIA | 1356118711      | CR 65 # 48 - 162, MEDELLIN, Colombia| DIRECCION DE RESIDENCIA | Created by the Address Builder with code 0 |
And debo poder ver la direccion del tomador de la modificacion <direccion>, la cual se indico como principal
And se debe mostrar en la columna "Termino" de la modificacion el limite o deducible de la cobertura en el caso de que aplique
And se debe mostrar en la columna "Termino" de la modificacion el limite de la cobertura en el caso de que aplique
And se debe mostrar en la columna "Termino" de la modificacion el deducible de la cobertura en el caso de que aplique

Examples:
|envio   | direccion                           |
|22228589| CR 65 # 48 - 162, MEDELLIN, Colombia |



