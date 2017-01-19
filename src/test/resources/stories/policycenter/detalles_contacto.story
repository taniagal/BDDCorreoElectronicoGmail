Meta:
@lote3
@sprint 1
@tag equipo: 4

Narrative:
Como usuario
Quiero poder ver el detalle de la informacion de contactos en policy center.
Para el contacto tipo persona natural esta informacion debe ser Primer nombre, Segundo nombre, Primer apellido, Segundo apellido,
Tipo de documento, Numero de documento, Sexo,Fecha de nacimiento, Fecha de fallecimiento, Causa de fallecimiento,
Profesion, Estado civil, Tipo familia,  Telefono primario, Telefono celular y Correo electronico primario

Para el contacto tipo persona juridica esta informacion debe ser Razon social, Nombre comercial, Tipo de documento, Numero de
documento, Actividad economica, Numero de empleados, Valor de activos, ventas anuales, Telefono de la oficina, Fax,
Correo electronico primario.


Scenario: ver informacion detallada de un contacto tipo persona natural.
GivenStories: stories/policycenter/login_policy.story
When quiera ver informacion detallada del contacto con <tipo_documento> c. <documento>
Then se debe ver minimo la siguiente informacion definida para el panel de detalles de persona narural

Examples:
|tipo_documento      |documento |
|CEDULA DE CIUDADANIA|1234567891|


Scenario: ver informacion detallada de un contacto tipo persona juridica.
When quiera ver informacion detallada del contacto con <tipo_documento> c. <documento>
Then se debe ver minimo la siguiente informacion definida para el panel de detalles de persona juridica

Examples:
|tipo_documento|documento |
|NIT           |9202086745|