Detalle De Asegurado De Cotizacion

Meta: @lote2

@issue #CDSEG-1027
@tag automator: eliana_alvarez, sprint:2
@Sprint 2

Narrative:
Como usuario de PolicyCenter
Quiero poder ingresar la información de uno o varios asegurados
Para agregarlos a la cotizacion


Scenario: Validar asegurado que es persona publicamente expuesta
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza:
|cuenta    |organizacion|producto|canal            |
|C000888888|Sura        |Autos   |Canal Tradicional|
When quiera agregar un asegurado
And vaya a la opcion agregar
And consulte un asegurado del directorio
And ingrese a buscar contacto del directorio con tipo de documento <tipoId> y numero de documento <numeroId>
And seleccione el contacto a agregar
And vaya al siguiente paso de la cotizacion
Then se debe continuar al siguiente paso de la cotizacion

Examples:
| tipoId               | numeroId | mensaje                                                                                              |
| CEDULA DE CIUDADANIA | 71123456 | ANTONIO RESTREPO con CEDULA DE CIUDADANIA - 71123456 es un riesgo no estándar y debe ser autorizado. |

Scenario: Opciones para agregar asegurado
Given estoy cotizando una poliza:
|cuenta    |organizacion|producto|canal            |
|C000888888|Sura        |Autos   |Canal Tradicional|
When quiera agregar un asegurado
And vaya a la opcion agregar
Then el boton recuperar mvr no es visible
And Se debe mostrar las opciones:
|agregar|
|Nuevo|
|Del Directorio|
|Contactos de la cuenta|

Examples:
||
||

Scenario: Agregar varios asegurados: Agregar asegurado de los contactos de la cuenta y validar asegurado del directorio riesgo consultable
Given estoy cotizando una poliza:
|cuenta    |organizacion|producto|canal            |
|C000888888|Sura        |Autos   |Canal Tradicional|
When quiera agregar un asegurado
And vaya a la opcion agregar
And consulte un asegurado del directorio
And ingrese a buscar contacto del directorio con tipo de documento <tipoId> y numero de documento <numeroId>
And seleccione el contacto a agregar
And vaya a la opcion agregar
And agregue un asegurado que es contacto de la cuenta
Then deben quedar agregados como asegurados:
| nombre         | tipoDocumento        | numeroDocumento |
| DIEGO VELEZ    | CEDULA DE CIUDADANIA | 32536001        |
| GLORIA GALLEGO | CEDULA DE CIUDADANIA | 1264567899      |
And se debe continuar al siguiente paso de la cotizacion

Examples:
| tipoId               | numeroId | mensaje                                                                                                   |
| CEDULA DE CIUDADANIA | 32536001 | DIEGO VELEZ, El asegurado es un riesgo no estándar y no es posible gestionar la solicitud por este canal. |

Scenario: Agregar asegurado y Editar campos en creacion tipo persona natural
Given estoy cotizando una poliza:
|cuenta    |organizacion|producto|canal            |
|C000888888|Sura        |Autos   |Canal Tradicional|
When quiera agregar un asegurado
And vaya a la opcion agregar
And seleccione ingresar nueva persona natural
And ingrese los datos de persona natural:
| tipoId               | numeroId   | primerNombre | primerApellido | pais     | departamento | ciudad   | direccion       | tipoDireccion                  |
| CEDULA DE CIUDADANIA | 1234568999 | LUCIANA      | LONDOÑO        | Colombia | Antioquia    | Medellin | Cra 65 # 48-162 | DIRECCION DE OFICINA PRINCIPAL |
And quiera editar los datos del nuevo contacto persona natural:
| tipoId               | numeroId   | primerNombre | primerApellido | pais     | departamento | ciudad   | direccion       | tipoDireccion                  |
| CEDULA DE CIUDADANIA | 1234569999 | LUCIANA      | CALLE          | Colombia | Antioquia    | Medellin | Cra 65 # 48-162 | DIRECCION DE OFICINA PRINCIPAL |
And vaya a la opcion agregar
And consulte un asegurado del directorio
And vuelva a ver los asegurados
Then deben quedar agregados como asegurados:
| nombre        | tipoDocumento        | numeroDocumento |
| LUCIANA CALLE | CEDULA DE CIUDADANIA | 1234568999      |

