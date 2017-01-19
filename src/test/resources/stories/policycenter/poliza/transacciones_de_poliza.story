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
Then debo poder ver el detalle de esta transaccion

Examples:
|numeroPoliza  |numeroTransaccion |
|TEST_22225550 |22225550          |

Scenario: Comparar transacciones de una poliza
Given se requiere comparar diferentes transacciones de una poliza <numeroPoliza>
When seleccione las transacciones a comparar
Then se deben poder visualizar las diferencias entre transacciones
|cotizacion           |cambioPoliza                  |
|Cotización: 22222222 |Cambio en la póliza: 22222244 |

Examples:
|numeroPoliza  |
|TEST_22222222 |

Scenario: Consultar varias transacciones de una poliza
Given se tiene una poliza con multiples transacciones
When se consulten las transacciones de esta poliza
Then se debe poder visualizar el detalle de cada transaccion consultada