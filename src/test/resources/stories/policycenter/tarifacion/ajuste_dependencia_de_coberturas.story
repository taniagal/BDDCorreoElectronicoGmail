Meta:
@lote5
@tag equipo: 4, sprint: 11

Narrative:
Como usuario de policy center
Al cotizar una poliza de PA quiero ser capaz de parametrizar si una dependencia no aplica para un plan especifico


Scenario:  Verificar independencia de cobertura de accidentes al conductor a las coberturas de daños o hurto
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza:
| cuenta     | producto | tipoPoliza | oficina           | agente_oficina |
| C002888993 | Autos    | Individual | 2796 > DIVISIÓN 2 | DIRECTO        |
When ingrese los datos del asegurado <tipo_documento> <documento>
And ingrese los datos del vehiculo:
| placa  | modelo | codigo_fasecolda | ciudad_circulacion | vehiculo_servicio | chasis | motor | valor_asegurado | descuento | recargo | zona | plan               | medioVenta   |
| KRO780 | 2016   | 00601182         | MEDELLIN           | Particular        | null   | null  | 165900000       | null      | null    | 2    | Plan Conducir Sura | Directo Sura |
Then debo poder ver la cobertura de accidentes al conductor sin dependencia de daños o hurto

Examples:
| tipo_documento       | documento  |
| CEDULA DE CIUDADANIA | 1060447895 |


Scenario:  Verificar dependencia de cobertura de accidentes al conductor a las coberturas de daños o hurto con plan global
Given estoy cotizando una poliza:
| cuenta     | producto | tipoPoliza |
| C002888993 | Autos    | Individual |
When ingrese los datos del asegurado <tipo_documento> <documento>
And ingrese los datos del vehiculo:
| placa  | modelo | codigo_fasecolda | ciudad_circulacion | vehiculo_servicio | chasis | motor | valor_asegurado | descuento | recargo | zona | plan              | medioVenta |
| KRO781 | 2016   | 00601182         | MEDELLIN           | Particular        | null   | null  | 165900000       | null      | null    | 2    | Plan Autos Global | Televentas |
Then debo poder ver la cobertura de accidentes al conductor con dependencia de daños <danos> o hurto <hurto>

Examples:
| tipo_documento       | documento  | danos | hurto |
| CEDULA DE CIUDADANIA | 1060447895 | 0     | 0     |