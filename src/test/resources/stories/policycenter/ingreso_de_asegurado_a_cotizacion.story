Ingreso de asegurado a cotizacion

Meta:

Narrative:
Como usuario de PolicyCenter
Quiero poder ingresar la información de uno o varios asegurados
Para agregarlos a la cotizacion

@Issue 15114 Driver Details

Scenario: Validar asegurado que es persona publicamente expuesta
GivenStories: stories/policycenter/login_policy.story
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

Scenario: Opciones para agregar asegurado
Given voy a crear una nueva cotizacion
And crear una cotizacion nueva con la cuenta <cuenta>
When quiera agregar un asegurado
And vaya a la opcion agregar
Then el boton recuperar mvr no es visible
And Se debe mostrar las opciones:
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


Scenario: Agregar varios asegurados (validar asegurado del directorio riesgo consultable)
Given voy a crear una nueva cotizacion
And crear una cotizacion nueva con la cuenta <cuenta>
When quiera agregar un asegurado
And vaya a la opcion agregar
And consulte un asegurado del directorio
And ingrese a buscar contacto del directorio con tipo de documento <tipoId> y numero de documento <numeroId>
And seleccione el contacto a agregar
And vaya a la opcion agregar
And agregue un asegurado que es contacto de la cuenta
And vaya al siguiente paso de la cotizacion
Then muestre el mensaje de validacion del asegurado <mensaje>
And deben quedar agregados como asegurados:
|nombre|tipoDocumento|numeroDocumento|
|DIEGO VELEZ|CEDULA DE CIUDADANIA|16796652|
|DONIA GLORIA GALLEGO|CEDULA DE CIUDADANIA|1264567899|

Examples:
|cuenta|tipoId|numeroId|mensaje|
|C000888888|CEDULA DE CIUDADANIA|16796652|DIEGO VELEZ, El asegurado es un riesgo no estandar y no es posible gestionar la solicitud por este canal.|

Scenario: Agregar asegurado y Editar campos en creacion tipo persona natural
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
|LUCIANA CALLE|CEDULA DE CIUDADANIA|1234568999|

Examples:
|cuenta|
|C000888888|

Scenario: Agregar y Editar campos en creacion tipo persona juridica
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
|COOPERATIVA LALO|NIT|9998887777|

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
