Flujo De Actividades Rc Mrc

Narrative:
Como usuario de policy center quiero poder solicitar autorización a los comites de Riesgos consultables
quiero poder solicitar autorización a los comites de Riesgos consultables
para poder cotizar o expedir una poliza


Meta:
@lote1
@Story CDSEG-
@URL https://jira.suramericana.com.co/browse/CDSEG-
@tag automator:juan_gabriel_zapata, informer:juan_esteban_restrepo, sprint:9
@Sprint 9


Scenario: 1 Validar que se genere actividad de riesgo consultable al cotizar una poliza

Given que estoy iniciando nueva suscripcion <numCuenta> con rol de usuario <rolUsuario>
When quiero expedir una poliza nueva con los siguientes datos: <agente> <producto>
And ingrese a edificios y ubicaciones
And intente ingresar una nueva ubicacion
And ingrese las entradas de las diferentes coberturas con interes <cedula> <tipoBeneficiario> adicional
| TAB                      | TIPO_ARTICULO | OTRO_ARTICULO_OTROS | COBERTURA        | ENTRADAS                                            | VALOR_ENTRADAS |
| Información de Artículos | Edificios     |                     |                  | Valor Reconstrucción                                | 100            |
| Información de Artículos | Edificios     |                     | Danos materiales | Valor asegurado danos materiales                    | 100            |

And se solicite aprobacion para los riesgos
Then se debe generar una actividad por cada DNI o direccion diferente que sea riesgo consultable


Examples:
| numCuenta  | agente                                       | producto                | rolUsuario | cedula  | tipoBeneficiario |
| C000888888 | Armstrong - Cayman Captive Srvs > 501-002546 | Multiriesgo corporativo | Asesor     | 9876543 | Asegurado        |


Scenario: 2 Validar que se genere actividad de riesgo consultable al modificar una poliza

Given que estoy en el resumen de la poliza MRC con numero de poliza <numPoliza> con el rol <rolUsuario>
When cuando intente cambiar informacion de la poliza MRC
And ingrese a edificios y ubicaciones en cambio de poliza
And intente ingresar una nueva ubicacion
And ingrese las entradas en cambio de poliza de las diferentes coberturas con interes <cedula> <tipoBeneficiario> adicional
| TAB                      | TIPO_ARTICULO | OTRO_ARTICULO_OTROS | COBERTURA        | ENTRADAS                                            | VALOR_ENTRADAS |
| Información de Artículos | Edificios     |                     |                  | Valor Reconstrucción                                | 100            |
| Información de Artículos | Edificios     |                     | Danos materiales | Valor asegurado danos materiales                    | 100            |
And se solicite aprobacion para los riesgos en cambio de poliza
Then se debe generar una actividad por cada DNI o direccion diferente que sea riesgo consultable en cambio de poliza

Examples:
| numPoliza     | rolUsuario | cedula  | tipoBeneficiario |
| TEST_99999999 | Asesor     | 9876543 | Asegurado        |


Scenario: 3 Validar que se genere actividad de riesgo consultable al renovar una poliza

Given que estoy en el resumen de la poliza MRC con numero de poliza <numPoliza> con el rol <rolUsuario>
When cuando intente renovar informacion de la poliza MRC
And ingrese a edificios y ubicaciones en renovacion de poliza
And intente ingresar una nueva ubicacion en renovacion de poliza
And ingrese las entradas en renovacion de poliza de las diferentes coberturas con interes <cedula> <tipoBeneficiario> adicional
| TAB                      | TIPO_ARTICULO | OTRO_ARTICULO_OTROS | COBERTURA        | ENTRADAS                                            | VALOR_ENTRADAS |
| Información de Artículos | Edificios     |                     |                  | Valor Reconstrucción                                | 100            |
| Información de Artículos | Edificios     |                     | Danos materiales | Valor asegurado danos materiales                    | 100            |
And se solicite aprobacion para los riesgos en renovacion de poliza
Then se debe generar una actividad por cada DNI o direccion diferente que sea riesgo consultable en renovacion de poliza

Examples:
| numPoliza     | rolUsuario | cedula  | tipoBeneficiario |
| TEST_99999999 | Asesor     | 9876543 | Asegurado        |