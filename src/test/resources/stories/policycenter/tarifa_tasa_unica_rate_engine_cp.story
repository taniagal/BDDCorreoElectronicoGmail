Tarifa Tasa Unica Rate Engine CP
Meta:

@issue #CDSEG-3430
@sprint 8
@tag automator: nelson_jhair_mosquera_palacios

Narrative:
Como usuario de PolicyCenter
Quiero ser capaz de poder tarifar una póliza que este bajo el esquema de tarifa tasa única,
para los negocios que se definan bajo este esquema de tarifa ya que comercialemente se requiere tener una tarifa diferencial.


Scenario: Verificacion del motor de tarifa de multiriesgo corporativo.
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza:
|cuenta     |organizacion|producto               |canal            |
|C1060447895|Sura        |Multiriesgo corporativo|Canal Tradicional|