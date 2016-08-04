Validacion de sublimtes

Meta:


Scenario: Validacion de sublimites maximos para las otras coberturas de sustraccion (coberturas de riesgo)
Meta:
@Story CDSEG-847
@URL https://jira.suramericana.com.co/browse/CDSEG-847
@Informador alejandro esteban villada marin
@Automatizador andres alarcon guerrero
@LOB Multiriesgo corporativo
@tags cobertura, nivel, riesgo, sustraccion, con violencia, sin violencia, bienes, fuera, dentro, predio, caja fuerte, mensaje, bloqueo, sublimites, validacion de sublimites
@Sprint 5

As a <rolUsuario>
Given que estoy en edificios y ubicaciones de una poliza <numSubscripcion>
When ingrese las entradas de las diferentes coberturas
!-- Solo se permiten en TAB Coberturas del Riesgo, Información de Artículos y Otros Articulos
!-- La columna TIPO_ARTICULO debe llenarse si escoguio el TAB Otros Articulos
| TAB                   | TIPO_ARTICULO | COBERTURA   | ENTRADAS                                                  | VALOR_ENTRADAS |
| Coberturas del Riesgo |               | Sustraccion | Sustracción sin violencia dentro de predios               | 10             |
| Coberturas del Riesgo |               | Sustraccion | Sustracción con violencia de bienes fuera de predios      | 10             |
| Coberturas del Riesgo |               | Sustraccion | Sustracción sin violencia de bienes fuera de predios      | 10             |
| Coberturas del Riesgo |               | Sustraccion | Sustracción con violencia de dinero dentro de caja fuerte | 10             |
| Coberturas del Riesgo |               | Sustraccion | Sustracción con violencia de dinero fuera de caja fuerte  | 10             |
Then se debe validar que ningun sublimite de las coberturas anteriores sobrepase el valor asegurado de la cobertura de sustraccion con violencia (sustraccion principal)
Then no debe dejar continuar

Examples:
| numSubscripcion | rolUsuario | mensajeDeNoCumplimientoDeValidacionEsperado                                                                       | descripcion |
| 99999999        | Asesor     | La *sublimiteDeSustraccion* debe ser menor o igual al valor asegurado de la cobertura de *coberturaDeSustraccion* |             |


Scenario: Sublimite de sustraccion con violencia de bienes fuera de predios (cobertura de riesgos) - Sublimite menor a valor asegurable Equipos moviles y portatiles
Meta:
@Story CDSEG-847
@URL https://jira.suramericana.com.co/browse/CDSEG-847
@Informador alejandro esteban villada marin
@Automatizador andres alarcon guerrero
@LOB Multiriesgo corporativo
@tags cobertura, sustraccion, con violencia, bienes, fuera, predio, sublimites, validacion de sublimites
@Sprint 5
@Pending true

As a <rolUsuario>
Given he ingresado la informacion de coberturas a nivel de riesgo
When ingrese los sublimites de las diferentes coberturas de sustraccion
| SUBLIMITES                                                |
| Sustracción con violencia de bienes fuera de predios      |
Then se debe validar que el valor ingresado en este sublimite sea menor o igual a la suma de los valores asegurables del equipo electrónico móvil y pórtatil (se suman los de la categoría otros y los normales).
Then no debe dejar continuar

Examples:
|  | rolUsuario | mensajeDeNoCumplimientoDeValidacionEsperado                                                                                                                    | descripcion |
|  | Asesor     | El *sublímiteDeSustracciónConVDBFDP* debe ser menor o igual a la sumatoria de los valores asegurables del equipo electrónico móvil y portatil. |             |


Scenario: Sublimite de sustraccion sin violencia de bienes fuera de predios (Coberturas del riesgo) - Valor asegurado menor a valor asegurable de Equipos moviles y portatiles
Meta:
@Story CDSEG-847
@URL https://jira.suramericana.com.co/browse/CDSEG-847
@Informador alejandro esteban villada marin
@Automatizador andres alarcon guerrero
@LOB Multiriesgo corporativo
@tags cobertura, sustraccion, sin violencia, bienes, fuera, predio, sublimites, validacion de sublimites
@Sprint 5
@Pending true

