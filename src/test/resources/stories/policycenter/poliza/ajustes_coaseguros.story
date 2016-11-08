Ajustes Coaseguros


Scenario:  1 Validacion de campos obligatorios en tipo de coaseguro aceptado

Meta:@lote1
@Story CDSEG-2778
@URL https://jira.suramericana.com.co/browse/CDSEG-2778
@tag automator:juan_gabriel_zapata, informer:juan_esteban_restrepo, sprint:9
@Sprint 9

Given que estoy iniciando nueva suscripcion <numCuenta> con rol de usuario <rolUsuario>
When quiero expedir una poliza nueva con los siguientes datos: <agente> <organizacion> <canal> <tipoPoliza> <producto>
And quiero agregar un coaseguro <TipoCo> con particion de aseguradoras
| ASEGURADORA                         | PARTICIPACION |
| Seguros Generales Suramericana S.A. | 60            |
| COMPANIA DE SEGUROS BOLIVAR S.A.    | 40            |
And de clic en Aceptar de la ventana Coaseguro
Then se debe validar que se muestren los mensajes de obligatoriedad siguientes
| MENSAJES_WORKSPACE                                |
| Póliza de referencia : Falta el campo obligatorio |
| Número de documento : Falta el campo obligatorio  |



Examples:
| numCuenta  | agente         | organizacion | canal             | tipoPoliza | producto                | rolUsuario | TipoCo   |
| C000888888 | DIRECTO > 4999 | Sura         | Canal Tradicional | Individual | Multiriesgo corporativo | Asesor     | Aceptado |


Scenario:  2 Validacion de campo Numero de documento en tipo de coaseguro cedido

Meta:@lote1
@Story CDSEG-2778
@URL https://jira.suramericana.com.co/browse/CDSEG-2778
@tag automator:juan_gabriel_zapata, informer:juan_esteban_restrepo, sprint:9
@Sprint 9

Given que estoy iniciando nueva suscripcion <numCuenta> con rol de usuario <rolUsuario>
When quiero expedir una poliza nueva con los siguientes datos: <agente> <organizacion> <canal> <tipoPoliza> <producto>
And quiero agregar un coaseguro <TipoCo> con particion de aseguradoras
| ASEGURADORA                         | PARTICIPACION |
| Seguros Generales Suramericana S.A. | 60            |
| COMPANIA DE SEGUROS BOLIVAR S.A.    | 40            |
And de clic en Aceptar de la ventana Coaseguro
Then no se debe inhabilitar la opcion Numero de documento

Examples:
| numCuenta  | agente         | organizacion | canal             | tipoPoliza | producto                | rolUsuario | TipoCo   |
| C000888888 | DIRECTO > 4999 | Sura         | Canal Tradicional | Individual | Multiriesgo corporativo | Asesor     | Cedido   |


Scenario:  3 Validacion de coaseguro no editable en resumen e informacion de poliza

Meta:@lote1
@Story CDSEG-2778
@URL https://jira.suramericana.com.co/browse/CDSEG-2778
@tag automator:juan_gabriel_zapata, informer:juan_esteban_restrepo, sprint:9
@Sprint 9

Given que estoy iniciando nueva suscripcion <numCuenta> con rol de usuario <rolUsuario>
When quiero expedir una poliza nueva con los siguientes datos: <agente> <organizacion> <canal> <tipoPoliza> <producto>
And quiero agregar un coaseguro <TipoCo> con particion de aseguradoras
| ASEGURADORA                         | PARTICIPACION |
| Seguros Generales Suramericana S.A. | 60            |
| COMPANIA DE SEGUROS BOLIVAR S.A.    | 40            |
And de clic en Aceptar de la ventana Coaseguro
And ingrese a edificios y ubicaciones
And intente ingresar las entradas de las diferentes coberturas
| TAB                      | TIPO_ARTICULO | OTRO_ARTICULO_OTROS | COBERTURA        | ENTRADAS                         | VALOR_ENTRADAS |
| Información de Artículos | Edificios     |                     |                  | Valor Reconstrucción             | 100            |
| Información de Artículos | Edificios     |                     | Danos materiales | Valor asegurado danos materiales | 100            |
And intente cotizar y expedir la poliza
Then debo ver en el resumen de la poliza y en informacion de poliza los coaseguros no editables


Examples:
| numCuenta  | agente         | organizacion | canal             | tipoPoliza | producto                | rolUsuario | TipoCo   |
| C000888888 | DIRECTO > 4999 | Sura         | Canal Tradicional | Individual | Multiriesgo corporativo | Asesor     | Cedido   |

