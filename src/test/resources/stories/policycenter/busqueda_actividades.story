Busqueda Actividades

Meta:
@lote2
@issue #CDSEG-730
@tag equipo: 1, sprint:1
@Sprint 1

Narrative:
Como usuario PolicyCenter
quiero poder buscar Actividades
para encontrar una cuenta especifica, poliza, transaccion de poliza, actividad

Scenario: Asignar actividad a poliza expedida
GivenStories: stories/policycenter/login_policy.story
Given ya se tiene una poliza expedida <numeroPoliza>
When agregue una actividad a la poliza
Then la poliza debe quedar con una actividad asignada

Examples:
| numeroPoliza  |
| TEST_22222222 |


Scenario: Realizar busqueda de actividades por alguno de los filtros requeridos y estado de actividad sin resultados
Given que me encuentro en la busqueda de actividades
When quiera realizar la busqueda de actividades por el filtro asignado a <usuario> y estado de actividad <estadoActividad>
Then me debe mostrar el siguiente mensaje <mensaje>

Examples:
| usuario         | estadoActividad | mensaje                             |
| Alice Applegate | Omitido         | La búsqueda no devolvió resultados. |

Scenario: Realizar busqueda de actividades por alguno de los filtros requeridos y prioridad sin resultados
Given que me encuentro en la busqueda de actividades
When quiera realizar la busqueda de actividades por el filtro asignado a <usuario> y prioridad <filtroPrioridad>
Then me debe mostrar el siguiente mensaje <mensaje>

Examples:
| usuario         | filtroPrioridad | mensaje                             |
| Alice Applegate | Urgente         | La búsqueda no devolvió resultados. |

Scenario: Realizar busqueda de actividades por alguno de los filtros requeridos y vencida sin resultados
Given que me encuentro en la busqueda de actividades
When quiera realizar la busqueda de actividades por el filtro asignado a <usuario> y vencida <filtroVencida>
Then me debe mostrar el siguiente mensaje <mensaje>

Examples:
| usuario         | filtroVencida | mensaje                             |
| Alice Applegate | Sí            | La búsqueda no devolvió resultados. |

Scenario: Realizar busqueda de actividades por alguno de los filtros requeridos y estado de actividad
Given que me encuentro en la busqueda de actividades
When quiera realizar la busqueda de actividades por el filtro asignado a <usuario> y estado de actividad <estadoActividad>
Then me debe listar la siguiente informacion para  las actividades asociadas al filtro de busqueda ingresado:
| prioridad | estadoActividad | asunto             | id         | titularCuenta                   | producto | asignadoPor | estado    |
| Alta      | Abierta         | Crear agente nuevo | C001888888 | DORIAN STIWAR EASTMOND PULGARIN |          | Super User  | Antioquia |

Examples:
| usuario    | estadoActividad |
| Super User | Abierta         |


Scenario: Realizar busqueda de actividades por alguno de los filtros requeridos y prioridad
Given que me encuentro en la busqueda de actividades
When quiera realizar la busqueda de actividades por el filtro asignado a <usuario> y prioridad <filtroPrioridad>
Then me debe listar la siguiente informacion para  las actividades asociadas al filtro de busqueda ingresado:
| prioridad | estadoActividad | asunto             | id         | titularCuenta                   | producto | asignadoPor | estado    |
| Alta      | Abierta         | Crear agente nuevo | C001888888 | DORIAN STIWAR EASTMOND PULGARIN |          | Super User  | Antioquia |

Examples:
| usuario    | filtroPrioridad |
| Super User | Alta            |

Scenario: Realizar busqueda de actividades por alguno de los filtros requeridos y vencida
Given que me encuentro en la busqueda de actividades
When quiera realizar la busqueda de actividades por el filtro asignado a <usuario> y vencida <filtroVencida>
Then me debe listar la siguiente informacion para  las actividades asociadas al filtro de busqueda ingresado:
| prioridad | estadoActividad | asunto             | id         | titularCuenta                   | producto | asignadoPor | estado    |
| Alta      | Abierta         | Crear agente nuevo | C001888888 | DORIAN STIWAR EASTMOND PULGARIN |          | Super User  | Antioquia |

