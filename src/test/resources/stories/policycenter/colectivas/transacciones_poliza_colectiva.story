Transacciones Poliza Colectiva

Meta:

@issue #CDSEG-877
@tag automator: eliana_alvarez, sprint:5
@Sprint 5
@local

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
And seleccione el producto <producto> de poliza colectiva para expedirla
Then debo ver las opciones para transacciones de poliza colectiva e individual

Examples:
| numCuenta  | agente  | organizacion | canal             | tipoPoliza | producto         |
| C000888888 | DIRECTO | Sura         | Canal Tradicional | Colectiva  |Commercial Fleet|


Scenario: validar que las ventanas de transacciones se muestren de acuerdo al tipo de poliza seleccionado
Given que voy a buscar la cuenta <numCuenta>
And quiero expedir una poliza nueva
And seleccione el agente <agente>
When seleccione la organizacion <organizacion>
And seleccione el canal <canal>
And seleccione tipo de poliza <tipoPoliza> de la nueva cotizacion
And seleccione el producto <producto> de poliza colectiva para expedirla
And seleccione la opcion del menu transacciones de tipo de poliza individual
Then debo ver las transacciones de poliza individual
And debo ver las transacciones de poliza colectiva:
|numeroPoliza|producto     |tipo   |estado  |participante|
|22221989    |Auto Personal|Emisión|Borrador|JAVIER CANO |

Examples:
| numCuenta  | agente  | organizacion | canal             | tipoPoliza | producto                  |
| C000888888 | DIRECTO | Sura         | Canal Tradicional | Colectiva  | Commercial Personal Fleet |

Scenario: validar cuando selecciono un numero de poliza muestre la pantalla de informacion de la poliza
Given que voy a buscar la cuenta <numCuenta>
And quiero expedir una poliza nueva
And seleccione el agente <agente>
When seleccione la organizacion <organizacion>
And seleccione el canal <canal>
And seleccione tipo de poliza <tipoPoliza> de la nueva cotizacion
And seleccione el producto <producto> de poliza colectiva para expedirla
And vaya a consultar las transacciones de la poliza colectiva
And de clic en el numero de poliza de transacciones poliza colectiva
Then debo ver los siguiente campos en la pantalla con su respectiva informacion:
| titulo                             | tomadorInfo | tipoDocumento        | numeroDocumento | nombre                        | telefono | tipoDireccion           | descripcionDir                             | direccionDePoliza                           | detallePoliza         | organizacion | canal             | tipoPoliza                | tipoPlazo | fechaInicioVigencia | fechaFin | fechaExp   | oficina | codAgente | descuentoPoliza | agregarCoaseguro  |
| Información de la póliza colectiva | Tomador     | CEDULA DE CIUDADANIA | 1234567890      | YURLEDYS PAOLA GALLEGO TORRES | 408-2211 | DIRECCION DE RESIDENCIA | Created by the Address Builder with code 0 | CRA 65 # 48-162, LOUISVILLE, Estados Unidos | Detalles de la póliza | Sura         | Canal Tradicional | Commercial Personal Fleet | Anual     | 07/26/2016          |          | 07/26/2016 | SURA    | 1989      | 10              | Agregar coaseguro |

Examples:
| numCuenta  | agente  | organizacion | canal             | tipoPoliza | producto                  |
| C000888888 | DIRECTO | Sura         | Canal Tradicional | Colectiva  | Commercial Personal Fleet |

Scenario: validar que cuando se actualiza la poliza se deshabilita la edicion y el estado de la transaccion cambia
Given que voy a buscar la cuenta <numCuenta>
And quiero expedir una poliza nueva
And seleccione el agente <agente>
When seleccione la organizacion <organizacion>
And seleccione el canal <canal>
And seleccione tipo de poliza <tipoPoliza> de la nueva cotizacion
And seleccione el producto <producto> de poliza colectiva para expedirla
And vaya a consultar las transacciones de la poliza colectiva
And de clic en el numero de poliza de transacciones poliza colectiva
And seleccione segundo tomador para la poliza colectiva
And de clic en boton siguiente para pasar al siguiente paso de la poliza colectiva
Then debe deshabilitar la edicion de la informacion de la poliza colectiva
And debo ver las transacciones de poliza colectiva:
|numeroPoliza|producto     |tipo   |estado  |participante|
|22221989    |Auto Personal|Emisión|Activo  |JAVIER CANO |

Examples:
| numCuenta  | agente  | organizacion | canal             | tipoPoliza | producto                  |
| C000888888 | DIRECTO | Sura         | Canal Tradicional | Colectiva  | Commercial Personal Fleet |

Scenario: validar que cuando se da clic en el nombre del tomador va a la pantalla de consulta del contacto
Given que voy a buscar la cuenta <numCuenta>
And quiero expedir una poliza nueva
And seleccione el agente <agente>
When seleccione la organizacion <organizacion>
And seleccione el canal <canal>
And seleccione tipo de poliza <tipoPoliza> de la nueva cotizacion
And seleccione el producto <producto> de poliza colectiva para expedirla
And vaya a consultar las transacciones de la poliza colectiva
And de clic en el numero de poliza de transacciones poliza colectiva
And de clic en boton siguiente para pasar al siguiente paso de la poliza colectiva
And de clic en el nombre del tomador o el segundo tomador <tomador> de la poliza colectiva
Then me debe llevar a la pantalla de consulta de tomador <tomador> de la poliza colectiva y no tener la opcion de editar

Examples:
| numCuenta  | agente  | organizacion | canal             | tipoPoliza | producto                  |tomador          |
| C000888888 | DIRECTO | Sura         | Canal Tradicional | Colectiva  | Commercial Personal Fleet |tomador          |
| C000888888 | DIRECTO | Tuya         | Tuya              | Colectiva  | Bank Autos                | segundo tomador |

Scenario: validar el detalle del riesgo ingresado a la poliza colectiva
Given que voy a buscar la cuenta <numCuenta>
And quiero expedir una poliza nueva
And seleccione el agente <agente>
When seleccione la organizacion <organizacion>
And seleccione el canal <canal>
And seleccione tipo de poliza <tipoPoliza> de la nueva cotizacion
And seleccione el producto <producto> de poliza colectiva para expedirla
And vaya a consultar las transacciones de la poliza colectiva
And de clic en el numero de poliza de transacciones poliza colectiva
And de clic en agregar riesgo para ir a la ventana de riesgos
And seleccione el riesgo <riesgo> para ver el detalle
Then debo ver el detalle del asegurado y no debe permitir la modificacion de los datos
| tipoIdentificacion   | numeroIdentificacion | primerNombre | segundoNombre | primerApellido | segundoApellido | fechaNacimiento | estadoCivil | telefonoResidencia | celular         | correoPrimario     | correoSecundario | direccion                                   | tipoDireccion | descripcionDireccion                       | moneda |
| CEDULA DE CIUDADANIA | 1234567891           | DORIAN       | STIWAR        | EASTMOND       | PULGARIN        | 01/01/1970      | Soltero     | 408-2211           | +1 311-321-2470 | 0005@guidewire.com | 0005@hotmail.com | CRA 65 # 48-162, LOUISVILLE, Estados Unidos | Vivienda      | Created by the Address Builder with code 0 | COP    |

Examples:
| numCuenta  | agente  | organizacion | canal             | tipoPoliza | producto                  | riesgo |
| C000888888 | DIRECTO | Sura         | Canal Tradicional | Colectiva  | Commercial Personal Fleet | BLE861 |