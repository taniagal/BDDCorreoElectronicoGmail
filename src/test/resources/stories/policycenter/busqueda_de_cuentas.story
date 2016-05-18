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
|Yurledys||Ga||C000888888|YURLEDYS PAOLA GALLEGO TORRES|4040 ELMWOOD, Floor 0000, Developer Unit Habitation Cube #0000, LOUISVILLE, KY 40207, Estados Unidos

Scenario: Busqueda de cuenta persona natural por primer nombre y segundo apellido
Given que me encuentro en la busqueda de cuentas
When ingrese la informacion de primer nombre <primerNombre> segundo nombre <segundoNombre> primer apellido <primerApellido> y segundo apellido <segundoApellido>
Then me debe mostrar numero de cuenta <numeroCuenta>, nombre <nombre> y direccion <direccion>

Examples:
|primerNombre|segundoNombre|primerApellido|segundoApellido|numeroCuenta|nombre|direccion
|Yurledys|||Torres|C000888888|YURLEDYS PAOLA GALLEGO TORRES|4040 ELMWOOD, Floor 0000, Developer Unit Habitation Cube #0000, LOUISVILLE, KY 40207, Estados Unidos

Scenario: Busqueda de cuenta persona natural por primer nombre, segundo nombre y primer apellido
Given que me encuentro en la busqueda de cuentas
When ingrese la informacion de primer nombre <primerNombre> segundo nombre <segundoNombre> primer apellido <primerApellido> y segundo apellido <segundoApellido>
Then me debe mostrar numero de cuenta <numeroCuenta>, nombre <nombre> y direccion <direccion>

Examples:
|primerNombre|segundoNombre|primerApellido|segundoApellido|numeroCuenta|nombre|direccion
|Yurledys|Paola|Gallego||C000888888|YURLEDYS PAOLA GALLEGO TORRES|4040 ELMWOOD, Floor 0000, Developer Unit Habitation Cube #0000, LOUISVILLE, KY 40207, Estados Unidos

Scenario: Busqueda de cuenta persona natural por primer nombre, primer apellido
Given que me encuentro en la busqueda de cuentas
When ingrese la informacion de primer nombre <primerNombre> segundo nombre <segundoNombre> primer apellido <primerApellido> y segundo apellido <segundoApellido>
Then me debe mostrar numero de cuenta <numeroCuenta>, nombre <nombre> y direccion <direccion>

Examples:
|primerNombre|segundoNombre|primerApellido|segundoApellido|numeroCuenta|nombre|direccion
|Yurledys|Pa|||C000888888|YURLEDYS PAOLA GALLEGO TORRES|4040 ELMWOOD, Floor 0000, Developer Unit Habitation Cube #0000, LOUISVILLE, KY 40207, Estados Unidos

Scenario: Busqueda de cuenta persona natural por primer nombre, primer apellido y segundo apellido
Given que me encuentro en la busqueda de cuentas
When ingrese la informacion de primer nombre <primerNombre> segundo nombre <segundoNombre> primer apellido <primerApellido> y segundo apellido <segundoApellido>
Then me debe mostrar numero de cuenta <numeroCuenta>, nombre <nombre> y direccion <direccion>

Examples:
|primerNombre|segundoNombre|primerApellido|segundoApellido|numeroCuenta|nombre|direccion
|Yurledys||Gallego|Torres|C000888888|YURLEDYS PAOLA GALLEGO TORRES|4040 ELMWOOD, Floor 0000, Developer Unit Habitation Cube #0000, LOUISVILLE, KY 40207, Estados Unidos

Scenario: Busqueda de cuenta persona natural por primer nombre, segundo apellido
Given que me encuentro en la busqueda de cuentas
When ingrese la informacion de primer nombre <primerNombre> segundo nombre <segundoNombre> primer apellido <primerApellido> y segundo apellido <segundoApellido>
Then me debe mostrar numero de cuenta <numeroCuenta>, nombre <nombre> y direccion <direccion>

Examples:
|primerNombre|segundoNombre|primerApellido|segundoApellido|numeroCuenta|nombre|direccion
|Yurledys|||To|C000888888|YURLEDYS PAOLA GALLEGO TORRES|4040 ELMWOOD, Floor 0000, Developer Unit Habitation Cube #0000, LOUISVILLE, KY 40207, Estados Unidos

