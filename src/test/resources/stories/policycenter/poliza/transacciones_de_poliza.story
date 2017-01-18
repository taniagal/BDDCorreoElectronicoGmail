Meta:
@lote4
@tag equipo: 5
@local
@sprint 13

Narrative:
Como usuario de PolicyCenter con el rol de Agente, CSR, Underwriter o Gerente
Quiero poder ver el historial de transacciones relacionadas a la poliza
Para conocer las transacciones que tiene una poliza especifica y los detalles de la misma

Scenario: Busqueda de una transaccion especifica por numero de transaccion
GivenStories: stories/policycenter/login_policy.story
Given ya se tiene una poliza expedida <numeroPoliza>
When consulte las transacciones de la poliza por el numero de transaccion <numeroTransaccion>
Then debo poder ver los detalles de esta transaccion

Examples:
|numeroPoliza  |numeroTransaccion |
|TEST_22225550 |123               |