Tarifa Tasa Unica Cambio De Poliza Y Renovacion

Meta:
@lote2
@issue #CDSEG-2417
@sprint 8
@tag automator: nelson_jhair_mosquera_palacios
@local

Narrative:
Como usuario de PolicyCenter
Quiero ser capaz de poder modificar una póliza que este bajo el esquema de tarifa tasa única,
para los negocios que se definan bajo este esquema de tarifa ya que comercialemente se requiere tener una tarifa diferencial.

Como usuario de PolicyCenter
Quiero ser capaz de poder renovar una póliza que este bajo el esquema de tarifa tasa única,
para los negocios que se definan bajo este esquema de tarifa ya que comercialemente se requiere tener una tarifa diferencial


Scenario: Realizar una modificacion de datos de asegurado, beneficiario a una poliza
GivenStories: stories/policycenter/login_policy.story
Given que tengo una cotizacion <cotizacion>
And vaya a agregar el vehiculo con los datos:
|placa |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis |motor|valor_asegurado|descuento|recargo|zona|plan        |
|random|2011  |01601225        |MEDELLIN          |Particular       |kljh456|yui10|17900000       |null     |null   |2   |Plan Modular|
And seleccione algunas coberturas:
|limite|deducible|abogado |PTH|PPH|PPHF|GTH|AC|AS                |PTD|PPD|PPDF|GT|PP|PT|GTR     |GP      |PLlaves |
|1.440 |0        |Opción 1|10 |910|1.50|40.|35|Asistencia Clásica|10 |0  |1.50|40|16|20|Opción 1|Opción 1|Opción 1|
And expido la poliza
When realize una modificacion en los de datos del aseguradocon los datos nombre <primer_nombre> <segundo_nombre>, estado civil <estado_civil>
Then se debe tarifar con el esquema de tasa unica, sin generar cobro o devolucion de prima

Examples:
|primer_nombre|segundo_nombre|estado_civil|cotizacion|
|Miguel       |Felipe        |CASADO      |22222365  |



Scenario: Realizar una modificacion de valor asegurado a una poliza con tarifa tasa unica
Given que tengo una cotizacion <cotizacion>
And vaya a agregar el vehiculo con los datos:
|placa |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis |motor|valor_asegurado|descuento|recargo|zona|plan        |
|random|2011  |01601225        |MEDELLIN          |Particular       |kljh456|yui10|17900000       |null     |null   |2   |Plan Modular|
And seleccione algunas coberturas:
|limite|deducible|abogado |PTH|PPH|PPHF|GTH|AC|AS                |PTD|PPD|PPDF|GT|PP|PT|GTR     |GP      |PLlaves |
|1.440 |0        |Opción 1|10 |910|1.50|40.|35|Asistencia Clásica|10 |0  |1.50|40|16|20|Opción 1|Opción 1|Opción 1|
And expido la poliza
When realize una modificacion en el valor asegurado <valor_asegurado>
Then se debe tarifar con el esquema de tasa unica, generando cobro o devolucion de prima

Examples:
|valor_asegurado|cotizacion|
|20000000       |22222365  |


Scenario: Realizar la renovacion de una poliza con tarifa tasa unica
Given que tengo una cotizacion <cotizacion>
And vaya a agregar el vehiculo con los datos:
|placa |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis |motor|valor_asegurado|descuento|recargo|zona|plan        |
|random|2011  |01601225        |MEDELLIN          |Particular       |kljh456|yui10|17900000       |null     |null   |2   |Plan Modular|
And seleccione algunas coberturas:
|limite|deducible|abogado |PTH|PPH|PPHF|GTH|AC|AS                |PTD|PPD|PPDF|GT|PP|PT|GTR     |GP      |PLlaves |
|1.440 |0        |Opción 1|10 |910|1.50|40.|35|Asistencia Clásica|10 |0  |1.50|40|16|20|Opción 1|Opción 1|Opción 1|
And expido la poliza
When realize la renovacion de una poliza
Then se debe tarifar con el esquema de tasa unica, generando el valor de la prima

Examples:
|cotizacion|
|22222365  |
