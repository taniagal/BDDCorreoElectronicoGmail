Meta:

Narrative:
Como usuario PolicyCenter
Quiero ser capaz de buscar elementos específicos asociados a un contacto

Scenario: Consultar contacto de tipo persona juridica unicamente por tipo de identificacion
GivenStories: stories/policycenter/login_policy.story
Given estoy en busqueda de contactos
When quiera consultar contacto de tipo persona juridica por tipo de documento <tipoDoc>
Then no debo ver la informacion del contacto de tipo persona juridica
And debo ver un <mensaje> de alerta indicando que es necesario ingresar tipo y numero de documento

Examples:
|usuario|contrasena|tipoDoc |mensaje|
|su     |gw        |NIT     |La búsqueda no devolvió resultados.|

Scenario: Validar longitud minima caracteres persona juridica - razon social
GivenStories: stories/policycenter/login_policy.story
Given estoy en busqueda de contactos
When quiera consultar contacto de tipo persona juridica <tipoDoc> por razon social <razonSocial>
And la longitud de esta <razonSocial> sea inferior a cuatro caracteres
Then no debo ver la informacion del contacto de tipo persona juridica
And debo ver un <mensaje> de alerta indicando que la longitud debe ser mayor o igual a cuatro caracteres

Examples:
|tipoDoc   |razonSocial |mensaje|
|NIT       |Intel       |La búsqueda no devolvió resultados.|

Scenario: Validar longitud minima caracteres persona juridica - nombre comercial
GivenStories: stories/policycenter/login_policy.story
Given estoy en busqueda de contactos
When quiera consultar contacto de tipo persona juridica <tipoDoc> por nombre comercial <nombreComercial>
And la longitud de esta <nombreComercial> sea inferior a cuatro caracteres
Then no debo ver la informacion del contacto de tipo persona juridica
And debo ver un <mensaje> de alerta indicando que la longitud debe ser mayor o igual a cuatro caracteres

Examples:
|tipoDoc   |nombreComercial|mensaje|
|NIT       |Tu Intel       |La búsqueda no devolvió resultados.|