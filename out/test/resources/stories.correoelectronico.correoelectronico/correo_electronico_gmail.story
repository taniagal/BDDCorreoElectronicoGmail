Meta:

Narrative:
Como usuario con correo electronico de gmail
Quiero poder acceder a mi correo electronico
Para poder realizar envios de mensajes a otros usuarios con correo electronico

Scenario: ingreso a correo electronico de gmail
Given puedo ingresar a gmail
And puedo ingresar a mi correo electronico de gmail con la siguiente informacion:
|correoElectronicoONumeroTelefonico              |contrasenia                  |
|taniagrajalesalzate@gmail.com                   |)%=#!%_taniaa                |
And puedo enviar un mensaje de correo electronico a un usuario con los siguientes datos:
|para                                       |asunto              |mensaje                                             |
|carlitoslop9876@gmail.com                  |Prueba Correo15     |Hola Carlos esta es una prueba de correo electronico|
When quiera acceder a la cuenta de correo electronico del usuario destinatario
And ingrese al correo electronico al cual envie el mensaje con los siguientes datos:
|correoElectronicoONumeroTelefonico                      |contrasenia                                |
|carlitoslop9876@gmail.com                               |carlosgrisales                             |
Then debo poder visualizar la informacion que se me ha enviado junto con el usuario que me la envio:
|correoElectronicoONumeroTelefonico                 |asunto       |mensaje                                             |
|taniagrajalesalzate@gmail.com                      |Prueba Correo|Hola Carlos esta es una prueba de correo electronico|

Examples:
||
||

