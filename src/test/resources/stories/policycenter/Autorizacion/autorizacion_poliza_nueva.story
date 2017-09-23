Meta:

Narrative:
As a user
I want to perform an action
So that I can achieve a business goal

Scenario: scenario description
GivenStories: stories/policycenter/login_policy.story
Given se tienen los siguientes parametros para la busqueda
|oficina|asesor|regla                                                                                                                                             |canal |
|4029   |      |UWInsuredValueVehicle,PAIssueVehicleMake,PAIssueValueAccesories,PAIssueValueSpecialAccesories,PAIssueExistingLicensePlate,UWIssueForBonus         |CC013 |
Given estoy cotizando una poliza:
| cuenta      | producto  | oficina | agente_oficina                                 | tipoPoliza |
| 0225097276  | Autos     | 4029    | BELTRAN*SANABRIA CQLII**PEDRO ANTONIO          | Individual |
When ingrese los datos del asegurado <tipo_documento> <documento>
When ingrese los datos del vehiculo:
| placa  | modelo | codigo_fasecolda | ciudad_circulacion       | vehiculo_servicio | chasis | motor     | valor_asegurado  | descuento | recargo | zona   | plan               | medioVenta |
| dag64f | 2015   | 35701008         | Medellin(Antioquia)      | Particular        | addsd  | dsdsdsds  | 284000000        | null      | null    | 11     | Plan Autos Global   | Televentas |
When ingrese las coberturas:
| limite | deducible | AS               |abogado|
| 640.   | 0         | Asistencia Global|       |
And llegue a la expedicion de la poliza
And cuando edite la transacion de la poliza
And agregue un nuevo valor asegurado <valor_asegurado>
And cuando edite la transacion de la poliza
And vaya a vehiculos en expedicion
And seleccione la opcion importado por terceros
And se ingrese el valor de los accesorios es superior al 20% del valor asegurado del vehiculo
And Se ingrese el valor de los accesorios especiales es superior al 100% del valor asegurado del vehículo
And cotice una poliza
And voy a expedir una poliza
And ingese al plan del trabajo
And valide la persona a la cual le llego el plan de trabajo

Examples:
| accesorios | tipo_documento       | documento  |valor_asegurado     |
| 2600000    | CEDULA DE CIUDADANIA | 1000283562 |405000000           |

Examples:
||
||