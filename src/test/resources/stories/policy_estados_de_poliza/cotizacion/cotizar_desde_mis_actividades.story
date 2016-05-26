Meta:
@tag capability: cotizacion

Narrative:

Scenario: Realizar una cotización desde 'Mis actividades'

GivenStories: stories/policycenter/login_policy.story
Given deseo crear nueva cotización desde 'Mis actividades'
When seleccione 'Nueva cotización' de la opción 'Acciones'
Then espero ver la página 'Nueva cotización'


Examples:
|NumeroDeCuenta|Etiqueta|Tecla|
|C010478975|Razón social|Tabulación|
|C000888888|Nombre|Tabulación|