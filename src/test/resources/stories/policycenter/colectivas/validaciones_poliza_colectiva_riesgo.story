Meta:
@lote5
@tag equipo: 2

Narrative:
As a user
I want to perform an action
So that I can achieve a business goal

Scenario: 1 Validacion de unica ubicacion y  poliza riesgo sin riesgos
GivenStories: stories/policycenter/login_policy.story
Given que estoy en la informacion de la poliza con numero de subscripcion <numSubscripcion>
When copie la poliza
And ingrese a edificios y ubicaciones
And intente ingresar una nueva ubicacion sin riesgo consultable
And intente ingresar una nueva ubicacion sin riesgo consultable
And cotice una poliza
Then se debe mostrar el o los siguientes mensajes
| MENSAJES_WORKSPACE                                                                                                                                                                                         |
|Solo se permite ingresar un riesgo en la póliza.|
|No se puede cotizar una póliza CP sin artículos y coberturas|


Examples:
| numSubscripcion | rolUsuario |estadodos  |
| 33355336        | Asesor     |No visible |


Scenario: 2 Validacion asegurado por defecto en poliza riesgo
Given que estoy en la informacion de la poliza con numero de subscripcion <numSubscripcion>
When copie la poliza
And ingrese a edificios y ubicaciones
And intente ingresar una nueva ubicacion sin riesgo consultable
And intente ingresar las entradas de las diferentes coberturas
| TAB                      | TIPO_ARTICULO     | OTRO_ARTICULO_OTROS | COBERTURA        | ENTRADAS                         | VALOR_ENTRADAS |
| Información de Artículos | Edificios         |                     |                  | Valor Reconstrucción             | 100000000      |
| Información de Artículos | Edificios         |                     | Danos materiales | Valor asegurado danos materiales | 100000000      |
| Interes Adicional        | Interes Adicional |                     |                  |                                  |                |
Then no debe estar visible nigun contacto por defecto
And se debe mostrar el o los siguientes mensajes
| MENSAJES_WORKSPACE                                                                                                                                                                                         |
|debe tener mínimo un asegurado|


Examples:
| numSubscripcion |
| 33355336        |


Scenario: 3 Validacion ingreso de asegurado en poliza riesgo
Given que estoy en la informacion de la poliza con numero de subscripcion <numSubscripcion>
When copie la poliza
And ingrese a edificios y ubicaciones
And intente ingresar una nueva ubicacion sin riesgo consultable
And ingrese la entrada de las diferentes coberturas con interes <documento><tipodocumento><tipoBeneficiario> adicional
| TAB                      | TIPO_ARTICULO     | OTRO_ARTICULO_OTROS | COBERTURA        | ENTRADAS                         | VALOR_ENTRADAS |
| Información de Artículos | Edificios         |                     |                  | Valor Reconstrucción             | 100000000      |
| Información de Artículos | Edificios         |                     | Danos materiales | Valor asegurado danos materiales | 100000000      |
| Interes Adicional        | Interes Adicional |                     |                  | NULL                             | 00000          |
Then deben estar en estado <estadouno> las siguientes opciones
| OPCIONES_MENU           |
| Número de cotización    |

Examples:
| numSubscripcion | documento  | tipoBeneficiario | estadouno | estadodos  | tipodocumento        |
| 33355336        | 1060447895 | Asegurado        | Visible   | No visible | CEDULA DE CIUDADANIA |


Scenario: 4 Validacion datos asegurado en poliza riesgo
Meta:
@manual
Given que estoy en la poliza con numero de subscripcion <numSubscripcion>
When ingrese edificios y ubicaciones
And seleccione agregar contacto
Then se debe mostrar las opciones de persona natural, juridica y directorio
And agrego un asegurado
Then se debe mostrar la lista de tipo de beneficiario con las siguientes opciones: Arrendatario, Asegurado, Beneficiario gratuito, Beneficiario oneroso y Locatario
And Se deben visuaizar los datos de tipo y número de documento, nombre y apellidos, tipo de beneficiario y número de contrato

Examples:
||
||

Scenario: 5. Validacion datos asegurado en poliza riesgo autos
Meta:
@manual
Given  que estoy en la poliza con numero de subscripcion <numSubscripcion>
When  ingrese a asegurados
And  seleccione agregar contacto
Then  se debe mostrar las opciones de persona natural, juridica y directorio

Examples:
||
||