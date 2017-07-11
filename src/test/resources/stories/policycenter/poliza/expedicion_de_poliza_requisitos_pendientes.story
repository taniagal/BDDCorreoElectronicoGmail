Meta:
@lote5
@issue #CDSEG-4316
@tag equipo: 5, sprint: 12

Narrative:
Como usuario de policy center
Se requiere  expedir una poliza si los requisitos pendientes obligatorios se encuentran recibidos o adjuntos,
en el caso de que no se encuentren adjuntos o recibidos el sistema debe mostrar un mensaje de errror,
y no debe dejar expedir la poliza hasta que estos no esten adjuntos, en caso de que los requisitos no sean obligatorios,
debe sacar un mensaje de alerta y debe permitir expedir la poliza

Scenario: Validacion sarlaft-expedicion
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza de mrc con documento:
| organizacion | producto | canal             | tipoPoliza | tipo_documento       | documento  | fecha_nacimiento | primer_nombre | primer_apellido | tipo_direccion          | direccion        | departamento | ciudad   | agente |
| Sura         | Autos    | Canal Tradicional | Individual | CEDULA DE CIUDADANIA | 1030765433 | 10/10/1973       | LUCIANA       | LONDOÑO         | DIRECCION DE RESIDENCIA | CALLE 65F #60-69 | Antioquia    | Medellin | INT-3  |
And ingrese los datos del asegurado <tipo_documento> <documento>
And ingrese los datos del vehiculo:
| placa | modelo | codigo_fasecolda | ciudad_circulacion   | vehiculo_servicio | chasis | motor | valor_asegurado | descuento | recargo | zona | plan                  | medioVenta |
| ASDF4 | 2011   |                  | MEDELLIN (ANTIOQUIA) | Particular        | null   | null  | 17900000        | null      | null    | 2    | Plan Autos Clásico    | Televentas |
When ingrese las coberturas a vehiculo:
| limite | deducible | AS                 |
| 640.0  | 0         | Asistencia Clásica |
And cotice una poliza
And llegue a la expedicion de la poliza
Then debo ver un mensaje bloqueante
| mensaje                                                                                                          |
| El contacto CAROLINA OCHOA con DNI C71318883 requiere sarlaft, diríjase a análisis de riesgo para diligenciarlo. |
Examples:
| tipo_documento       | documento |
| CEDULA DE CIUDADANIA | 71318883  |

Scenario: Vehiculo cero kilometros
Given estoy cotizando una poliza de mrc con documento:
| organizacion | producto | canal             | tipoPoliza | tipo_documento       | documento  | fecha_nacimiento | primer_nombre | primer_apellido | tipo_direccion          | direccion        | departamento | ciudad   | agente |
| Sura         | Autos    | Canal Tradicional | Individual | CEDULA DE CIUDADANIA | 1030765425 | 10/10/1973       | LUCIANA       | LONDOÑO         | DIRECCION DE RESIDENCIA | CALLE 65F #60-69 | Antioquia    | Medellin | INT-3  |
And ingrese los datos del asegurado <tipo_documento> <documento>
When ingrese los datos del vehiculo:
| placa | modelo | codigo_fasecolda | ciudad_circulacion   | vehiculo_servicio | chasis | motor | valor_asegurado | descuento | recargo | zona | plan               | medioVenta |
| ASD26 | 2017   | 52525252         | MEDELLIN (ANTIOQUIA) | Particular        | null   | null  | 16000000        | null      | null    | 2    | Plan Autos Clásico | Televentas |
And ingrese las coberturas basicas:
| limite | deducible | abogado | AS                 |
| 640.   | 0         |         | Asistencia Clásica |
And intente cotizar
And llegue a la expedicion de la poliza
And debo ver un mensaje opcional
| mensaje                                                                                                             |
| Existen requisitos opcionales pendientes por adjuntar, por favor diríjase a la pestaña Requisitos para tramitarlos. |
And cuando edite la transacion de la poliza
And vaya a vehiculos en expedicion
And seleccione la opcion importado por terceros
And cotice una poliza
And voy a expedir una poliza
And confirmo el mensaje de expedir poliza
Then debo ver un mensaje bloqueante
| mensaje                                                                                                               |
| Existen requisitos obligatorios pendientes por adjuntar, por favor diríjase a la pestaña Requisitos para tramitarlos. |

