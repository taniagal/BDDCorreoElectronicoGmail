Meta:
@issue #SUGWUSC-15127

Narrative:
Como usuario
Al cotizar una poliza de PA quiero ser capaz de registrar toda la información del vehiculo.


#Scenario: Verificar validaciones del ingreso de infromacion de vehiculos
#Given estoy cotizando una poliza de PA en cuenta <cuenta> y producto <producto>
#When vaya al agregar un vehiculo con datos faltantes
#Then deben aparecer los mensajes de validacion:
#|mensaje                                                             |
#|Placa : Falta el campo obligatorio "Placa"                          |
#|Modelo : Falta el campo obligatorio "Modelo"                        |
#|Codigo fasecolda : Falta el campo obligatorio "Codigo fasecolda"    |
#|Marca : Falta el campo obligatorio "Marca"                          |
#|Ciudad circulación : Falta el campo obligatorio "Ciudad circulación"|
#|Vehiculo servicio : Falta el campo obligatorio "Vehiculo servicio"  |
#|Valor asegurado : Falta el campo obligatorio "Valor asegurado"      |

#Examples:
#|cuenta     |producto     |
#|C001888888 |Auto personal|


#Scenario: verificar validacion de codigo facecolda erroneo
#Given estoy cotizando una poliza de PA en cuenta <cuenta> y producto <producto>
#When agrege un vehiculo con codigo fasecolda <codigo> que no existente
#Then debo ingresar un nuevo codigo

#Examples:
#|cuenta     |producto     |codigo|
#|C001888888 |Auto personal|acb123|


Scenario: verificar validaciones de riesgo consultable para motor, placa o chasis.
Given estoy cotizando una poliza de PA en cuenta <cuenta> y producto <producto>
When vaya al agregar un vehiculo con los datos:
|placa |modelo|codigo_fasecolda|clase_vehiculo|marca|ciudad_circulacion|vehiculo_servicio|valor_asegurado|
|T64497|2017  |01601146        |Motocarro     |     |ALTAMIRA          |Particular       |25121232       |

Then deben aparecer los mensajes de validacion:
|mensaje                                                                                                          |
|Placa : La placa T64497, Se trata de un riesgo no estandar y no es posible gestionar la solicitud por este canal.|
|Modelo : Falta el campo obligatorio "Modelo"                        |
|Codigo fasecolda : Falta el campo obligatorio "Codigo fasecolda"    |

Examples:
|cuenta     |producto     |
|C001888888 |Auto personal|