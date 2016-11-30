Informacion a mostrar en poliza principal


Meta:
@lote3
@Story CDSEG-4618
@URL https://jira.suramericana.com.co/browse/CDSEG-4618
@tag automator:juan_gabriel_zapata
@Sprint 10



Scenario: 1 Validacion de campos en menu lateral y opcion cotizacion
GivenStories: stories/policycenter/login_policy.story
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
And en cotizacion de poliza debe estar en estado <estadodos> las siguientes opciones $menusesperados
| OPCIONES_MENU_NO_VISIBLES |
| Prima de póliza   |

Examples:
| numSubscripcion | rolUsuario | estadouno | estadodos  |
| 33344336        | Asesor     | Visible   | No visible |



Scenario: 2 Validacion de campos en revision de poliza
Given que estoy en la informacion de la poliza con numero de subscripcion <numSubscripcion>
When ingrese a la opcion revision de la poliza
Then en revision de poliza deben estar en estado <estadodos> las siguientes opciones $menusesperados
| OPCIONES_MENU_NO_VISIBLES |
| Edificios   |

Examples:
| numSubscripcion | rolUsuario | estadodos  |
| 33344336        | Asesor     | No visible |


Scenario: 3 Validacion de campos en menu lateral de poliza principal expedida
Given que estoy en la informacion de la poliza con numero de subscripcion <numSubscripcion>
When voy a expedir una poliza
And confirmo el mensaje de expedir poliza
And ingrese a ver cotizacion de poliza expedida
Then deben estar en estado <estadodos> las siguientes opciones
| OPCIONES_MENU_NO_VISIBLES |
| Edificios y Ubicaciones   |
| Modificadores             |
And en cotizacion de poliza debe estar en estado <estadodos> las siguientes opciones $menusesperados
| OPCIONES_MENU_NO_VISIBLES |
| Prima de póliza   |

Examples:
| numSubscripcion | rolUsuario | estadodos  |
| 33344336        | Asesor     | No visible |


Scenario: 4 Validacion de campos no editables en informacion
Given que estoy en la informacion de la poliza con numero de subscripcion <numSubscripcion>
When ingrese a la opcion informacion de poliza
Then ningun campo puede ser editable en informacion
And en informacion de poliza deben estar en estado <estadodos> las siguientes opciones
| OPCIONES_MENU_NO_VISIBLES |
| Agregar coaseguro         |

Examples:
| numSubscripcion | rolUsuario | estadodos  |
| 33344336        | Asesor     | No visible |


Scenario: 5 Validacion de campos no editables en pago
Given que estoy en la informacion de la poliza con numero de subscripcion <numSubscripcion>
When ingrese a la opcion de pago
Then ningun campo puede ser editable en pago

Examples:
| numSubscripcion | rolUsuario | estadodos  |
| 33344336        | Asesor     | No visible |























