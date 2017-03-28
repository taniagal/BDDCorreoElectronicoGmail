Meta:
@lote2
@tag equipo: 5, sprint: 15

Narrative:
Como usuario de policy center
Quiero que al momento de realizar la expedicion automatica no se apliquen polizas de multiriesgos
Para poder hacer un estudio y negociacion de cada poliza multiriesgo

Scenario: Renovacion Manual Instrucciones Previas a las renovacion
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
And desee seleccionar instrucciones previas a la renovacion
And diligencie las instrucciones previas a renovacion
|instruccion |razonNoRenovacion|nivelSeguridad       |Texto                   |
|No renovable|Aspectos técnicos|Solo para uso interno|Aceptacion Instrucciones|
And intente renovar la poliza
And continue con la renovacion
And cotice la renovacion
And emita la renovacion
And acepto la expedicion de poliza
Then debo obtener un mensaje UW
|mensaje                                                                                       |
|La póliza tiene instrucción(es) previa(s) a la renovación, requiere autarización de renovación|

Examples:
||
||