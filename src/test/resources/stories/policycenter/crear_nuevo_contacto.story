Meta:

Narrative:
Crear contacto persona natural
que estoy en logado en PC y estoy en contactos
Quiera crear una persona natural e ingrese la información en los campos tipo de documento, número de documento, Primer nombre, primer apellido, tipo de dirección y dirección.
se debe crear una persona tipo natural


Scenario: Crear contacto persona natural
Given estoy logueado con usuario <usr> y contrasenia <contrasenia> y pais <country>
Given estoy en la pantalla de crear contacto persona natural
When ingreso la informacion del tipo de documento <tipoDocumento>
And ingreso la informacion de numero de documento <numeroDeDocumento>
And ingreso la informacion de primer nombre <primerNombre>
And ingreso la informacion de primer apellido <primerApellido>
And ingreso la informacion de tipo de dioreccion <tipoDireccion>
And ingreso la informacion de direccion <direccion>
Then se debe crear una persona tipo natural


Examples:
|usr|pass|country|
|pedrvevi|pedrvevi|Colombia|