Meta:
@lote6
@tag equipo: 3, sprint: 15

Narrative:
Como usuario de policy center quiero poder excluir riesgos de polizas colectivas de autos o de MRC
para poder cotizar y expedir la cancelación de una poliza con beneficiario oneroso.

Scenario: Validar mensaje de alerta, cuando cancelo una poliza de autos con beneficiario oneroro
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza de autos:
| producto | tipoPoliza | tipo_documento       | fecha_nacimiento | primer_nombre | primer_apellido | tipo_direccion          | direccion        | departamento | ciudad   | agente |
| Autos    | Individual | CEDULA DE CIUDADANIA | 02/12/1990       | CAMILO        | RUIZ            | DIRECCION DE RESIDENCIA | CALLE 54B #50-25 | Antioquia    | Medellin | INT-3  |
When ingrese los datos del asegurado <tipo_documento> <documento>
And ingrese registros del vehiculo con interes adicional:
| placa  | modelo | codigo_fasecolda | ciudad_circulacion | vehiculo_servicio | chasis | motor | valor_asegurado | descuento | recargo | zona | plan               | medioVenta |
| random | 2016   | 00601182         | MEDELLIN           | Particular        | null   | null  | 165900000       | null      | null    | 2    | Plan Autos Clásico | Televentas |
And ingrese beneficiario oneroso en los intereses <tipoBeneficiarioOneroso>
And ingrese las coberturas a vehiculo:
| limite | deducible | AS                 |
| 640.0  | 0         | Asistencia Clásica |
And cotice una poliza
And voy a expedir una poliza
And confirmo el mensaje de expedir poliza
And ingrese al resumen de la poliza expedida
And necesito iniciar la cancelacion
And realice el proceso de cancelacion completo
Then se debe mostrar mensaje de advertencia al cancelar poliza
| mensaje                                                                                                                                                                                                                 |
| La póliza tiene beneficiario oneroso, usted debe tener en su poder el paz y salvo o el documento de la entidad onerosa en donde se acepta la cancelación , gestión que de manera previa debió haber realizado el asesor |
And se debe visualizar mensaje de advertencia al cancelar poliza por opciones de compromiso
| mensaje                                                                                                                                                                                                                 |
| La póliza tiene beneficiario oneroso, usted debe tener en su poder el paz y salvo o el documento de la entidad onerosa en donde se acepta la cancelación , gestión que de manera previa debió haber realizado el asesor |


Examples:
| tipo_documento       | documento  | tipoBeneficiarioOneroso |
| CEDULA DE CIUDADANIA | 1264567899 | Oneroso Leasing         |


Scenario: Validar que se genere mensaje de alerta, al cancelar una poliza con beneficiario oneroro en MRC
Meta: @manual
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
| NIT               | 9202096740 | Oneroso          |
And intente cotizar y expedir la poliza
And ingrese al resumen de la poliza expedida
And necesito iniciar la cancelacion
And realice el proceso de cancelacion completo
Then se debe mostrar mensaje de advertencia al cancelar poliza
| mensaje                                                                                                                                                                                                                 |
| La póliza tiene beneficiario oneroso, usted debe tener en su poder el paz y salvo o el documento de la entidad onerosa en donde se acepta la cancelación , gestión que de manera previa debió haber realizado el asesor |
And se debe visualizar mensaje de advertencia al cancelar poliza por opciones de compromiso
| mensaje                                                                                                                                                                                                                 |
| La póliza tiene beneficiario oneroso, usted debe tener en su poder el paz y salvo o el documento de la entidad onerosa en donde se acepta la cancelación , gestión que de manera previa debió haber realizado el asesor |


Examples:
|  |
|  |