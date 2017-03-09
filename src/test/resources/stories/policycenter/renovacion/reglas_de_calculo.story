Meta:
@lote4
@issue #CDSEG-1021
@tag equipo: 5
@Sprint 14

Narrative:
Como usuario de policy center en el rol de agente,csr, asegurador o gerente
Quiero poder iniciar el proceso de renovaciones de autos segun las reglas de negocio y politicas establecidas en policy center
Para brindar un buen sevicio al cliente a la hora de renovar

Scenario: Proceso manual reglas de calculo
Meta:@manual
Given que tengo una poliza cotizada con dispositivo de seguridad
When ingrese a renovar la poliza
Then el dispositivo de seguridad debe estar en ninguno

Scenario: Proceso automatico reglas de calculo
Meta:@manual
Given que tengo una poliza cotizada con dispositivo de seguridad
When ingrese a renovar la poliza
And cambie la fecha de renovacion de la poliza
And expida la renovacion de poliza
Then el dispositivo de seguridad debe estar en ninguno

