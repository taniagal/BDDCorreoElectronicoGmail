Validaciones Informacion De Vehiculo

Meta: @lote4
@tag automator: nelson_jhair_mosquera_palacios
@local
@issue #CDSEG-1013
@sprint 3

@issue #CDSEG-3354
@sprint 7

Narrative:
En este story no se contemplan explicitamente los escenarios de la histoia "SUGW_USC-Planes" "issue #CDSEG-3354"
pero a nivel de codificacion se realizó la modificacion para evaluar el correcto funcionamiento de los criterios
de aceptacion expresados en la HU.

Como usuario de policyCenter
Al cotizar una poliza de PA quiero ser capaz de registrar toda la información del vehiculo.

Como usuario de PolicyCenter
Quiero ser capaz de poder seleccionar los diferentes planes que existen en autos, para poder cotizar o expedir de acuerdo a las necesidades del cliente.


Scenario:  Verificar validacion de codigo facecolda erroneo
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza:
|cuenta    |organizacion|producto|canal            |
|C000222333|Sura        |Autos   |Canal Tradicional|
When agrege un vehiculo con codigo fasecolda <codigo> que no existe
Then deben aparecer los mensajes de validacion:
|mensaje                                                                                                                |
|El código fasecolda no existe. Por favor verifique|

Examples:
|codigo|
|acb123|


Scenario:  Validar si el valor asegurado del vehiculo supera el tope maximo del valor permitido
Given estoy cotizando una poliza:
|cuenta    |organizacion|producto|canal            |
|C000222333|Sura        |Autos   |Canal Tradicional|
When vaya a agregar un vehiculo con los datos:
|placa |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis|motor|valor_asegurado|descuento|recargo|zona|plan             |
|T64493|2017  |09403011        |MEDELLIN          |Particular       |null  |null |830000000      |null     |null   |2   |Plan Autos Básico|
And voy a realizar el siguiente paso
Then deben aparecer los mensajes de validacion:
|mensaje                                                                                           |
|El valor asegurado del vehículo ($830.000.000,00) supera el límite máximo permitido por políticas.|

Examples:
||
||



Scenario:  Validar si el valor asegurado del vehiculo supera el tope minimo del valor permitido
Given estoy cotizando una poliza:
|cuenta    |organizacion|producto|canal            |
|C000222333|Sura        |Autos   |Canal Tradicional|
When vaya a agregar un vehiculo con los datos:
|placa |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis|motor|valor_asegurado|descuento|recargo|zona|plan             |
|T64413|1993  |07015010        |MEDELLIN          |Particular       |null  |null |1400000        |null     |null   |2   |Plan Autos Básico|
And voy a realizar el siguiente paso
Then deben aparecer los mensajes de validacion:
|mensaje                                                               |
|El valor del vehículo es inferior al tope mínimo. Por favor verifique.|

Examples:
||
||
