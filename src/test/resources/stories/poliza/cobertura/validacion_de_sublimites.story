Validacion de sublimites

Meta:


Scenario: Validacion de sublimites maximos para las otras coberturas de sustraccion (coberturas de riesgo)
Meta:
@Story CDSEG-847
@URL https://jira.suramericana.com.co/browse/CDSEG-847
@Informador alejandro esteban villada marin
@Automatizador andres alarcon guerrero
@LOB Multiriesgo corporativo
@Sprint 5

As a <rolUsuario>
Given que estoy en edificios y ubicaciones de una poliza <numSubscripcion>
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
| MENSAJES_WORKSPACE                                                                                                                                                    |
| El valor del "Sublimite sustraccion sin violencia dentro de predios" deber ser menor o igual al valor de "Valor asegurado sustraccion con violencia ".                          |
| El valor del "Sublimite sustraccion con violencia de bienes fuera de predios" deber ser menor o igual al valor de "Valor asegurado sustraccion con violencia ".                 |
| El valor del "Sublimite sustraccion sin violencia de bienes fuera de predios" deber ser menor o igual al valor de "Valor asegurado sustraccion con violencia ".                 |
| El valor del "Sublimite sustracion con violencia de dinero en efectivo fuera de caja fuerte" deber ser menor o igual al valor de "Valor asegurado sustraccion con violencia ".  |
| El valor del "Sublimite sustracion con violencia de dinero en efectivo dentro de caja fuerte" deber ser menor o igual al valor de "Valor asegurado sustraccion con violencia ". |
Then no debe dejar continuar y debe permanecer en la pagina Agregar Articulo

Examples:
| numSubscripcion | rolUsuario | descripcion |
| 22221237        | Asesor     |             |

Scenario: Sublimite sustraccion con violencia de bienes fuera de predios (Coberturas del riesgo) - Tener asegurado Equipos moviles y portatiles
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



Scenario: Sublimite de sustraccion con violencia de bienes fuera de predios (cobertura de riesgos) - Sublimite menor a valor asegurable Equipos moviles y portatiles
Meta:
@Story CDSEG-847
@URL https://jira.suramericana.com.co/browse/CDSEG-847
@Informador alejandro esteban villada marin
@Automatizador andres alarcon guerrero
@LOB Multiriesgo corporativo
@Sprint 5

As a <rolUsuario>
Given que estoy en edificios y ubicaciones de una poliza <numSubscripcion>
When intente ingresar las entradas de las diferentes coberturas
| TAB                   | TIPO_ARTICULO | COBERTURA   | ENTRADAS                                                                       | VALOR_ENTRADAS |
| Coberturas del Riesgo |               | Sustraccion | Sublimite sustraccion con violencia de bienes fuera de predios                 | 11             |
When haga clic en el boton Aceptar
Then se debe validar que el valor ingresado en este sublimite sea menor o igual a la suma de los valores asegurables del equipo electronico movil y portatil (se suman los de la categoria otros y los normales).
| MENSAJES_WORKSPACE                                                                                                                                                                |
| El valor del "Sublimite sustraccion con violencia de bienes fuera de predios" deber ser menor o igual a la sumatoria de los valores asegurables de "Equipo electrónico móvil y/o portátil". |
Then no debe dejar continuar y debe permanecer en la pagina Agregar Articulo

Examples:
| numSubscripcion | rolUsuario | descripcion |
| 22221237        | Asesor     |             |


Scenario: Sublimite sustraccion sin violencia de bienes fuera de predios (Coberturas del riesgo) - Tener asegurados Equipos moviles y portatiles
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


Scenario: Sublimite de sustraccion sin violencia de bienes fuera de predios (Coberturas del riesgo) - Valor asegurado menor a valor asegurable de Equipos moviles y portatiles
Meta:
@Story CDSEG-847
@URL https://jira.suramericana.com.co/browse/CDSEG-847
@Informador alejandro esteban villada marin
@Automatizador andres alarcon guerrero
@LOB Multiriesgo corporativo
@Sprint 5

