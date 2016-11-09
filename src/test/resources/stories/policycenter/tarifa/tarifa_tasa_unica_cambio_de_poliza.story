Tarifa Tasa Unica Cambio De Poliza

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

Scenario: Realizar una modificacion de datos de asegurado, beneficiario a una poliza
GivenStories: stories/policycenter/tarifa/tarifa_tasa_unica_expedicion_de_poliza.story
Given que tengo una poliza expedida
When realize una modificacion en los de datos del aseguradocon los datos nombre <primer_nombre> <segundo_nombre>, estado civil <estado_civil>
Then se debe tarifar con el esquema de tasa unica, sin generar cobro o devolucion de prima

Examples:
|primer_nombre|segundo_nombre|estado_civil|
|Miguel       |Felipe        |CASADO      |



Scenario: Realizar una modificacion de valor asegurado a una poliza con tarifa tasa unica
GivenStories: stories/policycenter/tarifa/tarifa_tasa_unica_expedicion_de_poliza.story
Given que tengo una poliza expedida
When realize una modificacion en el valor asegurado <valor_asegurado>
Then se debe tarifar con el esquema de tasa unica, generando cobro o devolucion de prima

Examples:
|valor_asegurado|
|20000000       |
