Meta:
@tag equipo: 1
@lote2
@Sprint 14

Narrative:
Como usuario de PolicyCenter
Quiero solicitar  requisitos  en una  poliza  colectiva, para CP Y PA
Para validar riesgos consultables y PEPS

Scenario: 1 Mensaje de alerta para tomador riesgo consultable
GivenStories: stories/policycenter/login_policy.story
Given que estoy en la informacion de la poliza con numero de subscripcion <numSubscripcion>
And copie la poliza
When quiera agregar un tomador adicional que es riesgo consultable <tipo_documento> <documento>
And cotice una poliza
Then se deben validar los riesgos consultables mostrando los siguientes mensaje por cada una de las figuras
| MENSAJES_WORKSPACE                    |
| El tomador es un riesgo no estándar   |



Examples:
| numSubscripcion | tipo_documento       | documento |
| 33344336        | CEDULA DE CIUDADANIA | 9876543   |


Scenario: 2 Mensaje de alerta para tomador PEPS
Given que estoy en la informacion de la poliza con numero de subscripcion <numSubscripcion>
And copie la poliza
When quiera agregar un tomador adicional que es riesgo consultable <tipo_documento> <documento>
And cotice una poliza
And llegue a la expedicion de la poliza
Then se deben validar los riesgos consultables mostrando los siguientes mensaje por cada una de las figuras
| MENSAJES_WORKSPACE                    |
| El tomador(a) CAROLINA OCHOA con DNI C71318883 es PEP (Persona públicamente expuesta) y es necesario tramitar el caso con su director o gerente.|

Examples:
| numSubscripcion | tipo_documento       | documento  |                                                                                                                                        |
| 33344336        | CEDULA DE CIUDADANIA | 71318883   |


Scenario: 3 Mensaje de alerta para tomador que requiere sarlaft
Given que estoy en la informacion de la poliza con numero de subscripcion <numSubscripcion>
And copie la poliza
When adicione un segundo tomador <tipoDocumento>, <primerNombre>, <primerApellido>
And cotice una poliza
And llegue a la expedicion de la poliza
And vaya a la opcion de analisis de riesgo
Then debo ver un UW issue que indique que se requiere diligenciar Sarlaft
|mensaje|
|Para el contacto CAROLINA OCHOA con número de documento 71318883 se requiere que diligencie el Sarlaft; ingrese aquí para diligenciarlo.|
And se deben validar los riesgos consultables mostrando los siguientes mensaje por cada una de las figuras
| MENSAJES_WORKSPACE                    |
| El contacto CAROLINA OCHOA con DNI C71318883 requiere sarlaft, diríjase a análisis de riesgo para diligenciarlo.|

Examples:
| numSubscripcion | tipoDocumento        | primerNombre  | primerApellido |                                                                                                                                      |
| 33335550        | CEDULA DE CIUDADANIA | CAROLINA      | OCHOA          |


