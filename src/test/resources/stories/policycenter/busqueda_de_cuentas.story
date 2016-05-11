Meta:

Narrative:
Como usuario PolicyCenter
quiero ser capaz de buscar una cuenta
para ver el detalle de la misma

Scenario: campos de la busqueda de cuentas por tipo de documento NIT
GivenStories: stories/policycenter/login_policy.story
Given que me encuentro en la busqueda de cuentas
When seleccione el tipo de identificacion <tipoDocumento>
Then me debe mostrar los campos tipo identificacion, numero identificacion, primer nombre, segundo nombre, primer apellido, segundo apellido, razon social, nombre comercial, pais, departamento, ciudad, direccion, telefono
And los label tipo identificacion, numero identificacion, razon social, nombre comercial, pais, departamento, ciudad, direccion, telefono

Examples:
|tipoDocumento|
|NIT|

Scenario: campos de la busqueda de cuentas por tipo de documento CEDULA DE CIUDADANIA
Given que me encuentro en la busqueda de cuentas
When seleccione el tipo de identificacion <tipoDocumento>
Then me debe mostrar los campos tipo identificacion, numero identificacion, primer nombre, segundo nombre, primer apellido, segundo apellido, razon social, nombre comercial, pais, departamento, ciudad, direccion, telefono
And los label tipo identificacion, numero identificacion, razon social, nombre comercial, pais, departamento, ciudad, direccion, telefono

Examples:
|tipoDocumento|
|CEDULA DE CIUDADANIA|

Scenario: Busqueda de cuenta persona natural por primer nombre y primer apellido
Given que me encuentro en la busqueda de cuentas
When ingrese la informacion de primer nombre <primerNombre> segundo nombre <segundoNombre> primer apellido <primerApellido> y segundo apellido <segundoApellido>
Then me debe mostrar numero de cuenta <numeroCuenta>, nombre <nombre> y direccion <direccion>

Examples:
|primerNombre|segundoNombre|primerApellido|segundoApellido|numeroCuenta|nombre|direccion
|Yurledys||Gallego||C000888888|Yurledys Paola Gallego Torres|4040 Elmwood Ave, Floor 0000, Developer Unit Habitation Cube #0000, Louisville, KY 94404-0000, Estados Unidos

Scenario: Busqueda de cuenta persona natural por primer nombre y segundo apellido
Given que me encuentro en la busqueda de cuentas
When ingrese la informacion de primer nombre <primerNombre> segundo nombre <segundoNombre> primer apellido <primerApellido> y segundo apellido <segundoApellido>
Then me debe mostrar numero de cuenta <numeroCuenta>, nombre <nombre> y direccion <direccion>

Examples:
|primerNombre|segundoNombre|primerApellido|segundoApellido|numeroCuenta|nombre|direccion
|Yurledys|||Torres|C000888888|Yurledys Paola Gallego Torres|4040 Elmwood Ave, Floor 0000, Developer Unit Habitation Cube #0000, Louisville, KY 94404-0000, Estados Unidos

Scenario: Busqueda de cuenta persona natural por primer nombre, segundo nombre y primer apellido
Given que me encuentro en la busqueda de cuentas
When ingrese la informacion de primer nombre <primerNombre> segundo nombre <segundoNombre> primer apellido <primerApellido> y segundo apellido <segundoApellido>
Then me debe mostrar numero de cuenta <numeroCuenta>, nombre <nombre> y direccion <direccion>

Examples:
|primerNombre|segundoNombre|primerApellido|segundoApellido|numeroCuenta|nombre|direccion
|Yurledys|Paola|Gallego||C000888888|Yurledys Paola Gallego Torres|4040 Elmwood Ave, Floor 0000, Developer Unit Habitation Cube #0000, Louisville, KY 94404-0000, Estados Unidos

Scenario: Busqueda de cuenta persona natural por primer nombre, primer apellido
Given que me encuentro en la busqueda de cuentas
When ingrese la informacion de primer nombre <primerNombre> segundo nombre <segundoNombre> primer apellido <primerApellido> y segundo apellido <segundoApellido>
Then me debe mostrar numero de cuenta <numeroCuenta>, nombre <nombre> y direccion <direccion>

