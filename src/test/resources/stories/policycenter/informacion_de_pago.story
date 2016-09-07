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

