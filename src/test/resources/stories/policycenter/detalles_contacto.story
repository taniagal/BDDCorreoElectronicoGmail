Narrative:
Como usuario
Quiero poder ver el detalle de la informacion de contactos en policy center


Scenario: ver informacion detallada de un contacto tipo persona natural.
GivenStories: stories/policycenter/crear_nuevo_contacto_natural.story
Given Se tiene y se ha consultado la informacion detallada de un contacto tipo persona natural
When quiera ver informacion detallada del contacto  con nombre <primer_nombre> y con apellido <primer_apellido>
Then se debe ver minimo la siguiente informacion: Primer nombre, Segundo nombre, Primer apellido, Segundo apellido,
Tipo de documento, Numero de documento, Sexo,Fecha de nacimiento, Fecha de fallecimiento, Causa de fallecimiento,
Profesion, Estado civil, Tipo familia,  Telefono primario, Telefono celular y Correo electronico primario

Examples:
|primer_nombre    |primer_apellido |
|ANA              |AKERMAN         |


Scenario: ver informacion detallada de un contacto tipo persona juridica.
GivenStories: stories/policycenter/crear_nuevo_contacto_juridico.story
Given Se ha consultado la informacion detallada de un contacto tipo persona juridica
When quiera ver informacion detallada del contacto con nombre empresa <nombre_empresa>
Then se debe ver minimo la siguiente informacion: Razon social, Nombre comercial, Tipo de documento, Numero de
documento, Actividad economica, Numero de empleados, Valor de activos, ventas anuales, Telefono de la oficina, Fax,
Correo electronico primario

Examples:
|nombre_empresa    |
|UMBRELLAS         |