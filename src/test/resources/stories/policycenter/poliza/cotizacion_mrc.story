Meta:
@lote2
@issue #CDSEG-774
@tag equipo: 5, sprint: 3

Narrative:
Como usuario de Policy Center
Quiero porder solicitar una cotizacion
Asi ver los detalles de la cotizacion de una poliza MRC

Scenario: Cotizar una poliza MRC
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza:
| cuenta     | producto                |
| C000112400 | Multiriesgo corporativo |
When ingrese a edificios y ubicaciones
And intente ingresar una nueva ubicacion sin riesgo consultable
And intente ingresar las entradas de las diferentes coberturas
| TAB                      | TIPO_ARTICULO | OTRO_ARTICULO_OTROS | COBERTURA        | ENTRADAS                         | VALOR_ENTRADAS |
| Información de Artículos | Edificios     |                     |                  | Valor Reconstrucción             | 100000000      |
| Información de Artículos | Edificios     |                     | Danos materiales | Valor asegurado danos materiales | 100000000      |
And cotice una poliza
Then debo ver la informacion de la cotizacion
| tomador                      | tipoDocumento        | numeroDocumento | direccion                            | tipoDireccion           | descripcionDireccion                       | prima          | impuestos     | total          |
| ELIANA PAOLA MECHONES MADURO | CEDULA DE CIUDADANIA | 1235698740      | CR 65 # 48 - 162, MEDELLIN, Colombia | DIRECCION DE RESIDENCIA | Created by the Address Builder with code 0 | $124.000 (COP) | $23.560 (COP) | $147.560 (COP) |
And se muestre el detalle de la prima por riesgo

Examples:
|  |
|  |


Scenario: Cotizar una poliza MRC con un riesgo consultable bloqueante
Given estoy cotizando una poliza:
| cuenta     | producto                |
| C000222333 | Multiriesgo corporativo |
When quiera agregar un tomador adicional que es riesgo consultable <tipo_documento> <documento>
And ingrese a edificios y ubicaciones
And intente ingresar una nueva ubicacion sin riesgo consultable
And intente ingresar las entradas de las diferentes coberturas
| TAB                      | TIPO_ARTICULO | OTRO_ARTICULO_OTROS | COBERTURA        | ENTRADAS                         | VALOR_ENTRADAS |
| Información de Artículos | Edificios     |                     |                  | Valor Reconstrucción             | 100000000      |
| Información de Artículos | Edificios     |                     | Danos materiales | Valor asegurado danos materiales | 100000000      |
And cotice una poliza
Then no debe permitir cotizar; se debe mostrar el mensaje de respuesta <mensaje> que envie riesgos consultables

Examples:
| tipo_documento       | documento | cedulaPEP | mensaje                                                                              |
| CEDULA DE CIUDADANIA | 9876543   | 98499112  | El tomador es un riesgo no estándar y debe ser analizado por el Comité de Evaluación |