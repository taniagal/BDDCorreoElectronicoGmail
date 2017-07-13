Meta:
@lote1
@tag equipo: 4, sprint: 5

Narrative:
Como usuario de policy center
Al cotizar una poliza de PA quiero ser capaz de registrar toda la información del vehiculo.


Scenario:  Tarifa Autos - Cobertura RC
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza:
| cuenta      | producto | tipoPoliza |
| C1060447895 | Autos    | Individual |
When ingrese los datos del asegurado <tipo_documento> <documento>
And ingrese los datos del vehiculo:
| placa  | modelo | codigo_fasecolda | ciudad_circulacion | vehiculo_servicio | chasis | motor | valor_asegurado | descuento | recargo | zona | plan               | medioVenta |
| TYU140 | 2016   | 00601182         | MEDELLIN           | Particular        | null   | null  | 165900000       | null      | null    | 2    | Plan Autos Clásico | Televentas |
When ingrese las coberturas a vehiculo:
| limite | deducible | AS                 |
| 640.0  | 0         | Asistencia Clásica |
And cotice una poliza
Then el resultado de la cotizacion debe ser <valor>

Examples:
| valor   | tipo_documento       | documento  |
| 620.893 | CEDULA DE CIUDADANIA | 1060447895 |



Scenario:  Realizar una cotizacion con todas las coberturas para autos
Given estoy cotizando una poliza:
| cuenta      | producto | tipoPoliza |
| C1060447895 | Autos    | Individual |
When ingrese los datos del asegurado <tipo_documento> <documento>
And ingrese los datos del vehiculo:
| placa  | modelo | codigo_fasecolda | ciudad_circulacion | vehiculo_servicio | chasis | motor | valor_asegurado | descuento | recargo | zona | plan              | medioVenta |
| TAU103 | 2016   | 00601182         | MEDELLIN           | Particular        | null   | null  | 165900000       | null      | null    | 2    | Plan Autos Global | Televentas |
And seleccione todas las coberturas de comision pactada:
| limite | deducible | PTH | PPH | GTH | AS                 | PTD | PPD | GT | CRPP | CRPT | PLlaves |
| 1.440  | 0         | 0   | 835 | 40. | Asistencia Global  | 0   | 835 | 40 | 20   | 20   | Si      |
Then el valor del monto en cada cobertura debe ser:
| descripcion                           | valor     |
| Cobertura de Responsabilidad Civil    | 693.035   |
| Cobertura de Daños                    | 9.236.856 |
| Cobertura de Hurto                    | 4.994.363 |
| Cobertura de Vehículo de Reemplazo    | 205.265   |
| Cobertura de Accidentes al Conductor  | 21.875    |
| Cobertura de Pérdida de Llaves        | 36.764    |
| Cobertura de Asistencia en Viaje      | 312.500   |

Examples:
| tipo_documento       | documento  |
| CEDULA DE CIUDADANIA | 1060447895 |