As a <rolUsuario>
Given que estoy en edificios y ubicaciones de una poliza <numSubscripcion>
When intente ingresar las entradas de las diferentes coberturas
| TAB                   | TIPO_ARTICULO | COBERTURA   | ENTRADAS                                                                       | VALOR_ENTRADAS |
| Coberturas del Riesgo |               | Sustraccion | Sublimite sustraccion sin violencia de bienes fuera de predios                 | 11             |
When haga clic en el boton Aceptar
Then se debe validar que el valor ingresado en este sublimite sea menor o igual a la suma de los valores asegurables del equipo electronico movil y portatil (se suman los de la categoria otros y los normales).
| MENSAJES_WORKSPACE                                                                                                                                                                |
| El valor del "Sublimite sustraccion sin violencia de bienes fuera de predios" deber ser menor o igual a la sumatoria de los valores asegurables de "Equipo electrónico móvil y/o portátil". |
Then no debe dejar continuar y debe permanecer en la pagina Agregar Articulo

Examples:
| numSubscripcion | rolUsuario | descripcion |
| 22221237        | Asesor     |             |


Scenario: Sublimite sustraccion con violencia de dinero dentro de caja fuerte (Coberturas del riesgo) - Tener asegurado el dinero en efectivo
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


Scenario: Sublimite de sustraccion con violencia de dinero dentro de caja fuerte (Coberturas del riesgo) - Valor asegurado menor o igual a valor asegurable de dinero en efectivo
Meta:
@Story CDSEG-847
@URL https://jira.suramericana.com.co/browse/CDSEG-847
@Informador alejandro esteban villada marin
@Automatizador andres alarcon guerrero
@LOB Multiriesgo corporativo
@Sprint 5
@Pending true

As a <rolUsuario>
Given que estoy en edificios y ubicaciones de una poliza <numSubscripcion>
When intente ingresar las entradas de las diferentes coberturas
| TAB                   | TIPO_ARTICULO | COBERTURA   | ENTRADAS                                                                       | VALOR_ENTRADAS |
| Coberturas del Riesgo |               | Sustraccion | Sublimite sustracion con violencia de dinero en efectivo dentro de caja fuerte | 11             |
When haga clic en el boton Aceptar
Then se debe validar que el valor ingresado en este sublimite sea menor o igual a la suma de los valores asegurables del equipo electronico movil y portatil (se suman los de la categoria otros y los normales).
| MENSAJES_WORKSPACE                                                                                                                                                             |
| El valor del "Sublimite sustracion con violencia de dinero en efectivo dentro de caja fuerte" deber ser menor o igual a la sumatoria de los valores asegurables de "Dinero en efectivo". |
Then no debe dejar continuar y debe permanecer en la pagina Agregar Articulo

Examples:
| numSubscripcion | rolUsuario | descripcion |
| 22221237        | Asesor     |             |

Scenario: Sustraccion con violencia de dinero fuera de caja fuerte (Coberturas del riesgo) - Dependencia de otro sublimite
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


Scenario: Sublimite de sustraccion con violencia de dinero fuera de caja fuerte (Coberturas del riesgo) - valor asegurado de este sublimite menor o igual al valor asegurado de otro sublimite
Meta:
@Story CDSEG-847
@URL https://jira.suramericana.com.co/browse/CDSEG-847
@Informador alejandro esteban villada marin
@Automatizador andres alarcon guerrero
@LOB Multiriesgo corporativo
@Sprint 5

As a <rolUsuario>
Given que estoy en edificios y ubicaciones de una poliza <numSubscripcion>
When intente ingresar las entradas de las diferentes coberturas
| TAB                   | TIPO_ARTICULO | COBERTURA   | ENTRADAS                                                                       | VALOR_ENTRADAS |
| Coberturas del Riesgo |               | Sustraccion | Sublimite sustracion con violencia de dinero en efectivo dentro de caja fuerte | 2              |
| Coberturas del Riesgo |               | Sustraccion | Sublimite sustracion con violencia de dinero en efectivo fuera de caja fuerte  | 11             |
When haga clic en el boton Aceptar
Then se debe mostrar el siguiente mensaje como lo hace guidewire (espacio de trabajo)
| MENSAJES_WORKSPACE                                                                                                                                                             |
| El valor del "Sublimite sustracion con violencia de dinero en efectivo fuera de caja fuerte" deber ser menor o igual al valor de "Sublimite sustracion con violencia de dinero en efectivo dentro de caja fuerte". |
Then no debe dejar continuar y debe permanecer en la pagina Agregar Articulo

Examples:
| numSubscripcion | rolUsuario | descripcion |
| 22221237        | Asesor     |             |

##

