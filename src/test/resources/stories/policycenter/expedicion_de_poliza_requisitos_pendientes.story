Expedicion De Poliza Requisitos Pendientes

Meta:
@lote3
@issue #CDSEG-4316
@tag automator: tania_grajales_alzate
@local
@Sprint 12

Narrative:
Como usuario de policy center
Se requiere  expedir una poliza si los requisitos pendientes obligatorios se encuentran recibidos o adjuntos,
en el caso de que no se encuentren adjuntos o recibidos el sistema debe mostrar un mensaje de errror,
y no debe dejar expedir la poliza hasta que estos no esten adjuntos, en caso de que los requisitos no sean obligatorios,
debe sacar un mensaje de alerta y debe permitir expedir la poliza


Examples:
|tipo_documento      |documento |
|CEDULA DE CIUDADANIA|1234567890|

Scenario: Validacion beneficiario oneroso en expedicion-modificacion
GivenStories: stories/policycenter/login_policy.story
Given ya se tiene una poliza expedida <numeroPoliza>
When ingrese a modificar dicha cotizacion
And se ingrese a la opcion vehiculos
And ingrese la ciudad de circulacion <ciudad>
And ingrese un beneficiario oneroso en modificacion <beneficiario>
And ingrese algunas coberturas en modificacion
And intente cotizar el cambio de poliza
And expida el cambio de la poliza
Then debo ver un mensaje bloqueante en modificacion
|mensaje|
|Existen requisitos obligatorios pendientes por adjuntar, por favor verifique|

Examples:
|numeroPoliza |ciudad  |beneficiario   |
|TEST_22225550|MEDELLIN|Oneroso Leasing|

Scenario: Validacion beneficiario oneroso en cancelacion de polizas
Given ya se tiene una poliza expedida <numeroPoliza>
When ingrese a la opcion de cancelar poliza
And seleccionamos el motivo de cancelacion
Then debe salir un mensaje de requisitos obligatorios en cancelacion
|mensaje|
|Existen requisitos obligatorios pendientes por adjuntar, por favor verifique|

Examples:
|numeroPoliza |
|TEST_22225550|

Scenario: Validar sarlaft electronico
Meta: @manual
Given estoy expidiendo una poliza nueva
When seleccione la opcion expedir poliza
And el sarlaft fue electronico
Then se debe solicitar firma del cliente

