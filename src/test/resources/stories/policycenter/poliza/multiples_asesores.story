Meta:
@lote3
@tag equipo: billing, sprint: 13

Narrative:
Como usuario de policy center se requiere la creacion de una tabla relacionada al Policy Period que permita el almacenamiento
de varios producer code para una poliza.
Se requiere cuando se esté en los datos de la póliza agregar  botones de insertar o borrar asesores (productores).
Para el ingreso de los datos del asesor se debe tener los siguientes campos
Código de asesor (productor): Este campo es obligatorio.
Porcentaje: cada uno de los asesores debe tener un porcentaje de participación la suma de estos  siempre debe de ser del 100.
Rol de asesor Siempre debe haber un asesor líder.  El producer of record será considerado como el asesor líder de la póliza.
El cambio de los asesores se hace como un traspaso de cartera y se implementará en otras HU.


Scenario: 1_Agregar mas de un asesor a una poliza MRC
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza de mrc:
| oficina | agente_oficina | organizacion | producto                | tipo_documento       | fecha_nacimiento | primer_nombre | primer_apellido | tipo_direccion          | direccion        | departamento | ciudad   | agente |
| 1073    | DIRECTO        | Sura         | Multiriesgo corporativo | CEDULA DE CIUDADANIA | 02/12/1990       | MARIO         | AKERMAN         | DIRECCION DE RESIDENCIA | CALLE 54B #50-25 | Antioquia    | Medellin | INT-3  |
When Debe permitir el ingreso de maximo 8 asesores en la poliza, validando la participacion del 100% de los asesores que intervienen en la poliza:
| codigo | participacion | rol       |
| 10995  | 30            | Lider     |
| 11005  | 10            | Adicional |
| 193    | 10            | Adicional |
| 10686  | 10            | Adicional |
| 10671  | 10            | Adicional |
| 9628   | 10            | Adicional |
| 1916   | 10            | Adicional |
| 5676   | 10            | Adicional |
Then Debe quedar un asesor con rol:
| rol   | validarDato |
| Lider | rol         |
Examples:
|  |
|  |

Scenario: 2_Agregar mas de 8 asesores a una poliza MRC
Given estoy cotizando una poliza de mrc:
| oficina | agente_oficina | organizacion | producto                | tipo_documento       | fecha_nacimiento | primer_nombre | primer_apellido | tipo_direccion          | direccion        | departamento | ciudad   | agente |
| 1073    | DIRECTO        | Sura         | Multiriesgo corporativo | CEDULA DE CIUDADANIA | 02/12/1990       | MARIO         | AKERMAN         | DIRECCION DE RESIDENCIA | CALLE 54B #50-25 | Antioquia    | Medellin | INT-3  |
When Debe permitir el ingreso de maximo 8 asesores en la poliza, validando la participacion del 100% de los asesores que intervienen en la poliza:
| codigo | participacion | rol       |
| 10995  | 30            | Lider     |
| 11005  | 10            | Adicional |
| 193    | 10            | Adicional |
| 10686  | 10            | Adicional |
| 10671  | 10            | Adicional |
| 9628   | 10            | Adicional |
| 1916   | 10            | Adicional |
| 5676   | 10            | Adicional |
| 5676   | 10            | Adicional |
Then validar el mensajes:
| mensaje                                      |
| La póliza debe tener máximo 8 intermediarios |
Examples:
|  |
|  |

Scenario: 3_Validar participacion de los asesores MRC
When tenga una poliza mrc con los asesores ingresados
Then validar el mensajes:
| mensaje                                                                            |
| El total de la participación de todos los asesores en la póliza debe ser del 100%. |
Examples:
|  |
|  |


Scenario: 4_Validar existencia de un solo codigo asesor MRC
When tenga una poliza mrc con los asesores ingresados
Then Debe quedar un codigo de asesor:
| mensaje                                                           | validarDato  |
| La póliza ya cuenta con un asesor con código 5676 , favor validar | codigoAsesor |
Examples:
|  |
|  |


Scenario: 5_Agregar mas de un asesor a una poliza AUTOS
Given estoy cotizando una poliza de autos:
| oficina | agente_oficina | organizacion | tipoPoliza | producto | tipo_documento       | fecha_nacimiento | primer_nombre | primer_apellido | tipo_direccion          | direccion        | departamento | ciudad   | agente |
| 1059    | DIRECTO        | Sura         | Individual | Autos    | CEDULA DE CIUDADANIA | 02/12/1990       | AUTOMAN       | AKERMAN         | DIRECCION DE RESIDENCIA | CALLE 54B #50-25 | Antioquia    | Medellin | INT-3  |
When Debe permitir el ingreso de maximo 8 asesores en la poliza, validando la participacion del 100% de los asesores que intervienen en la poliza:
| codigo | participacion | rol       |
| 10960  | 30            | Lider     |
| 10962  | 10            | Adicional |
| 10787  | 10            | Adicional |
| 10714  | 10            | Adicional |
| 10272  | 10            | Adicional |
| 1681   | 10            | Adicional |
| 5676   | 10            | Adicional |
| 5947   | 10            | Adicional |
Then Debe quedar un asesor con rol:
| rol   | validarDato |
| Lider | rol         |
Examples:
|  |
|  |


Scenario: 6_Agregar mas de 8 asesores a una poliza AUTOS
Given estoy cotizando una poliza de autos:
| oficina | agente_oficina | organizacion | tipoPoliza | producto | tipo_documento       | fecha_nacimiento | primer_nombre | primer_apellido | tipo_direccion          | direccion        | departamento | ciudad   | agente |
| 1059    | DIRECTO        | Sura         | Individual | Autos    | CEDULA DE CIUDADANIA | 02/12/1990       | AUTOMAN       | AKERMAN         | DIRECCION DE RESIDENCIA | CALLE 54B #50-25 | Antioquia    | Medellin | INT-3  |
When Debe permitir el ingreso de maximo 8 asesores en la poliza, validando la participacion del 100% de los asesores que intervienen en la poliza:
| codigo | participacion | rol       |
| 10960  | 30            | Lider     |
| 10962  | 10            | Adicional |
| 10787  | 10            | Adicional |
| 10714  | 10            | Adicional |
| 10272  | 10            | Adicional |
| 1681   | 10            | Adicional |
| 5676   | 10            | Adicional |
| 5947   | 10            | Adicional |
| 5947   | 10            | Adicional |
Then validar el mensajes:
| mensaje                                      |
| La póliza debe tener máximo 8 intermediarios |

Scenario: 7_validar participacion de los asesores AUTOS
When tenga una poliza de autos con los asesores ingresados
Then validar el mensajes:
| mensaje                                                                            |
| El total de la participación de todos los asesores en la póliza debe ser del 100%. |
Examples:
|  |
|  |

Scenario: 8_Validar existencia de un solo codigo asesor AUTOS
When tenga una poliza de autos con los asesores ingresados
Then Debe quedar un codigo de asesor:
| mensaje                                                           | validarDato  |
| La póliza ya cuenta con un asesor con código 5947 , favor validar | codigoAsesor |
Examples:
|  |
|  |