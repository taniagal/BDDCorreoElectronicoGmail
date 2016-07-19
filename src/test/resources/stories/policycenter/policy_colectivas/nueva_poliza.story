Nueva Poliza

Meta:

@issue #CDSEG-812 SUW USC Polizas Colectivas

Narrative:
Como usuario de Policy Center
Quiero ser capaz de crear polizas colectivas e individuales
Para las diferentes organizaciones, canales y productos

Scenario: Validar la lista de organizaciones disponibles para crear una poliza nueva
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
And la tabla de productos con los productos de Autos y Multiriesgo corporativo y los botones para elegir producto deshabilitados

Examples:
|organizacion|datosListaCanal|
|Bancolombia|Leasing,Renting,Sufi,Televentas|
|Exito|Exito|
|GMAC|GMAC|
|Sura|Autos + Soat,Canal Tradicional,Televentas,Venta directa|
|Tuya|Tuya|

Scenario: validar tabla de productos de acuerdo al tipo de poliza, organizacion y canal
When seleccione la organizacion <organizacion>
And seleccione el canal <canal>
And seleccione tipo de poliza <tipoPoliza> de la nueva cotizacion
Then debo ver los productos <productos> para el tipo de poliza <tipoPoliza> seleccionado
And los botones de elegir producto deben estar habilitados

Examples:
|organizacion   |canal              |tipoPoliza|productos                    |
|Bancolombia    |Leasing            |Individual|Autos,Multiriesgo corporativo|
|Bancolombia    |Renting            |Individual|Autos,Multiriesgo corporativo|
|Bancolombia    |Sufi               |Individual|Autos,Multiriesgo corporativo|
|Bancolombia    |Televentas         |Individual|Autos,Multiriesgo corporativo|
|Exito          |Exito              |Individual|Autos,Multiriesgo corporativo|
|GMAC           |GMAC               |Individual|Autos,Multiriesgo corporativo|
|Sura           |Autos + Soat       |Individual|Autos,Multiriesgo corporativo|
|Sura           |Canal Tradicional  |Individual|Autos,Multiriesgo corporativo|
|Sura           |Televentas         |Individual|Autos,Multiriesgo corporativo|
|Sura           |Venta directa      |Individual|Autos,Multiriesgo corporativo|
|Tuya           |Tuya               |Individual|Autos,Multiriesgo corporativo|
|Bancolombia    |Leasing            |Colectiva |Bank Autos                   |
|Bancolombia    |Renting            |Colectiva |Commercial Personal Fleet    |
|Bancolombia    |Sufi               |Colectiva |Bank Autos                   |
|Sura           |Canal Tradicional  |Colectiva |Commercial Fleet,Commercial Personal Fleet|
|Tuya           |Tuya               |Colectiva |Bank Autos                   |

Scenario: validar tabla de productos vacia cuando la organizacion y el canal no puede expedir
When seleccione la organizacion <organizacion>
And seleccione el canal <canal>
And seleccione tipo de poliza <tipoPoliza> de la nueva cotizacion
Then no debe mostrar la lista de productos

Examples:
|organizacion   |canal              |tipoPoliza|
|Bancolombia    |Televentas         |Colectiva |
|Exito          |Exito              |Colectiva |
|GMAC           |GMAC               |Colectiva |
|Sura           |Autos + Soat       |Colectiva |
|Sura           |Televentas         |Colectiva |
|Sura           |Venta directa      |Colectiva |