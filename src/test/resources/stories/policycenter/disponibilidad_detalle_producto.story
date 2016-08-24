Disponibilidad Detalle Producto

Meta:

@issue #CDSEG-745
@Automatizador Eliana Alvarez
@Sprint 1

Narrative:
Como usuario de policy center
quiero poder configurar el modelo del producto teniendo en cuenta los canales de distribución
para que se muestren las coberturas, terminos y opciones segun la disponibilidad

Scenario: Validar la organizacion, el canal y el tipo de poliza cuando el producto es Autos
GivenStories: stories/policycenter/login_policy.story
Given que voy a buscar la cuenta <numCuenta>
And quiero expedir una poliza nueva
And seleccione el agente <agente>
When seleccione la organizacion <organizacion>
And seleccione el canal <canal>
And seleccione tipo de poliza <tipoPoliza> de la nueva cotizacion
And seleccione el producto <producto> para expedir la poliza
And seleccione la opcion informacion de poliza
Then debo ver la organizacion <infoOrganizacion> seleccionada
And debor ver el canal <infoCanal> seleccionado
And debo ver el tipo de poliza <infoTipoPoliza> seleccionado


Examples:
| numCuenta  | agente  | organizacion | canal      | tipoPoliza | producto | infoTipoPoliza | infoOrganizacion | infoCanal         |
| C000888888 | DIRECTO | Bancolombia  | Televentas | Individual | Autos    | PPAutos        | Bancolombia      | Televentas        |

Scenario: Validar la organizacion, el canal y el tipo de poliza cuando el producto es Autos para las diferentes combinaciones
Given que voy a buscar la cuenta <numCuenta>
And quiero expedir una poliza nueva
And seleccione el agente <agente>
When seleccione la organizacion <organizacion>
And seleccione el canal <canal>
And seleccione tipo de poliza <tipoPoliza> de la nueva cotizacion
And seleccione el producto <producto> para expedir la poliza
And seleccione la opcion informacion de poliza
Then debo ver la organizacion <infoOrganizacion> seleccionada
And debor ver el canal <infoCanal> seleccionado
And debo ver el tipo de poliza <infoTipoPoliza> seleccionado

Examples:
| numCuenta  | agente  | organizacion | canal             | tipoPoliza | producto | infoTipoPoliza | infoOrganizacion | infoCanal         |
| C000888888 | DIRECTO | Exito        | Exito             | Individual | Autos    | PPAutos        | Exito            | Exito             |
| C000888888 | DIRECTO | GMAC         | GMAC              | Individual | Autos    | PPAutos        | GMAC             | GMAC              |
| C000888888 | DIRECTO | Sura         | Autos + Soat      | Individual | Autos    | PPAutos        | Sura             | Autos + Soat      |
| C000888888 | DIRECTO | Sura         | Canal Tradicional | Individual | Autos    | PPAutos        | Sura             | Canal Tradicional |
| C000888888 | DIRECTO | Sura         | Televentas        | Individual | Autos    | PPAutos        | Sura             | Televentas        |