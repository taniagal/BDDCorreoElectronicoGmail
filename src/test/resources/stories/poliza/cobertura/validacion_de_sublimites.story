Validacion de sublimites

Meta:


Scenario: 1 Validacion de sublimites maximos para las otras coberturas de sustraccion (coberturas de riesgo)
Meta:
@Story CDSEG-847
@URL https://jira.suramericana.com.co/browse/CDSEG-847
@Informador alejandro esteban villada marin
@Automatizador andres alarcon guerrero
@LOB Multiriesgo corporativo
@Sprint 5
As a <rolUsuario>
Given que estoy en edificios y ubicaciones de una poliza <numSubscripcion> con el rol <rolUsuario>"
When intente ingresar las entradas de las diferentes coberturas
| TAB                   | TIPO_ARTICULO | COBERTURA   | ENTRADAS                                                                       | VALOR_ENTRADAS |
| Coberturas del Riesgo |               | Sustraccion | Valor asegurado sustraccion con violencia                                      | 10             |
| Coberturas del Riesgo |               | Sustraccion | Sublimite sustraccion sin violencia dentro de predios                          | 11             |
| Coberturas del Riesgo |               | Sustraccion | Sublimite sustraccion con violencia de bienes fuera de predios                 | 11             |
| Coberturas del Riesgo |               | Sustraccion | Sublimite sustraccion sin violencia de bienes fuera de predios                 | 11             |
| Coberturas del Riesgo |               | Sustraccion | Sublimite sustracion con violencia de dinero en efectivo dentro de caja fuerte | 11             |
| Coberturas del Riesgo |               | Sustraccion | Sublimite sustracion con violencia de dinero en efectivo fuera de caja fuerte  | 11             |
When haga clic en el boton Aceptar
Then se debe validar que ningun sublimite de las coberturas anteriores sobrepase el valor asegurado de la cobertura de sustraccion con violencia (sustraccion principal)
| MENSAJES_WORKSPACE                                                                                                                                           |
| El "Sublimite sustraccion sin violencia dentro de predios" deber ser menor o igual al "Valor asegurado sustraccion con violencia ".                          |
| El "Sublimite sustraccion con violencia de bienes fuera de predios" deber ser menor o igual al "Valor asegurado sustraccion con violencia ".                 |
| El "Sublimite sustraccion sin violencia de bienes fuera de predios" deber ser menor o igual al "Valor asegurado sustraccion con violencia ".                 |
| El "Sublimite sustracion con violencia de dinero en efectivo fuera de caja fuerte" deber ser menor o igual al "Valor asegurado sustraccion con violencia ".  |
| El "Sublimite sustracion con violencia de dinero en efectivo dentro de caja fuerte" deber ser menor o igual al "Valor asegurado sustraccion con violencia ". |
Then no debe dejar continuar y debe permanecer en la pagina Agregar Articulo
Examples:
| numSubscripcion | rolUsuario | descripcion |
| 22221237        | Asesor     |             |


Scenario: 2 Sublimite sustraccion con violencia de bienes fuera de predios (Coberturas del riesgo) - Tener asegurado Equipos moviles y portatiles
Meta:
@Story CDSEG-847
@URL https://jira.suramericana.com.co/browse/CDSEG-847
@Informador alejandro esteban villada marin
@Automatizador andres alarcon guerrero
@LOB Multiriesgo corporativo
@manual true
@Sprint 5
Given Estoy ingresando la informacion de coberturas a nivel de riesgo
When Ingrese un valor en el sublimite de sustraccion con violencia de bienes fuera de predios Y haga clic en el boton aceptar
Then Se debe validar que el valor ingresado en este sublimite sea menor o igual a la suma de los valores asegurables del equipo electronico movil y portatil (se suman los de la categoria otros y los normales). Si no cumple lo anterior se debe mostrar el siguiente mensaje: "El -Nombre del sublimite de sustraccion con violencia de bienes fuera de predios- debe ser menor o igual a la sumatoria de los valores asegurables del equipo electronico movil y portatil." y no debe dejar continuar
Examples:
| numSubscripcion | rolUsuario | descripcion |
| 22221237        | Asesor     |             |


