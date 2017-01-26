Meta:
@tag equipo: XX
@loteXX
@Sprint XXX

Narrative:
Como [Rol del usuario]
Quiero [Objetivo]
Para poder [Beneficio]

Scenario: Nombre del escenario en lenguaje de negocio, no técnico
Given preparacion de la prueba en lenguaje de negocio
And opcional (arrange)
When ejecucion de la prueba como tal, que vamos a probar en lenguaje de negocio
And obligatorio (act)
Then resultado esperado de la prueba en lenguaje de negocio
And obligatorio (assert)
Examples:
| xxxx  | yyyy |
| x     | y    |

################### ejemplo ###########################

Meta:
@tag equipo: 1
@lote1
@Sprint 1

Narrative:
Como asesor
Quiero expedir una poliza
Para poder asegurar a un cliente

Scenario: expedicion de poliza de autos individual con plan de pago anual exitosa
Given el cliente posee una cuenta
And tiene una cotizacion de una poliza de autos indivual
When expida la poliza con la <cobertura>
And tenga un plan anual
Then el cliente debe quedar asegurado
And y su plan de pago debe ser anual

Examples:
| riesgos   |
| rc        |
| hurto     |
| daño      |