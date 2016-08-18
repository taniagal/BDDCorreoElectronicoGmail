Meta:
@issue #SUGWUSC-14978

Narrative:
como usuario de PolicyCenter
quiero poder utilizar el modo de entrada para direcciones de contacto


Scenario: Agregar direccion a un contacto.
GivenStories: stories/policycenter/login_policy.story
When quiera editar la informacion del contacto con <tipo_documento> c. <documento>
And se vaya a ingresar la nueva direccion y valide los campos en pantalla
And valide la informacion en los campos
And ingreso la informacion de direccion <direccion>, <departamento>, <ciudad>, tipo de direccion <tipoDireccion>
And se actualiza el contacto
Then en la lista de direcciones agregadas se debe ver la nueva direccion <direccion> estandarizada

Examples:
|tipo_documento      |documento |tipoDireccion       |direccion        |departamento|ciudad  |
|CEDULA DE CIUDADANIA|1234567892|DIRECCION DE TRABAJO|CALLE 60B #10-157|ANTIOQUIA   |MEDELLIN|


Scenario: Agregar direccion a un contacto del mismo tipo.
When quiera editar la informacion del contacto con <tipo_documento> c. <documento>
And se vaya a ingresar la nueva direccion y valide los campos en pantalla
And ingreso la informacion de direccion <direccion>, <departamento>, <ciudad>, tipo de direccion <tipoDireccion>
And se actualiza el contacto
Then el sistema me debe impedir la repeticion del tipo de direccion y mostrar el mensaje <mensaje>

Examples:
|tipo_documento      |documento |tipoDireccion|direccion      |departamento|ciudad  |mensaje|
|CEDULA DE CIUDADANIA|1234567891|DIRECCION DE RESIDENCIA|CRA 60B #10-157|ANTIOQUIA   |MEDELLIN|No se puede ingresar más de una dirección al contacto con el mismo Tipo de dirección|