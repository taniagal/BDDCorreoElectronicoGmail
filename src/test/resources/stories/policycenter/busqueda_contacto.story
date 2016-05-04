Meta:

Narrative:
Como usuario PolicyCenter
Quiero ser capaz de buscar elementos específicos asociados a un contacto

#Scenario: Consultar contacto de tipo persona juridica por tipo y numero de identificacion
#GivenStories: stories/policycenter/login_policy.story
#Given estoy en busqueda de contactos
#When quiera consultar contacto de tipo persona juridica por tipo <tipoDoc> y numero de identificacion <numDoc>
#Then debo ver la informacion del contacto de tipo persona juridica

#Examples:
#|tipoDoc|numDoc   |
#|NIT    |123456-7 |

#Scenario: Consultar contacto de tipo persona juridica por razon social
#GivenStories: stories/policycenter/login_policy.story
#Given estoy en busqueda de contactos
#When quiera consultar contacto de tipo persona juridica <tipoDoc> por <razonSocial>
#Then debo ver la informacion del contacto de tipo persona juridica

#Examples:
#|tipoDoc |razonSocial|
#|NIT     |ABC Company|

#Scenario: Consultar contacto de tipo persona juridica unicamente por tipo de identificacion
#GivenStories: stories/policycenter/login_policy.story
#Given estoy en busqueda de contactos
#When quiera consultar contacto de tipo persona juridica por tipo de documento <tipoDoc>
#Then no debo ver la informacion del contacto de tipo persona juridica
#And debo ver un <mensaje> de alerta indicando que es necesario ingresar tipo y numero de documento

#Examples:
#|tipoDoc |mensaje|
#|NIT     |Especifique al menos los cinco primeros caracteres del nombre de la compañía. De otra manera se puede buscar por FEIN o por el número de teléfono.|

#Scenario: Consultar contacto de tipo persona juridica cuando no se ingresa ningun criterio de busqueda
#GivenStories: stories/policycenter/login_policy.story
#Given estoy en busqueda de contactos
#When quiera consultar contacto de tipo persona juridica <tipoDoc> sin ingresar ningun filtro
#Then no debo ver la informacion del contacto de tipo persona juridica
#And debo ver un <mensaje> de alerta indicando que es necesario ingresar algun criterio de busqueda

#Examples:
#|tipoDoc |mensaje|
#|Ninguno |Especifique al menos los cinco primeros caracteres del nombre de la compañía. De otra manera se puede buscar por FEIN o por el número de teléfono.|

Scenario: Consultar contacto de tipo persona juridica unicamente por numero de identificacion
GivenStories: stories/policycenter/login_policy.story
Given estoy en busqueda de contactos
When quiera consultar contacto de tipo persona juridica <tipoDoc> por numero de documento <numDoc>
Then no debo ver la informacion del contacto de tipo persona juridica
And debo ver un <mensaje> de alerta indicando que es necesario ingresar tipo y numero de documento

Examples:
|tipoDoc |num_doc |mensaje|
|Ninguno |123456-7|Especifique al menos los cinco primeros caracteres del nombre de la compañía. De otra manera se puede buscar por FEIN o por el número de teléfono.|

