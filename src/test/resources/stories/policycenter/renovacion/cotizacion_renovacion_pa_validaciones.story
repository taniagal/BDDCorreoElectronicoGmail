Meta:
@lote2
@issue #CDSEG-2295
@tag equipo: 5
@Sprint 7

Narrative:
Como usuario de policy center  con el perfil  X
Quiero poder realizar la cotizacion de la renovacion de una poliza de personal autos ya sea de forma manual o automatica

Scenario: Quote - Riesgos Consultables - Figuras Tomador, Asegurado y Beneficiario
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza basado en otro envio <envio>
And vaya a agregar el vehiculo con los datos:
|placa |modelo|codigo_fasecolda|ciudad_circulacion   |vehiculo_servicio|chasis |motor|valor_asegurado|descuento|recargo|zona|plan        |
|random|2011  |01601225        |MEDELLIN (ANTIOQUIA) |Particular       |kljh456|yui10|17900000       |null     |null   |2   |Plan Modular|
And seleccione algunas coberturas:
|limite|deducible|abogado |PTH|PPH|PPHF|GTH|AC|Taller|Grua|TM|CE|CS  |PTD|PPD|PPDF|GT|PP|PT|GTR|GP|PLlaves|
|640.  |0        |Si      |0  |750|1.50|40.|35|Conces|Plus|Si|6 |Plus|0  |750|1.50|40|20|20|Si |Si|Si     |
When expido la poliza y voy al archivo de poliza
And quiera realizar esta renovacion
And vaya a informacion de poliza en la renovacion
And adicione un segundo tomador en la renovacion el cual es riesgo consultable
|tipoDocumento        |numeroDocumento|
|CEDULA DE CIUDADANIA |1128391691     |
And cotice la renovacion
Then se debe bloquear la cotizacion y mostrar el mensaje que devuelve el servicio
|mensaje                                                                                                                                                                    |
|CARLOS ACEVEDO DUQUE, El tomador es un riesgo no estándar y no es posible gestionar la solicitud por este canal. Diríjase a análisis de riesgos para solicitar aprobación. |

Examples:
|envio   |
|22228589|

Scenario: Quote - Riesgos Consultables - Asegurado, Motor, Chasis y Placa
Meta:
@manual
Given renovando una poliza
When el asegurado, motor, chasis y/o placa sean Riesgo consultable bloqueante
Then se debe bloquear la cotizacion y mostrar el mensaje que devuelve el servicio
|mensaje                                                                                            |
|T64497, La placa es un riesgo no estándar y no es posible gestionar la solicitud por este canal.   |
|CH212121, El chasis es un riesgo no estándar y no es posible gestionar la solicitud por este canal.|
|AB3C2, El motor es un riesgo no estándar y no es posible gestionar la solicitud por este canal.    |
|FRANK RAMIREZ ALZATE, El asegurado es un riesgo no estándar y no es posible gestionar la solicitud por este canal.|

Examples:
||
||
