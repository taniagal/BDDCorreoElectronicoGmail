Tarifa Tasa Unica Renovacion

Meta: @lote4
@issue #CDSEG-2417
@sprint 8
@tag automator: nelson_jhair_mosquera_palacios
@local

Narrative:
Como usuario de PolicyCenter
Quiero ser capaz de poder renovar una póliza que este bajo el esquema de tarifa tasa única,
para los negocios que se definan bajo este esquema de tarifa ya que comercialemente se requiere tener una tarifa diferencial

Scenario: Realizar una modificacion de datos de asegurado, beneficiario a una poliza
GivenStories: stories/policycenter/tarifa/tarifa_tasa_unica_expedicion_de_poliza.story
Given que tengo una poliza expedida
When realize la renovacion de una poliza
Then se debe tarifar con el esquema de tasa unica, generando el valor de la prima

Examples:
|primer_nombre|segundo_nombre|estado_civil|
|Miguel       |Felipe        |CASADO      |