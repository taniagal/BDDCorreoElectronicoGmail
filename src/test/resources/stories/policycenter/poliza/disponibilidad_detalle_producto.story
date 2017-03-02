Disponibilidad Detalle Producto

Meta: @lote3

@issue #CDSEG-745
@tag equipo: 1, sprint:1
@Sprint 1

Narrative:
Como usuario de policy center
quiero poder configurar el modelo del producto teniendo en cuenta los canales de distribución
para que se muestren las coberturas, terminos y opciones segun la disponibilidad

Scenario: Validar la organizacion cuando el producto es Autos
Meta:
@manual
Given que voy a buscar la cuenta <numCuenta> para poliza individual
And   quiero expedir una poliza nueva
And seleccione el agente y la oficina de radicacion:
| oficina | agente_oficina  |
| 1105    | DIRECTO |
When  seleccione el producto <producto> para expedir la poliza
And   seleccione la opcion informacion de poliza
Then  debo ver la organizacion la siguiente lista de organizaciones:
|Bancolombia    |
|Exito          |
|GMAC           |
|Sura           |
|Tuya           |


Examples:
| numCuenta  |agente_oficina| producto |
| C000888888 | DIRECTO | Autos    |

Scenario: Validar la el canal cuando se selecciona una organizacion especifica cuando el producto es Autos
Meta:
@manual
Given  que voy a buscar la cuenta <numCuenta> para poliza individual
And   quiero expedir una poliza nueva
And seleccione el agente y la oficina de radicacion:
| oficina | agente_oficina  |
| 1105    | DIRECTO |
When  seleccione el producto <producto> para expedir la poliza
And  seleccione la opcion informacion de poliza
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
| numCuenta  |agente_oficina| producto |
| C000888888 | DIRECTO | Autos    |

Scenario: Validar la el canal cuando se selecciona una organizacion especifica cuando el producto es Autos
Meta:
@manual
Given  que voy a buscar la cuenta <numCuenta> para poliza individual
And   quiero expedir una poliza nueva
And seleccione el agente y la oficina de radicacion:
| oficina | agente_oficina  |
| 1105    | DIRECTO |
When  seleccione el producto <producto> para expedir la poliza
And   seleccione la opcion informacion de poliza
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
| numCuenta  |agente_oficina| producto |tipoPoliza   |
| C000888888 | DIRECTO | Autos    |Individual      |


Scenario: Validar la organizacion, el canal y el tipo de poliza cuando el producto es Autos para las diferentes combinaciones
Meta:
@manual
Given que voy a buscar la cuenta <numCuenta> para poliza individual
And   quiero expedir una poliza nueva
And seleccione el agente y la oficina de radicacion:
| oficina | agente_oficina  |
| 1105    | DIRECTO |
When  seleccione el producto <producto> para expedir la poliza
And   seleccione la opcion informacion de poliza
Then  debo ver la organizacion <infoOrganizacion> seleccionada
And   debor ver el canal <infoCanal> seleccionado
And   debo ver el tipo de poliza <infoTipoPoliza> seleccionado

Examples:
| numCuenta  |agente_oficina| organizacion | canal             | producto | infoTipoPoliza | infoOrganizacion | infoCanal         |
| C000888888 | DIRECTO | Exito        | Exito             | Autos    | Individual        | Exito            | Exito             |
| C000888888 | DIRECTO | GMAC         | GMAC              | Autos    | Individual        | GMAC             | GMAC              |
| C000888888 | DIRECTO | Sura         | Autos + Soat      | Autos    | Individual        | Sura             | Autos + Soat      |
| C000888888 | DIRECTO | Sura         | Canal Tradicional | Autos    | Individual        | Sura             | Canal Tradicional |
| C000888888 | DIRECTO | Sura         | Televentas        | Autos    | Individual        | Sura             | Televentas        |
