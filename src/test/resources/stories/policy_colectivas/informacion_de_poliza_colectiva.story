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
| Información de la póliza colectiva | Tomador     | CEDULA DE CIUDADANIA | 1234567890      | YURLEDYS PAOLA GALLEGO TORRES | 4082211  | Vivienda      | CRA 65 # 48-162, Floor 0000, Developer Unit Habitation Cube #0000, LOUISVILLE, KY 40207, Estados Unidos | Cambiar a:        | Detalles de la póliza | Sura         | Canal Tradicional | CommercialFleet | Anual     | 07/26/2016          |          | 07/26/2016 | Sí                 | No                 | SURA    | 4999DIRECTO |                 | Agregar coaseguro |
And debo ver la fecha de fin de vigencia <cantidadAniosVigencia> calculado de acuerdo al producto seleccionado

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
Then debo ver la fecha de fin de vigencia <cantidadAniosVigencia> calculado de acuerdo al producto seleccionado

Examples:
| numCuenta  | agente  | organizacion | canal   | tipoPoliza | producto                  | cantidadAniosVigencia |
| C000888888 | DIRECTO | Bancolombia  | Leasing | Colectiva  | Bank Autos                | 5                     |
| C000888888 | DIRECTO | Bancolombia  | Leasing | Colectiva  | Commercial Personal Fleet | 1                     |

Scenario: validar descuento mayor a 50% y con mas de 2 decimales
When ingrese el porcentaje de descuento invalido <porcentaje>
And de clic en boton siguiente para pasar al siguiente paso de la poliza colectiva
Then me debe mostrar el mensaje <mensaje> indicando la inconsistencia en el valor del descuento

Examples:
| porcentaje | mensaje                                                         |
| 50.1       | El descuento de la póliza debe estar en un rango de 0% a 50%    |
| 5.111      | El descuento de la póliza puede tener máximo 2 cifras decimales |

Scenario: Validar cuando se cambia fecha inicio de vigencia se recalcula la fecha de fin vigencia correctamente
Given que voy a buscar la cuenta <numCuenta>
And quiero expedir una poliza nueva
And seleccione el agente <agente>
When seleccione la organizacion <organizacion>
And seleccione el canal <canal>
And seleccione tipo de poliza <tipoPoliza> de la nueva cotizacion
And seleccione el producto <producto> de poliza colectiva para expedirla
When cambie la fecha de inicio de vigencia de la poliza colectiva (un mes antes de la fecha actual)
Then debe recalcular la fecha fin de vigencia <aniosFinVigencia> de acuerdo al producto seleccionado

Examples:
| numCuenta  | agente  | organizacion | canal             | tipoPoliza | producto         | aniosFinVigencia |
| C000888888 | DIRECTO | Tuya         | Tuya              | Colectiva  | Bank Autos       | 5                |
| C000888888 | DIRECTO | Sura         | Canal Tradicional | Colectiva  | Commercial Fleet | 1                |

Scenario: Validar la opcion de agregar coaseguro
When de clic en agregar coaseguro
And ingrese el porcentaje de participacion de las aseguradoras
And de clic en Aceptar de la ventana Coaseguro
Then debo ver en la ventana de informacion de la poliza colectiva las opciones de editar y eliminar coaseguro

Scenario: Validar la opcion de editar coaseguro
When de clic en la opcion de editar el coaseguro
Then debo ver la ventana de coaseguro con los datos diligenciados

Scenario: Validar la opcion de eliminar coaseguro
When de clic en Cancelar de la edicion de coaseguro
And de clic en la opcion eliminar de coaseguro
Then debo ver nuevamente el link de agregar coaseguro

Scenario: Validar datos de tomador secundario en poliza colectiva
When seleccione segundo tomador para la poliza colectiva
Then debo ver los siguientes datos del segundo tomador en la pantalla:
| tipoDocumentoSegundo | numeroDocumentoSegundo | nombreSegundo  | telefonoSegundo | direccionSegundo                               | tipoDireccionSegundo | descripcionDireccionSegundo                |
| CEDULA DE CIUDADANIA | 1264567899             | GLORIA GALLEGO | 408-2211        | CRA 65 # 48-162, SAN FRANCISCO, Estados Unidos | Vivienda             | Created by the Address Builder with code 0 |

Scenario: Validar retroactividad en la vigencia de la poliza colectiva
Meta: @pending
When cambie la fecha de inicio de vigencia de la poliza colectiva mas de 60 dias  hacia atrás o 60 hacia adelante <sesentaDias>
And de clic en boton siguiente para pasar al siguiente paso de la poliza colectiva
Then me debe mostrar el mensaje <mensaje> indicando que no cumple con la retroactividad permitida

Examples:
| sesentaDias | mensaje                                                                              |
| mas         | La fecha de vigencia no cumple con el parámetro de retroactividad definido (60 días) |
| menos       | La fecha de vigencia no cumple con el parámetro de retroactividad definido (60 días) |
