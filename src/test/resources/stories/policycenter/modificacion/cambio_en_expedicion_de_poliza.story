cambio en expedicion de Poliza

Meta:
@lote2
@issue #CDSEG-1251
@tag automator: Jonathan_Mejia_Leon
@Sprint 4

Narrative:
Como usuario de policy center
quiero ser capaz de emitir cambios para las pólizas de auto en PolicyCenter.


Scenario: Validacion de resumen de la poliza expedirla
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza:
|cuenta     |organizacion|producto|canal            |tipoPoliza |
|C1060447895|Sura        |Autos   |Canal Tradicional|Individual |
When ingrese los datos del asegurado <tipo_documento> <documento>
And ingrese los datos del vehiculo:
|placa |modelo|codigo_fasecolda|ciudad_circulacion|vehiculo_servicio|chasis|motor|valor_asegurado|descuento|recargo|zona|plan        |
|random|2016  |00601182        |MEDELLIN          |Particular       |null  |null |165900000      |null     |null   |2   |Plan Modular|
And ingrese las coberturas:
|limite|deducible|abogado |PLlaves |
|1.440 |0        |Opción 1|Opción 1|
When expido la poliza y voy al archivo de poliza
And expida el cambio de una poliza
Then debe mostrar el resumen de la poliza expedida con la informacion del cambio <infoCambio>, poliza <infoPoliza>,  escritorio <escritorio>

Examples:
|tipo_documento      |documento |infoCambio                 |infoPoliza     |escritorio      |
|CEDULA DE CIUDADANIA|1060447895|El cambio en la póliza (N.°|Ver póliza (N.°|Ir al escritorio|


Scenario: Validacion etiquetas y mensaje de ventana
Meta:
@manual
Given  Que tengo una cotizacion <cotizacion >
When cuando vaya expedir en el cambio de una poliza
And  confirmo que el mensaje de expedir cambio de poliza
Then  se deben validar todos las etiquetas y mensajes del formulario <mensaje>

Examples:
|cotizacion |mensaje|
|55555558   |Esta Seguro que desea expedir este cambio en la poliza?|