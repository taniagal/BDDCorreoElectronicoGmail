Meta:
@lote3
@issue #CDSEG-730
@tag equipo: 1, sprint: 1

Narrative:
Como usuario PolicyCenter
quiero poder buscar Actividades
para encontrar una cuenta especifica, poliza, transaccion de poliza, actividad

Scenario: Asignar actividad a poliza expedida
GivenStories: stories/policycenter/login_policy.story
Given ya se tiene una poliza expedida <numeroPoliza>
When agregue una actividad a la poliza
Then la poliza debe quedar con una actividad asignada
Given que me encuentro en la busqueda de actividades
When quiera realizar la busqueda de actividades por el filtro asignado a Usuario: Alice Applegate y Estado de actividad: Omitido
Then me debe mostrar el siguiente Mensaje: La búsqueda no devolvió resultados.
Given que me encuentro en la busqueda de actividades
When quiera realizar la busqueda de actividades por el filtro asignado a Usuario: Alice Applegate y Prioridad: Urgente
Then me debe mostrar el siguiente Mensaje: La búsqueda no devolvió resultados.
Given que me encuentro en la busqueda de actividades
When quiera realizar la busqueda de actividades por el filtro asignado a Usuario: Alice Applegate y Vencida: Sí
Then me debe mostrar el siguiente Mensaje: La búsqueda no devolvió resultados.
Given que me encuentro en la busqueda de actividades
When quiera realizar la busqueda de actividades por el filtro asignado a Usuario: Super User y Estado de actividad: Abierta
Then me debe listar la siguiente informacion para  las actividades asociadas al filtro de busqueda ingresado:
| prioridad | estadoActividad | asunto             | id         | titularCuenta                   | producto | asignadoPor | estado    |
| Alta      | Abierta         | Crear agente nuevo | C001888888 | DORIAN STIWAR EASTMOND PULGARIN |          | Super User  | Antioquia |
Given que me encuentro en la busqueda de actividades
When quiera realizar la busqueda de actividades por el filtro asignado a Usuario: Super User y Prioridad: Alta
Then me debe listar la siguiente informacion para  las actividades asociadas al filtro de busqueda ingresado:
| prioridad | estadoActividad | asunto             | id         | titularCuenta                   | producto | asignadoPor | estado    |
| Alta      | Abierta         | Crear agente nuevo | C001888888 | DORIAN STIWAR EASTMOND PULGARIN |          | Super User  | Antioquia |
Given que me encuentro en la busqueda de actividades
When quiera realizar la busqueda de actividades por el filtro asignado a Usuario: Super User y Vencida: No
Then me debe listar la siguiente informacion para  las actividades asociadas al filtro de busqueda ingresado:
| prioridad | estadoActividad | asunto             | id         | titularCuenta                   | producto | asignadoPor | estado    |
| Alta      | Abierta         | Crear agente nuevo | C001888888 | DORIAN STIWAR EASTMOND PULGARIN |          | Super User  | Antioquia |
Given que me encuentro en la busqueda de actividades
When quiera realizar la busqueda de actividades por el filtro asignado a Uusuario: Super User
Then me debe listar la siguiente informacion para  las actividades asociadas al filtro de busqueda ingresado:
| prioridad | estadoActividad | asunto             | id         | titularCuenta                   | producto | asignadoPor | estado    |
| Alta      | Abierta         | Crear agente nuevo | C001888888 | DORIAN STIWAR EASTMOND PULGARIN |          | Super User  | Antioquia |
Given que me encuentro en la busqueda de actividades
When quiera realizar la busqueda de actividades por el filtro Numero de Poliza: TEST_22222222
Then me debe listar la siguiente informacion para  las actividades asociadas al filtro de busqueda ingresado:
| prioridad | estadoActividad | asunto             | id         | titularCuenta                   | producto | asignadoPor | estado    |
| Alta      | Abierta         | Crear agente nuevo | C001888888 | DORIAN STIWAR EASTMOND PULGARIN |          | Super User  | Antioquia |
Given que me encuentro en la busqueda de actividades
When quiera realizar la busqueda de actividades por el filtro Numero de Cuenta: C001888888
Then me debe listar la siguiente informacion para  las actividades asociadas al filtro de busqueda ingresado:
| prioridad | estadoActividad | asunto             | id         | titularCuenta                   | producto | asignadoPor | estado    |
| Alta      | Abierta         | Crear agente nuevo | C001888888 | DORIAN STIWAR EASTMOND PULGARIN |          | Super User  | Antioquia |
Given que me encuentro en la busqueda de actividades
When quiera realizar la busqueda de actividades sin algun filtro
Then me debe mostrar el siguiente Mensaje: Especifique un asignado a, un número de póliza o un número de cuenta
Given que me encuentro en la busqueda de actividades
When quiera realizar la busqueda de actividades solo por el filtro estado de actividad <estadoActividad>
Then me debe mostrar el siguiente Mensaje: Especifique un asignado a, un número de póliza o un número de cuenta

Examples:
| numeroPoliza  | estadoActividad |
| TEST_22222222 | Completa        |


Scenario: Realizar busqueda de actividades por alguno de los filtros requeridos
Given que me encuentro en la busqueda de actividades
When quiera realizar la busqueda de actividades por el filtro asignado a <usuario>
And quiera realizar la busqueda de actividades por el filtro numero de poliza<nroPoliza>
And quiera realizar la busqueda de actividades por el filtro numero de cuenta<numeroCuenta>
Then me debe mostrar el siguiente mensaje <mensaje>

Examples:
| usuario | nroPoliza | numeroCuenta | mensaje                                                                                                                           |
| xxx     |           |              | Asignado a : No se encontró ningún usuario con el nombre "xxx". Use la ventana emergente de usuarios para seleccionar el usuario. |
|         | xxx       |              | La búsqueda no devolvió resultados.                                                                                               |
|         |           | xxx          | La búsqueda no devolvió resultados.                                                                                               |
