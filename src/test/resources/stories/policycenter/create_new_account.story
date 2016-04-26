Scenario: crear una cuenta para un contacto persona natural.

Given que me encuentro en el sistema de policy center como usuario <user> , contrasena <pass> y Pais <country>
When Quiera crear una cuenta para un contacto persona natural e ingrese la informacion en los campos tipo de
documento <tipo_documento>, numero de documento <documento>, Primer nombre <primer_nombre>,
primer apellido <primer_apellido>, tipo de direccion <tipo_direccion>, direccion <direccion>, ciudad <ciudad>,
estado <estado>, codigo postal <codigo_postal> y nombre de organizacion <nombre_organizacion>
Then se debe crear la cuenta <resumen> con el cliente <primer_nombre> persona natural

Examples:
user |pass |country  |tipo_documento |documento   |primer_nombre |primer_apellido |tipo_direccion |direccion |ciudad    |estado     |codigo_postal  |nombre_organizacion    |resumen|
su   |gw   |Colombia |cc             |32145456    |Jair         |Palacios        |Vivienda       |Calle 44A |Medellin  |Florida    |10001          |a                      |Resumen del archivo de cuenta|


Scenario: crear una cuenta para un contacto persona juridica.

Given que me encuentro en el sistema de policy center como usuario <user> , contrasena <pass> y Pais <country>
When Quiera crear una cuenta para una persona juridica e ingrese la informacion en los campos
nombre empresa <nombre_empresa>, tipo de documento <tipo_documento>, numero de documento <documento>,
tipo de direccion <tipo_direccion>, direccion <direccion>, ciudad <ciudad>, estado <estado>,
codigo postal <codigo_postal> y nombre de organizacion <nombre_organizacion>
Then se debe crear la cuenta <resumen> con el cliente <nombre_empresa> persona juridica

Examples:
user |pass |country  |nombre_empresa |tipo_documento    |documento  |tipo_direccion |direccion |ciudad    |estado     |codigo_postal  |nombre_organizacion    |resumen|
su   |gw   |Colombia |nombre empresa |nit               |3602978-5  |Vivienda       |Calle 44A |Medellin  |Florida    |10001          |a                      |Resumen del archivo de cuenta|