Scenario: 3 Sublimite de sustraccion con violencia de bienes fuera de predios (cobertura de riesgos) - Sublimite menor a valor asegurable Equipos moviles y portatiles
Meta:
@Story CDSEG-847
@URL https://jira.suramericana.com.co/browse/CDSEG-847
@Informador alejandro esteban villada marin
@Automatizador andres alarcon guerrero
@LOB Multiriesgo corporativo
@Sprint 5
As a <rolUsuario>
Given que estoy en edificios y ubicaciones de una poliza <numSubscripcion> con el rol <rolUsuario>"
When intente ingresar las entradas de las diferentes coberturas
| TAB                   | TIPO_ARTICULO | COBERTURA   | ENTRADAS                                                       | VALOR_ENTRADAS |
| Coberturas del Riesgo |               | Sustraccion | Sublimite sustraccion con violencia de bienes fuera de predios | 11             |
When haga clic en el boton Aceptar
Then se debe validar que el valor ingresado en este sublimite sea menor o igual a la suma de los valores asegurables del equipo electronico movil y portatil (se suman los de la categoria otros y los normales).
| MENSAJES_WORKSPACE                                                                                                                                                                         |
| El valor de "Sublimite sustraccion con violencia de bienes fuera de predios" deber ser menor o igual a la sumatoria de los valores asegurables de "Equipo electrónico móvil y/o portátil". |
Then no debe dejar continuar y debe permanecer en la pagina Agregar Articulo
Examples:
| numSubscripcion | rolUsuario | descripcion |
| 22221237        | Asesor     |             |


Scenario: 4 Sublimite sustraccion sin violencia de bienes fuera de predios (Coberturas del riesgo) - Tener asegurados Equipos moviles y portatiles
Meta:
@Story CDSEG-847
@URL https://jira.suramericana.com.co/browse/CDSEG-847
@Informador alejandro esteban villada marin
@Automatizador andres alarcon guerrero
@LOB Multiriesgo corporativo
@manual
@Sprint 5
Given Estoy ingresando la informacion de coberturas a nivel de riesgo
When Ingrese un valor en el sublimite de sustraccion sin violencia de bienes fuera de predios Y haga clic en el boton aceptar
Then Se debe validar que el articulo "Equipo electronico movil y portatil" debe estar asegurado (en la categoria otros o en la normal). Si no se cumple lo anterior entonces se debe mostrar el siguiente mensaje: "Para poder seleccionar el - Nombre del sublimite de sustraccion sin violencia de bienes fuera de predios- debe tener asegurado el equipo electronico movil y portatil." y no debe dejar continuar.
Examples:
| numSubscripcion | rolUsuario | descripcion |
| 22221237        | Asesor     |             |


Scenario: 5 Sublimite de sustraccion sin violencia de bienes fuera de predios (Coberturas del riesgo) - Valor asegurado menor a valor asegurable de Equipos moviles y portatiles
Meta:
@Story CDSEG-847
@URL https://jira.suramericana.com.co/browse/CDSEG-847
@Informador alejandro esteban villada marin
@Automatizador andres alarcon guerrero
@LOB Multiriesgo corporativo
@Sprint 5
As a <rolUsuario>
Given que estoy en edificios y ubicaciones de una poliza <numSubscripcion> con el rol <rolUsuario>"
When intente ingresar las entradas de las diferentes coberturas
| TAB                   | TIPO_ARTICULO | COBERTURA   | ENTRADAS                                                       | VALOR_ENTRADAS |
| Coberturas del Riesgo |               | Sustraccion | Sublimite sustraccion sin violencia de bienes fuera de predios | 12             |
When haga clic en el boton Aceptar
Then se debe validar que el valor ingresado en este sublimite sea menor o igual a la suma de los valores asegurables del equipo electronico movil y portatil (se suman los de la categoria otros y los normales).
| MENSAJES_WORKSPACE                                                                                                                                                                         |
| El valor de "Sublimite sustraccion sin violencia de bienes fuera de predios" deber ser menor o igual a la sumatoria de los valores asegurables de "Equipo electrónico móvil y/o portátil". |
Then no debe dejar continuar y debe permanecer en la pagina Agregar Articulo
Examples:
| numSubscripcion | rolUsuario | descripcion |
| 22221237        | Asesor     |             |


Scenario: 6 Sublimite sustraccion con violencia de dinero dentro de caja fuerte (Coberturas del riesgo) - Tener asegurado el dinero en efectivo
Meta:
@Story CDSEG-847
@URL https://jira.suramericana.com.co/browse/CDSEG-847
@Informador alejandro esteban villada marin
@Automatizador andres alarcon guerrero
@LOB Multiriesgo corporativo
@manual
@Sprint 5
Given Estoy ingresando la informacion de coberturas a nivel de riesgo
When Ingrese un valor en el sublimite de sustraccion con violencia de dinero dentro de caja fuerte Y haga clic en el boton aceptar
Then Se debe validar que el articulo "Dinero en efectivo" debe estar asegurado (en la categoria otros o normal). Si no se cumple lo anterior entonces se debe mostrar el siguiente mensaje: "Para poder seleccionar el -Nombre del sublimite de sustraccion con violencia de dinero dentro de caja fuerte- debe tener asegurado eldinero en efectivo." y no debe dejar continuar.
Examples:
| numSubscripcion | rolUsuario | descripcion |
| 22221237        | Asesor     |             |


