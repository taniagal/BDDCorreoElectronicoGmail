Meta:
@tag equipo: 5, sprint: 7
@lote5

Narrative:
Como usuario de  policy center con el perfil X,
Quiero ser capaz de actualizar o realizar modificaciones de datos de una poliza en el proceso de renovacion de una poliza

Scenario: Editar Transaccion - Vehiculo
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza de autos:
| producto | tipoPoliza | tipo_documento       | fecha_nacimiento | primer_nombre | primer_apellido | tipo_direccion          | direccion        | departamento | ciudad   | agente |
| Autos    | Individual | CEDULA DE CIUDADANIA | 02/12/1988       | MARIO         | PITONIZO        | DIRECCION DE RESIDENCIA | CALLE 65B #60-25 | Antioquia    | Medellin | INT-3  |
When ingrese los datos del asegurado <tipo_documento> <documento>
And ingrese los datos del vehiculo:
| placa  | modelo | codigo_fasecolda | ciudad_circulacion | vehiculo_servicio | chasis | motor | valor_asegurado | descuento | recargo | zona | plan         | medioVenta |
| random | 2011   |                  | MEDELLIN           | Particular        | null   | null  | 17900000        | null      | null    | 2    | Plan Modular | Televentas |
And ingrese las coberturas:
| limite | deducible | abogado | PLlaves |
| 640.   | 0         | Si      | Si      |
When expido la poliza y voy a informacion de poliza expedida
And realize la renovacion de una poliza
And estoy en la pantalla de Vehiculo
Then se deben poder modificar los campos: Ciudad de circulacion, Tipo de servicio, Motor,
Chasis, Bonificacion, Suavizacion, Recargo, Descuento, Valor Asegurado, Valor accesorios,
Valor accesorios especiales
Then no debo poder modificar los datos de: Placa, Relacion de asegurados en el caso de que solo exista un asegurado y
este ya esta relacionado, en el caso de que exista mas de un asegurado y ste no este  relacionado si es posible
relacionar el o los asegurados faltantes
And no debo poder interactuar con los vehiculos de la poliza

Examples:
| tipo_documento       | documento  |
| CEDULA DE CIUDADANIA | 1234567890 |