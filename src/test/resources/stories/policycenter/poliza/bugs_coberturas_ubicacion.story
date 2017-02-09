Meta:
@lote2
@Story CDSEG-2887
@tag equipo: 2
@Sprint 6


Scenario: 1 Bug CDSEG-1900 Validaciones en valores de los sublimites cobertura
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza de mrc:
|producto               |tipo_documento      |fecha_nacimiento|primer_nombre|primer_apellido|tipo_direccion         |direccion       |departamento|ciudad  |agente|
|Multiriesgo corporativo|CEDULA DE CIUDADANIA|11/02/1971      |YAIR         |CARMELO        |DIRECCION DE RESIDENCIA|CALLE 45Q #15-28|Antioquia   |Medellin|INT-3 |
When agregue una nueva ubicacion:
|departamento|ciudad  |direccion        |descripcion  |actividad                    |
|Antioquia   |Medellin|CR 44 A # 43 - 00|Edificio Core|Acabado de productos textiles|
And seleccione algunos articulos y sus cobertura:
|articulo |valor_asegurable|coberturas|
|Building |10000           |Terremoto |
And ingrese las entradas de las diferentes coberturas
| TAB                      | TIPO_ARTICULO | OTRO_ARTICULO_OTROS | COBERTURA        | ENTRADAS                                            | VALOR_ENTRADAS |
| Coberturas del Riesgo    |               |                     | Danos materiales | Sublimite para gastos para la remocion de escombros | 10001          |
And haga clic en el boton Aceptar
Then se debe mostrar el o los siguientes mensajes
| MENSAJES_WORKSPACE                                                                                                                                                                                                |
| El valor del "Sublimite para gastos para la remocion de escombros " debe ser menor o igual a la sumatoria de los valores asegurados de la cobertura de "Danos materiales" de todos los artículos de la ubicación. |
Examples:
| numSubscripcion | rolUsuario | descripcion |
| 22222211        | Asesor     |             |


Scenario: 2 Bug CDSEG-2887, CDSEG-2756
Given que estoy en edificios y ubicaciones de una poliza <numSubscripcion> con el rol <rolUsuario>
When intente ingresar las entradas de las diferentes coberturas
| TAB             | TIPO_ARTICULO     | COBERTURA | OTRO_ARTICULO_OTROS | ENTRADAS                                                                             | VALOR_ENTRADAS |
| Otros Articulos | Suelos y Terrenos | Terremoto |                     | Valor asegurado terremoto, temblor de tierra, erupcion volcanica, tsunami y maremoto | 4              |
| Otros Articulos | Suelos y Terrenos |           |                     | Valor Asegurable                                                                     | 4              |
| Otros Articulos | Suelos y Terrenos |           |                     | Índice variable                                                                      | 1              |
| Otros Articulos | Suelos y Terrenos | Terremoto | X                   | Valor asegurado terremoto, temblor de tierra, erupcion volcanica, tsunami y maremoto | 4              |
| Otros Articulos | Suelos y Terrenos |           |                     | Valor Asegurable                                                                     | 4              |
| Otros Articulos | Suelos y Terrenos |           |                     | Índice variable                                                                      | 1              |
Then se debe mostrar el o los siguientes mensajes
| MENSAJES_WORKSPACE                                                                                                                                                                                                |
| Para seleccionar la cobertura de "Terremoto" del articulo "Suelos y Terrenos" debe tener seleccionada la cobertura de "Terremoto" para el artículo "Edificio". |

Examples:
| numSubscripcion | rolUsuario | descripcion |
| 22222211        | Asesor     |             |