Scenario: 7 Sublimite de sustraccion con violencia de dinero dentro de caja fuerte (Coberturas del riesgo) - Valor asegurado menor o igual a valor asegurable de dinero en efectivo
Meta:
@Story CDSEG-847
@URL https://jira.suramericana.com.co/browse/CDSEG-847
@Informador alejandro esteban villada marin
@Automatizador andres alarcon guerrero
@LOB Multiriesgo corporativo
@Sprint 5
As a <rolUsuario>
Given que estoy en edificios y ubicaciones de una poliza <numSubscripcion> con el rol <rolUsuario>"
When intente ingresar las entradas de las diferentes coberturas
| TAB                   | TIPO_ARTICULO | COBERTURA   | ENTRADAS                                                                       | VALOR_ENTRADAS |
| Coberturas del Riesgo |               | Sustraccion | Sublimite sustracion con violencia de dinero en efectivo dentro de caja fuerte | 11             |
When haga clic en el boton Aceptar
Then se debe validar que el valor ingresado en este sublimite sea menor o igual a la suma de los valores asegurables del equipo electronico movil y portatil (se suman los de la categoria otros y los normales).
| MENSAJES_WORKSPACE                                                                                                                                                                      |
| El valor de "Sublimite sustracion con violencia de dinero en efectivo dentro de caja fuerte" deber ser menor o igual a la sumatoria de los valores asegurables de "Dinero en efectivo". |
Then no debe dejar continuar y debe permanecer en la pagina Agregar Articulo
Examples:
| numSubscripcion | rolUsuario | descripcion |
| 22221237        | Asesor     |             |

Scenario: 8 Sustraccion con violencia de dinero fuera de caja fuerte (Coberturas del riesgo) - Dependencia de otro sublimite
Meta:
@Story CDSEG-847
@URL https://jira.suramericana.com.co/browse/CDSEG-847
@Informador alejandro esteban villada marin
@Automatizador andres alarcon guerrero
@LOB Multiriesgo corporativo
@manual
@Sprint 5
Given Estoy ingresando la informacion de coberturas a nivel de riesgo
When Ingrese un valor en el sublimite de sustraccion con violencia de dinero fuera de caja fuerte Y haga clic en el boton aceptar
Then Se debe validar que exista el sublimite de sustraccion con violencia de dinero dentro de caja fuerte. Si no cumple lo anterior debe mostrar un mensaje en una ventana emergente que diga: "Para ingresar el -Nombre del sublimite de sustraccion con violencia de dinero fuera de caja fuerte- debe tener ingresado el -Nombre del sublimite de sustraccion con violencia de dinero dentro de caja fuerte-" y no debe dejar continuar.
Examples:
| numSubscripcion | rolUsuario | descripcion |
| 22221237        | Asesor     |             |


Scenario: 9 Sublimite de sustraccion con violencia de dinero fuera de caja fuerte (Coberturas del riesgo) - valor asegurado de este sublimite menor o igual al valor asegurado de otro sublimite
Meta:
@Story CDSEG-847
@URL https://jira.suramericana.com.co/browse/CDSEG-847
@Informador alejandro esteban villada marin
@Automatizador andres alarcon guerrero
@LOB Multiriesgo corporativo
@Sprint 5
As a <rolUsuario>
Given que estoy en edificios y ubicaciones de una poliza <numSubscripcion> con el rol <rolUsuario>"
When intente ingresar las entradas de las diferentes coberturas
| TAB                   | TIPO_ARTICULO | COBERTURA   | ENTRADAS                                                                       | VALOR_ENTRADAS |
| Coberturas del Riesgo |               | Sustraccion | Sublimite sustracion con violencia de dinero en efectivo dentro de caja fuerte | 2              |
| Coberturas del Riesgo |               | Sustraccion | Sublimite sustracion con violencia de dinero en efectivo fuera de caja fuerte  | 11             |
When haga clic en el boton Aceptar
Then se debe mostrar el siguiente mensaje como lo hace guidewire (espacio de trabajo)
| MENSAJES_WORKSPACE                                                                                                                                                                              |
| El "Sublimite sustracion con violencia de dinero en efectivo fuera de caja fuerte" deber ser menor o igual al "Sublimite sustracion con violencia de dinero en efectivo dentro de caja fuerte". |
Then no debe dejar continuar y debe permanecer en la pagina Agregar Articulo
Examples:
| numSubscripcion | rolUsuario | descripcion |
| 22221237        | Asesor     |             |


