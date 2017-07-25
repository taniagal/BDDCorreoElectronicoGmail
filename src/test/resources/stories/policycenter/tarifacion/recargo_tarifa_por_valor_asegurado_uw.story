Meta:
@lote3
@tag equipo: 4, sprint: 14

Narrative:
Como usuario de policy center
Al cotizar una poliza de PA
Quiero ser capaz de utilizar la comision pactada para beneficiar al cliente o al acesor dependiendo de la comision estandar


Scenario:  Realizar una cotizacion 1 de autos con cero kilometros en no
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza:
| cuenta      | producto | oficina | agente_oficina | tipoPoliza |
| C1060447895 | Autos    | 1059    | RANGEL         | Individual |
When ingrese los datos del asegurado <tipo_documento> <documento>
And ingrese los datos de vehiculo:
| placa  | modelo | codigo_fasecolda | ciudad_circulacion | vehiculo_servicio | chasis | motor | descuento | recargo | zona | plan               | valor_asegurado | medioVenta |
| NEL509 | 2011   |                  | MEDELLIN           | Particular        | null   | null  | null      | null    | 2    | Plan Autos Clásico | 17900000        | Televentas |
And ingrese la bonificacion tecnica <bonoT> y la comercial <bonoC>
And seleccione todas las coberturas de comision:
| limite | deducible | PTH | PPH | GTH | AS                 | PTD | PPD | GT | CRPP | CRPT | PLlaves |
| 1.440  | 0         | 0   | 835 | 40. | Asistencia Clásica | 0   | 835 | 40 | 16   | 20   |         |
And agregue un nuevo valor asegurado <valor_asegurado>
Then el resultado de la tarifacion debe ser prima <prima> iva <iva> costo total <costo>

Examples:
| tipo_documento       | documento  | prima      | iva       | costo      | bonoT | bonoC | valor_asegurado |
| CEDULA DE CIUDADANIA | 1060447895 | 15.419.996 | 2.929.799 | 18.349.795 | 0     | 0     | 320000000       |


Scenario:  Realizar una cotizacion 2 de autos con cero kilometros en no
Given estoy cotizando una poliza:
| cuenta      | producto | oficina | agente_oficina | tipoPoliza |
| C1060447895 | Autos    | 1059    | RANGEL         | Individual |
When ingrese los datos del asegurado <tipo_documento> <documento>
And ingrese los datos de vehiculo:
| placa  | modelo | codigo_fasecolda | ciudad_circulacion | vehiculo_servicio | chasis | motor | descuento | recargo | zona | plan               | valor_asegurado | medioVenta |
| NEL507 | 2011   |                  | MEDELLIN           | Particular        | null   | null  | null      | null    | 2    | Plan Autos Clásico | 17900000        | Televentas |
And ingrese la bonificacion tecnica <bonoT> y la comercial <bonoC>
And seleccione todas las coberturas de comision:
| limite | deducible | PTH | PPH | GTH | AS                 | PTD | PPD | GT | CRPP | CRPT | PLlaves |
| 1.440  | 0         | 0   | 835 | 40. | Asistencia Clásica | 0   | 835 | 40 | 16   | 20   |         |
And agregue un nuevo valor asegurado <valor_asegurado>
Then el resultado de la tarifacion debe ser prima <prima> iva <iva> costo total <costo>

Examples:
| tipo_documento       | documento  | prima      | iva       | costo      | bonoT | bonoC | valor_asegurado |
| CEDULA DE CIUDADANIA | 1060447895 | 20.875.732 | 3.966.389 | 24.842.121 | 0     | 0     | 420000000       |
