Meta:
@lote1
@issue #CDSEG-7045
@tag equipo: 5
@Sprint 15

Narrative:
Como usuario de policy center en el rol de agente,csr, asegurador o gerente
Quiero poder modificar el tomador principal de una poliza
Para la solucion de multiriesgo corporativo

Scenario: Validar cambio de tomador mrc
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza:
|cuenta    |producto               |
|C000777776|Multiriesgo corporativo|
When ingrese a edificios y ubicaciones
And intente ingresar una nueva ubicacion sin riesgo consultable
And intente ingresar las entradas de las diferentes coberturas
| TAB                      | TIPO_ARTICULO | OTRO_ARTICULO_OTROS | COBERTURA        | ENTRADAS                         | VALOR_ENTRADAS |
| Información de Artículos | Edificios     |                     |                  | Valor Reconstrucción             | 100000000      |
| Información de Artículos | Edificios     |                     | Danos materiales | Valor asegurado danos materiales | 100000000      |
And intente cotizar y expedir la poliza
And ingrese al resumen de la poliza expedida
And cuando intente cambiar informacion de la poliza MRC
Then debe estar disposible el boton cambiar tomador con las opciones por las cuales puedo cambiarlo:
|opciones              |
|Nuevo Persona Jurídica|
|Nuevo Persona Natural |
|Del Directorio        |
|Contacto existente    |

Examples:
||
||

Scenario: Cambiar el tomador a principal a uno peps para validar mensaje
Given estoy cotizando una poliza:
|cuenta    |producto               |
|C000777776|Multiriesgo corporativo|
When ingrese a edificios y ubicaciones
And intente ingresar una nueva ubicacion sin riesgo consultable
And intente ingresar las entradas de las diferentes coberturas
| TAB                      | TIPO_ARTICULO | OTRO_ARTICULO_OTROS | COBERTURA        | ENTRADAS                         | VALOR_ENTRADAS |
| Información de Artículos | Edificios     |                     |                  | Valor Reconstrucción             | 100000000      |
| Información de Artículos | Edificios     |                     | Danos materiales | Valor asegurado danos materiales | 100000000      |
And intente cotizar y expedir la poliza
And ingrese al resumen de la poliza expedida
And cuando intente cambiar informacion de la poliza MRC
And quiera cambiar el tomador principal por uno existente que es pep con <numeroDocumento> y <tipoDocumento>
And cotice una poliza
And intente expedir la poliza
And confirmo el mensaje de expedir poliza
Then se debe mostrar un mensaje indicando que el tomador principal es pep
|mensaje                                                                                                                                                                                                    |
|El tomador(a) CAROLINA OCHOA con DNI C71318883 es PEP (Persona públicamente expuesta) y es necesario tramitar el caso con su director o gerente. |
Examples:
|numeroDocumento|tipoDocumento       |
|71318883       |CEDULA DE CIUDADANIA|

Scenario: Cambiar el tomador a principal a uno riesgo consultable para validar mensaje
Given estoy cotizando una poliza:
|cuenta    |producto               |
|C000777776|Multiriesgo corporativo|
When ingrese a edificios y ubicaciones
And intente ingresar una nueva ubicacion sin riesgo consultable
And intente ingresar las entradas de las diferentes coberturas
| TAB                      | TIPO_ARTICULO | OTRO_ARTICULO_OTROS | COBERTURA        | ENTRADAS                         | VALOR_ENTRADAS |
| Información de Artículos | Edificios     |                     |                  | Valor Reconstrucción             | 100000000      |
| Información de Artículos | Edificios     |                     | Danos materiales | Valor asegurado danos materiales | 100000000      |
And intente cotizar y expedir la poliza
And ingrese al resumen de la poliza expedida
And cuando intente cambiar informacion de la poliza MRC
And quiera cambiar el tomador principal por uno existente que es pep con <numeroDocumento> y <tipoDocumento>
And cotice una poliza
Then se debe mostrar un mensaje indicando que el tomador principal es riesgo consultable
|mensaje                                                                                                                                                                                                                          |
|JOSE PAEZ ALZATE, El tomador es un riesgo no estándar y debe ser analizado por el Comité de Evaluación, por favor tramite el caso con el Gerente o Director Comercial. Diríjase a análisis de riesgos para solicitar aprobación. |
Examples:
|numeroDocumento|tipoDocumento       |
|9876543        |CEDULA DE CIUDADANIA|






