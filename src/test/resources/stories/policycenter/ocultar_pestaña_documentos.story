Meta:
@lote4
@tag equipo: 5
@local
@Sprint 14

Narrative:
Como suuario de policy cenjter en el rol de agente, csr, asegurador o gerente
Quiero poder ver elementos asociados con una cuenta o una poliza
Para estar enterado acerca de su estado

Scenario: No visualizar pestaña documentos
Given estoy en la transaccion de una poliza o cuenta
When ingreso a la informacion de esta
Then no se debe mostrar la pestaña de documentos