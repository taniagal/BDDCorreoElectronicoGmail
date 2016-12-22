Flujo de actividades Rc Mrc renovar

Meta:
@lote2
@URL https://jira.suramericana.com.co/browse/CDSEG-
@tag automator:juan_gabriel_zapata, informer:juan_esteban_restrepo, sprint:9
@Sprint 9

Narrative:
Como usuario de policy center quiero poder solicitar autorización a los comites de Riesgos consultables
quiero poder solicitar autorización a los comites de Riesgos consultables
para poder cotizar o expedir una poliza



Scenario: Validar que se genere actividad de riesgo consultable al renovar una poliza
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza de mrc:
|organizacion|producto               |canal            |tipo_documento      |fecha_nacimiento|primer_nombre|primer_apellido|tipo_direccion         |direccion       |departamento|ciudad  |agente|
|Sura        |Multiriesgo corporativo|Canal Tradicional|CEDULA DE CIUDADANIA|02/12/1990      |JUAN        |AKERMAN       |DIRECCION DE RESIDENCIA|CALLE 54B #50-25|Antioquia   |Medellin|INT-3 |
When ingrese a edificios y ubicaciones
And intente ingresar una nueva ubicacion sin riesgo consultable
And intente ingresar las entradas de las diferentes coberturas
| TAB                      | TIPO_ARTICULO | OTRO_ARTICULO_OTROS | COBERTURA        | ENTRADAS                         | VALOR_ENTRADAS |
| Información de Artículos | Edificios     |                     |                  | Valor Reconstrucción             | 100000000      |
| Información de Artículos | Edificios     |                     | Danos materiales | Valor asegurado danos materiales | 100000000      |
And intente cotizar y expedir la poliza
And ingrese al resumen de la poliza expedida
And intente renovar la poliza
And ingrese a edificios y ubicaciones en renovacion de poliza
And intente ingresar una nueva ubicacion en renovacion de poliza
And ingrese las entradas en renovacion de poliza de las diferentes coberturas con interes <cedula> <tipoBeneficiario> adicional
| TAB                      | TIPO_ARTICULO | OTRO_ARTICULO_OTROS | COBERTURA        | ENTRADAS                                            | VALOR_ENTRADAS |
| Información de Artículos | Edificios     |                     |                  | Valor Reconstrucción                                | 100000000      |
| Información de Artículos | Edificios     |                     | Danos materiales | Valor asegurado danos materiales                    | 100000000      |
And se solicite aprobacion para los riesgos en renovacion de poliza
Then se debe generar una actividad por cada DNI o direccion diferente que sea riesgo consultable en renovacion de poliza

Examples:
| rolUsuario | cedula  | tipoBeneficiario |
| Asesor     | 9876543 | Asegurado        |