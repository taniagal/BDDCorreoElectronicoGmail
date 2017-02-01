Meta: @lote4
@issue #SUGWUSC-5927
@tag team: 5

Narrative:
Como usuario de negocio
Quiero poder visualizar los requisitos po DNI diferente
Para la solucion de mrc


Scenario: Validar requisitos por dni en expedicion mrc
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza de mrc con documento:
| organizacion | producto                     | canal             | tipoPoliza | tipo_documento       | documento  | fecha_nacimiento | primer_nombre | primer_apellido | tipo_direccion          | direccion        | departamento | ciudad   | agente |
| Sura         | Multiriesgo corporativo      | Canal Tradicional | Individual | CEDULA DE CIUDADANIA | 1036543787 | 10/10/1973       | LUCIANA       | LONDOÑO         | DIRECCION DE RESIDENCIA | CALLE 65F #60-69 | Antioquia    | Medellin | INT-3  |
When quiera agregar un tomador adicional que es riesgo consultable <tipo_documento> <documento>
And ingrese a edificios y ubicaciones
And intente ingresar una nueva ubicacion sin riesgo consultable
And ingrese la entrada de las diferentes coberturas con interes <documento> <tipoBeneficiario> adicional
| TAB                      | TIPO_ARTICULO     | OTRO_ARTICULO_OTROS | COBERTURA        | ENTRADAS                         | VALOR_ENTRADAS |
| Información de Artículos | Edificios         |                     |                  | Valor Reconstrucción             | 100000000      |
| Información de Artículos | Edificios         |                     | Danos materiales | Valor asegurado danos materiales | 100000000      |
| Interes Adicional        | Interes Adicional |                     |                  | NULL                             | 00000          |
And voy a expedir una poliza
And confirmo el mensaje de expedir poliza
Then debe salir el nombre de los usuarios que requieren requisitos
|mensajes         |
|LUCIANA LONDOÑO  |
|CAROLINA OCHOA   |

Examples:
|departamento|ciudad  |direccion        |descripcion  |actividad                    |tipo_documento                 |documento  |tipoDocumento          |numeroDocumento|tipoBeneficiario      |
|Antioquia   |Medellin|CR 44 A # 43 - 00|Edificio Core|Acabado de productos textiles|CEDULA DE CIUDADANIA           |71318883   |CEDULA DE CIUDADANIA   |71123456       |Beneficiario Gratuito |

Scenario: transaccion de poliza con requisitos
Meta:
@manual
Given que estoy en una transaccion de poliza
When los dni tengan requisitos pendientes opcionales
And debe indicar mediante un mensaje que existenten requisitos pendientes opcionales
And cuando edite la transaccion de poliza
And cambie algun dni con requisitos pendientes por uno que no los tenga
Then me deben aparecer solo los requisitos de los dni que lo requieran


Scenario: Validar requisitos por dni en modificacion mrc
Given estoy cotizando una poliza de mrc con documento:
| organizacion | producto                     | canal             | tipoPoliza | tipo_documento       | documento  | fecha_nacimiento | primer_nombre | primer_apellido | tipo_direccion          | direccion        | departamento | ciudad   | agente |
| Sura         | Multiriesgo corporativo      | Canal Tradicional | Individual | CEDULA DE CIUDADANIA | 1067543220 | 10/10/1973       | LUCIANA       | LONDOÑO         | DIRECCION DE RESIDENCIA | CALLE 65F #60-69 | Antioquia    | Medellin | INT-3  |
And ingrese a edificios y ubicaciones
And intente ingresar una nueva ubicacion sin riesgo consultable
And intente ingresar las entradas de las diferentes coberturas
| TAB                      | TIPO_ARTICULO     | OTRO_ARTICULO_OTROS | COBERTURA        | ENTRADAS                         | VALOR_ENTRADAS |
| Información de Artículos | Edificios         |                     |                  | Valor Reconstrucción             | 100000000      |
| Información de Artículos | Edificios         |                     | Danos materiales | Valor asegurado danos materiales | 100000000      |
| Interes Adicional        | Interes Adicional |                     |                  | NULL                             | 00000          |
When intente cotizar
And expido la poliza y voy al archivo de poliza
And cuando intente cambiar informacion de la poliza MRC
And agrege un beneficiario mrc <tipoDocumento> <numeroDocumento><tipoBeneficiario>
And intente cotizar y expedir la poliza
Then debo ver un UW issue por cada figura que sea riesgo consultable bloqueante
| mensaje                                                     |
|Existen requisitos pendientes, diríjase a Análisis de riesgos|


Examples:
|tipoDocumento       |numeroDocumento|tipoBeneficiario     |
|CEDULA DE CIUDADANIA|71318883       |Beneficiario Gratuito|