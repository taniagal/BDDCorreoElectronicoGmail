Cotizacion Renovacion Pa

Meta:

@issue #CDSEG-842
@tag automator: diego_cardona_acevedo
@local
@Sprint 6

Narrative:
Como usuario de policy center
Quiero poder realizar la cotizacion de la renovacion de una poliza de personal autos ya sea de forma manual o automatica

Scenario: Validar la informacion del detalle de la cotizacion
GivenStories: stories/policycenter/login_policy.story
Given se ha realizado la renovacion de la cotizacion <cotizacion>
When ingrese revisar la cotizacion
Then se debe mostrar la informacion del detalle de cotizacion por riesgo, donde se muestre:
|placa  |modelo |codigoFasecolda |marca |linea |
|TKC459 |2016   |00601182        |Mazda |MPV   |
And en el detalle por coberturas mostrar:
| cobertura                          | terminoCobertura | prima       | subtotal            | subtotalPrimas      |
| Cobertura de Responsabilidad Civil | 32.000.000       | $421.825,00 | $2.438.485,00 (COP) | $4.876.970,00 (COP) |

Examples:
|cotizacion |
|32112330   |

Scenario: Validar tipo de direccion
Given se ha realizado la renovacion de la cotizacion <cotizacion>
When ingrese revisar la cotizacion
Then se debe ver la direccion del tomador de la poliza la cual se indico como principal
|direccion                                      |
|CRA 65 # 48-162, SAN FRANCISCO, Estados Unidos |

Examples:
|cotizacion |
|32112330   |

Scenario: Validar termino de la cobertura
Given se ha realizado la renovacion de la cotizacion <cotizacion>
When ingrese revisar la cotizacion
Then se debe mostrar en la columna Termino el limite o deducible de la cobertura en el caso de que aplique
|limite     |deducible |
|32.000.000 |0         |

Examples:
|cotizacion |
|32112330   |

Scenario: Validar informacion general de la cotizacion
Given se ha realizado la renovacion de la cotizacion <cotizacion>
When ingrese revisar la cotizacion
Then se debe mostrar la informacion general de la poliza cotizada con los siguientes datos:
| numeroPoliza  | numeroRenovacion | tomador     | tipoDocumento        | numeroDocumento | direccion                                      | tipoDireccion           | descripcionDireccion                       | empresaAseguradora        | primaTotal          | iva               | costoTotal          |
| TEST_32112332 | 32112330         | JORGE PAISA | CEDULA DE CIUDADANIA | 1356118711      | CRA 65 # 48-162, SAN FRANCISCO, Estados Unidos | DIRECCION DE RESIDENCIA | Created by the Address Builder with code 0 | Acme Low Hazard Insurance | $4.876.970,00 (COP) | $780.315,00 (COP) | $5.657.285,00 (COP) |

Examples:
|cotizacion |
|32112330   |
