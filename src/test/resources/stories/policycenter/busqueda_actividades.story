Busqueda Actividades

Meta:

Narrative:
Como usuario PolicyCenter
quiero poder buscar Actividades
para encontrar una cuenta especifica, poliza, transaccion de poliza, actividad

Scenario: Realizar busqueda de actividades sin esfecificar un filtro
GivenStories: stories/policycenter/login_policy.story
Given que me encuentro en la busqueda de actividades
When quiera realizar la busqueda de actividades sin algun filtro
Then me debe mostrar el siguiente mensaje <mensaje>

Examples:
|mensaje|
|Especifique un asignado a, un número de póliza o un número de cuenta|


Scenario: Realizar busqueda de actividades por alguno de los filtros requeridos
Given que me encuentro en la busqueda de actividades
When quiera realizar la busqueda de actividades por el filtro asignado a <usuario>
And quiera realizar la busqueda de actividades por el filtro numero de poliza<numeroPoliza>
And quiera realizar la busqueda de actividades por el filtro numero de cuenta<numeroCuenta>
Then me debe mostrar el siguiente mensaje <mensaje>

Examples:
|usuario|numeroPoliza|numeroCuenta|mensaje|
|xxx|||Asignado a : No se encontró ningún usuario con el nombre "xxx". Use la ventana emergente de usuarios para seleccionar el usuario.|
||xxx||La búsqueda no devolvió resultados.|
|||xxx|La búsqueda no devolvió resultados.|