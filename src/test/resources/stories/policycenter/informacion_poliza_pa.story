Meta:
@lote4
@tag equipo: 5
@Sprint 2

Narrative:
Como usuario de PolicyCenter
Quiero ser capaz de ingresar y visualizar la informacion de la poliza incluyendo el nombre tomador,
incluir un segundo tomador, vigencia de la poliza y la informacion de asesor

Scenario: Cambiar inicio de vigencia
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza:
|cuenta    |producto|tipoPoliza |
|C000888888|Autos   |Individual |
When valla a la informacion de la poliza
And modifique la fecha de inicio de vigencia <tipoPlazo> <fechaInicioVigencia>
Then la fecha fin de vigencia <fechaFinVigencia> se debe calcular de forma automatica, la cual depende del tipo de plazo

Examples:
|numCuenta     |fechaInicioVigencia|fechaFinVigencia|tipoPlazo |
|C000888888    |30/11/2016         |30/11/2017      |Anual     |

Scenario: Ingresar segundo tomador
Given estoy cotizando una poliza:
|cuenta    |producto|tipoPoliza |
|C000888888|Autos   |Individual |
When valla a la informacion de la poliza
And adicione un segundo tomador <tipoDocumento>, <primerNombre>, <primerApellido>
Then debe quedar registrado en la informacion de la poliza

Examples:
|numCuenta  |tipoDocumento        |primerNombre |primerApellido |
|C000888888 |CEDULA DE CIUDADANIA |JORGE        |PAISA          |

Scenario: Validar porcentaje descuento de poliza
Given estoy cotizando una poliza:
|cuenta    |producto|tipoPoliza |
|C000888888|Autos   |Individual |
When valla a la informacion de la poliza
And ingrese un porcentaje <porcentaje> de poliza superior al 50.00
Then debe mostrar un mensaje <mensaje> indicando que el porcentaje no puede exceder el 50

Examples:
|numCuenta      |porcentaje |mensaje                                                                          |
|C000888888     |60         |Descuento póliza : El descuento de la póliza debe estar en un rango de 0% a 50%. |
|C000888888     |abc        |Descuento póliza : debe ser un valor numérico.                                   |

Scenario: Validar longitud decimales porcentaje descuento de poliza
Given estoy cotizando una poliza:
|cuenta    |producto|tipoPoliza |
|C000888888|Autos   |Individual |
When valla a la informacion de la poliza
And ingrese un porcentaje <porcentaje> de poliza con mas de dos enteros y dos decimales
Then debe mostrar un mensaje <mensaje> indicando que el porcentaje no puede exceder la longitud de dos digitos a
izquierda o derecha

Examples:
|numCuenta      |porcentaje     |mensaje                                                                                 |
|C000888888     |20,325         |Descuento póliza : El descuento de la póliza puede tener máximo 2 cifras decimales.     |

Scenario: No deseo de financiacion de poliza
Given estoy cotizando una poliza:
|cuenta    |producto|tipoPoliza |
|C000888888|Autos   |Individual |
When valla a la informacion de la poliza
And no indique que deseo financiar la poliza
Then no se debe habilitar la opcion de numero de cuotas

Examples:
|numCuenta    |
|C000888888   |

Scenario: Validar retroactividad en la vigencia de la poliza
Given estoy cotizando una poliza:
|cuenta    |producto|tipoPoliza |
|C000888888|Autos   |Individual |
When valla a la informacion de la poliza
And modifique la fecha de inicio de vigencia <tipoPlazo> <fechaInicioVigencia>
Then se debe cumplir con la retroactividad permitida <mensaje>

Examples:
|numCuenta  |tipoPlazo |fechaInicioVigencia |mensaje                                                                                     |
|C000888888 |6 meses   |01/01/2016          |La fecha inicio de vigencia no cumple con el parámetro de retroactividad definido (60 días) |

Scenario: Seleccionar oficina de radicacion
Meta:
@manual
Given ya se inicio una nueva suscripcion
And se puede visualizar la informacion de la poliza
When seleccione, digite o busque la oficina de radicacion <oficinaRadicacion>
Then debe quedar registrada la oficina seleccionada <oficinaRadicacion> en la informacion de la poliza

Examples:
|numeroCuenta   |oficinaRadicacion          |
|C000888888     |Acme High Hazard Insurance |
