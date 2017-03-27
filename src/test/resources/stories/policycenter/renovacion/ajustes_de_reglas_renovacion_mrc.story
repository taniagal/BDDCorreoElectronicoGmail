Meta:
@lote2
@tag equipo: 5, sprint: 15

Narrative:
Como usuario de policy center
Quiero que al momento de realizar la expedicion automatica no se apliquen polizas de multiriesgos
Para poder hacer un estudio y negociacion de cada poliza multiriesgo

Scenario: Renovacion Manual Riesgo Consultado
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza:
|cuenta    |producto               |
|C000777776|Multiriesgo corporativo|
When agregue una nueva ubicacion:
|departamento|ciudad  |direccion        |descripcion    |actividad                                 |medioVenta|
|Antioquia   |Medellin|CR 65 # 48 - 166 |Core de Seguros|Actividades de agencias de empleo temporal|Televentas|
And seleccione algunos articulos y sus cobertura:
|articulo |valor_asegurable|coberturas|
|Building |100000000       |Danos     |
And cotice el articulo
And expido la poliza y voy al archivo de poliza
And quiera realizar esta renovacion
And ingrese a edificios y ubicaciones en renovacion de poliza
And intente ingresar una nueva ubicacion sin riesgo consultable
| pais    | departamento| ciudad   | direccion    | actividadEconomica                          |medioVenta|
| Colombia| Antioquia   | Medellin | CR 400 25 46 | Acabado de productos textiles               |Televentas|
And ingrese las entradas en renovacion de poliza coberturas con interes adicional <cedula> <tipodocumento> <tipoBeneficiario> <numeroUbicacion>
| TAB                      | TIPO_ARTICULO | OTRO_ARTICULO_OTROS | COBERTURA        | ENTRADAS                                            | VALOR_ENTRADAS |
| Información de Artículos | Edificios     |                     |                  | Valor Reconstrucción                                | 100000000      |
| Información de Artículos | Edificios     |                     | Danos materiales | Valor asegurado danos materiales                    | 100000000      |
And cotice la renovacion
And cotice una poliza
Then debo ver un mensaje bloqueante
| mensaje                                                                                                       |
| JOSE PAEZ ALZATE, El asegurado es un riesgo no estándar y no es posible gestionar la solicitud por este canal |

Examples:
| rolUsuario | cedula    | tipoBeneficiario | tipodocumento        |numeroUbicacion|
| Asesor     | 9876543   | Asegurado        | CEDULA DE CIUDADANIA |2              |


Scenario: Renovacion Manual Peps
Given estoy cotizando una poliza:
|cuenta    |producto               |
|C000777776|Multiriesgo corporativo|
When agregue una nueva ubicacion:
|departamento|ciudad  |direccion        |descripcion    |actividad                                 |medioVenta|
|Antioquia   |Medellin|CR 65 # 48 - 166 |Core de Seguros|Actividades de agencias de empleo temporal|Televentas|
And seleccione algunos articulos y sus cobertura:
|articulo |valor_asegurable|coberturas|
|Building |100000000       |Danos     |
And cotice el articulo
And expido la poliza y voy al archivo de poliza
And quiera realizar esta renovacion
And ingrese a edificios y ubicaciones en renovacion de poliza
And intente ingresar una nueva ubicacion sin riesgo consultable
| pais    | departamento| ciudad   | direccion    | actividadEconomica                          |medioVenta|
| Colombia| Antioquia   | Medellin | CR 400 25 46 | Acabado de productos textiles               |Televentas|
And ingrese las entradas en renovacion de poliza coberturas con interes adicional <cedula> <tipodocumento> <tipoBeneficiario> <numeroUbicacion>
| TAB                      | TIPO_ARTICULO | OTRO_ARTICULO_OTROS | COBERTURA        | ENTRADAS                                            | VALOR_ENTRADAS |
| Información de Artículos | Edificios     |                     |                  | Valor Reconstrucción                                | 100000000      |
| Información de Artículos | Edificios     |                     | Danos materiales | Valor asegurado danos materiales                    | 100000000      |
And cotice la renovacion
And cotice una poliza
And emita la renovacion
And acepto la expedicion de poliza
Then debo ver un mensaje bloqueante
| mensaje                                                 |
| El asegurado(a) CAROLINA OCHOA con DNI C71318883 es PEP |

Examples:
| rolUsuario | cedula    | tipoBeneficiario | tipodocumento        |numeroUbicacion|
| Asesor     | 71318883  | Asegurado        | CEDULA DE CIUDADANIA |2              |

Scenario: Ejecutar Renovacion Automatica
Meta: @manual
Given inicie el proceso de ejecucion de renovacion automatica
When se ejecute
Then no se deben renovar automaticamente las polizas mrc


Scenario: Renovacion Manual
Meta: @manual
Given inicie la transacción de renovacion manual
When La poliza cuente con  menos una cobertura global(blankets) y un siniestro
Then debe permitir realizar la renovacion manual