Scenario: 10 Sublimite deterioro de bienes refigerados por rotura maquinaria (coberturas del riesgo)
Meta:
@Story CDSEG-943
@URL https://jira.suramericana.com.co/browse/CDSEG-943
@Informador alejandro esteban villada marin
@Automatizador andres alarcon guerrero
@LOB Multiriesgo corporativo
@Sprint 5
As a <rolUsuario>
Given que estoy en edificios y ubicaciones de una poliza <numSubscripcion> con el rol <rolUsuario>"
When intente ingresar las entradas de las diferentes coberturas
| TAB                   | TIPO_ARTICULO | COBERTURA        | ENTRADAS                                                                 | VALOR_ENTRADAS |
| Coberturas del Riesgo |               | Danos materiales | Sublimite para deterioro de bienes refrigerados por rotura de maquinaria | 11             |
When haga clic en el boton Aceptar
Then se debe mostrar el siguiente mensaje como lo hace guidewire (espacio de trabajo)
| MENSAJES_WORKSPACE                                                                                                                                                                                     |
| Para seleccionar el "Sublimite para deterioro de bienes refrigerados por rotura de maquinaria " debe tener seleccionada la cobertura de "Rotura de maquinaria" para el artículo "Maquinaria y equipo". |
Then no debe dejar continuar y debe permanecer en la pagina Agregar Articulo
Examples:
| numSubscripcion | rolUsuario | descripcion |
| 22221237        | Asesor     |             |


Scenario: 11 Valor asegurado de la cobertura Deterioro de bienes refigerados por rotura maquinaria (Coberturas del riesgo)
Meta:
@Story CDSEG-943
@URL https://jira.suramericana.com.co/browse/CDSEG-943
@Informador alejandro esteban villada marin
@Automatizador andres alarcon guerrero
@LOB Multiriesgo corporativo
@Sprint 5
As a <rolUsuario>
Given que estoy en edificios y ubicaciones de una poliza <numSubscripcion> con el rol <rolUsuario>"
When intente ingresar las entradas de las diferentes coberturas
| TAB                      | TIPO_ARTICULO         | COBERTURA        | ENTRADAS                                                                 | VALOR_ENTRADAS |
| Coberturas del Riesgo    |                       | Danos materiales | Sublimite para deterioro de bienes refrigerados por rotura de maquinaria | 11             |
| Información de Artículos | Existencias Flotantes | Danos materiales | Valor asegurado danos materiales                                         | 2              |
| Información de Artículos | Existencias fijas     | Danos materiales | Valor asegurado danos materiales                                         | 2              |
| Información de Artículos | Existencias Flotantes |                  | Valor asegurado máximo                                                   | 11             |
| Información de Artículos | Existencias fijas     |                  | Valor Asegurable                                                         | 11             |
When haga clic en el boton Aceptar
Then se debe mostrar el siguiente mensaje como lo hace guidewire (espacio de trabajo)
| MENSAJES_WORKSPACE                                                                                                                                                                                                                                            |
| El valor del "Sublimite para deterioro de bienes refrigerados por rotura de maquinaria " debe ser menor o igual a la sumatoria de los valores asegurados de la cobertura "Danos materiales" de los articulos "-Existencias flotantes - Existencias fijas - ". |
Then no debe dejar continuar y debe permanecer en la pagina Agregar Articulo
Examples:
| numSubscripcion | rolUsuario | descripcion |
| 22221237        | Asesor     |             |


Scenario: 12 Valor asegurado de la cobertura Deterioro de bienes refigerados por rotura maquinaria (Coberturas del riesgo) - 40 porciento
Meta:
@Story CDSEG-943
@URL https://jira.suramericana.com.co/browse/CDSEG-943
@Informador alejandro esteban villada marin
@Automatizador andres alarcon guerrero
@LOB Multiriesgo corporativo
@Sprint 5
As a <rolUsuario>
Given que estoy en edificios y ubicaciones de una poliza <numSubscripcion> con el rol <rolUsuario>"
When intente ingresar las entradas de las diferentes coberturas
| TAB                      | TIPO_ARTICULO       | COBERTURA | ENTRADAS                                                                 | VALOR_ENTRADAS |
| Coberturas del Riesgo    | Danos materiales    |           | Sublimite para deterioro de bienes refrigerados por rotura de maquinaria | 9              |
| Información de Artículos | Edificios           |           | Valor Reconstrucción                                                     | 2              |
| Información de Artículos | Maquinaria y equipo |           | Valor Asegurable                                                         | 2              |
| Otros Articulos          | Animales vivos      |           | Valor Asegurable                                                         | 4              |
| Otros Articulos          | Animales vivos      |           | Índice variable                                                          | 1              |
When haga clic en el boton Aceptar
Then se debe mostrar el siguiente mensaje como lo hace guidewire (espacio de trabajo)
| MENSAJES_WORKSPACE                                                                                                                                                                              |
| El valor de "Sublimite para deterioro de bienes refrigerados por rotura de maquinaria " deber ser menor o igual al "40.0%" de la sumatoria de los valores asegurables de "todos los articulos". |
Then no debe dejar continuar y debe permanecer en la pagina Agregar Articulo
Examples:
| numSubscripcion | rolUsuario | descripcion |
| 22221237        | Asesor     |             |


