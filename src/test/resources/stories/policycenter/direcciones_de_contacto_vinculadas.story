Meta:

Narrative:
Como usuario PolicyCenter
quiero poder actualizar la direccion de un contacto que este asociada a otros contactos
para mantener la informacion actualizada de direcciones

Scenario: consultar direccion de un contacto que tiene una direccion asociada a otro contacto
GivenStories: stories/policycenter/login_policy.story
Given que me encuentro en las direcciones de un contacto asociado a una cuenta <numeroCuenta>
When este en una direccion que esta asociada a otro contacto y la desee editar
Then me debe mostrar la siguiente informacion:

Examples:
|numeroCuenta|
|C000484848|
