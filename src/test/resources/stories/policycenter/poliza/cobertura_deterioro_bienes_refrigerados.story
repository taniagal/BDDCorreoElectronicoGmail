Cobertura Deterioro Bienes Refrigerados

Meta: @lote4
@Story CDSEG-943
@URL https://jira.suramericana.com.co/browse/CDSEG-943
@tag automator:andres_alarcon_guerrero, informer:alejandro_esteban_villada_marin, sprint:5
@LOB Multiriesgo corporativo
@Sprint 5

Scenario: 1 Valor asegurado de la cobertura Deterioro de bienes refigerados por rotura maquinaria (Coberturas del riesgo)
Given que estoy en edificios y ubicaciones de una poliza <numSubscripcion> con el rol <rolUsuario>
When intente ingresar las entradas de las diferentes coberturas
| TAB                      | TIPO_ARTICULO         | OTRO_ARTICULO_OTROS | COBERTURA        | ENTRADAS                                                                 | VALOR_ENTRADAS |
| Coberturas del Riesgo    |                       |                     | Danos materiales | Sublimite para deterioro de bienes refrigerados por rotura de maquinaria | 11             |
| Información de Artículos | Existencias Flotantes |                     | Danos materiales | Valor asegurado danos materiales                                         | 2              |
| Información de Artículos | Existencias Flotantes |                     |                  | Valor asegurado máximo                                                   | 11             |
| Información de Artículos | Existencias fijas     |                     | Danos materiales | Valor asegurado danos materiales                                         | 2              |
| Información de Artículos | Existencias fijas     |                     |                  | Valor Asegurable                                                         | 11             |
When haga clic en el boton Aceptar
Then se debe mostrar el siguiente mensaje como lo hace guidewire (espacio de trabajo)
| MENSAJES_WORKSPACE                                                                                                                                                                                                                                            |
| El valor del "Sublimite para deterioro de bienes refrigerados por rotura de maquinaria " debe ser menor o igual a la sumatoria de los valores asegurados de la cobertura "Danos materiales" de los articulos "-Existencias flotantes - Existencias fijas - ". |
Then no debe dejar continuar y debe permanecer en la pagina Agregar Articulo
Examples:
| numSubscripcion | rolUsuario | descripcion |
| 22222211        | Asesor     |             |



Scenario: 2 Valor asegurado de la cobertura Deterioro de bienes refigerados por rotura maquinaria (Coberturas del riesgo) - 40 porciento
Given que estoy en edificios y ubicaciones de una poliza <numSubscripcion> con el rol <rolUsuario>
When intente ingresar una nueva ubicacion sin riesgo consultable
And intente ingresar las entradas de las diferentes coberturas
| TAB                      | TIPO_ARTICULO       | OTRO_ARTICULO_OTROS | COBERTURA        | ENTRADAS                                                                 | VALOR_ENTRADAS |
| Coberturas del Riesgo    |                     |                     | Danos materiales | Sublimite para deterioro de bienes refrigerados por rotura de maquinaria | 9              |
| Información de Artículos | Edificios           |                     |                  | Valor Reconstrucción                                                     | 2              |
| Información de Artículos | Maquinaria y equipo |                     |                  | Valor Asegurable                                                         | 2              |
| Otros Articulos          | Animales vivos      |                     |                  | Valor Asegurable                                                         | 4              |
| Otros Articulos          | Animales vivos      |                     |                  | Índice variable                                                          | 1              |
When haga clic en el boton Aceptar
Then se debe mostrar el siguiente mensaje como lo hace guidewire (espacio de trabajo)
| MENSAJES_WORKSPACE                                                                                                                                                                              |
| El valor de "Sublimite para deterioro de bienes refrigerados por rotura de maquinaria " deber ser menor o igual al "40,0%" de la sumatoria de los valores asegurables de "todos los articulos". |
Then no debe dejar continuar y debe permanecer en la pagina Agregar Articulo
Examples:
| numSubscripcion | rolUsuario | descripcion |
| 22222211        | Asesor     |             |


Scenario: 3 Parametro del 40 porciento
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