Examples:
| tipo_documento       | documento  |
| CEDULA DE CIUDADANIA | 1234567890 |

Scenario: Validacion beneficiario oneroso en expedicion-modificacion
Given ya se tiene una poliza expedida <numeroPoliza>
When ingrese a modificar dicha cotizacion
And se ingrese a la opcion vehiculos
And ingrese la ciudad de circulacion <ciudad> y medio de venta <medioVenta>
And ingrese un beneficiario oneroso en modificacion <beneficiario>
And ingrese algunas coberturas en modificacion <deducible> <perdidaLlaves>
And intente cotizar el cambio de poliza
And expida el cambio de la poliza
Then debo ver un mensaje bloqueante
| mensaje                                                                                                               |
| Existen requisitos obligatorios pendientes por adjuntar, por favor diríjase a la pestaña Requisitos para tramitarlos. |

Examples:
| numeroPoliza  | ciudad               | beneficiario    | deducible | perdidaLlaves | medioVenta |
| TEST_22225550 | MEDELLIN (ANTIOQUIA) | Oneroso Leasing | 0         | Opción 1      | Televentas |

Scenario: Maximo valor de accesorios-inspeccion-importado por terceros
Meta: @manual
Given estoy cotizando una poliza de mrc con documento - se pone manual porque no funciona el mock y pq tiene prueba unitaria
| organizacion | producto | canal             | tipoPoliza | tipo_documento       | documento  | fecha_nacimiento | primer_nombre | primer_apellido | tipo_direccion          | direccion        | departamento | ciudad   | agente |
| Sura         | Autos    | Canal Tradicional | Individual | CEDULA DE CIUDADANIA | 1030765432 | 10/10/1973       | LUCIANA       | LONDOÑO         | DIRECCION DE RESIDENCIA | CALLE 65F #60-69 | Antioquia    | Medellin | INT-3  |
And ingrese los datos del asegurado <tipo_documento> <documento>
And ingrese los datos del vehiculo:
| placa | modelo | codigo_fasecolda | ciudad_circulacion   | vehiculo_servicio | chasis | motor | valor_asegurado | descuento | recargo | zona | plan         | medioVenta |
| ASDF2 | 2011   |                  | MEDELLIN (ANTIOQUIA) | Particular        | null   | null  | 17900000        | null      | null    | 2    | Plan Modular | Televentas |
When ingrese las coberturas:
| limite | deducible | abogado | PLlaves |
| 640.   | 0         | Si      | Si      |
And llegue a la expedicion de la poliza
And debo ver un mensaje opcional
| mensaje                                                                                                             |
| Existen requisitos opcionales pendientes por adjuntar, por favor diríjase a la pestaña Requisitos para tramitarlos. |
And cuando edite la transacion de la poliza
And vaya a vehiculos en expedicion
And seleccione la opcion importado por terceros
And cotice una poliza
And voy a expedir una poliza
And confirmo el mensaje de expedir poliza
And debo ver un mensaje bloqueante
| mensaje                                                                                                               |
| Existen requisitos obligatorios pendientes por adjuntar, por favor diríjase a la pestaña Requisitos para tramitarlos. |
And cuando edite la transacion de la poliza
And vaya a vehiculos en expedicion
And ingrese un valor maximo para los accesorios <accesorios>
And cotice una poliza
And voy a expedir una poliza
And confirmo el mensaje de expedir poliza
Then debo ver un mensaje bloqueante
| mensaje                                                                                                               |
| Existen requisitos obligatorios pendientes por adjuntar, por favor diríjase a la pestaña Requisitos para tramitarlos. |

Examples:
| accesorios | tipo_documento       | documento  |
| 2600000    | CEDULA DE CIUDADANIA | 1234567890 |

Scenario: Validar beneficiario oneroso en cancelacion
Meta: @manual
Given se tiene una poliza ya expedida
When seleccione la opcion cancelar poliza
And la poliza tenga un beneficiario oneroso
Then dee salir un mensaje bloqueante

Scenario: Validar sarlaft electronico
Meta: @manual
Given estoy expidiendo una poliza nueva
When seleccione la opcion expedir poliza
And el sarlaft fue electronico
Then se debe solicitar firma del cliente

