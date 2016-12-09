Informacion Titular Cuenta

Meta: @lote2

@issue #CDSEG-657
@tag automator: diego_cardona_acevedo
@Sprint 1

Narrative:
Como usuario PolicyCenter
quiero ser capaz de ver un resumen de la informacion del titular de la cuenta.
La pantalla debe mostrar la información completa de la cuenta del cliente, las polizas y el estado de los siniestros
y otra informacion de multiples sistemas como ClaimCenter y BillingCenter

Scenario: Ver informacion del titular de la cuenta
GivenStories: stories/policycenter/login_policy.story
Given que existe titular de la cuenta con <tipoDoc>, <nombre> y <apellido>
When ingrese a informacion del titular de la cuenta
Then debe mostrarme la informacion basica <informacionBasica>, metricas <metricas>, transacciones de polizas pendientes <transacciones> y siniestros abiertos <siniestros>
And debe mostrarme en metricas de valor del cliente: Anio de vigencia de la primera poliza <anioVigencia>, polizas activas <polizasActivas>, Cancelado por el cliente <canceladoPorCliente>, cancelado por la compania de seguros por falta de pago <canceladoPorCompania>, otras cancelaciones <otrasCancelaciones>, prima vitalicia <primaVitalicia>. Informacion de siniestros abiertos: Total de siniestros abiertos <totalSiniestrosAbiertos>, total neto incurrido <totalNetoIncurrido>.
And el nombre del titular de la cuenta debe aparecer con el nombre completo <nombreCompleto>, es decir, nombre 1 seguido de nombre 2 seguido de apellido 1 seguido de apellido 2.
And debe mostrarme: Fecha de creación <fechaCreacion>, Numero de poliza <nroPoliza>, producto <producto>, Numero de transaccion <nroTransaccion>, Tipo <tipo>, estado <estado>.
And debe mostrarme Numero de poliza <numeroPoliza>, producto <producto>, asegurado <asegurado>, Fecha de perdida <fechaPerdida>, numero de siniestros <numeroSiniestros>, Estado <estado>, total incurrido <totalIncurrido>.
And los campos que se muestren no deben permitir la edicion, es decir, todos los campos seran solo informativos.

Examples:
|tipoDoc             |nombre  |apellido|informacionBasica                   |metricas                     |transacciones                     |siniestros         |anioVigencia                        |canceladoPorCliente|canceladoPorCompania|otrasCancelaciones|primaVitalicia |totalSiniestrosAbiertos|totalNetoIncurrido  | nombreCompleto                |fechaCreacion     | nroPoliza    | producto | nroTransaccion     | tipo | estado |numeroPoliza     |producto| asegurado | fechaPerdida        | numeroSiniestros     | estado|totalIncurrido  |
|CEDULA DE CIUDADANIA|Yurledys|Gallego |Información del titular de la cuenta|Métricas de valor del cliente|Transacciones de póliza pendientes|Siniestros abiertos|Año de vigencia de la primera póliza|0                  |0                   |0                 |Prima vitalicia|0                      |Total neto incurrido| YURLEDYS PAOLA GALLEGO TORRES |Fecha de creación | N° de póliza | Producto | N.º de transacción | Tipo | Estado |Número de póliza |Producto| Asegurado | Fecha de la pérdida | Número de siniestros | Estado|Total incurrido |


Scenario: Mostrar campos fecha de fallecimiento y causa de fallecimiento
Meta:
@manual
Given que existe titular de la cuenta
When ingrese a informacion del titular de la cuenta
Then los campos fecha de fallecimiento <fechaFallecimiento> y causa de fallecimiento <causaFallecimiento> se deben mostrar unicamente cuando tengan informacion relacionada, de lo contrario estos campos deben permanecer ocultos.
And si el dato actividad economica esta vacio, este campo se debe ocultar, de lo contrario, se debe mostrar la actividad economica normalmente.
Examples:
| tipoDoc              | nombre  | apellido  | fechaFallecimiento     | causaFallecimiento |actividadEconomica  |
| CEDULA DE CIUDADANIA | ALFREDO | Antioquia | Fecha de fallecimiento | ACCIDENTE          |Actividad económica |

Scenario: Informacion basica
Meta:
@manual
Given que existe titular de la cuenta
When ingrese a informacion del titular de la cuenta
Then debe mostrarme en la informacion basica: Titular de la cuenta <titularCuenta>, tipo de documento <tipoDocumento>, Nro de documento <nroDocumento>, prima en vigencia <primaVigencia>, Segmentacion <segmentacion>, Comportamiento <comportamiento>, Total no Facturado <totalNoFacturado>, total actualmente facturado <totalFacturado>, total vencido <totalVencido> y total pendiente <totalPendiente>.

Examples:
| |
| |