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
Given he ingresado la informacion de coberturas a nivel de riesgo
When ingrese los sublimites de las diferentes coberturas de sustraccion
| SUBLIMITES                                                |
| Sustracción sin violencia dentro de predios               |
| Sustracción con violencia de bienes fuera de predios      |
| Sustracción sin violencia de bienes fuera de predios      |
| Sustracción con violencia de dinero dentro de caja fuerte |
| Sustracción con violencia de dinero fuera de caja fuerte  |
Then se debe validar que ningun sublimite de las coberturas anteriores sobrepase el valor asegurado de la cobertura de sustraccion con violencia (sustraccion principal)
Then no debe dejar continuar

Examples:
|  | rolUsuario | mensajeDeNoCumplimientoDeValidacionEsperado                                                              | descripcion |
|  | Asesor     | La *sublimiteDeSustraccion* debe ser menor o igual al valor asegurado de la cobertura de *coberturaDeSustraccion* |             |


Scenario: Sublimite de sustraccion con violencia de bienes fuera de predios (cobertura de riesgos) - Sublimite menor a valor asegurable Equipos moviles y portatiles
Meta:
@Story CDSEG-847
@URL https://jira.suramericana.com.co/browse/CDSEG-847
@Informador alejandro esteban villada marin
@Automatizador andres alarcon guerrero
@LOB Multiriesgo corporativo
@tags cobertura, sustraccion, con violencia, bienes, fuera, predio, sublimites, validacion de sublimites
@Sprint 5

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

As a <rolUsuario>
Given estoy ingresando la información de coberturas a nivel de riesgo
When quiera cambiar el valor de 1,000 millones a otro valor o quiera cambiar el valor del 20% a otro valor
Then se cambie simplemente en una tabla de parámetros. Estos valores no deben estar quemados en el código.

Examples:
| rolUsuario | descripcion |
| Asesor     |             |


