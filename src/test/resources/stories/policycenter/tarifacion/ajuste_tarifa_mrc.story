Meta:
@lote3
@sprint 14
@tag equipo: 4


Narrative:
Como usuario de policy center
Al cotizar una poliza colectiva de MRC donde se tienen coberturas globales quiero ver el resultado de la cotizacion en cero

Scenario:  Cotizacion poliza colectiva MRC con cobertura global
GivenStories: stories/policycenter/login_policy.story
Given que estoy en la informacion de la poliza con numero de subscripcion <numSubscripcion>
When seleccione la opcion coberturas globales
And seleccione la opcion agregar cobertura global
Then en agregar coberturas globales deben estar en estado <estadouno> las siguientes opciones
| OPCIONES_MENU                                                                                         |
| Dano interno en equipo electronico                                                                    |
| Danos materiales                                                                                      |
| Rotura de maquinaria                                                                                  |
| Asonada, motin, conmocion civil o popular, huelga, y actos mal intencionados de terceros y terrorismo |
| Gastos por arrendamiento de sistema electrónico de procesamiento de datos                             |
| Asistencia                                                                                            |
| Disminucion de ingresos por arrendamiento                                                             |
| Gastos por arrendamiento temporal                                                                     |
| Gastos adicionales                                                                                    |
| Cobertura automática de nuevos bienes                                                                 |
| Portadores externos de datos                                                                          |
| Sustraccion                                                                                           |
| Terremoto                                                                                             |
| Animales vivos                                                                                        |
| Todo riesgo construcción y todo riesgo montaje                                                        |
| Lucro cesante AMIT                                                                                    |
| Lucro cesante terremoto                                                                               |
| Lucro cesante danos materiales                                                                        |
| Lucro cesante por dano interno de equipo electronico                                                  |
| Lucro cesante por rotura de maquinaria                                                                |
| Coberturas de ingreso manual                                                                          |
And debe estar en la pestaña coberturas en estado <estadouno> las siguientes opciones
| OPCIONES_MENU |
| Descripción   |
And deben estar en estado <estadodos> las siguientes opciones
| OPCIONES_MENU_NO_VISIBLES |
| Tipo de cobertura         |

Examples:
| numSubscripcion | rolUsuario | estadouno  | estadodos  |
| 33344336        | Asesor     | Visible    | No visible |