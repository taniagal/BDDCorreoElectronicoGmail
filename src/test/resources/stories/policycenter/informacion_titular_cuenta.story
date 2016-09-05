Meta:

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

Examples:
|tipoDoc             |nombre  |apellido|informacionBasica                   |metricas                     |transacciones                     |siniestros         |
|CEDULA DE CIUDADANIA|Yurledys|Gallego |Información del titular de la cuenta|Métricas de valor del cliente|Transacciones de póliza pendientes|Siniestros abiertos|


Scenario: Informacion basica
Given que existe titular de la cuenta con <tipoDoc>, <nombre> y <apellido>
When ingrese a informacion del titular de la cuenta
Then debe mostrarme en la informacion basica: Titular de la cuenta <titularCuenta>, tipo de documento <tipoDocumento>, Nro de documento <nroDocumento>, prima en vigencia <primaVigencia>, Segmentacion <segmentacion>, Comportamiento <comportamiento>, Total no Facturado <totalNoFacturado>, total actualmente facturado <totalFacturado>, total vencido <totalVencido> y total pendiente <totalPendiente>.

Examples:
| tipoDoc              | nombre   | apellido | titularCuenta                 | tipoDocumento        | nroDocumento | primaVigencia | segmentacion        | comportamiento  | totalNoFacturado | totalFacturado | totalVencido | totalPendiente |
| CEDULA DE CIUDADANIA | Yurledys | Gallego  | YURLEDYS PAOLA GALLEGO TORRES | CEDULA DE CIUDADANIA | 1234567890   | -             | PyF Sin Información | Sin Información | $35,999.38       | $11,077.18     | $1,000.18    | $12,077.18     |


Scenario: Metricas de valor de cliente
Given que existe titular de la cuenta con <tipoDoc>, <nombre> y <apellido>
When ingrese a informacion del titular de la cuenta
Then debe mostrarme en metricas de valor del cliente: Anio de vigencia de la primera poliza <anioVigencia>, polizas activas <polizasActivas>, Cancelado por el cliente <canceladoPorCliente>, cancelado por la compania de seguros por falta de pago <canceladoPorCompania>, otras cancelaciones <otrasCancelaciones>, prima vitalicia <primaVitalicia>. Informacion de siniestros abiertos: Total de siniestros abiertos <totalSiniestrosAbiertos>, total neto incurrido <totalNetoIncurrido>.

Examples:
| tipoDoc              | nombre   | apellido | anioVigencia                         | polizasActivas | canceladoPorCliente | canceladoPorCompania | otrasCancelaciones | primaVitalicia  | totalSiniestrosAbiertos | totalNetoIncurrido   |
| CEDULA DE CIUDADANIA | Yurledys | Gallego  | Año de vigencia de la primera póliza | 0              | 0                   | 0                    | 0                  | Prima vitalicia | 0                       | Total neto incurrido |


Scenario: Concatenar nombre completo de persona natural
Given que existe titular de la cuenta con <tipoDoc>, <nombre> y <apellido>
When ingrese a informacion del titular de la cuenta
Then el nombre del titular de la cuenta debe aparecer con el nombre completo <nombreCompleto>, es decir, nombre 1 seguido de nombre 2 seguido de apellido 1 seguido de apellido 2.

Examples:
| tipoDoc              | nombre   | apellido | nombreCompleto                |
| CEDULA DE CIUDADANIA | Yurledys | Gallego  | YURLEDYS PAOLA GALLEGO TORRES |


Scenario: Transacciones de Pólizas pendientes
Given que existe titular de la cuenta con <tipoDoc>, <nombre> y <apellido>
When ingrese a informacion del titular de la cuenta
Then debe mostrarme: Fecha de creación <fechaCreacion>, Numero de poliza <nroPoliza>, producto <producto>, Numero de transaccion <nroTransaccion>, Tipo <tipo>, estado <estado>.

Examples:
| tipoDoc              | nombre   | apellido | fechaCreacion     | nroPoliza    | producto | nroTransaccion     | tipo | estado |
| CEDULA DE CIUDADANIA | Yurledys | Gallego  | Fecha de creación | N° de póliza | Producto | N.º de transacción | Tipo | Estado |


Scenario: Siniestros abiertos
Given que existe titular de la cuenta con <tipoDoc>, <nombre> y <apellido>
When ingrese a informacion del titular de la cuenta
Then debe mostrarme Numero de poliza <nroPoliza>, producto <producto>, asegurado <asegurado>, Fecha de perdida <fechaPerdida>, numero de siniestros <numeroSiniestros>, Estado <estado>, total incurrido <totalIncurrido>.

Examples:
| tipoDoc              | nombre   | apellido | nroPoliza        | producto | asegurado | fechaPerdida        | numeroSiniestros     | estado | totalIncurrido  |
| CEDULA DE CIUDADANIA | Yurledys | Gallego  | Número de póliza | Producto | Asegurado | Fecha de la pérdida | Número de siniestros | Estado | Total incurrido |


Scenario: No permitir edición en campos
Given que existe titular de la cuenta con <tipoDoc>, <nombre> y <apellido>
When ingrese a informacion del titular de la cuenta
Then los campos que se muestren no deben permitir la edicion, es decir, todos los campos seran solo informativos.

Examples:
| tipoDoc              | nombre   | apellido |
| CEDULA DE CIUDADANIA | Yurledys | Gallego  |


Scenario: Mostrar campos fecha de fallecimiento y causa de fallecimiento
Given que existe titular de la cuenta con <tipoDoc>, <nombre> y <apellido>
When ingrese a informacion del titular de la cuenta
Then los campos fecha de fallecimiento <fechaFallecimiento> y causa de fallecimiento <causaFallecimiento> se deben mostrar unicamente cuando tengan informacion relacionada, de lo contrario estos campos deben permanecer ocultos.

Examples:
| tipoDoc              | nombre  | apellido  | fechaFallecimiento     | causaFallecimiento |
| CEDULA DE CIUDADANIA | ALFREDO | ANTIOQUIA | Fecha de fallecimiento | ACCIDENTE          |


Scenario: Mostrar campo actividad economica
Given que existe titular de la cuenta con <tipoDoc>, <nombre> y <apellido>
When ingrese a informacion del titular de la cuenta
Then si el dato actividad economica esta vacio, este campo se debe ocultar, de lo contrario, se debe mostrar la actividad economica normalmente.

Examples:
| tipoDoc              | nombre  | apellido  | actividadEconomica  |
| CEDULA DE CIUDADANIA | ALFREDO | ANTIOQUIA | Actividad económica |