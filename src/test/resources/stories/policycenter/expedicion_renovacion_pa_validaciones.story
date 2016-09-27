Expedicion Renovacion Pa Validaciones

Meta:

Narrative:
Como usuario de PolicyCenter
Quiero ser capaz de renovar de forma manual y automaticamente las politicas de auto personal.

Scenario: Validar Motor y Chasis
GivenStories: stories/policycenter/login_policy.story
Given se esta cotizando una renovacion de poliza <cotizacion>
When emita la renovacion
And no se tenga chasis ni motor ingresados
Then se debe mostrar el siguiente mensaje
|mensaje                                  |
|El número de chasis no ha sido ingresado |
|El número de motor no ha sido ingresado  |

Examples:
|cotizacion |
|0000474343 |

Scenario: Maximo valor accesorios y accesorios especiales
Given se esta cotizando una renovacion de poliza <cotizacion>
When emita la renovacion
And el valor de los accesorios y accesorios especiales superen el monto permitido
Then se debe mostrar el siguiente mensaje
|mensaje                                                                                             |
|El valor de los accesorios es mayor al 20% del valor Asegurado                                      |
|El valor de los accesorios especiales es mayor al valor Asegurado del vehículo. Por favor verifique.|

Examples:
|cotizacion |
|0000474343 |

Scenario: Valor asegurado superior al 50% del valor de la vigencia anterior
Given se esta cotizando una renovacion de poliza <cotizacion>
When emita la renovacion
And el valor asegurado es superior al 50% del valor de la vigencia anterior
Then se debe mostrar el siguiente mensaje
|mensaje                                                                        |
|El Valor del vehículo no se encuentra en los rangos estimados por Suramericana |

Examples:
|cotizacion |
|0000474343 |

Scenario: Valor asegurado inferior al 20% del valor de la vigencia anterior
Given se esta cotizando una renovacion de poliza <cotizacion>
When emita la renovacion
And el valor asegurado es inferior al 20% del valor de la vigencia anterior
Then se debe mostrar el siguiente mensaje
|mensaje                                                                        |
|El Valor del vehículo no se encuentra en los rangos estimados por Suramericana |

Examples:
|cotizacion |
|0000474343 |