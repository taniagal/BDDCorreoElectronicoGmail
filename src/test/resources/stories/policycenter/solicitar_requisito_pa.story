Solicitar Requisito Pa

Meta:
@lote3
@issue #CDSEG-2881
@tag automator: diego_cardona_acevedo
@local
@Sprint 9

Narrative:
Como usuario de negocio
Quiero que se levante el requisito para la solucion de autos de acuerdo a las reglas de negocio ya definidas.

Scenario: validar mensaje de advertencia - requisitos pendientes para expedicion y modificacion
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza de autos:
| organizacion | producto | canal             | tipoPoliza | tipo_documento       | numeroDocumento | fecha_nacimiento | primer_nombre | primer_apellido | tipo_direccion          | direccion        | departamento | ciudad   | agente |
| Sura         | Autos    | Canal Tradicional | Individual | CEDULA DE CIUDADANIA | 1112223334      | 10/10/1984       | CORALINA      | CALAMARO        | DIRECCION DE RESIDENCIA | CALLE 29F #60-68 | Antioquia    | Medellin | INT-3  |
When ingrese los datos del asegurado <tipo_documento> <documento>
And ingrese los datos del vehiculo:
| placa  | modelo | codigo_fasecolda | ciudad_circulacion | vehiculo_servicio | chasis | motor | valor_asegurado | descuento | recargo | zona | plan         |
| random | 2016   | 00601182         | MEDELLIN           | Particular        | null   | null  | 165900000       | null      | null    | 2    | Plan Modular |
And ingrese las coberturas:
| limite | deducible | abogado  | PLlaves  |
| 1.440  | 0         | Opción 1 | Opción 1 |
And llegue a la expedicion de la poliza
Then se debe habilitar la opcion de requisitos, con el fin de visualizar los requisitos requeridos
And se debe mostrar un mensaje de advertencia
| mensaje                                                        |
| Existen requisitos opcionales pendientes, por favor verifique. |
And voy a expedir una poliza
And realizo la modificacion de la poliza e intento expedirla con requisitos pendientes
Then se debe mostrar un mensaje de advertencia
| mensaje                                                        |
| Existen requisitos opcionales pendientes, por favor verifique. |


Examples:
| tipo_documento       | documento |
| CEDULA DE CIUDADANIA | 11111111  |


Scenario: Validar ventana de requisitos
Meta: @manual
Given estoy expidiendo una poliza nueva
When seleccione la opcion expedir poliza
Then se deben cargar en la ventana de requisitos los requisitos de acuerdo a la regla de negocio
