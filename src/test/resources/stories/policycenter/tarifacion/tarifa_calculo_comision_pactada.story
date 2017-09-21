Meta:
@lote6
@tag equipo: 5, sprint: 14

Narrative:
Como usuario de policy center
Al cotizar una poliza de PA
Quiero ser capaz de aplicarla para los automoviles, camperos y pickup, y bicicletas una tasa diferente a la tasa dada por la tarifa tecnica en las coberturas de PT Daños y Hurto.

Scenario:  Realizar una cotizacion de autos con comision pactada en si y valor 10
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza:
| cuenta      | producto | oficina | agente_oficina | tipoPoliza |
| C1060447895 | Autos    | 019    | DIRECTO         | Individual |
When ingrese la comision pactada en valor <valor>
And ingrese los datos del asegurado <tipo_documento> <documento>
And ingrese los datos de vehiculo:
| placa  | modelo | codigo_fasecolda | ciudad_circulacion | vehiculo_servicio | chasis | motor | valor_asegurado | descuento | recargo | zona | plan               | medioVenta | cero_kilometros |
| NEL501 | 2018   | 01601146         | MEDELLIN           | Particular        | null   | null  | 32000000        | null      | null    | 2    | Plan Autos Clásico | Televentas | Si              |
And ingrese la bonificacion tecnica <bonoT> y la comercial <bonoC>
And seleccione todas las coberturas de comision pactada:
| limite | deducible | PTH | PPH | GTH | AS                 | PTD | PPD | GT | CRPP | CRPT | PLlaves |
| 1.440  | 0         | 0   | 835 | 40. | Asistencia Clásica | 0   | 835 | 40 | 16   | 20   |         |
Then el resultado de la tarifacion debe ser prima <prima> iva <iva> costo total <costo>

Examples:
| tipo_documento       | documento  | prima     | iva     | costo     | valor | bonoT | bonoC |
| CEDULA DE CIUDADANIA | 1060447895 | 2.444.373 | 464.431 | 2.908.804 | 10    | 0     | 0     |


Scenario:  Realizar una cotizacion de autos con comision pactada en si y valor 15 y bonificacion comercial 5 y tecnica en 15
Given estoy cotizando una poliza:
| cuenta      | producto | oficina | agente_oficina | tipoPoliza |
| C1060447895 | Autos    | 019    | DIRECTO         | Individual |
When ingrese la comision pactada en valor <valor>
And ingrese los datos del asegurado <tipo_documento> <documento>
And ingrese los datos de vehiculo:
| placa  | modelo | codigo_fasecolda | ciudad_circulacion | vehiculo_servicio | chasis | motor | valor_asegurado | descuento | recargo | zona | plan               | medioVenta | cero_kilometros |
| NEL501 | 2018   | 01601146         | MEDELLIN           | Particular        | null   | null  | 32000000        | null      | null    | 2    | Plan Autos Clásico | Televentas | Si              |
And ingrese la bonificacion tecnica <bonoT> y la comercial <bonoC>
And seleccione todas las coberturas de comision pactada:
| limite | deducible | PTH | PPH | GTH | AS                 | PTD | PPD | GT | CRPP | CRPT | PLlaves |
| 1.440  | 0         | 0   | 835 | 40. | Asistencia Clásica | 0   | 835 | 40 | 16   | 20   |         |
Then el resultado de la tarifacion debe ser prima <prima> iva <iva> costo total <costo>

Examples:
| tipo_documento       | documento  | prima     | iva     | costo     | valor | bonoT | bonoC |
| CEDULA DE CIUDADANIA | 1060447895 | 1.991.498 | 378.385 | 2.369.883 | 10    | 15    | 5     |


Scenario:  Realizar una cotizacion de autos con comision pactada en si y valor 15 y validar mensaje bloqueante
Given estoy cotizando una poliza:
| cuenta      | producto | oficina | agente_oficina | tipoPoliza |
| C1060447895 | Autos    | 019    | DIRECTO         | Individual |
When ingrese la comision pactada en valor <valor>
And seleccione la opcion siguiente
Then se debe mostrar un mensaje <mensaje> de advertencia comision pactada

Examples:
| mensaje                                                   | valor |
| La comisión pactada no puede ser mayor a la comisión real | 15    |