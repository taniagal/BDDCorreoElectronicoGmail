Cobertura Ubicacion Otros

Meta: @lote2
@Story CDSEG-767
@URL https://jira.suramericana.com.co/browse/CDSEG-767
@tag equipo: 2, informer:alejandro_esteban_villada_marin, sprint:5
@LOB Multiriesgo corporativo
@Sprint 5

Scenario: 1 Sublimite de perdidas de contenidos en tanques (Coberturas del riesgo)
Given que estoy en edificios y ubicaciones de una poliza <numSubscripcion> con el rol <rolUsuario>
When intente ingresar las entradas de las diferentes coberturas
| TAB                      | TIPO_ARTICULO         | OTRO_ARTICULO_OTROS | COBERTURA        | ENTRADAS                                       | VALOR_ENTRADAS |
| Información de Artículos | Existencias Flotantes |                     |                  | Valor asegurado máximo                         | 10             |
| Información de Artículos | Existencias fijas     |                     |                  | Valor Asegurable                               | 10             |
| Coberturas del Riesgo    |                       |                     | Danos materiales | Sublímite para perdida de contenido en tanques | 31             |
| Otros Articulos          | Mercancías a granel   |                     |                  | Valor Asegurable                               | 10             |
And haga clic en el boton Aceptar
Then se debe mostrar el siguiente mensaje como lo hace guidewire (espacio de trabajo)
| MENSAJES_WORKSPACE                                                                                                                                                                                         |
| El valor de "Sublímite para perdida de contenido en tanques" deber ser menor o igual a la sumatoria de los valores asegurables de " - Mercancías a granel - Existencias fijas - Existencias flotantes - ". |
Examples:
| numSubscripcion | rolUsuario | descripcion |
| 22222211      | Asesor     |             |


Scenario: 2 Portadores externos de datos (Coberturas del riesgo)
Given que estoy en edificios y ubicaciones de una poliza <numSubscripcion> con el rol <rolUsuario>
When intente ingresar las entradas de las diferentes coberturas
| TAB                   | TIPO_ARTICULO | OTRO_ARTICULO_OTROS | COBERTURA                    | ENTRADAS                                     | VALOR_ENTRADAS |
| Coberturas del Riesgo |               |                     | Portadores externos de datos | Valor asegurado portadores externos de datos | 11             |
When haga clic en el boton Aceptar
Then se debe mostrar el siguiente mensaje como lo hace guidewire (espacio de trabajo)
| MENSAJES_WORKSPACE                                                                                                      |
| Para poder seleccionar el "Valor asegurado portadores externos de datos " debe tener asegurado "Equipo electrónico fijo |
Examples:
| numSubscripcion | rolUsuario | descripcion |
| 22222211      | Asesor     |             |


Scenario: 3 Gastos por arrendamiento de sistema electronico de procesamiento de datos (Coberturas del riesgo)
Given que estoy en edificios y ubicaciones de una poliza <numSubscripcion> con el rol <rolUsuario>
When intente ingresar las entradas de las diferentes coberturas
| TAB                   | TIPO_ARTICULO | OTRO_ARTICULO_OTROS | COBERTURA                                                                 | ENTRADAS                                                                                  | VALOR_ENTRADAS |
| Coberturas del Riesgo |               |                     | Gastos por arrendamiento de sistema electrónico de procesamiento de datos | Valor asegurado gastos por arrendamiento de sistema electronico de procesamiento de datos | 11             |
And haga clic en el boton Aceptar
Then se debe mostrar el siguiente mensaje como lo hace guidewire (espacio de trabajo)
| MENSAJES_WORKSPACE                                                                                                                                                  |
| Para poder seleccionar el "Valor asegurado gastos por arrendamiento de sistema electronico de procesamiento de datos" debe tener asegurado "Equipo electrónico fijo |
Examples:
| numSubscripcion | rolUsuario | descripcion |
| 22222211        | Asesor     |             |


