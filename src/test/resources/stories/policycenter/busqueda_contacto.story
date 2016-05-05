Meta:

Narrative:
Como usuario PolicyCenter
Quiero ser capaz de buscar elementos específicos asociados a un contacto

##Scenario: Consultar contacto de tipo persona juridica unicamente por tipo de identificacion
##Given que estoy autenticado en GW con usuario <usuario> y contrasena <contrasena>
##And estoy en busqueda de contactos
##When quiera consultar contacto de tipo persona juridica por tipo de documento <tipoDoc>
##Then no debo ver la informacion del contacto de tipo persona juridica
##And debo ver un <mensaje> de alerta indicando que es necesario ingresar tipo y numero de documento

##Examples:
##|usuario|contrasena|tipoDoc |mensaje|
##|su     |gw        |NIT     |Especifique al menos los cinco primeros caracteres del nombre de la compañía. De otra manera se puede buscar por FEIN o por el número de teléfono.|

#Scenario: Consultar contacto de tipo persona juridica por tipo y numero de identificacion
#Given que estoy autenticado en GW con usuario <usuario> y contrasena <contrasena>
#And estoy en busqueda de contactos
#When quiera consultar contacto de tipo persona juridica por tipo <tipoDoc> y numero de identificacion <numDoc>
#Then debo ver la informacion del contacto de tipo persona juridica

#Examples:
#|usuario|contrasena|tipoDoc|numDoc   |
#|su     |gw        |NIT    |123456-7 |

#Scenario: Consultar contacto de tipo persona juridica por razon social
#Given que estoy autenticado en GW con usuario <usuario> y contrasena <contrasena>
#And estoy en busqueda de contactos
#When quiera consultar contacto de tipo persona juridica <tipoDoc> por <razonSocial>
#Then debo ver la informacion del contacto de tipo persona juridica

#Examples:
#|usuario|contrasena|tipoDoc |razonSocial|
#|su     |gw        |NIT     |La Vaquita|

#Scenario: Consultar contacto de tipo persona juridica cuando no se ingresa ningun criterio de busqueda
#Given que estoy autenticado en GW con usuario <usuario> y contrasena <contrasena>
#And estoy en busqueda de contactos
#When quiera consultar contacto de tipo persona juridica <tipoDoc> sin ingresar ningun filtro
#Then no debo ver la informacion del contacto de tipo persona juridica
#And debo ver un <mensaje> de alerta indicando que es necesario ingresar algun criterio de busqueda

#Examples:
#|usuario|contrasena|tipoDoc   |mensaje|
#|su     |gw        |<ninguno> |Especifique al menos los cinco primeros caracteres del nombre de la compañía. De otra manera se puede buscar por FEIN o por el número de teléfono.|

#Scenario: Consultar contacto de tipo persona juridica unicamente por numero de identificacion
#Given que estoy autenticado en GW con usuario <usuario> y contrasena <contrasena>
#And estoy en busqueda de contactos
#When quiera consultar contacto de tipo persona juridica <tipoDoc> por numero de documento <numDoc>
#Then no debo ver la informacion del contacto de tipo persona juridica
#And debo ver un <mensaje> de alerta indicando que es necesario ingresar tipo y numero de documento

#Examples:
#|usuario|contrasena|tipoDoc   |numDoc  |mensaje|
#|su     |gw        |<ninguno> |123456-7|Especifique al menos los cinco primeros caracteres del nombre de la compañía. De otra manera se puede buscar por FEIN o por el número de teléfono.|

#Scenario: Consultar contacto de tipo persona juridica por nombre comercial
#Given que estoy autenticado en GW con usuario <usuario> y contrasena <contrasena>
#And estoy en busqueda de contactos
#When quiera consultar contacto de tipo persona juridica <tipoDoc> por nombre comercial <nombreComercial>
#Then debo ver la informacion del contacto de tipo persona juridica

#Examples:
#|usuario|contrasena|tipoDoc  |nombreComercial |
#|su     |gw        |NIT      |Company DC      |

