Meta:
Narrative:

Scenario: Validaciones como precondicion en la realizacion de una cotizacion para el Producto comercial buscando por
numero de cuenta y persona juridica
Meta:
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
And seleccione la organizacion <organizacion>
And seleccione el canal <canal>
Then se mostrara por defecto la fecha de hoy en la que se esta cotizando y no podra ser editable
Then se mostraran en orden alfabetico los:
|productos              |
|Autos                  |
|Multiriesgo corporativo|

Examples:
|organizacion|canal            |
|Sura        |Canal Tradicional|

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
And seleccione la organizacion <organizacion>
And seleccione el canal <canal>
Then se mostrara por defecto la fecha de hoy en la que se esta cotizando y no podra ser editable
Then se mostraran en orden alfabetico los:
|productos              |
|Autos                  |
|Multiriesgo corporativo|

Examples:
|organizacion|canal            |
|Sura        |Canal Tradicional|


Scenario:  Validaciones como precondicion en la realizacion de una cotizacion para el Producto comercial con una
cotizacion ya existente para un mismo agente

Given deseo crear nueva cotizacion buscando por numero de cuenta
And ya existe una cotización en estado "cotizado" del cliente con numero de cuenta C000777777 para el producto
Multiriesgo corporativo
When digite el numero de cuenta C000777777 de una persona natural y digite la tecla Tab para activar la busqueda
And he seleccionado en el nombre del agente DIRECTO
And seleccione la organizacion <organizacion>
And seleccione el canal <canal>
Then se mostrara por defecto la fecha de hoy en la que se esta cotizando y no podra ser editable
Then se mostraran en orden alfabetico los:
|productos              |
|Autos                  |
|Multiriesgo corporativo|
Then seleccionar nombre de producto Multiriesgo corporativo
Then debera observar un mensaje emergente de informacion: Ya existe la cotización # 22223226 y se encuentra en proceso
para este cliente y producto. ¿Desea continuar esta nueva cotización?
Then debera observar los botones: Aceptar,Cancelar
Then al seleccionar el botón Cancelar deberá ver la página Nueva cotización

Examples:
|organizacion|canal            |
|Sura        |Canal Tradicional|


Scenario:  Validaciones como precondicion en la realizacion de una cotizacion para el Producto comercial con una
cotizacion de un tomador que es riesgo consultable y PEPS

Given deseo crear nueva cotizacion buscando por numero de cuenta
When digite el numero de cuenta C000777778 de una persona natural y digite la tecla Tab para activar la busqueda
When he seleccionado en el nombre del agente DELIMA MEDELLIN
And seleccione la organizacion <organizacion>
And seleccione el canal <canal>

Then seleccionar nombre de producto Multiriesgo corporativo
Then debera observar un mensaje de error: FRANK RAMIREZ ALZATE, El tomador es un riesgo no es estandar y debe ser
analizado por el Comité de Evaluación, por favor tramite el caso con el Gerente o Director Comercial. -
FRANK RAMIREZ ALZATE,El asegurado es un riesgo no estandar y no es posible gestionar la solicitud por este canal

Examples:
|organizacion|canal            |
|Sura        |Canal Tradicional|