Scenario: 4 Cobertura de terremoto para suelos y terrenos (categoría otros)
Given que estoy en edificios y ubicaciones de una poliza <numSubscripcion> con el rol <rolUsuario>
When intente ingresar una nueva ubicacion sin riesgo consultable
And intente ingresar las entradas de las diferentes coberturas
| TAB                      | TIPO_ARTICULO     | OTRO_ARTICULO_OTROS | COBERTURA | ENTRADAS                                                                             | VALOR_ENTRADAS |
| Información de Artículos | Edificios         |                     |           | Valor Reconstrucción                                                                 | 50             |
| Otros Articulos          | Suelos y Terrenos |                     | Terremoto | Valor asegurado terremoto, temblor de tierra, erupcion volcanica, tsunami y maremoto | 25             |
| Otros Articulos          | Suelos y Terrenos |                     |           | Valor Asegurable                                                                     | 25             |
| Otros Articulos          | Suelos y Terrenos |                     |           | Índice variable                                                                      | 1              |
When haga clic en el boton Aceptar
Then se debe mostrar el siguiente mensaje
| MENSAJES_WORKSPACE                                                                                                                                            |
| El valor de "Terremoto - Artículo: Suelos y Terrenos" deber ser menor o igual al "20,0%" de la sumatoria de los valores asegurables de "todos los articulos". |
Examples:
| numSubscripcion | rolUsuario | descripcion |
| 22222211        | Asesor     |             |


Scenario: 5 Cobertura de terremoto para suelos y terrenos máximo 1000 millones
Given que estoy en edificios y ubicaciones de una poliza <numSubscripcion> con el rol <rolUsuario>
When intente ingresar una nueva ubicacion sin riesgo consultable
And intente ingresar las entradas de las diferentes coberturas
| TAB                      | TIPO_ARTICULO     | OTRO_ARTICULO_OTROS | COBERTURA | ENTRADAS                                                                             | VALOR_ENTRADAS |
| Información de Artículos | Edificios         |                     |           | Valor Reconstrucción                                                                 | 1000000001     |
| Otros Articulos          | Suelos y Terrenos |                     | Terremoto | Valor asegurado terremoto, temblor de tierra, erupcion volcanica, tsunami y maremoto | 1000000001     |
| Otros Articulos          | Suelos y Terrenos |                     |           | Valor Asegurable                                                                     | 25             |
| Otros Articulos          | Suelos y Terrenos |                     |           | Índice variable                                                                      | 1              |
When haga clic en el boton Aceptar
Then se debe mostrar el siguiente mensaje como lo hace guidewire (espacio de trabajo)
| MENSAJES_WORKSPACE                                                                                                              |
| El valor asegurado de la cobertura "Terremoto - Artículo: Suelos y Terrenos" debe ser menor o igual a "1000000000.00" de pesos |
Examples:
| numSubscripcion | rolUsuario | descripcion |
| 22222211        | Asesor     |             |


Scenario: 6 Cobertura de terremoto para suelos y terrenos  Edificio obligatorio
Given que estoy en edificios y ubicaciones de una poliza <numSubscripcion> con el rol <rolUsuario>
When copie la poliza
And ingrese a edificios y ubicaciones
And intente ingresar una nueva ubicacion sin riesgo consultable
And intente ingresar las entradas de las diferentes coberturas
| TAB             | TIPO_ARTICULO     | OTRO_ARTICULO_OTROS | COBERTURA | ENTRADAS                                                                             | VALOR_ENTRADAS |
| Otros Articulos | Suelos y Terrenos |                     | Terremoto | Valor asegurado terremoto, temblor de tierra, erupcion volcanica, tsunami y maremoto | 1000000000     |
| Otros Articulos | Suelos y Terrenos |                     |           | Valor Asegurable                                                                     | 25             |
| Otros Articulos | Suelos y Terrenos |                     |           | Índice variable                                                                      | 1              |
Then se debe mostrar el siguiente mensaje como lo hace guidewire (espacio de trabajo)
| MENSAJES_WORKSPACE                                                                                                                                             |
| Para seleccionar la cobertura de "Terremoto" del articulo "Suelos y Terrenos" debe tener seleccionada la cobertura de "Terremoto" para el artículo "Edificio". |
Examples:
| numSubscripcion | rolUsuario | descripcion |
| 22222211        | Asesor     |             |


Scenario: 7 Parametro de 1000 millones y 20%
Meta:
@manual
Given Estoy ingresando la información de coberturas a nivel de riesgo
When Quiera cambiar el valor de 1,000 millones a otro valor o quiera cambiar el valor del 20% a otro valor
Then Se cambie simplemente en una tabla de parámetros. Estos valores no deben estar quemados en el código.
Examples:
| numSubscripcion | rolUsuario | descripcion |
| 22222211        | Asesor     |             |