Examples:
| usuario    | filtroVencida |
| Super User | No            |

Scenario: Realizar busqueda de actividades por el filtro asignado a
Given que me encuentro en la busqueda de actividades
When quiera realizar la busqueda de actividades por el filtro asignado a <usuario>
Then me debe listar la siguiente informacion para  las actividades asociadas al filtro de busqueda ingresado:
| prioridad | estadoActividad | asunto             | id         | titularCuenta                   | producto | asignadoPor | estado    |
| Alta      | Abierta         | Crear agente nuevo | C001888888 | DORIAN STIWAR EASTMOND PULGARIN |          | Super User  | Antioquia |

Examples:
| usuario    |
| Super User |

Scenario: Realizar busqueda de actividades por el filtro numero de poliza
Given que me encuentro en la busqueda de actividades
When quiera realizar la busqueda de actividades por el filtro numero de poliza<numeroPoliza>
Then me debe listar la siguiente informacion para  las actividades asociadas al filtro de busqueda ingresado:
| prioridad | estadoActividad | asunto             | id         | titularCuenta                   | producto | asignadoPor | estado    |
| Alta      | Abierta         | Crear agente nuevo | C001888888 | DORIAN STIWAR EASTMOND PULGARIN |          | Super User  | Antioquia |

Examples:
| numeroPoliza  |
| TEST_22222222 |

Scenario: Realizar busqueda de actividades por el filtro numero de cuenta
Given que me encuentro en la busqueda de actividades
When quiera realizar la busqueda de actividades por el filtro numero de cuenta<numeroCuenta>
Then me debe listar la siguiente informacion para  las actividades asociadas al filtro de busqueda ingresado:
| prioridad | estadoActividad | asunto             | id         | titularCuenta                   | producto | asignadoPor | estado    |
| Alta      | Abierta         | Crear agente nuevo | C001888888 | DORIAN STIWAR EASTMOND PULGARIN |          | Super User  | Antioquia |

Examples:
| numeroCuenta |
| C001888888   |

Scenario: Realizar busqueda de actividades sin esfecificar un filtro
Given que me encuentro en la busqueda de actividades
When quiera realizar la busqueda de actividades sin algun filtro
Then me debe mostrar el siguiente mensaje <mensaje>

Examples:
| mensaje                                                              |
| Especifique un asignado a, un número de póliza o un número de cuenta |


Scenario: Realizar busqueda de actividades por alguno de los filtros requeridos
Given que me encuentro en la busqueda de actividades
When quiera realizar la busqueda de actividades por el filtro asignado a <usuario>
And quiera realizar la busqueda de actividades por el filtro numero de poliza<numeroPoliza>
And quiera realizar la busqueda de actividades por el filtro numero de cuenta<numeroCuenta>
Then me debe mostrar el siguiente mensaje <mensaje>

Examples:
| usuario | numeroPoliza | numeroCuenta | mensaje                                                                                                                           |
| xxx     |              |              | Asignado a : No se encontró ningún usuario con el nombre "xxx". Use la ventana emergente de usuarios para seleccionar el usuario. |
|         | xxx          |              | La búsqueda no devolvió resultados.                                                                                               |
|         |              | xxx          | La búsqueda no devolvió resultados.                                                                                               |

Scenario: Realizar busqueda de actividades sin espeficar un filtro requerido pero si alguno opcional
Given que me encuentro en la busqueda de actividades
When quiera realizar la busqueda de actividades solo por el filtro estado de actividad <estadoActividad>
Then me debe mostrar el siguiente mensaje <mensaje>

Examples:
| estadoActividad | mensaje                                                              |
| Completa        | Especifique un asignado a, un número de póliza o un número de cuenta |