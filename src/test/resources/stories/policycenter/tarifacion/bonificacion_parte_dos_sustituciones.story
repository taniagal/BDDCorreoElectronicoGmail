Meta:
@lote5
@tag equipo: 4, sprint: 12


Narrative:
Como usuario de policy center
Deseo poder obtener y/o agregar la bonificacion comercial y la tecnica a un vehiculo durante una cotizacion o sustitucion

Scenario: Realizar una sustitucion tanto la bonificacion tecnica como comercial
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza de autos:
| producto | oficina | agente_oficina | tipo_documento       | fecha_nacimiento | primer_nombre | primer_apellido | tipo_direccion          | direccion        | departamento | ciudad   | agente | tipoPoliza |
| Autos    | 1059    | RANGEL         | CEDULA DE CIUDADANIA | 02/12/1990       | MIKASA        | AKERMAN         | DIRECCION DE RESIDENCIA | CALLE 54B #50-25 | Antioquia    | Medellin | INT-3  | Individual |
When ingrese los datos del asegurado <tipo_documento> <documento>
And ingrese los datos del vehiculo:
| placa  | modelo | codigo_fasecolda | ciudad_circulacion | vehiculo_servicio | chasis | motor | valor_asegurado | descuento | recargo | zona | plan               | medioVenta |
| random | 2016   | 00601182         | MEDELLIN           | Particular        | null   | null  | 165900000       | null      | null    | 2    | Plan Autos Clásico | Televentas |
And ingrese las coberturas para la sustitucion:
| limite | deducible | PTH | PPH    | GTH | abogado | AS                 |
| 640.   | 0         | 0   | 1.040. | 40. |         | Asistencia Clásica |
And expido la poliza y voy al archivo de poliza
And comience una sustitucion
Then se debe conservar la bonificacion <bonoC> calculada con los siguientes planes:
| plan               |
| Plan Autos Global  |
| Plan Conduce Mejor |
| Plan Motos         |
And se debe recalcular la bonificacion como poliza nueva con el plan <plan> <placa> <bonoCo>
And al cambiar el asegurado se debe conservar la bonificacion como poliza nueva:
| tipo_documento       | documento  | bonoC | bonoT |
| CEDULA DE CIUDADANIA | 1060447895 | 38    | 0     |
When cambio la bonificacion tecnica <bonoTec>
And agrega cobertura asistencia <asistencia>
And cotice y expida la sustitucion
Then se debe generar un UW con el mensaje <mensaje>

Examples:
| tipo_documento       | documento | bonoT | bonoTec | bonoC | bonoCo | placa  | plan                       | mensaje                                                                     | asistencia             |
| CEDULA DE CIUDADANIA | 11111111  | 0     | 40      | 38    | 8      | CYU123 | Plan Utilitarios y Pesados | La bonificación no coincide con lo arrojado por el sistema, Favor verificar | Asistencia Utilitarios |
