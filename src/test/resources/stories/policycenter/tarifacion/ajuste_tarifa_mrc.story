Meta:
@lote3
@tag equipo: 4, sprint: 15


Narrative:
Como usuario de policy center
Al cotizar una poliza colectiva de MRC donde se tienen coberturas globales quiero ver el resultado de la cotizacion en cero

Scenario:  Cotizacion poliza colectiva MRC con cobertura global lucro cesante por dano interno
GivenStories: stories/policycenter/login_policy.story
Given que estoy en la informacion de la poliza con numero de subscripcion <numSubscripcion>
When seleccione la opcion coberturas globales
And seleccione la opcion agregar cobertura global
And ingreso la descripcion de la cobertura <descripcion>
And selecciono las coberturas globales
|COBERTURAS_GLOBALES                                 |VALOR_ASEGURADO|
|Lucro cesante por daño interno de equipo electrónico|100000000      |
Then el resultado de la cotizacion en las coberturas globales son:
|DESCRIPCION_COBERTURA                                            |VALOR_MONTO|
|Cobertura de Lucro cesante por daño interno de equipo electrónico|0          |
And el resultado de la tarifacion debe ser prima <prima> iva <iva> costo total <costo>

Examples:
| numSubscripcion | descripcion        | prima | iva  | costo |
| 33355490        | descripcion prueba | 0     | 0    | 0     |


Scenario:  Cotizacion poliza colectiva MRC con coberturaa globales lucro cesante por dano interno y danos materiales
Given que estoy en la informacion de la poliza con numero de subscripcion <numSubscripcion>
When edite la transaccion para realizar cambios en la cotizacion
And seleccione la opcion coberturas globales
And seleccione la opcion agregar cobertura global
And ingreso la descripcion de la cobertura <descripcion>
And selecciono las coberturas globales
|COBERTURAS_GLOBALES                                 |VALOR_ASEGURADO|
|Lucro cesante por daño interno de equipo electrónico|200000000      |
|Danos materiales                                    |150000000      |
Then el resultado de la cotizacion en las coberturas globales son:
|DESCRIPCION_COBERTURA                                            |VALOR_MONTO|
|Cobertura de Lucro cesante por daño interno de equipo electrónico|0          |
|Cobertura de Danos materiales                                    |0          |
And el resultado de la tarifacion debe ser prima <prima> iva <iva> costo total <costo>

Examples:
| numSubscripcion | descripcion        | prima | iva  | costo |
| 33355490        | descripcion prueba | 0     | 0    | 0     |