Scenario: 13 Parametro del 40%
Meta:
@Story CDSEG-943
@URL https://jira.suramericana.com.co/browse/CDSEG-943
@Informador alejandro esteban villada marin
@Automatizador andres alarcon guerrero
@LOB Multiriesgo corporativo
@manual
@Sprint 5
Given he ingresado al Product Designer
When seleccione en System Tables
And seleccione cp_term_articles_rules_ext.xml
And ingrese el porcentaje para el MRCBRefrigRotMaqLimSubUbic en la columna PercentInsuredValue
And guarde los cambios y suba dichos cambios al servidor
Then debe poner cambiar el porcentaje del parametro


Scenario: 14 Cobertura de terremoto para suelos y terrenos (categoría otros)
Meta:
@Story CDSEG-844
@URL https://jira.suramericana.com.co/browse/CDSEG-844
@Informador alejandro esteban villada marin
@Automatizador andres alarcon guerrero
@LOB Multiriesgo corporativo
@Sprint 5
As a <rolUsuario>
Given que estoy en edificios y ubicaciones de una poliza <numSubscripcion> con el rol <rolUsuario>"
When intente ingresar las entradas de las diferentes coberturas
| TAB                      | TIPO_ARTICULO     | COBERTURA | ENTRADAS                                                                             | VALOR_ENTRADAS |
| Información de Artículos | Edificios         |           | Valor Reconstrucción                                                                 | 50            |
| Otros Articulos          | Suelos y Terrenos | Terremoto | Valor asegurado terremoto, temblor de tierra, erupcion volcanica, tsunami y maremoto | 25            |
| Otros Articulos          | Suelos y Terrenos |           | Valor Asegurable                                                                     | 25             |
| Otros Articulos          | Suelos y Terrenos |           | Índice variable                                                                      | 1              |
When haga clic en el boton Aceptar
Then se debe mostrar el siguiente mensaje como lo hace guidewire (espacio de trabajo)
| MENSAJES_WORKSPACE                                                                                                                                             |
| El valor de "Terremoto - Artículo: Suelos y Terrenos:" deber ser menor o igual al "20.0%" de la sumatoria de los valores asegurables de "todos los articulos". |
Examples:
| numSubscripcion | rolUsuario | descripcion |
| 22221237        | Asesor     |             |


Scenario: 15 Cobertura de terremoto para suelos y terrenos máximo 1000 millones
Meta:
@Story CDSEG-844
@URL https://jira.suramericana.com.co/browse/CDSEG-844
@Informador alejandro esteban villada marin
@Automatizador andres alarcon guerrero
@LOB Multiriesgo corporativo
@Sprint 5
As a <rolUsuario>
Given que estoy en edificios y ubicaciones de una poliza <numSubscripcion> con el rol <rolUsuario>"
When intente ingresar las entradas de las diferentes coberturas
| TAB                      | TIPO_ARTICULO     | COBERTURA | ENTRADAS                                                                             | VALOR_ENTRADAS |
| Información de Artículos | Edificios         |           | Valor Reconstrucción                                                                 | 1000000000     |
| Otros Articulos          | Suelos y Terrenos | Terremoto | Valor asegurado terremoto, temblor de tierra, erupcion volcanica, tsunami y maremoto | 1000000000     |
| Otros Articulos          | Suelos y Terrenos |           | Valor Asegurable                                                                     | 25             |
| Otros Articulos          | Suelos y Terrenos |           | Índice variable                                                                      | 1              |
When haga clic en el boton Aceptar
Then se debe mostrar el siguiente mensaje como lo hace guidewire (espacio de trabajo)
| MENSAJES_WORKSPACE                                                                                                              |
| El valor asegurado de la cobertura "Terremoto - Artículo: Suelos y Terrenos:" debe ser menor o igual a "1000000000.00" de pesos |
Examples:
| numSubscripcion | rolUsuario | descripcion |
| 22221237        | Asesor     |             |


