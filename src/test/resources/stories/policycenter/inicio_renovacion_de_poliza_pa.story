inicio renovacion de poliza mrc

Meta:

@issue #CDSEG-821
@Automatizador: Jonathan Mejia Leon
Sprint 6

Narrative:
Como usuario de policy center
Se requiere renovar una poliza ya expedida
entonces se debe asegurar los datos del tomador, vehiculo y coberturas.


Scenario: datos de renovacion en informacion de poliza
GivenStories: stories/policycenter/login_policy.story
Given que es necesario renovar una <poliza> de autos
When quiera realizar esta renovacion
And quiera aceptar esta renovacion
Then se debe validar los datos del tomador:
|cedulaTomador|nombre    |oficinaRadicacion|codAgente                                  |rol    |
|1077567451   |EVANS RENE|SURA             |Standard Code 789Internal Producer Code - 1|tomador|
Then validar campos informativos de asegurado:
|cedulaAsegurado|pNombre|pApellido|rol      |
|1294567891     |VRALLAN|ESTIGUAR |asegurado|
Then validar campos informativos de vehiculo:
|placa|modelo|codFasecolda|claseVehiculo     |marca|linea|zona|tipoServicio|motor          |chasis          |valorAsegura|rol     |
|TKC459|2016 |00601182    |Camperos y pickups|Mazda|MPV  |2   |Particular  |ENGINEEEEEEASDK|CHASIS83DSBNCLOA|10000000.00 |vehiculo|

Examples:
|poliza       |
|TEST_22266674|




