Informacion Poliza Pa

Meta: @lote3

@issue #CDSEG-995
@tag equipo: 5
@local
@Sprint 2

Narrative:
Como usuario de PolicyCenter
Quiero ser capaz de ingresar y visualizar la informacion de la poliza incluyendo el nombre tomador,
incluir un segundo tomador, vigencia de la poliza y la informacion de asesor

Scenario: Visualizacion de los datos de la poliza
GivenStories: stories/policycenter/login_policy.story
Given que voy a buscar la cuenta <numCuenta>
When estoy expidiendo una poliza de autos
And seleccione el producto para expedir la poliza
Then se debe visalizar los datos del tomador, como son: tipo y numero de identificacion, nombre completo,
telefono, direccion, vigencia de la poliza (valor por defecto), nombre del agente, fecha de suscripcion y
nombre de la compania aseguradora

Examples:
|numCuenta     |
|C000888888    |

Scenario: Cambiar inicio de vigencia
Given que voy a buscar la cuenta <numCuenta>
And se visualiza la informacion de la poliza
When seleccione el producto para expedir la poliza
And seleccione la organizacion, el canal y el tipo de poliza:
|organizacion   |canal              |tipoPoliza |
|Sura           |Canal Tradicional  |Individual    |
And modifique la fecha de inicio de vigencia <tipoPlazo> <fechaInicioVigencia>
Then la fecha fin de vigencia <fechaFinVigencia> se debe calcular de forma automatica, la cual depende del tipo de plazo

Examples:
|numCuenta     |fechaInicioVigencia|fechaFinVigencia|tipoPlazo |
|C000888888    |30/11/2016         |30/11/2017      |Anual     |

Scenario: Ingresar segundo tomador
Given que voy a buscar la cuenta <numCuenta>
And se visualiza la informacion de la poliza
When seleccione el producto para expedir la poliza
And seleccione la organizacion, el canal y el tipo de poliza:
|organizacion   |canal              |tipoPoliza |
|Sura           |Canal Tradicional  |Individual    |
And adicione un segundo tomador <tipoDocumento>, <primerNombre>, <primerApellido>
Then debe quedar registrado en la informacion de la poliza

Examples:
|numCuenta  |tipoDocumento        |primerNombre |primerApellido |
|C000888888 |CEDULA DE CIUDADANIA |JORGE        |PAISA          |

Scenario: Validar porcentaje descuento de poliza
Given que voy a buscar la cuenta <numCuenta>
And se visualiza la informacion de la poliza
When seleccione el producto para expedir la poliza
And seleccione la organizacion, el canal y el tipo de poliza:
|organizacion   |canal              |tipoPoliza |
|Sura           |Canal Tradicional  |Individual    |
And ingrese un porcentaje <porcentaje> de poliza superior al 50.00
Then debe mostrar un mensaje <mensaje> indicando que el porcentaje no puede exceder el 50

Examples:
|numCuenta      |porcentaje |mensaje                                                                          |
|C000888888     |60         |Descuento póliza : El descuento de la póliza debe estar en un rango de 0% a 50%. |
|C000888888     |abc        |Descuento póliza : debe ser un valor numérico.                                   |

Scenario: Validar longitud decimales porcentaje descuento de poliza
Given que voy a buscar la cuenta <numCuenta>
And se visualiza la informacion de la poliza
When seleccione el producto para expedir la poliza
And seleccione la organizacion, el canal y el tipo de poliza:
|organizacion   |canal              |tipoPoliza |
|Sura           |Canal Tradicional  |Individual    |
And ingrese un porcentaje <porcentaje> de poliza con mas de dos enteros y dos decimales
Then debe mostrar un mensaje <mensaje> indicando que el porcentaje no puede exceder la longitud de dos digitos a
izquierda o derecha

Examples:
|numCuenta      |porcentaje     |mensaje                                                                                 |
|C000888888     |20,325         |Descuento póliza : El descuento de la póliza puede tener máximo 2 cifras decimales.     |

Scenario: No deseo de financiacion de poliza
Given que voy a buscar la cuenta <numCuenta>
And se visualiza la informacion de la poliza
When seleccione el producto para expedir la poliza
And seleccione la organizacion, el canal y el tipo de poliza:
|organizacion   |canal              |tipoPoliza |
|Sura           |Canal Tradicional  |Individual    |
And no indique que deseo financiar la poliza
Then no se debe habilitar la opcion de numero de cuotas

Examples:
|numCuenta    |
|C000888888   |

Scenario: Validar retroactividad en la vigencia de la poliza
Given que voy a buscar la cuenta <numCuenta>
And se visualiza la informacion de la poliza
When seleccione el producto para expedir la poliza
And seleccione la organizacion, el canal y el tipo de poliza:
|organizacion   |canal              |tipoPoliza |
|Sura           |Canal Tradicional  |Individual    |
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