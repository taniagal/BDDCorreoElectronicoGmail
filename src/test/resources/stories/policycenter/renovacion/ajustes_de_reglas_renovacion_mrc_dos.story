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


Scenario: Renovacion Reaseguro Especial Reaseguro Aceptado
Given estoy cotizando una poliza:
|cuenta    |producto               |agente_oficina|
|C000888888|Multiriesgo corporativo|DIRECTO       |
When seleccione la poliza como reaseguro especial
And diligencie los campos de reaseguro aceptado
|comision|deposito|impuesto|transferencia|
|100     |100     |100     |100          |
And ingresa el asegurado <opcionAgregar>
And ingrese a buscar contacto del directorio con tipo de documento <tipoId> y numero de documento <numeroId>
And seleccione el contacto a agregar
And ingrese a edificios y ubicaciones
And intente ingresar una nueva ubicacion sin riesgo consultable
And intente ingresar las entradas de las diferentes coberturas
| TAB                      | TIPO_ARTICULO | OTRO_ARTICULO_OTROS | COBERTURA        | ENTRADAS                         | VALOR_ENTRADAS |
| Información de Artículos | Edificios     |                     |                  | Valor Reconstrucción             | 100000000      |
| Información de Artículos | Edificios     |                     | Danos materiales | Valor asegurado danos materiales | 100000000      |
And intente cotizar y expedir la poliza
And ingrese a analisis de riesgo
And realice la aprobacion especial
And acepto la expedicion de poliza
And acepto la expedicion de poliza
And expido la poliza
And ingrese al resumen de la poliza expedida
And intente renovar la poliza
And continue con la renovacion
And cotice la renovacion
And acepto la expedicion de poliza
And descarte cambios
And cotice la renovacion
And emita la renovacion
And acepto la expedicion de poliza
Then debo obtener un mensaje UW
|mensajeUno                                                              |mensajeDos                                                              |
|La póliza tiene reaseguro especial, requiere autorización de renovación.|La póliza tiene reaseguro aceptado, requiere autorización de renovación.|

Examples:
|tipoId              |numeroId  |opcionAgregar |mensaje                                                                                       |
|CEDULA DE CIUDADANIA|1234567890|Del Directorio|La póliza tiene instrucción(es) previa(s) a la renovación, requiere autarización de renovación|