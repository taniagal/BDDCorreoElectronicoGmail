Meta:
@lote1
@tag equipo: 5
@Sprint 14

Narrative:
Como usuario de policy
Quiero poder realizar busquedas de poliza por criterio
Para poder visualizar en detalle las polizas que requiero

Scenario: Busqueda polizas Autos
GivenStories: stories/policycenter/login_policy.story
Given que voy a buscar una poliza
When seleccione el producto en criterio opcional <criterio>
And ingreso la placa del auto <placa>
And busco poliza mediante el criterio seleccionado anteriormente
Then se visualiza la informacion de la poliza relacionada
|poliza       |
|TEST_22222222|
Examples:
|placa |criterio|
|BLE860|Autos   |


Scenario: Busqueda por el Numero de identificacion
Given que voy a buscar una poliza
And limpioCampos
When selecione la opcion tipo de documento <tipoDocumento>
And ingreso la identificacion  <identificacion>
And busco poliza mediante el criterio seleccionado anteriormente
Then se visualiza la informacion de la poliza relacionada
|poliza       |
|TEST_22222222|
Examples:
|tipoDocumento          |identificacion|
|CEDULA DE CIUDADANIA   |1234567891    |


Scenario: Busqueda polizas Comercial Property
Given que voy a buscar una poliza
And limpioCampos
When seleccione el producto en criterio opcional <criterio>
And seleccione el criterio de busqueda <criterioBusqueda>
And diligencio el campo de criterio de busqueda <contenidoCampoCriterio>
And busco poliza mediante el criterio seleccionado anteriormente
Then se visualiza la informacion de la poliza relacionada
|poliza        |labelFechaInicial       |labelFechaFinal      |labeltomador|
|TEST_22222236 |Fecha inicio de vigencia|Fecha fin de vigencia|Tomador     |
Examples:
|criterio               |criterioBusqueda       |contenidoCampoCriterio|
|Multiriesgo corporativo|Dirección              |CR 65 # 48 - 162      |