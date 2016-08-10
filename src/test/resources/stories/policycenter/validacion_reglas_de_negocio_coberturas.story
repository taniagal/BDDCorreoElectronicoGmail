Meta:

@issue #SUGWUSC-11480

Narrative:
Como usuario de policy center
quiero ser capaz de parametrizar diferentes reglas de negocio para
algunas coberturas de multiriesgo corporativo.

Scenario: Validacion regla de negocio cuando el valor es menor al 10%
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza de MRC en cuenta <cuenta>
When seleccione la organizacion <organizacion>
And seleccione el canal <canal>
And seleccione el producto <producto> para expedir la poliza
And agregue cada una de las ubicaciones
And agregue una nueva ubicacion departamento <departamento>, ciuad <ciudad>, direccion <direccion>
And Agregue los articulos correspondientes a la ubicacion
Then debe permitir pasar a la siguinete pagina


Examples:
|cuenta     |organizacion|canal            |producto               |departamento|ciudad  |direccion        |descripcion  |actividad|
|C001888888 |Sura        |Canal Tradicional|Multiriesgo corporativo|Antioquia   |Medellin|CR 44 A # 45 - 00|Edificio Core|Acabado de productos textiles|
