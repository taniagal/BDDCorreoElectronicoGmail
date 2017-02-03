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
And ingrese los datos de vehiculo:
|placa |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis|motor|valor_asegurado|descuento|recargo|zona|plan        |
|random|2016  |00601182        |MEDELLIN          |Particular       |null  |null |165900000      |null     |null   |2   |Plan Modular|
And seleccione algunas coberturas:
|limite|deducible|abogado |PTH|PPH|PPHF|GTH|AC|Taller|Grua|TM|CE|CS  |PTD|PPD|PPDF|GT|PP|PT|GTR|GP|PLlaves|
|640.  |0        |Si      |0  |750|1.50|40.|35|Conces|Plus|Si|6 |Plus|0  |750|1.50|40|20|20|Si |Si|Si     |
When expido la poliza y voy al archivo de poliza
And quiera realizar esta renovacion
And este en la pantalla de coberturas
Then se deben cargar todas las coberturas con las que venia la poliza
|danosTerceros   |responsabilidadCivil |limite     |deducible|danosCarro    |danos |perdidaTotalDanos|perdidaParcialDanos|gastosTransporteD|hurtoCarro    |hurto|perdidaTotalHurto|gastosTransporteH|
|Daños a Terceros|Responsabilidad Civil|640.000.000|0        |Daños al Carro|Daños |0                |0                  |40.000/DIA (PT)  |Hurto al Carro|Hurto|0                |40.000/DIA (PT)  |
And debo poder retirar una cobertura que es Opcional
And debo poder adicionar una nueva cobertura
And no debo poder retirar las coberturas obligatorias
And debo poder modificar los deducibles y limites tanto de las coberturas opcionales como obligatorias

Examples:
|tipo_documento      |documento |
|CEDULA DE CIUDADANIA|1060447895|


