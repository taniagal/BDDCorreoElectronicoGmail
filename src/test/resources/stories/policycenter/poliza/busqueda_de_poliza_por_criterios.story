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
Given estoy cotizando una poliza de mrc:
| producto                | tipo_documento       | fecha_nacimiento | primer_nombre | primer_apellido | tipo_direccion          | direccion        | departamento | ciudad   | agente |
| Multiriesgo corporativo | CEDULA DE CIUDADANIA | 08/12/1973       | MARIA         | OSPINA          | DIRECCION DE RESIDENCIA | CALLE 48F #25-83 | Antioquia    | Medellin | INT-3  |
When ingrese a edificios y ubicaciones
And intente ingresar una nueva ubicacion en edificios
| pais     | departamento | ciudad   | direccion   | actividadEconomica            |
| Colombia | Antioquia    | Medellin | CR 52 22a 12 | Acabado de productos textiles |
And intente ingresar las entradas de las diferentes coberturas
| TAB                      | TIPO_ARTICULO | OTRO_ARTICULO_OTROS | COBERTURA        | ENTRADAS                         | VALOR_ENTRADAS |
| Información de Artículos | Edificios     |                     |                  | Valor Reconstrucción             | 100000000      |
| Información de Artículos | Edificios     |                     | Danos materiales | Valor asegurado danos materiales | 100000000      |
And intente cotizar y expedir la poliza
And que voy a buscar una poliza
And limpioCampos
And seleccione el producto en criterio opcional <criterio>
And seleccione el criterio de busqueda <criterioBusqueda>
And diligencio el campo de criterio de busqueda <contenidoCampoCriterio>
And busco poliza mediante el criterio seleccionado anteriormente
Then se visualiza la informacion de la poliza relacionada
|poliza       |labelFechaInicial       |labelFechaFinal      |labeltomador|
|900000000001 |Fecha inicio de vigencia|Fecha fin de vigencia|Tomador     |
Examples:
|criterio               |criterioBusqueda       |contenidoCampoCriterio|
|Multiriesgo corporativo|Dirección              |CR 52 22a 12          |