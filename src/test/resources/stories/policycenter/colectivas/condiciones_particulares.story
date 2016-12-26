Condiciones particulares

Meta:
@lote1
@issue #CDSEG-4621
@sprint 11
@tag automator: juan_gabriel_zapata
@local



Scenario: 1 Antiguedad
Meta: @manual
Given tengo una póliza riesgo donde liberan la regla de modelo de vehículo (antigüedad) en las CP
When Ingrese en los datos del vehículo el modelo  y este sea  mayor a la antigüedad permitida según el plan
Then Se ebe expedir la transacción sin inconveniente
And Se debe generar el UW que ya existe "El modelo es superior al máximo permitido por este canal. Por favor verifique."

Examples:
||
||

Scenario: 2 Coberturas
Meta: @manual
Given Que están registradas las CP de coberturas en la póliza
When Esten seleccionando en la póliza riesgo las coberturas que se va a tomar para el vehículo
And estas coberturas se muestren pero no este registrado en las CP
Then Solo se deben mostrar las coberturas registradas en la condición particular de la póliza
And Se debe mostrar el mensaje de bloqueo "Existen coberturas, opciones o deducibles que no se encuentra registrada en las condiciones particulares de la póliza." y al intentar expedir en todas las operaciones se genera un UW

Examples:
||
||


Scenario: 3 Inspeccion
Meta: @manual
Given Que tengo una póliza riesgo donde liberan la regla de inspección como CP
When Ingrese en los datos del vehículo un modelo que no se considere 0 km y el campo de 0km este marcado como NO
Then Se ebe expedir la transacción sin inconveniente
And Se debe generar el UW que existe "El vehículo no tiene una inspección vigente a la fecha de ingreso del riesgo."

Examples:
||
||


Scenario: 4 Marcas no permitidas
Meta: @manual
Given Que tengo una póliza riesgo donde liberan la regla de marcas no permitidas como CP
When Ingrese en los datos del vehículo la marca y sea una marca no permitida
Then Se debe expedir la transacción sin inconveniente
And Se debe generar el UW que existe "Por política de la compañía este vehiculo no puede ser asegurado."

Examples:
||
||

Scenario: 5 Maximo valor asegurado
Meta: @manual
Given Que tengo una póliza riesgo donde liberan la regla de máximo valor vehículo como CP
When Ingrese en los datos del vehículo un valor asegurado superior al permitido por clase
Then Se debe expedir la transacción sin inconveniente
And Se debe mostrar el mesaje de alerta en el siguiente de la pantalla de info vehículo "El valor asegurado del vehículo supera el límite máximo permitido por políticas. El aseguramiento de este carro así como la oferta presentada al cliente, deben ser avalados previamente por el Comité de Riesgo No Estándar Autos."
And Se debe generar el UW que existe al intentar expedir "El valor asegurado del vehículo supera el límite máximo permitido por políticas. El aseguramiento de este carro así como la oferta presentada al cliente, deben ser avalados previamente por el Comité de Riesgo No Estándar Autos."

Examples:
||
||


Scenario: 6 Planes
Meta: @manual
Given Que están registradas las CP de planes en la póliza
When Este seleccionando en la póliza riesgo el plan que se va a tomar para el vehículo
Then Solo se deben mostrar los planes registrados en la condición particular de la póliza
And Se debe mostrar el mensaje de bloqueo "El plan seleccionado no se encuentra registrado en las condiciones particulares de la póliza." y al intentar expedir se genera un UW

Examples:
||
||

Scenario: 7 Tipo de servicio
Meta: @manual
Given Que tengo una póliza riesgo donde liberan los tipo de servicio no permitidos como CP
When Ingrese en los datos del vehículo el tipo de servicio público
Then Se ebe expedir la transacción sin inconveniente
And Al expedir se debe generar el UW que existe "Tipo de servicio no permitido, debe ser autorizado."

Examples:
||
||


Scenario: 8 Zonas no permitidas
Meta: @manual
Given Que tengo una póliza riesgo donde liberan las zonas no permitidas como CP
When Ingrese la ciudad de circulación y esta este dentro de una zona no permitida
Then Se ebe expedir la transacción sin inconveniente
And Se debe generar el UW que existe "Por política de la compañía no esta permitido asegurar vehículos que circulen en esta zona."

Examples:
||
||




