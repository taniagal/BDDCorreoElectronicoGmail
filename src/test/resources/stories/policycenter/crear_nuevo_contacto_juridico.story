Meta:

Narrative:
As a user
I want to perform an action
So that I can achieve a business goal

Scenario: Crear contacto persona juridica
Given estoy en la pantalla de crear contacto persona juridica
When ingreso la informacion del tipo de documento <tipoDocumento>
And ingreso la informacion de numero de documento <numeroDeDocumento>
And ingreso la informacion de razon social <razonSocial>
And ingreso la informacion de tipo de dioreccion <tipoDireccion>
And ingreso la informacion de direccion <direccion>, <departamento>, y <ciudad>
Then se debe crear una persona tipo juridica con razon social <razonSocial>

Examples:
|tipoDocumento|numeroDeDocumento|razonSocial     | tipoDireccion  |direccion|departamento|ciudad  |
|NIT          |12452267         |LA VAQUITA      |Negocio         |CRA 50   |Antioquia   |Medellin|