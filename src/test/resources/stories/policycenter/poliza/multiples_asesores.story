multiples_asesores
Meta:@lote1
@issue #SUGWUSC-1162
@tag automator: danny_barrientos
@sprint 12


Narrative:
1.Se requiere la creación de una tabla relacionada al Policy Period que permita el almacenamiento de varios producer code para una póliza.
2.Se requiere cuando se esté en los datos de la póliza agregar  botones de insertar o borrar asesores (productores).
3.Para el ingreso de los datos del asesor se debe tener los siguientes campos :
- Código de asesor (productor): Este campo es obligatorio.
- Porcentaje: cada uno de los asesores debe tener un porcentaje de participación la suma de estos  siempre debe de ser del 100%.
- Rol de asesor: Siempre debe haber un asesor líder.  El producer of record será considerado como el asesor líder de la póliza.
4 - El cambio de los asesores se hace como un traspaso de cartera y se implementará en otras HU.

Disponibilidad Detalle Producto

Scenario: 1._Agregar mas de un asesor a una poliza MRC
GivenStories: stories/policycenter/login_policy.story
Given que existe una cuenta activa donde estoy cotizando una poliza:
|cuenta    |organizacion|producto               |canal            |
|C000112400|Sura        |Multiriesgo corporativo|Canal Tradicional|
When Debe permitir el ingreso de máximo 8 asesores en la poliza, validando la participacion
 del 100% de los asesores que intervienen en la poliza:
 |codigoAsesor                   |porcentaje             |rol                                                                        |
 |as1,as2,as3,as4,as5,as6,as7,as8|30,10,10,10,10,10,10,10|Lider,Adicional,Adicional,Adicional,Adicional,Adicional,Adicional,Adicional|
Then Debe quedar un asesor con rol:
 |rol|validarDato|
  |Lider|rol|
Examples:
||
||

Scenario: 1.1_Agregar mas de un asesor a una poliza AUTOS
Given que existe una cuenta activa donde estoy cotizando una poliza:
|cuenta    |organizacion|producto   |canal            |tipoPoliza|
|C000112400|Sura        |Autos      |Canal Tradicional|Individual|
When Debe permitir el ingreso de máximo 8 asesores en la poliza, validando la participacion
 del 100% de los asesores que intervienen en la poliza:
 |codigoAsesor                   |porcentaje             |rol                                                                        |
 |as1,as2,as3,as4,as5,as6,as7,as8|30,10,10,10,10,10,10,10|Lider,Adicional,Adicional,Adicional,Adicional,Adicional,Adicional,Adicional|
Then Debe quedar un asesor con rol:
  |rol|validarDato|
  |Lider|rol|
Examples:
||
||


Scenario:2._Validar numero de asesores AUTOS
Given que existe una cuenta activa donde estoy cotizando una poliza:
|cuenta    |organizacion|producto |canal            |tipoPoliza|
|C000112400|Sura        |Autos    |Canal Tradicional|Individual|
When se ingresa mas de 8 asesores:
 |codigoAsesor                   |porcentaje                    |rol                                                                                            |
 |as1,as2,as3,as4,as5,as6,as7,as8,as9|20,10,10,10,10,10,10,10,10|Lider,Adicional,Adicional,Adicional,Adicional,Adicional,Adicional,Adicional,Adicional,Adicional|
Then validar el mensajes:
  |mensaje|
  |La póliza debe tener máximo 8 intermediarios|
Examples:
||
||
Scenario: 2.1_validar numero de asesores MRC
Given que existe una cuenta activa donde estoy cotizando una poliza:
|cuenta    |organizacion|producto               |canal            |
|C000112400|Sura        |Multiriesgo corporativo|Canal Tradicional|
When se ingresa mas de 8 asesores:
 |codigoAsesor                   |porcentaje                    |rol                                                                                            |
 |as1,as2,as3,as4,as5,as6,as7,as8,as9|20,10,10,10,10,10,10,10,10|Lider,Adicional,Adicional,Adicional,Adicional,Adicional,Adicional,Adicional,Adicional,Adicional|
Then validar el mensajes:
  |mensaje|
  |La póliza debe tener máximo 8 intermediarios|
Examples:
||
||
Scenario: 3._validar participacion de los asesores AUTOS
Given que existe una cuenta activa donde estoy cotizando una poliza:
|cuenta    |organizacion|producto  |canal            |tipoPoliza|
|C000112400|Sura        |Autos     |Canal Tradicional|Individual|
When se ingresa mas del 100% a los asesores:
 |codigoAsesor                   |porcentaje             |rol                                                                                            |
 |as1,as2,as3,as4,as5,as6,as7,as8|40,10,10,10,10,10,10,10|Lider,Adicional,Adicional,Adicional,Adicional,Adicional,Adicional,Adicional|
Then validar el mensajes:
  |mensaje|
  |El total de la participación de todos los asesores en la póliza debe ser del 100%.|
Examples:
||
||
Scenario: 3.1_Validar participacion de los asesores MRC
Given que existe una cuenta activa donde estoy cotizando una poliza:
|cuenta    |organizacion|producto               |canal            |
|C000112400|Sura        |Multiriesgo corporativo|Canal Tradicional|
When se ingresa mas del 100% a los asesores:
 |codigoAsesor                   |porcentaje             |rol                                                                                            |
 |as1,as2,as3,as4,as5,as6,as7,as8|40,10,10,10,10,10,10,10|Lider,Adicional,Adicional,Adicional,Adicional,Adicional,Adicional,Adicional|
Then validar el mensajes:
  |mensaje|
  |El total de la participación de todos los asesores en la póliza debe ser del 100%.|
Examples:
||
||
Scenario: 4._Validar existencia de un solo codigo asesor MRC
Given que existe una cuenta activa donde estoy cotizando una poliza:
|cuenta    |organizacion|producto               |canal            |
|C000112400|Sura        |Multiriesgo corporativo|Canal Tradicional|
When Debe permitir el ingreso de máximo 8 asesores en la poliza, validando la participacion
 del 100% de los asesores que intervienen en la poliza:
 |codigoAsesor                   |porcentaje             |rol                                                                                            |
 |as1,as1,as3,as4,as5,as6,as7,as8|30,10,10,10,10,10,10,10|Lider,Adicional,Adicional,Adicional,Adicional,Adicional,Adicional,Adicional|
Then Debe quedar un codigo de asesor:
  |mensaje                                                         |validarDato|
  |La póliza ya cuenta con un asesor con código as1 , favor validar|codigoAsesor|
Examples:
||
||
Scenario: 4.1_Validar existencia de un solo codigo asesor AUTOS
Given que existe una cuenta activa donde estoy cotizando una poliza:
|cuenta    |organizacion|producto               |canal            |tipoPoliza|
|C000112400|Sura        |Autos                  |Canal Tradicional|Individual|
When Debe permitir el ingreso de máximo 8 asesores en la poliza, validando la participacion
 del 100% de los asesores que intervienen en la poliza:
 |codigoAsesor                   |porcentaje             |rol                                                                                            |
 |as1,as1,as3,as4,as5,as6,as7,as8|30,10,10,10,10,10,10,10|Lider,Adicional,Adicional,Adicional,Adicional,Adicional,Adicional,Adicional|
Then Debe quedar un codigo de asesor:
  |mensaje                                                         |validarDato|
  |La póliza ya cuenta con un asesor con código as1 , favor validar|codigoAsesor|
Examples:
||
||