Meta:
@lote1
@tag equipo: reaseguro
@local

Narrative:
como usario de policy center
con un perfil que tenga permisos quiero ser capaz ver la distribución de los riesgos cedidos y excedentes,
para autos PD y Liability


Scenario: Crear poliza Autos reaseguro con cobertura autos PD y Liability.
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza de autos:
| producto | tipoPoliza | tipo_documento       | fecha_nacimiento | primer_nombre | primer_apellido | tipo_direccion          | direccion        | departamento | ciudad   | agente |
| Autos    | Individual | CEDULA DE CIUDADANIA | 02/12/1990       | CARLOS        | RUIZ            | DIRECCION DE RESIDENCIA | CALLE 11B #69-25 | Antioquia    | Medellin | INT-3  |
When ingrese los datos del asegurado <tipo_documento> <documento>
And ingrese los datos de vehiculo:
| placa  | modelo | codigo_fasecolda | ciudad_circulacion | vehiculo_servicio | chasis | motor | valor_asegurado | descuento | recargo | zona | plan               | cero_kilometros | medioVenta |
| random | 2017   | 52525252         | MEDELLIN           | Particular        | null   | null  | 16000000        | null      | null    | 2    | Plan Autos Global  | Si              | Televentas |
And vaya a la pantalla de coberturas
And seleccione todas las coberturas de comision:
| limite | deducible | PTH | PPH | GTH | AS                 | PTD | PPD | GT | CRPP | CRPT | PLlaves |
| 1.440  | 0         | 0   | 835 | 40. | Asistencia Global  | 0   | 835 | 40 | 20   | 20   |         |
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
