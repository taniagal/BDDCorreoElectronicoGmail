Meta:
@issue #SUGWUSC-14470

Narrative:
Como usuario PolicyCenter con el papel de agente, RSE , Suscriptor o el Administrador
Quiero ser capaz de entrar y mantener detalles de la ubicación.

Feature: Entrar y mantener detalles de la ubicación


Scenario: Ingresar póliza con primera perdida.
Given estoy cotizando una poliza de MRC en cuenta <cuenta> y producto <producto>
When ingrese un limite de cobertura inferior al valor asegurable del articulo
|valor |limite|
|350000|300000|

Examples:
|cuenta     |producto           |
|C001888888 |Propiedad comercial|