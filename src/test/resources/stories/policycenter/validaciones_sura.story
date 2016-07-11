Meta:

Narrative:
Como usuario de policy center
deseo poder crear un contacto correctamente

Estos escenarios estan hechos para comprobar la correccion de bugs encontrados en el aplicativo
por parte de los analistas del negocio.

Scenario: crear una cuenta para un contacto persona juridica (validaciones Sura).
Given que me encuentro en el sistema de policy center
When quiera crear una cuenta para un contacto e ingrese documento, tipo de documento <tipo_documento>
And nombre de organizacion <nombre_organizacion> <agente>
And nombre empresa <razon_social>
And tipo de direccion <tipo_direccion>, direccion <direccion>, departamento <departamento>, ciudad <ciudad>
Then se debe crear la cuenta con el cliente <razon_social> persona juridica

Examples:
|razon_social|tipo_documento                |tipo_direccion |direccion       |departamento|ciudad  |nombre_organizacion|agente|
|KONAMI      |IDENT. FISCAL PARA EXTRANJEROS|Vivienda       |CALLE 54B #50-25|Antioquia   |Medellin|Sura               |INT-3 |


Scenario: crear una cuenta para un contacto persona juridica con un dato no valido.
Given que me encuentro en el sistema de policy center
When quiera crear una cuenta para un contacto persona juridica e ingrese nit, tipo de documento <tipo_documento>
And nombre de organizacion <nombre_organizacion> <agente>
And nombre empresa <razon_social>
And tipo de direccion <tipo_direccion>, direccion <direccion>, departamento <departamento>, ciudad <ciudad>
Then no debe permitir crear una nueva cuenta y debe mostrar el mensaje <mensaje>

Examples:
|razon_social|documento|tipo_documento|tipo_direccion |direccion       |departamento|ciudad  |nombre_organizacion|agente|mensaje|
|NO SE SABE  |NIT      |NIT           |Vivienda       |CALLE 32B #08-45|Antioquia   |Medellin|Sura               |INT-3 |El nombre "NO SE SABE" no es valido|


Scenario: crear una cuenta para un contacto persona juridica con un dato no valido.
Given que me encuentro en el sistema de policy center
When quiera crear una cuenta para un contacto persona juridica e tipo de documento <tipo_documento>
And nombre de organizacion <nombre_organizacion> <agente>
And nombre empresa <razon_social>
And tipo de direccion <tipo_direccion>, direccion <direccion>, departamento <departamento>, ciudad <ciudad>
Then se debe crear la cuenta con el cliente <razon_social> persona juridica

Examples:
|razon_social|tipo_documento|tipo_direccion |direccion       |departamento|ciudad  |nombre_organizacion|agente|
|.&"/\'$     |NIT           |Vivienda       |CALLE 54B #50-25|Antioquia   |Medellin|Sura               |INT-3 |
|CAMI-LO     |NIT           |Vivienda       |CALLE 54B #50-25|Antioquia   |Medellin|Sura               |INT-3 |

Scenario: crear una cuenta para un contacto persona juridica con un dato no valido.
Given que me encuentro en el sistema de policy center
When quiera crear una cuenta para un contacto persona juridica e ingrese nit, tipo de documento <tipo_documento>
And nombre de organizacion <nombre_organizacion> <agente>
And nombre empresa <razon_social>
And nombre comercial <nombre_comercial>
And tipo de direccion <tipo_direccion>, direccion <direccion>, departamento <departamento>, ciudad <ciudad>
Then no debe permitir crear una nueva cuenta y debe mostrar el mensaje <mensaje>

Examples:
|razon_social|documento|tipo_documento|nombre_comercial|tipo_direccion |direccion       |departamento|ciudad  |nombre_organizacion|agente|mensaje|
|KONAMI      |NIT      |NIT           |+KJHJHB         |Vivienda       |CALLE 32B #08-45|Antioquia   |Medellin|Sura               |INT-3 |El nombre de la compañia "+KJHJHB" contiene caracteres inválidos|


Scenario: crear una cuenta para un contacto persona juridica con un dato no valido.
Given que me encuentro en el sistema de policy center
When quiera crear una cuenta para un contacto persona juridica e tipo de documento <tipo_documento>
And telefono oficina <telefono_oficina>
And nombre de organizacion <nombre_organizacion> <agente>
And nombre empresa <razon_social>
And tipo de direccion <tipo_direccion>, direccion <direccion>, departamento <departamento>, ciudad <ciudad>
Then se debe crear la cuenta con el cliente <razon_social> persona juridica

Examples:
|razon_social   |tipo_documento|tipo_direccion |direccion       |departamento|ciudad  |nombre_organizacion|agente|telefono_oficina  |
|ELECTRONIC ARTS|NIT           |Vivienda       |CALLE 54B #50-25|Antioquia   |Medellin|Sura               |INT-3 |5554142 ext. 12345|