Examples:
||
||

Scenario: Agregar y Editar campos en creacion tipo persona juridica
Given estoy cotizando una poliza:
|cuenta    |organizacion|producto|canal            |tipoPoliza |
|C000888888|Sura        |Autos   |Canal Tradicional|PPAutos    |
When quiera agregar un asegurado
And vaya a la opcion agregar
And seleccione ingresar nueva persona juridica
And ingrese los datos de persona juridica:
| tipoId | numeroId   | razonSocial           | pais     | departamento | ciudad   | direccion       | tipoDireccion                  |
| NIT    | 9998887777 | COOPERATIVA NUMERODOS | Colombia | Antioquia    | Medellin | Cra 66 # 48-162 | DIRECCION DE OFICINA PRINCIPAL |
And quiera editar los datos del nuevo contacto persona juridica:
| tipoId | numeroId   | razonSocial      | pais     | departamento | ciudad   | direccion       | tipoDireccion                  | monedaPreferida |
| NIT    | 9998887778 | COOPERATIVA LALO | Colombia | Antioquia    | Medellin | Cra 67 # 48-162 | DIRECCION DE OFICINA PRINCIPAL | COP             |
And vaya a la opcion agregar
And consulte un asegurado del directorio
And vuelva a ver los asegurados
Then deben quedar agregados como asegurados:
| nombre           | tipoDocumento | numeroDocumento |
| COOPERATIVA LALO | NIT           | 9998887777      |

Examples:
||
||

Scenario: Mostrar errores al validar las reglas de MDM al dar siguiente
Given estoy cotizando una poliza:
|cuenta    |organizacion|producto|canal            |tipoPoliza |
|C000888888|Sura        |Autos   |Canal Tradicional|PPAutos    |
When quiera agregar un asegurado
And vaya a la opcion agregar
And seleccione ingresar nueva persona natural
And ingrese los datos de persona natural:
| tipoId               | numeroId    | primerNombre | primerApellido | pais     | departamento | ciudad   | direccion       | tipoDireccion                  |
| CEDULA DE CIUDADANIA | 10000000010 | ELIANA       | QUINTERO       | Colombia | Antioquia    | Medellin | Cra 65 # 48-162 | DIRECCION DE OFICINA PRINCIPAL |
And vaya al siguiente paso de la cotizacion
Then muestre el mensaje de validacion del asegurado <mensaje>

Examples:
| mensaje                                                                                  |
| La longitud del número de documento de identificación no es válida, máximo 10 caracteres |

Scenario: Quitar asegurado
Given estoy cotizando una poliza:
|cuenta    |organizacion|producto|canal            |tipoPoliza |
|C000888888|Sura        |Autos   |Canal Tradicional|PPAutos    |
When quiera agregar un asegurado
And vaya a la opcion agregar
And consulte un asegurado del directorio
And ingrese a buscar contacto del directorio con tipo de documento <tipoId> y numero de documento <numeroId>
And seleccione el contacto a agregar
And seleccione el contacto agregado
And quite el contacto de la lista
Then la lista de asegurados debe quedar vacia

Examples:
| tipoId | numeroId |
|NIT     |9202086744|

Scenario: Validar asegurado que es riesgo consultable
Given estoy cotizando una poliza:
|cuenta    |organizacion|producto|canal            |tipoPoliza |
|C000888888|Sura        |Autos   |Canal Tradicional|PPAutos    |
When quiera agregar un asegurado
And vaya a la opcion agregar
And consulte un asegurado del directorio
And ingrese a buscar contacto del directorio con tipo de documento <tipoId> y numero de documento <numeroId>
And seleccione el contacto a agregar
And vaya al siguiente paso de la cotizacion
Then se debe continuar al siguiente paso de la cotizacion

Examples:
| tipoId               | numeroId | mensaje                                                                                                |
| CEDULA DE CIUDADANIA | 123456   | FRANK RAMIREZ ALZATE con CEDULA DE CIUDADANIA - 123456 es un riesgo no estándar y debe ser autorizado. |