informacion de pago

Meta: @lote1

@issue #CDSEG-2305
@tag automator: juan_carlos_restrepo
@local
Sprint 6

Narrative:
Como usuario PolicyCenter con el papel de agente , RSE , Suscriptor o el Administrador ,
quiero ser Capaz de ver y mantener la Información de Pago

Scenario: Permitir ingresar a la pagina de pago
GivenStories: stories/policycenter/login_policy.story
Given que estoy en la pantalla de pago con la <cotizacion>
When visualice la pantalla de pagos
Then se deben mostrar los datos correspondientes a formas de pago

Examples:
|cotizacion|nombreMetodoPago|
|22222212  |Factura directa|

Scenario: Visualizar datos, metodos y plande pagos de facturacion para CP y PA
Given que estoy en la pantalla de pago con la <cotizacion>
When visualice la pantalla de pagos
Then se debe mostrar el <nombreMetodoPago>
And se debe mostrar el plan de pago que retorna billing <programa>

Examples:
|cotizacion|nombreMetodoPago|programa     |
|22222212  |Factura directa |Plan de pagos|
|22222210   |Factura directa |Plan de pagos|


Scenario: Visualizar seleccion en programa de pagos retorno billing
Meta:
@manual
Given que estoy en la pantalla de pago
Then ingrese a la pantalla de pago
Then debe dejarme seleccionar un SOLO plan de pagos en la tabla mostrada


