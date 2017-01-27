Cambio De Poliza

Meta:
@lote3
@issue #SUGWUSC-15127
@tag equipo: 3
@local
Sprint 5

Narrative:
Como usuario de policy center
Al realizar el cambio de una poliza quiero identificar cuando una poliza tiene reaseguro especial o no.

Scenario:  Realizar cambio de una poliza PA con retroactividad
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza de autos:
|organizacion|producto|canal            |tipoPoliza|tipo_documento      |fecha_nacimiento|primer_nombre|primer_apellido|tipo_direccion         |direccion       |departamento|ciudad  |agente|
|Sura        |Autos   |Canal Tradicional|Individual|CEDULA DE CIUDADANIA|02/12/1990      |EREN         |JAEGER         |DIRECCION DE RESIDENCIA|CALLE 54B #50-25|Antioquia   |Medellin|INT-3 |
When ingrese los datos del asegurado <tipo_documento> <documento>
And ingrese los datos del vehiculo:
|placa |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis|motor|valor_asegurado|descuento|recargo|zona|plan        |
|random|2016  |00601182        |MEDELLIN          |Particular       |null  |null |165900000      |null     |null   |2   |Plan Modular|
And ingrese las coberturas:
|limite|deducible|abogado |PLlaves |
|1.440 |0        |Opción 1|Opción 1|
And cambie la fecha de inicio de vigencia <dias> de pa poliza
And cotice una poliza
And expido la poliza y voy al archivo de poliza
And quiero relizar el cambio de una poliza
Then debo visualizar la advertencia con el <mensaje>

Examples:
|tipo_documento      |documento |dias|cuenta     | producto|agente|mensaje|
|CEDULA DE CIUDADANIA|1060447895|-31 |C1060447895| Autos   |AGUAS |La fecha inicio de vigencia no cumple con el parámetro de retroactividad definido (30 días) |


Scenario:  Realizar cambio de una poliza PA con emision anticipada
Given que voy a buscar una poliza  <buscarNumeroPoliza>
When quiero relizar el cambio de una poliza
Then debo visualizar la advertencia con el <mensaje>

Examples:
|buscarNumeroPoliza|mensaje|
|TEST_22222222     |La fecha inicio de vigencia no cumple con el parámetro de emisión anticipada definido (60 días)       |

Scenario:  Realizar cambio de una poliza CP con retroactividad
Given que voy a buscar una poliza  <buscarNumeroPoliza>
When quiero relizar el cambio de una poliza
Then debo visualizar la advertencia con el <mensaje>

Examples:
|buscarNumeroPoliza|mensaje|
|TEST_22222236     |La fecha inicio de vigencia no cumple con el parámetro de retroactividad definido (60 días)       |

Scenario:  Realizar cambio de una poliza CP con emision anticipada
Given que voy a buscar una poliza  <buscarNumeroPoliza>
When quiero relizar el cambio de una poliza
Then debo visualizar la advertencia con el <mensaje>

Examples:
|buscarNumeroPoliza|mensaje|
|TEST_22222237     |La fecha inicio de vigencia no cumple con el parámetro de emisión anticipada definido (45 días)|

Scenario:  Validacion de fecha exacta para cambio de poliza
Meta:
@manual
Given que voy a buscar una de las polizas <buscarNumeroPoliza>
When quiero relizar el cambio de una poliza con la fecha vigente
Then no debo visualizar la advertencia con el <mensaje>

Examples:
|buscarNumeroPoliza |mensaje|
|TEST_22266668      |La fecha inicio de vigencia no cumple con el parámetro de emisión anticipada definido (45 días)|

Scenario:  Realizar cambio de una poliza que tiene reaseguro especial
Meta:
@manual
Given estoy cotizando la poliza basado en otro envio <envio>
And le ingreso el reaseguro especial
When agregue una nueva ubicacion departamento <departamento>, ciuad <ciudad>, direccion <direccion>
And descripcion <descripcion>, actividad economica <actividad>
When seleccione la cobertura:
|valorReconstruccion|valorAsegurado|valorComercial|cobertura|
|100000000          |100000000     |null          |Terremoto|
And cotice el articulo bloqueado
And expido la poliza y voy al archivo de poliza
And que tiene marcado el campo reaseguro especial en <reaseguro>
And quiero relizar el cambio de una poliza
Then debo visualizar la advertencia con el <mensaje>

Examples:
|envio   |reaseguro|departamento|ciudad  |direccion        |descripcion  |actividad                    |mensaje
|22222211|Sí       |Antioquia   |Medellin|CR 44 A # 45 - 00|Edificio Core|Acabado de productos textiles|Esta poliza tiene reaseguro especial. Debe validar que las condiciones otorgadas no amparadas por el contrato automático tengan respaldo facultativo o aceptación especial.