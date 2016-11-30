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


Scenario: 2 Validacion de campos en menu lateral de poliza riesgo
Given que estoy en la informacion de la poliza con numero de subscripcion <numSubscripcion>
When ingrese a la opcion informacion de poliza
Then deben estar en estado <estadouno> las siguientes opciones
| OPCIONES_MENU   |
| Formularios     |
| Pago            |
| Notas           |
| Documento       |
| Participantes   |
| Plan de trabajo |
| Historial       |


Examples:
| numSubscripcion | rolUsuario | estadouno  |
| 33355336        | Asesor     | Visible    |


