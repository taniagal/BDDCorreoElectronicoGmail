Agregar informacion de asegurados a la cotizacion

Meta:

Narrative:
Como usuario de PolicyCenter
Quiero poder ingresar la información de uno o varios asegurados
Para agregarlos a la cotizacion

@Issue 15114 Driver Details

Scenario: Editar campos en creación tipo persona natural
GivenStories: stories/policycenter/login_policy.story
Given voy a ingresar un nuevo asegurado a una cotizacion con la cuenta <cuenta>
And crear una cotizacion nueva
When quiera agregar un asegurado
And seleccione ingresar nueva persona natural
And ingrese los datos de persona natural:
|tipoId|numeroId|primerNombre|primerApellido|pais|departamento|ciudad|direccion|tipoDireccion|
|CEDULA DE CIUDADANIA|1234568999|LUCIANA|LONDOÑO|Colombia|Antioquia|Medellin|Cra 65 # 48-162|DIRECCION DE OFICINA PRINCIPAL|
And quiera editar los datos del nuevo contacto persona natural:
|tipoId|numeroId|primerNombre|primerApellido|pais|departamento|ciudad|direccion|tipoDireccion|
|CEDULA DE CIUDADANIA|1234569999|LUCIANA|CALLE|Colombia|Antioquia|Medellin|Cra 65 # 48-162|DIRECCION DE OFICINA PRINCIPAL|
And vaya a la opcion agregar
And consulte un asegurado del directorio
And vuelva a ver los asegurados
Then deben quedar agregados como asegurados:
|nombre|tipoDocumento|numeroDocumento|
|LUCIANA CALLE|CEDULA DE CIUDADANIA|1234569999|

Examples:
|cuenta|
|C000888888|

Scenario: Editar campos en creación tipo persona juridica
Given voy a ingresar un nuevo asegurado a una cotizacion con la cuenta <cuenta>
And crear una cotizacion nueva
When quiera agregar un asegurado
And vaya a la opcion agregar
And seleccione ingresar nueva persona juridica
And ingrese los datos de persona juridica:
|tipoId|numeroId|razonSocial|pais|departamento|ciudad|direccion|tipoDireccion|
|NIT|9998887777|COOPERATIVA NUMERODOS|Colombia|Antioquia|Medellin|Cra 66 # 48-162|DIRECCION DE OFICINA PRINCIPAL|
And quiera editar los datos del nuevo contacto persona juridica:
|tipoId|numeroId|razonSocial|pais|departamento|ciudad|direccion|tipoDireccion|
|NIT|9998887778|COOPERATIVA LALO|Colombia|Antioquia|Medellin|Cra 67 # 48-162|DIRECCION DE OFICINA PRINCIPAL|
And vaya a la opcion agregar
And consulte un asegurado del directorio
And vuelva a ver los asegurados
Then deben quedar agregados como asegurados:
|nombre|tipoDocumento|numeroDocumento|
|COOPERATIVA LALO|NIT|9998887778|

Examples:
|cuenta|
|C000888888|