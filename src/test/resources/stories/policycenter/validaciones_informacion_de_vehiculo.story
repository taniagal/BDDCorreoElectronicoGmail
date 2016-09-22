Validaciones Informacion De Vehiculo

Meta:
@issue #CDSEG-1013
@sprint 3
@tag automator: nelson_jhair_mosquera_palacios
@local

Narrative:
Como usuario de policy center
Al cotizar una poliza de PA quiero ser capaz de registrar toda la información del vehiculo.



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


Scenario:  Validar riesgo consultable para motor, placa o chasis
Given estoy cotizando una poliza:
|cuenta    |organizacion|producto|canal            |
|C000222333|Sura        |Autos   |Canal Tradicional|
When vaya a agregar un vehiculo con los datos:
|placa |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis   |motor|valor_asegurado|descuento|recargo|zona|
|T64497|2016  |00601182        |MEDELLIN          |Particular       |CH212121 |AB3C2|165900000      |null     |null   |2|
And voy a realizar el siguiente paso
Then deben aparecer los mensajes de validacion:
|mensaje                                                                                                                |
|T64497, La placa es un riesgo no estándar y no es posible gestionar la solicitud por este canal.     |
|CH212121, El chasis es un riesgo no estándar y no es posible gestionar la solicitud por este canal. |
|AB3C2, El motor es un riesgo no estándar y no es posible gestionar la solicitud por este canal.      |
And debe permitir continuar la cotizacion

Examples:
||
||


Scenario:  Validar si el valor asegurado del vehiculo supera el tope maximo del valor permitido
Given estoy cotizando una poliza:
|cuenta    |organizacion|producto|canal            |
|C000222333|Sura        |Autos   |Canal Tradicional|
When vaya a agregar un vehiculo con los datos:
|placa |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis|motor|valor_asegurado|descuento|recargo|zona|
|T64493|2017  |09403011        |MEDELLIN          |Particular       |null  |null |830000000      |null     |null   |2   |
And voy a realizar el siguiente paso
Then deben aparecer los mensajes de validacion:
|mensaje                                                                                                                                                                                                                                                               |
|Valor asegurado : El valor asegurado del vehículo ($830.000.000,00) supera el límite máximo permitido por políticas. El aseguramiento de este carro así como la oferta presentada al cliente, deben ser avalados previamente por el Comité de Riesgo No Estándar Autos|

Examples:
||
||



Scenario:  Validar si el valor asegurado del vehiculo supera el tope minimo del valor permitido
Given estoy cotizando una poliza:
|cuenta    |organizacion|producto|canal            |
|C000222333|Sura        |Autos   |Canal Tradicional|
When vaya a agregar un vehiculo con los datos:
|placa |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis|motor|valor_asegurado|descuento|recargo|zona|
|T64413|1993  |07015010        |MEDELLIN          |Particular       |null  |null |1400000        |null     |null   |2   |
And voy a realizar el siguiente paso
Then deben aparecer los mensajes de validacion:
|mensaje                                                                                               |
|Valor asegurado : El valor del vehículo ($1.400.000,00) es inferior al tope mínimo. Por favor verifique.|

Examples:
||
||
