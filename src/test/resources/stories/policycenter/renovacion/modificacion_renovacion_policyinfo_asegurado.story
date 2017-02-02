Meta:
@lote4
@tag equipo: 5
@Sprint 8

Narrative:
Como usuario de  policy center con el perfil X
Quiero ser capaz de actualizar  o realizar modificaciones de datos de una poliza en el proceso de renovacion de una poliza

Scenario: adicionar segundo tomador - Policy info
GivenStories: stories/policycenter/login_policy.story
Given estoy editando la renovacion de una poliza <cotizacion>
When desee adicionar un segundo tomador
Then debo poder adicionar un segundo tomador
|tomador             |tipoDocumento       |numeroDocumento|
|FRANK RAMIREZ ALZATE|CEDULA DE CIUDADANIA|123456         |

Examples:
|cotizacion |
|32112331   |

Scenario: editar tomador principal - Policy info
Given estoy editando la renovacion de una poliza <cotizacion>
When trate de eliminar o editar el primer tomador
Then no se debe permitir editar o eliminar el primer tomador

Examples:
|cotizacion |
|32112331   |

Scenario: cambiar tipo de plazo - Policy info
Given estoy editando la renovacion de una poliza <cotizacion>
When cambie el tipo de plazo
|tipoPlazo|
|6 meses  |
Then se debe recalcular el valor de la fecha fin de vigencia de la poliza a partir del plazo inidicado,
tomando como fecha inicial la fecha de inicio de vigencia del periodo a renovar
|fechaInicioVigencia|fechaFinVigencia|
|18/09/2017         |18/03/2018      |

Examples:
|cotizacion |
|32112331   |

Scenario: validar campos no editables - Policy info
Given estoy editando la renovacion de una poliza <cotizacion>
When me encuentre en la pantalla de Informacion de poliza
Then no se debe permitir editar la siguiente informacion: Organizacion de venta, tipo de canal,
tipo de poliza, tasa a partir de la fecha, fecha inicio de vigencia, fecha fin de vigencia

Examples:
|cotizacion |
|32112331   |

Scenario: validar que no se pueda modificar el asegurado
Given estoy editando la renovacion de una poliza <cotizacion>
When me encuentre en la pantalla de Asegurados
Then no debo poder modificar o adicionar un asegurado

Examples:
|cotizacion |
|32112331   |

Scenario: intencion de financiacion
Meta:
@manual
Given estoy editando la renovacion de una poliza
When estoy en la pantalla de Informacion de poliza
Then debo poder modificar la opcion de financiacion en el campo "Poliza financiada",
Numero de cuotas en el caso que indique que la poliza si es financiada y Tipo de plazo

Scenario: mostrar mensaje de advertencia de intencion de financiacion
Meta:
@manual
Given estoy editando la renovacion de una poliza
When estoy en la pantalla de Informacion de poliza
And indique que SI deseo financiar la poliza y seleccione la opcion siguiente
Then se debe  mostrar el siguiente mensaje "La financiacion de la poliza esta sujeta a aprobacion
por parte del area de financiacion" como advertencia



