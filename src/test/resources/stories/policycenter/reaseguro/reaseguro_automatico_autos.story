Meta:
@lote3
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
| 3.040  | 0         | 0   | 835 | 40. | Asistencia Global  | 0   | 835 | 40 | 20   | 20   |         |
And agregue un nuevo valor asegurado <valor_asegurado>
And quiera reasegurar la poliza cotizada
And de clic en el registro de autos: Auto Liability
Then se debe verificar la base reasegurable del riesgo y la base del contrato automatico:
| baseReasegurableRiesgo | baseReaseguroContrato |
| 3.040.000.000          | 3.040.000.000         |
And se valida el valor retenido y el riesgo cedido del contrato cuota parte
And se valida el porcentaje de retencion y el riesgo cedido del operativo de exceso
When de clic en el registro de autos: Auto PD
Then se debe verificar la base reasegurable del riesgo y la base del contrato automatico:
| baseReasegurableRiesgo | baseReaseguroContrato |
| 300.000.000            | 300.000.000           |
And se valida el valor retenido y el riesgo cedido del contrato cuota parte
When expido la poliza mrc
And de clic al boton detalle
And realice aprobacion especial asociada a varias observaciones
And expido la poliza mrc
And ingrese al resumen de la poliza expedida
And de clic al menu reaseguro
And de clic en el registro de autos: Auto Liability
Then se debe verificar la base reasegurable del riesgo y la base del contrato automatico:
| baseReasegurableRiesgo | baseReaseguroContrato |
| 3.040.000.000          | 3.040.000.000         |
And se valida el valor retenido y el riesgo cedido del contrato cuota parte
And se valida el porcentaje de retencion y el riesgo cedido del operativo de exceso
When de clic en el registro de autos: Auto PD
Then se debe verificar la base reasegurable del riesgo y la base del contrato automatico:
| baseReasegurableRiesgo | baseReaseguroContrato |
| 300.000.000            | 300.000.000           |
And se valida el valor retenido y el riesgo cedido del contrato cuota parte

Examples:
| tipo_documento       | documento  | valor_asegurado |
| CEDULA DE CIUDADANIA | 1264567899 | 300000000       |
