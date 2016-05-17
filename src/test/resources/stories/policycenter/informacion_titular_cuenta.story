Meta:

Narrative:
Como usuario PolicyCenter
quiero ser capaz de ver un resumen de la informacion del titular de la cuenta.
La pantalla debe mostrar la información completa de la cuenta del cliente, las polizas y el estado de la reclamaciones
y otra informacion de multiples sistemas como ClaimCenter y BillingCenter


Scenario: Ver informacion del titular de la cuenta
GivenStories: stories/policycenter/login_policy.story
Given que existe titular de la cuenta con <tipoDoc>, <nombre> y <apellido>
When ingrese a informacion del titular de la cuenta
Then debe mostrarme la informacion basica <informacionBasica>, metricas <metricas>, transacciones de polizas pendientes <transacciones> y siniestros abiertos <reclamaciones>

Examples:
|tipoDoc             |nombre  |apellido|informacionBasica                   |metricas                     |transacciones                     |reclamaciones         |
|CEDULA DE CIUDADANIA|Yurledys|Gallego |Información del titular de la cuenta|Métricas de valor del cliente|Transacciones de póliza pendientes|Reclamaciones abiertas|


Scenario: Informacion basica
GivenStories: stories/policycenter/login_policy.story
Given que existe titular de la cuenta con <tipoDoc>, <nombre> y <apellido>
When ingrese a informacion del titular de la cuenta
Then debe mostrarme en la informacion basica: Titular de la cuenta <titularCuenta>, tipo de documento <tipoDocumento>,
Nro de documento <nroDocumento>, prima en vigencia <primaVigencia>, Segmentacion <segmentacion>, Comportamiento <comportamniento>,
actividad economica <actividadEconomica>, Total no Facturado <totalNoFacturado>, total actualmente facturado <totalFacturado>,
total vencido <totalvencido> y total pendiente <totalPendiente>.

Examples:
|tipoDoc             |nombre  |apellido|titularCuenta|tipoDocumento|nroDocumento|primaVigencia|segmentacion|comportamniento|actividadEconomica|totalNoFacturado|totalFacturado|totalvencido|totalPendiente|
|CEDULA DE CIUDADANIA|Yurledys|Gallego |||||


Scenario: Metricas de valor de cliente
GivenStories: stories/policycenter/login_policy.story
Given que existe titular de la cuenta con <tipoDoc>, <nombre> y <apellido>
When ingrese a informacion del titular de la cuenta
Then debe mostrarme en metricas de valor del cliente: Anio de vigencia de la primera poliza <AnioVigencia>, polizas activas <polizasActivas>,
Cancelado por el cliente <canceladoPorCliente>, cancelado por la compania de seguros por falta de pago <canceladoPorCompania>,
otras cancelaciones <otrasCancelaciones>, prima vitalicia <primaVitalicia>.
Informacion de siniestros abiertos: Total de siniestros abiertos <totalSiniestrosAbiertos>, total neto incurrido <totalNetoIncurrido>.

Examples:
|tipoDoc             |nombre  |apellido|AnioVigencia|polizasActivas|canceladoPorCliente|canceladoPorCompania|otrasCancelaciones|primaVitalicia|totalSiniestrosAbiertos|totalNetoIncurrido|
|CEDULA DE CIUDADANIA|Yurledys|Gallego |||||


Scenario: Transacciones de Pólizas pendientes
GivenStories: stories/policycenter/login_policy.story
Given que existe titular de la cuenta con <tipoDoc>, <nombre> y <apellido>
When ingrese a informacion del titular de la cuenta
Then debe mostrarme: Fecha de creación <fechaCreacion>, Numero de poliza <nroPoliza>, producto <producto>,
Numero de transaccion <nroTransaccion>, Tipo <tipo>, estado <estado>

Examples:
|tipoDoc             |nombre  |apellido|fechaCreacion|nroPoliza|producto|nroTransaccion|tipo|estado|
|CEDULA DE CIUDADANIA|Yurledys|Gallego |||||


Scenario: Siniestros abiertos
GivenStories: stories/policycenter/login_policy.story
Given que existe titular de la cuenta con <tipoDoc>, <nombre> y <apellido>
When ingrese a informacion del titular de la cuenta
Then debe mostrarme Numero de poliza <nroPoliza>, producto <producto>, asegurado <asegurado>, Fecha de perdida <fechaPerdida>,
numero de siniestro <nroSiniestro>, Estado <estado>, total incurrido <totalIncurrido>.

Examples:
|tipoDoc             |nombre  |apellido|nroPoliza|producto|asegurado|fechaPerdida|nroSiniestro|estado|totalIncurrido|
|CEDULA DE CIUDADANIA|Yurledys|Gallego |||||


Scenario: Concatenar nombre completo de persona natural
GivenStories: stories/policycenter/login_policy.story
Given que existe titular de la cuenta con <tipoDoc>, <nombre> y <apellido>
When ingrese a informacion del titular de la cuenta
Then el nombre del titular de la cuenta debe aparecer con el nombre completo, es decir, nombre 1 <primerNombre>
seguido de nombre 2 <segundoNombre> seguido de apellido 1 <primerApellido> seguido de apellido 2 <segundoApellido>.

Examples:
|tipoDoc             |nombre  |apellido|primerNombre|segundoNombre|primerApellido|segundoApellido|
|CEDULA DE CIUDADANIA|Yurledys|Gallego |||||