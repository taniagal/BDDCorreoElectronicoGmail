Scenario: Mostrar opcion de reimpresion en una submission-mrc
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza de mrc:
| producto                | tipo_documento       | fecha_nacimiento | primer_nombre | primer_apellido | tipo_direccion          | direccion        | departamento | ciudad   | agente |
| Multiriesgo corporativo | CEDULA DE CIUDADANIA | 08/12/1973       | MARIA         | OSPINA          | DIRECCION DE RESIDENCIA | CALLE 48F #25-83 | Antioquia    | Medellin | INT-3  |
When ingrese a edificios y ubicaciones
And intente ingresar una nueva ubicacion en edificios
| pais     | departamento | ciudad   | direccion   | actividadEconomica            |
| Colombia | Antioquia    | Medellin | CR 52 22a 12 | Acabado de productos textiles |
And intente ingresar las entradas de las diferentes coberturas
| TAB                      | TIPO_ARTICULO | OTRO_ARTICULO_OTROS | COBERTURA        | ENTRADAS                         | VALOR_ENTRADAS |
| Información de Artículos | Edificios     |                     |                  | Valor Reconstrucción             | 100000000      |
| Información de Artículos | Edificios     |                     | Danos materiales | Valor asegurado danos materiales | 100000000      |
And intente cotizar y expedir la poliza
And ingrese al resumen de la poliza expedida
And vaya a la opcion transacciones de poliza
And cuando de click al boton reimprimir
And me deben aparecer las opciones por las cuales puedo imprimir
|opciones                        |
|Carátula                        |
|Carta de relación con el cliente|
|Endoso                          |
|Cotización                      |
And cuando vaya a la opcion documentos
Then se deben seleccionar todas las opciones por las cuales quiero reimprimir
Examples:
| rolUsuario |
| Asesor     |

Scenario: Mostrar opcion de reimpresion en un cambio de poliza mrc
Given estoy cotizando una poliza:
|cuenta    |producto               |
|C000112402|Multiriesgo corporativo|
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
And intente cotizar y expedir la poliza
And ingrese al resumen de la poliza expedida
And vaya a la opcion transacciones de poliza
And cuando de click al boton reimprimir
And me deben aparecer las opciones por las cuales puedo imprimir
|opciones                        |
|Carátula                        |
|Carta de relación con el cliente|
|Endoso                          |
|Cotización                      |
And cuando vaya a la opcion documentos
Then se deben seleccionar todas las opciones por las cuales quiero reimprimir
Examples:
| rolUsuario |valorReconstruccion|
| Asesor     |100000000          |

Scenario: No mostrar opcion reimpresion en poliza cotizada mrc
Given estoy cotizando una poliza de mrc:
| producto                | tipo_documento       | fecha_nacimiento | primer_nombre | primer_apellido | tipo_direccion          | direccion        | departamento | ciudad   | agente |
| Multiriesgo corporativo | CEDULA DE CIUDADANIA | 08/12/1973       | MARIA         | OSPINA          | DIRECCION DE RESIDENCIA | CALLE 48F #25-83 | Antioquia    | Medellin | INT-3  |
When ingrese a edificios y ubicaciones
And intente ingresar una nueva ubicacion en edificios
| pais     | departamento | ciudad   | direccion   | actividadEconomica            |
| Colombia | Antioquia    | Medellin | CR 52 22a 12 | Acabado de productos textiles |
And intente ingresar las entradas de las diferentes coberturas
| TAB                      | TIPO_ARTICULO | OTRO_ARTICULO_OTROS | COBERTURA        | ENTRADAS                         | VALOR_ENTRADAS |
| Información de Artículos | Edificios     |                     |                  | Valor Reconstrucción             | 100000000      |
| Información de Artículos | Edificios     |                     | Danos materiales | Valor asegurado danos materiales | 100000000      |
And intente cotizar
Then no se debe mostrar el boton reimpresion
Examples:
| rolUsuario |
| Asesor     |

Scenario: No mostrar opcion reimpresion en cambio de poliza cotizada mrc
Given estoy cotizando una poliza:
|cuenta    |producto               |
|C000112402|Multiriesgo corporativo|
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
And intente cotizar
Then no se debe mostrar el boton reimpresion
Examples:
| rolUsuario |valorReconstruccion|
| Asesor     |100000000          |

Scenario: Mostrar opcion de reimpresion en una renovacion de poliza mrc
Meta: @manual
Given tengo una renovacion de poliza expedida
When vaya a la opcion transacciones de poliza
Then me debe mostrar todas las opciones por las cuales puedo reimprimir
|opciones                        |
|Carátula                        |
|Carta de relación con el cliente|
|Endoso                          |
|Cotización                      |

Scenario: Mostrar opcion de reimpresion en una renovacion de poliza mrc
Meta: @manual
Given estoy expidiendo una renovacion de poliza
When cotice la renovacion
Then no me debe aparecer el boton de reimpresion