As a <rolUsuario>
Given he ingresado la informacion de coberturas a nivel de riesgo
When ingrese los sublimites de las diferentes coberturas de sustraccion
| SUBLIMITES                                           |
| Sustracción sin violencia de bienes fuera de predios |
Then se debe validar que el valor ingresado en este sublímite sea menor o igual al valor asegurable del equipo electrónico móvil y pórtatil (se suman los de la categoría otros y los normales).
Then no debe dejar continuar

Examples:
|  | rolUsuario | mensajeDeNoCumplimientoDeValidacionEsperado                                                                                                                    | descripcion |
|  | Asesor     | El *sublímiteDeSustracciónSinVDBFDP* debe ser menor o igual a la sumatoria de los valores asegurables del equipo electrónico móvil y portatil. |             |


Scenario: Sublímite de sustracción con violencia de dinero dentro de caja fuerte (Coberturas del riesgo) - Valor asegurado menor o igual a valor asegurable de dinero en efectivo
Meta:
@Story CDSEG-847
@URL https://jira.suramericana.com.co/browse/CDSEG-847
@Informador alejandro esteban villada marin
@Automatizador andres alarcon guerrero
@LOB Multiriesgo corporativo
@tags cobertura, sustraccion, con violencia, dinero, dentro, caja fuerte, sublimites, validacion de sublimites
@Sprint 5
@Pending true

As a <rolUsuario>
Given he ingresado la informacion de coberturas a nivel de riesgo
When ingrese los sublimites de las diferentes coberturas de sustraccion
| SUBLIMITES                                           |
|Sustracción con violencia de dinero dentro de caja fuerte |
Then se debe validar que el valor ingresado en este sublímite sea menor o igual a la suma de los valores asegurables del dinero en efectivo (se suman los de la categoría otros y los normales).
Then no debe dejar continuar

Examples:
|  | rolUsuario | mensajeDeNoCumplimientoDeValidacionEsperado                                                                                    | descripcion |
|  | Asesor     | El *sublímiteDeSustracciónConVDDDDCF* debe ser menor o igual a la sumatoria de los valores asegurables del dinero en efectivo. |             |


Scenario: Sublímite de sustracción con violencia de dinero fuera de caja fuerte (Coberturas del riesgo) - valor asegurado de este sublímite menor o igual al valor asegurado de otro sublímite
Meta:
@Story CDSEG-847
@URL https://jira.suramericana.com.co/browse/CDSEG-847
@Informador alejandro esteban villada marin
@Automatizador andres alarcon guerrero
@LOB Multiriesgo corporativo
@tags cobertura, sustraccion, con violencia, dinero, fuera, caja fuerte, sublimites, validacion de sublimites
@Sprint 5
@Pending true

As a <rolUsuario>
Given he ingresado la informacion de coberturas a nivel de riesgo
When ingrese los sublimites de las diferentes coberturas de sustraccion
| SUBLIMITES                                           |
|Sustracción con violencia de dinero fuera de caja fuerte  |
Then se debe validar que el valor ingresado en este sublímite sea menor o igual al valor ingresado en el sublímite de sustracción con violencia de dinero dentro de caja fuerte
Then no debe dejar continuar

Examples:
|  | rolUsuario | mensajeDeNoCumplimientoDeValidacionEsperado                                                             | descripcion |
|  | Asesor     | El *sublímiteDeSustracciónConVDDFDCF* debe ser menor o igual *sublimteDeSustraccionConViolenciaDDDDCF*. |             |



