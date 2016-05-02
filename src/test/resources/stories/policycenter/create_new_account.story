Narrative:
Como usuario
Quiero ser capaz de crear nuevas cuentas en policy center


Scenario: crear una cuenta para un contacto persona natural.

Given que me encuentro en el sistema de policy center como usuario <user> , contrasena <pass> y Pais <country>
When Quiera crear una cuenta para un contacto persona natural e ingrese la informacion en los campos tipo de
documento <tipo_documento>, numero de documento <documento>, fecha de nacimiento <fecha_nacimiento> Primer nombre <primer_nombre>,
primer apellido <primer_apellido>, tipo de direccion <tipo_direccion>, direccion <direccion>, ciudad <ciudad>,
estado <estado>, codigo postal <codigo_postal> y nombre de organizacion <nombre_organizacion>
Then se debe crear la cuenta con el cliente <primer_nombre> <primer_apellido> persona natural

Examples:
user |pass |country  |tipo_documento       |documento   |fecha_nacimiento |primer_nombre |primer_apellido |tipo_direccion |direccion |ciudad    |estado     |codigo_postal  |nombre_organizacion    |
su   |gw   |Colombia |CEDULA DE CIUDADANIA |655-45-4955    |02/12/1990       |Nombre        |Apellido        |Vivienda       |Calle 44A |Medellin  |Florida    |10001          |d                      |



Scenario: crear una cuenta para un contacto persona juridica.

Given Me ecnuentro en Policy Center
When Quiera crear una cuenta para una persona juridica e ingrese la informacion en los campos
nombre empresa <nombre_empresa>, tipo de documento <tipo_documento>, numero de documento <documento>,
tipo de direccion <tipo_direccion>, direccion <direccion>, ciudad <ciudad>, estado <estado>,
codigo postal <codigo_postal> y nombre de organizacion <nombre_organizacion>
Then se debe crear la cuenta con el cliente <nombre_empresa> persona juridica

Examples:
user |pass |country  |nombre_empresa |tipo_documento |documento       |tipo_direccion |direccion |ciudad    |estado     |codigo_postal  |nombre_organizacion    |
su   |gw   |Colombia |nombre empresa |NIT            |48-3326554      |Vivienda       |Calle 44A |Medellin  |Florida    |10001          |d                      |



Scenario: Creacion unica de cuenta persona natural

Given Que un cliente ya tiene una cuenta creada con tipo de documento <tipo_documento> y documento <documento>
When Quiero crear una cuenta adicional para alguno de los tipos de personas (natural) e ingrese la informacion en los campos tipo de
documento <tipo_documento>, numero de documento <documento>, fecha de nacimiento <fecha_nacimiento> Primer nombre <primer_nombre>,
primer apellido <primer_apellido>, tipo de direccion <tipo_direccion>, direccion <direccion>, ciudad <ciudad>,
estado <estado>, codigo postal <codigo_postal> y nombre de organizacion <nombre_organizacion>
Then No debe permitir crear una nueva cuenta y debe mostrar el mensaje <mensaje>

Examples:
user |pass |country  |tipo_documento       |documento   |fecha_nacimiento |primer_nombre |primer_apellido |tipo_direccion |direccion |ciudad    |estado     |codigo_postal  |nombre_organizacion    |mensaje|
su   |gw   |Colombia |CEDULA DE CIUDADANIA |655-45-4955    |02/12/1990       |Nombre        |Apellido        |Vivienda       |Calle 44A |Medellin  |Florida    |10001          |d                      |Ya existe un contacto con el mismo número de identificación|



Scenario: crear una cuenta para un contacto menor de edad

Given Me ecnuentro en Policy Center
When Quiera crear una cuenta para un contacto persona natural menor de edad con fecha de nacimiento <fecha_nacimineto>,
e ingrese la informacion en los campos tipo de documento <tipo_documento>, numero de documento <documento>,
Primer nombre <primer_nombre>, primer apellido <primer_apellido>, tipo de direccion <tipo_direccion> y direccion <direccion>.
ciudad <ciudad>, estado <estado>, codigo postal <codigo_postal> y nombre de organizacion <nombre_organizacion>
Then No me debe permitir crear la cuenta y debe mostrar el mensaje <mensaje>

Examples:
user |pass |country  |tipo_documento        |documento      |fecha_nacimiento|primer_nombre |primer_apellido |tipo_direccion |direccion |ciudad    |estado     |codigo_postal  |nombre_organizacion  |mensaje|
su   |gw   |Colombia |CEDULA DE CIUDADANIA  |371-45-4568    |02/15/2012| Nombre        |Apellido        |Vivienda       |Calle 44A |Medellin  |Florida    |10001          |d                    |Por políticas de la compañia no es posible crear una cuenta a una persona menor de 16 años|