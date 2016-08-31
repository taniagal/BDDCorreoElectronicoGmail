Nueva Poliza Individual

Meta:

@issue #CDSEG-812
@Automatizador Eliana Alvarez
@Sprint 4

Narrative:
Como usuario de Policy Center
Quiero ser capaz de crear polizas colectivas e individuales
Para las diferentes organizaciones, canales y productos

Scenario: Validar elementos de la pantalla cuando voy a crear una poliza individual
GivenStories: stories/policycenter/login_policy.story
Given que voy a buscar la cuenta <numCuenta>
And quiero expedir una poliza nueva
And seleccione el agente <agente>
Then debo poder ver las listas de organizacion y canal, las opciones de individual y colectiva, la opcion individual
seleccionada por defecto
And la tabla de productos con los productos de Autos y Multiriesgo corporativo y los botones para elegir producto deshabilitados

Examples:
|numCuenta|agente|
|C000888888|DIRECTO|

Scenario: Validar la lista de organizaciones disponibles para crear una poliza nueva
Given que voy a buscar la cuenta <numCuenta>
And quiero expedir una poliza nueva
And seleccione el agente <agente>
When despliegue la lista de organizacion
Then me debe mostrar las organizaciones:
|organizacion|
|Bancolombia|
|Exito|
|GMAC|
|Sura|
|Tuya|

Examples:
|numCuenta|agente|
|C000888888|DIRECTO|

Scenario: validar tabla de productos de acuerdo al tipo de poliza, organizacion y canal
When seleccione la organizacion <organizacion>
And seleccione el canal <canal>
And seleccione tipo de poliza <tipoPoliza> de la nueva cotizacion
Then debo ver los productos <productos> para el tipo de poliza <tipoPoliza> seleccionado
And los botones de elegir producto deben estar habilitados

Examples:
|organizacion   |canal              |tipoPoliza|productos                    |
|Bancolombia    |Leasing            |Individual|Multiriesgo corporativo|
|Bancolombia    |Renting            |Individual|Multiriesgo corporativo|
|Bancolombia    |Sufi               |Individual|Multiriesgo corporativo|
|Bancolombia    |Televentas         |Individual|Autos,Multiriesgo corporativo|
|Exito          |Exito              |Individual|Autos,Multiriesgo corporativo|
|GMAC           |GMAC               |Individual|Autos,Multiriesgo corporativo|
|Sura           |Autos + Soat       |Individual|Autos,Multiriesgo corporativo|
|Sura           |Canal Tradicional  |Individual|Autos,Multiriesgo corporativo|
|Sura           |Televentas         |Individual|Autos,Multiriesgo corporativo|
|Sura           |Venta directa      |Individual|Autos,Multiriesgo corporativo|
|Tuya           |Tuya               |Individual|Multiriesgo corporativo|