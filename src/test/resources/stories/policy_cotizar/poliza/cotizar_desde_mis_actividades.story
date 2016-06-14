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

When he seleccionado en el nombre del agente DELIMA MEDELLIN
And se muestre la fecha de efecto de la cotización
Then se mostrará por defecto la fecha de hoy en la que se está cotizando y no podrá ser editable
Then se mostrarán en orden alfabetico los:
|productos          |
|Auto personal      |
|Propiedad comercial|

Given ya existe una cotización en estado "cotizado" del cliente con número de cuenta C000777777 para el producto Multiriesgo corporativo
When digíte el número de cuenta C000777777 de una persona natural y digite la tecla Tab para activar la búsqueda
And he seleccionado en el nombre del agente LNUQZQ-000048 Producer Code
Then se mostrará por defecto la fecha de hoy en la que se está cotizando y no podrá ser editable
Then se mostrarán en orden alfabetico los:
|productos          |
|Auto personal      |
|Propiedad comercial|
Then seleccionar nombre de producto Propiedad comercial
Then deberá observar un mensaje emergente de información: Ya existe la cotización # 22223226 y se encuentra en proceso para este cliente y producto. ¿Desea solicitar aprobación?
Then deberá observar los botones: Aceptar,Cancelar
Then al seleccionar el botón Aceptar deberá ver la página Nueva cotización

Given ya existe una cotización en estado "cotizado" del cliente con número de cuenta C000777777 para el producto Multiriesgo corporativo
And deseo crear nueva cotización buscando por número de cuenta
When digíte el número de cuenta C000777777 de una persona natural y digite la tecla Tab para activar la búsqueda
And he seleccionado en el nombre del agente FTABHW-000052 Producer Code
Then se mostrará por defecto la fecha de hoy en la que se está cotizando y no podrá ser editable
Then se mostrarán en orden alfabetico los:
|productos          |
|Auto personal      |
|Propiedad comercial|
Then seleccionar nombre de producto Propiedad comercial
Then deberá observar los botones: Aceptar,Cancelar
Then al seleccionar el botón Aceptar deberá ver la página Información de póliza
Then deberá observar un mensaje de error: El cliente JORGE PAISA ya tiene una cotización en curso para el producto seleccionado para la oficina OFICINA TUYA

