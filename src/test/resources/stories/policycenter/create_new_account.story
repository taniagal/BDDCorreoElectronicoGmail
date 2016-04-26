Scenario: crear una cuenta para un contacto persona natural.

Given que me encuentro en el sistema de policy center como usuario <user> , contrasena <pass> y Pais <country>
When Quiera crear una cuenta para un contacto persona natural e ingrese la informacion en los campos tipo de
documento <tipo_documento>, numero de documento <documento>, Primer nombre <primer_nombre>,
primer apellido <primer_apellido>, tipo de direccion <tipo_direccion>, direccion <direccion>, ciudad <ciudad>,
estado <estado>, codigo postal <codigo_postal> y nombre de organizacion <nombre_organizacion>
Then se debe crear la cuenta con el cliente persona natural

Examples:
user |pass |country  |tipo_documento |documento   |primer_nombre |primer_apellido |tipo_direccion |direccion |ciudad    |estado     |codigo_postal  |nombre_organizacion    |
su   |gw   |Colombia |cc             |12345678    |Jhair         |Palacios        |Vivienda       |Calle 44A |Medellin  |Florida    |10001          |a                      |