Scenario: 16 Cobertura de terremoto para suelos y terrenos  Edificio obligatorio
Meta:
@Story CDSEG-844
@URL https://jira.suramericana.com.co/browse/CDSEG-844
@Informador alejandro esteban villada marin
@Automatizador andres alarcon guerrero
@LOB Multiriesgo corporativo
@Sprint 5
As a <rolUsuario>
Given que estoy en edificios y ubicaciones de una poliza <numSubscripcion> con el rol <rolUsuario>"
When intente ingresar las entradas de las diferentes coberturas
| TAB             | TIPO_ARTICULO     | COBERTURA | ENTRADAS                                                                             | VALOR_ENTRADAS |
| Otros Articulos | Suelos y Terrenos | Terremoto | Valor asegurado terremoto, temblor de tierra, erupcion volcanica, tsunami y maremoto | 1000000000     |
| Otros Articulos | Suelos y Terrenos |           | Valor Asegurable                                                                     | 25             |
| Otros Articulos | Suelos y Terrenos |           | Índice variable                                                                      | 1              |
When haga clic en el boton Aceptar
Then se debe mostrar el siguiente mensaje como lo hace guidewire (espacio de trabajo)
| MENSAJES_WORKSPACE                                                                                                                                             |
| Para seleccionar la cobertura de "Terremoto" del articulo "Suelos y Terrenos" debe tener seleccionada la cobertura de "Terremoto" para el artículo "Edificio". |
Examples:
| numSubscripcion | rolUsuario | descripcion |
| 22221237        | Asesor     |             |


Scenario: 17 Parametro de 1000 millones y 20%
Meta:
@Story CDSEG-844
@URL https://jira.suramericana.com.co/browse/CDSEG-844
@Informador alejandro esteban villada marin
@Automatizador andres alarcon guerrero
@LOB Multiriesgo corporativo
@manual
@Sprint 5
Given Estoy ingresando la información de coberturas a nivel de riesgo
When Quiera cambiar el valor de 1,000 millones a otro valor o quiera cambiar el valor del 20% a otro valor
Then Se cambie simplemente en una tabla de parámetros. Estos valores no deben estar quemados en el código.
Examples:
| numSubscripcion | rolUsuario | descripcion |
| 22221237        | Asesor     |             |


Scenario: 18 Sublímite de pérdidas de contenidos en tanques (Coberturas del riesgo)
Meta:
@Story CDSEG-767
@URL https://jira.suramericana.com.co/browse/CDSEG-767
@Informador alejandro esteban villada marin
@Automatizador andres alarcon guerrero
@LOB Multiriesgo corporativo
@Sprint 5
As a <rolUsuario>
Given que estoy en edificios y ubicaciones de una poliza <numSubscripcion> con el rol <rolUsuario>"
When intente ingresar las entradas de las diferentes coberturas
| TAB                      | TIPO_ARTICULO         | COBERTURA        | ENTRADAS                                       | VALOR_ENTRADAS |
| Información de Artículos | Existencias Flotantes |                  | Valor asegurado máximo                         | 10             |
| Información de Artículos | Existencias fijas     |                  | Valor Asegurable                               | 10             |
| Coberturas del Riesgo    |                       | Danos materiales | Sublimite para perdida de contenido en tanques | 31             |
| Otros Articulos          | Mercancías a granel   |                  | Valor Asegurable                               | 10             |
| Otros Articulos          | Mercancías a granel   |                  | Valor Asegurable                               | 25             |
| Otros Articulos          | Mercancías a granel   |                  | Índice variable                                | 1              |

When haga clic en el boton Aceptar
Then se debe mostrar el siguiente mensaje como lo hace guidewire (espacio de trabajo)
| MENSAJES_WORKSPACE                                                                                                                                                                                     |
||
Examples:
| numSubscripcion | rolUsuario | descripcion |
| 22221237        | Asesor     |             |


Scenario: 19 Portadores externos de datos (Coberturas del riesgo)
Meta:
@Story CDSEG-767
@URL https://jira.suramericana.com.co/browse/CDSEG-767
@Informador alejandro esteban villada marin
@Automatizador andres alarcon guerrero
@LOB Multiriesgo corporativo
@Sprint 5
As a <rolUsuario>
Given que estoy en edificios y ubicaciones de una poliza <numSubscripcion> con el rol <rolUsuario>"
When intente ingresar las entradas de las diferentes coberturas
| TAB                   | TIPO_ARTICULO | COBERTURA                    | ENTRADAS                                     | VALOR_ENTRADAS |
| Coberturas del Riesgo |               | Portadores externos de datos | Valor asegurado portadores externos de datos | 11             |
When haga clic en el boton Aceptar
Then se debe mostrar el siguiente mensaje como lo hace guidewire (espacio de trabajo)
| MENSAJES_WORKSPACE                                                                                                      |
| Para poder seleccionar el "Valor asegurado portadores externos de datos " debe tener asegurado "Equipo electrónico fijo |
Examples:
| numSubscripcion | rolUsuario | descripcion |
| 22221237        | Asesor     |             |


