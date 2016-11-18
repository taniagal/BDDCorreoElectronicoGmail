Meta:

Narrative:
Como usuario de negocio
Quiero que se levante el requisito de sarlaft de en el pub Visual de requisitos
y habilitar el boton de Sarlaft para cada figura diferente (Tomador, asegurado  y beneficiario en el caso de que este sea gratiuto)

Scenario: Habilitar Opcion Sarlaft - Tomador
GivenStories: stories/policycenter/login_policy.story
Given voy a crear una nueva cotizacion
And crear una cotizacion nueva con la cuenta <cuenta>
And seleccione el agente <agente>
When seleccione la organizacion <organizacion>
And seleccione el canal <canal>
And seleccione el producto <producto> para expedir la poliza
When seleccione la opcion informacion de poliza
Then se debe poder visualizar la opcion Sarlaft por cada tomador


Examples:
|cuenta     |agente  |organizacion |canal             |producto |
|C000888888 |DIRECTO |Sura         |Canal Tradicional |Autos    |