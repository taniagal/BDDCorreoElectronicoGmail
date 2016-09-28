Modificacion Cotizacion De Poliza Pa

Meta:

@issue #CDSEG-1286
@tag automator: diego_cardona_acevedo
@local
@Sprint 4

Narrative:
Como usuario de Policy Center
debo poder realizar una cotizacion
en el proceso de modificacion de una poliza existente.

Scenario: Informacion general de cotizacion
GivenStories: stories/policycenter/login_policy.story
Given se ha realizado la cotizacion de la modificacion <cotizacion>
When ingrese al detalle de la modificacion
Then debo ver de la cotizacion la siguiente informacion
| numeroPoliza  | numeroCotizacion | tomador                         | tipoDocumento        | numeroDocumento | direccion                                   | tipoDireccion           | descripcionDireccion                       | empresaAseguradora        | prima               | impuestos   | total               |
| TEST_22222222 | 55555555         | DORIAN STIWAR EASTMOND PULGARIN | CEDULA DE CIUDADANIA | 1234567891      | CRA 65 # 48-162, LOUISVILLE, Estados Unidos | DIRECCION DE RESIDENCIA | Created by the Address Builder with code 0 | Acme Low Hazard Insurance | $2.259.410,00 (COP) | $0,00 (COP) | $2.259.410,00 (COP) |

Examples:
|cotizacion|
|55555555|

Scenario: Validar direccion del tomador de la poliza
Given se ha realizado la cotizacion de la modificacion <cotizacion>
When ingrese al detalle de la modificacion
Then debo poder ver la direccion del tomador de la modificacion <direccion>, la cual se indico como principal

Examples:
| cotizacion | direccion                                   |
| 55555555   | CRA 65 # 48-162, LOUISVILLE, Estados Unidos |

Scenario: Quote
Given se ha realizado la cotizacion de la modificacion <cotizacion>
When ingrese al detalle de la modificacion
Then se debe mostrar la informacion del detalle de modificacion por riesgo

Examples:
|cotizacion |
|55555555   |

Scenario: Terminos detalle cotizacion
Given se ha realizado la cotizacion de la modificacion <cotizacion>
When ingrese al detalle de la modificacion
Then se debe mostrar en la columna "Termino" de la modificacion el limite o deducible de la cobertura en el caso de que aplique

Examples:
|cotizacion |
|55555555   |

Scenario: Quote - Termino de la cobertura - Limite
Given se ha realizado la cotizacion de la modificacion <cotizacion>
When ingrese al detalle de la modificacion
Then se debe mostrar en la columna "Termino" de la modificacion el limite de la cobertura en el caso de que aplique

Examples:
|cotizacion |
|55555555   |

Scenario: Quote - Termino de la cobertura - Deducible
Given se ha realizado la cotizacion de la modificacion <cotizacion>
When ingrese al detalle de la modificacion
Then se debe mostrar en la columna "Termino" de la modificacion el deducible de la cobertura en el caso de que aplique

Examples:
|cotizacion |
|55555555   |

Scenario: Quote - Informacion detalle de cambio de costo
Given se ha realizado la cotizacion de la modificacion <cotizacion>
When ingrese al detalle de la modificacion
Then debo ver los detalles del cambio del costo de la modificacion

Examples:
|cotizacion |
|55555555   |
