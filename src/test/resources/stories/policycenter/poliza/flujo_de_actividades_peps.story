Meta:
@lote1
@tag equipo: 2
@sprint 9

Narrative:
Como usuario de policy center quiero poder solicitar autorización a los comites de Riesgos consultables
quiero poder solicitar autorización a los comites de Riesgos consultables

Scenario: 1 Validar que se genere actividad de riesgo
Meta:
@manual
Given  que esto y iniciando nueva suscripcion <numCuenta> con rol de usuario <rolUsuario>
When quiero expedir una poliza nueva con los siguientes datos: <agente> <organizacion> <canal> <tipoPoliza> <producto>
And ingrese a edificios y ubicaciones
And intente ingresar una nueva ubicacion
And ingrese las entradas de las diferentes coberturas con interes <cedula> <tipoBeneficiario> adicional
| TAB                      | TIPO_ARTICULO | OTRO_ARTICULO_OTROS | COBERTURA        | ENTRADAS                                            | VALOR_ENTRADAS |
| Información de Artículos | Edificios     |                     |                  | Valor Reconstrucción                                | 100            |
| Información de Artículos | Edificios     |                     | Danos materiales | Valor asegurado danos materiales                    | 100            |
And se solicite aprobacion para los riesgos
Then se debe generar una actividad por cada DNI o direccion diferente que sea riesgo consultable

Examples:
| numCuenta  | agente                                       | organizacion | canal             | tipoPoliza | producto                | rolUsuario | cedula  | tipoBeneficiario |
| C000888888 | Armstrong - Cayman Captive Srvs > 501-002546 | Sura         | Canal Tradicional | Individual | Multiriesgo corporativo | Asesor     | 9876543 | Asegurado        |



Scenario: 2 Validar que se genere actividad de riesgo consultable al modificar una poliza
Meta:
@manual
Given  que estoy en el resumen de la poliza MRC con numero de poliza <numPoliza> con el rol <rolUsuario>
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
Meta:
@manual
Given  que estoy en el resumen de la poliza MRC con numero de poliza <numPoliza> con el rol <rolUsuario>
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


Scenario: 4 Validar cierre automatico de la actividad
Meta:
@manual
Given  que se proceso el formulario por parte de los diferentes comites
When se obtenga respuesta afirmativa o negativa
Then se debe completar automaticamente la actividad con la respuesta

Examples:
| |
| |


Scenario: 5 Validar que se genere actividad al expedidor
Meta:
@manual
Given  que se proceso el formulario por parte de los diferentes comites
When se obtenga respuesta afirmativa o negativa
Then se debe completar automaticamente la actividad con la respuesta

Examples:
| |
| |

