Meta:
@lote1
@tag equipo: 4, sprint: 12


Narrative:
Como usuario de policy center
Deseo poder obtener y/o agregar la bonificacion comercial y la tecnica a un vehiculo durante una cotizacion o modificacion

Scenario: Verificar generacion de UW Issue al cambiar la bonificacion consultada y la fecha de inicio de vigencia del cambio de poliza.
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza de autos:
| producto | tipo_documento       | fecha_nacimiento | primer_nombre | primer_apellido | tipo_direccion          | direccion         | departamento | ciudad   | agente | tipoPoliza | oficina | agente_oficina |
| Autos    | CEDULA DE CIUDADANIA | 05/09/1973       | ORTENCIA      | MONDRAGON       | DIRECCION DE RESIDENCIA | AVENIDA 30 #10-11 | Antioquia    | Medellin | INT-3  | Individual | 085     | DIRECTO        |
When ingrese los datos del asegurado <tipo_documento> <documento>
And ingrese los datos del vehiculo:
| placa  | modelo | codigo_fasecolda | ciudad_circulacion | vehiculo_servicio | chasis | motor | valor_asegurado | descuento | recargo | zona | plan               | medioVenta |
| random | 2016   | 00601182         | MEDELLIN           | Particular        | null   | null  | 165900000       | null      | null    | 2    | Plan Autos Clásico | Televentas |
And ingrese las coberturas de a la modificacion:
| limite | deducible | PTH | PPH    | GTH | abogado | AS                 |
| 640.   | 0         | 0   | 1.040. | 40. |         | Asistencia Clásica |
And ingrese a informacion de poliza de la poliza
And ingrese la Fecha Inicio Vigencia: -1
And cotice una poliza
And expido la poliza y voy al archivo de poliza
And cambio la fecha de vigencia
And cambio la bonificacion tecnica <bonoT>
And cotice y expida la poliza
Then se debe generar un UW con el mensaje <mensaje>

Examples:
| tipo_documento       | documento  | bonoT | mensaje                                                           |
| CEDULA DE CIUDADANIA | 1397450166 | 45    | La Bonificacion se ha modificado con una fecha superior a 30 dias |

Scenario: Verificar generacion de UW Issue al cambiar la bonificacion consultada Cambio de Poliza.
Given estoy cotizando una poliza de autos:
| producto | tipo_documento       | fecha_nacimiento | primer_nombre | primer_apellido | tipo_direccion          | direccion         | departamento | ciudad   | agente | tipoPoliza | oficina | agente_oficina |
| Autos    | CEDULA DE CIUDADANIA | 05/05/1965       | SILVIO        | ALBEIRO         | DIRECCION DE RESIDENCIA | AVENIDA 50 #14-15 | Antioquia    | Medellin | INT-3  | Individual | 085     | DIRECTO        |
When ingrese los datos del asegurado <tipo_documento> <documento>
And ingrese los datos del vehiculo:
| placa  | modelo | codigo_fasecolda | ciudad_circulacion | vehiculo_servicio | chasis | motor | valor_asegurado | descuento | recargo | zona | plan               | medioVenta |
| random | 2016   | 00601182         | MEDELLIN           | Particular        | null   | null  | 165900000       | null      | null    | 2    | Plan Autos Clásico | Televentas |
And ingrese las coberturas de RC, asistencia y hurto:
| limite | deducible | PTH | PPH    | GTH | abogado | AS                 |
| 640.   | 0         | 0   | 1.040. | 40. |         | Asistencia Clásica |
And expido la poliza y voy al archivo de poliza
And comience el cambio de poliza
And cambio la bonificacion tecnica <bonoT>
And cotice y expida la poliza
Then se debe generar un UW con el mensaje <mensaje>

Examples:
| tipo_documento       | documento | bonoT | mensaje                                                                     |
| CEDULA DE CIUDADANIA | 11111111  | 40    | La bonificación no coincide con lo arrojado por el sistema, Favor verificar |