Scenario: Sublímite deterioro de bienes refigerados por rotura maquinaria (coberturas del riesgo)
Meta:
@Story CDSEG-943
@URL https://jira.suramericana.com.co/browse/CDSEG-943
@Informador alejandro esteban villada marin
@Automatizador andres alarcon guerrero
@LOB Multiriesgo corporativo
@tags cobertura, sublimites, validacion de sublimites, deterioro, bienes, refrigeracion, rotura, maquinaria
@Sprint 5
@Pending true

As a <rolUsuario>
Given he ingresado la informacion de coberturas a nivel de riesgo
When ingrese el valor sublimite dentro de las Coberturas del Riesgo
| TAB                      | ARTICULO            | COBERTURA            | COBERTURA_DEBE_ESTAR_SELECCIONADA | SUBLIMITE                                                           | VALOR_SUBLIMITE |
| Coberturas del Riesgo    |                     | Danos materiales     | SI                                | Deducible deterioro de bienes refrigerados por rotura de maquinaria |                 |
| Información de Artículos | Maquinaria y equipo | Danos materiales     | SI                                |                                                                     |                 |
| Información de Artículos | Maquinaria y equipo | Rotura de maquinaria | NO                                |                                                                     |                 |
When haga clic en el boton Aceptar
Then espero ver el mensaje: Para seleccionar el NOMBRE_DEL_SUBLIMITE debe tener seleccionada la cobertura de rotura maquinaria para el artículo maquinaria y equipo
Then debe permanecer en Edificios y Ubicaciones

Examples:
| rolUsuario | descripcion |
| Asesor     |             |



Scenario: Valor asegurado de la cobertura Deterioro de bienes refigerados por rotura maquinaria (Coberturas del riesgo)
Meta:
@Story CDSEG-943
@URL https://jira.suramericana.com.co/browse/CDSEG-943
@Informador alejandro esteban villada marin
@Automatizador andres alarcon guerrero
@LOB Multiriesgo corporativo
@tags cobertura, sublimites, validacion de sublimites, deterioro, bienes, refrigeracion, rotura, maquinaria, valor asegurado
@Sprint 5
@Pending true

As a <rolUsuario>
Given he ingresado la informacion de coberturas a nivel de riesgo
When ingrese el valor sublimite dentro de las Coberturas del Riesgo
| TAB                      | ARTICULO            | COBERTURA            | COBERTURA_DEBE_ESTAR_SELECCIONADA | SUBLIMITE                                                           | VALOR_SUBLIMITE |
| Coberturas del Riesgo    |                     | Danos materiales     | SI                                | Deducible deterioro de bienes refrigerados por rotura de maquinaria |                 |
When ingrese valor para sublimite mayor a la sumatoria de los valores asegurados de la cobertura de daños de las existencias fijas y flotantes del riesgo
When haga clic en el boton Aceptar
Then espero ver el mensaje: El valor del NOMBRE_DEL_SUBLIMITE debe ser menor o igual a la sumatoria de los valores asegurados de la cobertura de daños de las existencias fijas y flotantes del riesgo.
Then debe permanecer en Edificios y Ubicaciones

Examples:
| rolUsuario | descripcion |
| Asesor     |             |



Scenario: Valor asegurado de la cobertura Deterioro de bienes refigerados por rotura maquinaria (Coberturas del riesgo) - 40 porciento
Meta:
@Story CDSEG-943
@URL https://jira.suramericana.com.co/browse/CDSEG-943
@Informador alejandro esteban villada marin
@Automatizador andres alarcon guerrero
@LOB Multiriesgo corporativo
@tags cobertura, sublimites, validacion de sublimites, deterioro, bienes, refrigeracion, rotura, maquinaria, valor asegurado
@Sprint 5
@Pending true

