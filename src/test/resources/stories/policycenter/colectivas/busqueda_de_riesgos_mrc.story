Meta:
@lote 2
@tag equipo: 2, sprint 13

Narrative:
Como usuario PolicyCenter
quiero poder buscar riesgos de CP por pais,departamento,ciudad, producto y direccion
para poder ubicar el riesgo de una poliza  principal o una individual  para la realizacion de las  operaciones actuales

Scenario: Busqueda de poliza riesgo
GivenStories: stories/policycenter/login_policy.story
Given que estoy en la informacion de la poliza con numero de subscripcion <numSubscripcion>
When copie la poliza
And ingrese a edificios y ubicaciones
And intente ingresar una nueva ubicacion sin riesgo consultable
| pais    | departamento| ciudad   | direccion   | actividadEconomica                           |
| Colombia| Antioquia   | Medellin | CR 45 30 30 | Acabado de productos textiles                |
And ingrese la entrada de las diferentes coberturas con interes <documento><tipodocumento><tipoBeneficiario> adicional
| TAB                      | TIPO_ARTICULO     | OTRO_ARTICULO_OTROS | COBERTURA        | ENTRADAS                         | VALOR_ENTRADAS |
| Información de Artículos | Edificios         |                     |                  | Valor Reconstrucción             | 100000000      |
| Información de Artículos | Edificios         |                     | Danos materiales | Valor asegurado danos materiales | 100000000      |
| Interes Adicional        | Interes Adicional |                     |                  | NULL                             | 00000          |
And expido la poliza
And ingreso a la busqueda de riesgos
And este buscando un riesgo por los filtros pais departamento ciudad y direccion
| producto                   | pais     | departamento | ciudad   | direccion                |
| Multiriesgo corporativo    | Colombia | Antioquia    | Medellin | CR 45 30 30              |
Then se debe visualizar la informacion de los riesgos asociados en MRC
| tipoPoliza  | direccion      | estado     |
| Colectiva   | CR 45 30 30    | Expedición |

Examples:
| numSubscripcion | documento  | tipodocumento        | tipoBeneficiario |
| 33355482        | 1234567890 | CEDULA DE CIUDADANIA | Asegurado        |






