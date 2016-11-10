Analisis De Riesgo Pa

Meta:

Narrative:
Como usuario de Policy Center
Quiero poder gestionar los UW que se generen por bloqueo en la linea de auto personal

Scenario: Validar valor del vehiculo en expedicion de poliza
GivenStories: stories/policycenter/login_policy.story
Given se ha realizado la cotizacion <cotizacion>
When intente expedir una poliza con un valor asegurado del vehiculo superior al permitido
Then se debe generar un bloqueo en la poliza, mostrar el siguiente mensaje
|mensaje |
|El valor asegurado del vehículo ($369.900.000,00) supera el límite máximo permitido por políticas. El aseguramiento de este carro así como la oferta presentada al cliente, deben ser avalados previamente por el Comité de Riesgo No Estándar Autos|
And generar un UW issue
|UWIssue |
|El valor asegurado del vehículo ($369.900.000,00) supera el límite máximo permitido por políticas. El aseguramiento de este carro así como la oferta presentada al cliente, deben ser avalados previamente por el Comité de Riesgo No Estándar Autos|

Examples:
|cotizacion|
|34445557  |

Scenario: Validar valor de los accesorios del vehiculo en expedicion de poliza
Given se ha realizado la cotizacion <cotizacion>
When intente expedir una poliza con un valor de accesorios superior al permitido
Then se debe generar un bloqueo en la poliza, mostrar el siguiente mensaje
|mensaje |
|El valor de los accesorios es mayor al 20% del valor Asegurado|
And generar un UW issue
|UWIssue |
|El valor de los accesorios es mayor al 20% del valor Asegurado|

Examples:
|cotizacion|
|34445557  |

Scenario: Validar valor de los accesorios especiales del vehiculo en expedicion de poliza
Given se ha realizado la cotizacion <cotizacion>
When intente expedir una poliza con un valor de accesorios especiales superior al permitido
Then se debe generar un bloqueo en la poliza, mostrar el siguiente mensaje
|mensaje |
|El valor de los accesorios especiales es mayor al valor Asegurado del vehículo. Por favor verifique.|
And generar un UW issue
|UWIssue |
|El valor de los accesorios especiales es mayor al valor Asegurado del vehículo. Por favor verifique.|

Examples:
|cotizacion|
|34445557  |