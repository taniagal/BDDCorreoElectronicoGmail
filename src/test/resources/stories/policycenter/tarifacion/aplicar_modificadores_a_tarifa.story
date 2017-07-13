Meta:
@lote1
@tag equipo: 4, sprint: 7
@local

Narrative:
Como usuario de PolicyCenter
Quiero ser capaz de aplicar a la tarifa los modificadores que se encuentran a nivel de la póliza y a nivel de riesgo.

Scenario: Realizar una cotizacion de autos con modificadores de tarifa
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza de autos:
| producto | tipo_documento       | fecha_nacimiento | primer_nombre | primer_apellido | tipo_direccion          | direccion        | departamento | ciudad   | agente | tipoPoliza |
| Autos    | CEDULA DE CIUDADANIA | 05/05/1965       | FERNI         | FIDEL           | DIRECCION DE RESIDENCIA | CALLE 39F #10-11 | Antioquia    | Medellin | INT-3  | Individual |
When ingrese los datos del asegurado <tipo_documento> <documento>
And ingrese los datos de vehiculo:
| placa  | modelo | codigo_fasecolda | ciudad_circulacion | vehiculo_servicio | chasis | motor | valor_asegurado | descuento | recargo | zona | plan              | medioVenta |
| TCU109 | 2016   | 00601182         | MEDELLIN           | Particular        | null   | null  | 165900000       | null      | null    | 2    | Plan Autos Global | Televentas |
And ingrese los valores de los modificadores de la tarifa:
| descientoD | bonificacionC | descuento | recargo | suavizacion | bonificacionT |
| GPS Sura   | 45            | 10        | 5       | 3           | 5             |
When seleccione la opcion siguiente
And seleccione todas las coberturas de comision pactada:
| limite | deducible | PTH | PPH | GTH | AS                 | PTD | PPD | GT | CRPP | CRPT | PLlaves |
| 1.440  | 0         | 0   | 835 | 40. | Asistencia Global  | 0   | 835 | 40 | 20   | 20   | Si      |
Then el valor del monto en cada cobertura debe ser:
| descripcion                           | valor     |
| Cobertura de Responsabilidad Civil    | 337.181   |
| Cobertura de Daños                    | 4.233.483 |
| Cobertura de Hurto                    | 1.565.398 |
| Cobertura de Vehículo de Reemplazo    | 94.079    |
| Cobertura de Asistencia en Viaje      | 312.500   |

Examples:
| tipo_documento       | documento  |
| CEDULA DE CIUDADANIA | 1234567896 |
