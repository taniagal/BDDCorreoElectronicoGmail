Calculo Bonificacion Comercial

Meta:
@issue #CDSEG-1938
@Automatizador Nelson Mosquera
@Sprint 5

Narrative:
Como usuario de policy center
Deseo poder agregar la bonificacion comercial a un vehiculo durante una cotizacion

Scenario:  Agregar bonificacion comercial a un vehiculo
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza:
|cuenta    |organizacion|producto|canal            |
|C000222333|Sura        |Autos   |Canal Tradicional|
When ingrese los datos del asegurado
And ingrese los datos del vehiculo:
|placa |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis|motor|valor_asegurado|descuento|recargo|
|T91025|2016  |00601182        |MEDELLIN          |Particular       |null  |null |$165,900,000.00|null     |null   |

Examples:
||
||