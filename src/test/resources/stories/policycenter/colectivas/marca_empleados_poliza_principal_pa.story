Meta:
@tag equipo: 2
@lote3
@Sprint 14

Narrative:
Como usuario de PolicyCenter
Quiero poder marcar una poliza on la opcion de empleado SURA
Para identificar si es empleado de Sura y informarle a Billing


Scenario: 1 Poliza principal con marca de empleado SURA
GivenStories: stories/policycenter/login_policy.story
Given que tengo una cotizacion <cotizacion>
And copie la poliza
When seleccione la opcion SI de empleado sura
And cotice y expida la poliza
And ingrese al resumen de la poliza expedida
And ingrese a informacion de poliza en resumen de poliza
Then se debe mostrar en el campo empleado sura la opcion <opcion> no editable

Examples:
| cotizacion |opcion |
| 33335550   |Sí     |


Scenario: 2 Poliza principal sin marca de empleado SURA
Given que tengo una cotizacion <cotizacion>
And copie la poliza
When cotice y expida la poliza
And ingrese al resumen de la poliza expedida
And ingrese a informacion de poliza en resumen de poliza
Then se debe mostrar en el campo empleado sura la opcion <opcion> no editable
Examples:
| cotizacion |opcion |
| 33335550   |No     |



