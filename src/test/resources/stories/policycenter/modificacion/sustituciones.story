Meta:
@lote5
@tag equipo: 3, sprint: 12
@issue #CDSEG-4998

Scenario: Realizar sustitucion de vehiculo
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza:
| cuenta      | organizacion | producto | canal             | tipoPoliza |
| C1060447895 | Sura         | Autos    | Canal Tradicional | Individual |
When ingrese los datos del asegurado <tipo_documento> <documento>
And ingrese los datos de vehiculo:
| placa  | modelo | codigo_fasecolda | ciudad_circulacion | vehiculo_servicio | chasis | motor | valor_asegurado | descuento | recargo | zona | plan               |medioVenta|
| random | 2016   | 00601182         | MEDELLIN           | Particular        | null   | null  | 165900000       | null      | null    | 2    | Plan Autos Clásico |Televentas|
And ingrese los valores de los modificadores de la tarifa:
| descientoD | bonificacionC | descuento | recargo | suavizacion | bonificacionT |
| GPS Sura   | 0             | 10        | 5       | 3           | 0             |
And vaya a la pantalla de coberturas
And ingrese las coberturas necesarias:
| limite | deducible | AS                 | PTD | PPD  | GTD |
| 640.   | 0         | Asistencia Clásica | 0   | 835. | 40. |
And intente cotizar
And expido la poliza y voy al archivo de poliza
And y realizo una modificación de una póliza de automoviles
Then verificar conservacion de informacion del vehiculo previamente eliminado
| ciudad_circulacion | vehiculo_servicio | zona | plan               | bonificacionC | suavizacion | bonificacionT |
| MEDELLIN           | Particular        | 2    | Plan Autos Clásico | 0             | 3           | 0             |
And conservar Informacion del vehículo sustituido:
| placa  | modelo | codigo_fasecolda | chasis | motor | valor_asegurado | descuento | recargo |
| random | 2016   | 00601182         | null   | null  | 165900000       | null      | null    |
And conservar las coberturas del vehículo sustituido:
| limite | deducible | AS                 | PTD | PPD  | GTD |
| 640.   | 0         | Asistencia Clásica | 0   | 835. | 40. |

Examples:
| tipo_documento       | documento  |
| CEDULA DE CIUDADANIA | 1234567891 |