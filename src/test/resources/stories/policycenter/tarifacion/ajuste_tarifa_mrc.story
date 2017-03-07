Meta:
@lote3
@sprint 14
@tag equipo: 4


Narrative:
Como usuario de policy center
Al cotizar una poliza colectiva de MRC donde se tienen coberturas globales quiero ver el resultado de la cotizacion en cero

Scenario:  Cotizacion poliza colectiva MRC con cobertura global
GivenStories: stories/policycenter/login_policy.story
Given que estoy en la informacion de la poliza con numero de subscripcion <numSubscripcion>
When copie la poliza
And seleccione la opcion coberturas globales
And seleccione la opcion agregar cobertura global
And ingreso la descripcion de la cobertura <descripcion>
And selecciono las coberturas globales
|COBERTURAS_GLOBALES                                 |VALOR_ASEGURADO|
|Lucro cesante por daño interno de equipo electrónico|100000000      |
Then el resultado de la tarifacion debe ser prima <prima> iva <iva> costo total <costo>

Examples:
| numSubscripcion | descripcion        | prima | iva  | costo |
| 33355481        | descripcion prueba | 0     | 0    | 0     |