Meta:

Narrative:
Como usuario de negocio
Quiero que se levante el requisito de sarlaft de en el pub Visual de requisitos
y habilitar el boton de Sarlaft para cada figura diferente (Tomador, asegurado  y beneficiario en el caso de que este sea gratiuto)

Scenario: Habilitar opcion Sarlaft en expedicion - Tomador
GivenStories: stories/policycenter/login_policy.story
Given existe una cotizacion <numeroCotizacion>
When intente expedir la poliza cuyas figuras requieran Sarlaft
And vaya a la opcion de analisis de riesgo
Then debo ver un UW issue que indique que se requiere diligenciar Sarlaft
|mensaje|
|Para el contacto ANTONIO RESTREPO con número de documento 71123456 se requiere que diligencie el Sarlaft, para diligenciarlo por favor ingrese.|

Examples:
|numeroCotizacion|
|22222228        |

Scenario: Habilitar opcion Sarlaft en modificacion - Tomador
Given existe una cotizacion <numeroCotizacion>
When intente expedir la modificacion cuyas figuras requieran Sarlaft
And vaya a la opcion de analisis de riesgo
Then debo ver un UW issue que indique que se requiere diligenciar Sarlaft en modificacion
|mensaje|
|Para el contacto ANTONIO RESTREPO con número de documento 71123456 se requiere que diligencie el Sarlaft, para diligenciarlo por favor ingrese.|

Examples:
|numeroCotizacion|
|55570000        |