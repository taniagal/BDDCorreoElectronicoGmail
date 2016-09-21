Busqueda Actividades

Meta:
@issue #CDSEG-730
@tag automator: eliana_alvarez, sprint:1
@Sprint 1

Narrative:
Como usuario PolicyCenter
quiero poder buscar Actividades
para encontrar una cuenta especifica, poliza, transaccion de poliza, actividad

Scenario: Realizar busqueda de actividades por alguno de los filtros requeridos y estado de actividad sin resultados
GivenStories: stories/policycenter/login_policy.story
Given que me encuentro en la busqueda de actividades
When quiera realizar la busqueda de actividades por el filtro asignado a <usuario> y estado de actividad <estadoActividad>
Then me debe mostrar el siguiente mensaje <mensaje>

Examples:
|usuario|estadoActividad|mensaje
|Alice Applegate|Omitido|La búsqueda no devolvió resultados.

Scenario: Realizar busqueda de actividades por alguno de los filtros requeridos y prioridad sin resultados
Given que me encuentro en la busqueda de actividades
When quiera realizar la busqueda de actividades por el filtro asignado a <usuario> y prioridad <filtroPrioridad>
Then me debe mostrar el siguiente mensaje <mensaje>

Examples:
|usuario|filtroPrioridad|mensaje
|Alice Applegate|Urgente|La búsqueda no devolvió resultados.

Scenario: Realizar busqueda de actividades por alguno de los filtros requeridos y vencida sin resultados
Given que me encuentro en la busqueda de actividades
When quiera realizar la busqueda de actividades por el filtro asignado a <usuario> y vencida <filtroVencida>
Then me debe mostrar el siguiente mensaje <mensaje>

Examples:
|usuario|filtroVencida|mensaje
|Alice Applegate|Sí|La búsqueda no devolvió resultados.

Scenario: Realizar busqueda de actividades por alguno de los filtros requeridos y estado de actividad
Given que me encuentro en la busqueda de actividades
When quiera realizar la busqueda de actividades por el filtro asignado a <usuario> y estado de actividad <estadoActividad>
Then me debe listar la siguiente informacion para  las actividades asociadas al filtro de busqueda ingresado:
|prioridad|estadoActividad|asunto|id|titularCuenta|producto|asignadoPor|estado|
|Normal|Abierta|Dorian Eastmond Activity|C001888888|DORIAN STIWAR EASTMOND PULGARIN|||Kentucky|

Examples:
|usuario|estadoActividad|
|Alice Applegate|Abierta|


Scenario: Realizar busqueda de actividades por alguno de los filtros requeridos y prioridad
Given que me encuentro en la busqueda de actividades
When quiera realizar la busqueda de actividades por el filtro asignado a <usuario> y prioridad <filtroPrioridad>
Then me debe listar la siguiente informacion para  las actividades asociadas al filtro de busqueda ingresado:
|prioridad|estadoActividad|asunto|id|titularCuenta|producto|asignadoPor|estado|
|Normal|Abierta|Dorian Eastmond Activity|C001888888|DORIAN STIWAR EASTMOND PULGARIN|||Kentucky|

Examples:
|usuario|filtroPrioridad|
|Alice Applegate|Normal|

Scenario: Realizar busqueda de actividades por alguno de los filtros requeridos y vencida
Given que me encuentro en la busqueda de actividades
When quiera realizar la busqueda de actividades por el filtro asignado a <usuario> y vencida <filtroVencida>
Then me debe listar la siguiente informacion para  las actividades asociadas al filtro de busqueda ingresado:
|prioridad|estadoActividad|asunto|id|titularCuenta|producto|asignadoPor|estado|
|Normal|Abierta|Dorian Eastmond Activity|C001888888|DORIAN STIWAR EASTMOND PULGARIN|||Kentucky|

Examples:
|usuario|filtroVencida|
|Alice Applegate|No|

Scenario: Realizar busqueda de actividades por el filtro asignado a
Given que me encuentro en la busqueda de actividades
When quiera realizar la busqueda de actividades por el filtro asignado a <usuario>
Then me debe listar la siguiente informacion para  las actividades asociadas al filtro de busqueda ingresado:
|prioridad|estadoActividad|asunto|id|titularCuenta|producto|asignadoPor|estado|
|Normal|Abierta|Dorian Eastmond Activity|C001888888|DORIAN STIWAR EASTMOND PULGARIN|||Kentucky|>

Examples:
|usuario|
|Alice Applegate|

Scenario: Realizar busqueda de actividades por el filtro numero de poliza
Given que me encuentro en la busqueda de actividades
When quiera realizar la busqueda de actividades por el filtro numero de poliza<numeroPoliza>
Then me debe listar la siguiente informacion para  las actividades asociadas al filtro de busqueda ingresado:
|prioridad|estadoActividad|asunto|id|titularCuenta|producto|asignadoPor|estado|
|Normal|Abierta|Dorian Eastmond Activity|C001888888|DORIAN STIWAR EASTMOND PULGARIN|||Kentucky|

Examples:
|numeroPoliza|
|TEST_22222222|

Scenario: Realizar busqueda de actividades por el filtro numero de cuenta
Given que me encuentro en la busqueda de actividades
When quiera realizar la busqueda de actividades por el filtro numero de cuenta<numeroCuenta>
Then me debe listar la siguiente informacion para  las actividades asociadas al filtro de busqueda ingresado:
|prioridad|estadoActividad|asunto|id|titularCuenta|producto|asignadoPor|estado|
|Normal|Abierta|Dorian Eastmond Activity|C001888888|DORIAN STIWAR EASTMOND PULGARIN|||Kentucky|

Examples:
|numeroCuenta|
|C001888888|

Scenario: Realizar busqueda de actividades sin esfecificar un filtro
Given que me encuentro en la busqueda de actividades
When quiera realizar la busqueda de actividades sin algun filtro
Then me debe mostrar el siguiente mensaje <mensaje>

Examples:
|mensaje
|Especifique un asignado a, un número de póliza o un número de cuenta


Scenario: Realizar busqueda de actividades por alguno de los filtros requeridos
Given que me encuentro en la busqueda de actividades
When quiera realizar la busqueda de actividades por el filtro asignado a <usuario>
And quiera realizar la busqueda de actividades por el filtro numero de poliza<numeroPoliza>
And quiera realizar la busqueda de actividades por el filtro numero de cuenta<numeroCuenta>
Then me debe mostrar el siguiente mensaje <mensaje>

Examples:
|usuario|numeroPoliza|numeroCuenta|mensaje
|xxx|||Asignado a : No se encontró ningún usuario con el nombre "xxx". Use la ventana emergente de usuarios para seleccionar el usuario.
||xxx||La búsqueda no devolvió resultados.
|||xxx|La búsqueda no devolvió resultados.

Scenario: Realizar busqueda de actividades sin espeficar un filtro requerido pero si alguno opcional
Given que me encuentro en la busqueda de actividades
When quiera realizar la busqueda de actividades solo por el filtro estado de actividad <estadoActividad>
Then me debe mostrar el siguiente mensaje <mensaje>

Examples:
|estadoActividad|mensaje
|Completa|Especifique un asignado a, un número de póliza o un número de cuenta