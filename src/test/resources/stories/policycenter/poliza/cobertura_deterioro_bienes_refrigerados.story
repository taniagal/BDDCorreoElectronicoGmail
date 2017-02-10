Meta:
@lote4
@tag equipo: 2
@Sprint 5

Scenario: 1 Valor asegurado de la cobertura Deterioro de bienes refigerados por rotura maquinaria (Coberturas del riesgo)
GivenStories: stories/policycenter/login_policy.story
Given que estoy en edificios y ubicaciones de una poliza <numSubscripcion> con el rol <rolUsuario>
When seleccione algunos articulos y sus cobertura:
| articulo        | valor_asegurable | coberturas|exposicionpromedio|
| FloatExixtences | 11               | Danos     |4                 |
| FixedExistences | 11               | Danos     |4                 |
And ingrese las entradas de las diferentes coberturas
| TAB                      | TIPO_ARTICULO         | OTRO_ARTICULO_OTROS | COBERTURA        | ENTRADAS                                                                 | VALOR_ENTRADAS |
| Coberturas del Riesgo    |                       |                     | Danos materiales | Sublimite para deterioro de bienes refrigerados por rotura de maquinaria | 25             |
And haga clic en el boton Aceptar
Then se debe mostrar el o los siguientes mensajes
| MENSAJES_WORKSPACE                                                                                                                                                                                                                                            |
| El valor del "Sublimite para deterioro de bienes refrigerados por rotura de maquinaria " debe ser menor o igual a la sumatoria de los valores asegurados de la cobertura "Danos materiales" de los articulos "-Existencias flotantes - Existencias fijas - ". |
Examples:
| numSubscripcion | rolUsuario | descripcion |
| 22222211        | Asesor     |             |



Scenario: 2 Valor asegurado de la cobertura Deterioro de bienes refigerados por rotura maquinaria (Coberturas del riesgo) - 40 porciento
Given que estoy en edificios y ubicaciones de una poliza <numSubscripcion> con el rol <rolUsuario>
When intente ingresar una nueva ubicacion sin riesgo consultable
And seleccione algunos articulos y sus cobertura:
| articulo        | valor_asegurable | coberturas|
| Building        | 2                |           |
And ingrese las entradas de las diferentes coberturas
| TAB                      | TIPO_ARTICULO       | OTRO_ARTICULO_OTROS | COBERTURA        | ENTRADAS                                                                 | VALOR_ENTRADAS |
| Coberturas del Riesgo    |                     |                     | Danos materiales | Sublimite para deterioro de bienes refrigerados por rotura de maquinaria | 9              |
| Otros Articulos          | Animales vivos      |                     |                  | Valor Asegurable                                                         | 4              |
| Otros Articulos          | Animales vivos      |                     |                  | Índice variable                                                          | 1              |
When haga clic en el boton Aceptar
Then se debe mostrar el o los siguientes mensajes
| MENSAJES_WORKSPACE                                                                                                                                                                              |
| El valor de "Sublimite para deterioro de bienes refrigerados por rotura de maquinaria " deber ser menor o igual al "40,0%" de la sumatoria de los valores asegurables de "todos los articulos". |
Examples:
| numSubscripcion | rolUsuario | descripcion |
| 22222211        | Asesor     |             |



Scenario: 3 Cobertura de terremoto para suelos y terrenos (categoría otros)
Given que estoy en edificios y ubicaciones de una poliza <numSubscripcion> con el rol <rolUsuario>
When intente ingresar una nueva ubicacion sin riesgo consultable
And seleccione algunos articulos y sus cobertura:
| articulo        | valor_asegurable | coberturas|
| Building        | 50               |           |
And ingrese las entradas de las diferentes coberturas
| TAB                      | TIPO_ARTICULO     | OTRO_ARTICULO_OTROS | COBERTURA | ENTRADAS                                                                             | VALOR_ENTRADAS |
| Otros Articulos          | Suelos y Terrenos |                     | Terremoto | Valor asegurado terremoto, temblor de tierra, erupcion volcanica, tsunami y maremoto | 25             |
| Otros Articulos          | Suelos y Terrenos |                     |           | Valor Asegurable                                                                     | 25             |
| Otros Articulos          | Suelos y Terrenos |                     |           | Índice variable                                                                      | 1              |
When haga clic en el boton Aceptar
Then se debe mostrar el o los siguientes mensajes
| MENSAJES_WORKSPACE                                                                                                                                            |
| El valor de "Terremoto - Artículo: Suelos y Terrenos" deber ser menor o igual al "20,0%" de la sumatoria de los valores asegurables de "todos los articulos". |
Examples:
| numSubscripcion | rolUsuario | descripcion |
| 22222211        | Asesor     |             |


