Meta:
Narrative:
Crear contacto persona natural
que estoy en logado en PC y estoy en contactos
Quiera crear una persona natural e ingrese la información en los campos tipo de documento, número de documento, Primer nombre, primer apellido, tipo de dirección y dirección.
se debe crear una persona tipo natural

Scenario: Crear contacto persona natural
GivenStories: stories/policycenter/login_policy.story
Given estoy en la pantalla de crear contacto persona natural
When ingreso la informacion del tipo de documento <tipoDocumento>
And ingreso la informacion de numero de documento <numeroDeDocumento>
And ingreso la informacion de primer nombre <primerNombre>
And ingreso la informacion de primer apellido <primerApellido>
And ingreso la informacion de tipo de dioreccion <tipoDireccion>
And ingreso la informacion de direccion <direccion>
Then se debe crear una persona tipo natural

Examples:
|tipoDocumento          |numeroDeDocumento  |primerNombre   |primerApellido |tipoDireccion  |direccion  |
|CEDULA DE CIUDADANIA   |23456897     |BRAYAN         |RUIZ           |Negocio        |CRA 50     |


Scenario: Crear contacto persona juridica
Given estoy en la pantalla de crear contacto persona juridica
When ingreso la informacion del tipo de documento <tipoDocumento>
And ingreso la informacion de numero de documento <numeroDeDocumento>
And ingreso la informacion de razon social <razonSocial>
And ingreso la informacion de tipo de dioreccion <tipoDireccion>
And ingreso la informacion de direccion <direccion>
Then se debe crear una persona tipo juridica

Examples:
|tipoDocumento          |numeroDeDocumento  |razonSocial     | tipoDireccion  |direccion  |
|NIT   |12452267    |La Vaquita        |Negocio        |CRA 50     |


Scenario: Validar Contacto Existente
Given estoy en la pantalla de crear contacto persona juridica
When ingreso la informacion del tipo de documento <tipoDocumento>
And ingreso la informacion de numero de documento <numeroDeDocumento>
And ingreso la informacion de razon social <razonSocial>
And ingreso la informacion de tipo de dioreccion <tipoDireccion>
And ingreso la informacion de direccion <direccion>
Then debe validar que el contacto ya existe

Examples:
|tipoDocumento          |numeroDeDocumento  |razonSocial     | tipoDireccion  |direccion  |
|NIT   |1245226    |La Vaquita       |Negocio        |CRA 50     |



Scenario: Campo ciudad obligatorio si se ingresa el telefono
Given estoy en la pantalla de crear contacto persona natural
When ingreso la informacion del tipo de documento <tipoDocumento>
And ingreso la informacion de numero de documento <numeroDeDocumento>
And ingreso la informacion de primer nombre <primerNombre>
And ingreso la informacion de primer apellido <primerApellido>
And ingreso la informacion de tipo de dioreccion <tipoDireccion>
And ingreso la informacion de direccion <direccion>
And selecciono el tipo de telefono fijo <tipoTelefonoFijo> e ingreso el numero de telefono fijo <numeroTelefonoFijo>
Then el campo de ciudad deben ser obligatorios

Examples:
|tipoDocumento          |numeroDeDocumento  |primerNombre   |primerApellido |tipoDireccion  |direccion  |tipoTelefonoFijo     |numeroTelefonoFijo
|CEDULA DE CIUDADANIA   |23456897           |BRAYAN         |RUIZ           |Negocio        |CRA 50     |Vivienda             |12345678









