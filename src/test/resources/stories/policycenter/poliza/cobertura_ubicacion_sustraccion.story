Meta:
@lote5
@Story CDSEG-847
@tag equipo: 2, sprint: 5


Scenario: 1 Validacion de sublimites maximos para las otras coberturas de sustraccion (coberturas de riesgo)
GivenStories: stories/policycenter/login_policy.story
Given que estoy en edificios y ubicaciones de una poliza <numSubscripcion> con el rol <rolUsuario>
When intente ingresar las entradas de las diferentes coberturas
| TAB                   | TIPO_ARTICULO | OTRO_ARTICULO_OTROS | COBERTURA   | ENTRADAS                                                                       | VALOR_ENTRADAS |
| Coberturas del Riesgo |               |                     | Sustracción | Valor asegurado sustracción con violencia                                      | 10             |
| Coberturas del Riesgo |               |                     | Sustracción | Sublimite sustracción sin violencia                                            | 11             |
| Coberturas del Riesgo |               |                     | Sustracción | Sublimite sustracción con violencia de bienes fuera de predios                 | 11             |
| Coberturas del Riesgo |               |                     | Sustracción | Sublimite sustracción sin violencia de bienes fuera de predios                 | 11             |
| Coberturas del Riesgo |               |                     | Sustracción | Sublimite sustracción con violencia de dinero en efectivo dentro de caja fuerte | 11             |
| Coberturas del Riesgo |               |                     | Sustracción | Sublimite sustracción con violencia de dinero en efectivo fuera de caja fuerte  | 11             |
When haga clic en el boton Aceptar
Then se debe mostrar el o los siguientes mensajes
| MENSAJES_WORKSPACE                                                                                                                                           |
|El "Sublimite sustracción sin violencia " deber ser menor o igual al "Valor asegurado sustracción con violencia ".|
|El "Sublimite sustracción con violencia de bienes fuera de predios" deber ser menor o igual al "Valor asegurado sustracción con violencia ".                 |
|El "Sublimite sustracción sin violencia de bienes fuera de predios" deber ser menor o igual al "Valor asegurado sustracción con violencia ".                 |
|El "Sublimite sustracción con violencia de dinero en efectivo fuera de caja fuerte" deber ser menor o igual al "Valor asegurado sustracción con violencia ".  |
|El "Sublimite sustracción con violencia de dinero en efectivo dentro de caja fuerte" deber ser menor o igual al "Valor asegurado sustracción con violencia ". |

Examples:
| numSubscripcion | rolUsuario |
| 22222211        | Asesor     |


Scenario: 2 Sublimite sustraccion con violencia de bienes fuera de predios (Coberturas del riesgo) - Tener asegurado Equipos moviles y portatiles
Meta:
@manual
Given Estoy ingresando la informacion de coberturas a nivel de riesgo
When Ingrese un valor en el sublimite de sustraccion con violencia de bienes fuera de predios Y haga clic en el boton aceptar
Then se debe mostrar el o los siguientes mensajes Si no cumple lo anterior se debe mostrar el siguiente mensaje: "El -Nombre del sublimite de sustraccion con violencia de bienes fuera de predios- debe ser menor o igual a la sumatoria de los valores asegurables del equipo electronico movil y portatil." y no debe dejar continuar
Examples:
| numSubscripcion | rolUsuario | descripcion |
| 22222211        | Asesor     |             |


