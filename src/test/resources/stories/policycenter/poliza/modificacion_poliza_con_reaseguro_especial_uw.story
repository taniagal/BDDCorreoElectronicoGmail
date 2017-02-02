Meta:
@lote3
@tag equipo: 3
@local
@Sprint 13


Narrative:
Se tiene una poliza expedida, al momento de realizar una modificación a un articulo con benefeiciario oneroso, se generan alertas.
Ademas se debe solicitar una autorización para expedir la modificación de una póliza con marca de RA especial.

Scenario: UW-póliza en reaseguro especial-póliza nueva en el producto MRC
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza de mrc:
|organizacion|producto               |tipo_documento      |fecha_nacimiento|primer_nombre|primer_apellido|tipo_direccion         |direccion       |departamento|ciudad  |agente|
|Sura        |Multiriesgo corporativo|CEDULA DE CIUDADANIA|10/10/1968      |ROGELIO         |PATAQUIBA   |DIRECCION DE RESIDENCIA|CALLE 2I #21-22|Antioquia    |Medellin|INT-3|
When seleccione la poliza como reaseguro especial
And ingrese a edificios y ubicaciones
And intente ingresar una nueva ubicacion sin riesgo consultable
And ingrese la entrada de las diferentes coberturas mrc
|TAB                      | TIPO_ARTICULO          | OTRO_ARTICULO_OTROS | COBERTURA        | ENTRADAS                                | VALOR_ENTRADAS |
|Información de Artículos | Edificios              |                     |                  | Valor Reconstrucción                    | 200000000      |
|Información de Artículos | Edificios              |                     | Danos materiales | Valor asegurado danos materiales        | 200000000      |
And intente cotizar y expedir la poliza
Then se debe generar un UW issue para poder expedir la póliza nueva <mensaje>

Examples:
|mensaje                                                                |
|La póliza tiene reaseguro especial y la expedición debe ser autorizada |

Scenario: UW-póliza en reaseguro especial-póliza nueva en el producto MRC
Given estoy cotizando una poliza de mrc:
|organizacion|producto               |tipo_documento      |fecha_nacimiento|primer_nombre|primer_apellido|tipo_direccion         |direccion       |departamento|ciudad  |agente|
|Sura        |Multiriesgo corporativo|CEDULA DE CIUDADANIA|10/10/1968      |CARLOS         |RUIZ   |DIRECCION DE RESIDENCIA|CALLE 2I #21-22|Antioquia    |Medellin|INT-3|
When ingrese a edificios y ubicaciones
And intente ingresar una nueva ubicacion sin riesgo consultable
And ingrese la entrada de las diferentes coberturas mrc
|TAB                      | TIPO_ARTICULO          | OTRO_ARTICULO_OTROS | COBERTURA        | ENTRADAS                                | VALOR_ENTRADAS |
|Información de Artículos | Edificios              |                     |                  | Valor Reconstrucción                    | 200000000      |
|Información de Artículos | Edificios              |                     | Danos materiales | Valor asegurado danos materiales        | 200000000      |
And intente cotizar y expedir la poliza
And ingrese al resumen de la poliza expedida
And cuando intente cambiar informacion de la poliza MRC con reaseguro especial
And ingrese a edificios y ubicaciones en cambio de poliza
And cotice el cambio de poliza con reaseguro especial en si
And expida el cambio de la poliza
Then Se debe generar un UW issue para poder expedir la modificación <mensaje>

Examples:
|mensaje                                                               |
|La póliza tiene reaseguro especial y la expedición debe ser autorizada|

Scenario: Agregar algún interés adicional a un articulo que tiene beneficiario oneroso en el producto MRC
Given estoy cotizando una poliza de mrc:
|organizacion|producto               |tipo_documento      |fecha_nacimiento|primer_nombre|primer_apellido|tipo_direccion         |direccion       |departamento|ciudad  |agente|
|Sura        |Multiriesgo corporativo|CEDULA DE CIUDADANIA|10/10/1968      |CAMILO         |LOPEZ   |DIRECCION DE RESIDENCIA|CALLE 2I #21-22|Antioquia    |Medellin|INT-3|
When ingrese a edificios y ubicaciones
And intente ingresar una nueva ubicacion sin riesgo consultable
And ingrese la entrada de las diferentes coberturas mrc
|TAB                      |TIPO_ARTICULO          | OTRO_ARTICULO_OTROS | COBERTURA        | ENTRADAS                                | VALOR_ENTRADAS |
|Información de Artículos |Edificios              |                     |                  | Valor Reconstrucción                    | 200000000      |
|Información de Artículos |Edificios              |                     | Danos materiales | Valor asegurado danos materiales        | 200000000      |
And ingresar interes adicional <tipoBeneficiarios> a una sola cobertura
|TIPO_DE_DOCUMENTO        | DOCUMENTO          |TIPOBENEFICIARIO|
|NIT                      | 9202086744         |Oneroso         |
And intente cotizar y expedir la poliza
And ingrese al resumen de la poliza expedida
And cuando intente cambiar informacion de la poliza MRC
And ingrese a edificios y ubicaciones en cambio de poliza
And agregar algun interés adicional <agregarTipoBeneficiario> a un artículo que tiene beneficiario oneroso en cambio de poliza
|TIPO_DE_DOCUMENTO        | DOCUMENTO          |TIPOBENEFICIARIO|
|NIT                      | 9202086744         |Oneroso         |
Then se debe mostrar un mensaje de advertencia
|mensaje                                                                                                                                                                                      |
|Modificación con beneficario oneroso. Si la modificación afecta los intereses del beneficiario, por favor verifique que este haya suministrado la carta de autorización de dicha modificación|

Examples:
||
||