Scenario: Busqueda de cuenta persona natural por primer nombre, segundo nombre, primer apellido
Given que me encuentro en la busqueda de cuentas
When ingrese la informacion de primer nombre <primerNombre> segundo nombre <segundoNombre> primer apellido <primerApellido> y segundo apellido <segundoApellido>
Then me debe mostrar numero de cuenta <numeroCuenta>, nombre <nombre> y direccion <direccion>

Examples:
|primerNombre|segundoNombre|primerApellido|segundoApellido|numeroCuenta|nombre|direccion
|Yurledys|Paola|Gallego||C000888888|YURLEDYS PAOLA GALLEGO TORRES|4040 ELMWOOD, Floor 0000, Developer Unit Habitation Cube #0000, LOUISVILLE, KY 40207, Estados Unidos

Scenario: Busqueda de cuenta persona natural por segundo nombre, primer apellido
Given que me encuentro en la busqueda de cuentas
When ingrese la informacion de primer nombre <primerNombre> segundo nombre <segundoNombre> primer apellido <primerApellido> y segundo apellido <segundoApellido>
Then me debe mostrar numero de cuenta <numeroCuenta>, nombre <nombre> y direccion <direccion>

Examples:
|primerNombre|segundoNombre|primerApellido|segundoApellido|numeroCuenta|nombre|direccion
||Paola|Gallego||C000888888|YURLEDYS PAOLA GALLEGO TORRES|4040 ELMWOOD, Floor 0000, Developer Unit Habitation Cube #0000, LOUISVILLE, KY 40207, Estados Unidos

Scenario: Busqueda de cuenta persona natural por segundo nombre, primer apellido y segundo apellido
Given que me encuentro en la busqueda de cuentas
When ingrese la informacion de primer nombre <primerNombre> segundo nombre <segundoNombre> primer apellido <primerApellido> y segundo apellido <segundoApellido>
Then me debe mostrar numero de cuenta <numeroCuenta>, nombre <nombre> y direccion <direccion>

Examples:
|primerNombre|segundoNombre|primerApellido|segundoApellido|numeroCuenta|nombre|direccion
||Paola|Gallego|Torres|C000888888|YURLEDYS PAOLA GALLEGO TORRES|4040 ELMWOOD, Floor 0000, Developer Unit Habitation Cube #0000, LOUISVILLE, KY 40207, Estados Unidos

Scenario: Busqueda de cuenta persona natural por segundo nombre, segundo apellido
Given que me encuentro en la busqueda de cuentas
When ingrese la informacion de primer nombre <primerNombre> segundo nombre <segundoNombre> primer apellido <primerApellido> y segundo apellido <segundoApellido>
Then me debe mostrar numero de cuenta <numeroCuenta>, nombre <nombre> y direccion <direccion>

Examples:
|primerNombre|segundoNombre|primerApellido|segundoApellido|numeroCuenta|nombre|direccion
||Paola||Torres|C000888888|YURLEDYS PAOLA GALLEGO TORRES|4040 ELMWOOD, Floor 0000, Developer Unit Habitation Cube #0000, LOUISVILLE, KY 40207, Estados Unidos

Scenario: Busqueda de cuenta persona natural por primer nombre, segundo nombre, primer apellido y segundo apellido
Given que me encuentro en la busqueda de cuentas
When ingrese la informacion de primer nombre <primerNombre> segundo nombre <segundoNombre> primer apellido <primerApellido> y segundo apellido <segundoApellido>
Then me debe mostrar numero de cuenta <numeroCuenta>, nombre <nombre> y direccion <direccion>

Examples:
|primerNombre|segundoNombre|primerApellido|segundoApellido|numeroCuenta|nombre|direccion
|Yurledys|Paola|Gallego|Torres|C000888888|YURLEDYS PAOLA GALLEGO TORRES|4040 ELMWOOD, Floor 0000, Developer Unit Habitation Cube #0000, LOUISVILLE, KY 40207, Estados Unidos

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
Then me debe mostrar numero de cuenta <numeroCuenta>, nombre <nombre> y direccion <direccion>

