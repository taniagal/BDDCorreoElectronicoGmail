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
Examples:
|cotizacion|
|22222365  |