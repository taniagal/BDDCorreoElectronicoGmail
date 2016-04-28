Meta:

Narrative:
Como usuario de policy center
Quiero  poder visualizar el historial de transacciones de una cuenta
y que esta se actualice cada que se realice una transaccion a la cuenta o a una poliza que pertenezca a la cuenta


Scenario: Historial de la cuenta
GivenStories: stories/policycenter/login_policy.story
And Estoy en una cuenta <numCuenta>
When ingreso al historial
Then solo se pueden visualizar las transacciones que esten asociadas a la cuenta


Examples:
|numCuenta |
|S000212121|