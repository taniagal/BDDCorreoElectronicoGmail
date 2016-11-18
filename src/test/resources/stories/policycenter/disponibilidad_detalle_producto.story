Disponibilidad Detalle Producto

Meta: @lote3

@issue #CDSEG-745
@tag automator: eliana_alvarez, sprint:1
@Sprint 1

Narrative:
Como usuario de policy center
quiero poder configurar el modelo del producto teniendo en cuenta los canales de distribución
para que se muestren las coberturas, terminos y opciones segun la disponibilidad

Scenario: Validar la organizacion, el canal y el tipo de poliza cuando el producto es Autos
Meta: @manual @lote3
Given que voy a buscar la cuenta <numCuenta> para poliza individual
And quiero expedir una poliza nueva
And seleccione el agente <agente>
When seleccione el producto <producto> para expedir la poliza
And seleccione la opcion informacion de poliza
Then debo ver la organizacion <infoOrganizacion> seleccionada
And debor ver el canal <infoCanal> seleccionado
And debo ver el tipo de poliza <infoTipoPoliza> seleccionado


Examples:
| numCuenta  | agente  | producto | infoTipoPoliza | infoOrganizacion | infoCanal         |
| C000888888 | DIRECTO | Autos    | PPAutos        | Bancolombia      | Televentas        |

Scenario: Validar la organizacion, el canal y el tipo de poliza cuando el producto es Autos para las diferentes combinaciones
Meta: @manual @lote3
Given que voy a buscar la cuenta <numCuenta> para poliza individual
And quiero expedir una poliza nueva
And seleccione el agente <agente>
When seleccione el producto <producto> para expedir la poliza
And seleccione la opcion informacion de poliza
Then debo ver la organizacion <infoOrganizacion> seleccionada
And debor ver el canal <infoCanal> seleccionado
And debo ver el tipo de poliza <infoTipoPoliza> seleccionado

Examples:
| numCuenta  | agente  | organizacion | canal             | producto | infoTipoPoliza | infoOrganizacion | infoCanal         |
| C000888888 | DIRECTO | Exito        | Exito             | Autos    | PPAutos        | Exito            | Exito             |
| C000888888 | DIRECTO | GMAC         | GMAC              | Autos    | PPAutos        | GMAC             | GMAC              |
| C000888888 | DIRECTO | Sura         | Autos + Soat      | Autos    | PPAutos        | Sura             | Autos + Soat      |
| C000888888 | DIRECTO | Sura         | Canal Tradicional | Autos    | PPAutos        | Sura             | Canal Tradicional |
| C000888888 | DIRECTO | Sura         | Televentas        | Autos    | PPAutos        | Sura             | Televentas        |