Meta:

Narrative:
como usuario
quiero visualizar las cuentas asociadas a un contacto seleccionado
para conocer la informacion de la cuenta a la que se le asociaran las polizas

Scenario: Visualizar todas las cuentas asociadas a un contacto
Given que me encuentro autenticado con pais <pais>, username <usr> y password <pass>
Given existe una cuenta asociada a un contacto
When consulte las cuentas asociadas a un contacto
Then se muestra la lista de cuentas asociadas con nombre: <nombre>, direccion: <direccion>, tel: <telefono>, email: <email> y rol: <rol>

Examples:
|pais|usr|pass|nombre|direccion|telefono|email|rol
|Colombia|pedrvevi|pedrvevi|Ray Newton|cl 10# 10-43, cra 46#46-46, Arvada, CO 80001|||Asegurado nombrado, Interés adiciconal, Titular de la cuenta