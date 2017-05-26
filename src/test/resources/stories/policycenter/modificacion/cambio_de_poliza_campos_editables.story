Meta:
@lote4
@tag equipo: 5, sprint: 14
@local

Narrative:
Como usuario de policy center en el rol de agente, csr, asegurador o gerente
Quiero poder realizar cambios a la poliza
Para ver informacion relacionada con esta



Scenario: Expedicion de modificacion en cambio de plan
GivenStories: stories/policycenter/login_policy.story
Given tengo una poliza de PA con los siguientes datos:
| tipo_documento       | documento  | cuenta     | producto | tipoPoliza | placa  | modelo | codigo_fasecolda | ciudad_circulacion   | vehiculo_servicio | chasis | motor | valor_asegurado | descuento | recargo | zona | plan         | limite | deducible | abogado | PLlaves | medioVenta |
| CEDULA DE CIUDADANIA | 1234567890 | C000888888 | Autos    | Individual | random | 2011   |                  | MEDELLIN (ANTIOQUIA) | Particular        | null   | null  | 17900000        | null      | null    | 2    | Plan Modular | 640.   | 0         | Si      | Si      | Televentas |
When ingrese a modificar dicha cotizacion
And se ingrese a la opcion vehiculos
And cambie el plan del vehiculo <plan>
And agrega cobertura asistencia <asistencia>
And intente cotizar el cambio de poliza
Then expida el cambio de la poliza

Examples:
| plan               | asistencia         |
| Plan Autos Clásico | Asistencia Clásica |

Scenario: Transporte de combustible
Given tengo una poliza de PA con los siguientes datos:
| tipo_documento       | documento  | cuenta     | producto | tipoPoliza | placa  | modelo | codigo_fasecolda | ciudad_circulacion   | vehiculo_servicio | chasis | motor | valor_asegurado | descuento | recargo | zona | plan         | limite | deducible | abogado | PLlaves | medioVenta |
| CEDULA DE CIUDADANIA | 1234567890 | C000888888 | Autos    | Individual | random | 2011   |                  | MEDELLIN (ANTIOQUIA) | Particular        | null   | null  | 17900000        | null      | null    | 2    | Plan Modular | 640.   | 0         | Si      | Si      | Televentas |
When ingrese a modificar dicha cotizacion
And se ingrese a la opcion vehiculos
And seleccione la opcion transporte de combustible
And intente cotizar el cambio de poliza
And expida el cambio de la poliza
Then debe mostrar un mensaje de autorizacion cuando voy a expedir
| mensaje                                                                    |
| Valor para campo transporta combustible no permitido. Por favor verifique. |

Examples:
||
||

Scenario: Cambio de plan basico a otro plan
Given tengo una poliza de PA con los siguientes datos:
| tipo_documento       | documento  | cuenta     | producto | tipoPoliza | placa  | modelo | codigo_fasecolda | ciudad_circulacion   | vehiculo_servicio | chasis | motor | valor_asegurado | descuento | recargo | zona | plan         | limite | deducible | abogado | PLlaves | medioVenta |
| CEDULA DE CIUDADANIA | 1234567890 | C000888888 | Autos    | Individual | random | 2011   |                  | MEDELLIN (ANTIOQUIA) | Particular        | null   | null  | 17900000        | null      | null    | 2    | Plan Modular | 640.   | 0         | Si      | Si      | Televentas |
When ingrese a modificar dicha cotizacion
And se ingrese a la opcion vehiculos
And cambie el plan del vehiculo a basico <plan>
And agrega cobertura asistencia <asistencia>
And cotice una poliza
And cuando edite la transacion de la poliza
And se ingrese a la opcion vehiculos
And cambie el plan del vehiculo <plan> clasico
And adicione un valor asegurado superior al permitido <valor>
And seleccione la opcion siguiente en modificacion
Then debe salir el mensaje de autorizacion por valor superior al permitido
| mensaje                                                                                                                                                                                                                                              |
| El valor asegurado del vehículo ($301.000.000,00) supera el límite máximo permitido por políticas. El aseguramiento de este carro así como la oferta presentada al cliente, deben ser avalados previamente por el Comité de Riesgo No Estándar Autos |

Examples:
| plan               | valor     | planBasico        | asistencia         |
| Plan Autos Clásico | 301000000 | Plan Autos Básico | Asistencia Clásica |

Scenario: Cambio de plan de autos modular a plan basico
Given tengo una poliza de PA con los siguientes datos:
| tipo_documento       | documento  | cuenta     | producto | tipoPoliza | placa  | modelo | codigo_fasecolda | ciudad_circulacion   | vehiculo_servicio | chasis | motor | valor_asegurado | descuento | recargo | zona | plan         | limite | deducible | abogado | PLlaves | medioVenta |
| CEDULA DE CIUDADANIA | 1234567890 | C000888888 | Autos    | Individual | random | 2011   |                  | MEDELLIN (ANTIOQUIA) | Particular        | null   | null  | 17900000        | null      | null    | 2    | Plan Modular | 640.   | 0         | Si      | Si      | Televentas |
When ingrese a modificar dicha cotizacion
And se ingrese a la opcion vehiculos
And cambie el plan del vehiculo a basico <plan>
And adicione un valor asegurado superior al permitido <valor>
And seleccione la opcion siguiente en modificacion
And intente cotizar el cambio de poliza
Then expida el cambio de la poliza

Examples:
| plan              | valor     |
| Plan Autos Básico | 301000000 |

Scenario: Validar requisitos en cambio de plan basico a otro plan
Meta: @manual
Given estoy realizando la modificacion de una poliza
When cambie el plan de basico a modular
And el vehiculo requiera inspeccion
And expida el cambio de esa poliza
And se debe generar un mensaje opcional
And vaya a la ventana de requisitos
Then debe de estar los nombres de los usuarios que requieren requisitos

