Direcciones De Contacto Vinculadas

Meta:

@issue #SUGWUSC-14987

Narrative:
Como usuario PolicyCenter
quiero poder actualizar la direccion de un contacto que este asociada a otros contactos
para mantener la informacion actualizada de direcciones

Scenario: Edicion del campo direccion - validar longitud maxima de 200 caracteres en Detalle de contacto
GivenStories: stories/policycenter/login_policy.story
Given que me encuentro en los contactos de una cuenta <numeroCuenta>
When seleccione el contacto a editar <nombreContacto>
And ingrese a editar la direccion por <direccion>
Then el campo direccion no debe permitir ingresar mas de 200 caracteres <direccionOk>

Examples:
|numeroCuenta|nombreContacto|direccion|direccionOk|
|C000484848|RICARDO GIRALDO|CL 14 # 48 - 162 CRA 65 # 48 162 CRA 65 # 48 162 CRA 65 # 48 162 CRA 65 # 48 162 CRA 65 # 48 162 CRA 65 # 48 162 CRA 65 # 48 162 CRA 65 # 48 162 CRA 65 # 48 162 CRA 65 # 48 162162 CRA 65 # 48 162 C PRU|200|

Scenario: Edicion del campo direccion - validar longitud maxima de 200 caracteres en Detalle de contacto, Direcciones
Given que me encuentro en los contactos de una cuenta <numeroCuenta>
When seleccione el contacto a editar <nombreContacto>
And ingrese a editar la direccion por <direccion> en detalle contacto pestaña direcciones
Then el campo direccion no debe permitir ingresar mas de 200 caracteres <direccionOk>

Examples:
|numeroCuenta|nombreContacto|direccion|direccionOk|
|C000484848|RICARDO GIRALDO|CL 14 # 48 - 162 CRA 65 # 48 162 CRA 65 # 48 162 CRA 65 # 48 162 CRA 65 # 48 162 CRA 65 # 48 162 CRA 65 # 48 162 CRA 65 # 48 162 CRA 65 # 48 162 CRA 65 # 48 162 CRA 65 # 48 162162 CRA 65 # 48 162 PRUEB|200|

Scenario: Edicion del campo Pais validando que departamento y ciudad se actualizan a ninguno
Given que me encuentro en los contactos de una cuenta <numeroCuenta>
When seleccione el contacto a editar <nombreContacto>
And ingrese a editar la direccion e ingrese el pais <pais>
Then el campo departamento debe tener el valor <departamento>
And el campo ciudad debe tener el valor <ciudad>

Examples:
|numeroCuenta|nombreContacto|pais|departamento|ciudad|
|C000484848|RICARDO GIRALDO|Estados Unidos|<ninguno>|<ninguno>|

Scenario: Edicion del campo Departamento validando que el campo ciudad se actualizan a ninguno
When ingrese a editar la direccion e ingrese el pais <pais>
And ingrese a editar la direccion e ingrese el departamento <departamento>
Then el campo ciudad debe tener el valor <ciudad>

Examples:
|pais|departamento|ciudad|
|Colombia|Antioquia|<ninguno>|

Scenario: Edicion del campo Ciudad y Direccion validando que se estandariza la direccion ingresada
When ingrese a editar la direccion e ingrese la ciudad <ciudad>
And ingrese a editar la direccion por <direccion>
Then la direccion debe quedar estandarizada <direccionEstandarizada> del contacto <nombreContacto>

Examples:
|ciudad|direccion|direccionEstandarizada|nombreContacto|
|Medellin|Carrera 65 48 162|KR 65 # 48 - 162|RICARDO GIRALDO|

Scenario: consultar direccion de un contacto que tiene una direccion asociada a otro contacto
Given que me encuentro en los contactos de una cuenta <numeroCuenta>
When cuando vincule las direcciones del contacto <nombreContactoUno> y contacto <nombreContactoDos> y la desee editar
Then me debe mostrar la siguiente informacion:
|pais|departamento|ciudad|direccion|codigoPostal|tipoDeDireccion|descripcion|
|Colombia|ANTIOQUIA|MEDELLIN|KR 65 # 48 - 162|91007|Vivienda|Created by the Address Builder with code 0|
Examples:
|numeroCuenta|nombreContactoUno|nombreContactoDos|
|C000484848|Speedy Glass Repair|CARLOS PERALTA|

Scenario: actualizar direccion solo ingresando campos obligatorios
Given que me encuentro en los contactos de una cuenta <numeroCuenta>
When ingrese solo informacion obligatoria
Then me debe mostrar esta informacion:
|pais          |departamento|ciudad       |direccion      |codigoPostal|tipoDeDireccion|descripcion|
|Colombia|ANTIOQUIA|MEDELLIN|KR 65 # 48 - 162|            |Vivienda       |           |
Examples:
|numeroCuenta|
|C000484848|

