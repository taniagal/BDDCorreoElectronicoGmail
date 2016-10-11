Tarifa Tasa Unica Cambio De Poliza

Meta:
@issue #CDSEG-2417
@sprint 8
@tag automator: nelson_jhair_mosquera_palacios
@local

Narrative:
Como usuario de PolicyCenter
Quiero ser capaz de poder modificar una póliza que este bajo el esquema de tarifa tasa única,
para los negocios que se definan bajo este esquema de tarifa ya que comercialemente se requiere tener una tarifa diferencial.

Scenario: Realizar una modificación de valor asegurado a una poliza
GivenStories: stories/policycenter/login_policy.story
Given que tengo una cotizacion <cotizacion>
When vaya a agregar el vehiculo con los datos:
|placa |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis |motor|valor_asegurado|descuento|recargo|zona|plan        |
|CVG987|2011  |01601225        |MEDELLIN          |Particular       |kljh456|null |17900000       |null     |null   |2   |Plan Modular|
And seleccione algunas coberturas:
|limite|deducible|abogado |PTH|PPH|PPHF|GTH|AC|AS                |Taller|Grua|CE|CS  |PTD|PPD|PPDF|GT|PP|PT|GTR     |GP      |
|32    |0        |Opción 1|10 |910|1.50|40.|35|Asistencia Clásica|Conces|Plus|6 |Plus|10 |0  |1.50|40|16|20|Opción 1|Opción 1|
Examples:
|cotizacion|
|22222365  |