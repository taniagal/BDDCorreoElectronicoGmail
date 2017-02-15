Meta:
@lote1
@sprint 2
@tag equipo: 4


Narrative:
Como usuario de policy center
deseo poder crear un contacto correctamente

Estos escenarios estan hechos para comprobar la correccion de bugs encontrados en el aplicativo
por parte de los analistas del negocio.


Scenario: Crear una cuenta para un contacto persona juridica con caracteres especiales valido (validaciones MDM)
GivenStories: stories/policycenter/login_policy.story
When quiera crear una cuenta para un contacto persona juridica e tipo de documento <tipo_documento>
And nombre de organizacion <nombre_organizacion> <agente>
And nombre empresa <razon_social>
And ingrese los datos de direccion:
|direccion       |tipo_direccion         |departamento|ciudad  |
|CALLE 54B #50-25|DIRECCION DE RESIDENCIA|Antioquia   |Medellin|
Then se debe crear la cuenta con el cliente <razon_social> persona juridica

Examples:
|razon_social|tipo_documento|nombre_organizacion|agente|
|CAMI-LO     |NIT           |Sura               |INT-3 |


Scenario: Crear una cuenta para un contacto persona juridica con razon social no valido (validaciones MDM)
When quiera crear una cuenta para un contacto persona juridica e ingrese nit, tipo de documento <tipo_documento>
And nombre de organizacion <nombre_organizacion> <agente>
And nombre empresa <razon_social>
And ingrese los datos de direccion:
|direccion       |tipo_direccion         |departamento|ciudad  |
|CALLE 54B #50-25|DIRECCION DE RESIDENCIA|Antioquia   |Medellin|
Then no debe permitir crear una nueva cuenta y debe mostrar el mensaje <mensaje>

Examples:
|razon_social|documento|tipo_documento|nombre_organizacion|agente|mensaje|
|NO SE SABE  |NIT      |NIT           |Sura               |INT-3 |Razón social: "NO SE SABE" no es válido|
|NONONONONO  |NIT      |NIT           |Sura               |INT-3 |Razón social: Existen letras o palabras repetidas, no se permiten palabras iguales seguidas o más de 2 letras iguales seguidas. Por favor valide el contenido "NONONONONO".|


Scenario: Crear una cuenta para un contacto persona juridica con nombre comercial no valido (validaciones MDM)
When quiera crear una cuenta para un contacto persona juridica e ingrese nit, tipo de documento <tipo_documento>
And nombre de organizacion <nombre_organizacion> <agente>
And nombre empresa <razon_social>
And nombre comercial <nombre_comercial>
And ingrese los datos de direccion:
|direccion       |tipo_direccion         |departamento|ciudad  |
|CALLE 54B #50-25|DIRECCION DE RESIDENCIA|Antioquia   |Medellin|
Then no debe permitir crear una nueva cuenta y debe mostrar el mensaje <mensaje>

Examples:
|razon_social|documento|tipo_documento|nombre_comercial|nombre_organizacion|agente|mensaje|
|KONAMI      |NIT      |NIT           |+KJHJHB         |Sura               |INT-3 |Nombre comercial: Sólo se permiten ingresar letras, números y los siguientes caracteres (espacio, (.), (&), (|), ("), ('), (/), ($), (-), (()), (\) (,), (#)). Nombre comercial: Existen letras o palabras repetidas, no se permiten palabras iguales seguidas o más de 2 letras iguales seguidas. Por favor valide el contenido "+KJHJHB".|


Scenario: Crear una cuenta para un contacto persona juridica con extencion de telfono de 5 digitos (validaciones MDM)
When quiera crear una cuenta para un contacto persona juridica e tipo de documento <tipo_documento>
And telefono oficina <telefono_oficina>
And nombre de organizacion <nombre_organizacion> <agente>
And nombre empresa <razon_social>
And ingrese los datos de direccion:
|direccion       |tipo_direccion         |departamento|ciudad  |
|CALLE 54B #50-25|DIRECCION DE RESIDENCIA|Antioquia   |Medellin|
Then se debe crear la cuenta con el cliente <razon_social> persona juridica

Examples:
|razon_social   |tipo_documento|nombre_organizacion|agente|telefono_oficina  |
|ELECTRONIC ARTS|NIT           |Sura               |INT-3 |5554142 ext. 12345|