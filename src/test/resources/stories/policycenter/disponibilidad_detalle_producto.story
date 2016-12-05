Disponibilidad Detalle Producto

Meta: @lote3

@issue #CDSEG-745
@tag automator: eliana_alvarez, sprint:1
@Sprint 1

Narrative:
Como usuario de policy center
quiero poder configurar el modelo del producto teniendo en cuenta los canales de distribución
para que se muestren las coberturas, terminos y opciones segun la disponibilidad

Scenario: Validar la organizacion cuando el producto es Autos
Meta:
@manual
Given estoy cotizando una poliza:
|cuenta    |organizacion|producto|canal            |
|C000888888|Sura        |Autos   |Canal Tradicional|
When   seleccione la opcion informacion de poliza
Then  debo ver la organizacion la siguiente lista de organizaciones:
|Bancolombia    |
|Exito          |
|GMAC           |
|Sura           |
|Tuya           |


Examples:
| numCuenta  | agente  | producto |
| C000888888 | DIRECTO | Autos    |

Scenario: Validar la el canal cuando se selecciona una organizacion especifica cuando el producto es Autos
Meta:
@manual
Given estoy cotizando una poliza:
|cuenta    |organizacion|producto|canal            |
|C000888888|Sura        |Autos   |Canal Tradicional|
When   seleccione la opcion informacion de poliza
And  seleccione la organizacion:
|Bancolombia    |
|Exito          |
|GMAC           |
|Sura           |
|Tuya           |
Then debo ver los canales:
|Leasing    |Exito  |GMAC   |Autos + Soat       |Tuya   |
|Renting    |       |       |Canal Tradicional  |       |
|Sufi       |       |       |Televentas         |       |
|Telesales  |       |       |Venta Directa      |       |


Examples:
| numCuenta  | agente  | producto |
| C000888888 | DIRECTO | Autos    |

Scenario: Validar la el canal cuando se selecciona una organizacion especifica cuando el producto es Autos
Meta:
@manual
Given estoy cotizando una poliza:
|cuenta    |organizacion|producto|canal            |
|C000888888|Sura        |Autos   |Canal Tradicional|
When   seleccione la opcion informacion de poliza
And  seleccione la organizacion:
|Bancolombia    |
|Exito          |
|GMAC           |
|Sura           |
|Tuya           |
And seleccione el canal:
|Leasing    |Exito  |GMAC   |Autos + Soat       |Tuya   |
|Renting    |       |       |Canal Tradicional  |       |
|Sufi       |       |       |Televentas         |       |
|Telesales  |       |       |Venta Directa      |       |
Then debo ver el tipo de poliza <tipoPoliza>

Examples:
| numCuenta  | agente  | producto |tipoPoliza   |
| C000888888 | DIRECTO | Autos    |PPAutos      |


Scenario: Validar la organizacion, el canal y el tipo de poliza cuando el producto es Autos para las diferentes combinaciones
Meta:
@manual
Given estoy cotizando una poliza:
|cuenta    |organizacion|producto|canal            |
|C000888888|Sura        |Autos   |Canal Tradicional|
When   seleccione la opcion informacion de poliza
Then  debo ver la organizacion <infoOrganizacion> seleccionada
And   debor ver el canal <infoCanal> seleccionado
And   debo ver el tipo de poliza <infoTipoPoliza> seleccionado

Examples:
| numCuenta  | agente  | organizacion | canal             | producto | infoTipoPoliza | infoOrganizacion | infoCanal         |
| C000888888 | DIRECTO | Exito        | Exito             | Autos    | PPAutos        | Exito            | Exito             |
| C000888888 | DIRECTO | GMAC         | GMAC              | Autos    | PPAutos        | GMAC             | GMAC              |
| C000888888 | DIRECTO | Sura         | Autos + Soat      | Autos    | PPAutos        | Sura             | Autos + Soat      |
| C000888888 | DIRECTO | Sura         | Canal Tradicional | Autos    | PPAutos        | Sura             | Canal Tradicional |
| C000888888 | DIRECTO | Sura         | Televentas        | Autos    | PPAutos        | Sura             | Televentas        |
