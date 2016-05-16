Meta:

Narrative:
Como usuario PolicyCenter
quiero poder buscar Actividades
para encontrar una cuenta especifica, poliza, transaccion de poliza, actividad


Scenario: Realizar busqueda de actividades por el filtro asignado a
GivenStories: stories/policycenter/login_policy.story
Given que me encuentro en la busqueda de actividades
When quiera realizar la busqueda de actividades por el filtro asignado a <usuario>
Then me debe listar la siguiente informacion para  las actividades asociadas al filtro de busqueda ingresado(s):
columna con icono estrella(tootip: Actividad nueva o actualizada) <icono>, Fecha de vencimiento <fechaVencimiento>,
prioridad <prioridad>, estado <estadoActividad> , asunto <asunto>, ID <id>, Titular de la cuenta <titularCuenta>, producto
<producto>, asignado por <asignadoPor>, estado <estado>

Examples:
|usuario|icono|fechaVencimiento|prioridad|estadoActividad|asunto|id|titularCuenta|producto|asignadoPor|estado
|Alice Applegate||02/05/16|Normal|Abierto|Review Submission|3143377391|Wright Construction|Compensación de los
trabajadores||California

Scenario: Realizar busqueda de actividades por el filtro numero de poliza
GivenStories: stories/policycenter/login_policy.story
Given que me encuentro en la busqueda de actividades
When quiera realizar la busqueda de actividades por el filtro numero de poliza<numeroPoliza>
Then me debe listar la siguiente informacion para  las actividades asociadas al filtro de busqueda ingresado(s):
columna con icono estrella(tootip: Actividad nueva o actualizada) <icono>, Fecha de vencimiento <fechaVencimiento>,
prioridad <prioridad>, estado <estadoActividad> , asunto <asunto>, ID <id>, Titular de la cuenta <titularCuenta>, producto
<producto>, asignado por <asignadoPor>, estado <estado>

Examples:
|numeroPoliza|icono|fechaVencimiento|prioridad|estadoActividad|asunto|id|titularCuenta|producto|asignadoPor|estado
|xxx||02/05/16|Normal|Abierto|Review Submission|3143377391|Wright Construction|Compensación de los
trabajadores||California

Scenario: Realizar busqueda de actividades por el filtro numero de cuenta
GivenStories: stories/policycenter/login_policy.story
Given que me encuentro en la busqueda de actividades
When quiera realizar la busqueda de actividades por el filtro numero de cuenta<numeroCuenta>
Then me debe listar la siguiente informacion para  las actividades asociadas al filtro de busqueda ingresado(s):
columna con icono estrella(tootip: Actividad nueva o actualizada) <icono>, Fecha de vencimiento <fechaVencimiento>,
prioridad <prioridad>, estado <estadoActividad> , asunto <asunto>, ID <id>, Titular de la cuenta <titularCuenta>, producto
<producto>, asignado por <asignadoPor>, estado <estado>

Examples:
|numeroCuenta|icono|fechaVencimiento|prioridad|estadoActividad|asunto|id|titularCuenta|producto|asignadoPor|estado
|xxx||02/05/16|Normal|Abierto|Review Submission|3143377391|Wright Construction|Compensación de los
trabajadores||California