Scenario: 3 Sublimite de sustraccion con violencia de bienes fuera de predios (cobertura de riesgos) - Sublimite menor a valor asegurable Equipos moviles y portatiles
Given que estoy en edificios y ubicaciones de una poliza <numSubscripcion> con el rol <rolUsuario>
When intente ingresar las entradas de las diferentes coberturas
| TAB                   | TIPO_ARTICULO | OTRO_ARTICULO_OTROS | COBERTURA   | ENTRADAS                                                       | VALOR_ENTRADAS |
| Coberturas del Riesgo |               |                     | Sustracción | Sublimite sustracción con violencia de bienes fuera de predios | 11             |
| Coberturas del Riesgo |               |                     | Sustracción | Valor asegurado sustracción con violencia                      | 10             |
When haga clic en el boton Aceptar
Then se debe mostrar el o los siguientes mensajes
| MENSAJES_WORKSPACE                                                                                                                                                                         |
| El valor de "Sublimite sustracción con violencia de bienes fuera de predios" deber ser menor o igual a la sumatoria de los valores asegurables de "Equipo electrónico móvil y/o portátil". |
Examples:
| numSubscripcion | rolUsuario | descripcion |
| 22222211        | Asesor     |             |


Scenario: 4 Sublimite sustraccion sin violencia de bienes fuera de predios (Coberturas del riesgo) - Tener asegurados Equipos moviles y portatiles
Meta:
@manual
Given Estoy ingresando la informacion de coberturas a nivel de riesgo
When Ingrese un valor en el sublimite de sustraccion sin violencia de bienes fuera de predios Y haga clic en el boton aceptar
Then Se debe validar que el articulo "Equipo electronico movil y portatil" debe estar asegurado (en la categoria otros o en la normal). Si no se cumple lo anterior entonces se debe mostrar el siguiente mensaje: "Para poder seleccionar el - Nombre del sublimite de sustraccion sin violencia de bienes fuera de predios- debe tener asegurado el equipo electronico movil y portatil." y no debe dejar continuar.
Examples:
| numSubscripcion | rolUsuario | descripcion |
| 22222211        | Asesor     |             |


Scenario: 5 Sublimite de sustraccion sin violencia de bienes fuera de predios (Coberturas del riesgo) - Valor asegurado menor a valor asegurable de Equipos moviles y portatiles
Given que estoy en edificios y ubicaciones de una poliza <numSubscripcion> con el rol <rolUsuario>
When intente ingresar las entradas de las diferentes coberturas
| TAB                   | TIPO_ARTICULO | OTRO_ARTICULO_OTROS | COBERTURA   | ENTRADAS                                                       | VALOR_ENTRADAS |
| Coberturas del Riesgo |               |                     | Sustracción | Sublimite sustracción sin violencia de bienes fuera de predios | 12             |
| Coberturas del Riesgo |               |                     | Sustracción | Valor asegurado sustracción con violencia                      | 10             |
When haga clic en el boton Aceptar
Then se debe mostrar el o los siguientes mensajes
| MENSAJES_WORKSPACE                                                                                                                                                                         |
| El valor de "Sublimite sustracción sin violencia de bienes fuera de predios" deber ser menor o igual a la sumatoria de los valores asegurables de "Equipo electrónico móvil y/o portátil". |
Examples:
| numSubscripcion | rolUsuario | descripcion |
| 22222211        | Asesor     |             |


Scenario: 6 Sublimite sustraccion con violencia de dinero dentro de caja fuerte (Coberturas del riesgo) - Tener asegurado el dinero en efectivo
Meta:
@manual
Given Estoy ingresando la informacion de coberturas a nivel de riesgo
When Ingrese un valor en el sublimite de sustraccion con violencia de dinero dentro de caja fuerte Y haga clic en el boton aceptar
Then Se debe validar que el articulo "Dinero en efectivo" debe estar asegurado (en la categoria otros o normal). Si no se cumple lo anterior entonces se debe mostrar el siguiente mensaje: "Para poder seleccionar el -Nombre del sublimite de sustraccion con violencia de dinero dentro de caja fuerte- debe tener asegurado eldinero en efectivo." y no debe dejar continuar.
Examples:
| numSubscripcion | rolUsuario | descripcion |
| 22222211        | Asesor     |             |


