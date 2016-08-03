Informacion Poliza Pa

Meta:

@issue SUGWUSC-10900 Policy Info - PA

Narrative:
Como usuario de PolicyCenter
Quiero ser capaz de ingresar y visualizar la informacion de la poliza incluyendo el nombre tomador,
incluir un segundo tomador, vigencia de la poliza y la informacion de asesor

Scenario: Visualizacion de los datos de la poliza
GivenStories: stories/policycenter/login_policy.story
Given ya se inicio una nueva suscripcion <numeroCuenta>
When estoy expidiendo una poliza de autos
And seleccione la organizacion <organizacion>
And seleccione el canal <canal>
And seleccione el producto para expedir la poliza
Then se debe visalizar los datos del tomador, como son: tipo y numero de identificacion, nombre completo,
telefono, direccion, vigencia de la poliza (valor por defecto), nombre del agente, fecha de suscripcion y
nombre de la compania aseguradora

Examples:
|numeroCuenta  |organizacion|canal            |
|C000888888    |Sura        |Canal Tradicional|

Scenario: Cambiar inicio de vigencia
Given ya se inicio una nueva suscripcion <numeroCuenta>
And se visualiza la informacion de la poliza
When seleccione la organizacion <organizacion>
And seleccione el canal <canal>
And seleccione el producto para expedir la poliza
And modifique la fecha de inicio de vigencia <tipoPlazo> <fechaInicioVigencia>
Then esta <fechaInicioVigencia> debe calcular de forma automatica la fecha de fin de vigencia, la cual depende del tipo de plazo


Examples:
|numeroCuenta  |organizacion|canal            |fechaInicioVigencia|tipoPlazo |
|C000888888    |Sura        |Canal Tradicional|07/15/2016         |6 meses   |

Scenario: Ingresar segundo tomador
Given ya se inicio una nueva suscripcion <numeroCuenta>
And se visualiza la informacion de la poliza
When seleccione la organizacion <organizacion>
And seleccione el canal <canal>
And seleccione el producto para expedir la poliza
And adicione un segundo tomador <tipoDocumento>, <primerNombre>, <primerApellido>
Then debe quedar registrado en la informacion de la poliza

Examples:
|numeroCuenta  |organizacion|canal            |tipoDocumento        |primerNombre |primerApellido |
|C000888888    |Sura        |Canal Tradicional|CEDULA DE CIUDADANIA |JORGE        |PAISA          |

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

Scenario: Validar porcentaje descuento de poliza
Given ya se inicio una nueva suscripcion <numeroCuenta>
And se visualiza la informacion de la poliza
When seleccione la organizacion <organizacion>
And seleccione el canal <canal>
And seleccione el producto para expedir la poliza
And ingrese un porcentaje <porcentaje> de poliza superior al 50.00
Then debe mostrar un mensaje <mensaje> indicando que el porcentaje no puede exceder el 50

Examples:
|numeroCuenta   |organizacion|canal            |porcentaje |mensaje                                                                          |
|C000888888     |Sura        |Canal Tradicional|60         |Descuento póliza : El descuento de la póliza debe estar en un rango de 0% a 50%. |
|C000888888     |Sura        |Canal Tradicional|abc        |Descuento póliza : debe ser un valor numérico.                                   |


Scenario: Validar longitud decimales porcentaje descuento de poliza
Given ya se inicio una nueva suscripcion <numeroCuenta>
And se visualiza la informacion de la poliza
When seleccione la organizacion <organizacion>
And seleccione el canal <canal>
And seleccione el producto para expedir la poliza
And ingrese un porcentaje <porcentaje> de poliza con mas de dos enteros y dos decimales
Then debe mostrar un mensaje <mensaje> indicando que el porcentaje no puede exceder la longitud de dos digitos a izquierda o derecha

Examples:
|numeroCuenta   |organizacion|canal            |porcentaje     |mensaje                                                                                 |
|C000888888     |Sura        |Canal Tradicional|20.325         |Descuento póliza : El descuento de la póliza puede tener máximo 2 cifras decimales.     |

Scenario: Validar campo poliza financiada
Given ya se inicio una nueva suscripcion <numeroCuenta>
And se visualiza la informacion de la poliza
When seleccione la organizacion <organizacion>
And seleccione el canal <canal>
And seleccione el producto para expedir la poliza
And defina una poliza como financiada <organizacionDetalle> <canalDetalle> <tipoPoliza>
Then se debe poder ingresar el numero de cuotas

Examples:
|numeroCuenta |organizacion|canal            |organizacionDetalle|canalDetalle     |tipoPoliza|
|C000888888   |Sura        |Canal Tradicional|Sura               |Canal Tradicional|PPAutos   |


Scenario: Validar retroactividad en la vigencia de la poliza
Given ya se inicio una nueva suscripcion <numeroCuenta>
And se visualiza la informacion de la poliza
When seleccione la organizacion <organizacion>
And seleccione el canal <canal>
And seleccione el producto para expedir la poliza
And modifique la fecha de inicio de vigencia <organizacionDetalle> <canalDetalle> <tipoPoliza> <tipoPlazo> <fechaInicioVigencia>
Then se debe cumplir con la retroactividad permitida <mensaje>

Examples:
| numeroCuenta | organizacion | canal      | organizacionDetalle | canalDetalle | tipoPoliza | tipoPlazo | fechaInicioVigencia | mensaje                                                                              |
| C000888888   | Bancolombia  | Televentas | Bancolombia         | Televentas   | PPAutos    | 6 meses   | 01/01/2016          | La fecha de vigencia no cumple con el parámetro de retroactividad definido (60 días) |
