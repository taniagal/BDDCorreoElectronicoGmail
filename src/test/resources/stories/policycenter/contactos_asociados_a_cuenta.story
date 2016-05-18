Meta:
Narrative: Modificación de la lista de los  filtros de búsqueda de los contactos de la cuenta (Rol y tipo de persona)



Scenario: Eliminar un contacto asociado a una cuenta
GivenStories: stories/policycenter/login_policy.story
Given estoy en la pantalla de cuenta y existe una cuenta <numCuenta> con contactos asociados
And quiera ver el detalle de los contactos de la cuenta <numCuenta>
And y deseo eliminar el contacto <contactoEliminado>
Then el contacto <contactoEliminado> ya no debe estar asociado a la cuenta
Examples:
|numCuenta|contactoEliminado|
|C000888888|Metals Unlimited|


