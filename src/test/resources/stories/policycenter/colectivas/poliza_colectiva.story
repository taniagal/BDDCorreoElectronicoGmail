Poliza colectiva


Meta:
@lote4
@Story CDSEG-4620 @Story CDSEG-4618
@URL https://jira.suramericana.com.co/browse/CDSEG-
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
And debe estar en la pestaña coberturas en estado <estadouno> las siguientes opciones
| OPCIONES_MENU |
| Descripción   |
And deben estar en estado <estadodos> las siguientes opciones
| OPCIONES_MENU_NO_VISIBLES |
| Tipo de cobertura         |



Examples:
| numSubscripcion | rolUsuario | estadouno  | estadodos  |
| 33344336        | Asesor     | Visible    | No visible |



Scenario: 4 Validacion de campos en la opcion cobertura global de poliza principal
Given que estoy en la informacion de la poliza con numero de subscripcion <numSubscripcion>
When ingrese las diferentes coberturas globales
| DESCRIPCION      | COBERTURA        | ENTRADAS                         | VALOR_ENTRADAS |
| Danos materiales | Danos materiales | Valor asegurado danos materiales | 100            |
Then en coberturas globales deben estar en estado <estadouno> las siguientes opciones
| OPCIONES_MENU        |
| Detalles             |
| Coberturas Incluidas |

Examples:
| numSubscripcion | rolUsuario | estadouno |
| 33344336       | Asesor     | Visible   |



Scenario: 5 Validacion de campos en menu lateral y opcion cotizacion ern poliza principal
Given que estoy en la informacion de la poliza con numero de subscripcion <numSubscripcion>
When cotize una poliza
Then deben estar en estado <estadouno> las siguientes opciones
| OPCIONES_MENU   |
| Formularios     |
| Pago            |
| Notas           |
| Documento       |
| Participantes   |
| Plan de trabajo |
| Historial       |
And deben estar en estado <estadodos> las siguientes opciones
| OPCIONES_MENU_NO_VISIBLES |
| Edificios y ubicaciones   |
| Modificadores             |
And en cotizacion de poliza debe estar en estado <estadodos> las siguientes opciones
| OPCIONES_MENU_NO_VISIBLES |
| Prima de póliza   |

Examples:
| numSubscripcion | rolUsuario | estadouno | estadodos  |
| 33344336        | Asesor     | Visible   | No visible |



Scenario: 6 Validacion de campos en revision de poliza principal
Given que estoy en la informacion de la poliza con numero de subscripcion <numSubscripcion>
When ingrese a la opcion revision de la poliza
Then en revision de poliza deben estar en estado <estadodos> las siguientes opciones
| OPCIONES_MENU_NO_VISIBLES |
| Edificios   |

Examples:
| numSubscripcion | rolUsuario | estadodos  |
| 33344336       | Asesor     | No visible |


Scenario: 7 Validacion de campos en menu lateral de poliza principal expedida
Given que estoy en la informacion de la poliza con numero de subscripcion <numSubscripcion>
When voy a expedir una poliza
And confirmo el mensaje de expedir poliza
And ingrese a ver cotizacion de poliza expedida
Then deben estar en estado <estadodos> las siguientes opciones
| OPCIONES_MENU_NO_VISIBLES |
| Edificios y Ubicaciones   |
| Modificadores             |
And en cotizacion de poliza debe estar en estado <estadodos> las siguientes opciones
| OPCIONES_MENU_NO_VISIBLES |
| Prima de póliza   |

Examples:
| numSubscripcion | rolUsuario | estadodos  |
| 33344336       | Asesor     | No visible |


Scenario: 8 Validacion de campos no editables en informacion
Given que estoy en la informacion de la poliza con numero de subscripcion <numSubscripcion>
When ingrese a la opcion informacion de poliza
Then ningun campo puede ser editable en informacion
And en informacion de poliza deben estar en estado <estadodos> las siguientes opciones
| OPCIONES_MENU_NO_VISIBLES |
| Agregar coaseguro         |

Examples:
| numSubscripcion | rolUsuario | estadodos  |
| 33344336        | Asesor     | No visible |


Scenario: 9 Validacion de campos no editables en pago
Given que estoy en la informacion de la poliza con numero de subscripcion <numSubscripcion>
When ingrese a la opcion de pago
Then ningun campo puede ser editable en pago

Examples:
| numSubscripcion | rolUsuario | estadodos  |
| 33344336       | Asesor     | No visible |