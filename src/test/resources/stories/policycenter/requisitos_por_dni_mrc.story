Meta:
@lote2
@issue #SUGWUSC-5927
@tag team: 5

Narrative:
Como usuario de negocio
Quiero poder visualizar los requisitos po DNI diferente
Para la solucion de mrc

Scenario: Expedicion de poliza con requisitos pendientes
Meta:
@manual
Given estoy expidiendo una poliza nueva con DNI diferente para tomador,asegurado y beneficiario
When los dni tengan requisitos pendientes
And se expida la poliza
Then se debe generar un mensanje indicando que existen requisitos pendientes

Scenario:Modificacion de poliza con requisitos pendientes
Meta:
@manual
Given estoy expidiendo una modificacion de poliza con DNI diferente para tomador y beneficiario
When los dni tengan requisitos pendientes
And se expida la poliza
Then se debe generar un mensaje indicando que existen requisitos pendientes

Scenario:Cancelacion de poliza con requisitos pendientes
Meta:
@manual
Given estoy expidiendo una cancelacion de poliza con DNI diferente para tomador,asegurado y beneficiario
When los dni tengan requisitos pendientes
And se expida la poliza
Then se debe generar un mensanje indicando que existen requisitos pendientes

Scenario:Transaccion de poliza con requisitos pendientes obligatorios
Meta:
@manual
Given estoy expidiendo una transaccion de poliza con dni diferente para tomador y beneficiario
When los dni tengan requisitos pendientes obligatorios
And se expida la poliza
And se debe generar un mensanje indicando que existen requisitos pendientes obligatorios
And no se debe permitir expedir la poliza

Scenario:Transaccion de poliza con requisitos pendientes
Meta:
@manual
Given estoy expidiendo una transaccion de poliza con dni diferente para tomador y beneficiario
When los dni tengan requisitos pendientes obligatorios
And edite la transaccion de poliza
And cambie uno de los beneficiarios con requisitos pendientes por uno que no los tenga
And se expida la poliza
And vaya a la opcion de requisitos
Then solo se debe mostrar el nombre del usuario que requier requisitos








