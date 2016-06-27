Meta:

Narrative:
Como usuario PolicyCenter
quiero poder actualizar la direccion de un contacto que este asociada a otros contactos
para mantener la informacion actualizada de direcciones

Scenario: consultar direccion de un contacto que tiene una direccion asociada a otro contacto
GivenStories: stories/policycenter/login_policy.story
Given que me encuentro en los contactos de una cuenta <numeroCuenta>
When este en una direccion que esta asociada a otro contacto y la desee editar
Then me debe mostrar la siguiente informacion:
|pais|departamento|ciudad|direccion|codigoPostal|tipoDeDireccion|descripcion
|Estados Unidos|California|SAN FRANCISCO|CRA 65 # 48-162|91007|Vivienda|Created by the Address Builder with code 0
Examples:
|numeroCuenta
|C000484848

Scenario: actualizar direccion solo ingresando campos obligatorios
GivenStories: stories/policycenter/login_policy.story
Given que me encuentro en los contactos de una cuenta <numeroCuenta>
When este en una direccion que esta asociada a otro contacto y la desee editar
And ingrese solo informacion obligatoria
Then me debe mostrar la siguiente informacion:
|pais|departamento|ciudad|direccion|codigoPostal|tipoDeDireccion|descripcion
|Estados Unidos|California|SAN FRANCISCO|CRA 65 # 48-162|91007|Vivienda|Created by the Address Builder with code 0
Examples:
|numeroCuenta
|C000484848

Scenario: visualizar los contactos que hacen uso de la direccion de otro contacto
GivenStories: stories/policycenter/login_policy.story
Given que me encuentro en los contactos de una cuenta <numeroCuenta>
When quiera actualizar la direccion de un contacto que tiene otros contactos que la usan
Then me debe listar la informacion de los contactos que usan la direccion



