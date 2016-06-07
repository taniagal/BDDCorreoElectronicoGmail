Informacion Poliza - PA

Meta:

Narrative:
Como usuario de PolicyCenter
Quiero ser capaz de ingresar y visualizar la informacion de la poliza incluyendo el nombre tomador,
incluir un segundo tomador, vigencia de la poliza y la informacion de asesor

@Issue 10900 Policy Info - PA

#Scenario: Visualizacion de los datos de la poliza
#GivenStories: stories/policycenter/login_policy.story
#Given ya se inicio una nueva suscripcion <numeroCuenta>
#When estoy expidiendo una poliza de autos
#Then se debe visalizar los datos del tomador, como son: tipo y numero de identificacion, nombre completo,
#telefono, dirección, vigencia de la poliza (valor por defecto), nombre del agente, fecha de suscripción y
#nombre de la compania aseguradora

#Examples:
#|numeroCuenta  |
#|C000888888    |

#Scenario: Cambiar inicio de vigencia
#Given ya se inicio una nueva suscripcion <numeroCuenta>
#And se visualiza la informacion de la poliza
#When modifique la fecha de inicio de vigencia <tipoPlazo> <fechaInicioVigencia>
#Then esta debe calcular de forma automativa la fecha de fin de vigencia <fechaInicioVigencia>, la cual depende del tipo de plazo

#Examples:
#|numeroCuenta  |fechaInicioVigencia|tipoPlazo |
#|C000888888    |07/15/2016         |6 meses   |

#Scenario: Ingresar segundo tomador
#Given ya se inicio una nueva suscripcion <numeroCuenta>
#And se visualiza la informacion de la poliza
#When adicione un segundo tomador <tipoDocumento>, <primerNombre>, <primerApellido>
#Then debe quedar registrado en la informacion de la poliza

#Examples:
#|numeroCuenta  |tipoDocumento        |primerNombre |primerApellido |
#|C000888888    |CEDULA DE CIUDADANIA |JORGE        |PAISA          |

#Scenario: Seleccionar oficina de radicacion
#Given ya se inicio una nueva suscripcion <numeroCuenta>
#And se visualiza la informacion de la poliza
#When seleccione, digite o busque la oficina de radicacion <oficinaRadicacion>
#Then debe quedar registrada la oficina seleccionada <oficinaRadicacion> en la informacion de la poliza

#Examples:
#|numeroCuenta   |oficinaRadicacion          |
#|C000888888     |Acme High Hazard Insurance |

#Scenario: Validar porcentaje descuento de poliza
#GivenStories: stories/policycenter/login_policy.story
#Given ya se inicio una nueva suscripcion <numeroCuenta>
#And se visualiza la informacion de la poliza
#When ingrese un porcentaje <porcentaje> de poliza superior al 50.00
#Then debe mostrar un mensaje <mensaje> indicando que el porcentaje no puede exceder el 50

#Examples:
#|numeroCuenta   |porcentaje |mensaje                                                                   |
#|C000888888     |60         |Descuento de póliza : El descuento de la póliza no puede ser mayor al 50% |

#Scenario: Validar longitud decimales porcentaje descuento de poliza
#GivenStories: stories/policycenter/login_policy.story
#Given ya se inicio una nueva suscripcion <numeroCuenta>
#And se visualiza la informacion de la poliza
#When ingrese un porcentaje <porcentaje> de poliza con mas de dos enteros y dos decimales
#Then debe mostrar un mensaje <mensaje> indicando que el porcentaje no puede exceder la longitud de dos digitos a
#izquierda o derecha

#Examples:
#|numeroCuenta   |porcentaje     |mensaje                                                                                 |
#|C000888888     |60.325         |Descuento de póliza : no puede tener más de 2 dígitos a la derecha de la coma decimal.  |
#|C000888888     |602.32         |Descuento de póliza : no puede tener más de 2 dígitos a la izquierda de la coma decimal.|

#Scenario: Validar campo poliza financiada
#GivenStories: stories/policycenter/login_policy.story
#Given ya se inicio una nueva suscripcion <numeroCuenta>
#And se visualiza la informacion de la poliza
#When defina una poliza como financiada
#Then se debe poder ingresar el numero de cuotas

#Examples:
#|numeroCuenta |
#|C000888888   |

Scenario: Validar retroactividad en la vigencia de la poliza
GivenStories: stories/policycenter/login_policy.story
Given ya se inicio una nueva suscripcion <numeroCuenta>
And se visualiza la informacion de la poliza
When modifique la fecha de inicio de vigencia <tipoPlazo> <fechaInicioVigencia>
Then se debe cumplir con la retroactividad permitida <fechaInicioVigencia> <mensaje>

Examples:
|numeroCuenta |tipoPlazo |fechaInicioVigencia|mensaje|
|C000888888   |6 meses   |08/01/2016         |Fecha de vigencia : La fecha de vigencia no cumple con el parámetro de retroactividad definido (60 días)|




