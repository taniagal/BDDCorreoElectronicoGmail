Resumen Cuenta

Meta: @lote1

@issue #CDSEG-666
@tag team: 5
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
And la informacion de actividades actuales, terminos de la poliza y transacciones de la poliza pendientes deben estar
visibles
And ingrese a editar dicha cuenta
And se deben habilitar los siguientes campos: razon social, nombre comercial, actividad economica, numero de empleados,
valor de activos, ventas anualues, telefono de la oficina, correo electronico primario, correo electronico secundario, direccion
And edite el campo departamento <pais> <departamento>
And se debe cargar el valor por defecto "<ninguno>" en el campo ciudad <ciudad>

Examples:
|tipoCuenta|numCuenta  |pais        |departamento  |ciudad      |
|Compañía  |C010478975 |Colombia    |Antioquia     |            |

Scenario: Mostrar resumen de la cuenta de persona natural
Given estoy en una cuenta <numCuenta>
When ingrese al resumen de la cuenta
Then puedo visualizar el resumen de la cuenta seleccionada de tipo persona natural, el listado de actividades, vigencias
de las polizas asociadas a la cuenta y transacciones pendientes de las polizas asociadas a la cuenta
And ingrese a editar dicha cuenta
And se deben habilitar los siguientes campos: primer nombre, segundo nombre, primer apellido, segundo apellido,
estado civil, profesion, fecha de fallecimiento, causa de fallecimiento, tipo familia, dependientes economicos,
correo electronico primario, correo electronico secundario, tipo de telefono, telefono primario, direccion
And edite el campo pais <pais>
And se debe cargar el valor "<ninguno>" en el campo departamento <departamento>
Examples:
|numCuenta  |tipoCuenta|pais    |departamento|
|C000888888 |Personal  |Colombia|            |

Scenario: Editar cuenta - Direccion estandarizada
Meta:
@manual
Given que estoy en el resumen de una cuenta <numCuenta> de tipo persona juridica <tipoCuenta>
When ingrese a editar la direccion de la cuenta e indique una direccion <direccion> que se pueda estandarizar
Then se debe almacenar la direccion de acuerdo a la estandarizacion dada

Examples:
|tipoCuenta|numCuenta  |direccion       |
|Compañía  |C010478975 |CRA 65 # 40 - 50|

Scenario: Editar cuenta - Direccion no estandarizada
Meta:
@manual
Given que estoy en el resumen de una cuenta <numCuenta> de tipo persona juridica <tipoCuenta>
When ingrese a editar la direccion de la cuenta e indique una direccion <direccion> que no se pueda estandarizar
Then se debe almacenar la direccion como la ingreso el usuario

Examples:
|tipoCuenta|numCuenta  |direccion       |
|Compañía  |C010478975 |CRA 65 # 40 - 50|