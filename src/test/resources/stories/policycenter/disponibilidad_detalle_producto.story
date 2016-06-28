Disponibilidad Detalle Producto

Meta:

@issue #SUGWUSC-14951

Narrative:
Como usuario de policy center
quiero poder configurar el modelo del producto teniendo en cuenta los canales de distribución
para que se muestren las coberturas, terminos y opciones segun la disponibilidad

Scenario: Filtrar canal por organizacion
GivenStories: stories/policycenter/login_policy.story
Given Estoy buscando una cuenta <numCuenta>
And Estoy expidiendo una poliza de autos
And viendo Informacion de poliza
When seleccione Organizacion de ventas: <organizacion>
Then tipo de canal ventas debe contener los valores
|Leasing|
|Renting|
|Sufi|

Examples:
|numCuenta|organizacion
|C000888888|Bancolombia

Scenario: Filtrar Tipo de Producto por canal
Given Estoy buscando una cuenta <numCuenta>
And Estoy expidiendo una poliza de autos
And viendo Informacion de poliza
When seleccione Organizacion de ventas: <organizacion>
And seleccione Tipo de canal ventas: <tipoCanal>
Then PA tipo de poliza debe contener los valores
|<ninguno>|
|Comercial - Personal Fleet|

Examples:

|numCuenta|organizacion|tipoCanal
|C000888888|Bancolombia|Renting

Scenario: Al cambiar filtro de organizacion se cambia canal y tipo de poliza
Given Estoy buscando una cuenta <numCuenta>
And Estoy expidiendo una poliza de autos
And viendo Informacion de poliza
When seleccione Organizacion de ventas: <organizacion>
And seleccione Tipo de canal ventas: <tipoCanal>
And seleccione PA tipo de poliza: <tipoPoliza>
And seleccione Organizacion de ventas: <otraOrganizacion>
Then tipo de canal ventas debe tener el valor vacio
And PA tipo de poliza debe tener el valor vacio

Examples:

|numCuenta|organizacion|tipoCanal|tipoPoliza|otraOrganizacion
|C000888888|Bancolombia|Renting|Comercial - Personal Fleet|Exito

Scenario: Al cambiar filtro de canal se cambia tipo de poliza
Given Estoy buscando una cuenta <numCuenta>
And Estoy expidiendo una poliza de autos
And viendo Informacion de poliza
When seleccione Organizacion de ventas: <organizacion>
And seleccione Tipo de canal ventas: <tipoCanal>
And seleccione PA tipo de poliza: <tipoPoliza>
And seleccione Tipo de canal ventas: <otroTipoCanal>
Then PA tipo de poliza debe tener el valor vacio

Examples:

|numCuenta|organizacion|tipoCanal|tipoPoliza|otroTipoCanal
|C000888888|Bancolombia|Renting|Comercial - Personal Fleet|Leasing