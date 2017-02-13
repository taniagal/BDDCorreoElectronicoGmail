Cotizacion PA Detalle

Meta:
@lote3
@issue #CDSEG-807
@tag equipo: 5
@local
@Sprint 3

Narrative:
Como usuario de policyCenter
Quiero poder solicitar una cotizacion
Asi ver los detalles de la cotizacion de una poliza de Autos por cada uno de los Riesgos (Vehiculos)

Scenario: Cotizacion y validacion que no se permite agregar mas de un vehiculo
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza:
|cuenta     |producto|tipoPoliza |
|C1060447895|Autos   |Individual |
When ingrese los datos del asegurado <tipo_documento> <documento>
And ingrese los datos del vehiculo:
|placa |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis|motor|valor_asegurado|descuento|recargo|zona|plan        |
|random|2016  |00601182        |MEDELLIN          |Particular       |null  |null |165900000      |null     |null   |2   |Plan Modular|
And ingrese las coberturas:
|limite|deducible|abogado|PLlaves|
|640.  |0        |Si     |Si     |
Then se debe mostrar en la columna "Termino" el limite o deducible de la cobertura en el caso de que aplique
And se debe mostrar en la columna "Termino" el limite de la cobertura en el caso de que aplique
And se debe mostrar en la columna "Termino" el deducible de la cobertura en el caso de que aplique
Examples:
|tipo_documento      |documento |
|CEDULA DE CIUDADANIA|1060447895|
