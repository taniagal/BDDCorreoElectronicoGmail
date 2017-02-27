Meta:
@lote4
@tag equipo: 5
@sprint 14

Narrative:
Como usuario del negocio
Quiero ser capaz de mantener las notas correspondientes a una poliza
Para poder crear notas asociadas a una transaccion de una poliza

Scenario: Buscar por rango de fechas
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza de autos:
| organizacion | producto | tipo_documento       | numeroDocumento | fecha_nacimiento | primer_nombre | primer_apellido | tipo_direccion          | direccion       | departamento | ciudad   | agente |tipoPoliza|
| Sura         | Autos    | CEDULA DE CIUDADANIA | 89651011        | 04/02/1980       | DIEGO         | CARDONA         | DIRECCION DE RESIDENCIA | CALLE 50 #50-50 | Antioquia    | Medellin | INT-3  |Individual|
And ingrese los datos del asegurado <tipo_documento> <documento>
And ingrese los datos del vehiculo:
| placa  | modelo | codigo_fasecolda | ciudad_circulacion | vehiculo_servicio | chasis  | motor | valor_asegurado | descuento | recargo | zona | plan               |medioVenta|
| DAC276 | 2011   | 01601225         | MEDELLIN           | Particular        | kljh456 | yui10 | 17900000        | null      | null    | 2    | Plan Modular       |Televentas|
When ingrese las coberturas:
|limite|deducible|abogado|PLlaves|
|640.  |0        |Si     |Si     |
And vaya a la opcion de Notas de la transaccion
And seleccione la opcion de fecha
| fechaDesde | fechaHasta |
| 01/02/2017 | 07/02/2017 |
Then debo poder visualizar las notas asociadas a la cuenta que se encuentran en este rango de fechas

Examples:
| tipo_documento       | documento  |
| CEDULA DE CIUDADANIA | 89651011   |

Scenario: Validar informacion no visible en las notas
Meta: @manual
Given tengo una poliza con notas asociadas
When ingrese a la opcion de notas
Then no se debe permitir eliminar ni editar una nota
And no se debe mostrar el nivel de seguridad
And no se debe mostrar el uso de plantillas
And no se debe mostrar el idioma