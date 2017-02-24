Cotizacion De Poliza

Meta:
@lote3
@issue #CDSEG-843
@tag equipo: 5
@local
@Sprint 3

Narrative:
Como usuario de Policy Center
debo poder realizar una cotizacion
para comenzar un proceso de expedicion con un cliente en caso de ser posible

Scenario:  Realizar una cotizacion con deseo de financiacion
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza:
|cuenta     |producto|tipoPoliza |
|C1060447895|Autos   |Individual    |
When indique que deseo financiar la poliza
And indique el numero de cuotas
And seleccione la opcion siguiente
And se muestre el mensaje <mensaje> de advertencia de financiacion
And ingrese los datos del asegurado <tipo_documento> <documento>
And ingrese los datos del vehiculo:
|placa |modelo|codigo_fasecolda|ciudad_circulacion   |vehiculo_servicio|chasis|motor|valor_asegurado|descuento|recargo|zona|plan        |
|TAU105|2016  |00601182        |MEDELLIN (ANTIOQUIA) |Particular       |null  |null |165900000      |null     |null   |2   |Plan Modular|
And ingrese las coberturas basicas:
|limite|deducible|abogado|PLlaves|
|640.  |0        |Si     |Si     |
And intente cotizar
Then se debe mostrar un mensaje <mensaje> como advertencia
And realizar la cotizacion
And se debe mostrar en el detalle de la cotizacion el Valor por cuota a pagar <valorCuota> y
el numero de cotas <numeroCuotas> indicadas en la informacion de la poliza

Examples:
|tipo_documento      |documento |valorCuota |numeroCuotas|mensaje |
|CEDULA DE CIUDADANIA|1060447895|$101.620,00|11          |La financiación de la póliza está sujeta a aprobación por parte del área de financiación.|

Scenario: Riesgos consultables - Tipo Causal Tecnica
Meta: @manual
Given  he realizado la cotizacion
When  ingrese a la cotizacion
And  el tipo de causal es TECNICA, el tipo de riesgo CHASIS, MOTOR Y/O PLACA
Then  no se debe permitir continuar con la cotizacion y mostrar un mensaje

Scenario: Riesgos consultables - Tipo Causal Moral
Meta: @manual
Given  he realizado la cotizacion
When  ingrese a la cotizacion
And  el tipo de causal es MORAL, el tipo de riesgo CHASIS, MOTOR Y/O PLACA
Then  no se debe permitir continuar con la cotizacion y mostrar un mensaje
