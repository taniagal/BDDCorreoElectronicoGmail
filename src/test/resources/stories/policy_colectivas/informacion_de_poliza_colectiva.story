Informacion De Poliza Colectiva

Meta:

@issue #CDSEG-862

Narrative:
Como usuario de Policy Center
Quiero ser capaz de crear polizas colectivas e individuales
Para las diferentes organizaciones, canales y productos

Scenario: Validar la informacion de poliza colectiva de acuerdo a las opciones seleccionadas y el anio de fin de vigencia para el producto Commercial Fleet
GivenStories: stories/policycenter/login_policy.story
Given que voy a buscar la cuenta <numCuenta>
And quiero expedir una poliza nueva
And seleccione el agente <agente>
When seleccione la organizacion <organizacion>
And seleccione el canal <canal>
And seleccione tipo de poliza <tipoPoliza> de la nueva cotizacion
And seleccione el producto <producto> de poliza colectiva para expedirla
Then debo ver los siguiente campos en la pantalla con su respectiva informacion:
| titulo                             | tomadorInfo | tipoDocumento        | numeroDocumento | nombre                        | telefono | tipoDireccion | descripcionDir                                                                                          | direccionDePoliza | detallePoliza         | organizacion | canal             | tipoPoliza      | tipoPlazo | fechaInicioVigencia | fechaFin | fechaExp   | polizaFinanciadaSi | polizaFinanciadaNo | oficina | codAgente   | descuentoPoliza | agregarCoaseguro  |
| Información de la póliza colectiva | Tomador     | CEDULA DE CIUDADANIA | 1234567890      | YURLEDYS PAOLA GALLEGO TORRES | 4082211  | Vivienda      | CRA 65 # 48-162, Floor 0000, Developer Unit Habitation Cube #0000, LOUISVILLE, KY 40207, Estados Unidos | Cambiar a:        | Detalles de la póliza | Sura         | Canal Tradicional | CommercialFleet | Otra      | 07/26/2016          |          | 07/26/2016 | Sí                 | No                 | SURA    | 4999DIRECTO |                 | Agregar coaseguro |
And debo ver el anio de fin de vigencia <cantidadAniosVigencia> calculado de acuerdo al producto seleccionado

Examples:
| numCuenta  | agente  | organizacion | canal             | tipoPoliza | producto         | cantidadAniosVigencia |
| C000888888 | DIRECTO | Sura         | Canal Tradicional | Colectiva  | Commercial Fleet | 1                     |


Scenario: Validar la fecha de fin de vigencia del producto de autos
Given que voy a buscar la cuenta <numCuenta>
And quiero expedir una poliza nueva
And seleccione el agente <agente>
When seleccione la organizacion <organizacion>
And seleccione el canal <canal>
And seleccione tipo de poliza <tipoPoliza> de la nueva cotizacion
And seleccione el producto <producto> de poliza colectiva para expedirla
Then debo ver el anio de fin de vigencia <cantidadAniosVigencia> calculado de acuerdo al producto seleccionado

Examples:
| numCuenta  | agente  | organizacion | canal             | tipoPoliza | producto         | cantidadAniosVigencia |
| C000888888 | DIRECTO | Bancolombia  | Leasing           | Colectiva  | Bank Autos       | 5                     |

Scenario: Validar cuando se cambia fecha inicio de vigencia se recalcula la fecha de fin vigencia correctamente

Scenario: Validar retroactividad en la vigencia de la poliza colectiva

Scenario: Validar datos de tomador secundario en poliza colectiva

Scenario: validar descuento mayor a 50% y con mas de 2 decimales