Examples:
|primerNombre|segundoNombre|primerApellido|segundoApellido|numeroCuenta|nombre|direccion
|Yurledys|Paola|||C000888888|YURLEDYS PAOLA GALLEGO TORRES|4040 ELMWOOD, Floor 0000, Developer Unit Habitation Cube #0000, LOUISVILLE, KY 40207, Estados Unidos

Scenario: Busqueda de cuenta persona natural por primer nombre, datos insuficientes para la consulta
Given que me encuentro en la busqueda de cuentas
When ingrese la informacion de primer nombre <primerNombre> segundo nombre <segundoNombre> primer apellido <primerApellido> y segundo apellido <segundoApellido>
Then me debe mostrar el mensaje <mensaje>

Examples:
|primerNombre|segundoNombre|primerApellido|segundoApellido|mensaje
|Yurledys||||No hay suficiente información para la búsqueda. Si desea buscar por tipo y número de documento, ambos deben ser obligatorios. Si desea buscar por nombre debe ingresar al menos dos campos, incluido un nombre y al menos 2 caracteres por cada campo (4 en el caso de empresas)

Scenario: Busqueda de cuenta persona natural por segundo nombre, datos insuficientes para la consulta
Given que me encuentro en la busqueda de cuentas
When ingrese la informacion de primer nombre <primerNombre> segundo nombre <segundoNombre> primer apellido <primerApellido> y segundo apellido <segundoApellido>
Then me debe mostrar el mensaje <mensaje>

Examples:
|primerNombre|segundoNombre|primerApellido|segundoApellido|mensaje
||Paola|||No hay suficiente información para la búsqueda. Si desea buscar por tipo y número de documento, ambos deben ser obligatorios. Si desea buscar por nombre debe ingresar al menos dos campos, incluido un nombre y al menos 2 caracteres por cada campo (4 en el caso de empresas)

Scenario: Busqueda de cuenta persona natural por primer apellido y segundo apellido, datos insuficientes para la consulta
Given que me encuentro en la busqueda de cuentas
When ingrese la informacion de primer nombre <primerNombre> segundo nombre <segundoNombre> primer apellido <primerApellido> y segundo apellido <segundoApellido>
Then me debe mostrar el mensaje <mensaje>

Examples:
|primerNombre|segundoNombre|primerApellido|segundoApellido|mensaje
|||Gallego|Torres|No hay suficiente información para la búsqueda. Si desea buscar por tipo y número de documento, ambos deben ser obligatorios. Si desea buscar por nombre debe ingresar al menos dos campos, incluido un nombre y al menos 2 caracteres por cada campo (4 en el caso de empresas).

Scenario: Busqueda de cuenta persona natural por segundo apellido, datos insuficientes para la consulta
Given que me encuentro en la busqueda de cuentas
When ingrese la informacion de primer nombre <primerNombre> segundo nombre <segundoNombre> primer apellido <primerApellido> y segundo apellido <segundoApellido>
Then me debe mostrar el mensaje <mensaje>

Examples:
|primerNombre|segundoNombre|primerApellido|segundoApellido|mensaje
||||Torres|No hay suficiente información para la búsqueda. Si desea buscar por tipo y número de documento, ambos deben ser obligatorios. Si desea buscar por nombre debe ingresar al menos dos campos, incluido un nombre y al menos 2 caracteres por cada campo (4 en el caso de empresas).

Scenario: Busqueda de cuenta persona natural por tipo y numero de documento
Given que me encuentro en la busqueda de cuentas
When ingrese la informacion de tipo de documento <tipoDocumento> y numero de documento <numeroDocumento> del titular de la cuenta
Then me debe mostrar numero de cuenta <numeroCuenta>, nombre <nombre> y direccion <direccion>

Examples:
|tipoDocumento|numeroDocumento|numeroCuenta|nombre|direccion
|CEDULA DE CIUDADANIA|1234567890|C000888888|YURLEDYS PAOLA GALLEGO TORRES|4040 ELMWOOD, Floor 0000, Developer Unit Habitation Cube #0000, LOUISVILLE, KY 40207, Estados Unidos

Scenario: Busqueda de cuenta persona juridica por tipo y numero de documento
Given que me encuentro en la busqueda de cuentas
When ingrese la informacion de tipo de documento <tipoDocumento> y numero de documento <numeroDocumento> del titular de la cuenta
Then me debe mostrar numero de cuenta <numeroCuenta>, nombre <nombre> y direccion <direccion>