Scenario: visualizar los contactos que hacen uso de la direccion de otro contacto
Given que me encuentro en los contactos de una cuenta <numeroCuenta>
When quiera actualizar la direccion de un contacto que tiene otros contactos que la usan
Then me debe validar la informacion de los contactos que usan esa direccion:
|nombre|primaria|telefono|correo|
|Speedy Glass Repair|Sí||0010@guidewire.com|
|RICARDO GIRALDO|Sí|408-2211|0019@guidewire.com|
|CARLOS PERALTA|Sí|+1300-685-9674|0037@guidewire.com|
Examples:
|numeroCuenta|
|C000484848|

Scenario: validar las etiquetas de los campos
Given que me encuentro en los contactos de una cuenta <numeroCuenta>
When seleccione el contacto a editar <nombreContacto>
And seleccione la opcion para editar la direccion
Then los nombres de las etiquetas de la ventana son correctos para el titulo <titulo> y los botones <botonLigagas> y <botonDesligar>

Examples:
|numeroCuenta|nombreContacto|titulo|botonLigagas|botonDesligar|
|C000484848|RICARDO GIRALDO|Detalle de la dirección|Actualizar todas las direcciones ligadas|Actualizar sólo esta dirección y desligar|

Scenario: validar cuando una direccion no se puede estandarizar la deje como la ingresa el usuario
Given que me encuentro en los contactos de una cuenta <numeroCuenta>
When seleccione el contacto a editar <nombreContacto>
And seleccione la opcion para editar la direccion
And ingrese a editar la direccion por <direccion> en la ventana de contactos vinculados
Then la direccion debe quedar como la ingreso el usuario <direccionUsuario> del contacto <nombreContacto>

Examples:
|numeroCuenta|nombreContacto|direccion|direccionUsuario|
|C000484848|RICARDO GIRALDO|Calle 89 F con circular 1 numero 77 FF 77 avenida guayabal por el centro|CALLE 89 F CON CIRCULAR 1 NUMERO 77 FF 77 AVENIDA GUAYABAL POR EL CENTRO|

Scenario: validar se actualiza la direccion vinculada de todos los contactos
Given que me encuentro en los contactos de una cuenta <numeroCuenta>
Then la direccion <direccionVinculada> fue actualizada <nombreContacto>

Examples:
|numeroCuenta|nombreContacto|direccionVinculada|
|C000484848|RICARDO GIRALDO|CALLE 89 F CON CIRCULAR 1 NUMERO 77 FF 77 AVENIDA GUAYABAL POR EL CENTRO|
|C000484848|CARLOS PERALTA|CALLE 89 F CON CIRCULAR 1 NUMERO 77 FF 77 AVENIDA GUAYABAL POR EL CENTRO|
|C000484848|Speedy Glass Repair|CALLE 89 F CON CIRCULAR 1 NUMERO 77 FF 77 AVENIDA GUAYABAL POR EL CENTRO|

Scenario: validar cuando se actualiza y se desliga la direccion del contacto
Given que me encuentro en los contactos de una cuenta <numeroCuenta>
When seleccione el contacto a editar <nombreContacto>
And seleccione la opcion para editar la direccion
And ingrese a editar la direccion por <direccion> en la ventana de contactos vinculados y desligue la direccion
Then las direcciones fueron desvinculas de los contactos:
|contactoDesligado|direccionDesligada|
|RICARDO GIRALDO|KR 65 # 48 - 162|
|CARLOS PERALTA|CALLE 89 F CON CIRCULAR 1 NUMERO 77 FF 77 AVENIDA GUAYABAL POR EL CENTRO|
|Speedy Glass Repair|CALLE 89 F CON CIRCULAR 1 NUMERO 77 FF 77 AVENIDA GUAYABAL POR EL CENTRO|

Examples:
|numeroCuenta|nombreContacto|direccion|
|C000484848|RICARDO GIRALDO|Carrera 65 #48-162|

Scenario: validar en la creacion de contacto secundario se puede seleccionar la misma direccion de otro contacto
Given que me encuentro en los contactos de una cuenta <numeroCuenta>
And quiera crear un contacto secundario persona natural
When despliegue la lista de contactos
Then la lista de contactos debe ser la siguiente:
|contactosAsociados|
|RICARDO GIRALDO (Titular de la cuenta)|
|Acta Motors (Asegurado nombrado)|
|BlackBurn's Plumbing (Asegurado nombrado)|
|EverReady Rentals (Asegurado nombrado)|
|Harry's Towing (Asegurado nombrado)|
|Metals Unlimited (Asegurado nombrado)|
|Speedy Glass Repair (Asegurado nombrado)|
And debo poder asociar una direccion de otro contacto y se debe asociar la dirección seleccionada al nuevo contacto  y mostrar los datos de la dirección
|pais|departamento|ciudad|direccion|codigoPostal|tipoDireccion|descripcion|
|Colombia|ANTIOQUIA|MEDELLIN|KR 65 # 48 - 162|91007|Vivienda|Created by the Address Builder with code 0|

Examples:
|numeroCuenta|
|C000484848|