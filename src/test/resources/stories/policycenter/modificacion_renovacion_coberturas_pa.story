Modificacion Renovacion Coberturas Pa

Meta: @lote4

@issue #CDSEG-2977
@tag automator: diego_cardona_acevedo
@local
@Sprint 7

Scenario: Editar transaccion - Coberturas
GivenStories: stories/policycenter/login_policy.story
Given estoy renovando una poliza <cotizacionRenovacion>
When este en la pantalla de coberturas
Then se deben cargar todas las coberturas con las que venia la poliza
|danosTerceros   |responsabilidadCivil |limite    |deducible|danosCarro    |danos |perdidaTotalDanos|perdidaParcialDanos|gastosTransporteD|hurtoCarro    |hurto|perdidaTotalHurto|gastosTransporteH|
|Daños a Terceros|Responsabilidad Civil|32.000.000|0        |Daños al Carro|Daños |10%              |0                  |40.000/DIA (PT)  |Hurto al Carro|Hurto|10%              |40.000/DIA (PT)  |

Examples:
|cotizacionRenovacion|
|32222330            |

Scenario: Validar que no se puedan retirar coberturas obligatorias
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
When este en la pantalla de coberturas sin validar fecha
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