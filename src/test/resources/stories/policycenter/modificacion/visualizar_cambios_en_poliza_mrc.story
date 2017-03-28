Meta:
@lote4
@tag equipo: 5, sprint: 13

Narrative:
Como usuario de Policy Center con rol de agente, CSR, autorizador o gerente,
Quiero poder reviar el borrador de un cambio de poliza y comparar el cambio contra los valores previos
Para las polizas de mrc en policy center

Scenario: Comparacion de polizas al cambiar un dato por otro
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza de mrc:
| producto                | tipo_documento       | fecha_nacimiento | primer_nombre | primer_apellido | tipo_direccion          | direccion        | departamento | ciudad   | agente |
| Multiriesgo corporativo | CEDULA DE CIUDADANIA | 08/12/1973       | MARIA         | OSPINA          | DIRECCION DE RESIDENCIA | CALLE 48F #25-83 | Antioquia    | Medellin | INT-3  |
When ingrese a edificios y ubicaciones
And intente ingresar una nueva ubicacion en edificios
| pais     | departamento | ciudad   | direccion     | actividadEconomica            | medioVenta |
| Colombia | Antioquia    | Medellin | CR 102 22a 12 | Acabado de productos textiles | Televentas |
And intente ingresar las entradas de las diferentes coberturas
| TAB                      | TIPO_ARTICULO | OTRO_ARTICULO_OTROS | COBERTURA        | ENTRADAS                         | VALOR_ENTRADAS |
| Información de Artículos | Edificios     |                     |                  | Valor Reconstrucción             | 100000000      |
| Información de Artículos | Edificios     |                     | Danos materiales | Valor asegurado danos materiales | 100000000      |
And intente cotizar y expedir la poliza
And ingrese al resumen de la poliza expedida
And cuando intente cambiar informacion de la poliza MRC
And ingrese a edificios y ubicaciones en cambio de poliza
And intente ingresar una nueva ubicacion en edificios
| pais     | departamento | ciudad   | direccion   | actividadEconomica                    | medioVenta |
| Colombia | Antioquia    | Medellin | CR 44 99 65 | Actividades de apoyo a la agricultura | Televentas |
And tenga las entradas en cambio de poliza de las diferentes coberturas con interes <cedula><tipodocumento> <tipoBeneficiario>
| TAB                      | TIPO_ARTICULO | OTRO_ARTICULO_OTROS | COBERTURA        | ENTRADAS                         | VALOR_ENTRADAS |
| Información de Artículos | Edificios     |                     |                  | Valor Reconstrucción             | 100000000      |
| Información de Artículos | Edificios     |                     | Danos materiales | Valor asegurado danos materiales | 100000000      |
Then debe existir la comparacion entre datos de poliza existente y poliza nueva

Examples:
| rolUsuario | cedula  | tipoBeneficiario | tipodocumento        |
| Asesor     | 9876543 | Asegurado        | CEDULA DE CIUDADANIA |

Scenario: Comparacion de polizas al cambiar el valor de la reconstruccion
Given estoy cotizando una poliza:
| cuenta     | producto                |
| C000112402 | Multiriesgo corporativo |
When ingrese a edificios y ubicaciones
And intente ingresar una nueva ubicacion sin riesgo consultable
And intente ingresar las entradas de las diferentes coberturas
| TAB                      | TIPO_ARTICULO | OTRO_ARTICULO_OTROS | COBERTURA        | ENTRADAS                         | VALOR_ENTRADAS |
| Información de Artículos | Edificios     |                     |                  | Valor Reconstrucción             | 100000000      |
| Información de Artículos | Edificios     |                     | Danos materiales | Valor asegurado danos materiales | 100000000      |
And intente cotizar y expedir la poliza
And ingrese al resumen de la poliza expedida
And cuando intente cambiar informacion de la poliza MRC
And ingrese a edificios y ubicaciones en cambio de poliza
And cambie el valor de la reconstruccion <valorReconstruccion>
Then debe existir la comparacion entre datos de poliza existente y poliza nueva
Examples:
| valorReconstruccion |
| 200000000           |

Scenario: Comparacion de polizas al agregar asegurado
Given estoy cotizando una poliza:
| cuenta     | producto                |
| C000112402 | Multiriesgo corporativo |
When ingrese a edificios y ubicaciones
And intente ingresar una nueva ubicacion sin riesgo consultable
And intente ingresar las entradas de las diferentes coberturas
| TAB                      | TIPO_ARTICULO | OTRO_ARTICULO_OTROS | COBERTURA        | ENTRADAS                         | VALOR_ENTRADAS |
| Información de Artículos | Edificios     |                     |                  | Valor Reconstrucción             | 100000000      |
| Información de Artículos | Edificios     |                     | Danos materiales | Valor asegurado danos materiales | 100000000      |
And intente cotizar y expedir la poliza
And ingrese al resumen de la poliza expedida
And cuando intente cambiar informacion de la poliza MRC
And ingrese a edificios y ubicaciones en cambio de poliza
And intente ingresar una nueva ubicacion
And ingrese las entradas en cambio de poliza de las diferentes coberturas con interes <cedula><tipodocumento> <tipoBeneficiario> adicional
| TAB                      | TIPO_ARTICULO | OTRO_ARTICULO_OTROS | COBERTURA        | ENTRADAS                         | VALOR_ENTRADAS |
| Información de Artículos | Edificios     |                     |                  | Valor Reconstrucción             | 200000000      |
| Información de Artículos | Edificios     |                     | Danos materiales | Valor asegurado danos materiales | 200000000      |
Then debe existir la comparacion entre datos de poliza existente y poliza nueva
Examples:
| cedula   | tipodocumento        | tipoBeneficiario |
| 71318883 | CEDULA DE CIUDADANIA | Asegurado        |