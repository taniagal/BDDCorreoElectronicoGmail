Informacion a mostrar en poliza principal


Meta:
@lote3
@Story CDSEG-2778
@URL https://jira.suramericana.com.co/browse/CDSEG-2778
@tag automator:juan_gabriel_zapata, informer:juan_esteban_restrepo, sprint:9
@Sprint 10



Scenario: 1 Validacion de campos en menu lateral de  poliza principal en cotizacion
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
| Edificios y Ubicaciones   |
| Modificadores             |

Examples:
| numSubscripcion | rolUsuario | estadouno | estadodos  |
| 33344336        | Asesor     | Visible   | No visible |



Scenario: 2 Validacion de campos en revision de poliza y cotizacion de  poliza principal

Given que estoy en la informacion de la poliza con numero de subscripcion <numSubscripcion>
When ingrese a la opcion revision de la poliza





















