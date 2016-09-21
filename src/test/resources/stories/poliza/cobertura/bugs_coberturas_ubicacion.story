bugs coberturas ubicacion

Meta:

Scenario: 1 Bug CDSEG-2887
Meta:
@Story CDSEG-2887
@URL https://jira.suramericana.com.co/browse/CDSEG-2887
@tag automator:andres_alarcon_guerrero, informer:alejandro_esteban_villada_marin, sprint:6
@LOB Multiriesgo corporativo
@Sprint 6

Given que estoy en edificios y ubicaciones de una poliza <numSubscripcion> con el rol <rolUsuario>
When intente ingresar las entradas de las diferentes coberturas
| TAB             | TIPO_ARTICULO     | COBERTURA | OTRO_ARTICULO_OTROS | ENTRADAS                                                                             | VALOR_ENTRADAS |
| Otros Articulos | Suelos y Terrenos | Terremoto |                     | Valor asegurado terremoto, temblor de tierra, erupcion volcanica, tsunami y maremoto | 4              |
| Otros Articulos | Suelos y Terrenos |           |                     | Valor Asegurable                                                                     | 4              |
| Otros Articulos | Suelos y Terrenos |           |                     | Índice variable                                                                      | 1              |
| Otros Articulos | Suelos y Terrenos | Terremoto | X                   | Valor asegurado terremoto, temblor de tierra, erupcion volcanica, tsunami y maremoto | 4              |
| Otros Articulos | Suelos y Terrenos |           |                     | Valor Asegurable                                                                     | 4              |
| Otros Articulos | Suelos y Terrenos |           |                     | Índice variable                                                                      | 1              |
When haga clic en el boton Aceptar
Then se espera que el siguiente mensaje se muestre una sola vez: Para seleccionar la cobertura de "Terremoto" del articulo "Suelos y Terrenos" debe tener seleccionada la cobertura de "Terremoto" para el artículo "Edificio".
Examples:
| numSubscripcion | rolUsuario | descripcion |
| 22222236        | Asesor     |             |


Scenario: 2 Bug CDSEG-2756
Meta:
@Story CDSEG-2756
@URL https://jira.suramericana.com.co/browse/CDSEG-2756
@tag bug:CDSEG-2756, automator:andres_alarcon_guerrero, informer:alejandro_esteban_villada_marin, sprint:6
@LOB Multiriesgo corporativo
@Sprint 6

Given que estoy en edificios y ubicaciones de una poliza <numSubscripcion> con el rol <rolUsuario>
When intente ingresar las entradas de las diferentes coberturas
| TAB             | TIPO_ARTICULO     | COBERTURA | OTRO_ARTICULO_OTROS | ENTRADAS                                                                             | VALOR_ENTRADAS |
| Otros Articulos | Suelos y Terrenos | Terremoto |                     | Valor asegurado terremoto, temblor de tierra, erupcion volcanica, tsunami y maremoto | 4              |
| Otros Articulos | Suelos y Terrenos |           |                     | Valor Asegurable                                                                     | 4              |
| Otros Articulos | Suelos y Terrenos |           |                     | Índice variable                                                                      | 1              |
| Otros Articulos | Suelos y Terrenos | Terremoto | X                   | Valor asegurado terremoto, temblor de tierra, erupcion volcanica, tsunami y maremoto | 4              |
| Otros Articulos | Suelos y Terrenos |           |                     | Valor Asegurable                                                                     | 4              |
| Otros Articulos | Suelos y Terrenos |           |                     | Índice variable                                                                      | 1              |
When haga clic en el boton Aceptar
Then se espera que el siguiente mensaje se muestre una sola vez: Para seleccionar la cobertura de "Terremoto" del articulo "Suelos y Terrenos" debe tener seleccionada la cobertura de "Terremoto" para el artículo "Edificio".
Examples:
| numSubscripcion | rolUsuario | descripcion |
| 22222236        | Asesor     |             |

Scenario: 3 Bug CDSEG-1900 Validaciones en valores de los sublimites cobertura
Meta:
@Story CDSEG-1900
@URL https://jira.suramericana.com.co/browse/CDSEG-1900
@tag bug:CDSEG-1900,  automator:andres_alarcon_guerrero, informer:alejandro_esteban_villada_marin, sprint:4
@Sprint 4
Given que estoy en edificios y ubicaciones de una poliza <numSubscripcion> con el rol <rolUsuario>
When intente ingresar las entradas de las diferentes coberturas
| TAB                      | TIPO_ARTICULO | OTRO_ARTICULO_OTROS | COBERTURA        | ENTRADAS                                            | VALOR_ENTRADAS |
| Información de Artículos | Edificios     |                     |                  | Valor Reconstrucción                                | 10000          |
| Información de Artículos | Edificios     |                     | Danos materiales | Valor asegurado danos materiales                    | 9998           |
| Coberturas del Riesgo    |               |                     | Danos materiales | Sublimite para gastos para la remocion de escombros | 10001          |
When haga clic en el boton Aceptar
Then se debe validar que ningun sublimite de las coberturas anteriores sobrepase el valor asegurado de la cobertura de sustraccion con violencia (sustraccion principal)
| MENSAJES_WORKSPACE                                                                                                                                                                                                |
| El valor del "Sublimite para gastos para la remocion de escombros " debe ser menor o igual a la sumatoria de los valores asegurados de la cobertura de "Danos materiales" de todos los artículos de la ubicación. |
Then no debe dejar continuar y debe permanecer en la pagina Agregar Articulo
Examples:
| numSubscripcion | rolUsuario | descripcion |
| 22222236        | Asesor     |             |