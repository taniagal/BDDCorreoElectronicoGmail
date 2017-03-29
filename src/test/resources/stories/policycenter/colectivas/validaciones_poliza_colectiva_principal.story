Meta:
@lote4
@tag equipo: 2, sprint: 11


Scenario: 1 Validacion de campos en menu lateral de poliza principal
GivenStories: stories/policycenter/login_policy.story
Given que estoy en la informacion de la poliza con numero de subscripcion <numSubscripcion>
When copie la poliza
And ingrese a la opcion informacion de poliza
Then deben estar en estado <estadouno> las siguientes opciones
| OPCIONES_MENU             |
| Coberturas globales       |
| Exclusiones y Condiciones |
When ingrese a exclusiones y condiciones
And ingrese a agregar exclusion o condicion
And busque la exclusion o condicion <palabraabuscar>
Then se debe mostrar en la busqueda
|busqueda|
|Condiciones aplicables a la cobertura de suelos y terrenos|


Examples:
| numSubscripcion | rolUsuario | estadouno | palabraabuscar                                             |
| 33344336        | Asesor     | Visible   | Condiciones aplicables a la cobertura de suelos y terrenos |


Scenario: 2 Validacion de campos en la opcion agregar cobertura global de poliza principal
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
| Sustracción                                                                                           |
| Terremoto                                                                                             |
| Muerte de animales vivos por rotura de maquinaria                                                     |
| Todo riesgo construcción y todo riesgo montaje                                                        |
| Lucro cesante AMIT                                                                                    |
| Lucro cesante terremoto                                                                               |
| Lucro cesante danos materiales                                                                        |
| Lucro cesante por daño interno de equipo electrónico                                                  |
| Lucro cesante por rotura de maquinaria                                                                |
| Cobertura de ingreso manual 1                                                                        |
And debe estar en la pestaña coberturas en estado <estadouno> las siguientes opciones
| OPCIONES_MENU |
| Descripción   |
And deben estar en estado <estadodos> las siguientes opciones
| OPCIONES_MENU_NO_VISIBLES |
| Tipo de cobertura         |

Examples:
| numSubscripcion | rolUsuario | estadouno  | estadodos  |
| 33344336        | Asesor     | Visible    | No visible |


Scenario: 3 Validacion de campos en la opcion cobertura global de poliza principal
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
| 33344336        | Asesor     | Visible   |


Scenario: 4 Validacion de campos y opciones en poliza principal expedida
Given que estoy en la informacion de la poliza con numero de subscripcion <numSubscripcion>
When cotice una poliza principal
Then deben estar en estado <estadouno> las siguientes opciones
| OPCIONES_MENU   |
| Pago            |
| Notas           |
| Participantes   |
| Plan de trabajo |
| Historial       |
And deben estar en estado <estadodos> las siguientes opciones
| OPCIONES_MENU_NO_VISIBLES |
| Edificios y ubicaciones   |
| Modificadores             |
And en revision de poliza deben estar en estado <estadodos> las siguientes opciones
| OPCIONES_MENU_NO_VISIBLES |
| Edificios   |
And ingrese a la informacion de la poliza
And voy a expedir una poliza
And confirmo el mensaje de expedir poliza con requisitos
And ingrese a ver cotizacion de poliza expedida
Then deben estar en estado <estadodos> las siguientes opciones
| OPCIONES_MENU_NO_VISIBLES |
| Edificios y Ubicaciones   |
| Modificadores             |
And ingrese a la opcion informacion de poliza
Then ningun campo puede ser editable en informacion
And en informacion de poliza deben estar en estado <estadodos> las siguientes opciones
| OPCIONES_MENU_NO_VISIBLES |
| Agregar coaseguro         |
And ingrese a la opcion de pago
Then ningun campo puede ser editable en pago

Examples:
| numSubscripcion | rolUsuario | estadouno | estadodos  |
| 33344336        | Asesor     | Visible   | No visible |


Scenario: 5 Validacion de ubicaciones en poliza riesgo
Given que estoy en la informacion de la poliza con numero de subscripcion <numSubscripcion>
When copie la poliza
And ingrese a edificios y ubicaciones
Then en edificios deben estar en estado <estadodos> las siguientes opciones
| OPCIONES_MENU_NO_VISIBLES |
| Agregar Articulos         |

Examples:
| numSubscripcion | rolUsuario |estadodos  |
| 33355336        | Asesor     |No visible |