Examples:
|primerNombre|segundoNombre|primerApellido|segundoApellido|numeroCuenta|nombre|direccion
|Yurledys||Gallego||C000888888|Yurledys Paola Gallego Torres|4040 Elmwood Ave, Floor 0000, Developer Unit Habitation Cube #0000, Louisville, KY 94404-0000, Estados Unidos

Scenario: Busqueda de cuenta persona natural por primer nombre, primer apellido y segundo apellido
Given que me encuentro en la busqueda de cuentas
When ingrese la informacion de primer nombre <primerNombre> segundo nombre <segundoNombre> primer apellido <primerApellido> y segundo apellido <segundoApellido>
Then me debe mostrar numero de cuenta <numeroCuenta>, nombre <nombre> y direccion <direccion>

Examples:
|primerNombre|segundoNombre|primerApellido|segundoApellido|numeroCuenta|nombre|direccion
|Yurledys||Gallego|Torres|C000888888|Yurledys Paola Gallego Torres|4040 Elmwood Ave, Floor 0000, Developer Unit Habitation Cube #0000, Louisville, KY 94404-0000, Estados Unidos

Scenario: Busqueda de cuenta persona natural por primer nombre, segundo apellido
Given que me encuentro en la busqueda de cuentas
When ingrese la informacion de primer nombre <primerNombre> segundo nombre <segundoNombre> primer apellido <primerApellido> y segundo apellido <segundoApellido>
Then me debe mostrar numero de cuenta <numeroCuenta>, nombre <nombre> y direccion <direccion>

Examples:
|primerNombre|segundoNombre|primerApellido|segundoApellido|numeroCuenta|nombre|direccion
|Yurledys|||Torres|C000888888|Yurledys Paola Gallego Torres|4040 Elmwood Ave, Floor 0000, Developer Unit Habitation Cube #0000, Louisville, KY 94404-0000, Estados Unidos

Scenario: Busqueda de cuenta persona natural por primer nombre, segundo nombre, primer apellido
Given que me encuentro en la busqueda de cuentas
When ingrese la informacion de primer nombre <primerNombre> segundo nombre <segundoNombre> primer apellido <primerApellido> y segundo apellido <segundoApellido>
Then me debe mostrar numero de cuenta <numeroCuenta>, nombre <nombre> y direccion <direccion>

Examples:
|primerNombre|segundoNombre|primerApellido|segundoApellido|numeroCuenta|nombre|direccion
|Yurledys|Paola|Gallego||C000888888|Yurledys Paola Gallego Torres|4040 Elmwood Ave, Floor 0000, Developer Unit Habitation Cube #0000, Louisville, KY 94404-0000, Estados Unidos

Scenario: Busqueda de cuenta persona natural por segundo nombre, primer apellido
Given que me encuentro en la busqueda de cuentas
When ingrese la informacion de primer nombre <primerNombre> segundo nombre <segundoNombre> primer apellido <primerApellido> y segundo apellido <segundoApellido>
Then me debe mostrar numero de cuenta <numeroCuenta>, nombre <nombre> y direccion <direccion>

Examples:
|primerNombre|segundoNombre|primerApellido|segundoApellido|numeroCuenta|nombre|direccion
||Paola|Gallego||C000888888|Yurledys Paola Gallego Torres|4040 Elmwood Ave, Floor 0000, Developer Unit Habitation Cube #0000, Louisville, KY 94404-0000, Estados Unidos

Scenario: Busqueda de cuenta persona natural por segundo nombre, primer apellido y segundo apellido
Given que me encuentro en la busqueda de cuentas
When ingrese la informacion de primer nombre <primerNombre> segundo nombre <segundoNombre> primer apellido <primerApellido> y segundo apellido <segundoApellido>
Then me debe mostrar numero de cuenta <numeroCuenta>, nombre <nombre> y direccion <direccion>

Examples:
|primerNombre|segundoNombre|primerApellido|segundoApellido|numeroCuenta|nombre|direccion
||Paola|Gallego|Torres|C000888888|Yurledys Paola Gallego Torres|4040 Elmwood Ave, Floor 0000, Developer Unit Habitation Cube #0000, Louisville, KY 94404-0000, Estados Unidos

