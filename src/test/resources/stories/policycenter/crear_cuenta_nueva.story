Meta:
@issue #SUGWUSC-10630

Narrative:
Como usuario
Quiero ser capaz de crear nuevas cuentas en policy center

Scenario: Crear una cuenta para un contacto persona natural
GivenStories: stories/policycenter/login_policy.story
When quiera crear una cuenta para un contacto persona natural e ingrese documento, tipo de documento <tipo_documento>
And nombre de organizacion <nombre_organizacion> <agente>
And fecha de nacimiento <fecha_nacimiento> Primer nombre <primer_nombre>,primer apellido <primer_apellido>
And tipo de direccion <tipo_direccion>, direccion <direccion>, departamento <departamento>, ciudad <ciudad>
Then se debe crear la cuenta con el cliente <primer_nombre> <primer_apellido> persona natural

Examples:
|tipo_documento      |fecha_nacimiento|primer_nombre|primer_apellido|tipo_direccion |direccion       |departamento|ciudad  |nombre_organizacion|agente|
|CEDULA DE CIUDADANIA|02/12/1990      |SASHA        |AKERMAN        |Vivienda       |CALLE 54B #50-25|ANTIOQUIA   |MEDELLIN|Sura               |INT-3 |



Scenario: Crear una cuenta para un contacto persona juridica
When quiera crear una cuenta para un contacto persona juridica e ingrese nit, tipo de documento <tipo_documento>
And nombre de organizacion <nombre_organizacion> <agente>
And nombre empresa <razon_social>
And tipo de direccion <tipo_direccion>, direccion <direccion>, departamento <departamento>, ciudad <ciudad>
Then se debe crear la cuenta con el cliente <razon_social> persona juridica

Examples:
|razon_social|tipo_documento |tipo_direccion |direccion       |departamento|ciudad  |nombre_organizacion|agente|
|UMBRELLA    |NIT            |Vivienda       |CALLE 54B #50-25|ANTIOQUIA   |MEDELLIN|Sura               |INT-3 |



Scenario: Creacion unica de cuenta persona natural y crear una cuenta para un contacto menor de edad
When quiera crear una cuenta para un contacto persona natural e ingrese documento, tipo de documento <tipo_documento>
And nombre de organizacion <nombre_organizacion> <agente>
And fecha de nacimiento <fecha_nacimiento> Primer nombre <primer_nombre>,primer apellido <primer_apellido>
And tipo de direccion <tipo_direccion>, direccion <direccion>, departamento <departamento>, ciudad <ciudad>
Then No debe permitir crear una nueva cuenta y debe mostrar el mensaje <mensaje> y <mensaje2>

Examples:
|tipo_documento       |fecha_nacimiento |primer_nombre |primer_apellido |tipo_direccion |direccion       |departamento|ciudad  |nombre_organizacion|agente|mensaje                                                    |mensaje2|
|CEDULA DE CIUDADANIA |02/15/2012       |SASHA         |AKERMAN         |Vivienda       |CALLE 54B #50-25|ANTIOQUIA   |MEDELLIN|Sura               |INT-3 |Ya existe un contacto con el mismo número de identificación|Por políticas de la compañia no es posible crear una cuenta a una persona menor de 16 años|
