Cotizacion MRC

Meta:
@lote2
@issue #CDSEG-774
@tag automator: diego_cardona_acevedo
@local
@Sprint 3

Narrative:
Como usuario de Policy Center
Quiero porder solicitar una cotizacion
Asi ver los detalles de la cotizacion de una poliza MRC

Scenario: Cotizar una poliza MRC
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza:
|cuenta    |organizacion|producto               |canal            |
|C000112400|Sura        |Multiriesgo corporativo|Canal Tradicional|
When ingrese a edificios y ubicaciones
And intente ingresar una nueva ubicacion sin riesgo consultable
And intente ingresar las entradas de las diferentes coberturas
| TAB                      | TIPO_ARTICULO | OTRO_ARTICULO_OTROS | COBERTURA        | ENTRADAS                         | VALOR_ENTRADAS |
| Información de Artículos | Edificios     |                     |                  | Valor Reconstrucción             | 100000000      |
| Información de Artículos | Edificios     |                     | Danos materiales | Valor asegurado danos materiales | 100000000      |
And cotice una poliza
Then debo ver la informacion de la cotizacion
| tomador                      | tipoDocumento        | numeroDocumento | direccion                            | tipoDireccion           | descripcionDireccion                       | prima             | impuestos        | total             |
| ELIANA PAOLA MECHONES MADURO | CEDULA DE CIUDADANIA | 1235698740      | CR 65 # 48 - 162, MEDELLIN, Colombia | DIRECCION DE RESIDENCIA | Created by the Address Builder with code 0 | $124.000,00 (COP) | $19.840,00 (COP) | $143.840,00 (COP) |
And se muestre el detalle de la prima por riesgo

Examples:
||
||

Scenario: Cotizar una poliza MRC con un riesgo consultable bloqueante
Given estoy cotizando una poliza:
| cuenta     | organizacion | producto                | canal             |
| C000222333 | Sura         | Multiriesgo corporativo | Canal Tradicional |
When quiera agregar un tomador adicional que es riesgo consultable <cedula>
And ingrese a edificios y ubicaciones
And intente ingresar una nueva ubicacion sin riesgo consultable
And intente ingresar las entradas de las diferentes coberturas
| TAB                      | TIPO_ARTICULO | OTRO_ARTICULO_OTROS | COBERTURA        | ENTRADAS                         | VALOR_ENTRADAS |
| Información de Artículos | Edificios     |                     |                  | Valor Reconstrucción             | 100000000      |
| Información de Artículos | Edificios     |                     | Danos materiales | Valor asegurado danos materiales | 100000000      |
And cotice una poliza
Then no debe permitir cotizar; se debe mostrar el mensaje de respuesta <mensaje> que envie riesgos consultables

Examples:
| cedula  | cedulaPEP | mensaje                                                                              |
| 9876543 | 98499112  | El tomador es un riesgo no estándar y debe ser analizado por el Comité de Evaluación |

Scenario: validacion de exclusividad en la cotizacion
Given voy a crear una nueva cotizacion
And crear una cotizacion nueva con la cuenta <cuenta>
And seleccione el agente <agente>
When seleccione el producto <producto> para expedir la poliza
And ingrese a edificios y ubicaciones
And intente ingresar una nueva ubicacion sin riesgo consultable
And intente ingresar las entradas de las diferentes coberturas
| TAB                      | TIPO_ARTICULO | OTRO_ARTICULO_OTROS | COBERTURA        | ENTRADAS                         | VALOR_ENTRADAS |
| Información de Artículos | Edificios     |                     |                  | Valor Reconstrucción             | 100000000      |
| Información de Artículos | Edificios     |                     | Danos materiales | Valor asegurado danos materiales | 100000000      |
And cotice una poliza
And voy a crear una nueva cotizacion
And crear una cotizacion nueva con la cuenta <cuenta>
And seleccione el agente <agente>
And seleccione el producto <producto> para expedir la poliza
And ingrese a edificios y ubicaciones
And intente ingresar una nueva ubicacion sin riesgo consultable
And intente ingresar las entradas de las diferentes coberturas
| TAB                      | TIPO_ARTICULO | OTRO_ARTICULO_OTROS | COBERTURA        | ENTRADAS                         | VALOR_ENTRADAS |
| Información de Artículos | Edificios     |                     |                  | Valor Reconstrucción             | 100000000      |
| Información de Artículos | Edificios     |                     | Danos materiales | Valor asegurado danos materiales | 100000000      |
And cotice una poliza
Then no debe permitir cotizar; se debe mostrar el mensaje de error <mensaje>

Examples:
| cuenta     | producto                | agente  | mensaje                                                                             |
| C000112400 | Multiriesgo corporativo | DIRECTO | ya tiene una cotización en curso para el producto seleccionado para la oficina SURA |