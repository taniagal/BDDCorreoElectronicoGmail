Meta:
@tania
@lote2
@tag equipo: 5
@sprint 14
@diego

Narrative:
Como usuario del negocio
Quiero ser capaz de mantener las notas correspondientes a una poliza
Para poder crear notas asociadas a una transaccion de una poliza tania

Scenario: Buscar por rango de fechas
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza de autos:
| organizacion | producto | tipo_documento       | numeroDocumento | fecha_nacimiento | primer_nombre | primer_apellido | tipo_direccion          | direccion       | departamento | ciudad   | agente |tipoPoliza|
| Sura         | Autos    | CEDULA DE CIUDADANIA | 1088253         | 04/02/1980       | DIEGO         | CARDONA         | DIRECCION DE RESIDENCIA | CALLE 50 #50-50 | Antioquia    | Medellin | INT-3  |Individual|
And ingrese los datos del asegurado <tipo_documento> <documento>
And ingrese los datos del vehiculo:
| placa  | modelo | codigo_fasecolda | ciudad_circulacion | vehiculo_servicio | chasis  | motor | valor_asegurado | descuento | recargo | zona | plan               |
| DAC275 | 2011   | 01601225         | MEDELLIN           | Particular        | kljh456 | yui10 | 17900000        | null      | null    | 2    | Plan Autos Clásico |
When ingrese las coberturas basicas:
|limite|deducible|
|640.  |0        |
And cotice una poliza
And vaya a la opcion de Notas de la transaccion
And seleccione la opcion de fecha
| fechaDesde | fechaHasta |
| 01/02/2017 | 07/02/2017 |
Then debo poder visualizar las notas asociadas a la cuenta que se encuentran en este rango de fechas

Examples:
| tipo_documento       | documento |nombre|
| CEDULA DE CIUDADANIA | 1088253   |tania |