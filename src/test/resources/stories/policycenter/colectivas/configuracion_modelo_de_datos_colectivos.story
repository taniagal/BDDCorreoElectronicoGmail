Configuracion Modelo De Datos Colectivos

Meta:
@lote3
@sprint 10
@tag equipo: 4
@local

Narrative:
Como usuario de PolicyCenter
Quiero ser capaz de aplicar a la tarifa los modificadores que se encuentran a nivel de la póliza y a nivel de riesgo.

Scenario: Verificar informacion de poliza colectiva PA  con tipo de facturacion grupal
GivenStories: stories/policycenter/login_policy.story
Given que tengo una cotizacion <cotizacion>
When copie la poliza
And ingrese a la informacion de la poliza
Then se deben ver los nuevos campos agregados con sus estados iniciales respectivos <tipo_facturacion>

Examples:
|cotizacion|tipo_facturacion|
|33333336  |Grupal          |


Scenario: Verificar informacion de poliza PA con tipo de facturacion por riesgo
Given que tengo una cotizacion <cotizacion>
When ingrese a la informacion de la poliza
Then se deben ver los nuevos campos agregados con sus estados iniciales respectivos para el tipo de facturacion <tipo_facturacion>

Examples:
|cotizacion|tipo_facturacion|
|33333337  |Por riesgo      |