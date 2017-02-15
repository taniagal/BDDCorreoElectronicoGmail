Meta:
@lote4
@sprint 8
@tag equipo: reaseguro
@local

Narrative:
como usuario de policycenter en reaseguro
Quiero ser capaz de visualizar y analizar la distribucion en los porcentajes de primas cedidas a los reaseguradores
Para tener informacion acerca del comportamiento de los contratos de reaseguro y acuerdos facultativos


Scenario: mostrar nombre de cobertura en el riesgo
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza de mrc:
|organizacion|producto               |canal            |tipo_documento      |fecha_nacimiento|primer_nombre|primer_apellido|tipo_direccion         |direccion        |departamento|ciudad  |agente|
|Sura        |Multiriesgo corporativo|Canal Tradicional|CEDULA DE CIUDADANIA|10/10/1973      |LALO         |TOBON          |DIRECCION DE RESIDENCIA|CALLE 12a #63Q-95|Antioquia   |Medellin|INT-3 |
And ingrese a edificios y ubicaciones
And intente ingresar una nueva ubicacion sin riesgo consultable
| pais    | departamento| ciudad   | direccion   | actividadEconomica                           |
| Colombia| Antioquia   | Medellin | CR 400 25 46 | Acabado de productos textiles                |
And intente ingresar las entradas de las diferentes coberturas
| TAB                      | TIPO_ARTICULO       | OTRO_ARTICULO_OTROS | COBERTURA        | ENTRADAS                         | VALOR_ENTRADAS |
| Información de Artículos | Edificios           |                     |                  | Valor Reconstrucción             | 2000000000     |
| Información de Artículos | Edificios           |                     | Danos materiales | Valor asegurado danos materiales | 2000000000     |
And cotice y expida una poliza
When El usuario quiera visualizar las primas cedidas
Then se debe mostrar la informacion de la cobertura y sus montos generales <informacionGeneralCobertura>

Examples:
|informacionGeneralCobertura|
|(Daños materiales)         |

Scenario: validacion de primas correspondientes para cada reasegurador
Given estoy cotizando una poliza de mrc:
|organizacion|producto               |canal            |tipo_documento      |fecha_nacimiento|primer_nombre|primer_apellido|tipo_direccion         |direccion        |departamento|ciudad  |agente|
|Sura        |Multiriesgo corporativo|Canal Tradicional|CEDULA DE CIUDADANIA|10/10/1973      |LALO         |TOBON          |DIRECCION DE RESIDENCIA|CALLE 12a #63Q-95|Antioquia   |Medellin|INT-3 |
And ingrese a edificios y ubicaciones
And intente ingresar una nueva ubicacion sin riesgo consultable
| pais    | departamento| ciudad   | direccion    | actividadEconomica                           |
| Colombia| Antioquia   | Medellin | CR 155 1 64 | Acabado de productos textiles                |
And intente ingresar las entradas de las diferentes coberturas
| TAB                      | TIPO_ARTICULO       | OTRO_ARTICULO_OTROS | COBERTURA        | ENTRADAS                         | VALOR_ENTRADAS  |
| Información de Artículos | Edificios           |                     |                  | Valor Reconstrucción             | 2000000000      |
| Información de Artículos | Edificios           |                     | Danos materiales | Valor asegurado danos materiales | 2000000000      |
| Información de Artículos | Maquinaria y equipo |                     | Danos materiales | Valor Asegurable                 | 2000000000      |
| Información de Artículos | Maquinaria y equipo |                     | Danos materiales | Valor asegurado danos materiales | 2000000000      |
And cotice y expida una poliza
When quiera visualizar la informacion completa de las primas cedidas
And quiera validar que el reaseguro para el contrato cuotaparte o excedente
Then se deben mostrar los valores correspondientes de primas de reasegurador

Examples:
||
||

Scenario: validar nombre de reasegurados en la informacion de reasego
Meta: @manual
Given que tengo una poliza cotizada
When quiera reasegurar la poliza cotizada
And El usuario quiera visualizar las primas cedidas
Then se deben mostrar los nombres de las tablas correspondientes a las coberturas

Examples:
||
||

















