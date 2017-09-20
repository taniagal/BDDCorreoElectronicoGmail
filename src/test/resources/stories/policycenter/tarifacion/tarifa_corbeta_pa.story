Meta:
@lote3
@tag equipo: 4, sprint: 12

Narrative:
Como usuario de policy center
Al cotizar una poliza de PA quiero ser capaz de utilizar la tarifa para el plan Alianza coberta.


Scenario:  Realizar una cotizacion donde la organización y canal son Corbeta
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza:
| cuenta      | producto | oficina | agente_oficina | tipoPoliza |
| C1060447895 | Autos    | 3300    | DIRECTO        | Individual |
When ingrese los datos del asegurado <tipo_documento> <documento>
And ingrese los datos del vehiculo:
| placa  | modelo | codigo_fasecolda | ciudad_circulacion | vehiculo_servicio | chasis | motor | valor_asegurado | descuento | recargo | zona | plan         | medioVenta |
| UIY456 | 2018   | 00601182         | MEDELLIN           | Particular        | null   | null  | 165900000       | null      | null    | 2    | AKT Cuidamos | Asesor     |
And seleccione todas las coberturas corbeta:
| limite | deducible | PTH | AC | AS               | PTD |
| 320.00 | 0         | 20  | 20 | Asistencia Motos | 20  |
And agregue un nuevo valor asegurado <valor_asegurado>
Then el resultado de la tarifacion debe ser prima <prima> iva <iva> costo total <costo>

Examples:
| valor_asegurado | tipo_documento       | documento  | prima   | iva    | costo   |
| 6900000         | CEDULA DE CIUDADANIA | 1060447895 | 413.310 | 78.529 | 491.839 |
