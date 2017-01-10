Solicitar Sarlaft Mrc
Meta:
@lote3
@issue #NotFound
@tag automator: tania_grajales_alzate
@local
@Sprint 12


Narrative:
Como usuario de negocio
Quiero que se muestre un requisito obligatorio en caso de que un titular de cuenta o un
asegurado requieran sarlaft


Scenario: Validar sarlaft en tomador-asegurado al cotizar una poliza
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza de mrc:
|organizacion|producto               |canal            |tipo_documento      |fecha_nacimiento|primer_nombre|primer_apellido|tipo_direccion         |direccion       |departamento|ciudad  |agente|
|Sura        |Multiriesgo corporativo|Canal Tradicional|CEDULA DE CIUDADANIA|02/12/1990      |JUAN        |ELIAS       |DIRECCION DE RESIDENCIA|CALLE 54B #50-25|Antioquia   |Medellin|INT-3 |
When quiera agregar un tomador adicional que es riesgo consultable <cedula>
And intente ingresar una nueva ubicacion
And ingrese la entrada de las diferentes coberturas con interes <cedula> <tipoBeneficiario> adicional
| TAB                      | TIPO_ARTICULO | OTRO_ARTICULO_OTROS | COBERTURA        | ENTRADAS                         | VALOR_ENTRADAS |
| Información de Artículos | Edificios     |                     |                  | Valor Reconstrucción             | 100            |
| Información de Artículos | Edificios     |                     | Danos materiales | Valor asegurado danos materiales | 100            |

Then se deben validar los riesgos consultables mostrando los siguientes mensaje por cada una de las figuras
| MENSAJES_WORKSPACE                                                                                                                                                                                                                                            |
| El asegurado es un riesgo no estándar|
| El tomador es un riesgo no estándar  |
| La dirección es un riesgo no estándar|


Examples:
| numSubscripcion | rolUsuario | cedula  | tipoBeneficiario |
| 22222211        | Asesor     | 71318883 | Asegurado       |