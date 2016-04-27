#Scenario: Creacion unica de cuenta persona natural

#Given Que un cliente ya tiene una cuenta creada con tipo de documento <tipo_documento> y documento <documento>
#When Quiero crear una cuenta adicional para alguno de los tipos de personas (natural)
#Then No debe permitir crear una nueva cuenta y debe mostrar el mensaje <mensaje>

#Examples:
#tipo_documento  |documento  |mensaje
#cc              |32145456   |Ya existe una cuenta con el mismo tipo y número de documento ingresado

Narrative:
Como usuario
Quiero ser capaz de crear nuevas cuentas en policy center


Scenario: crear una cuenta para un contacto persona natural.

Given que me encuentro en el sistema de policy center como usuario <user> , contrasena <pass> y Pais <country>
When Quiera crear una cuenta para un contacto persona natural e ingrese la informacion en los campos tipo de
documento <tipo_documento>, numero de documento <documento>, Primer nombre <primer_nombre>,
primer apellido <primer_apellido>, tipo de direccion <tipo_direccion>, direccion <direccion>, ciudad <ciudad>,
estado <estado>, codigo postal <codigo_postal> y nombre de organizacion <nombre_organizacion>
Then se debe crear la cuenta con el cliente <primer_nombre> <primer_apellido> persona natural

Examples:
user |pass |country  |tipo_documento |documento   |primer_nombre |primer_apellido |tipo_direccion |direccion |ciudad    |estado     |codigo_postal  |nombre_organizacion    |
su   |gw   |Colombia |cc             |32145456    |Nombre        |Apellido        |Vivienda       |Calle 44A |Medellin  |Florida    |10001          |a                      |


Scenario: crear una cuenta para un contacto persona juridica.

Given Me ecnuentro en Policy Center
When Quiera crear una cuenta para una persona juridica e ingrese la informacion en los campos
nombre empresa <nombre_empresa>, tipo de documento <tipo_documento>, numero de documento <documento>,
tipo de direccion <tipo_direccion>, direccion <direccion>, ciudad <ciudad>, estado <estado>,
codigo postal <codigo_postal> y nombre de organizacion <nombre_organizacion>
Then se debe crear la cuenta con el cliente <nombre_empresa> persona juridica

Examples:
user |pass |country  |nombre_empresa |tipo_documento    |documento  |tipo_direccion |direccion |ciudad    |estado     |codigo_postal  |nombre_organizacion    |
su   |gw   |Colombia |nombre empresa |nit               |3602978-5  |Vivienda       |Calle 44A |Medellin  |Florida    |10001          |a                      |


