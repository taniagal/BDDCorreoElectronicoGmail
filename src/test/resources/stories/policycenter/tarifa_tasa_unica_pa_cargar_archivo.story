Meta:

Narrative:
As a user
I want to perform an action
So that I can achieve a business goal

Scenario: Validacion de los elementos de exportacion e importacion del archivo de tasa unica
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza:
|cuenta    |organizacion|producto|canal            |
|C000222333|Sura        |Autos   |Canal Tradicional|
When vaya a cargar el archivo con las tasas
Then me deben aparecer las opciones de exportar el archivo
And las de importar el archivo

Examples:
||
||


Scenario: Cargar archivo de tasas - exportar
Meta: @manual
Given estoy realizando una cotizacion
When Cuando se vaya a realizar la carga del archivo
Then se debe poder exportar la estructura del archivo para luego ser cargada

Examples:
||
||


Scenario: Cargar archivo de tasas - importar
Meta: @manual
Given estoy realizando una cotizacion
When Cuando se vaya a realizar la carga del archivo
Then se debe poder cargar el archivo donde se tienen definidas las tasas para la poliza

Examples:
||
||
