Meta:
@lote2
@tag equipo: 5
@sprint 13

Narrative:
Como
I want to perform an action
So that I can achieve a business goal

Scenario: Validar informacion al declinar una poliza
GivenStories: stories/policycenter/login_policy.story
Given voy a cotizar una poliza de autos con la cuenta <cuenta>, agente <agente>, producto <producto>,
asegurado con tipo de documento <tipo_documento> y documento <documento>
When ingrese los datos del vehiculo:
|placa |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis|motor|valor_asegurado|descuento|recargo|zona|plan        |
|TYU130|2016  |00601182        |MEDELLIN          |Particular       |null  |null |165900000      |null     |null   |2   |Plan Modular|
And ingrese las coberturas basicas:
|limite|deducible|abogado |PLlaves |
|1.440 |0        |Opción 1|Opción 1|
And intente cotizar
And decline la transaccion
Then deben aparecer todas las razones de declinar poliza
|itemDeclinacion                                |
|Siniestros                                     |
|Cartera                                        |
|Sin respaldo de reaseguradores o coaseguradores|
|Riesgo no objetivo                             |
|No acuerdo de pago                             |

Examples:
|tipo_documento      |documento |cuenta     |producto|agente |
|CEDULA DE CIUDADANIA|71318883  |C000888888 |Autos   |DIRECTO|

Scenario: Validar informacion al no tomar una poliza
Given voy a cotizar una poliza de autos con la cuenta <cuenta>, agente <agente>, producto <producto>,
asegurado con tipo de documento <tipo_documento> y documento <documento>
When ingrese los datos del vehiculo:
|placa |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis|motor|valor_asegurado|descuento|recargo|zona|plan        |
|TYU131|2016  |00601182        |MEDELLIN          |Particular       |null  |null |165900000      |null     |null   |2   |Plan Modular|
And ingrese las coberturas basicas:
|limite|deducible|abogado |PLlaves |
|1.440 |0        |Opción 1|Opción 1|
And intente cotizar
And decida no tomar la poliza
Then deben aparecer todas las razones para no tomar la poliza
|itemsNoTomar                           |
|Precio y condiciones no satisfactorias |
|Se aseguró en otra compañia            |
|No acuerdo de pago                     |
|No cumple condiciones de licitación    |
|No acuerdo de pago                     |

Examples:
|tipo_documento      |documento |cuenta     |producto|agente |
|CEDULA DE CIUDADANIA|71318883  |C000888888 |Autos   |DIRECTO|