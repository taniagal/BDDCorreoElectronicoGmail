Meta:
@lote1
@Sprint 6
@tag equipo: 4
@local

Narrative:
Como usuario de policy center
Deseo poder obtener y/o agregar la bonificacion comercial y la tecnica a un vehiculo durante una cotizacion

Scenario:  Obtener la bonificacion tecnica y comercial de un vehiculo
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza:
|cuenta      |producto|tipoPoliza |
|C1060447895 |Autos   |Individual |
When ingrese los datos del asegurado <tipo_documento> <documento>
And ingrese la placa <placa> en la informacion del vehiculo
Then se debe ver reflejada la bonificacion <bonoComercial> <bonoTecnico> de esta placa

Examples:
|placa |bonoComercial|bonoTecnico|tipo_documento      |documento |
|CYU123|0            |20         |CEDULA DE CIUDADANIA|1077567553|
