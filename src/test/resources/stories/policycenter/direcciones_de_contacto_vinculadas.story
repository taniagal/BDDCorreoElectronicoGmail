Meta:

Narrative:
Como usuario PolicyCenter
quiero poder actualizar la direccion de un contacto que este asociada a otros contactos
para mantener la informacion actualizada de direcciones

Scenario: Edicion del campo direccion - validar longitud maxima de 200 caracteres en Detalle de contacto
GivenStories: stories/policycenter/login_policy.story
Given que me encuentro en los contactos de una cuenta <numeroCuenta>
When ingrese a editar la direccion por <direccion>
Then el campo direccion no debe permitir ingresar mas de 200 caracteres <direccionOk>

Examples:
|numeroCuenta|direccion|direccionOk|
|C000484848|CRA 65 # 48-162CRA 65 # 48-162CRA 65 # 48-162CRA 65 # 48-162CRA 65 # 48-162CRA 65 # 48-162 CRA 65 # 48-162CRA 65 # 48-162CRA 65 # 48-162CRA 65 # 48-162CRA 65 # 48-162CRA 65 # 48-162162CRA 65 # 48-162CA|200|

Scenario: Edicion del campo direccion - validar longitud maxima de 200 caracteres en Detalle de contacto, Direcciones
Given que me encuentro en los contactos de una cuenta <numeroCuenta>
When ingrese a editar la direccion por <direccion> en detalle contacto pestaña direcciones
Then el campo direccion no debe permitir ingresar mas de 200 caracteres <direccionOk>

Examples:
|numeroCuenta|direccion|direccionOk|
|C000484848|CRA 65 # 48-162CRA 65 # 48-162CRA 65 # 48-162CRA 65 # 48-162CRA 65 # 48-162CRA 65 # 48-162 CRA 65 # 48-162CRA 65 # 48-162CRA 65 # 48-162CRA 65 # 48-162CRA 65 # 48-162CRA 65 # 48-162162CRA 65 # 48-162OT|200|

Scenario: Edicion del campo Pais, Departamento y Ciudad
GivenStories: stories/policycenter/login_policy.story
Given que me encuentro en los contactos de una cuenta <numeroCuenta>
When ingrese a editar la direccion en ingrese el pais <pais>
Then el campo departamento debe tener el valor <departamento>
And el campo ciudad debe tener el valor <ciudad>

Examples:
|numeroCuenta|pais|departamento|ciudad|
|C000484848|Colombia|<ninguno>|<ninguno>|

Scenario: consultar direccion de un contacto que tiene una direccion asociada a otro contacto
Given que me encuentro en los contactos de una cuenta <numeroCuenta>
When este en una direccion que esta asociada a otro contacto y la desee editar
Then me debe mostrar la siguiente informacion:
|pais|departamento|ciudad|direccion|codigoPostal|tipoDeDireccion|descripcion|
|Estados Unidos|California|SAN FRANCISCO|CRA 65 # 48-162|91007|Vivienda|Created by the Address Builder with code 0|
Examples:
|numeroCuenta|
|C000484848|

Scenario: actualizar direccion solo ingresando campos obligatorios
Given que me encuentro en los contactos de una cuenta <numeroCuenta>
When ingrese solo informacion obligatoria
Then me debe mostrar esta informacion:
|pais          |departamento|ciudad       |direccion      |codigoPostal|tipoDeDireccion|descripcion|
|Estados Unidos|California  |SAN FRANCISCO|CRA 65 # 48-162|            |Vivienda       |           |
Examples:
|numeroCuenta|
|C000484848|

Scenario: visualizar los contactos que hacen uso de la direccion de otro contacto
Given que me encuentro en los contactos de una cuenta <numeroCuenta>
When quiera actualizar la direccion de un contacto que tiene otros contactos que la usan
Then me debe validar la informacion de los contactos que usan esa direccion:
|nombre|primaria|telefono|correo|
|Speedy Glass Repair|Sí||0010@guidewire.com|
|RICARDO GIRALDO|Sí|408-2211|0019@guidewire.com|
|CARLOS PERALTA|Sí|300-685-9674|0037@guidewire.com|
Examples:
|numeroCuenta|
|C000484848|