As a <rolUsuario>
Given he ingresado la informacion de coberturas a nivel de riesgo
When ingrese el valor sublimite dentro de las Coberturas del Riesgo
| TAB                      | ARTICULO            | COBERTURA            | COBERTURA_DEBE_ESTAR_SELECCIONADA | SUBLIMITE                                                           | VALOR_SUBLIMITE |
| Coberturas del Riesgo    |                     | Danos materiales     | SI                                | Deducible deterioro de bienes refrigerados por rotura de maquinaria |                 |
When ingrese valor para sublimite mayor al 40% del valor asegurable de TODOS los artículos del riesgo (se suman categoría normal y otros)
When haga clic en el boton Aceptar
Then espero ver el mensaje: El valor del NOMBRE_DEL_SUBLIMITE debe ser menor o igual al 40% de la sumatoria de los valores asegurables de todos los articulos del riesgo.
Then debe permanecer en Edificios y Ubicaciones

Examples:
| rolUsuario | descripcion |
| Asesor     |             |

Scenario: Parametro del 40%
Meta:
@Story CDSEG-943
@URL https://jira.suramericana.com.co/browse/CDSEG-943
@Informador alejandro esteban villada marin
@Automatizador andres alarcon guerrero
@LOB Multiriesgo corporativo
@tags parametrizable
@manual
@Sprint 5
@Pending true

As a <rolUsuario>
Given he ingresado la informacion de coberturas a nivel de riesgo
When quiera cambiar el valor del 40% a otro valor
Then se cambie simplemente en una tabla de parámetros. Este valor no debe estar quemado en el código. Se debe poder cambiar a números decimales

Examples:
| rolUsuario | descripcion |
| Asesor     |             |


Scenario: Estoy ingresando la información de coberturas para el artículo suelos y terrenos (categoría otros)
Meta:
@Story CDSEG-844
@URL https://jira.suramericana.com.co/browse/CDSEG-844
@Informador alejandro esteban villada marin
@Automatizador andres alarcon guerrero
@LOB Multiriesgo corporativo
@tags cobertura, sublimites, validacion de sublimites, suelos, terrenos, valor asegurable
@Sprint 5
@Pending true

As a <rolUsuario>
Given he ingresado la informacion de coberturas para el articulo suelos y terrenos (categoria otros)
When ingrese el valor sublimite dentro de las Coberturas del Riesgo
| TAB             | ARTICULO          | ENTRADA          | VALOR_ENTRADA |
| Otros Articulos | Suelos y Terrenos | Valor Asegurable |               |
When ingrese valor asegurado mayor al 20% de la sumatoria de los valores asegurables de cada uno de los artículos del riesgo.
When haga clic en el boton Aceptar
Then espero ver el mensaje: El valor asegurado de NOMBRE la cobertura de terremoto para suelos y terrenos debe ser menor o igual al 20% de la sumatoria de los valores asegurables de todos los artículos del riesgo.
Then debe continuar con el proceso

Examples:
| rolUsuario | descripcion |
| Asesor     |             |



Scenario: Estoy ingresando la información de coberturas para el artículo suelos y terrenos
Meta:
@Story CDSEG-844
@URL https://jira.suramericana.com.co/browse/CDSEG-844
@Informador alejandro esteban villada marin
@Automatizador andres alarcon guerrero
@LOB Multiriesgo corporativo
@tags cobertura, sublimites, validacion de sublimites, suelos, terrenos, valor asegurable
@Sprint 5
@Pending true

As a <rolUsuario>
Given he ingresado la informacion de coberturas para el articulo suelos y terrenos (categoria otros)
When ingrese el valor sublimite dentro de las Coberturas del Riesgo
| TAB             | ARTICULO          | ENTRADA          | VALOR_ENTRADA |
| Otros Articulos | Suelos y Terrenos | Valor Asegurable |               |
When ingrese valor asegurado mayor a 1000 millones de pesos
When haga clic en el boton Aceptar
Then espero ver el mensaje: El valor asegurado de la cobertura de terremoto para suelos y terrenos debe ser menor o igual a 1.000 (Parámetro) millones de pesos
Then debe continuar con el proceso

Examples:
| rolUsuario | descripcion |
| Asesor     |             |




