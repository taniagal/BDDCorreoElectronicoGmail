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
|tipoIdentificacion|numeroIdentificacion|primerNombre|segundoNombre|primerApellido|segundoApellido|fechaNacimiento|estadoCivil|telefonoPrimario|telefonoCasa|celular|correoPrimario|correoSecundario|direccion|tipoDireccion|descripcionDireccion|moneda|
|||||||||

Examples:
| numCuenta  | agente  | organizacion | canal             | tipoPoliza | producto                  |riesgo|
| C000888888 | DIRECTO | Sura         | Canal Tradicional | Colectiva  | Commercial Personal Fleet |BLE860|