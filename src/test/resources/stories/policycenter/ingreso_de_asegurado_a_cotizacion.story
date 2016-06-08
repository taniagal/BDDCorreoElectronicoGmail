Ingreso de asegurado a cotizacion

Meta:

Narrative:
Como usuario de PolicyCenter
Quiero poder ingresar la información de uno o varios asegurados
Para agregarlos a la cotizacion

@Issue 15114 Driver Details

Scenario: Opciones para agregar asegurado
GivenStories: stories/policycenter/login_policy.story
Given voy a crear una nueva cotizacion
And crear una cotizacion nueva con la cuenta <cuenta>
When quiera agregar un asegurado
And vaya a la opcion agregar
Then Se debe mostrar las opciones:
|agregar|
|Nuevo|
|Del Directorio|
|Contactos de la cuenta|

Examples:
|cuenta|
|C000888888|

Scenario: Agregar asegurado de los contactos de la cuenta
Given voy a crear una nueva cotizacion
And crear una cotizacion nueva con la cuenta <cuenta>
When quiera agregar un asegurado
And vaya a la opcion agregar
And agregue un asegurado que es contacto de la cuenta
Then deben quedar agregados como asegurados:
|nombre|tipoDocumento|numeroDocumento|
|DONIA GLORIA GALLEGO|CEDULA DE CIUDADANIA|1264567899|

Examples:
|cuenta|
|C000888888|

Scenario: Agregar asegurado del directorio
Given voy a crear una nueva cotizacion
And crear una cotizacion nueva con la cuenta <cuenta>
When quiera agregar un asegurado
And vaya a la opcion agregar
And consulte un asegurado del directorio
And ingrese a buscar contacto del directorio con tipo de documento <tipoId> y numero de documento <numeroId>
And seleccione el contacto a agregar
Then deben quedar agregados como asegurados:
|nombre|tipoDocumento|numeroDocumento|
|VARIEDADES YURLEDYS S.A|NIT|9202086744|

Examples:
|cuenta|tipoId|numeroId|
|C000888888|NIT|9202086744|

Scenario: Agregar asegurado por la opcion nueva persona natural
Given voy a crear una nueva cotizacion
And crear una cotizacion nueva con la cuenta <cuenta>
When quiera agregar un asegurado
And vaya a la opcion agregar
And seleccione ingresar nueva persona natural
And ingrese los datos de persona natural:
|tipoId|numeroId|primerNombre|primerApellido|pais|departamento|ciudad|direccion|tipoDireccion|
|CEDULA DE CIUDADANIA|1234568899|LUCIANA|LONDOÑO|Colombia|Antioquia|Medellin|Cra 65 # 48-162|DIRECCION DE OFICINA PRINCIPAL|
Then deben quedar agregados como asegurados:
|nombre|tipoDocumento|numeroDocumento|
|LUCIANA LONDOÑO|CEDULA DE CIUDADANIA|1234568899|

Examples:
|cuenta|
|C000888888|

Scenario: Agregar asegurado por la opcion nueva persona juridica
Given voy a crear una nueva cotizacion
And crear una cotizacion nueva con la cuenta <cuenta>
When quiera agregar un asegurado
And vaya a la opcion agregar
And seleccione ingresar nueva persona juridica
And ingrese los datos de persona juridica:
|tipoId|numeroId|razonSocial|pais|departamento|ciudad|direccion|tipoDireccion|
|NIT|9998887776|COOPERATIVA COOPERANDO|Colombia|Antioquia|Medellin|Cra 66 # 48-162|DIRECCION DE OFICINA PRINCIPAL|
Then deben quedar agregados como asegurados:
|nombre|tipoDocumento|numeroDocumento|
|COOPERATIVA COOPERANDO|NIT|9998887776|

Examples:
|cuenta|
|C000888888|

Scenario: Agregar asegurado del directorio y que no existe
Given voy a crear una nueva cotizacion
And crear una cotizacion nueva con la cuenta <cuenta>
When quiera agregar un asegurado
And vaya a la opcion agregar
And consulte un asegurado del directorio
And ingrese a buscar contacto del directorio con tipo de documento <tipoId> y numero de documento <numeroId>
Then debe mostrar el mensaje del directorio <mensaje>

Examples:
|cuenta|tipoId|numeroId|mensaje|
|C000888888|NIT|2020202020|La búsqueda no devolvió resultados.|