Scenario: 4 Sublimite todo riesgo construccion y/o todo riesgo montaje dentro de los predios asegurados (Coberturas del riesgo) - Porcentaje
Given que estoy en edificios y ubicaciones de una poliza <numSubscripcion> con el rol <rolUsuario>
When intente ingresar una nueva ubicacion sin riesgo consultable
And intente ingresar las entradas de las diferentes coberturas
| TAB                      | TIPO_ARTICULO       | OTRO_ARTICULO_OTROS | COBERTURA                                      | ENTRADAS                                                                                          | VALOR_ENTRADAS |
| Información de Artículos | Edificios           |                     |                                                | Valor Reconstrucción                                                                              | 50             |
| Información de Artículos | Maquinaria y equipo |                     |                                                | Valor Asegurable                                                                                  | 46             |
| Coberturas del Riesgo    |                     |                     | Todo riesgo construcción y todo riesgo montaje | Valor asegurado todo riesgo construccion y/o todo riesgo montaje dentro de los predios asegurados | 11             |
| Otros Articulos          | Animales vivos      |                     |                                                | Valor Asegurable                                                                                  | 4              |
| Otros Articulos          | Animales vivos      |                     |                                                | Índice variable                                                                                   | 1              |
Then se debe mostrar el siguiente mensaje
| MENSAJES_WORKSPACE                                                                                                                                                                                                      |
| El valor de "Valor asegurado todo riesgo construccion y/o todo riesgo montaje dentro de los predios asegurados" deber ser menor o igual al "10,0%" de la sumatoria de los valores asegurables de "todos los articulos". |
Examples:
| numSubscripcion | rolUsuario | descripcion |
| 22222211      | Asesor     |             |


