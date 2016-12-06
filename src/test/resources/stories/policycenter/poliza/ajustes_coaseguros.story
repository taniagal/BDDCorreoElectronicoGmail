Ajustes Coaseguros

Meta:
@lote2
@Story CDSEG-2778
@URL https://jira.suramericana.com.co/browse/CDSEG-2778
@tag automator:juan_gabriel_zapata
@Sprint 9

Scenario:  1 Validacion de coaseguro no editable en resumen e informacion de poliza
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza:
|cuenta    |organizacion|producto               |canal            |
|C000777777|Sura        |Multiriesgo corporativo|Canal Tradicional|
When agregue una nueva ubicacion departamento <departamento>, ciuad <ciudad>, direccion <direccion>
And descripcion <descripcion>, actividad economica <actividad>
And borro el articulo anterior
And quiero agregar un coaseguro <TipoCo> con particion de aseguradoras
| ASEGURADORA                         | PARTICIPACION |
| Seguros Generales Suramericana S.A. | 60            |
| COMPANIA DE SEGUROS BOLIVAR S.A.    | 40            |
And de clic en Aceptar de la ventana Coaseguro
And ingrese a edificios y ubicaciones
And intente ingresar las entradas de las diferentes coberturas
| TAB                      | TIPO_ARTICULO | OTRO_ARTICULO_OTROS | COBERTURA        | ENTRADAS                         | VALOR_ENTRADAS |
| Información de Artículos | Edificios     |                     |                  | Valor Reconstrucción             | 100000000      |
| Información de Artículos | Edificios     |                     | Danos materiales | Valor asegurado danos materiales | 100000000      |
And intente cotizar y expedir la poliza
Then debo ver en el resumen de la poliza y en informacion de poliza los coaseguros no editables

Examples:
| numCuenta | TipoCo | numSubscripcion|departamento|ciudad   |direccion        |descripcion  |actividad|
| C000777777| Cedido | 22222236       |Antioquia   |Medellin |CR 44 A # 45 - 00|Edificio Core|Acabado de productos textiles|



Scenario:  2 Validacion de campos obligatorios en tipo de coaseguro aceptado
Given estoy cotizando una poliza:
|cuenta    |organizacion|producto               |canal            |
|C000777777|Sura        |Multiriesgo corporativo|Canal Tradicional|
When agregue una nueva ubicacion departamento <departamento>, ciuad <ciudad>, direccion <direccion>
And descripcion <descripcion>, actividad economica <actividad>
And borro el articulo anterior
And quiero agregar un coaseguro <TipoCo> con particion de aseguradoras
| ASEGURADORA                         | PARTICIPACION |
| Seguros Generales Suramericana S.A. | 60            |
| COMPANIA DE SEGUROS BOLIVAR S.A.    | 40            |
And de clic en Aceptar de la ventana Coaseguro
Then se debe validar que se muestren los mensajes de obligatoriedad siguientes
| MENSAJES_WORKSPACE                                |
| Póliza de referencia : Falta el campo obligatorio |
| Número de documento : Falta el campo obligatorio  |



Examples:
| TipoCo   | numCuenta |numSubscripcion|departamento|ciudad   |direccion        |descripcion  |actividad|
| Aceptado | C000777777|22222236       |Antioquia   |Medellin |CR 44 A # 45 - 00|Edificio Core|Acabado de productos textiles|



Scenario:  3 Validacion de campo Numero de documento en tipo de coaseguro cedido
Given estoy cotizando una poliza:
|cuenta    |organizacion|producto               |canal            |
|C000777777|Sura        |Multiriesgo corporativo|Canal Tradicional|
When agregue una nueva ubicacion departamento <departamento>, ciuad <ciudad>, direccion <direccion>
And descripcion <descripcion>, actividad economica <actividad>
And borro el articulo anterior
And quiero agregar un coaseguro <TipoCo> con particion de aseguradoras
| ASEGURADORA                         | PARTICIPACION |
| Seguros Generales Suramericana S.A. | 60            |
| COMPANIA DE SEGUROS BOLIVAR S.A.    | 40            |
And de clic en Aceptar de la ventana Coaseguro
Then no se debe inhabilitar la opcion Numero de documento

Examples:
| TipoCo   | numCuenta | numSubscripcion|departamento|ciudad   |direccion        |descripcion  |actividad|
| Cedido   | C000777777| 22222236       |Antioquia   |Medellin |CR 44 A # 45 - 00|Edificio Core|Acabado de productos textiles|