Scenario: 7 Sublimite de sustraccion con violencia de dinero dentro de caja fuerte (Coberturas del riesgo) - Valor asegurado menor o igual a valor asegurable de dinero en efectivo
Given que estoy en edificios y ubicaciones de una poliza <numSubscripcion> con el rol <rolUsuario>
When intente ingresar las entradas de las diferentes coberturas
| TAB                   | TIPO_ARTICULO | OTRO_ARTICULO_OTROS | COBERTURA   | ENTRADAS                                                                        | VALOR_ENTRADAS |
| Coberturas del Riesgo |               |                     | Sustracción | Sublimite sustracción con violencia de dinero en efectivo dentro de caja fuerte | 11             |
| Coberturas del Riesgo |               |                     | Sustracción | Valor asegurado sustracción con violencia                                       | 10             |
Then se debe mostrar el o los siguientes mensajes
| MENSAJES_WORKSPACE                                                                                                                                                                      |
| El "Sublimite sustracción con violencia de dinero en efectivo dentro de caja fuerte" deber ser menor o igual al "Valor asegurado sustracción con violencia ".                            |
| Para poder seleccionar el "Sublimite sustracción con violencia de dinero en efectivo dentro de caja fuerte" debe tener asegurado "Dinero en efectivo"                                    |
| El valor de "Sublimite sustracción con violencia de dinero en efectivo dentro de caja fuerte" deber ser menor o igual a la sumatoria de los valores asegurables de "Dinero en efectivo". |
Examples:
| numSubscripcion | rolUsuario | descripcion |
| 22222211        | Asesor     |             |

Scenario: 8 Sustraccion con violencia de dinero fuera de caja fuerte (Coberturas del riesgo) - Dependencia de otro sublimite
Meta:
@manual
Given Estoy ingresando la informacion de coberturas a nivel de riesgo
When Ingrese un valor en el sublimite de sustraccion con violencia de dinero fuera de caja fuerte Y haga clic en el boton aceptar
Then Se debe validar que exista el sublimite de sustraccion con violencia de dinero dentro de caja fuerte. Si no cumple lo anterior debe mostrar un mensaje en una ventana emergente que diga: "Para ingresar el -Nombre del sublimite de sustraccion con violencia de dinero fuera de caja fuerte- debe tener ingresado el -Nombre del sublimite de sustraccion con violencia de dinero dentro de caja fuerte-" y no debe dejar continuar.
Examples:
| numSubscripcion | rolUsuario | descripcion |
| 22222211        | Asesor     |             |


Scenario: 9 Sublimite de sustraccion con violencia de dinero fuera de caja fuerte (Coberturas del riesgo) - valor asegurado de este sublimite menor o igual al valor asegurado de otro sublimite
Given que estoy en edificios y ubicaciones de una poliza <numSubscripcion> con el rol <rolUsuario>
When intente ingresar las entradas de las diferentes coberturas
| TAB                   | TIPO_ARTICULO | OTRO_ARTICULO_OTROS | COBERTURA   | ENTRADAS                                                                        | VALOR_ENTRADAS |
| Coberturas del Riesgo |               |                     | Sustracción | Sublimite sustracción con violencia de dinero en efectivo dentro de caja fuerte | 2              |
| Coberturas del Riesgo |               |                     | Sustracción | Sublimite sustracción con violencia de dinero en efectivo fuera de caja fuerte  | 11             |
| Coberturas del Riesgo |               |                     | Sustracción | Valor asegurado sustracción con violencia                                       | 10             |
When haga clic en el boton Aceptar
Then se debe mostrar el o los siguientes mensajes
| MENSAJES_WORKSPACE                                                                                                                                                                              |
| El "Sublimite sustracción con violencia de dinero en efectivo fuera de caja fuerte" deber ser menor o igual al "Valor asegurado sustracción con violencia ".                                    |
| El "Sublimite sustracción con violencia de dinero en efectivo fuera de caja fuerte" deber ser menor o igual al "Sublimite sustracción con violencia de dinero en efectivo dentro de caja fuerte". |
Examples:
| numSubscripcion | rolUsuario | descripcion |
| 22222211        | Asesor     |             |
