Ingreso De Riesgos Poliza Colectiva

Meta:

@issue #CDSEG-916

Narrative:
Como usuario de PolicyCenter
Quiero ser capaz de ingresar un riesgo a una póliza colectiva de Autos


Scenario: Validar la creacion de un riesgo con cuenta nueva
GivenStories: stories/policycenter/login_policy.story
Given que voy a buscar la cuenta <numCuenta>
And quiero expedir una poliza nueva
And seleccione el agente <agente>
When seleccione la organizacion <organizacion>
And seleccione el canal <canal>
And seleccione tipo de poliza <tipoPoliza> de la nueva cotizacion
And seleccione el producto <producto> de poliza colectiva para expedirla
And de clic en agregar riesgo para ir a la ventana de riesgos
And de clic en agregar riesgo para agregar un riesgo a la poliza colectiva
And ingrese los datos para realizar la busqueda de la cuenta persona natural <nombre> <apellido>
And ingrese los datos para crear un contacto tipo persona natural
| tipoDocumento        | numeroDocumento | nombre | apellido | fechaNacimiento | departamento | ciudad   | direccion        | tipoDireccion |organizacionCuenta|agenteCuenta|
| CEDULA DE CIUDADANIA | 1037500150      | Eliana | Alvarez  | 01/01/1990      | ANTIOQUIA    | MEDELLIN | CARRERA 10 11 12 | Vivienda      |SURA              |4999DIRECTO |
And quiera agregar un asegurado
And la cuenta fue creada y agregada satisfactoriamente como asegurado
|nombre|tipoDocumento|numeroDocumento|
|ELIANA ALVAREZ|CEDULA DE CIUDADANIA|1037500150|
And vaya a agregar un vehiculo con los datos:
|placa |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis   |motor    |valor_asegurado|
|ZAZ741|2008  |01601169        |MEDELLIN          |Particular       |AAA1451  |AAA1452  |25000000       |
And relacione el asegurado a los datos del vehiculo
And voy a realizar el siguiente paso
And ingrese las coberturas minimas para realizar la cotizacion
And voy a la opcion de analisis de riesgo y autorizo
And expido la poliza para agregar el riesgo a la poliza colectiva
Then se debe visualizar la opcion de ir a la poliza colectiva de la nueva poliza creada
And al ir a la poliza colectiva e ir a los riesgos, debo ver el riesgo creado con los datos correspondientes
| placa  | claseVehiculo | modelo | marca     | linea                   |
| ZAZ741 | Automóviles   | 2008   | CHEVROLET | 1.4 L - MT 1400CC 4P AA |

Examples:
| numCuenta  | agente  | organizacion | canal   | tipoPoliza | producto   | nombre | apellido |
| C000888888 | DIRECTO | Bancolombia  | Leasing | Colectiva  | Bank Autos | Eliana | Alvarez  |