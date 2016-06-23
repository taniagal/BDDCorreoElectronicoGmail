Meta:

Narrative:
Como usuario de policy center
deseo poder crear un contacto correctamente

#Scenario: crear una cuenta para un contacto persona juridica (validaciones Sura).
#Given que me encuentro en el sistema de policy center
#When quiera crear una cuenta para un contacto persona juridica e ingrese documento, tipo de documento <tipo_documento>
#And nombre de organizacion <nombre_organizacion> <agente>
#And nombre empresa <razon_social>
#And tipo de direccion <tipo_direccion>, direccion <direccion>, departamento <departamento>, ciudad <ciudad>
#Then se debe crear la cuenta con el cliente <razon_social> persona juridica

#Examples:
#|razon_social|tipo_documento                |tipo_direccion |direccion       |departamento|ciudad  |nombre_organizacion|agente|
#|KONAMI      |IDENT. FISCAL PARA EXTRANJEROS|Vivienda       |CALLE 54B #50-25|Antioquia   |Medellin|Sura               |INT-3 |


#Scenario: crear una cuenta para un contacto persona juridica con un dato no valido.
#Given que me encuentro en el sistema de policy center
#When quiera crear una cuenta para un contacto persona juridica e ingrese nit, tipo de documento <tipo_documento>
#And nombre de organizacion <nombre_organizacion> <agente>
#And nombre empresa <razon_social>
#And tipo de direccion <tipo_direccion>, direccion <direccion>, departamento <departamento>, ciudad <ciudad>
#Then no debe permitir crear una nueva cuenta y debe mostrar el mensaje <mensaje>

#Examples:
#|razon_social|documento|tipo_documento|tipo_direccion |direccion       |departamento|ciudad  |nombre_organizacion|agente|mensaje|
#|NO SE SABE  |NIT      |NIT           |Vivienda       |CALLE 32B #08-45|Antioquia   |Medellin|Sura               |INT-3 |El nombre "NO SE SABE" no es valido|


Scenario: crear una cuenta para un contacto persona juridica con un dato no valido.
Given que me encuentro en el sistema de policy center
When quiera crear una cuenta para un contacto persona juridica e ingrese nit, tipo de documento <tipo_documento>
And nombre de organizacion <nombre_organizacion> <agente>
And nombre empresa <razon_social>
And tipo de direccion <tipo_direccion>, direccion <direccion>, departamento <departamento>, ciudad <ciudad>
Then se debe crear la cuenta con el cliente <razon_social> persona juridica

Examples:
|razon_social|tipo_documento|tipo_direccion |direccion       |departamento|ciudad  |nombre_organizacion|agente|
|.&"/\'$     |NIT           |Vivienda       |CALLE 54B #50-25|Antioquia   |Medellin|Sura               |INT-3 |
|CAMI-LO     |NIT           |Vivienda       |CALLE 54B #50-25|Antioquia   |Medellin|Sura               |INT-3 |