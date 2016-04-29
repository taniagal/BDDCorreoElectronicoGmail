Narrative:
Como usuario
Quiero poder ver el detalle de la informacion de contactos en policy center


Scenario: ver informacion detallada de un contacto tipo persona natural.

Given que me encuentro en el sistema de policy center como usuario <user> , contrasena <pass> y Pais <country> y
 que tengo un contacto tipo persona natural
When quiera ver informacion detallada del contacto  con nombre <primer_nombre> y con apellido <primer_apellido>
Then se debe ver minimo la siguiente informacion: Primer nombre, Segundo nombre, Primer apellido, Segundo apellido,
Tipo de documento, Numero de documento, Sexo,Fecha de nacimiento, Fecha de fallecimiento, Causa de fallecimiento,
Profesion, Estado civil, Tipo familia,  Telefono primario, Telefono celular y Correo electronico primario

Examples:
user |pass |country  |primer_nombre    |primer_apellido |
su   |gw   |Colombia |HEGIGI           |OIUIOIO        |


Scenario: ver informacion detallada de un contacto tipo persona juridica.

Given que me encuentro en el sistema de policy center como usuario <user> , contrasena <pass> y Pais <country> y
 que tengo un contacto tipo persona juridica
When quiera ver informacion detallada del contacto con nombre empresa <nombre_empresa>
Then se debe ver minimo la siguiente informacion: Razon social, Nombre comercial, Tipo de documento, Número de
documento, Actividad economica, Numero de empleados, Valor de activos, ventas anuales, Telefono de la oficina, Fax,
Correo electronico primario

Examples:
user |pass |country  |nombre_empresa    |
su   |gw   |Colombia |Empresa prueba    |