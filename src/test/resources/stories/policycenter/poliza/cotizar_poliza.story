Meta:
@lote1
@Story CDSEG-907
@tag team: 2, informer:juan_esteban_restrepo, sprint:7
@Sprint 7

Scenario: Validaciones como precondicion en la realizacion de una cotizacion para el Producto comercial buscando por
numero de cuenta y persona juridica
Given deseo crear nueva cotizacion buscando por numero de cuenta
When digite el numero de cuenta C010478975 de una persona juridica y digite la tecla Tab para activar la busqueda
Then espero ver el nombre de la persona jurídica VARIEDADES YURLEDYS S.A de la cuenta existente junto con la etiqueta
Razón social

When se ingrese la primera letra del nombre del agente D
Then se debera activar la lista de los nombres de los agentes que empiecen por dicha letra
And validar que se autocompleta el campo nombre y solo aparece el nombre del agente en este campo y el codigo respectivo
 en el campo codigo de agente

When he seleccionado en el nombre del agente DELIMA MEDELLIN
And se muestre la fecha de efecto de la cotizacion
Then se mostrara por defecto la fecha de hoy en la que se esta cotizando y no podra ser editable
Then se mostraran en orden alfabetico los:
|productos              |
|Autos                  |
|Multiriesgo corporativo|

Scenario: Validaciones como precondicion en la realizacion de una cotizacion para el Producto comercial buscando
por numero de cuenta y persona natural

Given deseo crear nueva cotizacion buscando por numero de cuenta
When digite el numero de cuenta C000888888 de una persona natural y digite la tecla Tab para activar la busqueda
Then espero ver el nombre de la persona natural YURLEDYS GALLEGO TORRES de la cuenta existente junto con la etiqueta
Nombre

When se ingrese la primera letra del nombre del agente D
Then se debera activar la lista de los nombres de los agentes que empiecen por dicha letra
And validar que se autocompleta el campo nombre y solo aparece el nombre del agente en este campo y el codigo
respectivo en el campo codigo de agente

When he seleccionado en el nombre del agente DELIMA MEDELLIN
And se muestre la fecha de efecto de la cotizacion
Then se mostrara por defecto la fecha de hoy en la que se esta cotizando y no podra ser editable
Then se mostraran en orden alfabetico los:
|productos              |
|Autos                  |
|Multiriesgo corporativo|