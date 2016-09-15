expedicion de poliza mrc peps bloqueo alerta

Meta:

@issue #CDSEG-1653
@tag automator: Jonathan_Mejia_Leon
@local
Sprint 5

Narrative:
Como usuario de policy center
Se requiere modificar una cotizacion
asi que las validaciones de PEPS y riesgos consultables.

Scenario: regla de negocio, estado borrador, modificacion de cotizacion, validar peps sobre tomador, asegurado y beneficiario
GivenStories: stories/policycenter/login_policy.story
Given Que tengo una cotizacion <cotizacion>
When quiera verificar que el tomador de la poliza no va hacer evaluado por segunda vez
And quiera agregar un asegurado o beneficiario en un articulo
Then el sistema debe mostrar un mensaje de advertencia sobre los nuevos asegurados nuevos <mensaje>

Examples:
|cotizacion|mensaje|
|55555561  |GLADYS OCHOA con CEDULA DE CIUDADANIA - 94372371 es un riesgo no estándar y debe ser autorizado.^ANTONIO RESTREPO con CEDULA DE CIUDADANIA - 71123456 es un riesgo no estándar y debe ser autorizado.|

Scenario: regla de negocio, estado en cotizacion, bloqueo de expedicion de asegurados nuevos
Given Que tengo una cotizacion <cotizacion> modificada
When voy a expedir una poliza que modifique
And confirmo el mensaje de expedir poliza
Then El proceso se debe frenar y debe mostrar el mensaje de error <mensaje>

Examples:
|cotizacion|mensaje|
|55555562  |GLADYS OCHOA con CEDULA DE CIUDADANIA - 94372371 es un riesgo no estándar y debe ser autorizado.^ANTONIO RESTREPO con CEDULA DE CIUDADANIA - 71123456 es un riesgo no estándar y debe ser autorizado.|

