Colectiva Detalle De Riesgo Pa

Meta:

@issue #CDSEG-826
@Automatizador Eliana Alvarez
@Sprint 6

Narrative:
Como usuario de Policy Center
Quiero poder consultar el detalle de un riesgo ingresado
para visualizar la informacion de los asegurados

Scenario: validar cuando selecciono un numero de poliza muestre la pantalla de informacion de la poliza
GivenStories: stories/policycenter/login_policy.story
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