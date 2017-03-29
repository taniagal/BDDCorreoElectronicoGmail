Cobertura Ubicacion Otros

Meta:
@lote2
@tag equipo: 2, sprint: 5


Scenario: 1 Sublimite de perdidas de contenidos en tanques (Coberturas del riesgo), Portadores externos de datos, Gastos por arrendamiento de sistema electronico de procesamiento de datos
GivenStories: stories/policycenter/login_policy.story
Given que estoy en edificios y ubicaciones de una poliza <numSubscripcion> con el rol <rolUsuario>
When intente ingresar las entradas de las diferentes coberturas
| TAB                      | TIPO_ARTICULO         | OTRO_ARTICULO_OTROS | COBERTURA        | ENTRADAS                                                       | VALOR_ENTRADAS |
| Información de Artículos | Existencias Flotantes |                     |                  | Valor asegurado máximo                                         | 10             |
| Información de Artículos | Existencias Flotantes |                     |                  | Exposición promedio                                            | 5              |
| Información de Artículos | Existencias fijas     |                     |                  | Valor Asegurable                                               | 10             |
| Coberturas del Riesgo    |                       |                     | Danos materiales | Sublímite para perdida de contenido en tanques                 | 31             |
| Coberturas del Riesgo    |                       |                     | Danos materiales | Sublimite para gastos asociados a la ocurrencia de una pérdida | 5              |
| Otros Articulos          | Mercancías a granel   |                     |                  | Valor Asegurable                                               | 10             |
And haga clic en el boton Aceptar
Then se debe mostrar el o los siguientes mensajes
| MENSAJES_WORKSPACE                                                                                                                                                                                         |
| El valor de "Sublímite para perdida de contenido en tanques" deber ser menor o igual a la sumatoria de los valores asegurables de " - Mercancías a granel - Existencias fijas - Existencias flotantes - ". |
And intente ingresar las entradas de las diferentes coberturas
| TAB                   | TIPO_ARTICULO | OTRO_ARTICULO_OTROS | COBERTURA                    | ENTRADAS                                                       | VALOR_ENTRADAS |
| Coberturas del Riesgo |               |                     | Portadores externos de datos | Valor asegurado portadores externos de datos                   | 11             |
| Coberturas del Riesgo |               |                     | Danos materiales             | Sublimite para gastos asociados a la ocurrencia de una pérdida | 5              |
And haga clic en el boton Aceptar
Then se debe mostrar el o los siguientes mensajes
| MENSAJES_WORKSPACE                                                                                                      |
| Para poder seleccionar el "Valor asegurado portadores externos de datos " debe tener asegurado "Equipo electrónico fijo |
And intente ingresar las entradas de las diferentes coberturas
| TAB                   | TIPO_ARTICULO | OTRO_ARTICULO_OTROS | COBERTURA                                                                 | ENTRADAS                                                                                  | VALOR_ENTRADAS |
| Coberturas del Riesgo |               |                     | Gastos por arrendamiento de sistema electrónico de procesamiento de datos | Valor asegurado gastos por arrendamiento de sistema electronico de procesamiento de datos | 11             |
| Coberturas del Riesgo |               |                     | Danos materiales                                                          | Sublimite para gastos asociados a la ocurrencia de una pérdida                            | 5              |
And haga clic en el boton Aceptar
Then se debe mostrar el o los siguientes mensajes
| MENSAJES_WORKSPACE                                                                                                                                                  |
| Para poder seleccionar el "Valor asegurado gastos por arrendamiento de sistema electronico de procesamiento de datos" debe tener asegurado "Equipo electrónico fijo |

Examples:
| numSubscripcion | rolUsuario | descripcion |
| 22222211        | Asesor     |             |