Scenario: crear una cuenta para un contacto persona natural.
GivenStories: stories/policycenter/login_policy.story
When quiera crear una cuenta para un contacto e ingrese documento, tipo de documento <tipo_documento>
And nombre de organizacion <nombre_organizacion> <agente>
And fecha de nacimiento <fecha_nacimiento> Primer nombre <primer_nombre>,primer apellido <primer_apellido>
And tipo de direccion <tipo_direccion>, direccion <direccion>, departamento <departamento>, ciudad <ciudad>
Then no debe permitir crear una nueva cuenta y no debe mostrar el mensaje <mensaje>

Examples:
|tipo_documento       |fecha_nacimiento|primer_nombre|primer_apellido|tipo_direccion |direccion       |departamento|ciudad  |nombre_organizacion|agente|mensaje|
|CEDULA DE CIUDADANIA |02/12/1990      |SASHA        |AKERMAN        |Vivienda       |CALLE 54B #50-25|ANTIOQUIA   |MEDELLIN|Sura               |INT-3 |La longitud del número de documento de identificación no es válida, máximo 10 caracteres|


Scenario: crear una cuenta para un contacto persona natural.
GivenStories: stories/policycenter/login_policy.story
When quiera crear una cuenta para un contacto e ingrese documento <documento>, tipo de documento <tipo_documento>
And nombre de organizacion <nombre_organizacion> <agente>
And fecha de nacimiento <fecha_nacimiento> Primer nombre <primer_nombre>,primer apellido <primer_apellido>
And tipo de direccion <tipo_direccion>, direccion <direccion>, departamento <departamento>, ciudad <ciudad>
Then no debe permitir crear una nueva cuenta y debe mostrar el mensaje <mensaje>
Examples:
|tipo_documento              |documento|fecha_nacimiento|primer_nombre|primer_apellido|tipo_direccion |direccion       |departamento|ciudad  |nombre_organizacion|agente|mensaje|
|CEDULA DE EXTRANJERIA       |545*+456d|02/12/1990      |SASHA        |AKERMAN        |Vivienda       |CALLE 54B #50-25|ANTIOQUIA   |MEDELLIN|Sura               |INT-3 |El número de identificación contiene caracteres inválidos|
|DOC. IDENTIDAD DE EXTRANJERO|545*+456d|02/12/1990      |SASHA        |AKERMAN        |Vivienda       |CALLE 54B #50-25|ANTIOQUIA   |MEDELLIN|Sura               |INT-3 |El número de identificación contiene caracteres inválidos|
|NUIP                        |54545dssd|02/12/1990      |SASHA        |AKERMAN        |Vivienda       |CALLE 54B #50-25|ANTIOQUIA   |MEDELLIN|Sura               |INT-3 |El número de identificación contiene caracteres inválidos|
|PASAPORTE                   |545*+456d|02/12/1990      |SASHA        |AKERMAN        |Vivienda       |CALLE 54B #50-25|ANTIOQUIA   |MEDELLIN|Sura               |INT-3 |El número de identificación contiene caracteres inválidos|
|PERSONA NATURAL CON NIT     |545*+456d|02/12/1990      |SASHA        |AKERMAN        |Vivienda       |CALLE 54B #50-25|ANTIOQUIA   |MEDELLIN|Sura               |INT-3 |El número de identificación contiene caracteres inválidos|
|REGISTRO CIVIL DE NACIMIENTO|545*+456d|02/12/1990      |SASHA        |AKERMAN        |Vivienda       |CALLE 54B #50-25|ANTIOQUIA   |MEDELLIN|Sura               |INT-3 |El número de identificación contiene caracteres inválidos|


Scenario: crear una cuenta para un contacto persona natural.
GivenStories: stories/policycenter/login_policy.story
When quiera crear una cuenta para un contacto e ingrese documento <documento>, tipo de documento <tipo_documento>
And nombre de organizacion <nombre_organizacion> <agente>
And fecha de nacimiento <fecha_nacimiento> Primer nombre <primer_nombre>,primer apellido <primer_apellido>
And tipo de direccion <tipo_direccion>, direccion <direccion>, departamento <departamento>, ciudad <ciudad>
Then no debe permitir crear una nueva cuenta y no debe mostrar el mensaje <mensaje>

Examples:
|tipo_documento              |documento|fecha_nacimiento|primer_nombre|primer_apellido|tipo_direccion |direccion       |departamento|ciudad  |nombre_organizacion|agente|mensaje|
|TARJETA DE IDENTIDAD        |545*+456d|02/12/1990      |SASHA        |AKERMAN        |Vivienda       |CALLE 54B #50-25|ANTIOQUIA   |MEDELLIN|Sura               |INT-3 |La longitud del número de documento de identificación no es válida, máximo 14 caracteres|