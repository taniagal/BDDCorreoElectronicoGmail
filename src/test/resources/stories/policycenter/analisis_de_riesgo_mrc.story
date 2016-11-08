Analisis De Riesgo Mrc

Meta:

Narrative:
Como usuario de Policy Center
Quiero poder gestionar los UW que se generen por bloqueo en la linea de multiriesgo corporativo

Scenario: Validad el valor ingresado superior al 10% en el sublimite de la cobertura deterioro de bienes refrigerados por rotura de maquinaria
GivenStories: stories/policycenter/login_policy.story
Given se ha realizado la cotizacion <cotizacion>
When intente expedir una poliza con un valor ingresado superior al 10% en el sublimite de la cobertura deterioro de bienes refrigerados por rotura de maquinaria
Then se debe generar un bloqueo en la poliza, mostrar el siguiente mensaje
|mensaje |
|La sumatoria del valor asegurable de todos los artículos de maquinaria y equipo contratistas de toda la póliza debe ser menor o igual al 10% del valor asegurable total de todos los artículos de la póliza.|
And generar un UW issue
|UWIssue |
|La sumatoria del valor asegurable de todos los artículos de maquinaria y equipo contratistas de toda la póliza debe ser menor o igual al 10% del valor asegurable total de todos los artículos de la póliza.|

Examples:
|cotizacion|
|0012638466|

Scenario: Validar que el valor ingresado en el sublimite de la cobertura  deterioro de bienes refrigerados por rotura de maquinaria, debe ser menor igual al 40% del valor asegurable de los artículos del riesgo o de la ubicación
Given se ha realizado la cotizacion <cotizacion>
When intente expedir una poliza con un valor ingresado en el sublimite de la cobertura deterioro de bienes refrigerados por rotura de maquinaria, mayor al 40% del valor asegurable de los artículos del riesgo o de la ubicación
Then se debe generar un bloqueo en la poliza, mostrar el siguiente mensaje
|mensaje |
| |
And generar un UW issue
|UWIssue |
||

Examples:
|cotizacion|
|0012638466|