Meta:
@lote2
@tag equipo: 5
@Sprint 14

Narrative:
Como usuario de policy center en el rol de agente,csr, asegurador o gerente
Quiero poder imprimir o reimprimir los documentos que se generan luego de ejecutar una transaccion de poliza
Para una poliza de mrc

Scenario: Mostrar opcion de reimpresion en una submission-mrc
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza:
|cuenta    |producto               |
|C000112402|Multiriesgo corporativo|
When ingrese a edificios y ubicaciones
And intente ingresar una nueva ubicacion sin riesgo consultable
And intente ingresar las entradas de las diferentes coberturas
| TAB                      | TIPO_ARTICULO | OTRO_ARTICULO_OTROS | COBERTURA        | ENTRADAS                         | VALOR_ENTRADAS |
| Información de Artículos | Edificios     |                     |                  | Valor Reconstrucción             | 100000000      |
| Información de Artículos | Edificios     |                     | Danos materiales | Valor asegurado danos materiales | 100000000      |
And intente cotizar y expedir la poliza
And ingrese al resumen de la poliza expedida
And intente renovar la poliza
And ingrese a edificios y ubicaciones en renovacion de poliza
And intente ingresar una nueva ubicacion en renovacion de poliza
And intente cotizar y expedir la poliza
And ingrese al resumen de la poliza expedida
And vaya a la opcion transacciones de poliza
And cuando de click al boton reimprimir
Then me deben aparecer las opciones por las cuales puedo imprimir
|opciones                        |
|Caratula                        |
|Carta de relación con el cliente|
|Endoso                          |

Examples:
| rolUsuario | cedula  | tipoBeneficiario | tipodocumento        |
| Asesor     | 9876543 | Asegurado        | CEDULA DE CIUDADANIA |