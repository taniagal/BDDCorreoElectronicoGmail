Transacciones Poliza Colectiva

Meta:

@issue #CDSEG-877

Narrative:
Como usuario de PolicyCenter
Quiero ser capaz de poder ver las transacciones asociada a una cuenta de una póliza colectiva
Para validar datos importantes de la misma

Scenario: Validar en el menu que se muestren las opciones para las transacciones de poliza individual y colectiva
GivenStories: stories/policycenter/login_policy.story
Given que voy a buscar la cuenta <numCuenta>
And quiero expedir una poliza nueva
And seleccione el agente <agente>
When seleccione la organizacion <organizacion>
And seleccione el canal <canal>
And seleccione tipo de poliza <tipoPoliza> de la nueva cotizacion
And seleccione el producto <producto> para expedir la poliza
Then debo ver las opciones para transacciones de poliza colectiva e individual

Examples:
| numCuenta  | agente  | organizacion | canal             | tipoPoliza | producto         |
| C000888888 | DIRECTO | Sura         | Canal Tradicional | Colectiva  | Commercial Fleet |

Scenario: validar que las ventanas de transacciones se muestren de acuerdo al tipo de poliza seleccionado

Given que voy a buscar la cuenta <numCuenta>
And quiero expedir una poliza nueva
And seleccione el agente <agente>
When seleccione la organizacion <organizacion>
And seleccione el canal <canal>
And seleccione tipo de poliza <tipoPoliza> de la nueva cotizacion
And seleccione el producto <producto> para expedir la poliza
And seleccione la opcion del menu transacciones de tipo de poliza individual
Then debo ver las transacciones de poliza individual
And debo ver las transacciones de poliza colectiva:
|numeroPoliza|producto     |tipo   |estado  |participante|
|22221989    |Auto Personal|Emisión|Borrador|JAVIER CANO |

Examples:
| numCuenta  | agente  | organizacion | canal             | tipoPoliza | producto                  |
| C000888888 | DIRECTO | Sura         | Canal Tradicional | Colectiva  | Commercial Personal Fleet |

Scenario: validar cuando selecciono un numero de poliza muestre la pantalla de informacion de la poliza
When de clic en el numero de poliza de transacciones poliza colectiva
Then debo ver los siguiente campos en la pantalla con su respectiva informacion:
| titulo                             | tomadorInfo | tipoDocumento        | numeroDocumento | nombre                        | telefono | tipoDireccion | descripcionDir                             | direccionDePoliza                              | detallePoliza         | organizacion | canal             | tipoPoliza                | tipoPlazo | fechaInicioVigencia | fechaFin | fechaExp   | oficina           | codAgente    | descuentoPoliza | agregarCoaseguro  |
| Información de la póliza colectiva | Tomador     | CEDULA DE CIUDADANIA | 1234567890      | YURLEDYS PAOLA GALLEGO TORRES | 408-2211 | Vivienda      | Created by the Address Builder with code 0 | 0000 Bridgepointe Parkway, San Mateo, Colombia | Detalles de la póliza | Sura         | Canal Tradicional | Commercial Personal Fleet | Anual     | 07/26/2016          |          | 07/26/2016 |  AMITEK-000082    | 1762ProdCode |                 | Agregar coaseguro |


Scenario: validar que cuando se actualiza la poliza se deshabilita la edicion y el estado de la transaccion cambia
When de clic en boton siguiente para pasar al siguiente paso de la poliza colectiva
Then debe deshabilitar la edicion de la informacion de la poliza colectiva
And debo ver las transacciones de poliza colectiva:
|numeroPoliza|producto     |tipo   |estado  |participante|
|22221989    |Auto Personal|Emisión|Activo  |JAVIER CANO |