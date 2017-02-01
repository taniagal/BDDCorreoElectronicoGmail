Meta:
@lote3
@tag equipo: 3
@local
@Sprint 13


Narrative:
Se tiene una poliza expedida, al momento de realizar una modificación a un articulo con benefeiciario oneroso, se generan alertas.
Ademas se debe solicitar una autorización para expedir la modificación de una póliza con marca de RA especial.

Scenario: Retirar artículo con beneficiario oneroso en el producto MRC
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza de mrc:
|organizacion|tipo_documento      |fecha_nacimiento|primer_nombre|primer_apellido|tipo_direccion         |direccion       |departamento|ciudad  |agente|
|Sura        |CEDULA DE CIUDADANIA|10/10/1968      |ROGELIO         |PATAQUIBA   |DIRECCION DE RESIDENCIA|CALLE 2I #21-22|Antioquia    |Medellin|INT-3|
When ingrese a edificios y ubicaciones
And intente ingresar una nueva ubicacion sin riesgo consultable
And ingrese la entrada de las diferentes coberturas mrc
| TAB                      | TIPO_ARTICULO          | OTRO_ARTICULO_OTROS | COBERTURA        | ENTRADAS                                                                             | VALOR_ENTRADAS |
| Información de Artículos | Edificios              |                     |                  | Valor Reconstrucción                                                                 | 100000000      |
| Información de Artículos | Edificios              |                     | Danos materiales | Valor asegurado danos materiales                                                     | 100000000      |
| Información de Artículos | Maquinaria y equipo    |                     |                  | Valor Asegurable                                                                     | 100000000      |
| Información de Artículos | Maquinaria y equipo    |                     | Terremoto        |                                                                                      | 100000000      |
And ingresar interes adicional <tipoBeneficiario> a cada cobertura
| TIPO_DE_DOCUMENTO        | DOCUMENTO          |TIPOBENEFICIARIO|
| NIT                      | 9202086744         |Oneroso         |
And intente cotizar y expedir la poliza
And ingrese al resumen de la poliza expedida
And cuando intente cambiar informacion de la poliza MRC
And ingrese a edificios y ubicaciones en cambio de poliza
And ingrese las entradas en cambio de poliza y verificar las reglas de oneroso
Then se debe mostrar un mensaje de advertencia
| mensaje                                                                                                                                                                                       |
| Modificación con beneficario oneroso. Si la modificación afecta los intereses del beneficiario, por favor verifique que este haya suministrado la carta de autorización de dicha modificación |

Examples:
||
||

Scenario: Modificación de artículo con beneficiario oneroso en el producto MRC
Given estoy cotizando una poliza de mrc:
|organizacion|producto               |canal            |tipo_documento      |fecha_nacimiento|primer_nombre|primer_apellido|tipo_direccion         |direccion       |departamento|ciudad  |agente|
|Sura        |Multiriesgo corporativo|Canal Tradicional|CEDULA DE CIUDADANIA|10/10/1968      |DIANA         |CARDONA   |DIRECCION DE RESIDENCIA|CALLE 2I #21-22|Antioquia    |Medellin|INT-3|
When ingrese a edificios y ubicaciones
And intente ingresar una nueva ubicacion sin riesgo consultable
And ingrese la entrada de las diferentes coberturas mrc
| TAB                      | TIPO_ARTICULO          | OTRO_ARTICULO_OTROS | COBERTURA        | ENTRADAS                                | VALOR_ENTRADAS |
| Información de Artículos | Edificios              |                     |                  | Valor Reconstrucción                    | 100000000      |
| Información de Artículos | Edificios              |                     | Danos materiales | Valor asegurado danos materiales        | 100000000      |
And ingresar interes adicional <tipoBeneficiarios> a una sola cobertura
| TIPO_DE_DOCUMENTO        | DOCUMENTO          |TIPOBENEFICIARIO|
| NIT                      | 9202086744         |Oneroso         |
And intente cotizar y expedir la poliza
And ingrese al resumen de la poliza expedida
And cuando intente cambiar informacion de la poliza MRC
And ingrese a edificios y ubicaciones en cambio de poliza
And ingrese a modificar articulo con beneficiario oneroso en cambio de poliza
| TAB                      | TIPO_ARTICULO          | OTRO_ARTICULO_OTROS | COBERTURA           | ENTRADAS                 | VALOR_ENTRADAS |
| Información de Artículos | Edificios              |                     |                     | Valor Reconstrucción     | 200000000      |
Then se debe mostrar un mensaje de advertencia
| mensaje                                                                                                                                                                                       |
| Modificación con beneficario oneroso. Si la modificación afecta los intereses del beneficiario, por favor verifique que este haya suministrado la carta de autorización de dicha modificación |

Examples:
||
||

Scenario: Retirar algún beneficiario oneroso de un articulo en el producto MRC
Given estoy cotizando una poliza de mrc:
|organizacion|producto               |canal            |tipo_documento      |fecha_nacimiento|primer_nombre|primer_apellido|tipo_direccion         |direccion       |departamento|ciudad  |agente|
|Sura        |Multiriesgo corporativo|Canal Tradicional|CEDULA DE CIUDADANIA|10/10/1968      |CARLOS         |POSADA   |DIRECCION DE RESIDENCIA|CALLE 2I #21-22|Antioquia    |Medellin|INT-3|
When ingrese a edificios y ubicaciones
And intente ingresar una nueva ubicacion sin riesgo consultable
And ingrese la entrada de las diferentes coberturas mrc
| TAB                      | TIPO_ARTICULO          | OTRO_ARTICULO_OTROS | COBERTURA        | ENTRADAS                                | VALOR_ENTRADAS |
| Información de Artículos | Edificios              |                     |                  | Valor Reconstrucción                    | 200000000      |
| Información de Artículos | Edificios              |                     | Danos materiales | Valor asegurado danos materiales        | 200000000      |
And ingresar interes adicional <tipoBeneficiarios> a una sola cobertura
| TIPO_DE_DOCUMENTO        | DOCUMENTO          |TIPOBENEFICIARIO|
| NIT                      | 9202086744         |Oneroso         |
And intente cotizar y expedir la poliza
And ingrese al resumen de la poliza expedida
And cuando intente cambiar informacion de la poliza MRC
And ingrese a edificios y ubicaciones en cambio de poliza
And intente retirar un beneficiario oneroso de algun articulo en cambio de poliza
Then se debe mostrar un mensaje de advertencia
| mensaje                                                                                                                                                                                       |
| Modificación con beneficario oneroso. Si la modificación afecta los intereses del beneficiario, por favor verifique que este haya suministrado la carta de autorización de dicha modificación |

Examples:
||
||