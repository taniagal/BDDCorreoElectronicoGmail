Expedir Cambio De Poliza Uw Peps

Meta:

@issue #CDSEG-1252
@Automatizador Diego Cardona Acevedo
@Sprint 6

Narrative:
Como usuario
Quiero ser capaz de emitir cambios para las polizas de auto en PolicyCenter.

Scenario: Identificacion cliente PEP en tomador nuevo
GivenStories: stories/policycenter/login_policy.story
Given existe una cotizacion <numeroCotizacion>
And el tomador <tipoDocumento> <numeroDocumento> se identifica como riesgo PEPS
When intente expedir la poliza
Then se debe generar un UW issue
And mostrar el mensaje <mensaje> que devuelve el servicio
And concatenarlo con el texto
|texto|
|Para solicitar la(s) autorización(es) diríjase a la opción Análisis de riesgo.|

Examples:
|numeroCotizacion |tipoDocumento        |numeroDocumento |mensaje                                                                                             |
|22222228         |CEDULA DE CIUDADANIA |1025312689      |ANTONIO RESTREPO con CEDULA DE CIUDADANIA - 71123456 es un riesgo no estándar y debe ser autorizado.|

Scenario: Identificacion cliente PEP en asegurado nuevo
Given existe una cotizacion <numeroCotizacion>
And el asegurado <tipoDocumento> <numeroDocumento> se identifica como riesgo PEPS
When intente expedir la poliza
Then se debe generar un UW issue
And mostrar el mensaje <mensaje> que devuelve el servicio
And concatenarlo con el texto
|texto|
|Para solicitar la(s) autorización(es) diríjase a la opción Análisis de riesgo.|

Examples:
|numeroCotizacion |tipoDocumento        |numeroDocumento |mensaje                                                                                           |
|22222228         |CEDULA DE CIUDADANIA |1025312689      |CAROLINA OCHOA con CEDULA DE CIUDADANIA - 71318883 es un riesgo no estándar y debe ser autorizado.|