Scenario: 4 Cobertura de terremoto para suelos y terrenos máximo 1000 millones
Given que estoy en edificios y ubicaciones de una poliza <numSubscripcion> con el rol <rolUsuario>
When intente ingresar una nueva ubicacion sin riesgo consultable
And seleccione algunos articulos y sus cobertura:
| articulo        | valor_asegurable | coberturas|
| Building        | 1000000001       |           |
And ingrese las entradas de las diferentes coberturas
| TAB                      | TIPO_ARTICULO     | OTRO_ARTICULO_OTROS | COBERTURA | ENTRADAS                                                                             | VALOR_ENTRADAS |
| Otros Articulos          | Suelos y Terrenos |                     | Terremoto | Valor asegurado terremoto, temblor de tierra, erupcion volcanica, tsunami y maremoto | 1000000001     |
| Otros Articulos          | Suelos y Terrenos |                     |           | Valor Asegurable                                                                     | 25             |
| Otros Articulos          | Suelos y Terrenos |                     |           | Índice variable                                                                      | 1              |
When haga clic en el boton Aceptar
Then se debe mostrar el o los siguientes mensajes
| MENSAJES_WORKSPACE                                                                                                              |
| El valor asegurado de la cobertura "Terremoto - Artículo: Suelos y Terrenos" debe ser menor o igual a "1000000000.00" de pesos |
Examples:
| numSubscripcion | rolUsuario | descripcion |
| 22222211        | Asesor     |             |


Scenario: 5 Cobertura de terremoto para suelos y terrenos  Edificio obligatorio
Given que estoy en edificios y ubicaciones de una poliza <numSubscripcion> con el rol <rolUsuario>
When copie la poliza
And ingrese a edificios y ubicaciones
And intente ingresar una nueva ubicacion sin riesgo consultable
And intente ingresar las entradas de las diferentes coberturas
| TAB             | TIPO_ARTICULO     | OTRO_ARTICULO_OTROS | COBERTURA | ENTRADAS                                                                             | VALOR_ENTRADAS |
| Otros Articulos | Suelos y Terrenos |                     | Terremoto | Valor asegurado terremoto, temblor de tierra, erupcion volcanica, tsunami y maremoto | 1000000000     |
| Otros Articulos | Suelos y Terrenos |                     |           | Valor Asegurable                                                                     | 25             |
| Otros Articulos | Suelos y Terrenos |                     |           | Índice variable                                                                      | 1              |
Then se debe mostrar el o los siguientes mensajes
| MENSAJES_WORKSPACE                                                                                                                                             |
| Para seleccionar la cobertura de "Terremoto" del articulo "Suelos y Terrenos" debe tener seleccionada la cobertura de "Terremoto" para el artículo "Edificio". |
Examples:
| numSubscripcion | rolUsuario | descripcion |
| 22222211        | Asesor     |             |


Scenario: 6 Parametro de 1000 millones y 20%
Meta:
@manual
Given Estoy ingresando la información de coberturas a nivel de riesgo
When Quiera cambiar el valor de 1,000 millones a otro valor o quiera cambiar el valor del 20% a otro valor
Then Se cambie simplemente en una tabla de parámetros. Estos valores no deben estar quemados en el código.
Examples:
| numSubscripcion | rolUsuario | descripcion |
| 22222211        | Asesor     |             |



Scenario: 7 Parametro del 40 porciento
Meta:
@manual
Given he ingresado al Product Designer
When seleccione en System Tables
And seleccione cp_term_articles_rules_ext.xml
And ingrese el porcentaje para el MRCBRefrigRotMaqLimSubUbic en la columna PercentInsuredValue
And guarde los cambios y suba dichos cambios al servidor
Then debe poner cambiar el porcentaje del parametro
Examples:
| numSubscripcion | rolUsuario | descripcion |
| 22222211        | Asesor     |             |
