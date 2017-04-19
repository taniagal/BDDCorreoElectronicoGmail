Meta:
@lote5
@tag equipo: 2, sprint: 13

Narrative:
Como usuario PolicyCenter
quiero poder buscar riesgos de CP por pais,departamento,ciudad, producto y direccion
para poder ubicar el riesgo de una poliza  principal o una individual  para la realizacion de las  operaciones actuales

Scenario: 1 Búsqueda de poliza riesgo y búsqueda sin resultado
GivenStories: stories/policycenter/login_policy.story
Given que estoy en la informacion de la poliza con numero de subscripcion <numSubscripcion>
When ingrese a edificios y ubicaciones
And intente ingresar una nueva ubicacion sin riesgo consultable
| pais     | departamento | ciudad   | direccion   | actividadEconomica            | medioVenta |
| Colombia | Antioquia    | Medellin | CR 45 29 30 | Acabado de productos textiles | Televentas |
And ingrese la entrada de las diferentes coberturas con interes <documento><tipodocumento><tipoBeneficiario><numeroContrato> adicional y contrato
| TAB                      | TIPO_ARTICULO     | OTRO_ARTICULO_OTROS | COBERTURA        | ENTRADAS                         | VALOR_ENTRADAS |
| Información de Artículos | Edificios         |                     |                  | Valor Reconstrucción             | 100000000      |
| Información de Artículos | Edificios         |                     | Danos materiales | Valor asegurado danos materiales | 100000000      |
| Interes Adicional        | Interes Adicional |                     |                  | NULL                             | 00000          |
And expido la poliza
And ingreso a la busqueda de riesgos
And este buscando un riesgo por los filtros pais departamento ciudad y direccion
| producto                | pais     | departamento | ciudad   | direccion   |
| Multiriesgo corporativo | Colombia | Antioquia    | Medellin | CR 45 29 30 |
Then se debe visualizar la informacion de los riesgos asociados en MRC
| tipoPoliza | direccion   | estado     | contrato |
| Colectiva  | CR 45 29 30 | Expedición | 9876539  |
And este buscando un riesgo por los filtros pais departamento ciudad y direccion
| producto                | pais     | departamento | ciudad   | direccion   |
| Multiriesgo corporativo | Colombia | Antioquia    | Envigado | CR 45 30 30 |
Then debe mostrar el mensaje <mensaje>

Examples:
| numSubscripcion | documento  | tipodocumento        | tipoBeneficiario | numeroContrato |mensaje                             |
| 33355482        | 1234567890 | CEDULA DE CIUDADANIA | Asegurado        | 9876539        |La búsqueda no devolvió resultados. |

Scenario: 2 Búsqueda de poliza riesgo sin poliza principal asociada
Given que estoy en la informacion de la poliza con numero de subscripcion <numSubscripcion>
When copie la poliza
And ingrese a edificios y ubicaciones
And intente ingresar una nueva ubicacion sin riesgo consultable
| pais     | departamento | ciudad   | direccion   | actividadEconomica            | medioVenta |
| Colombia | Antioquia    | Medellin | CR 20 20 20 | Acabado de productos textiles | Televentas |
And ingrese la entrada de las diferentes coberturas con interes <documento><tipodocumento><tipoBeneficiario> adicional
| TAB                      | TIPO_ARTICULO     | OTRO_ARTICULO_OTROS | COBERTURA        | ENTRADAS                         | VALOR_ENTRADAS |
| Información de Artículos | Edificios         |                     |                  | Valor Reconstrucción             | 100000000      |
| Información de Artículos | Edificios         |                     | Danos materiales | Valor asegurado danos materiales | 100000000      |
| Interes Adicional        | Interes Adicional |                     |                  | NULL                             | 00000          |
And expido la poliza
And ingreso a la busqueda de riesgos
And este buscando un riesgo por los filtros pais departamento ciudad y direccion
| producto                | pais     | departamento | ciudad   | direccion   |
| Multiriesgo corporativo | Colombia | Antioquia    | Medellin | CR 20 20 20 |
Then debe mostrar el mensaje <mensaje>

Examples:
| numSubscripcion | documento  | tipodocumento        | tipoBeneficiario | mensaje                             |
| 33355336        | 1234567890 | CEDULA DE CIUDADANIA | Asegurado        | La búsqueda no devolvió resultados. |

Scenario: 3 Busqueda de poliza riesgo por numero de contrato, direccion y busqueda con dato inconsistente
Given que estoy en la informacion de la poliza con numero de subscripcion <numSubscripcion>
When copie una poliza que es riesgo
And ingrese a edificios y ubicaciones
And intente ingresar una nueva ubicacion sin riesgo consultable
| pais     | departamento | ciudad   | direccion   | actividadEconomica            | medioVenta |
| Colombia | Antioquia    | Medellin | CR 88 30 99 | Acabado de productos textiles | Televentas |
And ingrese la entrada de las diferentes coberturas con interes <documento><tipodocumento><tipoBeneficiario><numeroContrato> adicional y contrato
| TAB                      | TIPO_ARTICULO     | OTRO_ARTICULO_OTROS | COBERTURA        | ENTRADAS                         | VALOR_ENTRADAS |
| Información de Artículos | Edificios         |                     |                  | Valor Reconstrucción             | 100000000      |
| Información de Artículos | Edificios         |                     | Danos materiales | Valor asegurado danos materiales | 100000000      |
| Interes Adicional        | Interes Adicional |                     |                  | NULL                             | 00000          |
And expido la poliza
And ingreso a la busqueda de riesgos
And este buscando un riesgo por los filtros producto y numero de contrato
| producto                | contrato |
| Multiriesgo corporativo | 123987   |
Then se debe visualizar la informacion de los riesgos asociados en MRC
| tipoPoliza | direccion   | estado     | contrato |
| Colectiva  | CR 88 30 99 | Expedición | 123987   |
And este buscando un riesgo por los filtros pais departamento ciudad, direccion y numero de contrato
| producto                | pais     | departamento | ciudad   | direccion   | contrato |
| Multiriesgo corporativo | Colombia | Antioquia    | Medellin | CR 88 30 99 | 123987   |
Then se debe visualizar la informacion de los riesgos asociados en MRC
| tipoPoliza | direccion   | estado     | contrato |
| Colectiva  | CR 88 30 99 | Expedición | 123987   |
And este buscando un riesgo por los filtros pais departamento ciudad, direccion y numero de contrato
| producto                | pais     | departamento | ciudad   | direccion        | contrato |
| Multiriesgo corporativo | Colombia | Antioquia    | Medellin | KR 80 # 48 - 140 | 123987   |
Then debe mostrar el mensaje <mensaje>

Examples:
| numSubscripcion | documento  | tipodocumento        | tipoBeneficiario | numeroContrato |mensaje                                    |
| 33355482        | 1234567890 | CEDULA DE CIUDADANIA | Asegurado        | 123987         |La búsqueda no devolvió resultados.        |


Scenario: 4 Busqueda de poliza riesgo mrc sin ingresar los filtros requeridos
When ingreso a la busqueda de riesgos
And este buscando un riesgo sin ingresar todos los filtros requeridos
| producto                |
| Multiriesgo corporativo |
Then debe mostrar el mensaje <mensaje>

Examples:
| mensaje                                                                           |
| Por favor ingrese un número de contrato o país, departamento, ciudad y dirección. |
