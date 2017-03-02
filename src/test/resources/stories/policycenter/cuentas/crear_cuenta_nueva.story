Meta:
@lote1
@sprint 1
@tag equipo: 4

Narrative:
Como usuario
Quiero ser capaz de crear nuevas cuentas en policy center

Scenario: Crear una cuenta para un contacto persona natural
GivenStories: stories/policycenter/login_policy.story
When quiera crear una cuenta para un contacto persona natural e ingrese documento, tipo de documento <tipo_documento>
And nombre de organizacion <nombre_organizacion> <agente>
And fecha de nacimiento <fecha_nacimiento> Primer nombre <primer_nombre>,primer apellido <primer_apellido>
And ingrese los datos de direccion:
|direccion       |tipo_direccion         |departamento|ciudad  |
|CALLE 54B #50-25|DIRECCION DE RESIDENCIA|Antioquia   |Medellin|
Then se debe crear la cuenta con el cliente <primer_nombre> <primer_apellido> persona natural

Examples:
|tipo_documento      |fecha_nacimiento|primer_nombre|primer_apellido|tipo_direccion         |direccion       |departamento|ciudad  |nombre_organizacion|agente|
|CEDULA DE CIUDADANIA|02/12/1990      |SASHA        |AKERMAN        |DIRECCION DE RESIDENCIA|CALLE 54B #50-25|Antioquia   |Medellin|Sura               |INT-3 |



Scenario: Crear una cuenta para un contacto persona juridica
When quiera crear una cuenta para un contacto persona juridica e ingrese nit, tipo de documento <tipo_documento>
And nombre de organizacion <nombre_organizacion> <agente>
And nombre empresa <razon_social>
And ingrese los datos de direccion:
|direccion       |tipo_direccion         |departamento|ciudad  |
|CALLE 54B #50-25|DIRECCION DE RESIDENCIA|Antioquia   |Medellin|
Then se debe crear la cuenta con el cliente <razon_social> persona juridica

Examples:
|razon_social|tipo_documento |tipo_direccion         |direccion       |departamento|ciudad  |nombre_organizacion|agente|
|UMBRELLA    |NIT            |DIRECCION DE RESIDENCIA|CALLE 54B #50-25|Antioquia   |Medellin|Sura               |INT-3 |


Scenario: Creacion unica de cuenta persona natural y crear una cuenta para un contacto menor de edad
When quiera crear una cuenta para un contacto e ingrese documento <documento>, tipo de documento <tipo_documento>
And nombre de organizacion <nombre_organizacion> <agente>
And fecha de nacimiento <fecha_nacimiento> Primer nombre <primer_nombre>,primer apellido <primer_apellido>
And ingrese los datos de direccion:
|direccion       |tipo_direccion|departamento|ciudad  |
|CALLE 54B #50-25|DIRECCION DE RESIDENCIA      |Antioquia   |Medellin|
Then No debe permitir crear una nueva cuenta y debe mostrar el mensaje <mensaje> y <mensaje2>

Examples:
|tipo_documento       |documento|fecha_nacimiento |primer_nombre |primer_apellido |tipo_direccion         |direccion       |departamento|ciudad  |nombre_organizacion|agente|mensaje                                                    |mensaje2|
|CEDULA DE CIUDADANIA |1234567891|15/02/2012       |SASHA         |AKERMAN        |DIRECCION DE RESIDENCIA|CALLE 54B #50-25|Antioquia   |Medellin|Sura               |INT-3 |Ya existe un contacto con el mismo número de identificación|Por políticas de la compañia no es posible crear una cuenta a una persona menor de 16 años|