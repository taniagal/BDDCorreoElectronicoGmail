
Meta:
@lote2
@issue
@tag automator: eliana_alvarez
@local
@Sprint 12

Narrative:
Como usuario de negocio
Quiero que se levante el requisito para la solucion de multiriesgo de acuerdo a las reglas de negocio ya definidas.

Scenario: validar requisito de inspeccion para multiriesgo en expedicion de poliza
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza:
| cuenta     | organizacion | producto                |
| C000888888 | Sura         | Multiriesgo corporativo |
And seleccione reaseguro especial No
When agregue una nueva ubicacion departamento <departamento>, ciuad <ciudad>, direccion <direccion>
And descripcion <descripcion>, actividad economica <actividad>
And seleccione la cobertura:
| valorReconstruccion | valorAsegurado | valorComercial | cobertura |
| 100000000           | 100000000      | null           | Terremoto |
And cotice para la opcion declinar MRC
When voy a expedir una poliza
And confirmo el mensaje de expedir poliza
Then se debe mostrar un mensaje de advertencia
| mensaje                                             |
| Existen requisitos pendientes, por favor verifique. |
And voy a validar el requisito en la aplicacion con el usuario <usuario> y contrasenia <contrasenia>
And debo ver el requisito con el estado correspondiente con la fecha del dia de hoy
| requisito  | estado    |
| INSPECCION | PENDIENTE |

Examples:
| departamento | ciudad   | direccion         | descripcion       | actividad                     | usuario  | contrasenia |
| Antioquia    | Medellin | CR 45 A # 44 - 01 | Prueba requisitos | Acabado de productos textiles | linajate | linajate    |

Scenario: validar requisito de firma cliente para multiriesgo en expedicion de poliza
Given estoy cotizando una poliza:
| cuenta    | organizacion | producto                |
| xxxxxxxxx | Sura         | Multiriesgo corporativo |
And seleccione reaseguro especial No
When agregue una nueva ubicacion departamento <departamento>, ciuad <ciudad>, direccion <direccion>
And descripcion <descripcion>, actividad economica <actividad>
And seleccione la cobertura:
| valorReconstruccion | valorAsegurado | valorComercial | cobertura |
| 100000000           | 100000000      | null           | Terremoto |
And cotice para la opcion declinar MRC
When voy a expedir una poliza
And confirmo el mensaje de expedir poliza
Then se debe mostrar un mensaje bloqueante
| mensajeB                                            |
| Existen requisitos pendientes, por favor verifique. |

Examples:
| departamento | ciudad   | direccion         | descripcion       | actividad                     |
| Antioquia    | Medellin | CR 45 A # 44 - 01 | Prueba requisitos | Acabado de productos textiles |

Scenario: validar requisito de sarlaft para multiriesgo en expedicion de poliza
Given estoy cotizando una poliza:
| cuenta    | organizacion | producto                |
| xxxxxxxxx | Sura         | Multiriesgo corporativo |
And seleccione reaseguro especial No
When agregue una nueva ubicacion departamento <departamento>, ciuad <ciudad>, direccion <direccion>
And descripcion <descripcion>, actividad economica <actividad>
And seleccione la cobertura:
| valorReconstruccion | valorAsegurado | valorComercial | cobertura |
| 100000000           | 100000000      | null           | Terremoto |
And cotice para la opcion declinar MRC
When voy a expedir una poliza
And confirmo el mensaje de expedir poliza
Then se debe mostrar un mensaje bloqueante
| mensajeB                                            |
| Existen requisitos pendientes, por favor verifique. |

Examples:
| departamento | ciudad   | direccion         | descripcion       | actividad                     |
| Antioquia    | Medellin | CR 45 A # 44 - 01 | Prueba requisitos | Acabado de productos textiles |

Scenario: validar requisito de paz y salvo para beneficiario oneroso en cambio de poliza
Given estoy cotizando una poliza:
| cuenta    | organizacion | producto                |
| xxxxxxxxx | Sura         | Multiriesgo corporativo |
And seleccione reaseguro especial No
When agregue una nueva ubicacion departamento <departamento>, ciuad <ciudad>, direccion <direccion>
And descripcion <descripcion>, actividad economica <actividad>
And ingrese a buscar contacto del directorio con tipo de documento <tipoId> y numero de documento <numeroId> ----
And seleccione la cobertura:
| valorReconstruccion | valorAsegurado | valorComercial | cobertura |
| 100000000           | 100000000      | null           | Terremoto |
And cotice para la opcion declinar MRC
When voy a expedir una poliza
And confirmo el mensaje de expedir poliza
And continuo la expedicion con requisitos pendientes