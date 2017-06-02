Meta:
@uat


Narrative:
Como usuario de policy center quiero poder solicitar autorización a los comites de Riesgos consultables
quiero poder solicitar autorización a los comites de Riesgos consultables
para poder cotizar o expedir una poliza


Scenario: 1 Validar que se genere actividad de riesgo consultable al cotizar una poliza
GivenStories: stories/policycenter/login_policy_sap.story
Given estoy cotizando una poliza:
|cuenta    |producto               |agente_oficina                | oficina   |
|2012723757|Multiriesgo corporativo|ABARROTES S.A. CQLII          | 019       |
When ingrese a edificios y ubicaciones
And intente ingresar una nueva ubicacion sin riesgo consultable
And ingrese la entrada de las diferentes coberturas con interes <documento><tipodocumento><tipoBeneficiario> adicional
| TAB                      | TIPO_ARTICULO | OTRO_ARTICULO_OTROS | COBERTURA        | ENTRADAS                                            | VALOR_ENTRADAS |
| Información de Artículos | Edificios     |                     |                  | Valor Reconstrucción                                | 100000000      |
| Información de Artículos | Edificios     |                     | Danos materiales | Valor asegurado danos materiales                    | 100000000      |
And expido la poliza y capturo el numero de poliza
Then se valida la creacion de la poliza en SAP
Examples:
| rolUsuario | documento   | tipoBeneficiario |  tipodocumento         |
| Asesor     | 1128414968  | Asegurado        |  CEDULA DE CIUDADANIA  |
