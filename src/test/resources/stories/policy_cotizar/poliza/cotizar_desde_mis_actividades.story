Cotizar desde mis actividades

Meta:
@tag capability: cotizacion
Narrative:

GivenStories: stories/precondiciones/ingreso_a_policycenter.story#{id1:login_policycenter_su}

Scenario: Realizar una cotización desde 'Mis actividades'
Meta:
#GivenStories: stories/policycenter/ingresar_a_policyCenter.story#{@id1:login_policycenter_su}

Given deseo crear nueva cotización desde la página Mis actividades
When seleccione Nueva cotización de la opción Acciones
Then espero ver la página Nueva cotización

When digíte el número de cuenta existente de una persona jurídica y tabule para activar la búsqueda
Then espero ver el nombre de la persona jurídica de la cuenta existente junto con la etiqueta Razón social


When digíte el número de cuenta existente de una persona natural y tabule para activar la búsqueda
Then espero ver el nombre de la persona natural de la cuenta existente junto con la etiqueta Nombre

When digíte el código del agente 193 - y lo seleccione
Then espero ver el nombre del agente autocompletado null - 193
And el producto Disponible para elegir llamado Propiedad Comercial

When cuando seleccione el producto Propiedad Comercial
Then espero ver el nombre del agente autocompletado null - 193
And el producto Disponible para elegir llamado Propiedad Comercial