Scenario: 20 Gastos por arrendamiento de sistema electrónico de procesamiento de datos (Coberturas del riesgo)
Meta:
@Story CDSEG-767
@URL https://jira.suramericana.com.co/browse/CDSEG-767
@Informador alejandro esteban villada marin
@Automatizador andres alarcon guerrero
@LOB Multiriesgo corporativo
@Sprint 5
As a <rolUsuario>
Given que estoy en edificios y ubicaciones de una poliza <numSubscripcion> con el rol <rolUsuario>"
When intente ingresar las entradas de las diferentes coberturas
| TAB                   | TIPO_ARTICULO | COBERTURA                                                                 | ENTRADAS                                                                                  | VALOR_ENTRADAS |
| Coberturas del Riesgo |               | Gastos por arrendamiento de sistema electrónico de procesamiento de datos | Valor asegurado gastos por arrendamiento de sistema electronico de procesamiento de datos | 11             |
When haga clic en el boton Aceptar
Then se debe mostrar el siguiente mensaje como lo hace guidewire (espacio de trabajo)
| MENSAJES_WORKSPACE                                                                                                                                                  |
| Para poder seleccionar el "Valor asegurado gastos por arrendamiento de sistema electronico de procesamiento de datos" debe tener asegurado "Equipo electrónico fijo |
Examples:
| numSubscripcion | rolUsuario | descripcion |
| 22221237        | Asesor     |             |


Scenario: 21 Sublimite todo riesgo construccion y|o todo riesgo montaje dentro de los predios asegurados (Coberturas del riesgo) - Porcentaje
Meta:
@Story CDSEG-767
@URL https://jira.suramericana.com.co/browse/CDSEG-767
@Informador alejandro esteban villada marin
@Automatizador andres alarcon guerrero
@LOB Multiriesgo corporativo
@Sprint 5
As a <rolUsuario>
Given que estoy en edificios y ubicaciones de una poliza <numSubscripcion> con el rol <rolUsuario>"
When intente ingresar las entradas de las diferentes coberturas
| TAB                      | TIPO_ARTICULO       | COBERTURA                                      | ENTRADAS                                                                                          | VALOR_ENTRADAS |
| Información de Artículos | Edificios           |                                                | Valor Reconstrucción                                                                              | 50             |
| Información de Artículos | Maquinaria y equipo |                                                | Valor Asegurable                                                                                  | 46             |
| Coberturas del Riesgo    |                     | Todo riesgo construcción y todo riesgo montaje | Valor asegurado todo riesgo construccion y/o todo riesgo montaje dentro de los predios asegurados | 11             |
| Otros Articulos          | Animales vivos      |                                                | Valor Asegurable                                                                                  | 4              |
| Otros Articulos          | Animales vivos      |                                                | Índice variable                                                                                   | 1              |
When haga clic en el boton Aceptar
Then se debe mostrar el siguiente mensaje como lo hace guidewire (espacio de trabajo)
| MENSAJES_WORKSPACE |
|                    |
Examples:
| numSubscripcion | rolUsuario | descripcion |
| 22221237        | Asesor     |             |


