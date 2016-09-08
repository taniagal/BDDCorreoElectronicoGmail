Calculo Bonificacion

Meta:
@issue #CDSEG-1938
@Automatizador Nelson Mosquera
@Sprint 6

Narrative:
Como usuario de policy center
Deseo poder obtener y/o agregar la bonificacion comercial y la tecnica a un vehiculo durante una cotizacion

Scenario:  Agregar bonificacion a un vehiculo
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza:
|cuenta      |organizacion|producto|canal            |
|C1060447895 |Sura        |Autos   |Canal Tradicional|
When ingrese los datos del asegurado
And ingrese la placa <placa> en la informacion del vehiculo
Then se debe ver reflejada la bonificacion tecnica <bono> de esta placa



Examples:
|placa |bono|
|CYU123|45|


Scenario:  Agregar bonificacion a un vehiculo
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza:
|cuenta      |organizacion|producto|canal            |
|C1060447895 |Sura        |Autos   |Canal Tradicional|
When ingrese los datos del asegurado
And ingrese la placa <placa> en la informacion del vehiculo
Then se debe ver reflejada la bonificacion comercial <bono> de esta placa



Examples:
|placa |bono|
|CYU123|45|