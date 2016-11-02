Tarifa Tasa Unica Pa Cargar Archivo
Meta: @lote3
@issue #CDSEG-2415
@tag automator: nelson_jhair_mosquera_palacios
@sprint 6

Narrative:
Como usuario de policy center
Deseo poder realizar la carga del archivo de tasa unica para la cotizacion de un vehiculo

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
Meta: @lote3 @manual
Given estoy realizando una cotizacion
When Cuando se vaya a realizar la carga del archivo
Then se debe poder exportar la estructura del archivo para luego ser cargada

Examples:
||
||


Scenario: Cargar archivo de tasas - importar
Meta: @lote3 @manual
Given estoy realizando una cotizacion
When Cuando se vaya a realizar la carga del archivo
Then se debe poder cargar el archivo donde se tienen definidas las tasas para la poliza

Examples:
||
||
