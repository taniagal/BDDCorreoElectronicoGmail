Meta:
@lote6
@tag equipo: 3, sprint: 13

Narrative:
Se tiene una poliza expedida, al momento de realizar una modificación a un articulo con benefeiciario oneroso, se generan alertas.
Ademas se debe solicitar una autorización para expedir la modificación de una póliza con marca de RA especial.

Scenario: UW - poliza en reaseguro especial - poliza nueva en el producto MRC
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza de mrc:
| organizacion | producto                | tipo_documento       | fecha_nacimiento | primer_nombre | primer_apellido | tipo_direccion          | direccion       | departamento | ciudad   | agente |
| Sura         | Multiriesgo corporativo | CEDULA DE CIUDADANIA | 10/10/1968       | ROGELIO       | PATAQUIBA       | DIRECCION DE RESIDENCIA | CALLE 2I #21-22 | Antioquia    | Medellin | INT-3  |
When seleccione la poliza como reaseguro especial
And diligencie los campos de reaseguro aceptado
| comision | deposito | impuesto | transferencia |
| 100      | 100      | 100      | 100           |
And ingresa el asegurado <opcionAgregar>
And ingrese a buscar contacto del directorio con tipo de documento <tipoId> y numero de documento <numeroId>
And seleccione el contacto a agregar
And ingrese a edificios y ubicaciones
And intente ingresar una nueva ubicacion sin riesgo consultable
And ingrese la entrada de las diferentes coberturas mrc
| TAB                      | TIPO_ARTICULO | OTRO_ARTICULO_OTROS | COBERTURA        | ENTRADAS                         | VALOR_ENTRADAS |
| Información de Artículos | Edificios     |                     |                  | Valor Reconstrucción             | 200000000      |
| Información de Artículos | Edificios     |                     | Danos materiales | Valor asegurado danos materiales | 200000000      |
And intente cotizar y expedir la poliza
Then se debe generar un UW issue para solicitar autorizacion en la expedicion de poliza <mensaje>

Examples:
| tipoId               | numeroId   | opcionAgregar  | mensaje                                                                                                                                             |
| CEDULA DE CIUDADANIA | 1234567890 | Del Directorio | La póliza tiene la marca de reaseguro especial: Reaseguro aceptado. Por favor diríjase a la opción análisis de riesgo para solicitar la aprobación. |

Scenario: Modificacion de poliza con reaseguro especial - genera UW
Given estoy cotizando una poliza de mrc:
| organizacion | producto                | tipo_documento       | fecha_nacimiento | primer_nombre | primer_apellido | tipo_direccion          | direccion       | departamento | ciudad   | agente |
| Sura         | Multiriesgo corporativo | CEDULA DE CIUDADANIA | 10/10/1968       | CARLOS        | RUIZ            | DIRECCION DE RESIDENCIA | CALLE 2I #21-22 | Antioquia    | Medellin | INT-3  |
When seleccione la poliza como reaseguro especial
And diligencie los campos de reaseguro aceptado
| comision | deposito | impuesto | transferencia |
| 100      | 100      | 100      | 100           |
And ingresa el asegurado <opcionAgregar>
And ingrese a buscar contacto del directorio con tipo de documento <tipoId> y numero de documento <numeroId>
And seleccione el contacto a agregar
When ingrese a edificios y ubicaciones
And intente ingresar una nueva ubicacion sin riesgo consultable
And ingrese la entrada de las diferentes coberturas mrc
| TAB                      | TIPO_ARTICULO | OTRO_ARTICULO_OTROS | COBERTURA        | ENTRADAS                         | VALOR_ENTRADAS |
| Información de Artículos | Edificios     |                     |                  | Valor Reconstrucción             | 200000000      |
| Información de Artículos | Edificios     |                     | Danos materiales | Valor asegurado danos materiales | 200000000      |
And intente cotizar y expedir la poliza
And ingrese a analisis de riesgo
And realice la aprobacion especial
And acepto la expedicion de poliza
And acepto la expedicion de poliza
And expido la poliza
And ingrese al resumen de la poliza expedida
And cuando intente cambiar informacion de la poliza MRC con reaseguro especial
And ingrese a edificios y ubicaciones en cambio de poliza
And cotice el cambio de poliza con reaseguro especial en si
Then se debe generar un UW issue para solicitar autorizacion al expedir la modificación de poliza <mensaje>

Examples:
| tipoId               | numeroId   | opcionAgregar  | mensaje                                                                 |
| CEDULA DE CIUDADANIA | 1234567890 | Del Directorio | Esta oferta necesita autorización del asegurador antes de comprometerla.|

Scenario: Agregar algun interes adicional a un articulo que tiene beneficiario oneroso en el producto MRC
Given estoy cotizando una poliza de mrc:
| organizacion | producto                | tipo_documento       | fecha_nacimiento | primer_nombre | primer_apellido | tipo_direccion          | direccion       | departamento | ciudad   | agente |
| Sura         | Multiriesgo corporativo | CEDULA DE CIUDADANIA | 10/10/1968       | CAMILO        | LOPEZ           | DIRECCION DE RESIDENCIA | CALLE 2I #21-22 | Antioquia    | Medellin | INT-3  |
When ingrese a edificios y ubicaciones
And intente ingresar una nueva ubicacion sin riesgo consultable
And ingrese la entrada de las diferentes coberturas mrc
| TAB                      | TIPO_ARTICULO | OTRO_ARTICULO_OTROS | COBERTURA        | ENTRADAS                         | VALOR_ENTRADAS |
| Información de Artículos | Edificios     |                     |                  | Valor Reconstrucción             | 200000000      |
| Información de Artículos | Edificios     |                     | Danos materiales | Valor asegurado danos materiales | 200000000      |
And ingresar interes adicional <tipoBeneficiarios> a una sola cobertura
| TIPO_DE_DOCUMENTO | DOCUMENTO  | TIPOBENEFICIARIO |
| NIT               | 9202096740 | Oneroso          |
And intente cotizar y expedir la poliza
And ingrese al resumen de la poliza expedida
And cuando intente cambiar informacion de la poliza MRC
And ingrese a edificios y ubicaciones en cambio de poliza
And agregar algun interés adicional <agregarTipoBeneficiario> a un artículo que tiene beneficiario oneroso en cambio de poliza
| TIPO_DE_DOCUMENTO | DOCUMENTO  | TIPOBENEFICIARIO |
| NIT               | 9202096740 | Oneroso          |
Then se debe mostrar un mensaje de advertencia
| mensaje                                                                                                                                                                                       |
| Modificación con beneficario oneroso. Si la modificación afecta los intereses del beneficiario, por favor verifique que este haya suministrado la carta de autorización de dicha modificación |

Examples:
|  |
|  |