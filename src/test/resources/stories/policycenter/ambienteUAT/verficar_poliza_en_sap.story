Meta:
@uat


Narrative:
Como usuario de policy center quiero poder solicitar autorización a los comites de Riesgos consultables
quiero poder solicitar autorización a los comites de Riesgos consultables
para poder cotizar o expedir una poliza


Scenario: Verificar la generacion de la factura de una poliza en SAP
GivenStories: stories/policycenter/login_policy_sap.story
Given estoy cotizando una poliza:
| cuenta     | producto | agente_oficina                             | oficina | tipoPoliza |
| 3809223880 | Autos    | AGUDELO*RODRIGUEZ CQLII**GLORIA STELLA     | 4029    | Individual |
When ingrese los datos del asegurado <tipo_documento> <documento>
And ingrese los datos de vehiculo:
| placa  | modelo | codigo_fasecolda | ciudad_circulacion | vehiculo_servicio | chasis    | motor   | valor_asegurado | descuento | recargo | zona | plan              | medioVenta |
| random | 2017   | 01601253         | MEDELLIN           | Particular        | 526adsafd | 34asdas | 29800000        | null      | null    | 2    | Plan Autos Básico | Asesor     |
And ingrese a la pantalla de coberturas
And ingrese las coberturas a auto cero kilometros:
| limite | deducible | AS                |
| 640.   | 0         | Asistencia Básica |
And cotice una poliza
And expido la poliza y capturo el numero de poliza
Then se valida la creacion de la poliza en SAP

Examples:
| tipo_documento       | documento  | asistencia        |
| CEDULA DE CIUDADANIA | 98642996   | Asistencia Básica |