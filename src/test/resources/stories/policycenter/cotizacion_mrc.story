Meta:
@lote4
@issue #CDSEG-774
@tag equipo: 5
@Sprint 3

Narrative:
Como usuario de Policy Center
Quiero porder solicitar una cotizacion
Asi ver los detalles de la cotizacion de una poliza MRC

Scenario: Cotizar una poliza MRC con un riesgo consultable bloqueante
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza:
| cuenta     | producto                |
| C000112400 | Multiriesgo corporativo |
When quiera agregar un tomador adicional que es riesgo consultable <tipo_documento> <documento>
And agregue una nueva ubicacion:
|departamento|ciudad  |direccion        |descripcion    |actividad                        |
|Antioquia   |Medellin|CR 44 A # 43 - 02|Core de Seguros|Actividades de agencias de empleo|
And seleccione algunos articulos y sus cobertura:
|articulo |valor_asegurable|coberturas|
|Building |100000000       |Danos     |
And cotice el articulo
Then no debe permitir cotizar; se debe mostrar el mensaje de respuesta <mensaje> que envie riesgos consultables
Examples:
| tipo_documento       | documento | cedulaPEP | mensaje                                                                              |
| CEDULA DE CIUDADANIA | 9876543   | 98499112  | El tomador es un riesgo no estándar y debe ser analizado por el Comité de Evaluación |


Scenario: validacion de exclusividad en la cotizacion
Given voy a crear una nueva cotizacion
And crear una cotizacion nueva con la cuenta <cuenta>
And seleccione el agente y la oficina de radicacion:
| oficina | agente_oficina |
| 1105    | DIRECTO        |
When seleccione el producto <producto> para expedir la poliza
And agregue una nueva ubicacion:
|departamento|ciudad  |direccion        |descripcion    |actividad                        |
|Antioquia   |Medellin|CR 44 A # 43 - 03|Core de Seguros|Actividades de agencias de empleo|
And seleccione algunos articulos y sus cobertura:
|articulo |valor_asegurable|coberturas|
|Building |100000000       |Danos     |
And cotice el articulo
Then no debe permitir cotizar; se debe mostrar el mensaje de error <mensaje>

Examples:
| cuenta     | producto                | mensaje                                                                             |
| C000112400 | Multiriesgo corporativo | ya tiene una cotización en curso para el producto seleccionado para la oficina SURA |