Meta:
@issue #SUGWUSC-15127

Narrative:
As a user
I want to perform an action
So that I can achieve a business goal


Scenario: Verificar validaciones del ingreso de infromacion de vehiculos
Given estoy cotizando una poliza de PA en cuenta <cuenta> y producto <producto>
When vaya al agregar un vehiculo con datos faltantes
Then deben aparecer los mensajes de validacion:
|mensaje                                                             |
|Placa : Falta el campo obligatorio "Placa"                          |
|Modelo : Falta el campo obligatorio "Modelo"                        |
|Codigo fasecolda : Falta el campo obligatorio "Codigo fasecolda"    |
|Marca : Falta el campo obligatorio "Marca"                          |
|Ciudad circulación : Falta el campo obligatorio "Ciudad circulación"|
|Vehiculo servicio : Falta el campo obligatorio "Vehiculo servicio"  |
|Valor asegurado : Falta el campo obligatorio "Valor asegurado"      |

Examples:
|cuenta     |producto     |
|C001888888 |Auto personal|