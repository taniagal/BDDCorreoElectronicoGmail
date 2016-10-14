Resumen Cuenta

Meta:

@issue #CDSEG-666
@tag automator: diego_cardona_acevedo
@Sprint 2

Narrative:
Como usuario PolicyCenter
Quiero poder ver el resumen de la cuenta de una persona juridica o natural, teniendo la posibilidad de editar dicha informacion

Scenario: Mostrar resumen de la cuenta de persona juridica
GivenStories: stories/policycenter/login_policy.story
Given estoy en una cuenta <numCuenta>
When ingrese al resumen de la cuenta
Then puedo visualizar el resumen de la cuenta seleccionada de tipo persona juridica, el listado de actividades, vigencias
de las polizas asociadas a la cuenta y transacciones pendientes de las polizas asociadas a la cuenta

Examples:
|numCuenta  |
|C010478975 |

Scenario: Mostrar resumen de la cuenta de persona natural
Given estoy en una cuenta <numCuenta>
When ingrese al resumen de la cuenta
Then puedo visualizar el resumen de la cuenta seleccionada de tipo persona natural, el listado de actividades, vigencias
de las polizas asociadas a la cuenta y transacciones pendientes de las polizas asociadas a la cuenta

Examples:
|numCuenta  |
|C000888888 |

Scenario: Editar cuenta de tipo persona natural
Given estoy en el resumen de una cuenta <numCuenta> de tipo persona natural <tipoCuenta>
When ingrese a editar dicha cuenta
Then se deben habilitar los siguientes campos: primer nombre, segundo nombre, primer apellido, segundo apellido,
estado civil, profesion, fecha de fallecimiento, causa de fallecimiento, tipo familia, dependientes economicos,
correo electronico primario, correo electronico secundario, tipo de telefono, telefono primario, direccion

Examples:
|tipoCuenta|numCuenta  |
|Personal  |C000888888 |

Scenario: Editar cuenta de tipo persona juridica
Given estoy en el resumen de una cuenta <numCuenta> de tipo persona juridica <tipoCuenta>
When ingrese a editar dicha cuenta
Then se deben habilitar los siguientes campos: razon social, nombre comercial, actividad economica, numero de empleados,
valor de activos, ventas anualues, telefono de la oficina, correo electronico primario, correo electronico secundario, direccion

Examples:
|tipoCuenta|numCuenta  |
|Compañía  |C010478975 |

Scenario: Editar pais
Given estoy en el resumen de una cuenta <numCuenta> de tipo persona natural <tipoCuenta>
When edite el campo pais <pais>
Then se debe cargar el valor "<ninguno>" en el campo departamento <departamento>

Examples:
|tipoCuenta|numCuenta  |pais         |departamento|
|Personal  |C000888888 |Colombia     |            |

Scenario: Editar departamento
Given estoy en el resumen de una cuenta <numCuenta> de tipo persona juridica <tipoCuenta>
When edite el campo departamento <pais> <departamento>
Then se debe cargar el valor por defecto "<ninguno>" en el campo ciudad <ciudad>

Examples:
|tipoCuenta|numCuenta  |pais        |departamento  |ciudad      |
|Compañía  |C010478975 |Colombia    |Antioquia     |            |

Scenario: Editar cuenta - Direccion estandarizada
Meta:
@Manual
Given estoy en el resumen de una cuenta <numCuenta> de tipo persona juridica <tipoCuenta>
When ingrese a editar la direccion de la cuenta e indique una direccion <direccion> que se pueda estandarizar
Then se debe almacenar la direccion de acuerdo a la estandarizacion dada

Examples:
|tipoCuenta|numCuenta  |direccion       |
|Compañía  |C010478975 |CRA 65 # 40 - 50|

Scenario: Editar cuenta - Direccion no estandarizada
Meta:
@Manual
Given estoy en el resumen de una cuenta <numCuenta> de tipo persona juridica <tipoCuenta>
When ingrese a editar la direccion de la cuenta e indique una direccion <direccion> que no se pueda estandarizar
Then se debe almacenar la direccion como la ingreso el usuario

Examples:
|tipoCuenta|numCuenta  |direccion       |
|Compañía  |C010478975 |CRA 65 # 40 - 50|

Scenario: Validar informacion oculta en resumen de la cuenta de persona natural
Given estoy en una cuenta <numCuenta>
When ingrese al resumen de la cuenta
Then la informacion de actividades actuales, terminos de la poliza y transacciones de la poliza pendientes deben estar
ocultos

Examples:
|numCuenta  |
|C000888888 |
