inicio renovacion de poliza pa

Meta:
@lote3
@issue #CDSEG-821
@tag equipo: 3
@local
Sprint 6

Narrative:
Como usuario de policy center
Se requiere renovar una poliza ya expedida
entonces se debe asegurar los datos del tomador, vehiculo y coberturas.


Scenario: Datos de renovacion en informacion de poliza
GivenStories: stories/policycenter/login_policy.story
Given que es necesario renovar una <poliza> de autos
When quiera realizar esta renovacion
Then se debe validar los datos del tomador:
|cedulaTomador|nombre                         |oficinaRadicacion|codAgente     |rol    |
|1234567891   |DORIAN STIWAR EASTMOND PULGARIN|null > null      |4999 > DIRECTO|tomador|
And validar campos informativos de asegurado:
|cedulaAsegurado|pNombre|pApellido|rol      |
|1294567891     |VRALLAN|ESTIGUAR |asegurado|
And validar campos informativos de vehiculo:
|placa|modelo|codFasecolda|claseVehiculo |marca|linea                          |zona|tipoServicio|motor |chasis |rol     |
|TKC459|2016 |52525252    |Automóviles   |AUDI |TT 8S 2.0 TFSI CO - TP 2000CC T|2   |Particular  |AB3B12|ABC1234|vehiculo|

Examples:
|poliza       |
|TEST_22222222|

Scenario: Validar mensaje y cancelar el inicio del proceso de renovacion
Given que es necesario renovar una <poliza> de autos
When quiera realizar una renovacion
Then se deben mostrar un mensaje <mensaje>
And se cancela el proceso de renovacion

Examples:
|poliza       |mensaje|
|TEST_22222222|¿Esta seguro de que desea renovar esta póliza?|


Scenario: Validar renovacion despues del vencimiento
Meta: @manual
Given que es necesario renovar una <poliza> de autos cuando ya esta vencida
When quiera realizar la renovacion
Then se debe validar que el proceso termine con exito

Examples:
||
||

Scenario: Validar campos de tomador adicional cuando NO es un riesgo consultable
Meta: @manual
Given que es necesario renovar una <poliza> de autos cuando ya esta vencida
When quiera realizar la renovacion
Then se debe validar que los campos del tomador adicional aparezcan en el fomrmulario

Examples:
|||
|||







