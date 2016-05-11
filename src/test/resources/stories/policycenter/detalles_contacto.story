Narrative:
Como usuario
Quiero poder ver el detalle de la informacion de contactos en policy center


Scenario: ver informacion detallada de un contacto tipo persona natural.

Given Se tiene y se ha consultado la informacion detallada de un contacto tipo persona natural con nombre
      <primer_nombre> y apellido <primer_apellido>, tipo direccion <tipo_direccion>, direccion <direccion>,
      tipo documento <tipo_documento>, documento <documento>, y con el usuario <user>, con contrasenia <pass> y pais <country>
When quiera ver informacion detallada del contacto  con nombre <primer_nombre> y con apellido <primer_apellido>
Then se debe ver minimo la siguiente informacion: Primer nombre, Segundo nombre, Primer apellido, Segundo apellido,
Tipo de documento, Numero de documento, Sexo,Fecha de nacimiento, Fecha de fallecimiento, Causa de fallecimiento,
Profesion, Estado civil, Tipo familia,  Telefono primario, Telefono celular y Correo electronico primario

Examples:
|user |pass |country  |primer_nombre    |primer_apellido |tipo_direccion |direccion       |documento   |tipo_documento        |
|su   |gw   |Colombia |SASHA            |AKERMAN         |Vivienda       |CALLE 54B #50-25 |564-36-5489 |CEDULA DE CIUDADANIA  |


Scenario: ver informacion detallada de un contacto tipo persona juridica.

Given Se ha consultado la informacion detallada de un contacto tipo persona juridica con nombre <nombre_empresa>,
      tipo de direccion <tipo_direccion> y direccion <direccion>, con el usuario <user>, con contrasenia <pass> y pais <country>
When quiera ver informacion detallada del contacto con nombre empresa <nombre_empresa>
Then se debe ver minimo la siguiente informacion: Razon social, Nombre comercial, Tipo de documento, Número de
documento, Actividad economica, Numero de empleados, Valor de activos, ventas anuales, Telefono de la oficina, Fax,
Correo electronico primario

Examples:
|user |pass |country  |nombre_empresa    |tipo_direccion |direccion       |
|su   |gw   |Colombia |UMBRELLA          |Vivienda       |CALLE 54B #50-25 |