Meta:

Narrative:
Como usuario PolicyCenter
Quiero ser capaz de buscar elementos específicos asociados a un contacto


#Scenario: Consultar contacto de tipo persona natural por primer nombre y primer apellido
#GivenStories: stories/policycenter/login_policy.story
#Given estoy en busqueda de contactos
#When quiera consultar contacto de tipo persona natural por <primerNombre> y <primerApellido>
#Then debo ver la información del contacto de tipo persona natural <tipoIdentificacion>, <numeroIdentificacion>, <primerNombre>, <segundoNombre>, <primerApellido>, <segundoApellido>, <direccion>, <telefono>, <email>, <external>

#Examples:
#|primerNombre|primerApellido|
#|Jane|Collins|

Scenario: Consultar contacto de tipo persona juridica por razon social
GivenStories: stories/policycenter/login_policy.story
Given estoy en busqueda de contactos
When quiera consultar contacto de tipo persona juridica por <razonSocial>
Then debo ver la informacion del contacto de tipo persona juridica <tipoIdentificacion>, <numeroIdentificacion>, <razonSocial>, <nombreComercial>, <direccion>, <telefono>, <email>, <external>

Examples:
|razonSocial|
|ABC Company|