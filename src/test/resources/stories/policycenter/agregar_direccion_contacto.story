Meta:

Narrative:
As a user
I want to perform an action
So that I can achieve a business goal

Scenario: Ver informacion de las transacciones asociadas al cuenta
GivenStories: stories/policycenter/crear_nuevo_contacto_natural.story
Given que ya tengo un contacto creado
When se vaya a ingresar la nueva direccion y valide los campos en pantalla
And valide la información en los campos


Examples:
|numCuenta|filtroEstado|producto|transaccion|tipo|estado|participante
|S000212121|Completo|Businessowners|85746564938|Emisión|Comprometida|Christine Craft