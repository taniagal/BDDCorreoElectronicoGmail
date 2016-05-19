Meta:
Narrative:
Crear contacto persona natural
que estoy en logado en PC y estoy en contactos
Quiera crear una persona natural e ingrese la información en los campos tipo de documento, número de documento, Primer nombre, primer apellido, tipo de dirección y dirección.
se debe crear una persona tipo natural

Scenario: Crear contacto persona natural
Given estoy en la pantalla de crear contacto persona natural
When ingreso la informacion del tipo de documento <tipoDocumento>
And ingreso la informacion de numero de documento <numeroDeDocumento>
And ingreso la informacion de primer nombre <primerNombre>
And ingreso la informacion de primer apellido <primerApellido>
And ingreso la informacion de tipo de direccion <tipoDireccion>
And ingreso la informacion de direccion <direccion>, <departamento>, y <ciudad>
Then se debe crear una persona tipo natural con primer nombre <primerNombre>


Examples:
|tipoDocumento         |numeroDeDocumento  |primerNombre  |primerApellido|tipoDireccion  |direccion       |departamento|ciudad  |
|CEDULA DE CIUDADANIA  |564-36-5489        |SASHA         |AKERMAN       |Vivienda       |C 54B #50-25  |Antioquia   |Medellin|