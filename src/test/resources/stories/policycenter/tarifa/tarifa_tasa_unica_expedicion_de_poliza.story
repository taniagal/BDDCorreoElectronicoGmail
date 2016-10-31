Tarifa Tasa Unica Expedicion De Poliza

Meta: @lote2
@issue #CDSEG-2417
@sprint 8
@tag automator: nelson_jhair_mosquera_palacios

Narrative:
Como usuario de PolicyCenter
Quiero ser capaz de expedir una póliza que este bajo el esquema de tarifa tasa única,
para los negocios que se definan bajo este esquema de tarifa ya que comercialemente se requiere tener una tarifa diferencial.

Scenario: Expedicion de poliza con tarifa tasa unica
Given que tengo una cotizacion <cotizacion>
When vaya a agregar el vehiculo con los datos:
|placa |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis |motor|valor_asegurado|descuento|recargo|zona|plan        |
|random|2011  |01601225        |MEDELLIN          |Particular       |kljh456|yui10|17900000       |null     |null   |2   |Plan Modular|
And seleccione algunas coberturas:
|limite|deducible|abogado |PTH|PPH|PPHF|GTH|AC|AS                |PTD|PPD|PPDF|GT|GTR     |GP      |
|1.440 |0        |Opción 1|10 |910|1.50|40.|35|Asistencia Clásica|10 |0  |1.50|40|Opción 1|Opción 1|
And expido la poliza
Then debo poder verificar los datos de la poliza
Examples:
|cotizacion|
|22222365  |