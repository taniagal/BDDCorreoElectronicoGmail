Scenario: Autenticacion en ClaimsCenter

Given ingreso a la app
When ingrese <usr> y <pass>
Then deberia ingresar a la applicacion <message> 

Examples:
|usr |pass |message     |
|su  |gw   |Actividades |
