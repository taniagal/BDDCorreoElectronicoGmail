Meta:

Narrative:
As a user
I want to perform an action
So that I can achieve a business goal

Scenario: scenario description
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza:
| cuenta      | producto  | oficina | agente_oficina                                 | tipoPoliza |
| 0225097276  | Autos     | 4029    | BELTRAN*SANABRIA CQLII**PEDRO ANTONIO          | Individual |
And ingrese el tipo de vigencia de la poliza Tipo Vigencia: Otra
And MA ingrese la Fecha Inicio Vigencia: -20 Fecha fin vigencia -1
When ingrese los datos del asegurado <tipo_documento> <documento>
When ingrese los datos del vehiculo:
| placa  | modelo | codigo_fasecolda | ciudad_circulacion   | vehiculo_servicio | chasis | motor     | valor_asegurado | descuento | recargo | zona | plan               | medioVenta |transporte_combustible|vehiculo_blindado|
| random | 2017   | 00601190         | MEDELLIN (ANTIOQUIA)  | Particular        | addsd  | dsdsdsds  | 94900000        | null      | null    | 11    | Plan Autos Global | Televentas |                      |                 |
And ingrese las coberturas a vehiculo:
| limite | deducible | AS                |
| 640.   | 0         | Asistencia Global |
And intente cotizar
And expido la poliza y voy al archivo de poliza
And quiera realizar esta renovacion
And edite la informacion del vehiculo en la renovacion
|chasis  |motor  |
|DAC478  |M45754 |
And se ingrese el valor de los accesorios es superior al 20% del valor asegurado del vehiculo
And Se ingrese el valor de los accesorios especiales es superior al 100% del valor asegurado del vehículo
And cotice la renovacion
And emita la renovacion
Then se debe mostrar un mensaje que indique
|mensaje                                                     |
|¿Está seguro de que desea emitir la renovación de la póliza?|
Examples:
|tipo_documento      |documento |
|CEDULA DE CIUDADANIA|9923424349|