Scenario: Busqueda de cuenta persona natural por segundo nombre, segundo apellido
Given que me encuentro en la busqueda de cuentas
When ingrese la informacion de primer nombre <primerNombre> segundo nombre <segundoNombre> primer apellido <primerApellido> y segundo apellido <segundoApellido>
Then me debe mostrar numero de cuenta <numeroCuenta>, nombre <nombre> y direccion <direccion>

Examples:
|primerNombre|segundoNombre|primerApellido|segundoApellido|numeroCuenta|nombre|direccion
||Paola||Torres|C000888888|Yurledys Paola Gallego Torres|4040 Elmwood Ave, Floor 0000, Developer Unit Habitation Cube #0000, Louisville, KY 94404-0000, Estados Unidos

Scenario: Busqueda de cuenta persona natural por primer nombre, segundo nombre, primer apellido y segundo apellido
Given que me encuentro en la busqueda de cuentas
When ingrese la informacion de primer nombre <primerNombre> segundo nombre <segundoNombre> primer apellido <primerApellido> y segundo apellido <segundoApellido>
Then me debe mostrar numero de cuenta <numeroCuenta>, nombre <nombre> y direccion <direccion>

Examples:
|primerNombre|segundoNombre|primerApellido|segundoApellido|numeroCuenta|nombre|direccion
|Yurledys|Paola|Gallego|Torres|C000888888|Yurledys Paola Gallego Torres|4040 Elmwood Ave, Floor 0000, Developer Unit Habitation Cube #0000, Louisville, KY 94404-0000, Estados Unidos

Scenario: Busqueda de cuenta persona natural por primer nombre y primer apellido sin datos existentes
Given que me encuentro en la busqueda de cuentas
When ingrese la informacion de primer nombre <primerNombre> segundo nombre <segundoNombre> primer apellido <primerApellido> y segundo apellido <segundoApellido>
Then me debe mostrar el mensaje <mensaje>

Examples:
|primerNombre|segundoNombre|primerApellido|segundoApellido|mensaje
|Rayo||Newton||La búsqueda no devolvió resultados.

Scenario: Busqueda de cuenta persona natural por primer nombre y segundo nombre, datos insuficientes para la consulta
Given que me encuentro en la busqueda de cuentas
When ingrese la informacion de primer nombre <primerNombre> segundo nombre <segundoNombre> primer apellido <primerApellido> y segundo apellido <segundoApellido>
Then me debe mostrar el mensaje <mensaje>

Examples:
|primerNombre|segundoNombre|primerApellido|segundoApellido|mensaje
|Yurledys|Paola|||Ingrese suficiente información de nombre, un tipo y número de identificación o un número de cuenta. Se necesitan al menos tres letras (cinco, en el caso de empresas) para los nombres sin coincidencias exactas.

Scenario: Busqueda de cuenta persona natural por segundo nombre, datos insuficientes para la consulta
Given que me encuentro en la busqueda de cuentas
When ingrese la informacion de primer nombre <primerNombre> segundo nombre <segundoNombre> primer apellido <primerApellido> y segundo apellido <segundoApellido>
Then me debe mostrar el mensaje <mensaje>

Examples:
|primerNombre|segundoNombre|primerApellido|segundoApellido|mensaje
||Paola|||Ingrese suficiente información de nombre, un tipo y número de identificación o un número de cuenta. Se necesitan al menos tres letras (cinco, en el caso de empresas) para los nombres sin coincidencias exactas.

Scenario: Busqueda de cuenta persona natural por primer apellido y segundo apellido, datos insuficientes para la consulta
Given que me encuentro en la busqueda de cuentas
When ingrese la informacion de primer nombre <primerNombre> segundo nombre <segundoNombre> primer apellido <primerApellido> y segundo apellido <segundoApellido>
Then me debe mostrar el mensaje <mensaje>

Examples:
|primerNombre|segundoNombre|primerApellido|segundoApellido|mensaje
|||Gallego|Torres|Ingrese suficiente información de nombre, un tipo y número de identificación o un número de cuenta. Se necesitan al menos tres letras (cinco, en el caso de empresas) para los nombres sin coincidencias exactas.

