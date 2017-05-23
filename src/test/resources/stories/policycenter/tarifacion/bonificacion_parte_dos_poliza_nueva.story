Meta:
@lote5
@tag equipo: 4, sprint: 12


Narrative:
Como usuario de policy center
Deseo poder obtener y/o agregar la bonificacion comercial y la tecnica a un vehiculo durante una cotizacion

Scenario: Verificar generacion de UW Issue al cambiar la bonificacion consultada Poliza Nueva.
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza:
| cuenta     | producto | tipoPoliza |
| C002888993 | Autos    | Individual |
When ingrese los datos del asegurado <tipo_documento> <documento>
And ingrese los datos de vehiculo:
| placa  | modelo | codigo_fasecolda | ciudad_circulacion | vehiculo_servicio | chasis | motor | valor_asegurado | descuento | recargo | zona | plan         | medioVenta |
| CYU123 | 2016   | 00601182         | MEDELLIN           | Particular        | null   | null  | 165900000       | null      | null    | 2    | Plan Modular | Televentas |
And ingrese la bonificacion tecnica <bonoT> y la comercial <bonoC>
And ingrese las coberturas:
| limite | deducible | abogado | PLlaves |
| 640.   | 0         | Si      | Si      |
And expido la poliza
Then se debe generar un UW con el mensaje <mensaje>

Examples:
| bonoT | bonoC | tipo_documento       | documento  | mensaje                                                                     |
| 10    | 10    | CEDULA DE CIUDADANIA | 1397450166 | La bonificación no coincide con lo arrojado por el sistema, Favor verificar |