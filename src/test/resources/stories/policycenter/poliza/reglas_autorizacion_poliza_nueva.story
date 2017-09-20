Meta:
@lote3
@tag equipo: 5, sprint: 1
@local

Narrative:
Como miembro de suramericana de seguros en alguno de los roles que permite generar cotizaciones de poliza
Quiero poder autorizar ciertas reglas de validación asignadas a mi usuario
Para poder expedir polizas de forma exitosa

Scenario: Vehiculo importado por terceros,maximo valor de vehiculo, blindaje, maximo valor accesorios, maximo valor accesorios especiales, transporte combustible, zona no permitida
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza:
| cuenta      | producto | oficina | agente_oficina                                | tipoPoliza |
| 0225097276 | Autos    | 4029    | BELTRAN*SANABRIA CQLII**PEDRO ANTONIO         | Individual |
When ingrese los datos del asegurado <tipo_documento> <documento>
And ingrese los datos del vehiculo:
| placa  | modelo | codigo_fasecolda | ciudad_circulacion | vehiculo_servicio | chasis       | motor        | valor_asegurado | descuento | recargo | zona | plan               | medioVenta |transporte_combustible|vehiculo_blindado|
| asmnba | 2017   | 00601190         | ISTMINA (CHOCO)    | Particular        | ajhajhajah   | ssddsdsdsds  | 401000000       | null      | null    | 2    | Plan Autos Clásico | Televentas |Si                    |  Si             |
When ingrese las coberturas:
| limite | deducible | abogado | PLlaves |
| 640.   | 0         | Si      | Si      |
And llegue a la expedicion de la poliza
And cuando edite la transacion de la poliza
And vaya a vehiculos en expedicion
And seleccione la opcion importado por terceros
And se ingrese el valor de los accesorios es superior al 20% del valor asegurado del vehiculo
And Se ingrese el valor de los accesorios especiales es superior al 100% del valor asegurado del vehículo

Examples:
| accesorios | tipo_documento       | documento  |
| 2600000    | CEDULA DE CIUDADANIA | 1000283562 |