Expedicion Renovacion Pa Validaciones

Meta: @lote3

@issue #CDSEG-2296
@tag automator: diego_cardona_acevedo
@local
@Sprint 7

Narrative:
Como usuario de PolicyCenter
Quiero ser capaz de renovar de forma manual y automaticamente las politicas de auto personal.

Scenario: Validar Motor
GivenStories: stories/policycenter/login_policy.story
Given se esta cotizando una renovacion de poliza <cotizacion>
When emita la renovacion
And no se tenga motor ingresado
Then mostrar el siguiente mensaje de bloqueo
|mensaje                                  |
|El número de motor no ha sido ingresado  |

Examples:
|cotizacion |
|33445566   |

Scenario: Validar Chasis
Given se esta cotizando una renovacion de poliza <cotizacion>
When emita la renovacion
And no se tenga chasis ingresado
Then mostrar el siguiente mensaje de bloqueo
|mensaje                                  |
|El número de chasis no ha sido ingresado |

Examples:
|cotizacion |
|33445566   |

Scenario: Maximo valor accesorios
Given se esta cotizando una renovacion de poliza <cotizacion>
When emita la renovacion
And el valor de los accesorios supere el monto permitido
Then mostrar el siguiente mensaje de bloqueo
|mensaje                                                        |
|El valor de los accesorios es mayor al 20% del valor Asegurado |

Examples:
|cotizacion |
|33445566   |

Scenario: Maximo valor accesorios especiales
Given se esta cotizando una renovacion de poliza <cotizacion>
When emita la renovacion
And el valor de los accesorios especiales supere el monto permitido
Then mostrar el siguiente mensaje de bloqueo
|mensaje                                                                                             |
|El valor de los accesorios especiales es mayor al valor Asegurado del vehículo. Por favor verifique.|

Examples:
|cotizacion |
|33445566   |

Scenario: Valor asegurado superior al 50% del valor de la vigencia anterior
Meta: @lote1 @manual
Given se esta cotizando una renovacion de poliza
When emita la renovacion
And el valor asegurado es superior al 50% del valor de la vigencia anterior
Then se debe mostrar el siguiente mensaje
|mensaje                                                                        |
|El Valor del vehículo no se encuentra en los rangos estimados por Suramericana |

Scenario: Valor asegurado inferior al 20% del valor de la vigencia anterior
Meta: @lote1 @manual
Given se esta cotizando una renovacion de poliza
When emita la renovacion
And el valor asegurado es inferior al 20% del valor de la vigencia anterior
Then se debe mostrar el siguiente mensaje
|mensaje                                                                        |
|El Valor del vehículo no se encuentra en los rangos estimados por Suramericana |