Scenario: Busqueda de cuenta persona natural por segundo apellido, datos insuficientes para la consulta
Given que me encuentro en la busqueda de cuentas
When ingrese la informacion de primer nombre <primerNombre> segundo nombre <segundoNombre> primer apellido <primerApellido> y segundo apellido <segundoApellido>
Then me debe mostrar el mensaje <mensaje>

Examples:
|primerNombre|segundoNombre|primerApellido|segundoApellido|mensaje
||||Torres|Ingrese suficiente información de nombre, un tipo y número de identificación o un número de cuenta. Se necesitan al menos tres letras (cinco, en el caso de empresas) para los nombres sin coincidencias exactas.

Scenario: Busqueda de cuenta persona natural por tipo y numero de documento
Given que me encuentro en la busqueda de cuentas
When ingrese la informacion de tipo de documento <tipoDocumento> y numero de documento <numeroDocumento> del titular de la cuenta
Then me debe mostrar numero de cuenta <numeroCuenta>, nombre <nombre> y direccion <direccion>

Examples:
|tipoDocumento|numeroDocumento|numeroCuenta|nombre|direccion
|CEDULA DE CIUDADANIA|12345678900|C000888888|Yurledys Paola Gallego Torres|4040 Elmwood Ave, Floor 0000, Developer Unit Habitation Cube #0000, Louisville, KY 94404-0000, Estados Unidos

Scenario: Busqueda de cuenta persona juridica por tipo y numero de documento
Given que me encuentro en la busqueda de cuentas
When ingrese la informacion de tipo de documento <tipoDocumento> y numero de documento <numeroDocumento> del titular de la cuenta
Then me debe mostrar numero de cuenta <numeroCuenta>, nombre <nombre> y direccion <direccion>

Examples:
|tipoDocumento|numeroDocumento|numeroCuenta|nombre|direccion
|NIT|9202086744|C000478988|Variedades Yurledys|826 N 8th St, Floor 0000, Developer Unit Habitation Cube #0000, Sheboygan, WI 94404-0000, Estados Unidos

Scenario: Busqueda cuenta por persona juridica por razon social
Given que me encuentro en la busqueda de cuentas
When ingrese la informacion de tipo de razon social <razonSocial> del titular de la cuenta
Then me debe mostrar numero de cuenta <numeroCuenta>, nombre <nombre> y direccion <direccion>

Examples:
|razonSocial|numeroCuenta|nombre|direccion
|Variedades Yurledys|C000478988|Variedades Yurledys|826 N 8th St, Floor 0000, Developer Unit Habitation Cube #0000, Sheboygan, WI 94404-0000, Estados Unidos

Scenario: Busqueda de cuenta persona juridica por razon social sin datos existentes
Given que me encuentro en la busqueda de cuentas
When ingrese la informacion de tipo de razon social <razonSocial> del titular de la cuenta
Then me debe mostrar el mensaje <mensaje>

Examples:
|razonSocial|mensaje
|Variedades Yuyeimi|La búsqueda no devolvió resultados.

Scenario: Busqueda de cuenta persona juridica por nombre comercial
Given que me encuentro en la busqueda de cuentas
When ingrese la informacion de nombre comercial <nombreComercial> del titular de la cuenta
Then me debe mostrar numero de cuenta <numeroCuenta>, nombre <nombre> y direccion <direccion>

Examples:
|nombreComercial|numeroCuenta|nombre|direccion
|Variedades Yurledys S.A|C000478988|Variedades Yurledys|826 N 8th St, Floor 0000, Developer Unit Habitation Cube #0000, Sheboygan, WI 94404-0000, Estados Unidos

Scenario: Busqueda de cuenta persona juridica por nombre comercial sin datos existentes
Given que me encuentro en la busqueda de cuentas
When ingrese la informacion de nombre comercial <nombreComercial> del titular de la cuenta
Then me debe mostrar el mensaje <mensaje>

Examples:
|nombreComercial|mensaje
|Variedades Yuyeimi|La búsqueda no devolvió resultados.