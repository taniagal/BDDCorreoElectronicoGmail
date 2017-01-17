Reglas de Negocio para las coberturas - pesos y dolares

Meta:
@lote1
@tag automator: juan_carlos_restrepo
@issue #CDSEG-764
@sprint 13

Scenario: Validacion de riesgos consultables (deducible terremoto,Maquinaria de equipo,Valor asegurado del sublimite,Limite todo riesgo construccion) al cotizar nueva poliza
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza de mrc:
|organizacion|producto               |canal            |tipo_documento      |fecha_nacimiento|primer_nombre|primer_apellido|tipo_direccion         |direccion       |departamento|ciudad  |agente|
|Sura        |Multiriesgo corporativo|Canal Tradicional|CEDULA DE CIUDADANIA|10/10/1968      |LOCO         |QUINTERO        |DIRECCION DE RESIDENCIA|CALLE 2I #21-22|Antioquia   |Medellin|INT-3 |
When ingrese a edificios y ubicaciones
And intente ingresar una nueva ubicacion sin riesgo consultable
And intente ingresar las entradas de las diferentes coberturas
| TAB                      | TIPO_ARTICULO       | OTRO_ARTICULO_OTROS | COBERTURA   | ENTRADAS                                                                          | VALOR_ENTRADAS |
| Información de Artículos | Edificios           |                     |             | Valor Reconstrucción                                                              | 100000000      |
| Información de Artículos | Edificios           |                     | Terremoto   | Valor asegurado terremoto,temblor de tierra,erupcion volcanica,tsunami y maremoto | 100000000      |
| Información de Artículos | Maquinaria y equipo |                     |             | Valor Reconstrucción                                                              | 100000000      |
| Información de Artículos | Maquinaria y equipo |                     | Terremoto   | Valor asegurado terremoto,temblor de tierra,erupcion volcanica,tsunami y maremoto
And ingrese a otros articulos
And intente cotizar y expedir la poliza


Examples:
| rolUsuario | cedula  | tipoBeneficiario |
| Asesor     | 9876543 | Asegurado        |