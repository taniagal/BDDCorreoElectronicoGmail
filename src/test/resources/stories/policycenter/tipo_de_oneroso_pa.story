Tipo de Oneroso PA

Meta:
@lote3
@tag automator: juan_carlos_restrepo
@issue #CDSEG-5111
@sprint 12


Scenario: Sustitucion de vehiculo
GivenStories: stories/policycenter/login_policy.story
Given ya se tiene una poliza expedida <numeroPoliza>
When ingrese a modificar dicha cotizacion
Then Se debe marcar la opcion ¿Es una sustitucion? por defecto en NO
And se debe seleccionar la opcion sustitucion
When este en la pantalla vehiculos
Then se debe habilitar el boton Eliminar vehiculo
And elimine el vehículo que traía la póliza
When se habilita el boton Crear vehiculo
Then cree el nuevo vehículo
And se debe conservar la siguiente información del vehiculo

Examples:
| numeroPoliza  |
| TEST_22222222 |