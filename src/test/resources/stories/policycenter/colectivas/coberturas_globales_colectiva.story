Coberturas globales


Meta:
@lote3
@Story CDSEG-4620
@URL https://jira.suramericana.com.co/browse/CDSEG-4620
@tag automator:juan_gabriel_zapata
@Sprint 10

Scenario: 1 Validacion de campos en menu lateral de poliza riesgo
GivenStories: stories/policycenter/login_policy.story
Given que estoy en la informacion de la poliza con numero de subscripcion <numSubscripcion>
When ingrese a la opcion informacion de poliza
Then deben estar en estado <estadodos> las siguientes opciones
| OPCIONES_MENU_NO_VISIBLES |
| Coberturas globales       |


Examples:
| numSubscripcion | rolUsuario | estadodos  |
| 33355336        | Asesor     | No visible |


Scenario: 2 Validacion de campos en menu lateral de poliza principal
Given que estoy en la informacion de la poliza con numero de subscripcion <numSubscripcion>
When ingrese a la opcion informacion de poliza
Then deben estar en estado <estadouno> las siguientes opciones
| OPCIONES_MENU          |
| Coberturas globales    |


Examples:
| numSubscripcion | rolUsuario | estadodos  |
| 33344336        | Asesor     | No visible |


Scenario: 3 Validacion de campos en la opcion agregar cobertura global de poliza principal
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




Examples:
| numSubscripcion | rolUsuario | estadouno  |
| 33344336        | Asesor     | Visible    |

