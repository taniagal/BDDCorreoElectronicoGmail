Meta:
@lote2
@issue #CDSEG-834
@tag equipo: 5, sprint: 10

Narrative:
Como usuario de negocio
Quiero que se levante el requisito de sarlaft de en el pub Visual de requisitos
y habilitar el boton de Sarlaft para cada figura diferente (Tomador, asegurado  y beneficiario en el caso de que este sea gratiuto)

Scenario: Habilitar opcion Sarlaft en expedicion
GivenStories: stories/policycenter/login_policy.story

Given voy a crear una nueva cotizacion
And crear una cotizacion nueva con la cuenta <cuenta>
And seleccione el agente y la oficina de radicacion:
| oficina | agente_oficina |
| 1073    | DIRECTO        |
When seleccione el producto <producto> para expedir la poliza
And ingrese la organizacion, canal y tipo de poliza
And ingrese los datos del asegurado <tipo_documento> <documento>
And ingrese los datos del vehiculo:
|placa |modelo|codigo_fasecolda|ciudad_circulacion  |vehiculo_servicio|chasis|motor|valor_asegurado|descuento|recargo|zona|plan              |medioVenta|
|TYU130|2016  |00601182        |MEDELLIN (ANTIOQUIA)|Particular       |null  |null |165900000      |null     |null   |2   |Plan Autos Clásico|Televentas|
When ingrese las coberturas a vehiculo:
| limite | deducible | AS                 |
| 640.0  | 0         | Asistencia Clásica |
And intente cotizar
And intente expedir la poliza cuyas figuras requieran Sarlaft
And debe aparecer un mensaje bloqueante en la ventana de requisitos
|mensaje|
|El contacto CAROLINA OCHOA con DNI C71318883 requiere sarlaft, diríjase a análisis de riesgo para diligenciarlo.|
And vaya a la opcion de analisis de riesgo
Then debo ver un UW issue que indique que se requiere diligenciar Sarlaft
|mensaje|
|Para el contacto CAROLINA OCHOA con número de documento 71318883 se requiere que diligencie el Sarlaft; ingrese aquí para diligenciarlo.|

Examples:
|tipo_documento      |documento |cuenta     |producto|
|CEDULA DE CIUDADANIA|71318883  |C000888888 |Autos   |

Scenario: Habilitar opcion Sarlaft en modificacion
Given existe una cotizacion <numeroCotizacion>
When intente expedir la modificacion cuyas figuras requieran Sarlaft
And debe aparecer un mensaje bloqueante en la ventana de requisitos
|mensaje|
|El contacto ANTONIO RESTREPO con DNI C71123456 requiere sarlaft, diríjase a análisis de riesgo para diligenciarlo.|
And vaya a la opcion de analisis de riesgo
Then debo ver un UW issue que indique que se requiere diligenciar Sarlaft
|mensaje|
|Para el contacto ANTONIO RESTREPO con número de documento 71123456 se requiere que diligencie el Sarlaft; ingrese aquí para diligenciarlo.|

Examples:
|numeroCotizacion|
|22222244        |

Scenario: Habilitar opcion Sarlaft en Renovacion - Tomador
Meta:@manual
Given existe una cotizacion
When intente expedir la modificacion cuyas figuras requieran Sarlaft
And vaya a la opcion de analisis de riesgo
Then debo ver un UW issue que indique que se requiere diligenciar Sarlaft en renovacion
|mensaje|
|Para el contacto ANTONIO RESTREPO con número de documento 71123456 se requiere que diligencie el Sarlaft; ingrese aquí para diligenciarlo|