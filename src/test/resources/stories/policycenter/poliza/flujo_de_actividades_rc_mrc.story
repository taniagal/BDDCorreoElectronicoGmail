Flujo De Actividades Rc Mrc

Narrative:
Como usuario de policy center quiero poder solicitar autorización a los comites de Riesgos consultables
quiero poder solicitar autorización a los comites de Riesgos consultables
para poder cotizar o expedir una poliza


Meta: @lote2
@Story CDSEG-
@URL https://jira.suramericana.com.co/browse/CDSEG-
@tag automator:juan_gabriel_zapata, informer:juan_esteban_restrepo, sprint:9
@Sprint 9

Scenario: 1 Validar que se genere actividad de riesgo consultable al cotizar una poliza

Given que estoy iniciando nueva suscripcion <numCuenta> con rol de usuario <rolUsuario>
When quiero expedir una poliza nueva con los siguientes datos: <agente> <organizacion> <canal> <tipoPoliza> <producto>
And ingrese a edificios y ubicaciones
And intente ingresar una nueva ubicacion
And ingrese las entradas de las diferentes coberturas con interes <cedula> <tipoBeneficiario> adicional
| TAB                      | TIPO_ARTICULO | OTRO_ARTICULO_OTROS | COBERTURA        | ENTRADAS                                            | VALOR_ENTRADAS |
| Información de Artículos | Edificios     |                     |                  | Valor Reconstrucción                                | 100            |
| Información de Artículos | Edificios     |                     | Danos materiales | Valor asegurado danos materiales                    | 100            |

And se solicite aprobacion para los riesgos
Then se debe generar una actividad por cada DNI o direccion diferente que sea riesgo consutable




Examples:
| numCuenta  | agente         | organizacion | canal             | tipoPoliza | producto                | rolUsuario | cedula  | tipoBeneficiario |
| C000888888 | DIRECTO > 4999 | Sura         | Canal Tradicional | Individual | Multiriesgo corporativo | Asesor     | 9876543 | Asegurado        |