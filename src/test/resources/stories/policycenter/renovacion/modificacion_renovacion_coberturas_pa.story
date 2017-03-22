Meta:
@lote2
@tag equipo: 5
@local
@Sprint 7

Scenario: Editar transaccion - Coberturas
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza:
|cuenta     |producto|tipoPoliza |
|C1060447895|Autos   |Individual |
When ingrese los datos del asegurado <tipo_documento> <documento>
And ingrese los datos del vehiculo:
|placa |modelo|codigo_fasecolda|ciudad_circulacion    |vehiculo_servicio|chasis|motor|valor_asegurado|descuento|recargo|zona|plan        |medioVenta|
|random|2016  |00601182        |MEDELLIN (ANTIOQUIA)  |Particular       |null  |null |165900000      |null     |null   |2   |Plan Modular|Televentas|
And ingrese las coberturas basicas:
|limite|deducible|abogado|PLlaves|
|640.  |0        |Si     |Si     |
And intente cotizar
When expido la poliza y voy al archivo de poliza
And quiera realizar esta renovacion
And este en la pantalla de coberturas
Then se deben cargar todas las coberturas con las que venia la poliza
|danosTerceros   |responsabilidadCivil |limite     |deducible|
|Daños a Terceros|Responsabilidad Civil|640.000.000|0        |
And debo poder retirar una cobertura que es Opcional
And debo poder adicionar una nueva cobertura
And no debo poder retirar las coberturas obligatorias
And debo poder modificar los deducibles y limites tanto de las coberturas opcionales como obligatorias

Examples:
|tipo_documento      |documento |
|CEDULA DE CIUDADANIA|1060447895|


