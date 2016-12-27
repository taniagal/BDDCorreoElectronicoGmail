Ajustes Coaseguros

Meta:
@lote2
@Story CDSEG-2778
@URL https://jira.suramericana.com.co/browse/CDSEG-2778
@tag automator:juan_gabriel_zapata
@Sprint 9



Scenario:  1 Validacion de campos obligatorios en tipo de coaseguro aceptado
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza de mrc:
|organizacion|producto               |canal            |tipo_documento      |fecha_nacimiento|primer_nombre|primer_apellido|tipo_direccion         |direccion       |departamento|ciudad  |agente|
|Sura        |Multiriesgo corporativo|Canal Tradicional|CEDULA DE CIUDADANIA|23/12/1982      |PACHO        |ANTONIA       |DIRECCION DE RESIDENCIA|CALLE 58C #50-39|Antioquia   |Medellin|INT-3 |
When agregue una nueva ubicacion departamento <departamento>, ciuad <ciudad>, direccion <direccion>
And descripcion <descripcion>, actividad economica <actividad>
And quiero agregar un coaseguro <TipoCo> con particion de aseguradoras
| ASEGURADORA                         | PARTICIPACION |
| Seguros Generales Suramericana S.A. | 60            |
| ACE SEGUROS S.A.                    | 40            |
And de clic en Aceptar de la ventana Coaseguro
Then se debe validar que se muestren los mensajes de obligatoriedad siguientes
| MENSAJES_WORKSPACE                                |
| Póliza de referencia : Falta el campo obligatorio |
| Número de documento : Falta el campo obligatorio  |



Examples:
| TipoCo   | numCuenta  | departamento | ciudad   | direccion         | descripcion   | actividad                     |
| Aceptado | C000777777 | Antioquia    | Medellin | CR 44 A # 45 - 00 | Edificio Core | Acabado de productos textiles |



Scenario:  2 Validacion de campo Numero de documento en tipo de coaseguro cedido
Given estoy cotizando una poliza de mrc:
|organizacion|producto               |canal            |tipo_documento      |fecha_nacimiento|primer_nombre|primer_apellido|tipo_direccion         |direccion       |departamento|ciudad  |agente|
|Sura        |Multiriesgo corporativo|Canal Tradicional|CEDULA DE CIUDADANIA|02/12/1990      |ZACARIAS        |ALBERTO       |DIRECCION DE RESIDENCIA|CALLE 50A #24-10|Antioquia   |Medellin|INT-3 |
When agregue una nueva ubicacion departamento <departamento>, ciuad <ciudad>, direccion <direccion>
And descripcion <descripcion>, actividad economica <actividad>
And quiero agregar un coaseguro <TipoCo> con particion de aseguradoras
| ASEGURADORA                         | PARTICIPACION |
| Seguros Generales Suramericana S.A. | 60            |
| ACE SEGUROS S.A.                    | 40            |
And de clic en Aceptar de la ventana Coaseguro
Then no se debe inhabilitar la opcion Numero de documento

Examples:
| TipoCo | numCuenta  | departamento | ciudad   | direccion         | descripcion   | actividad                     |
| Cedido | C000777777 | Antioquia    | Medellin | CR 44 A # 45 - 00 | Edificio Core | Acabado de productos textiles |


Scenario:  3 Validacion de coaseguro no editable en resumen e informacion de poliza
Given estoy cotizando una poliza de mrc:
|organizacion|producto               |canal            |tipo_documento      |fecha_nacimiento|primer_nombre|primer_apellido|tipo_direccion         |direccion       |departamento|ciudad  |agente|
|Sura        |Multiriesgo corporativo|Canal Tradicional|CEDULA DE CIUDADANIA|15/08/1972      |WILDIM        |RUPERT       |DIRECCION DE RESIDENCIA|CALLE 39G #25-10|Antioquia   |Medellin|INT-3 |
When agregue una nueva ubicacion departamento <departamento>, ciuad <ciudad>, direccion <direccion>
And descripcion <descripcion>, actividad economica <actividad>
And quiero agregar un coaseguro <TipoCo> con particion de aseguradoras
| ASEGURADORA                         | PARTICIPACION |
| Seguros Generales Suramericana S.A. | 60            |
| ACE SEGUROS S.A                     | 40            |
And de clic en Aceptar de la ventana Coaseguro
And ingrese a edificios y ubicaciones
And intente ingresar las entradas de las diferentes coberturas
| TAB                      | TIPO_ARTICULO | OTRO_ARTICULO_OTROS | COBERTURA        | ENTRADAS                         | VALOR_ENTRADAS |
| Información de Artículos | Edificios     |                     |                  | Valor Reconstrucción             | 100000000      |
| Información de Artículos | Edificios     |                     | Danos materiales | Valor asegurado danos materiales | 100000000      |
And intente cotizar y expedir la poliza
Then debo ver en el resumen de la poliza y en informacion de poliza los coaseguros no editables

Examples:
| numCuenta  | TipoCo | departamento | ciudad   | direccion         | descripcion   | actividad                     |
| C000777777 | Cedido | Antioquia    | Medellin | CR 44 A # 45 - 00 | Edificio Core | Acabado de productos textiles |
