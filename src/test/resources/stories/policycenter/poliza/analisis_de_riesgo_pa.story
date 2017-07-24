Meta:
@lote6
@tag equipo: 5, sprint: 9

Narrative:
Como usuario de Policy Center
Quiero poder gestionar los UW que se generen por bloqueo en la linea de auto personal

Scenario: Validar valor del vehiculo, valor accesorios y accesorios especiales en expedicion de poliza
Meta:
@manual
Given _se ha realizado la cotizacion <cotizacion>
When _intente expedir una poliza con un valor asegurado del vehiculo, valor accesosios y accesorios especiales superior al permitido
Then _se debe generar un bloqueo en la poliza, mostrar el siguiente mensaje
|mensaje |
|El valor asegurado del vehículo ($310.000.000,00) supera el límite máximo permitido por políticas. El aseguramiento de este carro así como la oferta presentada al cliente, deben ser avalados previamente por el Comité de Riesgo No Estándar Autos|
|El valor de los accesorios especiales es mayor al valor Asegurado del vehículo. Por favor verifique.|
|El valor de los accesorios es mayor al 20% del valor Asegurado|
And _generar un UW issue
|UWIssue |
|El valor asegurado del vehículo ($310.000.000,00) supera el límite máximo permitido por políticas. El aseguramiento de este carro así como la oferta presentada al cliente, deben ser avalados previamente por el Comité de Riesgo No Estándar Autos|
|El valor de los accesorios especiales es mayor al valor Asegurado del vehículo. Por favor verifique.|
|El valor de los accesorios es mayor al 20% del valor Asegurado|
