Meta:
@lote2
@tag equipo: 5
@Sprint 14

Narrative:
Como usuario de policy center en el rol de agente,csr, asegurador o gerente
Quiero poder imprimir o reimprimir los documentos que se generan luego de ejecutar una transaccion de poliza
Para una poliza de mrc

Scenario: Mostrar opcion de reimpresion en una renovacion de poliza mrc
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza:
|cuenta    |producto               |
|C002888992|Multiriesgo corporativo|
When agregue una nueva ubicacion:
|departamento|ciudad  |direccion        |descripcion    |actividad                                 |
|Antioquia   |Medellin|CR 44 A # 43 - 00|Core de Seguros|Actividades de agencias de empleo temporal|
And seleccione algunos articulos y sus cobertura:
|articulo |valor_asegurable|coberturas|
|Building |100000000       |Danos     |
And cotice el articulo
And expido la poliza y voy al archivo de poliza
And quiera realizar esta renovacion
And ingrese a edificios y ubicaciones en renovacion de poliza
And cuando edite la renovacion de poliza
And intente cotizar y expedir la poliza
And emita la renovacion
And vaya a la opcion transacciones de poliza
And cuando de click al boton reimprimir
And me deben aparecer las opciones por las cuales puedo imprimir
|opciones                        |
|Carátula                        |
|Carta de relación con el cliente|
|Endoso                          |
|Cotización                      |
And cuando vaya a la opcion documentos
Then se deben seleccionar todas las opciones por las cuales quiero reimprimir
Examples:
| rolUsuario |
| Asesor     |


