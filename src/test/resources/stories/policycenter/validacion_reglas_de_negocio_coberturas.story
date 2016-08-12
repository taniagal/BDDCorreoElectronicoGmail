Meta:

@issue #SUGWUSC-11480

Narrative:
Como usuario de policy center
quiero ser capaz de parametrizar diferentes reglas de negocio para
algunas coberturas de multiriesgo corporativo.

Scenario: Validacion regla de negocio cuando el valor es mayor al 10%
GivenStories: stories/policycenter/login_policy.story
Given se ha realizado la cotizacion MRC <cotizacion>
When seleccione la organizacion <organizacion>
And seleccione el canal <canal>
And seleccione el producto <producto> para expedir la poliza
And agregue cada una de las ubicaciones
Then se debe mostrar un mensaje <mensaje> de advertencia y pasar a la siguinete pagina


Examples:
|cuenta     |organizacion|canal            |producto               |mensaje|
|C001888888 |Sura        |Canal Tradicional|Multiriesgo corporativo|debe ser menor o igual al 10% del valor asegurable total de todos los artículos de la póliza|


Scenario: Validacion regla de negocio cuando el valor es menor al 10%
Given se ha realizado la cotizacion MRC <cotizacion>
When seleccione la organizacion <organizacion>
And seleccione el canal <canal>
And seleccione el producto <producto> para expedir la poliza
And agregue cada una de las ubicaciones
Then debe permitir pasar a la siguinete pagina

Examples:
|cuenta     |organizacion|canal            |producto               |
|C001888888 |Sura        |Canal Tradicional|Multiriesgo corporativo|
