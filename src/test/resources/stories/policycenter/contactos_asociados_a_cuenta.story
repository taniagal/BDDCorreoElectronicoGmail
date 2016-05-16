Meta:
Narrative: Modificación de la lista de los  filtros de búsqueda de los contactos de la cuenta (Rol y tipo de persona)

Scenario: Validar opciones de creación de contacto
GivenStories: stories/policycenter/login_policy.story
Given estoy en la pantalla de cuenta y existe una cuenta <numCuenta> con contactos asociados
And quiera ver el detalle de los contactos de la cuenta <numCuenta>
And y desee crear un nuevo contacto
Then debo ver las opciones de menú para los roles
|tipocanalventas|
|Contacto de facturacion    |Contacto de información de reclamaciones   |Contacto primario      |Contacto secundario    |
|Nueva Persona Natural      |Nueva Persona Natural                      |Nueva Persona Natural  |Nueva Persona Natural  |
|Del Directorio             |Del Directorio                             |Del Directorio         |Del Directorio         |
Examples:
|numCuenta|
|S000212121|



