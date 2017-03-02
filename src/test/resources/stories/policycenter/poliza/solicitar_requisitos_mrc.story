
Meta:
@lote4
@issue
@tag equipo: 1
@local
@Sprint 12

Narrative:
Como usuario de negocio
Quiero que se levante el requisito para la solucion de multiriesgo de acuerdo a las reglas de negocio ya definidas.

Scenario: validar requisito de inspeccion para multiriesgo en expedicion de poliza
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza de mrc:
| organizacion | producto                | tipo_documento       | numeroDocumento | fecha_nacimiento | primer_nombre | primer_apellido | tipo_direccion          | direccion        | departamento | ciudad   | agente |
| Sura         | Multiriesgo corporativo | CEDULA DE CIUDADANIA | 1112223340      | 10/10/1974       | ANDREA        | GARABITO        | DIRECCION DE RESIDENCIA | CALLE 28F #60-68 | Antioquia    | Medellin | INT-3  |
And seleccione reaseguro especial No
When agregue una nueva ubicacion departamento <departamento>, ciuad <ciudad>, direccion <direccion>, medioVenta <medioVenta>
And descripcion <descripcion>, actividad economica <actividad>
And seleccione la cobertura:
| valorReconstruccion | valorAsegurado | valorComercial | cobertura |
| 100000000           | 100000000      | null           | Terremoto |
And cotice para la opcion declinar MRC
When voy a expedir una poliza
And confirmo el mensaje de expedir poliza
Then se debe mostrar un mensaje de advertencia
| mensaje                                                                                                             |
| Existen requisitos opcionales pendientes por adjuntar, por favor diríjase a la pestaña Requisitos para tramitarlos. |

Examples:
| departamento | ciudad   | direccion         | descripcion       | actividad                     |medioVenta|
| Antioquia    | Medellin | CR 45 A # 44 - 01 | Prueba requisitos | Acabado de productos textiles |Televentas|



Scenario: validar requisito de firma cliente para multiriesgo en expedicion de poliza
Given estoy cotizando una poliza de mrc:
| organizacion | producto                | tipo_documento       | numeroDocumento | fecha_nacimiento | primer_nombre | primer_apellido | tipo_direccion          | direccion        | departamento | ciudad   | agente |
| Sura         | Multiriesgo corporativo | CEDULA DE CIUDADANIA | 1112223332      | 10/10/1985       | CARMELO       | VALENCIA        | DIRECCION DE RESIDENCIA | CALLE 29F #61-68 | Antioquia    | Medellin | INT-3  |
And seleccione reaseguro especial No
When agregue una nueva ubicacion departamento <departamento>, ciuad <ciudad>, direccion <direccion>, medioVenta <medioVenta>
And descripcion <descripcion>, actividad economica <actividad>
And seleccione la cobertura:
| valorReconstruccion | valorAsegurado | valorComercial | cobertura |
| 100000000           | 100000000      | null           | Terremoto |
And cotice para la opcion declinar MRC
When voy a expedir una poliza
And confirmo el mensaje de expedir poliza
Then se debe mostrar un mensaje bloqueante
| mensaje                                                                                                               |
| Existen requisitos obligatorios pendientes por adjuntar, por favor diríjase a la pestaña Requisitos para tramitarlos. |

Examples:
| departamento | ciudad   | direccion         | descripcion       | actividad                     |medioVenta|
| Antioquia    | Medellin | CR 45 A # 44 - 02 | Prueba requisitos | Acabado de productos textiles |Televentas|



Scenario: validar requisito de sarlaft para multiriesgo en expedicion de poliza
Given estoy cotizando una poliza de mrc:
| organizacion | producto                | tipo_documento       | numeroDocumento | fecha_nacimiento | primer_nombre | primer_apellido | tipo_direccion          | direccion       | departamento | ciudad   | agente |
| Sura         | Multiriesgo corporativo | CEDULA DE CIUDADANIA | 1112223333      | 10/10/1990       | LUISA         | PERDOMO         | DIRECCION DE RESIDENCIA | CALLE 30 #60-68 | Antioquia    | Medellin | INT-3  |
And seleccione reaseguro especial No
When agregue una nueva ubicacion departamento <departamento>, ciuad <ciudad>, direccion <direccion>, medioVenta <medioVenta>
And descripcion <descripcion>, actividad economica <actividad>
And seleccione la cobertura:
| valorReconstruccion | valorAsegurado | valorComercial | cobertura |
| 100000000           | 100000000      | null           | Terremoto |
And cotice para la opcion declinar MRC
When voy a expedir una poliza
And confirmo el mensaje de expedir poliza
Then se debe mostrar un mensaje bloqueante
| mensaje                                                                                                               |
| Existen requisitos obligatorios pendientes por adjuntar, por favor diríjase a la pestaña Requisitos para tramitarlos. |

Examples:
| departamento | ciudad   | direccion         | descripcion       | actividad                     |medioVenta|
| Antioquia    | Medellin | CR 45 A # 44 - 03 | Prueba requisitos | Acabado de productos textiles |Televentas|


Scenario: validar requisito de paz y salvo para beneficiario oneroso en cambio de poliza
Meta: @manual
Given que tengo una poliza expedida con beneficiario oneroso
When quiera realizar un cambio en la poliza y quiera expedirla
Then se debe mostrar un mensaje bloqueante
| mensaje                                                                                                               |
| Existen requisitos obligatorios pendientes por adjuntar, por favor diríjase a la pestaña Requisitos para tramitarlos. |

Scenario: validar requisito de paz y salvo para beneficiario oneroso en cancelacion de poliza
Meta: @manual
Given que tengo una poliza expedida con beneficiario oneroso
When quiera cancelar la poliza
Then se debe mostrar un mensaje bloqueante
| mensaje                                                                                                               |
| Existen requisitos obligatorios pendientes por adjuntar, por favor diríjase a la pestaña Requisitos para tramitarlos. |
