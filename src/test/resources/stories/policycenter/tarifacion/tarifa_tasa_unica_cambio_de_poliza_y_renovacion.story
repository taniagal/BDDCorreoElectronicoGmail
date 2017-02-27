Meta:
@lote1
@sprint 8
@tag equipo: 4
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
Given estoy cotizando una poliza basado en otro envio <envio>
And vaya a agregar el vehiculo con los datos:
|placa |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis |motor|valor_asegurado|descuento|recargo|zona|plan        |medioVenta|
|random|2011  |01601225        |MEDELLIN          |Particular       |kljh456|yui10|17900000       |null     |null   |2   |Plan Modular|Televentas|
And seleccione algunas coberturas:
|limite|deducible|abogado |PTH|PPH|PPHF|GTH|AC|PTD|PPD|PPDF|GT|PP|PT|GTR|GP|PLlaves|AS                |
|640.  |0        |Si      |0  |750|1.50|40.|35|0  |750|1.50|40|20|20|Si |Si|Si     |Asistencia Clásica|
And expido la poliza y voy a informacion de poliza expedida
When realize una modificacion en los de datos del aseguradocon los datos nombre <primer_nombre> <segundo_nombre>, estado civil <estado_civil>
Then se debe tarifar con el esquema de tasa unica, sin generar cobro o devolucion de prima

Examples:
|primer_nombre|segundo_nombre|estado_civil|envio   |
|Miguel       |Felipe        |CASADO      |22228589|



Scenario: Realizar una modificacion de valor asegurado a una poliza con tarifa tasa unica
Given estoy cotizando una poliza basado en otro envio <envio>
And vaya a agregar el vehiculo con los datos:
|placa |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis |motor|valor_asegurado|descuento|recargo|zona|plan        |
|random|2011  |01601225        |MEDELLIN          |Particular       |kljh456|yui10|17900000       |null     |null   |2   |Plan Modular|
And seleccione algunas coberturas:
|limite|deducible|abogado |PTH|PPH|PPHF|GTH|AC|PTD|PPD|PPDF|GT|PP|PT|GTR|GP|PLlaves|AS                |
|640.  |0        |Si      |0  |750|1.50|40.|35|0  |750|1.50|40|20|20|Si |Si|Si     |Asistencia Clásica|
And expido la poliza y voy a informacion de poliza expedida
When realize una modificacion en el valor asegurado <valor_asegurado>
Then se debe tarifar con el esquema de tasa unica, generando cobro o devolucion de prima

Examples:
|valor_asegurado|envio   |
|20000000       |22228589|


Scenario: Realizar la renovacion de una poliza con tarifa tasa unica
Given estoy cotizando una poliza basado en otro envio <envio>
And vaya a agregar el vehiculo con los datos:
|placa |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis |motor|valor_asegurado|descuento|recargo|zona|plan        |
|random|2011  |01601225        |MEDELLIN          |Particular       |kljh456|yui10|17900000       |null     |null   |2   |Plan Modular|
And seleccione algunas coberturas:
|limite|deducible|abogado |PTH|PPH|PPHF|GTH|AC|PTD|PPD|PPDF|GT|PP|PT|GTR|GP|PLlaves|AS                |
|640.  |0        |Si      |0  |750|1.50|40.|35|0  |750|1.50|40|20|20|Si |Si|Si     |Asistencia Clásica|
And expido la poliza y voy a informacion de poliza expedida
When realize la renovacion de una poliza
Then se debe tarifar con el esquema de tasa unica, generando el valor de la prima

Examples:
|envio   |
|22228589|
