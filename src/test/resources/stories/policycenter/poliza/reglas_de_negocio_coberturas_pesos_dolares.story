Reglas de Negocio para las coberturas - pesos y dolares

Meta:
@lote1
@tag automator: juan_carlos_restrepo
@issue #CDSEG-764
@sprint 13

Scenario: Validacion de riesgos consultables (deducible terremoto,Maquinaria de equipo,Valor asegurado del sublimite,Limite todo riesgo construccion) al cotizar nueva poliza
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza:
|cuenta    |organizacion|producto               |canal            |
|C000112402|Sura        |Multiriesgo corporativo|Canal Tradicional|
When ingrese a edificios y ubicaciones
And intente ingresar una nueva ubicacion sin riesgo consultable
And intente ingresar las entradas de las diferentes coberturas
| TAB                      | TIPO_ARTICULO | OTRO_ARTICULO_OTROS | COBERTURA        | ENTRADAS                         | VALOR_ENTRADAS |
| Información de Artículos | Edificios     |                     |                  | Valor Reconstrucción             | 100000000      |
| Información de Artículos | Edificios     |                     | Danos materiales | Valor asegurado danos materiales | 100000000      |
And intente cotizar y expedir la poliza


Examples:
| rolUsuario | cedula  | tipoBeneficiario |
| Asesor     | 9876543 | Asegurado        |