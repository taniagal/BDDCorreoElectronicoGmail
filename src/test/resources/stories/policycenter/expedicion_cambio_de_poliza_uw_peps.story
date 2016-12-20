Expedicion Cambio De Poliza Uw Peps

Meta: @lote2

@issue #CDSEG-1252
@tag automator: diego_cardona_acevedo
@local
@Sprint 6

Narrative:
Como usuario
Quiero ser capaz de emitir cambios para las polizas de auto en PolicyCenter.

Scenario: Identificacion cliente PEP en tomador, asegurado y beneficiario nuevo
GivenStories: stories/policycenter/login_policy.story
Given existe una cotizacion <numeroCotizacion>
And el tomador <tipoDocumento> <numeroDocumento> se identifica como riesgo PEPS
When intente expedir la poliza
Then mostrar el mensaje <validacion> que devuelve el servicio
And al ir a la opcion de analisis de riesgo
And debo ver un UW issue para la figura indicada
|mensaje|
|El tomador(a) FRANK RAMIREZ ALZATE con DNI C123456 es PEP (Persona públicamente expuesta) y es necesario tramitar el caso con su director o gerente.|
Examples:
|numeroCotizacion |tipoDocumento        |numeroDocumento |validacion |
|22222238         |CEDULA DE CIUDADANIA |123456          |El tomador(a) FRANK RAMIREZ ALZATE con DNI C123456 es PEP (Persona públicamente expuesta) y es necesario tramitar el caso con su director o gerente. Diríjase a análisis de riesgos para solicitar aprobación.|

Scenario: Modificacion - Identificacion cliente PEP en tomador, asegurado y beneficiario
Given existe una cotizacion <numeroCotizacion> la cual se va a modificar
And el tomador <tipoDocumento> <numeroDocumento> se identifica como riesgo PEPS
And el asegurado <tipoDocumento> <numeroDocumento> se identifica como riesgo PEPS
And el beneficiario <tipoDocumento> <numeroDocumento> se identifica como riesgo PEPS
When intente expedir la poliza
Then mostrar el mensaje <validacion> que devuelve el servicio
Examples:
|numeroCotizacion |tipoDocumento        |numeroDocumento     |validacion                                                                                                                                                                                                  |validacion                                                                                                                                                                                                  |validacion                                                                                                                                                                                                   |
|22222246         |CEDULA DE CIUDADANIA |1025312689          |El tomador(a) ANTONIO RESTREPO con DNI C71123456 es PEP (Persona públicamente expuesta) y es necesario tramitar el caso con su director o gerente. Diríjase a análisis de riesgos para solicitar aprobación.|El asegurado(a) CAROLINA OCHOA con DNI C71318883 es PEP (Persona públicamente expuesta) y es necesario tramitar el caso con su director o gerente. Diríjase a análisis de riesgos para solicitar aprobación.|El beneficiario(a) GLADYS OCHOA con DNI C94372371 es PEP (Persona públicamente expuesta) y es necesario tramitar el caso con su director o gerente. Diríjase a análisis de riesgos para solicitar aprobación.|

Scenario: Identificacion cliente PEP siendo el tomador, asegurado y beneficiario el mismo cliente nuevo
Meta: @manual
Given  existe una cotizacion
And  el tomador, asegurado y beneficiario son el mismo DNI
And  se identifican como riesgo PEPS
When  intente expedir la poliza
Then  se debe generar un UW issue
And  mostrar el mensaje <mensaje> que devuelve el servicio
And  concatenarlo con el texto "Para solicitar la autorización diríjase a la opción Análisis de riesgo"

Scenario: DNI que ya existian en la poliza y son PEP
Meta: @manual
Given  existe una cotizacion
And  el tomador, asegurado y beneficiario son el mismo DNI
And  se identifican como riesgo PEPS
And no son nuevos en el cambio
When  intente expedir la poliza
And se identifique que los DNI son riesgo PEP que ya venian asegurados y habian sido autorizados
Then  se debe permitir expedir el cambio de la poliza y mostrar el número del cambio y de la póliza



