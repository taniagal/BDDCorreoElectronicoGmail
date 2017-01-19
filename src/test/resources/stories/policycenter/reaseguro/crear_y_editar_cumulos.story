Meta:
@lote3
@sprint 7
@tag equipo: reaseguro
@local

Narrative:
como usuario de policycenter en reaseguro
deseo crear y editar los cumulos correspondientes a cada una de las direcciones
para poder asegurar los valores de edificios y primas en cada uno de los contrato


Scenario: calculo de tasa bruta en acuerdo facultativo
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza de mrc:
|organizacion|producto               |canal            |tipo_documento      |fecha_nacimiento|primer_nombre|primer_apellido|tipo_direccion         |direccion       |departamento|ciudad  |agente|
|Sura        |Multiriesgo corporativo|Canal Tradicional|CEDULA DE CIUDADANIA|10/10/1973      |EUGENIO      |BUSTAMANTE     |DIRECCION DE RESIDENCIA|CALLE 27a #60-68|Antioquia   |Medellin|INT-3 |
And ingrese a edificios y ubicaciones
And intente ingresar una nueva ubicacion sin riesgo consultable
And intente ingresar las entradas de las diferentes coberturas
| TAB                      | TIPO_ARTICULO | OTRO_ARTICULO_OTROS | COBERTURA        | ENTRADAS                         | VALOR_ENTRADAS |
| Información de Artículos | Edificios     |                     |                  | Valor Reconstrucción             | 100000000      |
| Información de Artículos | Edificios     |                     | Danos materiales | Valor asegurado danos materiales | 100000000      |
And cotice una poliza
And ingrese la informacion de un acuerdo facultativo <descripcionDeAcuerdo>
When Ingrese la información de un reasegurador en la tabla de reaseguradores
|modalidad |porcentajeParticipacion|valorReaseguro|comisionReasegurador|comisionIntermediario|comisionPromotora|
|Gross rate|100                    |1,8           |30                  |7                    |3                |
Then el valor de tasa bruta de cesion debe tomar el mismo valor de la columna en la tabla

Examples:
|descripcionDeAcuerdo  |
|Descripcion de acuerdo|


Scenario: calculo de tasa neta en acuerdo facultativo
Given estoy cotizando una poliza de mrc:
|organizacion|producto               |canal            |tipo_documento      |fecha_nacimiento|primer_nombre|primer_apellido|tipo_direccion         |direccion       |departamento|ciudad  |agente|
|Sura        |Multiriesgo corporativo|Canal Tradicional|CEDULA DE CIUDADANIA|10/10/1973      |SEAN         |AMPARO         |DIRECCION DE RESIDENCIA|CALLE 27a #60-68|Antioquia   |Medellin|INT-3 |
And ingrese a edificios y ubicaciones
And intente ingresar una nueva ubicacion sin riesgo consultable
And intente ingresar las entradas de las diferentes coberturas
| TAB                      | TIPO_ARTICULO | OTRO_ARTICULO_OTROS | COBERTURA        | ENTRADAS                         | VALOR_ENTRADAS |
| Información de Artículos | Edificios     |                     |                  | Valor Reconstrucción             | 100000000      |
| Información de Artículos | Edificios     |                     | Danos materiales | Valor asegurado danos materiales | 100000000      |
And cotice una poliza
And ingrese la informacion de un acuerdo facultativo <descripcionDeAcuerdo>
When Ingrese la información de un reasegurador en la tabla de reaseguradores
|modalidad |porcentajeParticipacion|valorReaseguro|comisionReasegurador|comisionIntermediario|comisionPromotora|
|Net rate  |100                    |1,8           |20                  |4                    |8                |
Then el valor de tasa neta de cesion debe tomar el valor definido para regla de negocio

Examples:
|descripcionDeAcuerdo  |
|Descripcion de acuerdo|

Scenario: valida mensaje cuando la utilidad en un reaseguro es negativa
Given estoy cotizando una poliza de mrc:
|organizacion|producto               |canal            |tipo_documento      |fecha_nacimiento|primer_nombre|primer_apellido|tipo_direccion         |direccion       |departamento|ciudad  |agente|
|Sura        |Multiriesgo corporativo|Canal Tradicional|CEDULA DE CIUDADANIA|10/10/1973      |ALEJANDRO    |CUATEMO        |DIRECCION DE RESIDENCIA|CALLE 27a #60-68|Antioquia   |Medellin|INT-3 |
And ingrese a edificios y ubicaciones
And intente ingresar una nueva ubicacion sin riesgo consultable
And intente ingresar las entradas de las diferentes coberturas
| TAB                      | TIPO_ARTICULO | OTRO_ARTICULO_OTROS | COBERTURA        | ENTRADAS                         | VALOR_ENTRADAS |
| Información de Artículos | Edificios     |                     |                  | Valor Reconstrucción             | 100000000      |
| Información de Artículos | Edificios     |                     | Danos materiales | Valor asegurado danos materiales | 100000000      |
And cotice una poliza
And ingrese la informacion de un acuerdo facultativo <descripcionDeAcuerdo>
When Ingrese la información de un reasegurador en la tabla de reaseguradores
|modalidad |porcentajeParticipacion|valorReaseguro|comisionReasegurador|comisionIntermediario|comisionPromotora|
|Net rate  |100                    |1,8           |20                  |11                   |20               |
Then se debe mostrar un mensaje <mensaje> validando utilidades negativas

Examples:
|descripcionDeAcuerdo  |mensaje                    |
|Descripcion de acuerdo| utiilidad sura es negativa|

Scenario: calculo de prima bruta en acuerdo facultativo
Given estoy cotizando una poliza de mrc:
|organizacion|producto               |canal            |tipo_documento      |fecha_nacimiento|primer_nombre|primer_apellido|tipo_direccion         |direccion       |departamento|ciudad  |agente|
|Sura        |Multiriesgo corporativo|Canal Tradicional|CEDULA DE CIUDADANIA|10/10/1973      |JONATHAN     |MEJIA          |DIRECCION DE RESIDENCIA|CALLE 27a #60-68|Antioquia   |Medellin|INT-3 |
And ingrese a edificios y ubicaciones
And intente ingresar una nueva ubicacion sin riesgo consultable
And intente ingresar las entradas de las diferentes coberturas
| TAB                      | TIPO_ARTICULO | OTRO_ARTICULO_OTROS | COBERTURA        | ENTRADAS                         | VALOR_ENTRADAS |
| Información de Artículos | Edificios     |                     |                  | Valor Reconstrucción             | 100000000      |
| Información de Artículos | Edificios     |                     | Danos materiales | Valor asegurado danos materiales | 100000000      |
And cotice una poliza
And ingrese la informacion de un acuerdo facultativo <descripcionDeAcuerdo>
When Ingrese la información de un reasegurador en la tabla de reaseguradores
|modalidad    |porcentajeParticipacion|valorReaseguro|comisionReasegurador|comisionIntermediario|comisionPromotora|
|Gross premium|20                     |130000        |30                  |7                    |3                |
Then el valor de la prima bruta de cesion debe tomar el mismo valor de la columna en la tabla

Examples:
|descripcionDeAcuerdo  |
|Descripcion de acuerdo|




