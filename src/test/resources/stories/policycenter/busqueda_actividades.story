Meta:

Narrative:
Como usuario PolicyCenter
quiero poder buscar Actividades
para encontrar una cuenta especifica, poliza, transaccion de poliza, actividad


Scenario: Realizar busqueda de actividades por el filtro asignado a
GivenStories: stories/policycenter/login_policy.story
Given que me encuentro en la busqueda de actividades
When quiera realizar la busqueda de actividades por el filtro asignado a <usuario>
Then me debe listar la siguiente informacion para  las actividades asociadas al filtro de busqueda ingresado:
prioridad <prioridad>, estado <estadoActividad> , asunto <asunto>, Titular de la cuenta <titularCuenta>, producto
<producto>, asignado por <asignadoPor>, estado <estado>

Examples:
|usuario|prioridad|estadoActividad|asunto|titularCuenta|producto|asignadoPor|estado
|Alice Applegate|Normal|Abierta|Review Submission|Wright Construction|Compensación de los trabajadores||California

Scenario: Realizar busqueda de actividades por el filtro numero de poliza
Given que me encuentro en la busqueda de actividades
When quiera realizar la busqueda de actividades por el filtro numero de poliza<numeroPoliza>
Then me debe listar la siguiente informacion para  las actividades asociadas al filtro de busqueda ingresado:
prioridad <prioridad>, estado <estadoActividad> , asunto <asunto>, Titular de la cuenta <titularCuenta>, producto
<producto>, asignado por <asignadoPor>, estado <estado>

Examples:
|numeroPoliza|prioridad|estadoActividad|asunto|titularCuenta|producto|asignadoPor|estado
|7337120071|Normal|Abierta|Review Submission|Wright Construction|Compensación de los trabajadores||California

Scenario: Realizar busqueda de actividades por el filtro numero de cuenta
Given que me encuentro en la busqueda de actividades
When quiera realizar la busqueda de actividades por el filtro numero de cuenta<numeroCuenta>
Then me debe listar la siguiente informacion para  las actividades asociadas al filtro de busqueda ingresado:
prioridad <prioridad>, estado <estadoActividad> , asunto <asunto>, Titular de la cuenta <titularCuenta>, producto
<producto>, asignado por <asignadoPor>, estado <estado>

Examples:
|numeroCuenta|prioridad|estadoActividad|asunto|titularCuenta|producto|asignadoPor|estado
|C000212105|Normal|Abierta|Review Submission|Wright Construction|Compensación de los trabajadores||California

Scenario: Realizar busqueda de actividades sin esfecificar un filtro
Given que me encuentro en la busqueda de actividades
When quiera realizar la busqueda de actividades sin algun filtro
Then me debe mostrar el siguiente mensaje <mensaje>

Examples:
|mensaje
|Especifique un cesionario, un número de póliza o un número de cuenta