Scenario: Estoy ingresando la información de coberturas para el artículo suelos y terrenos
Meta:
@Story CDSEG-844
@URL https://jira.suramericana.com.co/browse/CDSEG-844
@Informador alejandro esteban villada marin
@Automatizador andres alarcon guerrero
@LOB Multiriesgo corporativo
@tags cobertura, sublimites, validacion de sublimites, suelos, terrenos, valor asegurable
@Sprint 5
@Pending true

As a <rolUsuario>
Given he ingresado la informacion de coberturas para el articulo suelos y terrenos (categoria otros)
When ingrese el valor sublimite dentro de las Coberturas del Riesgo
| TAB                      | ARTICULO          | COBERTURA | COBERTURA_DEBE_ESTAR_SELECCIONADA | ENTRADA | VALOR_ENTRADA |
| Información de Artículos | Edificios         | Terremoto | NO                                |         |               |
| Otros Articulos          | Suelos y Terrenos |           |                                   |         |               |

When ingrese valor asegurado
When haga clic en el boton Aceptar
Then espero ver el mensaje: Para seleccionar el NOMBRE (cobertura de  terremoto para suelos y terrenos) debe tener el edificio asegurado con la cobertura de terremoto.
Then debe permanecer en Edificios y Ubicaciones

Examples:
| rolUsuario | descripcion |
| Asesor     |             |



Scenario: Estoy ingresando la información de coberturas a nivel de riesgo
Meta:
@Story CDSEG-844
@URL https://jira.suramericana.com.co/browse/CDSEG-844
@Informador alejandro esteban villada marin
@Automatizador andres alarcon guerrero
@LOB Multiriesgo corporativo
@manual
@tags cobertura, sublimites, validacion de sublimites, suelos, terrenos, valor asegurable
@Sprint 5
@Pending true

As a <rolUsuario>
Given estoy ingresando la información de coberturas a nivel de riesgo
When quiera cambiar el valor de 1,000 millones a otro valor o quiera cambiar el valor del 20% a otro valor
Then se cambie simplemente en una tabla de parámetros. Estos valores no deben estar quemados en el código.

Examples:
| rolUsuario | descripcion |
| Asesor     |             |




Scenario: Sublímite de pérdidas de contenidos en tanques (Coberturas del riesgo)
Meta:
@Story CDSEG-767
@URL https://jira.suramericana.com.co/browse/CDSEG-767
@Informador alejandro esteban villada marin
@Automatizador andres alarcon guerrero
@LOB Multiriesgo corporativo
@tags coberturas, riesgo, sublimite, perdidas, contenido, tanques
@Sprint 5
@Pending true

As a <rolUsuario>
Given he ingresado la informacion de coberturas a nivel de riesgo
When ingrese el sublímite de pérdidas de contenidos en tanques dentro de la cobertura daños materiales mayor a la sumatoria de los valores asegurables de los articulos de existencia fija, existencia flotante y existencia a granel (categoria otors y normal)
When haga clic en el boton Aceptar
Then espero ver el mensaje: El valor del -Nombre del sublímite de las pérdidas de contenidos en tanques- debe ser menor o igual a la sumatoria de los valores asegurables de las existencias fijas, flotantes y a granel.
Then debe permanecer en Edificios y Ubicaciones

Examples:
| rolUsuario | descripcion |
| Asesor     |             |



Scenario: Portadores externos de datos (Coberturas del riesgo)
Meta:
@Story CDSEG-767
@URL https://jira.suramericana.com.co/browse/CDSEG-767
@Informador alejandro esteban villada marin
@Automatizador andres alarcon guerrero
@LOB Multiriesgo corporativo
@tags coberturas, riesgo, portadores, externos, datos
@Sprint 5
@Pending true

As a <rolUsuario>
Given he ingresado la informacion de coberturas para una ubicacion
When seleccione la cobertura de portadores externos de dato
When haga clic en el boton Aceptar
Then Se debe validar que para el riesgo se debe tener asegurado el artículo "Equipo electrónico fijo" (categoría otros o normal). Si no se tiene asegurado se debe mostrar el siguiente mensaje: "Para seleccionar la cobertura de -Nombre de la cobertura de portadores externos de datos- se debe tener asegurado el equipo electrónico fijo." y no debe dejar continuar.

