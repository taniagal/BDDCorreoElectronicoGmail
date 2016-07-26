Informacion De Poliza Colectiva

Meta:

@issue #CDSEG-862

Narrative:
Narrative:
Como usuario de Policy Center
Quiero ser capaz de crear polizas colectivas e individuales
Para las diferentes organizaciones, canales y productos

Scenario: Validar la informacion de poliza colectiva de acuerdo a las opciones seleccionadas
GivenStories: stories/policycenter/login_policy.story
Given que voy a buscar la cuenta <numCuenta>
And quiero expedir una poliza nueva
And seleccione el agente <agente>
When seleccione la organizacion <organizacion>
And seleccione el canal <canal>
And seleccione tipo de poliza <tipoPoliza> de la nueva cotizacion
And seleccione el producto <producto> para expedir la poliza
Then debo ver los siguiente campos en la pantalla con su respectiva informacion:
| titulo                             | tomadorInfo | tipoDocumento        | numeroDocumento | nombre                        | telefono | tipoDireccion | descripcionDir                                                                                          | direccionDePoliza | detallePoliza         | organizacion | canal             | tipoPoliza      | tipoPlazo | fechaInicioVigencia | fechaFin | fechaExp   | polizaFinanciada | oficina | codAgente   | descuentoPoliza | agregarCoaseguro  |
| Informacion de la póliza colectiva | Tomador     | CEDULA DE CIUDADANIA | 1234567890      | YURLEDYS PAOLA GALLEGO TORRES | 4082211  | Vivienda      | CRA 65 # 48-162, Floor 0000, Developer Unit Habitation Cube #0000, LOUISVILLE, KY 40207, Estados Unidos | Cambiar a:        | Detalles de la póliza | Sura         | Canal Tradicional | CommercialFleet | Otra      | 07/26/2016          |          | 07/26/2016 | Si,No            | SURA    | 4999DIRECTO |                 | Agregar coaseguro |

Examples:
|numCuenta|agente|organizacion|tipoPoliza|producto|
