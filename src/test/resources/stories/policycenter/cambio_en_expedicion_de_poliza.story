cambio en expedicion de Poliza

Meta: @lote2

@issue #CDSEG-1251
@Automatizador Jonathan Mejia
@tag automator: Jonathan_Mejia_Leon
@local
Sprint 4

Narrative:
Como usuario de policy center
quiero ser capaz de emitir cambios para las pólizas de auto en PolicyCenter.


Scenario: Validacion boton cancelar
GivenStories: stories/policycenter/login_policy.story
Given Que tengo una cotizacion <cotizacion>
When cuando vaya expedir el cambio de una poliza
Then cancelo el mensaje de expedir cambio de poliza

Examples:
|cotizacion |
|22222222   |


Scenario: Validacion de resumen de la poliza expedirla
Given Que tengo una cotizacion <cotizacion>
When cuando vaya expedir el cambio de una poliza
And confirmo el mensaje de expedir cambio de poliza
Then debe mostrar el resumen de la poliza expedida con la informacion del cambio <infoCambio>, poliza <infoPoliza>,  escritorio <escritorio>

Examples:
|cotizacion |infoCambio                                              |infoPoliza     |escritorio      |
|22222222   |El cambio en la póliza (N.° 55555558) ha sido realizado.|Ver póliza (N.°|Ir al escritorio|


Scenario: Validacion etiquetas y mensaje de ventana
Meta: @lote2
@manual
Given  Que tengo una cotizacion <cotizacion >
When cuando vaya expedir en el cambio de una poliza
And  confirmo que el mensaje de expedir cambio de poliza
Then  se deben validar todos las etiquetas y mensajes del formulario <mensaje>

Examples:
|cotizacion |mensaje|
|22222222   |Esta Seguro que desea expedir este cambio en la poliza?|