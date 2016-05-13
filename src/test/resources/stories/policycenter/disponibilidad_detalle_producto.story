Meta:

Narrative:
Como usuario de policy center
quiero poder configurar el modelo del producto teniendo en cuenta los canales de distribución
para que se muestren las coberturas, terminos y opciones segun la disponibilidad

GivenStories: stories/policycenter/login_policy.story

Scenario: Filtrar canal por organizacion
Given Estoy buscando una cuenta <numCuenta>
And Estoy expidiendo una poliza de autos
And viendo Informacion de poliza
When seleccione Organizacion de ventas: <organizacion>
Then tipo de canal ventas debe contener los valores

|tipoCanal|
|<ninguno>|
|Leasing|
|Renting|
|Sufi|
|Televentas|

Examples:
|numCuenta|organizacion
|xxxxx|xxxxxx

Scenario: Filtrar Tipo de Producto por canal
Given Estoy buscando una cuenta <numCuenta>
And Estoy expidiendo una poliza de autos
And viendo Informacion de poliza
When seleccione Tipo de canal ventas: <tipoCanal>
Then PA tipo de poliza debe contener los valores de <tipoCanal>

Examples:

|numCuenta|tipoCanal
|xxxxx|xxxxxx

Scenario: Al cambiar filtro de organizacion se cambia canal y tipo de producto
Given Estoy buscando una cuenta <numCuenta>
And Estoy expidiendo una poliza de autos
And viendo Informacion de poliza
When seleccione Organizacion de ventas: <organizacion>
And seleccione Tipo de canal ventas: <tipoCanal>
And seleccione PA tipo de poliza: <tipoPoliza>
When seleccione Organizacion de ventas: <otraOrganizacion>
Then tipo de canal ventas debe tener el valor vacio
And PA tipo de poliza debe tener el valor vacio

Examples:

|numCuenta|organizacion|tipoCanal|tipoPoliza|otraOrganizacion
|xxxxx|xxxxxx|xxxxx|xxxx|xxxxx

Scenario: Al cambiar filtro de canal se cambia tipo de producto
Given Estoy buscando una cuenta <numCuenta>
And Estoy expidiendo una poliza de autos
And viendo Informacion de poliza
When seleccione Organizacion de ventas: <organizacion>
And seleccione Tipo de canal ventas: <tipoCanal>
And seleccione PA tipo de poliza: <tipoPoliza>
When seleccione Tipo de canal ventas: <otroTipoCanal>
Then PA tipo de poliza debe tener el valor vacio

Examples:

|numCuenta|organizacion|tipoCanal|tipoPoliza|otroTipoCanal
|xxxxx|xxxxxx|xxxxx|xxxx|xxxxx
