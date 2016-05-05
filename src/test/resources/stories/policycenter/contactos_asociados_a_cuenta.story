Meta:

Narrative: Modificación de la lista de los  filtros de búsqueda de los contactos de la cuenta (Rol y tipo de persona)

Scenario: Detalle de la consulta para persona jurídica
GivenStories: stories/policycenter/login_policy.story
Given estoy en la pantalla de cuenta y existe una cuenta <numCuenta> con contactos de tipo persona juridica asociados
And quiera ver el detalle de los contactos de la cuenta <numCuenta>
Then debo ver el detalle del contacto de tipo persona jurídica

Examples:
|numCuenta|
|S000212121|


