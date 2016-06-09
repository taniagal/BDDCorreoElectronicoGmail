Meta:

Narrative:
Como un usuario de BillingCenter con el rol de SuperUsuario
Quiero ser capaz de autenticarme en la aplicacion
Asi desplegar la pagina de inicio correspondiente


Scenario: autenticacion en BillingCenter
Meta:
@manual
Given estoy en la pagina de autenticacion de BillingCenter
When ingrese username <usr> y password <pass>
Then deberia ingresar al sistema y ver el mensaje <message>
Then el usuario deberia poder acceder a la administracion de <message2>
Then el usuario de billing deberia cerrar sesion

Examples:
|usr|pass   |message            |message2        |
|su |gw     |Búsqueda de usuario|Días festivos   |

Scenario: navegacion menu en BillingCenter
Given estoy en la pagina de autenticacion de BillingCenter
When ingrese username <usr> y password <pass>
Then deberia ingresar al sistema y ver el mensaje <message> y navegar por todos los menu
Then deberia buscar la cuenta numero <numCuenta> y la poliza numero <numPoliza> y el agente numero <numAgente>
Then el usuario de billing deberia cerrar sesion

Examples:
|usr|pass   |message            |numCuenta  |numPoliza|numAgente    |
|su |gw     |Búsqueda de usuario|1000000003 |123456-1 |QA1PRODUCER01|