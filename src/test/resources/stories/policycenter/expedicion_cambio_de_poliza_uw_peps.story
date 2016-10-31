Expedicion Cambio De Poliza Uw Peps

Meta: @lote3

@issue #CDSEG-1252
@tag automator: diego_cardona_acevedo
@local
@Sprint 6

Narrative:
Como usuario
Quiero ser capaz de emitir cambios para las polizas de auto en PolicyCenter.

Scenario: Identificacion cliente PEP en tomador nuevo
GivenStories: stories/policycenter/login_policy.story
Given existe una cotizacion <numeroCotizacion>
And el tomador <tipoDocumento> <numeroDocumento> se identifica como riesgo PEPS
When intente expedir la poliza
Then mostrar el mensaje <mensaje> que devuelve el servicio

Examples:
|numeroCotizacion |tipoDocumento        |numeroDocumento |mensaje                                                                                             |
|22222228         |CEDULA DE CIUDADANIA |1025312689      |ANTONIO RESTREPO con CEDULA DE CIUDADANIA - 71123456 es un riesgo no estándar y debe ser autorizado.|

Scenario: Identificacion cliente PEP en beneficiario nuevo
Given existe una cotizacion <numeroCotizacion>
And el beneficiario <tipoDocumento> <numeroDocumento> se identifica como riesgo PEPS
When intente expedir la poliza
Then mostrar el mensaje <mensaje> que devuelve el servicio

Examples:
|numeroCotizacion |tipoDocumento        |numeroDocumento |mensaje                                                                                         |
|22222228         |CEDULA DE CIUDADANIA |1025312689      |GLADYS OCHOA con CEDULA DE CIUDADANIA - 94372371 es un riesgo no estándar y debe ser autorizado.|

Scenario: Modificacion - Identificacion cliente PEP en tomador
Given existe una cotizacion <numeroCotizacion> la cual se va a modificar
And el tomador <tipoDocumento> <numeroDocumento> se identifica como riesgo PEPS
When intente expedir la poliza
Then mostrar el mensaje <mensaje> que devuelve el servicio

Examples:
|numeroCotizacion |tipoDocumento        |numeroDocumento |mensaje                                                                                             |
|55570000         |CEDULA DE CIUDADANIA |1025312689      |ANTONIO RESTREPO con CEDULA DE CIUDADANIA - 71123456 es un riesgo no estándar y debe ser autorizado.|


Scenario: Modificacion - Identificacion cliente PEP en asegurado
Given existe una cotizacion <numeroCotizacion> la cual se va a modificar
And el asegurado <tipoDocumento> <numeroDocumento> se identifica como riesgo PEPS
When intente expedir la poliza
Then mostrar el mensaje <mensaje> que devuelve el servicio

Examples:
|numeroCotizacion |tipoDocumento        |numeroDocumento |mensaje                                                                                           |
|55570000         |CEDULA DE CIUDADANIA |1025312689      |CAROLINA OCHOA con CEDULA DE CIUDADANIA - 71318883 es un riesgo no estándar y debe ser autorizado.|

Scenario: Modificacion - Identificacion cliente PEP en beneficiario
Given existe una cotizacion <numeroCotizacion> la cual se va a modificar
And el beneficiario <tipoDocumento> <numeroDocumento> se identifica como riesgo PEPS
When intente expedir la poliza
Then mostrar el mensaje <mensaje> que devuelve el servicio

Examples:
|numeroCotizacion |tipoDocumento        |numeroDocumento |mensaje                                                                                         |
|55570000         |CEDULA DE CIUDADANIA |1025312689      |GLADYS OCHOA con CEDULA DE CIUDADANIA - 94372371 es un riesgo no estándar y debe ser autorizado.|

Scenario: Identificacion cliente PEP siendo el tomador, asegurado y beneficiario el mismo cliente nuevo
Meta: @lote1 @manual
Given  existe una cotizacion
And  el tomador, asegurado y beneficiario son el mismo DNI
And  se identifican como riesgo PEPS
When  intente expedir la poliza
Then  se debe generar un UW issue
And  mostrar el mensaje <mensaje> que devuelve el servicio
And  concatenarlo con el texto "Para solicitar la autorización diríjase a la opción Análisis de riesgo"

Examples:
|||
|||

Scenario: DNI que ya existian en la poliza y son PEP
Meta: @lote1 @manual
Given  existe una cotizacion
And  el tomador, asegurado y beneficiario son el mismo DNI
And  se identifican como riesgo PEPS
And no son nuevos en el cambio
When  intente expedir la poliza
And se identifique que los DNI son riesgo PEP que ya venian asegurados y habian sido autorizados
Then  se debe permitir expedir el cambio de la poliza y mostrar el número del cambio y de la póliza

Examples:
|||
|||
