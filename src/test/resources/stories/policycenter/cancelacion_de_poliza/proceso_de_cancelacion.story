Proceso De Cancelacion

Meta: @lote1

@issue #USC-14750
@tag automator: Jonathan_Mejia_Leon
@local
Sprint 8

Narrative:
Como usuario de policyCenter
Quiero poder procesar la cancelación de una póliza  de autos de manera manual.

Scenario: Validar underwrite cuando la fecha es mayor a la politica
Meta: @lote2 @manual
Given que existe una <poliza> no esta dentro de la vigencia
When necesito iniciar la cancelacion
And se ingrese la fecha con emision anticipada mayor a la politica
And se empiece la cancelacion
Then se debe mostrar un <mensaje> de advertencia en el formulario

Examples:
|poliza       |mensaje                                          |
|TEST_22221241|Esta oferta necesita de aprobación del asegurador|

Scenario: programar cancelacion
Meta: @lote2 @manual
Given que existe una <poliza> y esta dentro de la vigencia en claims
When necesito iniciar la cancelacion
And se ingrese la fecha con emision anticipada mayor a la politica
And se empiece la cancelacion
Then debe permitir programar la cancelacion
And debe mostrar una ventana con un <mensaje> de autorizacion

Examples:
|poliza       |mensaje                                      |                                            |
|TEST_22221241|¿Está seguro de que desea cancelar la póliza?|


Scenario: validar retroactividad con autorizacion
Meta: @lote2 @manual
Given existe una <poliza> y esta dentro de la vigencia
When necesito iniciar cancelacion
And se ingrese la fecha con retroactividad menor a la politica dentro del periodo
And se empiece cancelacion
Then debe mostrar un <mensaje> de advertencia en el formulario
And debe permitir realizar cancelacion
And debe generar una autorizacion

Examples:
|poliza       |mensaje                                                                 |
|TEST_22266674|Esta oferta necesita de aprobación del asegurador antes de su expedición|




