Meta:
@lote3
@tag equipo: Policy
@local

Narrative:
como usario de policy center
con un perfil que tenga permisos quiero ser capaz ver la devolución de la prima en su totalidad
cuando se modifica una póliza y posteriormente se cancela a la fecha de inicio de vigencia.


Scenario: Crear poliza Autos con plan global
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza de autos:
| producto | tipoPoliza | tipo_documento       | fecha_nacimiento | primer_nombre | primer_apellido | tipo_direccion          | direccion        | departamento | ciudad   | agente |
| Autos    | Individual | CEDULA DE CIUDADANIA | 02/12/1980       | CARLAZ        | RUIZER          | DIRECCION DE RESIDENCIA | CALLE 25B #69-96 | Antioquia    | Medellin | INT-3  |
When ingrese los datos del asegurado <tipo_documento> <documento>
And ingrese los datos de vehiculo:
| placa  | modelo | codigo_fasecolda | ciudad_circulacion | vehiculo_servicio | chasis | motor | valor_asegurado | descuento | recargo | zona | plan               | cero_kilometros | medioVenta |
| random | 2017   | 52525252         | MEDELLIN           | Particular        | null   | null  | 16000000        | null      | null    | 2    | Plan Autos Global  | Si              | Televentas |
And vaya a la pantalla de coberturas
And seleccione todas las coberturas de comision:
| limite | deducible | PTH | PPH | GTH | AS                 | PTD | PPD | GT | CRPP | CRPT | PLlaves |
| 3.040  | 0         | 0   | 835 | 40. | Asistencia Global  | 0   | 835 | 40 | 20   | 20   |         |
And agregue un nuevo valor asegurado <valor_asegurado>
When expido la poliza mrc sin facultativo
And de clic al boton detalle
And realice aprobacion especial asociada a varias observaciones
And expido la poliza mrc sin facultativo
And ingrese al resumen de la poliza expedida
And cambio la fecha de vigencia sumando los dias a la fecha actual: 10
And ingrese a la opcion vehiculos
And cambie la ciudad de circulacion <ciudad>
And intente cotizar el cambio de poliza
And expida el cambio de la poliza

Examples:
| tipo_documento       | documento  | valor_asegurado |
| CEDULA DE CIUDADANIA | 1264567899 | 300000000       |