Scenario: Agregar varios asegurados
Given voy a crear una nueva cotizacion
And crear una cotizacion nueva con la cuenta <cuenta>
When quiera agregar un asegurado
And vaya a la opcion agregar
And consulte un asegurado del directorio
And ingrese a buscar contacto del directorio con tipo de documento <tipoId> y numero de documento <numeroId>
And seleccione el contacto a agregar
And vaya a la opcion agregar
And agregue un asegurado que es contacto de la cuenta
Then deben quedar agregados como asegurados:
|nombre|tipoDocumento|numeroDocumento|
|VARIEDADES YURLEDYS S.A|NIT|9202086744|
|DONIA GLORIA GALLEGO|CEDULA DE CIUDADANIA|1264567899|

Examples:
|cuenta|tipoId|numeroId|
|C000888888|NIT|9202086744|

Scenario: Editar campos en creacion tipo persona natural
Given voy a crear una nueva cotizacion
And crear una cotizacion nueva con la cuenta <cuenta>
When quiera agregar un asegurado
And vaya a la opcion agregar
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

Scenario: Editar campos en creacion tipo persona juridica
Given voy a crear una nueva cotizacion
And crear una cotizacion nueva con la cuenta <cuenta>
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

Scenario: Mostrar errores al validar las reglas de MDM al dar siguiente
Given voy a crear una nueva cotizacion
And crear una cotizacion nueva con la cuenta <cuenta>
When quiera agregar un asegurado
And vaya a la opcion agregar
And seleccione ingresar nueva persona natural
And ingrese los datos de persona natural:
|tipoId|numeroId|primerNombre|primerApellido|pais|departamento|ciudad|direccion|tipoDireccion|
|CEDULA DE CIUDADANIA|10000000010|ELIANA|QUINTERO|Colombia|Antioquia|Medellin|Cra 65 # 48-162|DIRECCION DE OFICINA PRINCIPAL|
And vaya al siguiente paso de la cotizacion
Then muestre el mensaje de validacion del asegurado <mensaje>

Examples:
|cuenta|mensaje|
|C000888888|La longitud del número de documento de identificación no es válida, máximo 10 caracteres|

Scenario: Quitar asegurado
Given voy a crear una nueva cotizacion
And crear una cotizacion nueva con la cuenta <cuenta>
When quiera agregar un asegurado
And vaya a la opcion agregar
And consulte un asegurado del directorio
And ingrese a buscar contacto del directorio con tipo de documento <tipoId> y numero de documento <numeroId>
And seleccione el contacto a agregar
And seleccione el contacto agregado
And quite el contacto de la lista
Then la lista de asegurados debe quedar vacia

Examples:
|cuenta|tipoId|numeroId|
|C000888888|NIT|9202086744|

Scenario: Validar asegurado que es riesgo consultable
Given voy a crear una nueva cotizacion
And crear una cotizacion nueva con la cuenta <cuenta>
When quiera agregar un asegurado
And vaya a la opcion agregar
And consulte un asegurado del directorio
And ingrese a buscar contacto del directorio con tipo de documento <tipoId> y numero de documento <numeroId>
And seleccione el contacto a agregar
And vaya al siguiente paso de la cotizacion
Then muestre el mensaje de validacion del asegurado <mensaje>

Examples:
|cuenta|tipoId|numeroId|mensaje|
|C000888888|CEDULA DE CIUDADANIA|16796652|DIEGO VELEZ, El asegurado es un riesgo no estandar y no es posible gestionar la solicitud por este canal.|

Scenario: Validar asegurado que es persona publicamente expuesta
Given voy a crear una nueva cotizacion
And crear una cotizacion nueva con la cuenta <cuenta>
When quiera agregar un asegurado
And vaya a la opcion agregar
And consulte un asegurado del directorio
And ingrese a buscar contacto del directorio con tipo de documento <tipoId> y numero de documento <numeroId>
And seleccione el contacto a agregar
And vaya al siguiente paso de la cotizacion
Then muestre el mensaje de validacion del asegurado <mensaje>

Examples:
|cuenta|tipoId|numeroId|mensaje|
|C000888888|CEDULA DE CIUDADANIA|71123456|ANTONIO RESTREPO con el(los) rol(es) (CONDUCTOR) es un riesgo no estándar y debe ser autorizado.|