Scenario: 5 Sublimites menores a valor asegurado daños (coberturas a nivel de riesgo)
Given que estoy en edificios y ubicaciones de una poliza <numSubscripcion> con el rol <rolUsuario>
When intente ingresar una nueva ubicacion sin riesgo consultable
And intente ingresar las entradas de las diferentes coberturas
| TAB                      | TIPO_ARTICULO | OTRO_ARTICULO_OTROS | COBERTURA        | ENTRADAS                                                                                                                                               | VALOR_ENTRADAS |
| Información de Artículos | Edificios     |                     |                  | Valor Reconstrucción                                                                                                                                   | 200            |
| Información de Artículos | Edificios     |                     | Danos materiales | Valor asegurado danos materiales                                                                                                                       | 51             |
| Coberturas del Riesgo    |               |                     | Danos materiales | Sublimite para gastos asociados a la ocurrencia de una pérdida                                                                                         | 52             |
| Coberturas del Riesgo    |               |                     | Danos materiales | Sublimite para gastos para la preservacion de bienes y extinción del siniestro                                                                         | 52             |
| Coberturas del Riesgo    |               |                     | Danos materiales | Sublimite para gastos para la remocion de escombros                                                                                                    | 52             |
| Coberturas del Riesgo    |               |                     | Danos materiales | Sublimite para gastos por honorarios profesionales                                                                                                     | 52             |
| Coberturas del Riesgo    |               |                     | Danos materiales | Sublimite para gastos para demostrar la ocurrencia y la cuantia del siniestro                                                                          | 52             |
| Coberturas del Riesgo    |               |                     | Danos materiales | Sublimite para gastos para la reposicion de documentos                                                                                                 | 52             |
| Coberturas del Riesgo    |               |                     | Danos materiales | Sublimite para bienes de propiedad de directores y empleados                                                                                           | 52             |
| Coberturas del Riesgo    |               |                     | Danos materiales | Sublimite para gastos adicionales por concepto de horas extras, trabajo nocturno y en feriados, flete expreso, flete aéreo y gastos de viaje y estadía | 52             |
| Coberturas del Riesgo    |               |                     | Danos materiales | Sublimite para gastos para la obtencion de licencias y permisos para reconstruir el inmueble asegurado                                                 | 52             |
| Coberturas del Riesgo    |               |                     | Danos materiales | Sublímite para perdida de contenido en tanques                                                                                                         | 52             |
| Coberturas del Riesgo    |               |                     | Danos materiales | Sublimite para derrame de materiales en fusion                                                                                                         | 52             |
| Coberturas del Riesgo    |               |                     | Danos materiales | Sublimite para deterioro de bienes refrigerados por rotura de maquinaria                                                                               | 52             |
Then se debe mostrar el siguiente mensaje como lo hace guidewire (espacio de trabajo)
| MENSAJES_WORKSPACE                                                                                                                                                                                                                                                                                                  |
|El valor del "Sublimite para deterioro de bienes refrigerados por rotura de maquinaria " debe ser menor o igual a la sumatoria de los valores asegurados de la cobertura "Danos materiales" de los articulos "-Existencias flotantes - Existencias fijas - ".                                                           |
|El valor del "Sublimite para gastos asociados a la ocurrencia de una pérdida" debe ser menor o igual a la sumatoria de los valores asegurados de la cobertura de "Danos materiales" de todos los artículos de la ubicación.                                                                                             |
|El valor del "Sublimite para gastos para la preservacion de bienes y extinción del siniestro" debe ser menor o igual a la sumatoria de los valores asegurados de la cobertura de "Danos materiales" de todos los artículos de la ubicación.                                                                             |
|El valor del "Sublimite para gastos para la remocion de escombros " debe ser menor o igual a la sumatoria de los valores asegurados de la cobertura de "Danos materiales" de todos los artículos de la ubicación.                                                                                                       |
|El valor del "Sublimite para gastos por honorarios profesionales " debe ser menor o igual a la sumatoria de los valores asegurados de la cobertura de "Danos materiales" de todos los artículos de la ubicación.                                                                                                        |
|El valor del "Sublimite para gastos para demostrar la ocurrencia y la cuantia del siniestro " debe ser menor o igual a la sumatoria de los valores asegurados de la cobertura de "Danos materiales" de todos los artículos de la ubicación.                                                                             |
|El valor del "Sublimite para gastos para la reposicion de documentos" debe ser menor o igual a la sumatoria de los valores asegurados de la cobertura de "Danos materiales" de todos los artículos de la ubicación                                                                                                      |
|El valor del "Sublimite para bienes de propiedad de directores y empleados " debe ser menor o igual a la sumatoria de los valores asegurados de la cobertura de "Danos materiales" de todos los artículos de la ubicación.                                                                                              |
|El valor del "Sublimite para gastos adicionales por concepto de horas extras, trabajo nocturno y en feriados, flete expreso, flete aéreo y gastos de viaje y estadía" debe ser menor o igual a la sumatoria de los valores asegurados de la cobertura de "Danos materiales" de todos los artículos de la ubicación.     |
|El valor del "Sublimite para gastos para la obtencion de licencias y permisos para reconstruir el inmueble asegurado " debe ser menor o igual a la sumatoria de los valores asegurados de la cobertura de "Danos materiales" de todos los artículos de la ubicación.                                                    |
|El valor del "Sublímite para perdida de contenido en tanques" debe ser menor o igual a la sumatoria de los valores asegurados de la cobertura de "Danos materiales" de todos los artículos de la ubicación.                                                                                                             |
|El valor del "Sublimite para derrame de materiales en fusion" debe ser menor o igual a la sumatoria de los valores asegurados de la cobertura de "Danos materiales" de todos los artículos de la ubicación.                                                                                                             |
|El valor del "Sublimite para deterioro de bienes refrigerados por rotura de maquinaria " debe ser menor o igual a la sumatoria de los valores asegurados de la cobertura de "Danos materiales" de todos los artículos de la ubicación.                                                                                  |
Examples:
| numSubscripcion | rolUsuario | descripcion |
| 22222211      | Asesor     |             |


