Meta:
@issue #SUGWUSC-15127

Narrative:
Como usuario de policy center
Al cotizar una poliza de PA quiero ser capaz de registrar toda la información del vehiculo.


Scenario:  Verificar validacion de codigo facecolda erroneo
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza:
|cuenta    |organizacion|producto|canal            |
|C000888888|Sura        |Autos   |Canal Tradicional|
When agrege un vehiculo con codigo fasecolda <codigo> que no existe
Then debo ingresar un nuevo codigo

Examples:
|codigo|
|acb123|



Scenario:  Validar riesgo consultable para motor, placa o chasis
Given estoy cotizando una poliza:
|cuenta    |organizacion|producto|canal            |
|C000888888|Sura        |Autos   |Canal Tradicional|
When vaya a agregar un vehiculo con los datos:
|placa |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis   |motor|valor_asegurado|
|T64497|2011  |01601225        |MEDELLIN          |Particular       |CHAS63215|AB3C2|$17,900,000.00 |
Then deben aparecer los mensajes de validacion:
|mensaje                                                                                                                |
|Placa : La placa T64497, La placa es un riesgo no estandar y no es posible gestionar la solicitud por este canal.      |
|Chasis : El chasis CHAS63215, El chasis es un riesgo no estandar y no es posible gestionar la solicitud por este canal.|
|Motor : El motor AB3C2, El motor es un riesgo no estandar y no es posible gestionar la solicitud por este canal.       |

Examples:
||
||


Scenario:  Validar si el valor asegurado del vehiculo supera el tope maximo del valor permitido
Given estoy cotizando una poliza:
|cuenta    |organizacion|producto|canal            |
|C000888888|Sura        |Autos   |Canal Tradicional|
When vaya a agregar un vehiculo con los datos:
|placa |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis|motor|valor_asegurado|
|T64498|2017  |09403011        |MEDELLIN          |Particular       |null  |null |$830,000,000.00|
Then deben aparecer los mensajes de validacion:
|mensaje                                                                                                                                                                                                                                             |
|Valor asegurado : El valor asegurado del vehículo supera el límite máximo permitido por políticas. El aseguramiento de este carro así como la oferta presentada al cliente, deben ser avalados previamente por el Comité de Riesgo No Estándar Autos|

Examples:
||
||



Scenario:  Validar si el valor asegurado del vehiculo supera el tope minimo del valor permitido
Given estoy cotizando una poliza:
|cuenta    |organizacion|producto|canal            |
|C000888888|Sura        |Autos   |Canal Tradicional|
When vaya a agregar un vehiculo con los datos:
|placa |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis|motor|valor_asegurado|
|T64498|1993  |07015010        |MEDELLIN          |Particular       |null  |null |$1,400,000.00  |
Then deben aparecer los mensajes de validacion:
|mensaje                                                                                 |
|Valor asegurado : El valor del vehículo es inferior al tope mínimo. Por favor verifique.|

Examples:
||
||
