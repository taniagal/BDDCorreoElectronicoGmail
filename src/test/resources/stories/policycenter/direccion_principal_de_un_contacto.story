Direccion Principal De Un Contacto

Meta:
@issue #CDSEG-886
@automatizador Nelson Mosquera
@sprint 1

Narrative:
como usuario de PolicyCenter
quiero poder utilizar el modo de entrada para direcciones de contacto


Scenario: Agregar direccion a un contacto.
GivenStories: stories/policycenter/login_policy.story
When quiera editar la informacion del contacto con <tipo_documento> c. <documento>
And se vaya a ingresar la nueva direccion y valide los campos en pantalla
And valide la informacion en los campos
And ingrese los datos de la direccion:
|direccion        |tipo_direccion|departamento|ciudad  |
|CALLE 60B #10-157|Negocio       |ANTIOQUIA   |MEDELLIN|
And se actualiza el contacto
Then en la lista de direcciones agregadas se debe ver la nueva direccion estandarizada

Examples:
|tipo_documento      |documento |
|CEDULA DE CIUDADANIA|1234567892|


Scenario: Agregar direccion a un contacto del mismo tipo.
When quiera editar la informacion del contacto con <tipo_documento> c. <documento>
And se vaya a ingresar la nueva direccion y valide los campos en pantalla
And ingrese los datos de la direccion:
|direccion        |tipo_direccion|departamento|ciudad  |
|CALLE 60B #10-157|Vivienda      |ANTIOQUIA   |MEDELLIN|
And se actualiza el contacto
Then el sistema me debe impedir la repeticion del tipo de direccion y mostrar el mensaje <mensaje>

Examples:
|tipo_documento      |documento |mensaje|
|CEDULA DE CIUDADANIA|1234567891|No se puede ingresar más de una dirección al contacto con el mismo Tipo de dirección|