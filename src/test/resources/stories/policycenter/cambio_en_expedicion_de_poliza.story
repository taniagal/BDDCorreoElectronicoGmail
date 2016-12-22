cambio en expedicion de Poliza

Meta:
@lote2
@issue #CDSEG-1251
@tag automator: juan_carlos_restrepo
@Sprint 4

Narrative:
Como usuario de policy center
quiero ser capaz de emitir cambios para las pólizas de auto en PolicyCenter.


Scenario: Validacion de resumen de la poliza expedirla
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza basado en otro envio <envio>
And ingrese los datos de la cotizacion PA
|ciudad_circulacion|limite|deducible|abogado |PLlaves |modelo|
|MEDELLIN          |1.440 |0        |Opción 1|Opción 1|2016  |
When expido la poliza y voy al archivo de poliza
And expida el cambio de una poliza
Then debe mostrar el resumen de la poliza expedida con la informacion del cambio <infoCambio>, poliza <infoPoliza>,  escritorio <escritorio>

Examples:
|envio   |infoCambio                 |infoPoliza     |escritorio      |
|22228589|El cambio en la póliza (N.°|Ver póliza (N.°|Ir al escritorio|


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