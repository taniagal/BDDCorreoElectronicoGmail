Meta:
@lote3
@tag equipo: 3
@sprint 15

Narrative:
Como usuario de policy center quiero poder excluir riesgos de polizas colectivas de autos o de MRC
para poder cotizar y expedir la cancelación de una poliza con beneficiario oneroso.


Scenario: Validar que se genere mensaje de alerta, al cancelar una poliza con beneficiario oneroro en MRC
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza de mrc:
| producto                | tipo_documento       | fecha_nacimiento | primer_nombre | primer_apellido | tipo_direccion          | direccion        | departamento | ciudad   | agente |
| Multiriesgo corporativo | CEDULA DE CIUDADANIA | 10/10/1973       | MIGUEL        | POSADA          | DIRECCION DE RESIDENCIA | CALLE 58F #25-83 | Antioquia    | Medellin | INT-3  |
When ingrese a edificios y ubicaciones
And intente ingresar una nueva ubicacion en edificios
| pais     | departamento | ciudad   | direccion    | actividadEconomica            | medioVenta |
| Colombia | Antioquia    | Medellin | CR 100 89 12 | Acabado de productos textiles | Televentas |
And ingrese la entrada de las diferentes coberturas mrc
| TAB                      | TIPO_ARTICULO | OTRO_ARTICULO_OTROS | COBERTURA        | ENTRADAS                         | VALOR_ENTRADAS |
| Información de Artículos | Edificios     |                     |                  | Valor Reconstrucción             | 200000000      |
| Información de Artículos | Edificios     |                     | Danos materiales | Valor asegurado danos materiales | 200000000      |
And ingresar interes adicional <tipoBeneficiarios> a una sola cobertura
| TIPO_DE_DOCUMENTO | DOCUMENTO  | TIPOBENEFICIARIO |
| NIT               | 9202086744 | Oneroso          |
And intente cotizar y expedir la poliza
And ingrese al resumen de la poliza expedida
And necesito iniciar la cancelacion
And realice el proceso de cancelacion completo
Then se debe mostrar mensaje de advertencia al cancelar poliza
| mensaje |                                                                                                                                                                                      |
|         |


Examples:
| |
| |