Meta:

Narrative:
como usuario de PolicyCenter
quiero poder utilizar el modo de entrada para direcciones de contacto


Scenario: Agregar direccion a un contacto

GivenStories: stories/policycenter/crear_nuevo_contacto_natural.story
Given que ya tengo un contacto creado
When se vaya a ingresar la nueva direccion y valide los campos en pantalla
And valide la informacion en los campos
And ingreso la informacion de direccion <direccion>, <departamento>, <ciudad>, tipo de direccion <tipoDireccion>
And se actualiza el contacto
Then en la lista de direcciones agregadas se debe ver la nueva direccion <tipoDireccion>


Examples:
|tipoDocumento         |numeroDeDocumento  |primerNombre  |primerApellido|tipoDireccion  |direccion        |departamento|ciudad  |
|CEDULA DE CIUDADANIA  |564-36-5489        |SASHA         |AKERMAN       |Negocio        |CALLE 60B #10-157|Antioquia   |Medellin|