Scenario: Sublimite deterioro de bienes refigerados por rotura maquinaria (coberturas del riesgo)
Meta:
@Story CDSEG-943
@URL https://jira.suramericana.com.co/browse/CDSEG-943
@Informador alejandro esteban villada marin
@Automatizador andres alarcon guerrero
@LOB Multiriesgo corporativo
@Sprint 5

As a <rolUsuario>
Given que estoy en edificios y ubicaciones de una poliza <numSubscripcion>
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


Scenario: Valor asegurado de la cobertura Deterioro de bienes refigerados por rotura maquinaria (Coberturas del riesgo)
Meta:
@Story CDSEG-943
@URL https://jira.suramericana.com.co/browse/CDSEG-943
@Informador alejandro esteban villada marin
@Automatizador andres alarcon guerrero
@LOB Multiriesgo corporativo
@Sprint 5

As a <rolUsuario>
Given que estoy en edificios y ubicaciones de una poliza <numSubscripcion>
When intente ingresar las entradas de las diferentes coberturas
| TAB                      | TIPO_ARTICULO | COBERTURA             | ENTRADAS                                                                       | VALOR_ENTRADAS |
| Coberturas del Riesgo    |               | Danos materiales      | Sublimite para deterioro de bienes refrigerados por rotura de maquinaria       | 11             |
| Información de Artículos |               | Existencias Flotantes | Valor asegurado máximo                                                         | 11             |
| Información de Artículos |               | Existencias fijas     | Valor Asegurable                                                               | 11             |
When haga clic en el boton Aceptar
Then se debe mostrar el siguiente mensaje como lo hace guidewire (espacio de trabajo)
| MENSAJES_WORKSPACE                                                                                                                                                                                                                                            |
| El valor del "Sublimite para deterioro de bienes refrigerados por rotura de maquinaria " debe ser menor o igual a la sumatoria de los valores asegurados de la cobertura "Danos materiales" de los articulos "-Existencias flotantes - Existencias fijas - ". |
Then no debe dejar continuar y debe permanecer en la pagina Agregar Articulo

Examples:
| numSubscripcion | rolUsuario | descripcion |
| 22221237        | Asesor     |             |


Scenario: Valor asegurado de la cobertura Deterioro de bienes refigerados por rotura maquinaria (Coberturas del riesgo) - 40 porciento
Meta:
@Story CDSEG-943
@URL https://jira.suramericana.com.co/browse/CDSEG-943
@Informador alejandro esteban villada marin
@Automatizador andres alarcon guerrero
@LOB Multiriesgo corporativo
@Sprint 5
@Pending true

As a <rolUsuario>
Given que estoy en edificios y ubicaciones de una poliza <numSubscripcion>
When intente ingresar las entradas de las diferentes coberturas
| TAB                      | TIPO_ARTICULO  | COBERTURA                             | ENTRADAS                                                                 | VALOR_ENTRADAS |
| Coberturas del Riesgo    |                | Danos materiales                      | Sublimite para deterioro de bienes refrigerados por rotura de maquinaria | 9              |
| Información de Artículos |                | Edificios                             | Valor Reconstrucción                                                     | 2              |
| Información de Artículos |                | Maquinaria y equipo                   | Valor Asegurable                                                         | 2              |
| Información de Artículos |                | Equipo electrónico móvil y/o portátil | Valor Asegurable                                                         | 2              |
| Información de Artículos |                | Dinero en Efectivo                    | Valor Asegurable                                                         | 2              |
| Información de Artículos |                | Equipo electrónico fijo               | Valor Asegurable                                                         | 2              |
| Información de Artículos |                | Muebles y enseres                     | Valor Asegurable                                                         | 2              |
| Información de Artículos |                | Existencias Flotantes                 | Valor asegurado máximo                                                   | 2              |
| Información de Artículos |                | Existencias fijas                     | Valor Asegurable                                                         | 2              |
| Otros Articulos          | Animales vivos |                                       | Valor Asegurable                                                         | 4              |
When haga clic en el boton Aceptar
Then se debe mostrar el siguiente mensaje como lo hace guidewire (espacio de trabajo)
| MENSAJES_WORKSPACE                                                                                                                                                                                     |
| El "Sublimite para deterioro de bienes refrigerados por rotura de maquinaria " deber ser menor o igual al "40.0%" de la sumatoria de los valores asegurables de "todos los articulos". |
Then no debe dejar continuar y debe permanecer en la pagina Agregar Articulo

Examples:
| numSubscripcion | rolUsuario | descripcion |
| 22221237        | Asesor     |             |


Scenario: Parametro del 40%
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