Scenario: 22 Sublímites menores a valor asegurado daños (coberturas a nivel de riesgo)
Meta:
@Story CDSEG-767
@URL https://jira.suramericana.com.co/browse/CDSEG-767
@Informador alejandro esteban villada marin
@Automatizador andres alarcon guerrero
@LOB Multiriesgo corporativo
@Sprint 5
As a <rolUsuario>
Given que estoy en edificios y ubicaciones de una poliza <numSubscripcion> con el rol <rolUsuario>"
When intente ingresar las entradas de las diferentes coberturas
| TAB                      | TIPO_ARTICULO | COBERTURA        | ENTRADAS                                                                                                                                               | VALOR_ENTRADAS |
| Información de Artículos | Edificios     |                  | Valor Reconstrucción                                                                                                                                   | 200            |
| Información de Artículos | Edificios     | Danos materiales | Valor asegurado danos materiales                                                                                                                       | 51             |
| Coberturas del Riesgo    |               | Danos materiales | Sublimite para deterioro de bienes refrigerados por rotura de maquinaria                                                                               | 52             |
| Coberturas del Riesgo    |               | Sustraccion      | Sublimite para derrame de materiales en fusion                                                                                                         | 52             |
| Coberturas del Riesgo    |               | Sustraccion      | Sublimite para perdida de contenido en tanques                                                                                                         | 52             |
| Coberturas del Riesgo    |               | Sustraccion      | Sublimite para gastos para la obtencion de licencias y permisos para reconstruir el inmueble asegurado                                                 | 52             |
| Coberturas del Riesgo    |               | Sustraccion      | Sublimite para gastos adicionales por concepto de horas extras, trabajo nocturno y en feriados, flete expreso, flete aereo y gastos de viaje y estadia | 52             |
| Coberturas del Riesgo    |               | Sustraccion      | Sublimite para bienes de propiedad de directores y empleados                                                                                           | 52             |
| Coberturas del Riesgo    |               | Sustraccion      | Sublimite para gastos para la reposicion de documentos                                                                                                 | 52             |
| Coberturas del Riesgo    |               | Sustraccion      | Sublimite para gastos para demostrar la ocurrencia y la cuantia del siniestro                                                                          | 52             |
| Coberturas del Riesgo    |               | Sustraccion      | Sublimite para gastos por honorarios profesionales                                                                                                     | 52             |
| Coberturas del Riesgo    |               | Sustraccion      | Sublimite para gastos para la remocion de escombros                                                                                                    | 52             |
| Coberturas del Riesgo    |               | Sustraccion      | Sublimite para gastos para la preservacion de bienes y extincion del siniestro                                                                         | 52             |
| Coberturas del Riesgo    |               | Sustraccion      | Sublimite para gastos asociados a la ocurrencia de una perdida                                                                                         | 52             |
When haga clic en el boton Aceptar
Then se debe mostrar el siguiente mensaje como lo hace guidewire (espacio de trabajo)
| MENSAJES_WORKSPACE                                                                                                                                                                                                                                                                                                  |
| El valor del "Sublimite para deterioro de bienes refrigerados por rotura de maquinaria" debe ser menor o igual a la sumatoria de los valores asegurados de la cobertura de "Danos materiales" de todos los artículos de la ubicación.                                                                               |
| El valor del "Sublimite para derrame de materiales en fusion" debe ser menor o igual a la sumatoria de los valores asegurados de la cobertura de "Danos materiales" de todos los artículos de la ubicación.                                                                                                         |
| El valor del "Sublimite para perdida de contenido en tanques" debe ser menor o igual a la sumatoria de los valores asegurados de la cobertura de "Danos materiales" de todos los artículos de la ubicación.                                                                                                         |
| El valor del "Sublimite para gastos para la obtencion de licencias y permisos para reconstruir el inmueble asegurado" debe ser menor o igual a la sumatoria de los valores asegurados de la cobertura de "Danos materiales" de todos los artículos de la ubicación.                                                 |
| El valor del "Sublimite para gastos adicionales por concepto de horas extras, trabajo nocturno y en feriados, flete expreso, flete aereo y gastos de viaje y estadia" debe ser menor o igual a la sumatoria de los valores asegurados de la cobertura de "Danos materiales" de todos los artículos de la ubicación. |
| El valor del "Sublimite para bienes de propiedad de directores y empleados" debe ser menor o igual a la sumatoria de los valores asegurados de la cobertura de "Danos materiales" de todos los artículos de la ubicación.                                                                                           |
| El valor del "Sublimite para gastos para la reposicion de documentos" debe ser menor o igual a la sumatoria de los valores asegurados de la cobertura de "Danos materiales" de todos los artículos de la ubicación.                                                                                                 |
| El valor del "Sublimite para gastos para demostrar la ocurrencia y la cuantia del siniestro" debe ser menor o igual a la sumatoria de los valores asegurados de la cobertura de "Danos materiales" de todos los artículos de la ubicación.                                                                          |
| El valor del "Sublimite para gastos por honorarios profesionales" debe ser menor o igual a la sumatoria de los valores asegurados de la cobertura de "Danos materiales" de todos los artículos de la ubicación.                                                                                                     |
| El valor del "Sublimite para gastos para la remocion de escombros" debe ser menor o igual a la sumatoria de los valores asegurados de la cobertura de "Danos materiales" de todos los artículos de la ubicación.                                                                                                    |
| El valor del "Sublimite para gastos para la preservacion de bienes y extincion del siniestro" debe ser menor o igual a la sumatoria de los valores asegurados de la cobertura de "Danos materiales" de todos los artículos de la ubicación.                                                                         |
| El valor del "Sublimite para gastos asociados a la ocurrencia de una perdida" debe ser menor o igual a la sumatoria de los valores asegurados de la cobertura de "Danos materiales" de todos los artículos de la ubicación.                                                                                         |
Examples:
| numSubscripcion | rolUsuario | descripcion |
| 22221237        | Asesor     |             |