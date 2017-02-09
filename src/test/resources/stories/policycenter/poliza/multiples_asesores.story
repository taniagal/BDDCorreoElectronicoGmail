Meta:
@lote3
@tag equipo: billing
@sprint 12

Narrative:
1.Se requiere la creacion de una tabla relacionada al Policy Period que permita el almacenamiento de varios producer code para una poliza.
2.Se requiere cuando se esté en los datos de la póliza agregar  botones de insertar o borrar asesores (productores).
3.Para el ingreso de los datos del asesor se debe tener los siguientes campos :
- Código de asesor (productor): Este campo es obligatorio.
- Porcentaje: cada uno de los asesores debe tener un porcentaje de participación la suma de estos  siempre debe de ser del 100%.
- Rol de asesor: Siempre debe haber un asesor líder.  El producer of record será considerado como el asesor líder de la póliza.
4 - El cambio de los asesores se hace como un traspaso de cartera y se implementará en otras HU.

Disponibilidad Detalle Producto

Scenario: 1_Agregar mas de un asesor a una poliza MRC
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza de mrc:
|oficina|agente_oficina|organizacion|producto               |tipo_documento      |fecha_nacimiento|primer_nombre|primer_apellido|tipo_direccion         |direccion       |departamento|ciudad  |agente|
|1073   |DIRECTO       |Sura        |Multiriesgo corporativo|CEDULA DE CIUDADANIA|02/12/1990      |MARIO        |AKERMAN        |DIRECCION DE RESIDENCIA|CALLE 54B #50-25|Antioquia   |Medellin|INT-3 |
When Debe permitir el ingreso de maximo 8 asesores en la poliza, validando la participacion del 100% de los asesores que intervienen en la poliza:
|codigoAsesor|porcentaje|rol      |
|10995       |30        |Lider    |
|11005       |10        |Adicional|
|10697       |10        |Adicional|
|10686       |10        |Adicional|
|10671       |10        |Adicional|
|9628        |10        |Adicional|
|1916        |10        |Adicional|
|5676        |10        |Adicional|
Then Debe quedar un asesor con rol:
|rol  |validarDato|
|Lider|rol        |
Examples:
||
||


Scenario: 2_Agregar mas de un asesor a una poliza AUTOS
Given estoy cotizando una poliza de autos:
|oficina|agente_oficina|organizacion|tipoPoliza|producto |tipo_documento      |fecha_nacimiento|primer_nombre|primer_apellido|tipo_direccion         |direccion       |departamento|ciudad  |agente|
|1059   |DIRECTO       |Sura        |Individual|Autos    |CEDULA DE CIUDADANIA|02/12/1990      |AUTOMAN        |AKERMAN       |DIRECCION DE RESIDENCIA|CALLE 54B #50-25|Antioquia   |Medellin|INT-3 |
When Debe permitir el ingreso de maximo 8 asesores en la poliza, validando la participacion del 100% de los asesores que intervienen en la poliza:
|codigoAsesor|porcentaje|rol      |
|10960       |30        |Lider    |
|10962       |10        |Adicional|
|10787       |10        |Adicional|
|10714       |10        |Adicional|
|10272       |10        |Adicional|
|1681        |10        |Adicional|
|5676        |10        |Adicional|
|5947        |10        |Adicional|
Then Debe quedar un asesor con rol:
|rol  |validarDato|
|Lider|rol        |
Examples:
||
||


Scenario: 3_Validar numero de asesores MRC
Given estoy cotizando una poliza de mrc:
|oficina|agente_oficina|organizacion|producto               |tipo_documento      |fecha_nacimiento|primer_nombre|primer_apellido|tipo_direccion         |direccion       |departamento|ciudad  |agente|
|1073   |DIRECTO       |Sura        |Multiriesgo corporativo|CEDULA DE CIUDADANIA|02/12/1990      |MARIO        |AKERMAN       |DIRECCION DE RESIDENCIA|CALLE 54B #50-25|Antioquia   |Medellin|INT-3 |
When se ingresa mas de 8 asesores:
|codigoAsesor|porcentaje|rol      |
|10995       |20        |Lider    |
|11005       |10        |Adicional|
|10697       |10        |Adicional|
|10686       |10        |Adicional|
|10671       |10        |Adicional|
|9628        |10        |Adicional|
|1916        |10        |Adicional|
|5676        |10        |Adicional|
|5947        |10        |Adicional|
Then validar el mensajes:
|mensaje|
|La póliza debe tener máximo 8 intermediarios|
Examples:
||
||


Scenario: 4_validar numero de asesores AUTOS
Given estoy cotizando una poliza de autos:
|oficina|agente_oficina|organizacion|producto |tipoPoliza|tipo_documento      |fecha_nacimiento|primer_nombre|primer_apellido|tipo_direccion         |direccion       |departamento|ciudad  |agente|
|1059   |DIRECTO       |Sura        |Autos    |Individual|CEDULA DE CIUDADANIA|02/12/1990      |AUTOMAN        |AKERMAN       |DIRECCION DE RESIDENCIA|CALLE 54B #50-25|Antioquia   |Medellin|INT-3 |
When se ingresa mas de 8 asesores:
|codigoAsesor|porcentaje|rol      |
|10960       |20        |Lider    |
|10962       |10        |Adicional|
|10787       |10        |Adicional|
|10714       |10        |Adicional|
|10272       |10        |Adicional|
|1681        |10        |Adicional|
|5676        |10        |Adicional|
|5947        |10        |Adicional|
|193         |10        |Adicional|
Then validar el mensajes:
|mensaje|
|La póliza debe tener máximo 8 intermediarios|
Examples:
||
||


