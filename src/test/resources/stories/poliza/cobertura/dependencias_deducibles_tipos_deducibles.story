Scenario: 1 Tener deducible (porcentual o minimo) sin tipo de deducible (porcentual o minimo) en articulo

Meta:
@Story CDSEG-2443
@URL https://jira.suramericana.com.co/browse/CDSEG-2443
@tag automator:andres_alarcon_guerrero, informer:juan_esteban_restrepo_castanno, sprint:6
@LOB Multiriesgo corporativo
@Sprint 6
As a <rolUsuario>
Given que estoy en edificios y ubicaciones de una poliza <numSubscripcion> con el rol <rolUsuario>
When intente ingresar las entradas de las diferentes coberturas
| TAB                      | TIPO_ARTICULO | COBERTURA        | ENTRADAS                                      | VALOR_ENTRADAS   |
| Información de Artículos | Edificios     |                  | Valor Reconstrucción                          | 200              |
| Información de Artículos | Edificios     | Danos materiales | Valor asegurado danos materiales              | 100              |
| Información de Artículos | Edificios     | Danos materiales | Tipo Primera Perdida                          | Relativa         |
| Información de Artículos | Edificios     | Danos materiales | Deducible porcentual danos materiales         |                  |
| Información de Artículos | Edificios     | Danos materiales | Tipo de deducible porcentual danos materiales | Valor Asegurable |

When haga clic en el boton Aceptar
Then se debe mostrar el siguiente mensaje como lo hace guidewire (espacio de trabajo)
| MENSAJES_WORKSPACE                                                                                                                                                                                                                                                                                                  |
| El valor del "Sublimite para gastos asociados a la ocurrencia de una perdida" debe ser menor o igual a la sumatoria de los valores asegurados de la cobertura de "Danos materiales" de todos los artículos de la ubicación.                                                                                         |
Examples:
| numSubscripcion | rolUsuario | descripcion |
| 22222236        | Asesor     |             |