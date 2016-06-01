Agregar informacion de asegurados a la cotizacion

Meta:

Narrative:
Como usuario de PolicyCenter
Quiero poder ingresar la información de uno o varios asegurados
Para agregarlos a la cotizacion

@Issue 15114 Driver Details

Scenario: Opciones para agregar asegurado
GivenStories: stories/policycenter/login_policy.story
Given voy a ingresar un nuevo asegurado a una cotizacion con la cuenta <cuenta>
And crear una cotizacion nueva
When quiera agregar un asegurado
Then Se debe mostrar las opciones:
|agregar|
|Nuevo|
|Del Directorio|
|Contactos de la cuenta|

Examples:
|cuenta|
|C000888888|

Scenario: Agregar asegurado de los contactos de la cuenta
Given voy a ingresar un nuevo asegurado a una cotizacion con la cuenta <cuenta>
And crear una cotizacion nueva
When quiera agregar un asegurado
And agregue un asegurado que es contacto de la cuenta
Then debe quedar agregado como asegurado <nombre>

Examples:
|cuenta|nombre|
|C000888888|DONIA GLORIA GALLEGO|

Scenario: Agregar asegurado del directorio
Given voy a ingresar un nuevo asegurado a una cotizacion con la cuenta <cuenta>
And crear una cotizacion nueva
When quiera agregar un asegurado
And agregue un asegurado del directorio
And ingrese a buscar contacto del directorio con tipo de documento <tipoId> y numero de documento <numeroId>
And seleccione el contacto a agregar
Then debe quedar agregado como asegurado <nombre>

Examples:
|cuenta|tipoId|numeroId|nombre|
|C000888888|NIT|9202086744|VARIEDADES YURLEDYS|

Scenario: Agregar asegurado por la opción nueva persona natural
Given voy a ingresar un nuevo asegurado a una cotizacion con la cuenta <cuenta>
And crear una cotizacion nueva
When quiera agregar un asegurado
And seleccione ingresar nueva persona natural
And ingrese los datos de persona natural:
|tipoId|numeroId|primerNombre|primerApellido|pais|departamento|ciudad|direccion|tipoDireccion|
|CEDULA DE CIUDADANIA|1234567899|Luciana|Londoño|Colombia|Antioquia|Medellin|Cra 65 # 48-162|DIRECCION DE OFICINA PRINCIPAL|
Then debe quedar agregado como asegurado <nombre>

Examples:
|cuenta|nombre|
|C000888888|LUCIANA LONDOÑO|

Scenario: Agregar asegurado por la opción nueva persona juridica
Given voy a ingresar un nuevo asegurado a una cotizacion con la cuenta <cuenta>
And crear una cotizacion nueva
When quiera agregar un asegurado
And seleccione ingresar nueva persona juridica
And ingrese los datos de persona juridica:
|tipoId|numeroId|razonSocial|pais|departamento|ciudad|direccion|tipoDireccion|
|NIT|9998887776|Cooperativa Cooperando|Colombia|Antioquia|Medellin|Cra 66 # 48-162|DIRECCION DE OFICINA PRINCIPAL|
Then debe quedar agregado como asegurado <nombre>

Examples:
|cuenta|nombre|
|C000888888|COOPERATIVA COOPERANDO|


