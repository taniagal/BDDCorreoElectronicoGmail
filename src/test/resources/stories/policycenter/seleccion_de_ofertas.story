Meta:

Narrative:
As a user
I want to perform an action
So that I can achieve a business goal

Scenario: Opcion ofertas del menu ocultas
Given inicio una nueva cotizacion
When seleccione la linea de negocio de <linea>
Then no debe mostrar el menu vertical <menu>
And no debe mostrar la pantalla <pantalla>

Examples:
|linea|menu|pantalla|
|autos|ofertas|ofertas|