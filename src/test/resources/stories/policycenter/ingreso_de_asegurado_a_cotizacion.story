Agregar informacion de asegurados a la cotizacion

Meta:

Narrative:
Como usuario de PolicyCenter
Quiero poder ingresar la información de uno o varios asegurados
Para agregarlos a la cotizacion

@Issue 15114 Driver Details

Scenario: Agregar asegurado
GivenStories: stories/policycenter/login_policy.story
Given voy a ingresar un nuevo asegurado a una cotizacion con la cuenta <cuenta>
And crear una cotizacion nueva
When quiera agregar un asegurado
Then Se debe mostrar las opciones:
|agregar|
|Nuevo|
|Del Directorio|
|Contactos de la cuenta|

Examples:
|cuenta|
|C000888888|