Examples:
| rolUsuario | descripcion |
| Asesor     |             |



Scenario: Gastos por arrendamiento de sistema electrónico de procesamiento de datos (Coberturas del riesgo)
Meta:
@Story CDSEG-767
@URL https://jira.suramericana.com.co/browse/CDSEG-767
@Informador alejandro esteban villada marin
@Automatizador andres alarcon guerrero
@LOB Multiriesgo corporativo
@tags coberturas, riesgo, portadores, externos, datos
@Sprint 5
@Pending true

As a <rolUsuario>
Given he ingresado la informacion de coberturas para una ubicacion
When seleccione la cobertura de Gastos por arrendamiento de sistema electrónico de procesamiento de datos
When haga clic en el boton Aceptar
Then Se debe validar que para el riesgo se debe tener asegurado el artículo "Equipo electrónico fijo" (categoría otros o normal). Si no se tiene asegurado se debe mostrar el siguiente mensaje: "Para seleccionar la cobertura de -Nombre de la cobertura de gastos por arrendamiento de sistema electrónico de procesamiento de datos- se debe tener asegurado el equipo electrónico fijo." y no debe dejar continuar

Examples:
| rolUsuario | descripcion |
| Asesor     |             |


Scenario: Sublimite todo riesgo construccion y|o todo riesgo montaje dentro de los predios asegurados (Coberturas del riesgo) - Porcentaje
Meta:
@Story CDSEG-767
@URL https://jira.suramericana.com.co/browse/CDSEG-767
@Informador alejandro esteban villada marin
@Automatizador andres alarcon guerrero
@LOB Multiriesgo corporativo
@tags coberturas, riesgo, portadores, externos, datos
@Sprint 5
@Pending true

As a <rolUsuario>
Given he ingresado la informacion de coberturas para una ubicacion
When Ingrese el sublímite de la cobertura de todo riesgo construcción y/o montaje dentro de los predios asegurados
When haga clic en el boton Aceptar
Then Se debe validar que el valor asegurado sea menor o igual al 10% de la sumatoria de los valores asegurables de todos los artículos (categoría otros y normal). Si no cumple con lo anterior debe salir el siguiente mensaje de advertencia (warning): "El valor asegurado de la cobertura -Nombre de la cobertura todo riesgo construcción y/o montaje- debe ser menor o igual al 10% de la sumatoria de los valores asegurables de todos los artículos del predio." pero puede continuar con el proceso.

Examples:
| rolUsuario | descripcion |
| Asesor     |             |

Scenario: Sublímites menores a valor asegurado daños (coberturas a nivel de riesgo)
Meta:
@Story CDSEG-767
@URL https://jira.suramericana.com.co/browse/CDSEG-767
@Informador alejandro esteban villada marin
@Automatizador andres alarcon guerrero
@LOB Multiriesgo corporativo
@tags coberturas, riesgo, portadores, externos, datos
@Sprint 5
@Pending true

As a <rolUsuario>
Given he ingresado la informacion de coberturas para una ubicacion
When quiera devolverme a la pantalla de ubicaciones (clic en el botón aceptar)
When haga clic en el boton Aceptar
Then Se debe validar que el valor asegurado sea menor o igual al 10% de la sumatoria de los valores asegurables de todos los artículos (categoría otros y normal). Si no cumple con lo anterior debe salir el siguiente mensaje de advertencia (warning): "El valor asegurado de la cobertura -Nombre de la cobertura todo riesgo construcción y/o montaje- debe ser menor o igual al 10% de la sumatoria de los valores asegurables de todos los artículos del predio." pero puede continuar con el proceso.

Examples:
| rolUsuario | descripcion |
| Asesor     |             |



