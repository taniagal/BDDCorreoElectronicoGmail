Meta:
@issue #SUGWUSC-15127
@Atomatizador Brayan s. Ruiz
Sprint 5

Narrative:
Como usuario de policy center
Al realizar el cambio de una poliza quiero identificar cuando una poliza tiene reaseguro especial o no.


Scenario:  Realizar cambio de una poliza que tiene reaseguro especial
GivenStories: stories/policycenter/login_policy.story

Given que voy a buscar una poliza  <buscarNumeroPoliza>
When que tiene marcado el campo reaseguro especial en <reaseguro>
And quiero relizar el cambio de una poliza
Then debo visualizar la advertencia con el <mensaje>

Examples:
|buscarNumeroPoliza     |reaseguro  |mensaje
|TEST_22222224          |Sí         |Esta poliza tiene reaseguro especial. Debe validar que las condiciones otorgadas no amparadas por el contrato automático tengan respaldo facultativo o aceptación especial.

Scenario:  Realizar cambio de una poliza PA con retroactividad

Given que voy a buscar una poliza  <buscarNumeroPoliza>
When quiero relizar el cambio de una poliza
Then debo visualizar la advertencia con el <mensaje>

Examples:
|buscarNumeroPoliza       |mensaje|
|TEST_22266665            |Advertencia: La fecha inicio de vigencia no cumple con el parámetro de retroactividad definido (30 días)       |

Scenario:  Realizar cambio de una poliza PA con emision anticipada

Given que voy a buscar una poliza  <buscarNumeroPoliza>
When quiero relizar el cambio de una poliza
Then debo visualizar la advertencia con el <mensaje>

Examples:
|buscarNumeroPoliza       |mensaje|
|TEST_22266666            |Advertencia: La fecha inicio de vigencia no cumple con el parámetro de emisión anticipada definido (60 días)       |

Scenario:  Realizar cambio de una poliza CP con retroactividad

Given que voy a buscar una poliza  <buscarNumeroPoliza>
When quiero relizar el cambio de una poliza
Then debo visualizar la advertencia con el <mensaje>

Examples:
|buscarNumeroPoliza       |mensaje|
|TEST_22266667            |Advertencia: La fecha inicio de vigencia no cumple con el parámetro de retroactividad definido (60 días)       |

Scenario:  Realizar cambio de una poliza CP con emision anticipada

Given que voy a buscar una poliza  <buscarNumeroPoliza>
When quiero relizar el cambio de una poliza
Then debo visualizar la advertencia con el <mensaje>

Examples:
|buscarNumeroPoliza       |mensaje|
|TEST_22266668            |Advertencia: La fecha inicio de vigencia no cumple con el parámetro de emisión anticipada definido (45 días)|

Scenario:  Realizar cambio de una poliza que no tiene reaseguro especial

Given que voy a buscar una poliza  <buscarNumeroPoliza>
When que tiene marcado el campo reaseguro especial en <reaseguro>
And quiero relizar el cambio de una poliza
Then NO debo visualizar la advertencia

Examples:
|buscarNumeroPoliza     |reaseguro  |
|TEST_22223278          |No         |

Scenario:  Validacion de fecha exacta para cambio de poliza
Meta: @manual
Given que voy a buscar una de las polizas <buscarNumeroPoliza>
When quiero relizar el cambio de una poliza con la fecha vigente
Then no debo visualizar la advertencia con el <mensaje>

Examples:
|buscarNumeroPoliza       |mensaje|
|TEST_22266668            |Advertencia: La fecha inicio de vigencia no cumple con el parámetro de emisión anticipada definido (45 días)|

