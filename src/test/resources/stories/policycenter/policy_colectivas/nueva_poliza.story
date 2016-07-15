Nueva Poliza

Meta:

@issue #CDSEG-812 SUW USC Polizas Colectivas

Narrative:
Como usuario de Policy Center
Quiero ser capaz de crea una poliza colectiva
Para

Scenario: Validar la lista de organizaciones disponibles para crear una poliza nueva
GivenStories: stories/policycenter/login_policy.story
Given que voy a buscar la cuenta <numCuenta>
And quiero expedir una poliza nueva
And seleccione el agente <agente>
Then debo poder ver las listas de organizacion y canal, las opciones de individual y colectiva, la opcion individual
seleccionada por defecto, la tabla de productos con los productos de Autos y Multiriesgo corporativo y los botones
para elegir producto deshabilitados

Examples:
|numCuenta|agente|
|C000888888|DIRECTO|

Scenario: Validar la lista de organizaciones disponibles para crear una poliza nueva
When despliegue la lista de organizacion
Then me debe mostrar las organizaciones:
|organizacion|
|Bancolombia|
|Exito|
|GMAC|
|Sura|
|Tuya|

Scenario: Validar la lista canal cuando la organizacion
When seleccione la organizacion <organizacion>
And despliegue la lista canal
Then la lista de canal debe mostrar los siguientes datos <datosListaCanal>

Examples:
|organizacion|datosListaCanal|
|Bancolombia|Leasing,Renting,Sufi,Televentas|
|Exito|Exito|
|GMAC|GMAC|
|Sura|Autos + Soat,Canal Tradicional,Televentas,Venta directa|
|Tuya|Tuya|