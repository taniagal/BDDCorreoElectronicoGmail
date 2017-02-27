Meta:
@lote1
@issue #CDSEG-3437
@sprint 12
@tag equipo: 3
@local

Narrative:
Como usuario del policy center
quiero poder procesar la cancelación de una póliza de autos de manera automatica

Scenario: Boton cancelar poliza
Meta: @manual
Given Que estoy  Claims Center
When este en la Pantalla Póliza: General
Then se debe visualizar el boton Cancelar póliza
And solo debe estar habilitado, cuando la reclamación es por perdida total(la marca de perdida total se encuentra ubicado a nivel de exposiciones en detalles del incidente) y además que no encuentre en SI el campo "¿Enviado a equipo de la unidad de investigaciones especiales?"(esta marca se encuentra a nivel de la pantalla Status del Resumen)

Examples:
||
||

Scenario: Cancelar poliza
Meta: @manual
Given Cancele la póliza desde Claims Center
When revise la póliza en policy center
Then debe quedar cancelada, con motivo de cancelación perdida total y con fecha de cancelación un día despues de la fecha de ocurrencia del siniestro

Examples:
||
||

Scenario: Transacción de cancelación
Meta: @manual
Given se solicitó cancelar la póliza
When se cencele la poliza a traves del proceso automatico
Then debe generar una transacción por valor $0 COP que se debe enviar a Billing, con la fecha de cancelación y el motivo perdida total.

Examples:
||
||