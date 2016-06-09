Realizar una cotización

Meta:
@tag capability: cotizacion
Narrative:

GivenStories: stories/precondiciones/ingreso_a_policycenter.story

Scenario: Realizar una cotización buscando por número de cuenta
Meta:
#GivenStories: stories/policycenter/ingresar_a_policyCenter.story#{@id1:login_policycenter_su}

Given deseo crear nueva cotización buscando por número de cuenta

When digíte el número de cuenta C010478975 de una persona jurídica y digite la tecla Tab para activar la búsqueda
Then espero ver el nombre de la persona jurídica VARIEDADES YURLEDYS S.A de la cuenta existente junto con la etiqueta Razón social

When digíte el número de cuenta C000888888 de una persona natural y digite la tecla Tab para activar la búsqueda
Then espero ver el nombre de la persona natural YURLEDYS GALLEGO TORRES de la cuenta existente junto con la etiqueta Nombre

When se ingrese la primera letra del nombre del agente DELIMA MEDELLIN
Then se deberá activar la lista de los nombres de los agentes que empiecen por dicha letra
And validar que se autocompleta el campo nombre y sólo aparece el nombre del agente en este campo y el código respectivo en el campo código de agente
And validar que al autocompletar se muestren las opciones nombre y código respectivamente

When se ingrese el primer número del código del agente XX
Then se deberá activar la lista de los códigos de los agentes que empiecen por dicha letra
And validar que se autocompleta el campo código
And validar que al autocompletar se muestren las opciones código y nombre respectivamente
And validar que al seleccionar sólo aparece el código del agente en este campo

Given que he seleccionado en el nombre del agente DELIMA MEDELLIN
When se muestre la fecha de efecto de la cotización
Then se mostrará por defecto la fecha de hoy en la que se está cotizando y no podrá ser editable
And se mostrarán los productos <productos> en orden alfabetico
|productos|
|Auto personal|
|Propiedad comercial|
And solo se podra seleccionar un producto por cotización