#Scenario: Consultar contacto de tipo persona natural unicamente por tipo de identificacion
#Given que estoy autenticado en GW con usuario <usuario> y contrasena <contrasena>
#And estoy en busqueda de contactos
#When quiera consultar contacto de tipo persona natural por tipo de documento <tipoDoc>
#Then no debo ver la informacion del contacto de tipo persona natural
#And debo ver un <mensaje> de alerta indicando que es necesario ingresar tipo y numero de documento

#Examples:
#|usuario|contrasena|tipoDoc              |mensaje|
#|su     |gw        |CEDULA DE CIUDADANIA |Especifique al menos los cinco primeros caracteres del nombre de la compañía. De otra manera se puede buscar por FEIN o por el número de teléfono.||

#Scenario: Consultar contacto de tipo persona natural unicamente por numero de identificacion
#Given que estoy autenticado en GW con usuario <usuario> y contrasena <contrasena>
#And estoy en busqueda de contactos
#When quiera consultar contacto de tipo persona natural <tipoDoc> por numero de documento <numDoc>
#Then no debo ver la informacion del contacto de tipo persona natural
#And debo ver un <mensaje> de alerta indicando que es necesario ingresar tipo y numero de documento

#Examples:
#|usuario|contrasena|tipoDoc              |numDoc     |mensaje|
#|su     |gw        |CEDULA DE CIUDADANIA |1088246689 |Especifique al menos los cinco primeros caracteres del nombre de la compañía. De otra manera se puede buscar por FEIN o por el número de teléfono.|

#Scenario: Consultar contacto de tipo persona natural por tipo y numero de identificacion
#Given que estoy autenticado en GW con usuario <usuario> y contrasena <contrasena>
#And estoy en busqueda de contactos
#When quiera consultar contacto de tipo persona natural por tipo <tipoDoc> y numero de identificacion <numDoc>
#Then debo ver la informacion del contacto de tipo persona natural

#Examples:
#|usuario|contrasena|tipoDoc              |numDoc     |
#|su     |gw        |CEDULA DE CIUDADANIA |1088246689 |

#Scenario: Consultar contacto de tipo persona juridica por razon social
#Given que estoy autenticado en GW con usuario <usuario> y contrasena <contrasena>
#And estoy en busqueda de contactos
#When quiera consultar contacto de tipo persona juridica <tipoDoc> por <razonSocial>
#Then debo ver la informacion del contacto de tipo persona juridica

#Examples:
#|usuario|contrasena|tipoDoc |razonSocial|
#|su     |gw        |NIT     |La Vaquita|

Scenario: Consultar contacto de tipo persona natural por nombre y apellido
Given que estoy autenticado en GW con usuario <usuario> y contrasena <contrasena>
And estoy en busqueda de contactos
When quiera consultar contacto de tipo persona natural <tipoDoc> por nombre <nombre> y apellido <apellido>
Then debo ver la informacion del contacto de tipo persona natural

Examples:
|usuario|contrasena|tipoDoc             |nombre |apellido |
|su     |gw        |CEDULA DE CIUDADANIA|Alice  |Shiu     |

Scenario: Consultar contacto de tipo persona natural unicamente por nombre
Given que estoy autenticado en GW con usuario <usuario> y contrasena <contrasena>
And estoy en busqueda de contactos
When quiera consultar contacto de tipo persona natural <tipoDoc> por nombre <nombre>
Then debo ver la informacion del contacto de tipo persona natural

Examples:
|usuario|contrasena|tipoDoc             |nombre|
|su     |gw        |CEDULA DE CIUDADANIA|Alice |

Scenario: Consultar contacto de tipo persona natural unicamente por apellido
Given que estoy autenticado en GW con usuario <usuario> y contrasena <contrasena>
And estoy en busqueda de contactos
When quiera consultar contacto de tipo persona natural <tipoDoc> por apellido <apellido>
Then debo ver la informacion del contacto de tipo persona natural

Examples:
|usuario|contrasena|tipoDoc              |apellido |
|su     |gw        |CEDULA DE CIUDADANIA |Shiu     |

