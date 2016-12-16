inicio renovacion de poliza pa

Meta: @lote1

@issue #CDSEG-821
@tag automator: Jonathan_Mejia_Leon
@local
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
|cedulaTomador|nombre                         |oficinaRadicacion|codAgente        |rol    |
|1234567891   |DORIAN STIWAR EASTMOND PULGARIN|SURA             |Standard Code 789|tomador|
And validar campos informativos de asegurado:
|cedulaAsegurado|pNombre|pApellido|rol      |
|1294567891     |VRALLAN|ESTIGUAR |asegurado|
And validar campos informativos de vehiculo:
|placa|modelo|codFasecolda|claseVehiculo     |marca|linea|zona|tipoServicio|motor          |chasis          |rol     |
|TKC459|2016 |00601182    |Camperos y pickups|Mazda|MPV  |2   |Particular  |ENGINEEEEEEASDK|CHASIS83DSBNCLOA|vehiculo|

Examples:
|poliza       |
|TEST_22222222|

Scenario: validar mensaje y cancelar el inicio del proceso de renovacion
Given que es necesario renovar una <poliza> de autos
When quiera realizar esta renovacion
Then se deben mostrar un mensaje <mensaje>
And se cancela el proceso de renovacion

Examples:
|poliza       |mensaje|
|TEST_22222222|¿Esta seguro de que desea renovar esta póliza?|


Scenario: validar renovacion despues del vencimiento
Meta: @manual
Given que es necesario renovar una <poliza> de autos cuando ya esta vencida
When quiera realizar la renovacion
Then se debe validar que el proceso termine con exito

Examples:
||
||

Scenario: validar campos de tomador adicional cuando NO es un riesgo consultable
Meta: @manual
Given que es necesario renovar una <poliza> de autos cuando ya esta vencida
When quiera realizar la renovacion
Then se debe validar que los campos del tomador adicional aparezcan en el fomrmulario

Examples:
|||
|||







