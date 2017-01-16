Flujo De Actividades Rc Mrc

Meta:
@lote2
@URL https://jira.suramericana.com.co/browse/CDSEG-
@tag automator:juan_gabriel_zapata, informer:juan_esteban_restrepo, sprint:9
@Sprint 9

Narrative:
Como usuario de policy center quiero poder solicitar autorización a los comites de Riesgos consultables
quiero poder solicitar autorización a los comites de Riesgos consultables
para poder cotizar o expedir una poliza


Scenario: 1 Validar que se genere actividad de riesgo consultable al cotizar una poliza
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza:
|cuenta    |organizacion|producto               |canal            |
|C000777777|Sura        |Multiriesgo corporativo|Canal Tradicional|
When ingrese a edificios y ubicaciones
And intente ingresar una nueva ubicacion
And ingrese la entrada de las diferentes coberturas con interes <documento> <tipoBeneficiario> adicional
| TAB                      | TIPO_ARTICULO | OTRO_ARTICULO_OTROS | COBERTURA        | ENTRADAS                                            | VALOR_ENTRADAS |
| Información de Artículos | Edificios     |                     |                  | Valor Reconstrucción                                | 100000000      |
| Información de Artículos | Edificios     |                     | Danos materiales | Valor asegurado danos materiales                    | 100000000      |

And se solicite aprobacion para los riesgos
Then se debe generar una actividad por cada DNI o direccion diferente que sea riesgo consultable


Examples:
| rolUsuario | documento  | tipoBeneficiario |
| Asesor     | 9876543 | Asegurado        |



Scenario: 2 Validar cierre automatico de la actividad
Meta:
@manual

Given  que se proceso el formulario por parte de los diferentes comites
When  se obtenga respuesta afirmativa o negativa
Then  se debe completar automaticamente la actividad con la respuesta

Examples:
| |
| |


Scenario: 3 Validar que se genere actividad al expedidor
Meta:
@manual

Given  que se proceso el formulario por parte de los diferentes comites
When  se obtenga respuesta afirmativa o negativa
Then  se debe completar automaticamente la actividad con la respuesta

Examples:
| |
| |

