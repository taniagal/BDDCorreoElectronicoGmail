Meta:

Narrative:
como usuario
quiero visualizar las cuentas asociadas a un contacto seleccionado
para conocer la informacion de la cuenta a la que se le asociaran las polizas

Scenario: Visualizar todas las cuentas asociadas a un contacto
GivenStories: stories/policycenter/login_policy.story
Given que voy a consultar un contacto
When consulte  un contacto con cuentas asociadas como: <nombre> <apellido>
Then se muestra la lista de cuentas asociadas con nombre: <nombreConsulta>, direccion: <direccion>, tel: <telefono>, email: <email> y rol: <rol>

Examples:
|nombre|apellido|nombreConsulta|direccion|telefono|email|rol
|Yurledys|Gallego|YURLEDYS PAOLA GALLEGO TORRES|4040 ELMWOOD, Floor 0000, Developer Unit Habitation Cube #0000, LOUISVILLE, KY 40207, Estados Unidos|502-897-3038|0001@guidewire.com|Titular de la cuenta

Scenario: Visualizar pantalla vacia para las cuentas asociadas a un contacto
Given que voy a consultar un contacto
When consulte  un contacto sin cuentas asociadas como: <nombre> <apellido>
Then se muestra el mensaje informativo <mensaje>
Examples:
|nombre|apellido|mensaje
|Ray|Newton|El contacto no está asociado a ninguna cuenta