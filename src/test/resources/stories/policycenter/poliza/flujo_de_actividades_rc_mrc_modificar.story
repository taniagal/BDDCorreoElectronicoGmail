Flujo De Actividades Rc Mrc Modificar

Meta:
@lote2
@URL https://jira.suramericana.com.co/browse/CDSEG-
@tag automator:juan_gabriel_zapata, informer:juan_esteban_restrepo, sprint:9
@Sprint 9

Narrative:
Como usuario de policy center quiero poder solicitar autorización a los comites de Riesgos consultables
quiero poder solicitar autorización a los comites de Riesgos consultables
para poder cotizar o expedir una poliza


Scenario: Validar que se genere actividad de riesgo consultable al modificar una poliza
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza:
|cuenta    |producto               |
|C000777777|Multiriesgo corporativo|
When ingrese a edificios y ubicaciones
And intente ingresar una nueva ubicacion sin riesgo consultable
And borro el articulo anterior
And intente ingresar las entradas de las diferentes coberturas
| TAB                      | TIPO_ARTICULO | OTRO_ARTICULO_OTROS | COBERTURA        | ENTRADAS                         | VALOR_ENTRADAS |
| Información de Artículos | Edificios     |                     |                  | Valor Reconstrucción             | 100000000      |
| Información de Artículos | Edificios     |                     | Danos materiales | Valor asegurado danos materiales | 100000000      |
And intente cotizar y expedir la poliza
And ingrese al resumen de la poliza expedida
And cuando intente cambiar informacion de la poliza MRC
And ingrese a edificios y ubicaciones en cambio de poliza
And intente ingresar una nueva ubicacion
And ingrese las entradas en cambio de poliza de las diferentes coberturas con interes <cedula> <tipoBeneficiario> adicional
| TAB                      | TIPO_ARTICULO | OTRO_ARTICULO_OTROS | COBERTURA        | ENTRADAS                              | VALOR_ENTRADAS |
| Información de Artículos | Edificios     |                     |                  | Valor Reconstrucción | 100000000      |
| Información de Artículos | Edificios     |                     | Danos materiales | Valor asegurado danos materiales | 100000000      |

And se solicite aprobacion para los riesgos en cambio de poliza
Then se debe generar una actividad por cada DNI o direccion diferente que sea riesgo consultable en cambio de poliza

Examples:
| rolUsuario | cedula  | tipoBeneficiario |
| Asesor     | 9876543 | Asegurado        |