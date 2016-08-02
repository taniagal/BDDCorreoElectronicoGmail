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
@tags cobertura, sustraccion, con violencia, dinero, fuera, caja fuerte, sublimites, validacion de sublimites
@Sprint 5

As a <rolUsuario>
Given he ingresado la informacion de coberturas a nivel de riesgo
When ingrese el valor sublimite dentro de la cobertura
| SUBLIMITE                                                           | TAB                      | COBERTURA         | VALOR_SUBLIMITE     | SELECCIONAR |
| Deducible deterioro de bienes refrigerados por rotura de maquinaria | Coberturas del Riesgo    | Danos materiales  | 6666                | SI          |
|                                                                     | Información de Artículos | rotura maquinaria | Maquinaria y equipo |             |

Examples:
| rolUsuario | mensajeSiNoSeSeleccionaCoberturaDeRoturaMaquinaria | descripcion |
| Asesor     |                                                    |             |