Examples:
|tipoDocumento|numeroDocumento|numeroCuenta|nombre|direccion
|NIT|9202086744|C010478975|VARIEDADES YURLEDYS|826 N ST, Floor 0000, Developer Unit Habitation Cube #0000, SHEBOYGAN, WI 40207, Estados Unidos

Scenario: Busqueda cuenta por persona juridica por razon social
Given que me encuentro en la busqueda de cuentas
When ingrese la informacion de tipo de razon social <razonSocial> del titular de la cuenta
Then me debe mostrar numero de cuenta <numeroCuenta>, nombre <nombre> y direccion <direccion>

Examples:
|razonSocial|numeroCuenta|nombre|direccion
|Variedades Yurledys|C010478975|VARIEDADES YURLEDYS|826 N ST, Floor 0000, Developer Unit Habitation Cube #0000, SHEBOYGAN, WI 40207, Estados Unidos

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
|Variedades Yurledys S.A|C010478975|VARIEDADES YURLEDYS|826 N ST, Floor 0000, Developer Unit Habitation Cube #0000, SHEBOYGAN, WI 40207, Estados Unidos

Scenario: Busqueda de cuenta persona juridica por nombre comercial sin datos existentes
Given que me encuentro en la busqueda de cuentas
When ingrese la informacion de nombre comercial <nombreComercial> del titular de la cuenta
Then me debe mostrar el mensaje <mensaje>

Examples:
|nombreComercial|mensaje
|Variedades Yuyeimi|La búsqueda no devolvió resultados.

Scenario: Opcion de imprimir y exportar
Given que me encuentro en la busqueda de cuentas
When ingrese la informacion de primer nombre <primerNombre> segundo nombre <segundoNombre> primer apellido <primerApellido> y segundo apellido <segundoApellido>
And quiera exportar o imprimir los resultados de la busqueda
Then me debe mostrar las opciones permitidas Imprimir como pdf <imprimir>, Exportar como CSV <exportar>, Exportación personalizada como CSV <exportarPersonalizado>

Examples:
|primerNombre|segundoNombre|primerApellido|segundoApellido|imprimir|exportar|exportarPersonalizado
|Yurledys|Paola|Gallego|Torres|Imprimir (como PDF)|Exportar (como CSV)|Exportación personalizada (como CSV)

Scenario: Longitud mimina de caracteres persona natural, primer nombre con longitud menor
Given que me encuentro en la busqueda de cuentas
When ingrese la informacion de primer nombre <primerNombre> segundo nombre <segundoNombre> primer apellido <primerApellido> y segundo apellido <segundoApellido>
Then me debe mostrar el mensaje <mensaje>

Examples:
|primerNombre|segundoNombre|primerApellido|segundoApellido|mensaje
|Y|Paola|||No hay suficiente información para la búsqueda. Si desea buscar por tipo y número de documento, ambos deben ser obligatorios. Si desea buscar por nombre debe ingresar al menos dos campos, incluido un nombre y al menos 2 caracteres por cada campo (4 en el caso de empresas).

Scenario: Longitud mimina de caracteres persona natural, segundo nombre con longitud menor
Given que me encuentro en la busqueda de cuentas
When ingrese la informacion de primer nombre <primerNombre> segundo nombre <segundoNombre> primer apellido <primerApellido> y segundo apellido <segundoApellido>
Then me debe mostrar el mensaje <mensaje>

Examples:
|primerNombre|segundoNombre|primerApellido|segundoApellido|mensaje
|Yurledys|P|||No hay suficiente información para la búsqueda. Si desea buscar por tipo y número de documento, ambos deben ser obligatorios. Si desea buscar por nombre debe ingresar al menos dos campos, incluido un nombre y al menos 2 caracteres por cada campo (4 en el caso de empresas).

Scenario: Longitud mimina de caracteres persona natural, primer apellido con longitud menor
Given que me encuentro en la busqueda de cuentas
When ingrese la informacion de primer nombre <primerNombre> segundo nombre <segundoNombre> primer apellido <primerApellido> y segundo apellido <segundoApellido>
Then me debe mostrar el mensaje <mensaje>

