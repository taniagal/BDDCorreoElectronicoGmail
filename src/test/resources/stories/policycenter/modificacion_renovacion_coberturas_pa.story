Modificacion Renovacion Coberturas Pa

Meta:

@issue #CDSEG-2977
@tag automator: diego_cardona_acevedo
@local
@Sprint 7

Narrative:
Como usuario de  policy center con el perfil X
Quiero ser capaz de actualizar o realizar modificaciones de datos de una poliza en el proceso de renovacion de una poliza

Scenario: Editar transaccion - Coberturas
GivenStories: stories/policycenter/login_policy.story
Given estoy renovando una poliza <cotizacionRenovacion>
When este en la pantalla de coberturas sin validar fecha
Then se deben cargar todas las coberturas con las que venia la poliza
|danosTerceros   |responsabilidadCivil |limite    |deducible|danosCarro    |danos |perdidaTotalDanos|perdidaParcialDanos|gastosTransporteD|hurtoCarro    |hurto|perdidaTotalHurto|gastosTransporteH|
|Daños a Terceros|Responsabilidad Civil|32.000.000|0        |Daños al Carro|Daños |10%              |0                  |40.000/DIA (PT)  |Hurto al Carro|Hurto|10%              |40.000/DIA (PT)  |

Examples:
|cotizacionRenovacion|
|32222330            |

Scenario: Validar que no se puedan retirar coberturas obligatorias
GivenStories: stories/policycenter/login_policy.story
Given estoy renovando una poliza <cotizacionRenovacion>
When este en la pantalla de coberturas
And intente retirar coberturas obligatorias
|cobertura            |
|Responsabilidad Civil|
Then no debo poder retirar las coberturas obligatorias

Examples:
|cotizacionRenovacion|
|32222330            |

Scenario: Validar que se puedan modificar deducibles y limites
Given estoy renovando una poliza <cotizacionRenovacion>
When este en la pantalla de coberturas
Then debo poder modificar los deducibles y limites tanto de las coberturas opcionales como obligatorias

Examples:
|cotizacionRenovacion|
|32222330            |

Scenario: Rerirar cobertura que es opcional
Given estoy renovando una poliza <cotizacionRenovacion>
When este en la pantalla de coberturas
Then debo poder retirar una cobertura que es Opcional

Examples:
|cotizacionRenovacion|
|32222330            |

Scenario: Adicionar una nueva cobertura
Given estoy renovando una poliza <cotizacionRenovacion>
When este en la pantalla de coberturas
Then debo poder adicionar una nueva cobertura

Examples:
|cotizacionRenovacion|
|32222330            |

Scenario: Editar transaccion - Valida datos en lista Coberturas
Meta: @manual
Given estoy renovando una poliza <cotizacionRenovacion >
When este en la pantalla de coberturas con datos
Then se deben validar en las listas los datos que tenia la poliza al inicio de la renovacion
|limite    |deducible|perdidaTotalDanos|perdidaParcialDanos|gastosTransporteD|hurtoCarro    |perdidaTotalHurto|gastosTransporteH|
|32.000.000|0        |10%              |0                  |40.000/DIA (PT)  |Hurto al Carro|10%              |40.000/DIA (PT)  |


