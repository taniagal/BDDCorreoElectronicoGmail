Ingreso De Riesgos Poliza Colectiva

Meta:

@issue #CDSEG-916
@tag automator: eliana_alvarez, sprint:5
@Sprint 5
@local

Narrative:
Como usuario de PolicyCenter
Quiero ser capaz de ingresar un riesgo a una póliza colectiva de Autos

Scenario: Validar la creacion de un riesgo con cuenta existente
GivenStories: stories/policycenter/login_policy.story
Given que voy a buscar la cuenta <numCuenta>
And quiero expedir una poliza nueva
And seleccione el agente <agente>
When seleccione la organizacion <organizacion>
And seleccione el canal <canal>
And seleccione tipo de poliza <tipoPoliza> de la nueva cotizacion
And seleccione el producto <producto> de poliza colectiva para expedirla
And ingrese el porcentaje de descuento valido <porcentaje>
And cambie la fecha de inicio vigencia a <numeroDias> <masomenos> de la fecha actual
And actualice la poliza colectiva
And de clic en agregar riesgo para ir a la ventana de riesgos
And de clic en agregar riesgo para agregar un riesgo a la poliza colectiva
And ingrese los datos para realizar la busqueda de una cuenta por razon social <razonSocial>
And seleccione la cuenta consultada para agregar al riesgo
And valide la informacion de la poliza individual
| tipoDocumentoTomador | numeroDocumentoTomador | nombreTomador                 | telefonoTomador | direccionTomador                            | tipoDireccionTomador  | descripcionDirTomador                      | organizacion | canal   | tipoPoliza  | tipoPlazo | oficina | agente | descuento | aniosVigencia |
| CEDULA DE CIUDADANIA | 1234567890             | YURLEDYS PAOLA GALLEGO TORRES | 408-2211        | CRA 65 # 48-162, LOUISVILLE, Estados Unidos |DIRECCION DE RESIDENCIA| Created by the Address Builder with code 0 | Bancolombia  | Leasing | Autos Banca | Anual     | SURA    | 4999   | 0         | 1             |
And quiera agregar un asegurado
And la cuenta fue creada y agregada satisfactoriamente como asegurado
| nombre                  | tipoDocumento | numeroDocumento |
| VARIEDADES YURLEDYS S.A | NIT           | 9202086744      |
And vaya a agregar un vehiculo con los datos:
| placa  | modelo | codigo_fasecolda | ciudad_circulacion | vehiculo_servicio | chasis | motor  | valor_asegurado | descuento | recargo | zona | plan         |
| TYR146 | 2016   | 00601182         | MEDELLIN           | Particular        | asd456 | dsa654 | 165900000       | null      | null    | 2    | Plan Modular |
And relacione el asegurado <asegurado> a los datos del vehiculo
And voy a realizar el siguiente paso
And ingrese las coberturas minimas para realizar la cotizacion
And expido la poliza para agregar el riesgo a la poliza colectiva
Then se debe visualizar la opcion de ir a la poliza colectiva de la nueva poliza creada
And al ir a la poliza colectiva e ir a los riesgos, debo ver el riesgo creado con los datos correspondientes
| placa  | claseVehiculo        | modelo | marca| linea                          |
| TYR146 | Camperos y pickups   | 2016   | AUDI |TT  8S 2.0 TFSI CO - TP 2000CC T|

Examples:
| numCuenta  | agente  | organizacion | canal   | tipoPoliza | producto   | razonSocial             | asegurado               | porcentaje | numeroDias | masomenos |
| C000888888 | DIRECTO | Bancolombia  | Leasing | Colectiva  | Bank Autos | VARIEDADES YURLEDYS S.A | VARIEDADES YURLEDYS S.A | 0          | 59         | menos     |


Scenario: Validar la creacion de un riesgo con cuenta nueva
Given que voy a buscar la cuenta <numCuenta>
And quiero expedir una poliza nueva
And seleccione el agente <agente>
When seleccione la organizacion <organizacion>
And seleccione el canal <canal>
And seleccione tipo de poliza <tipoPoliza> de la nueva cotizacion
And seleccione el producto <producto> de poliza colectiva para expedirla
And ingrese el porcentaje de descuento valido <porcentaje>
And cambie la fecha de inicio vigencia a <numeroDias> <masomenos> de la fecha actual
And actualice la poliza colectiva
And de clic en agregar riesgo para ir a la ventana de riesgos
And de clic en agregar riesgo para agregar un riesgo a la poliza colectiva
And ingrese los datos para realizar la busqueda de la cuenta persona natural <consultaNombre> <consultaApellido>
And ingrese los datos para crear un contacto tipo persona natural
| tipoDocumento        | numeroDocumento | nombre | apellido | fechaNacimiento | departamento | ciudad   | direccion        | tipoDireccion |organizacionCuenta|agenteCuenta|
| CEDULA DE CIUDADANIA | 1037500161      |        |          | 01/01/1990      | Antioquia    | MEDELLIN | CARRERA 10 11 12 | DIRECCION DE RESIDENCIA      |SURA              |4999DIRECTO |
And valide la informacion de la poliza individual
| tipoDocumentoTomador | numeroDocumentoTomador | nombreTomador                 | telefonoTomador | direccionTomador                            | tipoDireccionTomador  | descripcionDirTomador                      | organizacion | canal             | tipoPoliza       | tipoPlazo | oficina | agente | descuento | aniosVigencia |
| CEDULA DE CIUDADANIA | 1234567890             | YURLEDYS PAOLA GALLEGO TORRES | 408-2211        | CRA 65 # 48-162, LOUISVILLE, Estados Unidos |DIRECCION DE RESIDENCIA| Created by the Address Builder with code 0 | Sura         | Canal Tradicional | Commercial Fleet | Anual     | SURA    | 4999   | 0         | 1             |
And quiera agregar un asegurado
And la cuenta fue creada y agregada satisfactoriamente como asegurado
| nombre         | tipoDocumento        | numeroDocumento |
| ELIANA ALVAREZ | CEDULA DE CIUDADANIA | 1037500161      |
And vaya a agregar un vehiculo con los datos:
|placa |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis|motor |valor_asegurado|descuento|recargo|zona|plan        |
|TWU146|2016  |00601182        |MEDELLIN          |Particular       |asd455|dsa655|165900000      |null     |null   |2   |Plan Modular|
And relacione el asegurado <asegurado> a los datos del vehiculo
And voy a realizar el siguiente paso
And ingrese las coberturas minimas para realizar la cotizacion
And expido la poliza para agregar el riesgo a la poliza colectiva
Then se debe visualizar la opcion de ir a la poliza colectiva de la nueva poliza creada
And al ir a la poliza colectiva e ir a los riesgos, debo ver el riesgo creado con los datos correspondientes
| placa  | claseVehiculo        | modelo | marca|linea                           |
| TWU146 | Camperos y pickups   | 2016   | AUDI |TT  8S 2.0 TFSI CO - TP 2000CC T|

Examples:
| numCuenta  | agente  | organizacion | canal             | tipoPoliza | producto         | consultaNombre | consultaApellido | asegurado      |porcentaje | numeroDias | masomenos |
| C000888888 | DIRECTO | Sura         | Canal Tradicional | Colectiva  | Commercial Fleet | Eliana         | Alvarez          | ELIANA ALVAREZ |0          | 59         | menos     |

Scenario: validar que la fecha de inicio de vigencia en Informacion de Poliza se puede modificar para autos y commercial fleet
Meta: @manual
Given que estoy en una poliza colectiva
When agregue un riesgo y este en la informacion de la poliza
Then debo poder cambiar la fecha de inicio de vigencia