Scenario: 5_Validar participacion de los asesores MRC
Given estoy cotizando una poliza de mrc:
|oficina|agente_oficina|organizacion|producto               |tipo_documento      |fecha_nacimiento|primer_nombre|primer_apellido|tipo_direccion         |direccion       |departamento|ciudad  |agente|
|1073   |DIRECTO       |Sura        |Multiriesgo corporativo|CEDULA DE CIUDADANIA|02/12/1990      |MARIO        |AKERMAN       |DIRECCION DE RESIDENCIA|CALLE 54B #50-25|Antioquia   |Medellin|INT-3 |
When se ingresa mas del 100% a los asesores:
|codigoAsesor|porcentaje|rol      |
|10995       |40        |Lider    |
|11005       |10        |Adicional|
|10697       |10        |Adicional|
|10686       |10        |Adicional|
|10671       |10        |Adicional|
|9628        |10        |Adicional|
|1916        |10        |Adicional|
|5676        |10        |Adicional|
|5947        |10        |Adicional|
Then validar el mensajes:
|mensaje|
|El total de la participación de todos los asesores en la póliza debe ser del 100%.|
Examples:
||
||


Scenario: 6_validar participacion de los asesores AUTOS
Given estoy cotizando una poliza de autos:
|oficina|agente_oficina|organizacion|producto |tipoPoliza|tipo_documento      |fecha_nacimiento|primer_nombre|primer_apellido|tipo_direccion         |direccion       |departamento|ciudad  |agente|
|1059   |DIRECTO       |Sura        |Autos    |Individual|CEDULA DE CIUDADANIA|02/12/1990      |AUTOMAN        |AKERMAN       |DIRECCION DE RESIDENCIA|CALLE 54B #50-25|Antioquia   |Medellin|INT-3 |
When se ingresa mas del 100% a los asesores:
|codigoAsesor|porcentaje|rol      |
|10960       |40        |Lider    |
|10962       |10        |Adicional|
|10787       |10        |Adicional|
|10714       |10        |Adicional|
|10272       |10        |Adicional|
|1681        |10        |Adicional|
|5676        |10        |Adicional|
|5947        |10        |Adicional|
Then validar el mensajes:
|mensaje|
|El total de la participación de todos los asesores en la póliza debe ser del 100%.|
Examples:
||
||


Scenario: 7_Validar existencia de un solo codigo asesor MRC
Given estoy cotizando una poliza de mrc:
|oficina|agente_oficina|organizacion|producto               |tipo_documento      |fecha_nacimiento|primer_nombre|primer_apellido|tipo_direccion         |direccion       |departamento|ciudad  |agente|
|1073   |DIRECTO       |Sura        |Multiriesgo corporativo|CEDULA DE CIUDADANIA|02/12/1990      |MARIO        |AKERMAN       |DIRECCION DE RESIDENCIA|CALLE 54B #50-25|Antioquia   |Medellin|INT-3 |
When Debe permitir el ingreso de maximo 8 asesores en la poliza, validando la participacion del 100% de los asesores que intervienen en la poliza:
|codigoAsesor|porcentaje|rol      |
|10995       |30        |Lider    |
|11005       |10        |Adicional|
|10697       |10        |Adicional|
|10686       |10        |Adicional|
|10671       |10        |Adicional|
|9628        |10        |Adicional|
|1916        |10        |Adicional|
|5676        |10        |Adicional|
Then Debe quedar un codigo de asesor:
|mensaje                                                          |validarDato|
|La póliza ya cuenta con un asesor con código 4999 , favor validar|codigoAsesor|
Examples:
||
||


Scenario: 8_Validar existencia de un solo codigo asesor AUTOS
Given estoy cotizando una poliza de autos:
|oficina|agente_oficina|organizacion|producto |tipoPoliza|tipo_documento      |fecha_nacimiento|primer_nombre|primer_apellido|tipo_direccion         |direccion       |departamento|ciudad  |agente|
|1059   |DIRECTO       |Sura        |Autos    |Individual|CEDULA DE CIUDADANIA|02/12/1990      |AUTOMAN        |AKERMAN       |DIRECCION DE RESIDENCIA|CALLE 54B #50-25|Antioquia   |Medellin|INT-3 |
When Debe permitir el ingreso de maximo 8 asesores en la poliza, validando la participacion del 100% de los asesores que intervienen en la poliza:
|codigoAsesor|porcentaje|rol      |
|10960       |30        |Lider    |
|10962       |10        |Adicional|
|10787       |10        |Adicional|
|10714       |10        |Adicional|
|10272       |10        |Adicional|
|1681        |10        |Adicional|
|5676        |10        |Adicional|
|5947        |10        |Adicional|
Then Debe quedar un codigo de asesor:
|mensaje                                                          |validarDato|
|La póliza ya cuenta con un asesor con código 4999 , favor validar|codigoAsesor|
Examples:
||
||