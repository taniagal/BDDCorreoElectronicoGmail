Meta:
@lote2
@tag team: 2
@sprint 8

Scenario: 1 Validacion de riesgos consultables (tomador adicional,asegurador,direccion) al cotizar nueva poliza
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza de mrc:
|organizacion|producto               |canal            |tipo_documento      |fecha_nacimiento|primer_nombre|primer_apellido|tipo_direccion         |direccion       |departamento|ciudad  |agente|
|Sura        |Multiriesgo corporativo|Canal Tradicional|CEDULA DE CIUDADANIA|02/12/1990      |JUAN        |ELIAS       |DIRECCION DE RESIDENCIA|CALLE 54B #50-25|Antioquia   |Medellin|INT-3 |
When quiera agregar un tomador adicional que es riesgo consultable <tipo_documento> <documento>
And intente ingresar una nueva ubicacion
And ingrese la entrada de las diferentes coberturas con interes <documento> <tipoBeneficiario> adicional
| TAB                      | TIPO_ARTICULO | OTRO_ARTICULO_OTROS | COBERTURA        | ENTRADAS                         | VALOR_ENTRADAS |
| Información de Artículos | Edificios     |                     |                  | Valor Reconstrucción             | 100            |
| Información de Artículos | Edificios     |                     | Danos materiales | Valor asegurado danos materiales | 100            |
Then se deben validar los riesgos consultables mostrando los siguientes mensaje por cada una de las figuras
| MENSAJES_WORKSPACE                                                                                                                                                                                                                                            |
| El asegurado es un riesgo no estándar|
| El tomador es un riesgo no estándar  |
| La dirección es un riesgo no estándar|


Examples:
|tipo_documento      |documento| tipoBeneficiario |
|CEDULA DE CIUDADANIA|9876543  | Asegurado        |



Scenario: 2 Validacion de riesgos consultables (tomador, tomador adicional,beneficiario,basegurador,direccion) al modificar nueva poliza
Meta:
@manual
Given  que estoy en la informacion de la poliza con numero(s) de subscripcion <numSubscripcion>
When  quiero agregar un tomador adicional que es riesgo consultable <cedula>
And  intente ingresar una nueva ubicacion(es)
And  ingrese las entradas de las diferentes coberturas con interes <cedula> <tipoBeneficiario> adicional
Then  se deben validar los riesgos consultables mostrando los siguientes mensaje por cada una de las figuras

Examples:
| numPoliza  | rolUsuario |
| 6076942934 | Asesor     |



Scenario: 3 Validacion de riesgos consultables (tomador, tomador adicional,beneficiario,basegurador,direccion) al renovar nueva poliza
Meta:
@manual
Given  que estoy en la informacion de la poliza con numero(s) de subscripcion <numSubscripcion>
When  quiero agregar un tomador adicional que es riesgo consultable <cedula>
And  intente ingresar una nueva ubicacion(es)
And  ingrese las entradas de las diferentes coberturas con interes <cedula> <tipoBeneficiario> adicional
Then  se deben validar los riesgos consultables mostrando los siguientes mensaje por cada una de las figuras

Examples:
| numPoliza  | rolUsuario |
| 6076942934 | Asesor     |



Scenario: 4 Validacion de riesgos consultables (tomador, tomador adicional,beneficiario,basegurador,direccion) al expedir nueva poliza
Meta:
@manual
Given  que estoy en la informacion de la poliza con numero(s) de subscripcion <numSubscripcion>
When  quiero agregar un tomador adicional que es riesgo consultable <cedula>
And  intente ingresar una nueva ubicacion(es)
And  ingrese las entradas de las diferentes coberturas con interes <cedula> <tipoBeneficiario> adicional
Then  se deben validar los riesgos consultables mostrando los siguientes mensaje por cada una de las figuras

Examples:
| numPoliza  | rolUsuario |
| 6076942934 | Asesor     |