Scenario: 2 Sublimite todo riesgo construccion y/o todo riesgo montaje dentro de los predios asegurados (Coberturas del riesgo) - Porcentaje, Sublimites menores a valor asegurado daños (coberturas a nivel de riesgo)
Given que estoy en edificios y ubicaciones de una poliza <numSubscripcion> con el rol <rolUsuario>
When intente ingresar una nueva ubicacion sin riesgo consultable
And intente ingresar las entradas de las diferentes coberturas
| TAB                      | TIPO_ARTICULO       | OTRO_ARTICULO_OTROS | COBERTURA                                      | ENTRADAS                                                                                          | VALOR_ENTRADAS |
| Información de Artículos | Edificios           |                     |                                                | Valor Reconstrucción                                                                              | 50             |
| Información de Artículos | Maquinaria y equipo |                     |                                                | Valor Asegurable                                                                                  | 46             |
| Coberturas del Riesgo    |                     |                     | Danos materiales                               | Sublimite para gastos asociados a la ocurrencia de una pérdida                                    | 5              |
| Coberturas del Riesgo    |                     |                     | Todo riesgo construcción y todo riesgo montaje | Valor asegurado todo riesgo construccion y/o todo riesgo montaje dentro de los predios asegurados | 11             |
| Otros Articulos          | Animales vivos      |                     |                                                | Valor Asegurable                                                                                  | 4              |
| Otros Articulos          | Animales vivos      |                     |                                                | Índice variable                                                                                   | 1              |
Then se debe mostrar el o los siguientes mensajes
| MENSAJES_WORKSPACE                                                                                                                                                                                                      |
| El valor de "Valor asegurado todo riesgo construccion y/o todo riesgo montaje dentro de los predios asegurados" deber ser menor o igual al "10,0%" de la sumatoria de los valores asegurables de "todos los articulos". |
And intente ingresar las entradas de las diferentes coberturas
| TAB                      | TIPO_ARTICULO | OTRO_ARTICULO_OTROS | COBERTURA        | ENTRADAS                                                                                                                                               | VALOR_ENTRADAS |
| Información de Artículos | Edificios     |                     |                  | Valor Reconstrucción                                                                                                                                   | 200            |
| Información de Artículos | Edificios     |                     | Danos materiales | Valor asegurado danos materiales                                                                                                                       | 51             |
| Coberturas del Riesgo    |               |                     | Danos materiales | Sublimite para gastos asociados a la ocurrencia de una pérdida                                                                                         | 52             |
| Coberturas del Riesgo    |               |                     | Danos materiales | Sublimite para gastos para la preservación de bienes y extinción del siniestro                                                                         | 52             |
| Coberturas del Riesgo    |               |                     | Danos materiales | Sublimite para gastos para la remoción de escombros                                                                                                    | 52             |
| Coberturas del Riesgo    |               |                     | Danos materiales | Sublimite para gastos por honorarios profesionales                                                                                                     | 52             |
| Coberturas del Riesgo    |               |                     | Danos materiales | Sublimite para gastos para demostrar la ocurrencia y la cuantía del siniestro                                                                          | 52             |
| Coberturas del Riesgo    |               |                     | Danos materiales | Sublimite para gastos para la reposición de documentos                                                                                                 | 52             |
| Coberturas del Riesgo    |               |                     | Danos materiales | Sublimite para bienes de propiedad de directores y empleados                                                                                           | 52             |
| Coberturas del Riesgo    |               |                     | Danos materiales | Sublimite para gastos adicionales por concepto de horas extras, trabajo nocturno y en feriados, flete expreso, flete aéreo y gastos de viaje y estadía | 52             |
| Coberturas del Riesgo    |               |                     | Danos materiales | Sublimite para gastos para la obtención de licencias y permisos para reconstruir el inmueble asegurado                                                 | 52             |
| Coberturas del Riesgo    |               |                     | Danos materiales | Sublímite para perdida de contenido en tanques                                                                                                         | 52             |
| Coberturas del Riesgo    |               |                     | Danos materiales | Sublimite para derrame de materiales en fusion                                                                                                         | 52             |
| Coberturas del Riesgo    |               |                     | Danos materiales | Sublimite para deterioro de bienes refrigerados por rotura de maquinaria                                                                               | 52             |
Then se debe mostrar el o los siguientes mensajes
| MENSAJES_WORKSPACE                                                                                                                                                                                                                                                                                                     |
El valor del "Sublimite para deterioro de bienes refrigerados por rotura de maquinaria " debe ser menor o igual a la sumatoria de los valores asegurados de la cobertura "Danos materiales" de los articulos "-Existencias flotantes - Existencias fijas - ".                                                            |
|El valor del "Sublimite para gastos asociados a la ocurrencia de una pérdida" debe ser menor o igual a la sumatoria de los valores asegurados de la cobertura de "Danos materiales" de todos los artículos de la ubicación.                                                                                             |
|El valor del "Sublimite para gastos para la preservación de bienes y extinción del siniestro " debe ser menor o igual a la sumatoria de los valores asegurados de la cobertura de "Danos materiales" de todos los artículos de la ubicación.                                                                            |
|El valor del "Sublimite para gastos para la remoción de escombros " debe ser menor o igual a la sumatoria de los valores asegurados de la cobertura de "Danos materiales" de todos los artículos de la ubicación.                                                                                                       |
|El valor del "Sublimite para gastos por honorarios profesionales " debe ser menor o igual a la sumatoria de los valores asegurados de la cobertura de "Danos materiales" de todos los artículos de la ubicación.                                                                                                        |
|El valor del "Sublimite para gastos para demostrar la ocurrencia y la cuantía del siniestro " debe ser menor o igual a la sumatoria de los valores asegurados de la cobertura de "Danos materiales" de todos los artículos de la ubicación.                                                                             |
|El valor del "Sublimite para gastos para la reposición de documentos " debe ser menor o igual a la sumatoria de los valores asegurados de la cobertura de "Danos materiales" de todos los artículos de la ubicación.                                                                                                    |                                                                                                      |
|El valor del "Sublimite para bienes de propiedad de directores y empleados " debe ser menor o igual a la sumatoria de los valores asegurados de la cobertura de "Danos materiales" de todos los artículos de la ubicación.                                                                                              |
|El valor del "Sublimite para gastos adicionales por concepto de horas extras, trabajo nocturno y en feriados, flete expreso, flete aéreo y gastos de viaje y estadía " debe ser menor o igual a la sumatoria de los valores asegurados de la cobertura de "Danos materiales" de todos los artículos de la ubicación.    |
|El valor del "Sublimite para gastos para la obtención de licencias y permisos para reconstruir el inmueble asegurado " debe ser menor o igual a la sumatoria de los valores asegurados de la cobertura de "Danos materiales" de todos los artículos de la ubicación.                                                    |
|El valor del "Sublímite para perdida de contenido en tanques" debe ser menor o igual a la sumatoria de los valores asegurados de la cobertura de "Danos materiales" de todos los artículos de la ubicación.                                                                                                             |
|El valor del "Sublimite para derrame de materiales en fusion" debe ser menor o igual a la sumatoria de los valores asegurados de la cobertura de "Danos materiales" de todos los artículos de la ubicación.                                                                                                             |
|El valor del "Sublimite para deterioro de bienes refrigerados por rotura de maquinaria " debe ser menor o igual a la sumatoria de los valores asegurados de la cobertura de "Danos materiales" de todos los artículos de la ubicación.                                                                                  |
Examples:
| numSubscripcion | rolUsuario | descripcion |
| 22222211        | Asesor     |             |