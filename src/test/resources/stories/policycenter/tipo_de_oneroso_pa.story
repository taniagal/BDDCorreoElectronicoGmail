Tipo de Oneroso PA

Meta:
@lote3
@tag automator: juan_carlos_restrepo
@issue #CDSEG-5111
@sprint 12


Scenario: Agregar interes adicional
GivenStories: stories/policycenter/login_policy.story
Given estoy cotizando una poliza:
|cuenta     |organizacion|producto|canal            |tipoPoliza  |
|C1060447895|Sura        |Autos   |Canal Tradicional|Individual  |
When vaya agregar el interes adicional
Then debo poder ver y seleccionar los tipos de beneficiarios <TipoBeneficiario>
And se debe marcar el campo Requiere certificado por defecto en SI

Examples:
|TipoBeneficiario|
|Oneroso Leasing|

Scenario: Sustitucion de vehiculo
Given ya se tiene una poliza expedida <numeroPoliza>
When ingrese a modificar dicha cotizacion
Then se debe agregar el Check box ¿Es una sustitución?
When este en la pantalla vehiculos
Then se debe habilitar el boton Eliminar vehiculo
And elimine el vehículo que traía la póliza
When se habilita el boton Crear vehiculo
Then cree el nuevo vehículo
And se debe conservar la siguiente información del vehiculo

Examples:
| numeroPoliza  |
| TEST_22222222 |