Modificacion Renovacion Coberturas Pa

Meta:
@lote2
@issue #CDSEG-2977
@tag automator: diego_cardona_acevedo
@local
@Sprint 7

Scenario: Editar transaccion - Coberturas
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza basado en otro envio <envio>
And vaya a agregar el vehiculo con los datos:
|placa |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis |motor|valor_asegurado|descuento|recargo|zona|plan        |
|random|2011  |01601225        |MEDELLIN          |Particular       |kljh456|yui10|17900000       |null     |null   |2   |Plan Modular|
And seleccione algunas coberturas:
|limite|deducible|abogado |PTH|PPH|PPHF|GTH|AC|AS                |PTD|PPD|PPDF|GT|PP|PT|GTR     |GP      |PLlaves |
|1.440 |0        |Opción 1|10 |910|1.50|40.|35|Asistencia Clásica|10 |0  |1.50|40|16|20|Opción 1|Opción 1|Opción 1|
When expido la poliza y voy al archivo de poliza
And quiera realizar esta renovacion
And este en la pantalla de coberturas
Then se deben cargar todas las coberturas con las que venia la poliza
|danosTerceros   |responsabilidadCivil |limite       |deducible|danosCarro    |danos |perdidaTotalDanos|perdidaParcialDanos|gastosTransporteD|hurtoCarro    |hurto|perdidaTotalHurto|gastosTransporteH|
|Daños a Terceros|Responsabilidad Civil|1.440.000.000|0        |Daños al Carro|Daños |10%              |0                  |40.000/DIA (PT)  |Hurto al Carro|Hurto|10%              |40.000/DIA (PT)  |
And debo poder retirar una cobertura que es Opcional
And debo poder adicionar una nueva cobertura
And no debo poder retirar las coberturas obligatorias
And debo poder modificar los deducibles y limites tanto de las coberturas opcionales como obligatorias

Examples:
|envio   |
|22228589|


