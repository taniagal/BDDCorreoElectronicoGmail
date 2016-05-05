Meta:
Narrative: Modificación de la lista de los  filtros de búsqueda de los contactos de la cuenta (Rol y tipo de persona)

Scenario: Detalle de la consulta para contactos asociados a una cuenta
GivenStories: stories/policycenter/login_policy.story
Given estoy en la pantalla de cuenta y existe una cuenta <numCuenta> con contactos de tipo persona juridica asociados
And quiera ver el detalle de los contactos de la cuenta <numCuenta>
Then debo ver el detalle del contacto de tipo persona jurídica

Examples:
|numCuenta|
|S000212121|

Scenario: Detalle de la consulta roles asociados a un contacto
Given estoy en la pantalla de cuenta y existe una cuenta <numCuenta> con contactos de tipo persona juridica asociados
And quiera ver el detalle de los contactos de la cuenta <numCuenta>
And selecciono un contacto de la lista de contactos <posicion> y aplico la opcion <opcion>
Then debo ver los roles de contacto de tipo persona jurídica

Examples:
|numCuenta|posicion|opcion|
|S000212121|1|ROLES|

Scenario: Detalle de la consulta direcciones asociadas a un contacto
Given estoy en la pantalla de cuenta y existe una cuenta <numCuenta> con contactos de tipo persona juridica asociados
And quiera ver el detalle de los contactos de la cuenta <numCuenta>
And selecciono un contacto de la lista de contactos <posicion> y aplico la opcion <opcion>
Then debo ver las direcciones asociadas al contacto

Examples:
|numCuenta|posicion|opcion
|S000212121|1|DIRECCIONES


