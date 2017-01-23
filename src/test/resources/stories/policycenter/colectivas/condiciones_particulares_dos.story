Meta:
@lote4
@sprint 12
@tag equipo: 1
@local

Scenario: 1 Validacion de expedicion: Liberar  Excepcion deducibles especiales
Given que tengo una cotizacion <cotizacion>
When copie la poliza
And ingrese los datos del asegurado <tipo_documento> <documento>
And ingrese los datos del vehiculo:
| placa  | modelo | codigo_fasecolda | ciudad_circulacion | vehiculo_servicio | chasis | motor | valor_asegurado | descuento | recargo | zona | plan              | cero_kilometros | transporte_combustible |
| random | 2016   | 52525252         | MEDELLIN           | Particular        | null   | null  | 16000000        | null      | null    | 2    | Plan Autos Básico | Si              | Si                     |
And ingrese las coberturas a vehiculo:
| limite | deducible |
| 1.440  | 0         |
And intente cotizar
And voy a expedir una poliza
And confirmo el mensaje de expedir poliza
Then se debe permitir expedir la poliza

Examples:
| tipo_documento       | documento  | cuenta      | producto | agente  | cotizacion |
| CEDULA DE CIUDADANIA | 1060447895 | C1060447895 | Autos    | DIRECTO | 39355347   |

Scenario: 2 Validacion bloqueo en expedicion: no Liberar  Excepcion deducible especiales
Given que tengo una cotizacion <cotizacion>
When copie la poliza
And ingrese los datos del asegurado <tipo_documento> <documento>
And ingrese los datos del vehiculo:
| placa  | modelo | codigo_fasecolda | ciudad_circulacion | vehiculo_servicio | chasis | motor | valor_asegurado | descuento | recargo | zona | plan              | transporte_combustible |
| random | 2016   | 52525252         | MEDELLIN           | Particular        | null   | null  | 16000000        | null      | null    | 2    | Plan Autos Básico | Si                     |
And ingrese las coberturas a auto cero kilometros:
| limite | deducible |
| 1.440  | 0         |
And intente cotizar
And voy a expedir una poliza
And confirmo el mensaje de expedir poliza
And ingrese a analisis de riesgo
Then debo ver un UW issue por cada figura que sea riesgo consultable bloqueante
| mensaje                                                  |
| Vehiculo de excepcion de deducibles, debe ser autorizado |

Examples:
| tipo_documento       | documento  | cuenta      | producto | agente  | cotizacion |
| CEDULA DE CIUDADANIA | 1060447895 | C1060447895 | Autos    | DIRECTO | 33355390   |