Examples:
|primerNombre|segundoNombre|primerApellido|segundoApellido|mensaje
|Yurledys||G||No hay suficiente información para la búsqueda. Si desea buscar por tipo y número de documento, ambos deben ser obligatorios. Si desea buscar por nombre debe ingresar al menos dos campos, incluido un nombre y al menos 2 caracteres por cada campo (4 en el caso de empresas).

Scenario: Longitud mimina de caracteres persona natural, segundo apellido con longitud menor
Given que me encuentro en la busqueda de cuentas
When ingrese la informacion de primer nombre <primerNombre> segundo nombre <segundoNombre> primer apellido <primerApellido> y segundo apellido <segundoApellido>
Then me debe mostrar el mensaje <mensaje>

Examples:
|primerNombre|segundoNombre|primerApellido|segundoApellido|mensaje
|Yurledys|||T|No hay suficiente información para la búsqueda. Si desea buscar por tipo y número de documento, ambos deben ser obligatorios. Si desea buscar por nombre debe ingresar al menos dos campos, incluido un nombre y al menos 2 caracteres por cada campo (4 en el caso de empresas).

Scenario: Longitud minima para consulta de persona juridica por razon social con longitud menor a 4
Given que me encuentro en la busqueda de cuentas
When ingrese la informacion de tipo de razon social <razonSocial> del titular de la cuenta
Then me debe mostrar el mensaje <mensaje>

Examples:
|razonSocial|mensaje
|Var|No hay suficiente información para la búsqueda. Si desea buscar por tipo y número de documento, ambos deben ser obligatorios. Si desea buscar por nombre debe ingresar al menos dos campos, incluido un nombre y al menos 2 caracteres por cada campo (4 en el caso de empresas).

Scenario: Longitud minima para consulta de persona juridica por nombre comercial con longitud menor a 4
Given que me encuentro en la busqueda de cuentas
When ingrese la informacion de nombre comercial <nombreComercial> del titular de la cuenta
Then me debe mostrar el mensaje <mensaje>

Examples:
|nombreComercial|mensaje
|Var|No hay suficiente información para la búsqueda. Si desea buscar por tipo y número de documento, ambos deben ser obligatorios. Si desea buscar por nombre debe ingresar al menos dos campos, incluido un nombre y al menos 2 caracteres por cada campo (4 en el caso de empresas).

Scenario: Ingresar nombres de persona natural y razon social
Given que me encuentro en la busqueda de cuentas
When ingrese la informacion de tipo de razon social <razonSocial> del titular de la cuenta e ingrese informacion de tipo persona natural <primerNombre>
Then me debe mostrar el mensaje <mensaje>

Examples:
|razonSocial|primerNombre|mensaje
|Variedades|Yurledys|Especifique ya sea un nombre de compañía o de una persona, pero no ambos.

Scenario: Ingresar nombres de persona natural y nombre comercial
Given que me encuentro en la busqueda de cuentas
When ingrese la informacion de nombre comercial <nombreComercial> del titular de la cuenta e ingrese informacion de tipo persona natural <primerNombre>
Then me debe mostrar el mensaje <mensaje>

Examples:
|nombreComercial|primerNombre|mensaje
|Variedades|Yurledys|Especifique ya sea un nombre de compañía o de una persona, pero no ambos.

Scenario: Busqueda de cuenta persona juridica por nombre comercial y razon social
Given que me encuentro en la busqueda de cuentas
When ingrese la informacion de nombre comercial <nombreComercial> del titular de la cuenta e ingrese razon social <razonSocial>
Then me debe mostrar numero de cuenta <numeroCuenta>, nombre <nombre> y direccion <direccion>

Examples:
|nombreComercial|razonSocial|numeroCuenta|nombre|direccion
|Variedades Yurledys S.A|Variedades Yurledys|C010478975|VARIEDADES YURLEDYS|826 N ST, Floor 0000, Developer Unit Habitation Cube #0000, SHEBOYGAN, WI 40207, Estados Unidos

#Scenario: Exportar resultados de busqueda en PDF, CSV y CSV Personalizado
Meta:
@manual
#Given que he buscado una cuenta y la busqueda arrojo resultados
#When quiera exportar el resultado arrojado en la busqueda
#Then el sistema debe permitir imprimir y exportar el resultado y mostrar las opciones permitidas (Imprimir como pdf, Exportar como CSV, Exportación personalizada como CSV)


