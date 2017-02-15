Meta:
@lote4
@sprint 12
@tag equipo: 2
@local

Scenario: 1 Generacion de UW al ingresar bonificacion comercial y tecnica mayor a la pactada

GivenStories: stories/policycenter/login_policy.story
Given que estoy en la informacion de la poliza con numero de subscripcion <numSubscripcion>
When copie la poliza
And ingrese los datos del asegurado <tipo_documento> <documento>
And ingrese los datos de vehiculo:
| placa  | modelo | codigo_fasecolda | ciudad_circulacion | vehiculo_servicio | chasis | motor | valor_asegurado | descuento | recargo | zona | plan              | cero_kilometros |
| random | 2016   | 52525252         | MEDELLIN           | Particular        | null   | null  | 16000000        | null      | null    | 2    | Plan Autos Básico | Si              |
And ingrese la bonificacion tecnica <bonoT> y la comercial <bonoC>
And ingrese las coberturas a auto cero kilometros:
| limite | deducible |
| 640.   | 0         |
And intente cotizar
And ingrese a analisis de riesgo
Then debo ver un UW issue por cada figura que sea riesgo consultable bloqueante
| mensaje                                                                    |
| La bonificación no coincide con lo arrojado por el sistema, Favor verifica |


Examples:
| tipo_documento       | documento  | producto |agente_oficina| numSubscripcion |bonoT|bonoC|
| CEDULA DE CIUDADANIA | 1060447895 | Autos    | DIRECTO      | 39355347   |6    | 5   |


Scenario: 2 Generacion de UW al ingresar bonificacion comercial mayor a la pactada

Given que estoy en la informacion de la poliza con numero de subscripcion <numSubscripcion>
When copie la poliza
And ingrese los datos del asegurado <tipo_documento> <documento>
And ingrese los datos de vehiculo:
| placa  | modelo | codigo_fasecolda | ciudad_circulacion | vehiculo_servicio | chasis | motor | valor_asegurado | descuento | recargo | zona | plan              | cero_kilometros |
| random | 2016   | 52525252         | MEDELLIN           | Particular        | null   | null  | 16000000        | null      | null    | 2    | Plan Autos Básico | Si              |
And ingrese la bonificacion tecnica <bonoT> y la comercial <bonoC>
And ingrese las coberturas a auto cero kilometros:
| limite | deducible |
| 640.   | 0         |
And intente cotizar
And ingrese a analisis de riesgo
Then debo ver un UW issue por cada figura que sea riesgo consultable bloqueante
| mensaje                                                                    |
| La bonificación no coincide con lo arrojado por el sistema, Favor verifica |


Examples:
| tipo_documento       | documento  | producto | agente_oficina | numSubscripcion | bonoT | bonoC |
| CEDULA DE CIUDADANIA | 1060447895 | Autos    | DIRECTO        | 39355347        | 0     | 15    |


Scenario: 3 Generacion de UW al ingresar bonificacion tecnica mayor a la pactada

Given que estoy en la informacion de la poliza con numero de subscripcion <numSubscripcion>
When copie la poliza
And ingrese los datos del asegurado <tipo_documento> <documento>
And ingrese los datos de vehiculo:
| placa  | modelo | codigo_fasecolda | ciudad_circulacion | vehiculo_servicio | chasis | motor | valor_asegurado | descuento | recargo | zona | plan              | cero_kilometros |
| random | 2016   | 52525252         | MEDELLIN           | Particular        | null   | null  | 16000000        | null      | null    | 2    | Plan Autos Básico | Si              |
And ingrese la bonificacion tecnica <bonoT> y la comercial <bonoC>
And ingrese las coberturas a auto cero kilometros:
| limite | deducible |
| 640.   | 0         |
And intente cotizar
And ingrese a analisis de riesgo
Then debo ver un UW issue por cada figura que sea riesgo consultable bloqueante
| mensaje                                                                    |
| La bonificación no coincide con lo arrojado por el sistema, Favor verifica |


Examples:
| tipo_documento       | documento  | producto | agente_oficina | numSubscripcion | bonoT | bonoC |
| CEDULA DE CIUDADANIA | 1060447895 | Autos    | DIRECTO        | 39355347        | 15    | 0    |


Scenario: 4 Expedcion de poliza al ingresar bonificacion tecnica y comercial igual a la pactada

Given que estoy en la informacion de la poliza con numero de subscripcion <numSubscripcion>
When copie la poliza
And ingrese los datos del asegurado <tipo_documento> <documento>
And ingrese los datos de vehiculo:
| placa  | modelo | codigo_fasecolda | ciudad_circulacion | vehiculo_servicio | chasis | motor | valor_asegurado | descuento | recargo | zona | plan              | cero_kilometros |
| random | 2016   | 52525252         | MEDELLIN           | Particular        | null   | null  | 16000000        | null      | null    | 2    | Plan Autos Básico | Si              |
And ingrese la bonificacion tecnica <bonoT> y la comercial <bonoC>
And ingrese las coberturas a auto cero kilometros:
| limite | deducible |
| 640.   | 0         |
And intente cotizar
And ingrese a analisis de riesgo
Then debo ver un UW issue por cada figura que sea riesgo consultable bloqueante
| mensaje                                                                    |
| La bonificación no coincide con lo arrojado por el sistema, Favor verifica |


Examples:
| tipo_documento       | documento  | producto | agente_oficina | numSubscripcion | bonoT | bonoC |
| CEDULA DE CIUDADANIA | 1060447895 | Autos    | DIRECTO        | 39355347        | 15    | 0    |