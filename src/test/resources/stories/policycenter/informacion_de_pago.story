informacion de pago

Meta:

@issue #CDSEG-2305
@Atomatizador Jonathan Mejia
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
|22221238  |Factura directa|

Scenario: Visualizar datos, metodos y plande pagos de facturacion para CP y PA
Given que estoy en la pantalla de pago con la <cotizacion>
When visualice la pantalla de pagos
Then se debe mostrar el <nombreMetodoPago>
And se debe mostrar el plan de pago que retorna billing <programa>
And no debe permitir mas de una opcion para ser aplicada a la poliza

Examples:
|cotizacion|nombreMetodoPago|programa     |
|22221238  |Factura directa |Plan de pagos|
|22221239  |Factura directa |Plan de pagos|


